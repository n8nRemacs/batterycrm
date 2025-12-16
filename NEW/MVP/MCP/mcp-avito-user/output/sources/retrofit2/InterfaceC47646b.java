package retrofit2;

import okhttp3.Request;

/* compiled from: Call.java */
/* renamed from: retrofit2.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47646b<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    InterfaceC47646b<T> mo58clone();

    void enqueue(InterfaceC47648d<T> interfaceC47648d);

    y<T> execute();

    boolean isCanceled();

    Request request();
}
