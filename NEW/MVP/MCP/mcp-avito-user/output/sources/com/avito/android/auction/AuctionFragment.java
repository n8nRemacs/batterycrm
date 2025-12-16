package com.avito.android.auction;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.auction.di.a;
import com.avito.android.auction.o;
import com.avito.android.deep_linking.links.AuctionBody;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AuctionFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/auction/AuctionFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/auction/o$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuctionFragment extends BaseFragment implements o.a, InterfaceC28477j.b {

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final a f92304p0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public o f92305n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f92306o0;

    /* compiled from: AuctionFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auction/AuctionFragment$a;", "", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public AuctionFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.auction_view, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        o oVar = this.f92305n0;
        if (oVar == null) {
            oVar = null;
        }
        oVar.c0();
        o oVar2 = this.f92305n0;
        (oVar2 != null ? oVar2 : null).e0();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        w wVar = new w(view);
        o oVar = this.f92305n0;
        if (oVar == null) {
            oVar = null;
        }
        oVar.a(wVar);
        o oVar2 = this.f92305n0;
        (oVar2 != null ? oVar2 : null).b(this);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        AuctionBody auctionBody = arguments != null ? (AuctionBody) arguments.getParcelable("auction_body") : null;
        a.InterfaceC2727a interfaceC2727aA = com.avito.android.auction.di.c.a();
        interfaceC2727aA.c(auctionBody);
        interfaceC2727aA.b((com.avito.android.auction.details.di.a) C29972i.a(C29972i.b(this), com.avito.android.auction.details.di.a.class));
        interfaceC2727aA.a(cv.c.b(this));
        interfaceC2727aA.build().a(this);
    }

    public final void q5() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
    }
}
