<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".StoreHours">

    <TextView
        android:id="@+id/info_text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:text="@string/_enter_the_store_s_hours"
        android:textAlignment="center"
        android:textSize="36sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/start_time"
        android:layout_width="41dp"
        android:layout_height="46dp"
        android:layout_marginStart="80dp"
        android:layout_marginTop="212dp"
        android:text="@string/_8"
        android:textAlignment="center"
        android:textSize="36sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/plus_start"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="156dp"
        android:layout_marginEnd="16dp"
        android:backgroundTint="#4C4C4C"
        android:onClick="countStartUp"
        android:text="@string/plus_start"
        android:textSize="36sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.808"
        app:layout_constraintStart_toEndOf="@+id/start_time"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/minus_start"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:layout_marginEnd="16dp"
        android:backgroundTint="#4C4C4C"
        android:onClick="countStartDown"
        android:text="@string/minus_start"
        android:textSize="36sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.804"
        app:layout_constraintStart_toEndOf="@+id/start_time"
        app:layout_constraintTop_toBottomOf="@+id/plus_start" />

    <TextView
        android:id="@+id/end_time"
        android:layout_width="40dp"
        android:layout_height="48dp"
        android:layout_marginStart="80dp"
        android:layout_marginTop="135dp"
        android:text="@string/_8"
        android:textAlignment="center"
        android:textSize="36sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/start_time" />

    <Button
        android:id="@+id/plus_end"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:layout_marginEnd="16dp"
        android:backgroundTint="#4C4C4C"
        android:onClick="countEndUp"
        android:text="@string/plus_end"
        android:textSize="36sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.802"
        app:layout_constraintStart_toEndOf="@+id/end_time"
        app:layout_constraintTop_toBottomOf="@+id/minus_start" />

    <Button
        android:id="@+id/minus_end"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:layout_marginEnd="16dp"
        android:backgroundTint="#4C4C4C"
        android:onClick="countEndDown"
        android:text="@string/minus_end"
        android:textSize="36sp"
        app:layout_constraintBottom_toTopOf="@+id/next_button"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.802"
        app:layout_constraintStart_toEndOf="@+id/end_time"
        app:layout_constraintTop_toBottomOf="@+id/plus_end"
        app:layout_constraintVertical_bias="0.0" />

    <Button
        android:id="@+id/next_button"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginEnd="32dp"
        android:layout_marginBottom="32dp"
        android:backgroundTint="#4C4C4C"
        android:onClick="goToDailySummary"
        android:text="@string/next"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/am"
        android:layout_width="56dp"
        android:layout_height="47dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="196dp"
        android:text="@string/am"
        android:textSize="36sp"
        app:layout_constraintStart_toEndOf="@+id/start_time"
        app:layout_constraintTop_toTopOf="@+id/info_text" />

    <TextView
        android:id="@+id/pm"
        android:layout_width="56dp"
        android:layout_height="57dp"
        android:layout_marginStart="20dp"
        android:layout_marginTop="132dp"
        android:text="@string/pm"
        android:textSize="36sp"
        app:layout_constraintStart_toEndOf="@+id/end_time"
        app:layout_constraintTop_toBottomOf="@+id/am" />

    <TextView
        android:id="@+id/alert"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/next_button"
        android:layout_centerHorizontal="true"
        android:text="@string/you_cannot_have_end_time_start_before_start_time"
        android:textSize="20sp"
        android:visibility="invisible"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
