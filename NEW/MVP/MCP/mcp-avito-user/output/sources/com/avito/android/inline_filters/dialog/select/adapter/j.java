package com.avito.android.inline_filters.dialog.select.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: InlineFiltersDialogItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/j;", "LTV0/d;", "Lcom/avito/android/inline_filters/dialog/select/adapter/m;", "Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements TV0.d<m, i> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f172109b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f172110c;

    /* compiled from: InlineFiltersDialogItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f172111l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k Y41.l<? super Integer, G0> lVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2) {
        this.f172109b = lVar;
        this.f172110c = lVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar = (m) eVar;
        i iVar = (i) aVar;
        mVar.setText(iVar.f172093d);
        InlineItemType inlineItemType = InlineItemType.f172065l;
        InlineItemType inlineItemType2 = iVar.f172095f;
        if (inlineItemType2 == inlineItemType) {
            return;
        }
        mVar.a(new k(this, iVar, i12));
        if (inlineItemType2 == InlineItemType.f172066m) {
            return;
        }
        boolean z12 = inlineItemType2 == InlineItemType.f172055b || inlineItemType2 == InlineItemType.f172056c || inlineItemType2 == InlineItemType.f172057d;
        mVar.gE(iVar.f172096g);
        mVar.setChecked(iVar.f172094e);
        mVar.Kd(z12);
        mVar.l(iVar.f172099j);
        mVar.UV(iVar.f172104o, iVar.f172105p);
        mVar.setIcon(iVar.f172100k);
        mVar.rF(iVar.f172101l, iVar.f172098i);
        mVar.ZH(new l(this, iVar));
        mVar.MY(iVar.f172106q);
    }

    public /* synthetic */ j(Y41.l lVar, Y41.l lVar2, int i12, C42822w c42822w) {
        this(lVar, (i12 & 2) != 0 ? a.f172111l : lVar2);
    }
}
