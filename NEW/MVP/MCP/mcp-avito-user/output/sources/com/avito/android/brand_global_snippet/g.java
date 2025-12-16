package com.avito.android.brand_global_snippet;

import Y61.k;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: BrandGlobalSnippetPresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brand_global_snippet/g;", "Lcom/avito/android/brand_global_snippet/f;", "_avito_bx-content_snippet_brand-global-snippet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC34863v> f107489b;

    /* compiled from: BrandGlobalSnippetPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BrandGlobalSnippetItem f107491m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BrandGlobalSnippetItem brandGlobalSnippetItem) {
            super(0);
            this.f107491m = brandGlobalSnippetItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f107489b.get().Ld(this.f107491m, new AbstractC30567a.m(null));
            return G0.f406611a;
        }
    }

    /* compiled from: BrandGlobalSnippetPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BrandGlobalSnippetItem f107493m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BrandGlobalSnippetItem brandGlobalSnippetItem, int i12) {
            super(0);
            this.f107493m = brandGlobalSnippetItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC34863v interfaceC34863v = g.this.f107489b.get();
            BrandGlobalSnippetItem brandGlobalSnippetItem = this.f107493m;
            String str = "";
            String str2 = "";
            interfaceC34863v.k5(new AdvertItem(brandGlobalSnippetItem.getF272342b(), brandGlobalSnippetItem.getF317289b(), brandGlobalSnippetItem.getF107471g(), null, null, false, null, brandGlobalSnippetItem.getF107472h(), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 0L, null, null, brandGlobalSnippetItem.getF272344d(), brandGlobalSnippetItem.getViewType(), false, SerpDisplayType.Grid, false, false, null, null, null, false, null, false, brandGlobalSnippetItem.getF107473i(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, null, null, null, null, false, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, str, -1, str2, null, false, false, null, false, false, null, null, -2030076072, -129, -469762049, 31, null), null);
            return G0.f406611a;
        }
    }

    @Inject
    public g(@k h31.e<InterfaceC34863v> eVar) {
        this.f107489b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g2((i) eVar, (BrandGlobalSnippetItem) aVar, i12, C42784z0.f406748b);
    }

    @Override // TV0.f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void g2(@k i iVar, @k BrandGlobalSnippetItem brandGlobalSnippetItem, int i12, @k List<? extends Object> list) {
        iVar.gx(brandGlobalSnippetItem.getF107475k());
        if (list.contains("favorite_status_changed_payload")) {
            return;
        }
        iVar.we(brandGlobalSnippetItem.getF107471g(), brandGlobalSnippetItem.getF107472h(), brandGlobalSnippetItem.getF107474j(), brandGlobalSnippetItem.getF107468d(), brandGlobalSnippetItem.getF107470f(), brandGlobalSnippetItem.getF107481q(), new a(brandGlobalSnippetItem), new b(brandGlobalSnippetItem, i12));
    }
}
