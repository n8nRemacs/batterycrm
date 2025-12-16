package com.avito.android.advert_details_items.rich_geo_block;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsRichGeoBlockView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/rich_geo_block/n;", "Lcom/avito/android/advert_details_items/rich_geo_block/l;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    public final int f85437b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ComposeView f85438c;

    /* compiled from: AdvertDetailsRichGeoBlockView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f85439l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f85440m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f85441n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f85442o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f85443p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4) {
            super(2);
            this.f85439l = cVar;
            this.f85440m = aVar;
            this.f85441n = aVar2;
            this.f85442o = aVar3;
            this.f85443p = aVar4;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(701015349, new m(this.f85439l, this.f85440m, this.f85441n, this.f85442o, this.f85443p), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    static {
        int i12 = ComposeView.f41092l;
    }

    public n(@Y61.k View view, int i12) {
        super(view);
        this.f85437b = i12;
        View viewFindViewById = view.findViewById(R.id.compose_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        ComposeView composeView = (ComposeView) viewFindViewById;
        this.f85438c = composeView;
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
    }

    @Override // com.avito.android.advert_details_items.rich_geo_block.l
    public final void ht(@Y61.k c cVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3, @Y61.k Y41.a<G0> aVar4) {
        ComposeView composeView = this.f85438c;
        ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = this.f85437b;
        composeView.setLayoutParams(layoutParams);
        composeView.setContent(new C22096n(1835304794, new a(cVar, aVar, aVar2, aVar3, aVar4), true));
    }
}
