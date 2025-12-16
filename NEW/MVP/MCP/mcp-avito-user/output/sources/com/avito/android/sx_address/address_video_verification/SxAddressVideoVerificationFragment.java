package com.avito.android.sx_address.address_video_verification;

import BA0.a;
import BA0.c;
import Cd.r;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C23060r0;
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
import com.avito.android.printable_text.PrintableText;
import com.avito.android.sx_address.SxAddressVideoVerificationParams;
import com.avito.android.sx_address.address_video_verification.b;
import com.avito.android.sx_address.address_video_verification.mvi.entity.SxAddressVideoVerificationState;
import com.avito.android.sx_address.address_video_verification.view.j;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35845m2;
import java.util.ArrayList;
import java.util.List;
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
import z1.AbstractC50339a;

/* compiled from: SxAddressVideoVerificationFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/SxAddressVideoVerificationFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SxAddressVideoVerificationFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f292558s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public b.a f292559n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f292560o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.sx_address.address_video_verification.view.d f292561p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f292562q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public com.avito.android.sx_address.address_video_verification.view.i f292563r0;

    /* compiled from: SxAddressVideoVerificationFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/SxAddressVideoVerificationFragment$a;", "", "<init>", "()V", "", "REQ_FILE_PICKER", "I", "", "SX_ADDRESS_VIDEO_VERIFICATION_PARAMS_KEY", "Ljava/lang/String;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SxAddressVideoVerificationFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<BA0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(BA0.c cVar) {
            com.avito.android.sx_address.address_video_verification.view.i iVar;
            BA0.c cVar2 = cVar;
            SxAddressVideoVerificationFragment sxAddressVideoVerificationFragment = (SxAddressVideoVerificationFragment) this.receiver;
            a aVar = SxAddressVideoVerificationFragment.f292558s0;
            sxAddressVideoVerificationFragment.getClass();
            if (cVar2 instanceof c.a) {
                ActivityC22955m activityC22955mRequireActivity = sxAddressVideoVerificationFragment.requireActivity();
                activityC22955mRequireActivity.setResult(0);
                activityC22955mRequireActivity.finish();
            } else if (cVar2 instanceof c.C0044c) {
                com.avito.android.sx_address.address_video_verification.view.i iVar2 = sxAddressVideoVerificationFragment.f292563r0;
                if (iVar2 != null) {
                    iVar2.f292750d.getViewTreeObserver().addOnGlobalLayoutListener(new j(iVar2));
                }
            } else if (cVar2 instanceof c.b) {
                String[] strArr = (String[]) ((c.b) cVar2).f1225a.toArray(new String[0]);
                InterfaceC35845m2 interfaceC35845m2 = sxAddressVideoVerificationFragment.f292562q0;
                if (interfaceC35845m2 == null) {
                    interfaceC35845m2 = null;
                }
                sxAddressVideoVerificationFragment.startActivityForResult(interfaceC35845m2.s(strArr), 2);
            } else if (cVar2 instanceof c.e) {
                ActivityC22955m activityC22955mRequireActivity2 = sxAddressVideoVerificationFragment.requireActivity();
                activityC22955mRequireActivity2.setResult(-1);
                activityC22955mRequireActivity2.finish();
            } else if ((cVar2 instanceof c.d) && (iVar = sxAddressVideoVerificationFragment.f292563r0) != null) {
                com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(((c.d) cVar2).f1227a);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar3, iVar.f292749c, printableTextF, null, null, null, f.c.a.b(), 2750, null, null, false, false, null, null, 4046);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SxAddressVideoVerificationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<SxAddressVideoVerificationState, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SxAddressVideoVerificationState sxAddressVideoVerificationState) {
            SxAddressVideoVerificationState sxAddressVideoVerificationState2 = sxAddressVideoVerificationState;
            com.avito.android.sx_address.address_video_verification.view.i iVar = SxAddressVideoVerificationFragment.this.f292563r0;
            if (iVar != null) {
                iVar.b(sxAddressVideoVerificationState2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f292566m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f292566m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(SxAddressVideoVerificationFragment.this, this.f292566m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SxAddressVideoVerificationFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f292568l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f292568l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f292568l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f292569l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f292569l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f292569l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f292570l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f292570l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f292570l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SxAddressVideoVerificationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/sx_address/address_video_verification/b;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/sx_address/address_video_verification/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<C23060r0, com.avito.android.sx_address.address_video_verification.b> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.sx_address.address_video_verification.b invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            b.a aVar = SxAddressVideoVerificationFragment.this.f292559n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public SxAddressVideoVerificationFragment() {
        super(R.layout.fragment_sx_address_video_verification);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f292560o0 = new O0(m0.f406844a.b(com.avito.android.sx_address.address_video_verification.b.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @l Intent intent) {
        Uri data;
        List<Uri> listA;
        super.onActivityResult(i12, i13, intent);
        if (i13 == -1 && i12 == 2) {
            ArrayList arrayList = new ArrayList();
            if (intent != null && (listA = C35974x2.a(intent)) != null) {
                arrayList.addAll(listA);
            }
            if (arrayList.isEmpty() && intent != null && (data = intent.getData()) != null) {
                arrayList.add(data);
            }
            ((com.avito.android.sx_address.address_video_verification.b) this.f292560o0.getValue()).accept(new a.e(arrayList));
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.sx_address.address_video_verification.view.d dVar = this.f292561p0;
        if (dVar == null) {
            dVar = null;
        }
        com.avito.android.sx_address.address_video_verification.view.i iVar = new com.avito.android.sx_address.address_video_verification.view.i(view, dVar);
        this.f292563r0 = iVar;
        O0 o02 = this.f292560o0;
        iVar.a((com.avito.android.sx_address.address_video_verification.b) o02.getValue());
        com.avito.android.arch.mvi.android.f.a((com.avito.android.sx_address.address_video_verification.b) o02.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46681d, new b(1, this, SxAddressVideoVerificationFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationOneTimeEvent;)V", 0), new c());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            SxAddressVideoVerificationParams sxAddressVideoVerificationParams = (SxAddressVideoVerificationParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("sx_address_video_verification_params_key", SxAddressVideoVerificationParams.class) : arguments.getParcelable("sx_address_video_verification_params_key"));
            if (sxAddressVideoVerificationParams != null) {
                com.avito.android.sx_address.address_video_verification.di.a.a().a(sxAddressVideoVerificationParams, getResources(), requireContext().getContentResolver(), (com.avito.android.sx_address.address_video_verification.di.c) C29972i.a(C29972i.b(this), com.avito.android.sx_address.address_video_verification.di.c.class)).a(this);
                return;
            }
        }
        throw new IllegalStateException("Arguments is not specified");
    }
}
