package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import j41.InterfaceC42196c;

/* compiled from: Subject.java */
/* loaded from: classes8.dex */
public abstract class i<T> extends z<T> implements G<T> {
    @j41.e
    @InterfaceC42196c
    public final i<T> M0() {
        return this instanceof g ? this : new g(this);
    }
}
