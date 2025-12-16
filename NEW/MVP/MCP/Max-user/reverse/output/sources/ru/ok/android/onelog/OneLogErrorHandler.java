package ru.ok.android.onelog;

/* loaded from: classes2.dex */
public interface OneLogErrorHandler {

    public static class Default implements OneLogErrorHandler {
    }

    default void handleFailedItemStore(Exception exc, OneLogItem oneLogItem) {
    }
}
