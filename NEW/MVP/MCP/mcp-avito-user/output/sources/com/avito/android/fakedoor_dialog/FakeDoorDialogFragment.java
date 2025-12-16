package com.avito.android.fakedoor_dialog;

import Cd.C13243a;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.FakeDoorDialogLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import mC.InterfaceC43943a;
import mC.c;
import z1.AbstractC50339a;

/* compiled from: FakeDoorDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/fakedoor_dialog/FakeDoorDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FakeDoorDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f155083h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.fakedoor_dialog.e f155084i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final O0 f155085j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f155086k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f155087l0;

    /* renamed from: m0, reason: collision with root package name */
    public TextView f155088m0;

    /* renamed from: n0, reason: collision with root package name */
    public ViewGroup f155089n0;

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f155082p0 = {m0.f406844a.e(new Y(FakeDoorDialogFragment.class, "params", "getParams$_avito_fakedoor_dialog_impl()Lcom/avito/android/fakedoor_dialog/FakeDoorDialogParams;", 0))};

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final a f155081o0 = new a(null);

    /* compiled from: FakeDoorDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fakedoor_dialog/FakeDoorDialogFragment$a;", "", "<init>", "()V", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FakeDoorDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155090a;

        static {
            int[] iArr = new int[FakeDoorDialogLink.ButtonStyle.values().length];
            try {
                iArr[FakeDoorDialogLink.ButtonStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FakeDoorDialogLink.ButtonStyle.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f155090a = iArr;
        }
    }

    /* compiled from: FakeDoorDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = FakeDoorDialogFragment.f155081o0;
            ((com.avito.android.fakedoor_dialog.d) FakeDoorDialogFragment.this.f155085j0.getValue()).accept(InterfaceC43943a.b.f414391a);
            return G0.f406611a;
        }
    }

    /* compiled from: FakeDoorDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<mC.c, G0> {
        @Override // Y41.l
        public final G0 invoke(mC.c cVar) {
            FakeDoorDialogFragment fakeDoorDialogFragment = (FakeDoorDialogFragment) this.receiver;
            a aVar = FakeDoorDialogFragment.f155081o0;
            fakeDoorDialogFragment.getClass();
            if (cVar instanceof c.a) {
                fakeDoorDialogFragment.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FakeDoorDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LmC/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LmC/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<mC.d, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(mC.d dVar) {
            int i12;
            int i13 = 0;
            mC.d dVar2 = dVar;
            a aVar = FakeDoorDialogFragment.f155081o0;
            FakeDoorDialogFragment fakeDoorDialogFragment = FakeDoorDialogFragment.this;
            ViewGroup viewGroup = fakeDoorDialogFragment.f155089n0;
            if (viewGroup == null) {
                viewGroup = null;
            }
            viewGroup.removeAllViews();
            TextView textView = fakeDoorDialogFragment.f155088m0;
            if (textView == null) {
                textView = null;
            }
            com.avito.android.util.text.a aVar2 = fakeDoorDialogFragment.f155086k0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            Context contextRequireContext = fakeDoorDialogFragment.requireContext();
            FakeDoorDialogLink.Stage stage = dVar2.f414398d;
            textView.setText(aVar2.c(contextRequireContext, stage.getContent()));
            AttributedText content = stage.getContent();
            if (content != null) {
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = fakeDoorDialogFragment.f155087l0;
                content.setOnDeepLinkClickListener(new f(new com.avito.android.fakedoor_dialog.b(1, aVar3 != null ? aVar3 : null, com.avito.android.deeplink_handler.handler.composite.a.class, "handle", "handle(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V", 0)));
            }
            List<FakeDoorDialogLink.DialogButton> listC = stage.c();
            ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
            int i14 = 0;
            for (Object obj : listC) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                FakeDoorDialogLink.DialogButton dialogButton = (FakeDoorDialogLink.DialogButton) obj;
                Button button = new Button(fakeDoorDialogFragment.requireContext(), null, 0, 0, 14, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.topMargin = i14 == 0 ? 0 : y6.b(16);
                button.setLayoutParams(marginLayoutParams);
                button.setText(dialogButton.getText());
                int i16 = b.f155090a[dialogButton.getStyle().ordinal()];
                if (i16 == 1) {
                    i12 = R.attr.buttonPrimaryLarge;
                } else {
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = R.attr.buttonSecondaryLarge;
                }
                button.setAppearanceFromAttr(i12);
                button.setOnClickListener(new com.avito.android.fakedoor_dialog.a(i14, i13, fakeDoorDialogFragment));
                arrayList.add(button);
                i14 = i15;
            }
            ViewGroup viewGroup2 = fakeDoorDialogFragment.f155089n0;
            ViewGroup viewGroup3 = viewGroup2 == null ? null : viewGroup2;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                viewGroup3.addView((View) it.next());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FakeDoorDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f implements w, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f155093b;

        public f(Y41.l lVar) {
            this.f155093b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof w) && (obj instanceof D)) {
                return L.f(this.f155093b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f155093b;
        }

        public final int hashCode() {
            return this.f155093b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f155093b.invoke(deepLink);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f155094l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f155094l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f155094l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return FakeDoorDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f155096l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f155096l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f155096l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f155097l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f155097l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f155097l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f155098l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f155098l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f155098l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FakeDoorDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/fakedoor_dialog/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/fakedoor_dialog/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.fakedoor_dialog.d> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.fakedoor_dialog.d invoke() {
            com.avito.android.fakedoor_dialog.e eVar = FakeDoorDialogFragment.this.f155084i0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.fakedoor_dialog.d) eVar.get();
        }
    }

    public FakeDoorDialogFragment() {
        super(0, 1, null);
        this.f155083h0 = new C35968w3(this);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f155085j0 = new O0(m0.f406844a.b(com.avito.android.fakedoor_dialog.d.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.fakedoor_dialog.di.a.a().a((com.avito.android.fakedoor_dialog.di.e) C29972i.a(C29972i.b(this), com.avito.android.fakedoor_dialog.di.e.class), cv.c.b(this), (FakeDoorDialogParams) this.f155083h0.getValue(this, f155082p0[0])).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, ((FakeDoorDialogParams) this.f155083h0.getValue(this, f155082p0[0])).f155101c, true, false, 10);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.setContentView(R.layout.fake_door_bottom_sheet);
        this.f155088m0 = (TextView) dVar.findViewById(R.id.content_text);
        this.f155089n0 = (ViewGroup) dVar.findViewById(R.id.buttons_container);
        dVar.R(new c());
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.arch.mvi.android.f.a((com.avito.android.fakedoor_dialog.d) this.f155085j0.getValue(), this, Lifecycle.State.f46682e, new d(1, this, FakeDoorDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/fakedoor_dialog/mvi/entity/FakeDoorDialogOneTimeEvent;)V", 0), new e());
    }
}
