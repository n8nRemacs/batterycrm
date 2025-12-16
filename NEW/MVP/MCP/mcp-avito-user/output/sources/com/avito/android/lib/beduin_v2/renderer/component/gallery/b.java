package com.avito.android.lib.beduin_v2.renderer.component.gallery;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.C29270c0;
import com.avito.android.lib.design.gallery.GalleryViewHolder;
import com.avito.android.lib.design.gallery.h;
import com.avito.android.lib.design.gallery.i;
import com.avito.android.lib.design.gallery.j;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.beduin.v2.avito.component.image.state.q;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/renderer/component/gallery/b;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/component/scroll_container/state/d;", "Lcom/avito/android/lib/design/gallery/h;", "a", "_design-modules_beduin-v2_renderer_component_gallery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC36333c<com.avito.beduin.v2.component.scroll_container.state.d, h> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f176408m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final C29270c0 f176409n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public InterfaceC36249i f176410o;

    /* compiled from: GalleryComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/renderer/component/gallery/b$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/component/scroll_container/state/d;", "_design-modules_beduin-v2_renderer_component_gallery"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends n<com.avito.beduin.v2.component.scroll_container.state.d> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C29270c0 f176411c;

        public a(@k C29270c0 c29270c0) {
            super(com.avito.beduin.v2.component.scroll_container.state.b.f336191c);
            this.f176411c = c29270c0;
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new b(a12, this.f176411c);
        }
    }

    public b(@k A a12, @k C29270c0 c29270c0) {
        super(null, 1, null);
        this.f176408m = a12;
        this.f176409n = c29270c0;
    }

    public static Image u(Map map) {
        Uri uri;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            q.b bVar = (q.b) entry.getKey();
            q.c cVar = (q.c) entry.getValue();
            Size size = new Size(bVar.f334442a, bVar.f334443b);
            if (cVar == null || (uri = Uri.parse(cVar.f334444a)) == null) {
                uri = Uri.EMPTY;
            }
            arrayList.add(new Q(size, uri));
        }
        return new Image(P0.p(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r11, com.avito.beduin.v2.theme.k r12, com.avito.beduin.v2.component.scroll_container.state.d r13) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.renderer.component.gallery.b.l(android.view.View, com.avito.beduin.v2.theme.k, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(final ViewGroup viewGroup) {
        h hVar = new h(viewGroup.getContext(), null, 2, 0 == true ? 1 : 0);
        j jVar = new j();
        j.f179231c.getClass();
        i iVar = new i();
        LinkedHashMap linkedHashMap = jVar.f179233b;
        int size = linkedHashMap.size();
        Integer numValueOf = Integer.valueOf(size);
        LinkedHashMap linkedHashMap2 = jVar.f179232a;
        n0 n0Var = m0.f406844a;
        linkedHashMap2.put(n0Var.b(com.avito.android.lib.design.gallery.d.class), numValueOf);
        linkedHashMap.put(Integer.valueOf(size), iVar);
        j.b bVar = new j.b() { // from class: com.avito.android.lib.beduin_v2.renderer.component.gallery.a
            @Override // com.avito.android.lib.design.gallery.j.b
            public final GalleryViewHolder a(ViewGroup viewGroup2) {
                BT.a aVar = new BT.a(viewGroup.getContext(), null, 0, 0, 14, null);
                aVar.setLayoutParams(new RecyclerView.n(-1, -1));
                return new f(aVar, this.f176406a.f176408m);
            }
        };
        int size2 = linkedHashMap.size();
        linkedHashMap2.put(n0Var.b(e.class), Integer.valueOf(size2));
        linkedHashMap.put(Integer.valueOf(size2), bVar);
        hVar.setGalleryAdapter(new com.avito.android.lib.design.gallery.b(jVar, hVar));
        C29270c0 c29270c0 = this.f176409n;
        c29270c0.getClass();
        kotlin.reflect.n<Object> nVar = C29270c0.f113263t[5];
        if (((Boolean) c29270c0.f113269g.a().invoke()).booleanValue()) {
            hVar.setNestedScrollingEnabled(false);
        }
        return hVar;
    }
}
