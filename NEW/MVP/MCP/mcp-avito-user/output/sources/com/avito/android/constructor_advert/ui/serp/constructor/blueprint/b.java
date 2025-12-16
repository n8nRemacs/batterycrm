package com.avito.android.constructor_advert.ui.serp.constructor.blueprint;

import Cr.InterfaceC13346a;
import TV0.g;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItemViewImpl;
import com.avito.android.video_snippets.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: ConstructorAdvertBorderlessBlueprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/blueprint/b;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/blueprint/a;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a<ConstructorAdvertItem> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.constructor_advert.ui.serp.constructor.k<ConstructorAdvertItem> f125797h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC25659b f125798i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.constructor_advert.ui.serp.constructor.b f125799j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final g f125800k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final C36135w2 f125801l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final RecyclerView.t f125802m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final g.a<ConstructorAdvertItemViewImpl> f125803n;

    /* compiled from: ConstructorAdvertBorderlessBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItemViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<ViewGroup, View, ConstructorAdvertItemViewImpl> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13346a f125804l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f125805m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC13346a interfaceC13346a, b bVar) {
            super(2);
            this.f125804l = interfaceC13346a;
            this.f125805m = bVar;
        }

        @Override // Y41.p
        public final ConstructorAdvertItemViewImpl invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            b bVar = this.f125805m;
            boolean zBooleanValue = bVar.f125801l.x().invoke().booleanValue();
            InterfaceC25659b interfaceC25659b = bVar.f125798i;
            return new ConstructorAdvertItemViewImpl(view2, this.f125804l, zBooleanValue ? interfaceC25659b.c() : interfaceC25659b.a(0), bVar.f125799j, bVar.f125800k, AsyncViewportTracker.ViewContext.f430413c, null, null, bVar.f125801l.x().invoke().booleanValue() ? bVar.f125802m : null, false, 192, null);
        }
    }

    public /* synthetic */ b(com.avito.android.constructor_advert.ui.serp.constructor.k kVar, InterfaceC13346a interfaceC13346a, InterfaceC25659b interfaceC25659b, com.avito.android.constructor_advert.ui.serp.constructor.b bVar, com.avito.android.video_snippets.g gVar, C36135w2 c36135w2, RecyclerView.t tVar, int i12, C42822w c42822w) {
        this(kVar, interfaceC13346a, interfaceC25659b, bVar, gVar, c36135w2, (i12 & 64) != 0 ? null : tVar);
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a, TV0.b
    public final TV0.d a() {
        return this.f125797h;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a, TV0.b
    @k
    public final g.a<ConstructorAdvertItemViewImpl> b() {
        return this.f125803n;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a, TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof ConstructorAdvertItem) {
            ConstructorAdvertItem constructorAdvertItem = (ConstructorAdvertItem) aVar;
            if (!constructorAdvertItem.getDisplayType().isCv() && !constructorAdvertItem.getDisplayType().isHouseCard()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a
    @k
    /* renamed from: e */
    public final com.avito.android.constructor_advert.ui.serp.constructor.k<ConstructorAdvertItem> a() {
        return this.f125797h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k com.avito.android.constructor_advert.ui.serp.constructor.k<? super ConstructorAdvertItem> kVar, @k InterfaceC13346a interfaceC13346a, @k InterfaceC25659b interfaceC25659b, @k com.avito.android.constructor_advert.ui.serp.constructor.b bVar, @l com.avito.android.video_snippets.g gVar, @k C36135w2 c36135w2, @l RecyclerView.t tVar) {
        super(kVar, interfaceC13346a, interfaceC25659b, bVar, gVar, c36135w2, tVar);
        this.f125797h = kVar;
        this.f125798i = interfaceC25659b;
        this.f125799j = bVar;
        this.f125800k = gVar;
        this.f125801l = c36135w2;
        this.f125802m = tVar;
        this.f125803n = new g.a<>(R.layout.constructor_advert_miniserp_borderless_item, new a(interfaceC13346a, this));
    }
}
