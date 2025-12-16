package com.avito.android.serp.adapter.constructor.list;

import TV0.g;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.constructor_advert.ui.serp.constructor.s;
import com.avito.android.di.module.Y2;
import com.avito.android.remote.model.SnippetSize;
import com.avito.android.serp.adapter.E0;
import com.avito.android.serp.adapter.constructor.A;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: SerpConstructorAdvertListBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/list/a;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/blueprint/a;", "Lcom/avito/android/serp/adapter/constructor/SerpConstructorAdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a<SerpConstructorAdvertItem> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final g.a<s> f269497h;

    /* compiled from: SerpConstructorAdvertListBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/constructor_advert/ui/serp/constructor/s;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/constructor_advert/ui/serp/constructor/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.constructor.list.a$a, reason: collision with other inner class name */
    public static final class C8043a extends N implements p<ViewGroup, View, s> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C36135w2 f269498l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC25659b f269499m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.t f269500n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ E0 f269501o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.constructor_advert.ui.serp.constructor.b f269502p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.video_snippets.g f269503q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8043a(RecyclerView.t tVar, InterfaceC25659b interfaceC25659b, C36135w2 c36135w2, com.avito.android.constructor_advert.ui.serp.constructor.b bVar, E0 e02, com.avito.android.video_snippets.g gVar) {
            super(2);
            this.f269498l = c36135w2;
            this.f269499m = interfaceC25659b;
            this.f269500n = tVar;
            this.f269501o = e02;
            this.f269502p = bVar;
            this.f269503q = gVar;
        }

        @Override // Y41.p
        public final s invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            C36135w2 c36135w2 = this.f269498l;
            boolean zBooleanValue = c36135w2.x().invoke().booleanValue();
            InterfaceC25659b interfaceC25659b = this.f269499m;
            return new s(zBooleanValue ? interfaceC25659b.c() : interfaceC25659b.a(0), view2, this.f269501o, this.f269502p, this.f269503q, AsyncViewportTracker.ViewContext.f430418h, null, c36135w2.x().invoke().booleanValue() ? this.f269500n : null, false, 64, null);
        }
    }

    @Inject
    public a(@k A a12, @k E0 e02, @k InterfaceC25659b interfaceC25659b, @k com.avito.android.constructor_advert.ui.serp.constructor.b bVar, @l com.avito.android.video_snippets.g gVar, @k C36135w2 c36135w2, @l @Y2 RecyclerView.t tVar) {
        super(a12, e02, interfaceC25659b, bVar, gVar, c36135w2, tVar);
        this.f269497h = new g.a<>(R.layout.constructor_advert_item_list, new C8043a(tVar, interfaceC25659b, c36135w2, bVar, e02, gVar));
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a, TV0.b
    @k
    public final g.a<s> b() {
        return this.f269497h;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a, TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof SerpConstructorAdvertItem) {
            SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) aVar;
            if (serpConstructorAdvertItem.getDisplayType().isList() && serpConstructorAdvertItem.getSize() == SnippetSize.SMALL && !serpConstructorAdvertItem.getDisplayType().isGrid() && !serpConstructorAdvertItem.getDisplayType().isRich() && !serpConstructorAdvertItem.getDisplayType().isCv() && !serpConstructorAdvertItem.isRedesign() && !serpConstructorAdvertItem.getDisplayType().isAvitoBlack() && !serpConstructorAdvertItem.getDisplayType().isAvitoMall() && !serpConstructorAdvertItem.getDisplayType().isService()) {
                return true;
            }
        }
        return false;
    }
}
