package io.archimedesfw.data

class GeneratedKeysHolder(
    val columnNames: Array<String>
) : GeneratedKeys {

    private val keysRowsHolder = mutableListOf<Map<String, Any>>()

    override val keysRows: List<Map<String, Any>> by ::keysRowsHolder

    fun addRow(keys: Map<String, Any>) {
        keysRowsHolder.add(keys)
    }

    fun addAllRows(keysList: List<Map<String, Any>>) {
        keysRowsHolder.addAll(keysList)
    }

    fun clear() {
        keysRowsHolder.clear()
    }

}