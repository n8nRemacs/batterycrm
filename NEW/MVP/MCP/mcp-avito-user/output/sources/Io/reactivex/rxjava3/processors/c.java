package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import j41.InterfaceC42196c;

/* compiled from: FlowableProcessor.java */
/* loaded from: classes8.dex */
public abstract class c<T> extends AbstractC41777j<T> implements org.reactivestreams.b<T, T>, InterfaceC41782o<T> {
    @j41.e
    @InterfaceC42196c
    public final c<T> z() {
        return this instanceof g ? this : new g(this);
    }
}
