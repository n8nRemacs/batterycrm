package com.avito.android.support_bottom_sheet.ui;

import Cd.C13243a;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.support_bottom_sheet.di.b;
import com.avito.android.support_bottom_sheet.mvi.n;
import com.avito.android.support_bottom_sheet.mvi.o;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import cv.InterfaceC39417a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import xA0.AbstractC49803a;
import xA0.AbstractC49805c;
import xA0.C49806d;
import z1.AbstractC50339a;

/* compiled from: SupportDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/support_bottom_sheet/ui/SupportDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final a f292497k0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public o f292498h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f292499i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.support_bottom_sheet.ui.b f292500j0;

    /* compiled from: SupportDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/support_bottom_sheet/ui/SupportDialogFragment$a;", "", "<init>", "()V", "", "EXTRA_CHAT_ACTION_SUBTITLE", "Ljava/lang/String;", "EXTRA_CHAT_ACTION_TITLE", "EXTRA_PHONE_ACTION_SUBTITLE", "EXTRA_PHONE_ACTION_TITLE", "EXTRA_SCREEN_TAG", "EXTRA_SLOT_ID", "EXTRA_SUPPORT_PHONE", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SupportDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.support_bottom_sheet.ui.SupportDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C8875a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f292501l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f292502m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ String f292503n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f292504o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f292505p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ String f292506q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Long f292507r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8875a(String str, Long l12, String str2, String str3, String str4, String str5, String str6) {
                super(1);
                this.f292501l = str;
                this.f292502m = str2;
                this.f292503n = str3;
                this.f292504o = str4;
                this.f292505p = str5;
                this.f292506q = str6;
                this.f292507r = l12;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putString("EXTRA_SUPPORT_PHONE", this.f292501l);
                bundle2.putString("EXTRA_SCREEN_TAG", this.f292502m);
                bundle2.putString("EXTRA_CHAT_ACTION_TITLE", this.f292503n);
                bundle2.putString("EXTRA_CHAT_ACTION_SUBTITLE", this.f292504o);
                bundle2.putString("EXTRA_PHONE_ACTION_TITLE", this.f292505p);
                bundle2.putString("EXTRA_PHONE_ACTION_SUBTITLE", this.f292506q);
                Long l12 = this.f292507r;
                if (l12 != null) {
                    bundle2.putLong("EXTRA_SLOT_ID", l12.longValue());
                }
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static SupportDialogFragment a(@Y61.l String str, @Y61.l Long l12, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6) {
            SupportDialogFragment supportDialogFragment = new SupportDialogFragment();
            C35966w1.a(supportDialogFragment, -1, new C8875a(str, l12, str2, str3, str4, str5, str6));
            return supportDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: SupportDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SupportDialogFragment.f292497k0;
            SupportDialogFragment.this.f5().accept(AbstractC49803a.c.f442280a);
            return G0.f406611a;
        }
    }

    /* compiled from: SupportDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<AbstractC49805c, G0> {
        @Override // Y41.l
        public final G0 invoke(AbstractC49805c abstractC49805c) {
            AbstractC49805c abstractC49805c2 = abstractC49805c;
            SupportDialogFragment supportDialogFragment = (SupportDialogFragment) this.receiver;
            a aVar = SupportDialogFragment.f292497k0;
            supportDialogFragment.getClass();
            if (abstractC49805c2 instanceof AbstractC49805c.C12851c) {
                supportDialogFragment.dismiss();
            } else if (abstractC49805c2 instanceof AbstractC49805c.a) {
                com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, (com.avito.android.lib.design.bottom_sheet.d) supportDialogFragment.getDialog(), com.avito.android.printable_text.b.c(R.string.open_chat_error, new Serializable[0]), null, new f.c(new IllegalStateException("1/gig/worker/support error")), 0, ToastBarPosition.f181046d, 942);
            } else if (abstractC49805c2 instanceof AbstractC49805c.b) {
                supportDialogFragment.f5().accept(new AbstractC49803a.d(((AbstractC49805c.b) abstractC49805c2).f442287a));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SupportDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LxA0/d;", "it", "Lkotlin/G0;", "invoke", "(LxA0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<C49806d, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C49806d c49806d) {
            C49806d c49806d2 = c49806d;
            com.avito.android.support_bottom_sheet.ui.b bVar = SupportDialogFragment.this.f292500j0;
            if (bVar != null) {
                bVar.f292518a.setState(c49806d2.f442289a);
                bVar.f292519b.setState(c49806d2.f442290b);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SupportDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SupportDialogFragment.f292497k0;
            SupportDialogFragment.this.f5().accept(AbstractC49803a.b.f442279a);
            return G0.f406611a;
        }
    }

    /* compiled from: SupportDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SupportDialogFragment.f292497k0;
            SupportDialogFragment.this.f5().accept(AbstractC49803a.C12849a.f442278a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f292512l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f292512l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f292512l);
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
            return SupportDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f292514l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f292514l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f292514l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f292515l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f292515l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f292515l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f292516l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f292516l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f292516l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SupportDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/support_bottom_sheet/mvi/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/support_bottom_sheet/mvi/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<n> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final n invoke() {
            o oVar = SupportDialogFragment.this.f292498h0;
            if (oVar == null) {
                oVar = null;
            }
            return (n) oVar.get();
        }
    }

    public SupportDialogFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f292499i0 = new O0(m0.f406844a.b(n.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        b.a aVarA = com.avito.android.support_bottom_sheet.di.a.a();
        com.avito.android.support_bottom_sheet.di.d dVar = (com.avito.android.support_bottom_sheet.di.d) C29972i.a(C29972i.b(this), com.avito.android.support_bottom_sheet.di.d.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EXTRA_CHAT_ACTION_TITLE") : null;
        if (string == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("EXTRA_CHAT_ACTION_SUBTITLE") : null;
        if (string2 == null) {
            string2 = "";
        }
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("EXTRA_PHONE_ACTION_TITLE") : null;
        if (string3 == null) {
            string3 = "";
        }
        Bundle arguments4 = getArguments();
        String string4 = arguments4 != null ? arguments4.getString("EXTRA_PHONE_ACTION_SUBTITLE") : null;
        if (string4 == null) {
            string4 = "";
        }
        Bundle arguments5 = getArguments();
        String string5 = arguments5 != null ? arguments5.getString("EXTRA_SUPPORT_PHONE") : null;
        if (string5 == null) {
            string5 = "";
        }
        Bundle arguments6 = getArguments();
        String string6 = arguments6 != null ? arguments6.getString("EXTRA_SCREEN_TAG") : null;
        if (string6 == null) {
            string6 = "";
        }
        Bundle arguments7 = getArguments();
        aVarA.a(dVar, interfaceC39417aB, string, string2, string3, string4, string5, string6, arguments7 != null ? Long.valueOf(arguments7.getLong("EXTRA_SLOT_ID")) : null, new e(), new f()).a(this);
    }

    public final n f5() {
        return (n) this.f292499i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.setContentView(R.layout.gig_support_bottom_sheet_dialog_fragment);
        dVar.f178527u = true;
        dVar.R(new b());
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        this.f292500j0 = new com.avito.android.support_bottom_sheet.ui.b(dVar);
        com.avito.android.arch.mvi.android.f.a(f5(), dVar, Lifecycle.State.f46682e, new c(1, this, SupportDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/support_bottom_sheet/models/SupportDialogOneTimeEvent;)V", 0), new d());
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f292500j0 = null;
    }
}
