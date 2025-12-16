package com.avito.beduin.v2.engine;

import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;

/* compiled from: RendererStateFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/F;", "Lcom/avito/beduin/v2/engine/D;", "Lcom/avito/beduin/v2/engine/component/i;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class F implements D, InterfaceC36249i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36249i f336468a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f336469b;

    public F(@Y61.k InterfaceC36249i interfaceC36249i, boolean z12) {
        this.f336468a = interfaceC36249i;
        this.f336469b = z12;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    public final void b() {
        this.f336468a.b();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    public final void destroy() {
        if (this.f336469b) {
            return;
        }
        this.f336468a.destroy();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.k
    public final String getId() {
        return this.f336468a.getId();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.l
    public final Object getState() {
        return this.f336468a.getState();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.l
    public final String getTag() {
        return this.f336468a.getTag();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.k
    public final String m() {
        return this.f336468a.m();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    @Y61.k
    public final com.avito.beduin.v2.engine.component.I n(@Y61.k com.avito.beduin.v2.engine.component.H h12) {
        return this.f336468a.n(h12);
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36249i
    public final void release() {
        this.f336468a.release();
    }
}
