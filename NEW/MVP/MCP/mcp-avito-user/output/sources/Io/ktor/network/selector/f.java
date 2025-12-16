package io.ktor.network.selector;

import kotlin.Metadata;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicRef;

/* compiled from: LockFreeMPSCQueue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/network/selector/f;", "", "E", "<init>", "()V", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class f<E> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicRef<g<E>> f400174a = AtomicFU.atomic(new g(8));

    public final boolean a(@Y61.k i iVar) {
        AtomicRef<g<E>> atomicRef = this.f400174a;
        while (true) {
            g gVar = (g) atomicRef.getValue();
            int iA2 = gVar.a(iVar);
            if (iA2 == 0) {
                return true;
            }
            if (iA2 == 1) {
                this.f400174a.compareAndSet(gVar, gVar.g());
            } else if (iA2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicRef<g<E>> atomicRef = this.f400174a;
        while (true) {
            g gVar = (g) atomicRef.getValue();
            if (gVar.d()) {
                return;
            } else {
                this.f400174a.compareAndSet(gVar, gVar.g());
            }
        }
    }

    public final boolean c() {
        return ((g) this.f400174a.getValue()).e();
    }

    @Y61.l
    public final E d() {
        AtomicRef<g<E>> atomicRef = this.f400174a;
        while (true) {
            g gVar = (g) atomicRef.getValue();
            E e12 = (E) gVar.h();
            if (e12 != g.f400176g) {
                return e12;
            }
            this.f400174a.compareAndSet(gVar, gVar.g());
        }
    }
}
