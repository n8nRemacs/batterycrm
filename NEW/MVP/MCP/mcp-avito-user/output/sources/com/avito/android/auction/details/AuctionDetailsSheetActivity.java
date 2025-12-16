package com.avito.android.auction.details;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Cd.C13243a;
import Md.c;
import Md.d;
import Rh.C15041a;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.view.C22981N;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.auction.details.di.b;
import com.avito.android.deep_linking.links.AuctionDetails;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.N0;
import com.avito.android.util.y6;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: AuctionDetailsSheetActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auction/details/AuctionDetailsSheetActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuctionDetailsSheetActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f92320s = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public r f92321m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f92322n = new O0(m0.f406844a.b(q.class), new d(), new c(new f()), new e());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f92323o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f92324p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f92325q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f92326r;

    /* compiled from: AuctionDetailsSheetActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<Md.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Md.c cVar) {
            Md.c cVar2 = cVar;
            AuctionDetailsSheetActivity auctionDetailsSheetActivity = (AuctionDetailsSheetActivity) this.receiver;
            int i12 = AuctionDetailsSheetActivity.f92320s;
            auctionDetailsSheetActivity.getClass();
            if (L.f(cVar2, c.a.f10920a)) {
                com.avito.android.lib.design.bottom_sheet.d dVar = auctionDetailsSheetActivity.f92326r;
                if (dVar != null) {
                    dVar.r();
                }
            } else {
                if (cVar2 instanceof c.C0691c) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar = auctionDetailsSheetActivity.f92323o;
                    if (aVar == null) {
                        aVar = null;
                    }
                    b.a.a(aVar, ((c.C0691c) cVar2).f10922a, null, null, 6);
                } else if (cVar2 instanceof c.d) {
                    InterfaceC35845m2 interfaceC35845m2 = auctionDetailsSheetActivity.f92324p;
                    auctionDetailsSheetActivity.startActivity((interfaceC35845m2 != null ? interfaceC35845m2 : null).t(Uri.parse(((c.d) cVar2).f10923a)));
                } else if (L.f(cVar2, c.b.f10921a)) {
                    auctionDetailsSheetActivity.finish();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AuctionDetailsSheetActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMd/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LMd/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Md.d, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Md.d dVar) {
            Md.d dVar2 = dVar;
            if (dVar2 instanceof d.b) {
                int i12 = AuctionDetailsSheetActivity.f92320s;
                AuctionDetailsSheetActivity auctionDetailsSheetActivity = AuctionDetailsSheetActivity.this;
                View viewInflate = LayoutInflater.from(auctionDetailsSheetActivity).inflate(R.layout.auction_details_view, (ViewGroup) null);
                com.avito.android.lib.design.bottom_sheet.d dVar3 = new com.avito.android.lib.design.bottom_sheet.d(auctionDetailsSheetActivity, 0, 2, null);
                com.avito.android.lib.design.bottom_sheet.d.M(dVar3, null, false, true, 7);
                dVar3.setCancelable(true);
                dVar3.setCanceledOnTouchOutside(true);
                dVar3.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(auctionDetailsSheetActivity, 9));
                dVar3.G(viewInflate, true);
                o oVar = new o(viewInflate);
                AuctionDetails auctionDetails = ((d.b) dVar2).f10925a;
                I5.a(oVar.f92379b, auctionDetails.getTitle(), false);
                auctionDetailsSheetActivity.a2(auctionDetails.getSubtitle());
                com.avito.android.util.text.a aVar = auctionDetailsSheetActivity.f92325q;
                if (aVar == null) {
                    aVar = null;
                }
                I5.a(oVar.f92380c, aVar.c(viewInflate.getContext(), auctionDetails.getSubtitle()), false);
                UniversalImage universalImage = auctionDetails.getUniversalImage();
                Image imageQ = universalImage != null ? com.avito.android.actions_sheet.a.q(viewInflate, universalImage) : null;
                SimpleDraweeView simpleDraweeView = oVar.f92381d;
                if (simpleDraweeView.getWidth() > 0) {
                    oVar.a(imageQ);
                } else {
                    simpleDraweeView.addOnLayoutChangeListener(new n(oVar, imageQ));
                }
                auctionDetailsSheetActivity.a2(auctionDetails.getFooter());
                com.avito.android.util.text.a aVar2 = auctionDetailsSheetActivity.f92325q;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                I5.a(oVar.f92383f, aVar2.c(viewInflate.getContext(), auctionDetails.getFooter()), false);
                com.avito.android.lib.design.button.b.a(oVar.f92384g, auctionDetails.getButtonText(), false);
                LinearLayout linearLayout = oVar.f92382e;
                linearLayout.removeAllViews();
                List<AuctionDetails.AuctionDetailsListElement> listD = auctionDetails.d();
                if (listD != null) {
                    for (AuctionDetails.AuctionDetailsListElement auctionDetailsListElement : listD) {
                        String title = auctionDetailsListElement.getTitle();
                        if ((title != null && title.length() != 0) || auctionDetailsListElement.getDescription() != null) {
                            auctionDetailsSheetActivity.a2(auctionDetailsListElement.getDescription());
                            String title2 = auctionDetailsListElement.getTitle();
                            com.avito.android.util.text.a aVar3 = auctionDetailsSheetActivity.f92325q;
                            if (aVar3 == null) {
                                aVar3 = null;
                            }
                            View view = oVar.f92378a;
                            CharSequence charSequenceC = aVar3.c(view.getContext(), auctionDetailsListElement.getDescription());
                            View viewInflate2 = LayoutInflater.from(view.getContext()).inflate(R.layout.auction_details_element_view, (ViewGroup) null);
                            View viewFindViewById = viewInflate2.findViewById(R.id.element_title);
                            if (viewFindViewById == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                            }
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate2.findViewById(R.id.element_description);
                            if (viewFindViewById2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                            }
                            I5.a(textView, title2, false);
                            I5.a((TextView) viewFindViewById2, charSequenceC, false);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.topMargin = y6.b(24);
                            viewInflate2.setLayoutParams(layoutParams);
                            linearLayout.addView(viewInflate2);
                        }
                    }
                }
                C43175k.K(new C43197r1(new j(auctionDetailsSheetActivity, null), y.a(oVar.f92386i)), C22981N.a(auctionDetailsSheetActivity.getLifecycle()));
                com.avito.android.lib.util.g.a(dVar3);
                auctionDetailsSheetActivity.f92326r = dVar3;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f92328l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f92328l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f92328l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<S0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return AuctionDetailsSheetActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<AbstractC50339a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return AuctionDetailsSheetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AuctionDetailsSheetActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/auction/details/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/auction/details/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<q> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = AuctionDetailsSheetActivity.this.f92321m;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("auction_details", AuctionDetails.class) : intent.getParcelableExtra("auction_details");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Starting AuctionDetailsSheetActivity unavailable without AuctionDetails model");
        }
        b.a aVarA = com.avito.android.auction.details.di.c.a();
        aVarA.c((AuctionDetails) parcelableExtra);
        aVarA.b((com.avito.android.auction.details.di.a) C29972i.a(C29972i.b(this), com.avito.android.auction.details.di.a.class));
        aVarA.a(cv.c.a(this));
        aVarA.build().a(this);
    }

    public final void a2(AttributedText attributedText) {
        if (attributedText == null) {
            return;
        }
        attributedText.setOnUrlClickListener(new i(this, 0));
        attributedText.setOnDeepLinkClickListener(new C15041a(this, 10));
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.arch.mvi.android.f.b(this, (q) this.f92322n.getValue(), new a(1, this, AuctionDetailsSheetActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/auction/details/mvi/entity/AuctionDetailsOneTimeEvent;)V", 0), new b());
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f92326r;
        if (dVar != null) {
            dVar.setOnDismissListener(null);
            N0.a(dVar);
        }
        this.f92326r = null;
    }
}
