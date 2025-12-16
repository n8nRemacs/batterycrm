package com.avito.android.lib.beduin_v2.component.banner;

import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.util.y6;
import com.avito.beduin.v2.avito.component.button.banner.a;
import com.avito.beduin.v2.avito.component.button.banner.l;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.C;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import com.avito.beduin.v2.render.android_view.q;
import com.avito.beduin.v2.render.android_view.s;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BannerComponent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/banner/a;", "Lcom/avito/beduin/v2/render/android_view/q;", "Lcom/avito/beduin/v2/avito/component/button/banner/a;", "Lcom/avito/android/lib/design/banner/Banner;", "Lcom/avito/beduin/v2/avito/component/button/banner/a$a;", "a", "b", "_design-modules_beduin-v2_renderer_component_banner"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends q<com.avito.beduin.v2.avito.component.button.banner.a, Banner, a.C10369a> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f175506m;

    /* renamed from: n, reason: collision with root package name */
    public s<a.C10369a> f175507n;

    /* compiled from: BannerComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/banner/a$a;", "Lcom/avito/beduin/v2/render/android_view/s$c;", "Lcom/avito/beduin/v2/avito/component/button/banner/a$a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_banner"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.banner.a$a, reason: collision with other inner class name */
    public static final class C5180a implements s.c<a.C10369a> {
        @Override // com.avito.beduin.v2.render.android_view.s.c
        public final boolean c(InterfaceC36244d interfaceC36244d, InterfaceC36244d interfaceC36244d2) {
            return ((a.C10369a) interfaceC36244d).f333916b.equals(((a.C10369a) interfaceC36244d2).f333916b);
        }

        @Override // com.avito.beduin.v2.render.android_view.s.c
        public final ViewGroup.LayoutParams d(InterfaceC36244d interfaceC36244d, Resources resources) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ET0.b bVar = ((a.C10369a) interfaceC36244d).f333916b.f333917a;
            layoutParams.setMargins(bVar != null ? y6.b(bVar.f4016a) : 0, bVar != null ? y6.b(bVar.f4019d) : 0, bVar != null ? y6.b(bVar.f4017b) : 0, bVar != null ? y6.b(bVar.f4018c) : 0);
            return layoutParams;
        }

        @Override // com.avito.beduin.v2.render.android_view.s.c
        public final /* bridge */ /* synthetic */ boolean h(InterfaceC36244d interfaceC36244d) {
            return true;
        }
    }

    /* compiled from: BannerComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/banner/a$b;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/button/banner/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_banner"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends n<com.avito.beduin.v2.avito.component.button.banner.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final b f175508c = new b();

        public b() {
            super(l.f333928c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a(a12);
        }
    }

    public a(@k A a12) {
        super(null, 1, null);
        this.f175506m = a12;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, Object obj) {
        Banner banner = (Banner) view;
        com.avito.beduin.v2.avito.component.button.banner.a aVar = (com.avito.beduin.v2.avito.component.button.banner.a) obj;
        banner.setStyle((com.avito.android.lib.design.banner.a) D.a(aVar.f333909c, kVar));
        banner.setState(new TU.a(0, aVar.f333908b, aVar.f333907a));
        M.a(banner, aVar.f333911e);
        s<a.C10369a> sVar = this.f175507n;
        if (sVar == null) {
            sVar = null;
        }
        s.a(com.avito.android.lib.beduin_v2.component.banner.b.f175509l, sVar, kVar, C42745f0.V(aVar.f333910d));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        Banner banner = new Banner(viewGroup.getContext(), null, 0, 0, 14, null);
        A a12 = this.f175506m;
        this.f175507n = new s<>(a12, a12.f337907c, banner.getContainer(), new C5180a(), R.id.banner_child_component, this);
        return banner;
    }

    @Override // com.avito.beduin.v2.render.android_view.q
    @k
    public final C u() {
        s<a.C10369a> sVar = this.f175507n;
        if (sVar == null) {
            return null;
        }
        return sVar;
    }
}
