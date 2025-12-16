package com.avito.android.advertising.loaders.beduin.container;

import Y61.k;
import Y61.l;
import android.view.ViewGroup;
import com.avito.android.advertising.loaders.beduin.H;
import com.avito.android.advertising.loaders.beduin.container.e;
import com.avito.android.lib.design.surface.Surface;
import com.avito.android.util.y6;
import com.avito.beduin.v2.component.box.android_view.f;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialBoxComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/container/a;", "Lcom/avito/beduin/v2/component/box/android_view/a;", "Lcom/avito/android/advertising/loaders/beduin/container/e;", "Lcom/avito/android/lib/design/surface/Surface;", "a", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.beduin.v2.component.box.android_view.a<e, Surface> {

    /* renamed from: p, reason: collision with root package name */
    @k
    public final H f88114p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public Surface f88115q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public e f88116r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public com.avito.android.bx_beduin_native_items.a f88117s;

    /* compiled from: CommercialBoxComponent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/container/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/advertising/loaders/beduin/container/e;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advertising.loaders.beduin.container.a$a, reason: collision with other inner class name */
    public static final class C2610a extends n<e> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final H f88118c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f88119d;

        public C2610a(@k H h12) {
            super(e.a.f88124c);
            this.f88118c = h12;
            this.f88119d = new ArrayList();
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            a aVar = new a(a12, this.f88118c);
            this.f88119d.add(aVar);
            return aVar;
        }
    }

    public a(@k A a12, @k H h12) {
        super(a12);
        this.f88114p = h12;
    }

    @Override // com.avito.beduin.v2.component.box.android_view.a
    public final void v(f fVar, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.component.box.state.a aVar) {
        Surface surface = (Surface) fVar;
        e eVar = (e) aVar;
        if (this.f88117s != null && (!surface.equals(this.f88115q) || !eVar.equals(this.f88116r))) {
            this.f88117s = null;
        }
        this.f88115q = surface;
        this.f88116r = eVar;
        com.avito.beduin.v2.component.box.state.b bVar = eVar.f88122a;
        Y41.a<G0> aVar2 = bVar.f335572e;
        if (aVar2 != null) {
            surface.setOnClickListener(new b(aVar2));
        } else {
            surface.setOnClickListener(null);
            surface.setClickable(false);
        }
        ET0.b bVar2 = bVar.f335571d;
        surface.setPadding(bVar2 != null ? y6.b(bVar2.f4016a) : 0, bVar2 != null ? y6.b(bVar2.f4019d) : 0, bVar2 != null ? y6.b(bVar2.f4017b) : 0, bVar2 != null ? y6.b(bVar2.f4018c) : 0);
    }

    @Override // com.avito.beduin.v2.component.box.android_view.a
    public final f w(ViewGroup viewGroup) {
        Surface surface = new Surface(viewGroup.getContext(), null, 0, 0, 14, null);
        surface.setClipChildren(false);
        surface.setClipToPadding(false);
        return surface;
    }
}
