package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.g;
import java.util.Objects;

/* compiled from: DefaultSubscriber.java */
/* loaded from: classes8.dex */
public abstract class a<T> implements InterfaceC41782o<T> {

    /* renamed from: b, reason: collision with root package name */
    public org.reactivestreams.e f405037b;

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        org.reactivestreams.e eVar2 = this.f405037b;
        Class<?> cls = getClass();
        Objects.requireNonNull(eVar, "next is null");
        if (eVar2 == null) {
            this.f405037b = eVar;
            eVar.request(Long.MAX_VALUE);
        } else {
            eVar.cancel();
            if (eVar2 != SubscriptionHelper.f404813b) {
                g.a(cls);
            }
        }
    }
}
