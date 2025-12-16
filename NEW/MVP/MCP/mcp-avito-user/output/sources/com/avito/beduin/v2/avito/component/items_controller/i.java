package com.avito.beduin.v2.avito.component.items_controller;

import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.engine.component.H;
import com.avito.beduin.v2.engine.component.I;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;

/* compiled from: ItemsRendererState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/items_controller/i;", "Lcom/avito/beduin/v2/engine/D;", "a", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D f334560a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f334561b;

    /* compiled from: ItemsRendererState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/items_controller/i$a;", "Lcom/avito/beduin/v2/engine/component/i;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements InterfaceC36249i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f334562a;

        public a(@Y61.k InterfaceC36249i interfaceC36249i) {
            this.f334562a = interfaceC36249i;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
        public final void b() {
            this.f334562a.b();
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
        public final void destroy() {
            this.f334562a.destroy();
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f334562a, ((a) obj).f334562a);
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
        @Y61.k
        public final String getId() {
            return this.f334562a.getId();
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
        public final Object getState() {
            return (h) this.f334562a.getState();
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
        @Y61.l
        public final String getTag() {
            return this.f334562a.getTag();
        }

        public final int hashCode() {
            return this.f334562a.hashCode();
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
        @Y61.k
        public final String m() {
            return this.f334562a.m();
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
        @Y61.k
        public final I n(@Y61.k H h12) {
            return this.f334562a.n(h12);
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
        public final void release() {
            this.f334562a.release();
        }

        @Y61.k
        public final String toString() {
            return "ItemsController(componentState=" + this.f334562a + ')';
        }
    }

    public i(@Y61.k D d12) {
        this.f334560a = d12;
        this.f334561b = new a((InterfaceC36249i) d12.getState());
    }

    @Y61.k
    public final k a(@Y61.k Y41.l lVar) {
        l0.h hVar = new l0.h();
        return new k(hVar, n(new j(new m(hVar, this, lVar))));
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    public final void b() {
        this.f334560a.b();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    public final void destroy() {
        this.f334560a.destroy();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.k
    public final String getId() {
        return this.f334560a.getId();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.l
    public final Object getState() {
        return this.f334560a.getState();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.l
    public final String getTag() {
        return this.f334560a.getTag();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.k
    public final String m() {
        return this.f334560a.m();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.k
    public final I n(@Y61.k H h12) {
        return this.f334560a.n(h12);
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    public final void release() {
        this.f334560a.release();
    }
}
