package com.avito.android.document_verification_status_screen.ui;

import Cd.C13243a;
import Cx.C13367a;
import Dx.C13456a;
import Fx.AbstractC13848a;
import Fx.AbstractC13850c;
import VU.b;
import Y41.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.document_verification_status_screen.di.b;
import com.avito.android.document_verification_status_screen.models.ButtonAction;
import com.avito.android.document_verification_status_screen.mvi.p;
import com.avito.android.document_verification_status_screen.mvi.q;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: VerificationStatusActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/document_verification_status_screen/ui/VerificationStatusActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VerificationStatusActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final a f144866q = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public q f144867m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f144868n = new O0(m0.f406844a.b(p.class), new i(), new h(new k()), new j());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public C13367a f144869o;

    /* renamed from: p, reason: collision with root package name */
    public com.avito.android.document_verification_status_screen.ui.f f144870p;

    /* compiled from: VerificationStatusActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/document_verification_status_screen/ui/VerificationStatusActivity$a;", "", "<init>", "()V", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationStatusActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/document_verification_status_screen/models/ButtonAction;", "action", "", "status", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/document_verification_status_screen/models/ButtonAction;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<ButtonAction, String, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(ButtonAction buttonAction, String str) {
            ButtonAction buttonAction2 = buttonAction;
            String str2 = str;
            a aVar = VerificationStatusActivity.f144866q;
            VerificationStatusActivity verificationStatusActivity = VerificationStatusActivity.this;
            verificationStatusActivity.a2().accept(new AbstractC13848a.b(buttonAction2));
            String str3 = buttonAction2.f144832d;
            if (str3 != null) {
                C13367a c13367a = verificationStatusActivity.f144869o;
                if (c13367a == null) {
                    c13367a = null;
                }
                c13367a.f2804a.c(new C13456a(c13367a.f2805b.a(), c13367a.f2807d.getF253025a(), c13367a.f2806c.now(), str2, str3));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationStatusActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = VerificationStatusActivity.f144866q;
            VerificationStatusActivity verificationStatusActivity = VerificationStatusActivity.this;
            verificationStatusActivity.a2().accept(AbstractC13848a.c.f6043a);
            C13367a c13367a = verificationStatusActivity.f144869o;
            if (c13367a == null) {
                c13367a = null;
            }
            c13367a.f2804a.c(new Dx.b(c13367a.f2805b.a(), c13367a.f2807d.getF253025a(), c13367a.f2806c.now()));
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationStatusActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<DeepLink, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = VerificationStatusActivity.f144866q;
            VerificationStatusActivity.this.a2().accept(new AbstractC13848a.d(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationStatusActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements l<AbstractC13850c, G0> {
        @Override // Y41.l
        public final G0 invoke(AbstractC13850c abstractC13850c) {
            VerificationStatusActivity verificationStatusActivity = (VerificationStatusActivity) this.receiver;
            a aVar = VerificationStatusActivity.f144866q;
            verificationStatusActivity.getClass();
            if (abstractC13850c instanceof AbstractC13850c.a) {
                verificationStatusActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationStatusActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFx/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LFx/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements l<Fx.d, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Fx.d dVar) {
            boolean z12;
            int i12;
            Fx.d dVar2 = dVar;
            com.avito.android.document_verification_status_screen.ui.f fVar = VerificationStatusActivity.this.f144870p;
            if (fVar == null) {
                fVar = null;
            }
            fVar.f144888g.setText(dVar2.f6055a);
            fVar.f144889h.setText(dVar2.f6056b);
            NavBar navBar = fVar.f144887f;
            Drawable drawableH = C35835l0.h(R.attr.ic_callCenter24, navBar.getContext());
            navBar.setState(com.avito.android.lib.design.nav_bar.a.a(dVar2.f6061g, null, null, null, null, dVar2.f6062h ? C42745f0.V(drawableH != null ? new a.C5289a(drawableH, null, null, 0, 0, 0, 62, null) : null) : null, new com.avito.android.document_verification_status_screen.ui.g(dVar2, fVar), 31));
            ImageRequest.a aVar = new ImageRequest.a(new DM.a(fVar.f144890i));
            aVar.f(Uri.parse(dVar2.f6058d));
            aVar.c();
            List<ButtonAction> list = dVar2.f6057c;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                ConstraintLayout constraintLayout = fVar.f144882a;
                if (!zHasNext) {
                    Iterator it2 = C42745f0.q0(arrayList).iterator();
                    Button button = null;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Button button2 = (Button) it2.next();
                        int dimension = (int) constraintLayout.getResources().getDimension(R.dimen.verification_status_button_margin_horizontal);
                        int dimension2 = (int) constraintLayout.getResources().getDimension(R.dimen.verification_status_button_margin_bottom_to_parent);
                        int dimension3 = (int) constraintLayout.getResources().getDimension(R.dimen.verification_status_button_margin_bottom_to_button);
                        androidx.constraintlayout.widget.d dVar3 = new androidx.constraintlayout.widget.d();
                        dVar3.g(constraintLayout);
                        dVar3.j(button2.getId(), 6, 0, 6, dimension);
                        dVar3.j(button2.getId(), 7, 0, 7, dimension);
                        dVar3.j(button2.getId(), 4, button != null ? button.getId() : 0, button == null ? 4 : 3, button == null ? dimension2 : dimension3);
                        dVar3.c(constraintLayout);
                        button = button2;
                    }
                    ArrayList arrayList2 = fVar.f144894m;
                    arrayList2.addAll(arrayList);
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        z12 = dVar2.f6063i;
                        int i13 = 8;
                        if (!zHasNext2) {
                            break;
                        }
                        View view = (View) it3.next();
                        if (z12) {
                            i13 = 0;
                        }
                        view.setVisibility(i13);
                    }
                    fVar.f144891j.setVisibility(dVar2.f6064j ? 0 : 8);
                    fVar.f144892k.setVisibility(dVar2.f6065k ? 0 : 8);
                    if (z12) {
                        String str = dVar2.f6059e;
                        if (str != null) {
                            fVar.f144893l = str;
                        }
                        String str2 = fVar.f144893l;
                        C13367a c13367a = fVar.f144886e;
                        c13367a.f2804a.c(new Dx.c(c13367a.f2806c.now(), c13367a.f2805b.a(), c13367a.f2807d.getF253025a(), str2));
                    }
                    return G0.f406611a;
                }
                ButtonAction buttonAction = (ButtonAction) it.next();
                int iOrdinal = buttonAction.f144830b.ordinal();
                if (iOrdinal == 0) {
                    i12 = R.attr.buttonPrimaryLarge;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = R.attr.buttonSecondaryLarge;
                }
                Button button3 = new Button(constraintLayout.getContext(), null, 0, 0, 14, null);
                button3.setId(View.generateViewId());
                button3.setText(buttonAction.f144829a);
                b.a aVar2 = VU.b.f17147t;
                Context context = constraintLayout.getContext();
                int iJ2 = C35835l0.j(i12, constraintLayout.getContext());
                aVar2.getClass();
                button3.setStyle(b.a.c(iJ2, context));
                button3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                button3.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(15, fVar, buttonAction));
                constraintLayout.addView(button3, button3.getLayoutParams());
                arrayList.add(button3);
            }
        }
    }

    /* compiled from: VerificationStatusActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = VerificationStatusActivity.f144866q;
            VerificationStatusActivity.this.a2().accept(AbstractC13848a.C0310a.f6041a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f144876l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f144876l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f144876l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return VerificationStatusActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return VerificationStatusActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: VerificationStatusActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/document_verification_status_screen/mvi/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/document_verification_status_screen/mvi/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<p> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            q qVar = VerificationStatusActivity.this.f144867m;
            if (qVar == null) {
                qVar = null;
            }
            return (p) qVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.verification_status_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        b.a aVarA = com.avito.android.document_verification_status_screen.di.a.a();
        InterfaceC29971h interfaceC29971hA = C29972i.a(C29972i.b(this), Object.class);
        aVarA.a(new g(), (com.avito.android.document_verification_status_screen.di.d) interfaceC29971hA, cv.c.a(this)).a(this);
    }

    public final p a2() {
        return (p) this.f144868n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.verification_status_root);
        b bVar = new b();
        c cVar = new c();
        d dVar = new d();
        C13367a c13367a = this.f144869o;
        if (c13367a == null) {
            c13367a = null;
        }
        this.f144870p = new com.avito.android.document_verification_status_screen.ui.f(constraintLayout, bVar, cVar, dVar, c13367a);
        com.avito.android.arch.mvi.android.f.a(a2(), this, Lifecycle.State.f46681d, new e(1, this, VerificationStatusActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/document_verification_status_screen/models/VerificationStatusOneTimeEvent;)V", 0), new f());
    }
}
