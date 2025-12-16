package defpackage;

/* loaded from: classes.dex */
public enum pf9 {
    OnCloseToDalvikHeapLimit(0.5d),
    /* JADX INFO: Fake field, exist only in values array */
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0d),
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackgroundLowSeverity(1.0d),
    /* JADX INFO: Fake field, exist only in values array */
    OnSystemModerateMemory(0.5d),
    OnAppBackgrounded(1.0d),
    /* JADX INFO: Fake field, exist only in values array */
    OnJavaMemoryRed(1.0d),
    /* JADX INFO: Fake field, exist only in values array */
    OnJavaMemoryYellow(0.5d),
    /* JADX INFO: Fake field, exist only in values array */
    OnSystemMemoryRed(1.0d),
    /* JADX INFO: Fake field, exist only in values array */
    OnSystemMemoryYellow(0.5d);

    public final double a;

    pf9(double d) {
        this.a = d;
    }
}
