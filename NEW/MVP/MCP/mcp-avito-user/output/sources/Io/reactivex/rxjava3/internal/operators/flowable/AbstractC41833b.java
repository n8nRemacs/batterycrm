package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import java.util.Objects;
import n41.InterfaceC44192i;

/* compiled from: AbstractFlowableWithUpstream.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC41833b<T, R> extends AbstractC41777j<R> implements InterfaceC44192i<T> {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC41777j<T> f402624c;

    public AbstractC41833b(AbstractC41777j<T> abstractC41777j) {
        Objects.requireNonNull(abstractC41777j, "source is null");
        this.f402624c = abstractC41777j;
    }
}
