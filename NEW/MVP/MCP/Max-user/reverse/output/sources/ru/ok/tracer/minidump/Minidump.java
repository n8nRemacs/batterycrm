package ru.ok.tracer.minidump;

/* loaded from: classes2.dex */
public final class Minidump {
    public static final Minidump c = new Minidump();
    public final Object a = new Object();
    public boolean b;

    public Minidump() {
        System.loadLibrary("tracernative");
    }

    private native void installMinidumpWriterImpl(String str);

    private native void uninstallMinidumpWriterImpl();

    public final void a(String str) {
        synchronized (this.a) {
            try {
                if (this.b) {
                    uninstallMinidumpWriterImpl();
                }
                installMinidumpWriterImpl(str);
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
