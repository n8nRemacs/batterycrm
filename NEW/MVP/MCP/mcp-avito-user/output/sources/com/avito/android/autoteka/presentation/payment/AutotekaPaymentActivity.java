package com.avito.android.autoteka.presentation.payment;

import Ca1.ViewOnTouchListenerC13234a;
import L91.o;
import Nf.InterfaceC14568a;
import Nf.b;
import Y61.k;
import Y61.l;
import Zd.InterfaceC19542a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23060r0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.analytics.screens.AutotekaPaymentScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.deeplinks.AutotekaWaitingForPaymentLink;
import com.avito.android.autoteka.deeplinks.PaymentDetails;
import com.avito.android.autoteka.deeplinks.WaitingForPaymentDetails;
import com.avito.android.autoteka.domain.model.confirmEmail.ConfirmEmailDetails;
import com.avito.android.autoteka.helpers.l;
import com.avito.android.autoteka.items.payment.PaymentItem;
import com.avito.android.autoteka.presentation.confirmEmail.AutotekaConfirmEmailBottomSheetDialog;
import com.avito.android.autoteka.presentation.payment.e;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.autoteka.model.ContestAgreement;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.D6;
import com.avito.android.util.H2;
import com.avito.android.util.K2;
import com.avito.android.util.P5;
import i.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: AutotekaPaymentActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/AutotekaPaymentActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaPaymentActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: y, reason: collision with root package name */
    @k
    public static final a f97386y = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public e.a f97387m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f97389o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f97390p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f97391q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f97392r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public InterfaceC36134w1 f97393s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public RecyclerView f97394t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public Button f97395u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f97396v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public H2 f97397w;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f97388n = new O0(m0.f406844a.b(com.avito.android.autoteka.presentation.payment.e.class), new h(), new g(new j()), new i());

    /* renamed from: x, reason: collision with root package name */
    @k
    public final androidx.view.result.h<Intent> f97398x = registerForActivityResult(new b.m(), new o(this, 9));

    /* compiled from: AutotekaPaymentActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/AutotekaPaymentActivity$a;", "", "<init>", "()V", "", "CONFIRM_EMAIL_DIALOG_TAG", "Ljava/lang/String;", "KEY_PRODUCT_DETAILS", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaPaymentActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PaymentItem.LoadingVariant.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PaymentItem.LoadingVariant loadingVariant = PaymentItem.LoadingVariant.f96848b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PaymentItem.LoadingVariant loadingVariant2 = PaymentItem.LoadingVariant.f96848b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: AutotekaPaymentActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Nf.b, G0> {
        public final void f(@k Nf.b bVar) {
            LinearLayout linearLayout;
            AutotekaPaymentActivity autotekaPaymentActivity = (AutotekaPaymentActivity) this.receiver;
            a aVar = AutotekaPaymentActivity.f97386y;
            autotekaPaymentActivity.getClass();
            if (bVar instanceof b.g) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                View viewK1 = autotekaPaymentActivity.K1();
                l.a aVar2 = ((b.g) bVar).f11697a;
                com.avito.android.component.toast.c.b(cVar, viewK1, aVar2.f96672d, null, null, null, aVar2.f96671c, aVar2.f96669a, aVar2.f96670b, null, false, false, null, null, 3982);
                return;
            }
            if (bVar instanceof b.c) {
                AutotekaConfirmEmailBottomSheetDialog.a aVar3 = AutotekaConfirmEmailBottomSheetDialog.f97214n0;
                ConfirmEmailDetails confirmEmailDetails = new ConfirmEmailDetails(((b.c) bVar).f11694a);
                aVar3.getClass();
                com.avito.android.lib.util.g.b(AutotekaConfirmEmailBottomSheetDialog.a.a(confirmEmailDetails), autotekaPaymentActivity, autotekaPaymentActivity.getSupportFragmentManager(), "ConfirmEmailDialog");
                return;
            }
            if (bVar instanceof b.d) {
                com.avito.android.deeplink_handler.handler.composite.a aVar4 = autotekaPaymentActivity.f97391q;
                if (aVar4 == null) {
                    aVar4 = null;
                }
                b.a.a(aVar4, ((b.d) bVar).f11695a, null, null, 6);
                return;
            }
            if (bVar instanceof b.e) {
                com.avito.android.deeplink_handler.handler.composite.a aVar5 = autotekaPaymentActivity.f97391q;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                b.a.a(aVar5, new AutotekaWaitingForPaymentLink(new WaitingForPaymentDetails(null, null)), null, null, 6);
                autotekaPaymentActivity.setResult(-1);
                autotekaPaymentActivity.finish();
                return;
            }
            if (L.f(bVar, b.a.f11692a)) {
                autotekaPaymentActivity.setResult(-1);
                autotekaPaymentActivity.finish();
                return;
            }
            if (bVar instanceof b.C0754b) {
                InterfaceC19542a interfaceC19542a = autotekaPaymentActivity.f97392r;
                Intent intentA = (interfaceC19542a != null ? interfaceC19542a : null).a(AuthSource.f92691Z);
                intentA.setFlags(603979776);
                autotekaPaymentActivity.f97398x.b(intentA);
                return;
            }
            if (!L.f(bVar, b.f.f11696a) || (linearLayout = (LinearLayout) autotekaPaymentActivity.findViewById(R.id.discounts_container)) == null) {
                return;
            }
            com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(autotekaPaymentActivity, R.attr.tooltipSmallInverse, 0, 4, null);
            kVar.f181224j = new r.d(new i.b(new b.C5327b()));
            p.a(kVar, new com.avito.android.autoteka.presentation.payment.c(autotekaPaymentActivity, kVar));
            kVar.f181225k = true;
            kVar.f(linearLayout);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Nf.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaPaymentActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<AutotekaPaymentState, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AutotekaPaymentState autotekaPaymentState) {
            AutotekaPaymentState autotekaPaymentState2 = autotekaPaymentState;
            AutotekaPaymentActivity autotekaPaymentActivity = AutotekaPaymentActivity.this;
            com.avito.konveyor.adapter.a aVar = autotekaPaymentActivity.f97390p;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(new UV0.c(Collections.singletonList(autotekaPaymentState2.getF97459b())));
            com.avito.konveyor.adapter.j jVar = autotekaPaymentActivity.f97389o;
            if (jVar == null) {
                jVar = null;
            }
            jVar.notifyDataSetChanged();
            if (autotekaPaymentState2 instanceof AutotekaPaymentState.Success) {
                Button button = autotekaPaymentActivity.f97395u;
                if (button != null) {
                    D6.G(button, true);
                }
                com.avito.android.autoteka.presentation.payment.b bVar = new com.avito.android.autoteka.presentation.payment.b(autotekaPaymentActivity);
                Button button2 = autotekaPaymentActivity.f97395u;
                PaymentItem paymentItem = ((AutotekaPaymentState.Success) autotekaPaymentState2).f97463e;
                if (button2 != null) {
                    int iOrdinal = paymentItem.f96840f.ordinal();
                    if (iOrdinal == 0) {
                        button2.setLoading(true);
                        button2.setClickable(false);
                        button2.setEnabled(true);
                    } else if (iOrdinal == 1) {
                        button2.setLoading(false);
                        button2.setClickable(true);
                        button2.setEnabled(false);
                    } else if (iOrdinal == 2) {
                        button2.setLoading(false);
                        button2.setClickable(true);
                        button2.setEnabled(true);
                        button2.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(11, bVar, autotekaPaymentActivity));
                    }
                }
                autotekaPaymentActivity.a2(paymentItem.f96847m);
                TextView textView = (TextView) autotekaPaymentActivity.findViewById(R.id.autoteka_license_agreement);
                AttributedText attributedText = paymentItem.f96841g;
                if (attributedText == null) {
                    D6.w(textView);
                } else {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    ArrayList arrayList = new ArrayList();
                    for (Attribute attribute : attributedText.getAttributes()) {
                        if (attribute instanceof LinkAttribute) {
                            LinkAttribute linkAttribute = (LinkAttribute) attribute;
                            ArrayList arrayListE0 = C42745f0.e0(FontParameter.UnderlineParameter.INSTANCE);
                            List<FontParameter> parameters = linkAttribute.getParameters();
                            if (parameters == null) {
                                parameters = C42784z0.f406748b;
                            }
                            arrayListE0.addAll(parameters);
                            G0 g02 = G0.f406611a;
                            arrayList.add(LinkAttribute.copy$default(linkAttribute, null, null, null, arrayListE0, 7, null));
                        } else if (attribute instanceof DeepLinkAttribute) {
                            DeepLinkAttribute deepLinkAttribute = (DeepLinkAttribute) attribute;
                            ArrayList arrayListE02 = C42745f0.e0(FontParameter.UnderlineParameter.INSTANCE);
                            List<FontParameter> parameters2 = deepLinkAttribute.getParameters();
                            if (parameters2 == null) {
                                parameters2 = C42784z0.f406748b;
                            }
                            arrayListE02.addAll(parameters2);
                            G0 g03 = G0.f406611a;
                            arrayList.add(DeepLinkAttribute.copy$default(deepLinkAttribute, null, null, null, null, null, arrayListE02, 31, null));
                        }
                    }
                    AttributedText attributedTextCopy$default = AttributedText.copy$default(attributedText, null, arrayList, 0, 5, null);
                    com.avito.android.util.text.j.c(textView, attributedTextCopy$default, null);
                    attributedTextCopy$default.linkClicksV3().t0(new com.avito.android.autoteka.presentation.payment.a(autotekaPaymentActivity));
                    D6.H(textView);
                }
            } else {
                Button button3 = autotekaPaymentActivity.f97395u;
                if (button3 != null) {
                    D6.G(button3, false);
                }
                autotekaPaymentActivity.a2(null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaPaymentActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isVisible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Boolean, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            RecyclerView recyclerViewP;
            View rootView;
            if (bool.booleanValue()) {
                a aVar = AutotekaPaymentActivity.f97386y;
                AutotekaPaymentActivity autotekaPaymentActivity = AutotekaPaymentActivity.this;
                View currentFocus = autotekaPaymentActivity.getCurrentFocus();
                if (currentFocus != null && (recyclerViewP = D6.p(currentFocus)) != null) {
                    RecyclerView recyclerView = autotekaPaymentActivity.f97394t;
                    int height = (recyclerView == null || (rootView = recyclerView.getRootView()) == null) ? 0 : rootView.getHeight();
                    Rect rect = new Rect();
                    RecyclerView recyclerView2 = autotekaPaymentActivity.f97394t;
                    if (recyclerView2 != null) {
                        recyclerView2.getWindowVisibleDisplayFrame(rect);
                    }
                    int iHeight = rect.height();
                    recyclerViewP.C0(0, Math.min(Math.max(0, iHeight - currentFocus.getHeight()), height - iHeight));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaPaymentActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNf/a;", "it", "Lkotlin/G0;", "invoke", "(LNf/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC14568a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14568a interfaceC14568a) {
            a aVar = AutotekaPaymentActivity.f97386y;
            AutotekaPaymentActivity.this.b2().accept(interfaceC14568a);
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f97403m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.l lVar) {
            super(0);
            this.f97403m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(AutotekaPaymentActivity.this, this.f97403m);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return AutotekaPaymentActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return AutotekaPaymentActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AutotekaPaymentActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/autoteka/presentation/payment/e;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/autoteka/presentation/payment/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<C23060r0, com.avito.android.autoteka.presentation.payment.e> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.autoteka.presentation.payment.e invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            e.a aVar = AutotekaPaymentActivity.this.f97387m;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.autoteka_payment_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("ProductDetails", PaymentDetails.class) : intent.getParcelableExtra("ProductDetails");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("paymentDetails cannot be null");
        }
        com.avito.android.autoteka.di.payment.f.a().a((yf.l) C29972i.a(C29972i.b(this), yf.l.class), cv.c.a(this), bundle != null, (PaymentDetails) parcelableExtra, new f(), new C28478k(AutotekaPaymentScreen.f90291d, s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97396v;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97396v;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    public final void a2(ContestAgreement contestAgreement) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.autoteka_contest_agreement_container);
        if (contestAgreement == null) {
            D6.w(linearLayout);
            return;
        }
        TextView textView = (TextView) findViewById(R.id.autoteka_contest_agreement_text);
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, contestAgreement.getText(), null);
        }
        Checkbox checkbox = (Checkbox) findViewById(R.id.autoteka_contest_agreement_checkbox);
        if (checkbox != null) {
            checkbox.setChecked(contestAgreement.getIsChecked());
            checkbox.setOnCheckedChangeListener(new com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h(this, 1));
        }
        D6.H(linearLayout);
    }

    public final com.avito.android.autoteka.presentation.payment.e b2() {
        return (com.avito.android.autoteka.presentation.payment.e) this.f97388n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97396v;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        this.f97394t = (RecyclerView) findViewById(R.id.autoteka_item_list);
        this.f97395u = (Button) findViewById(R.id.autoteka_payment_button);
        com.avito.konveyor.adapter.j jVar = this.f97389o;
        if (jVar == null) {
            jVar = null;
        }
        RecyclerView recyclerView = this.f97394t;
        if (recyclerView != null) {
            recyclerView.setAdapter(jVar);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            P5.b(toolbar);
            toolbar.setNavigationOnClickListener(new B(this, 28));
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97396v;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker2, b2(), new c(1, this, AutotekaPaymentActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentOneTimeEvent;)V", 0), new d());
        getSupportFragmentManager().p0("requestKeyEmailChange", this, new Ae0.c(this, 25));
        this.f97397w = K2.a(this, new e());
        RecyclerView recyclerView2 = this.f97394t;
        if (recyclerView2 != null) {
            recyclerView2.setOnTouchListener(new ViewOnTouchListenerC13234a(this, 2));
        }
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f97396v;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        H2 h22 = this.f97397w;
        if (h22 != null) {
            h22.dispose();
        }
        this.f97397w = null;
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        PaymentDetails paymentDetails = (PaymentDetails) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("ProductDetails", PaymentDetails.class) : intent.getParcelableExtra("ProductDetails"));
        if (paymentDetails == null || !paymentDetails.getIsPaymentFailed()) {
            return;
        }
        b2().accept(InterfaceC14568a.g.f11690a);
    }
}
