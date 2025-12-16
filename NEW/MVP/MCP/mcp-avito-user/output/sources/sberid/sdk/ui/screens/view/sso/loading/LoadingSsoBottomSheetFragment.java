package sberid.sdk.ui.screens.view.sso.loading;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.fragment.app.Fragment;
import androidx.view.S0;
import g71.C40542a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import p31.C46888e;
import p31.f;
import sberid.sdk.ui.screens.view.defaults.SIDBottomSheetDialogFragment;

@s0
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lsberid/sdk/ui/screens/view/sso/loading/LoadingSsoBottomSheetFragment;", "Lsberid/sdk/ui/screens/view/defaults/SIDBottomSheetDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "onCancel", "(Landroid/content/DialogInterface;)V", "Lp31/f;", "vm$delegate", "Lkotlin/C;", "getVm", "()Lp31/f;", "vm", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class LoadingSsoBottomSheetFragment extends SIDBottomSheetDialogFragment {

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C vm = C42727D.b(LazyThreadSafetyMode.f406616d, new c(new b()));

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                I81.b.a(null, 0L, 0.0f, false, 0L, r.b(a13, 973327953, new sberid.sdk.ui.screens.view.sso.loading.b(LoadingSsoBottomSheetFragment.this)), a13, 196608, 31);
            }
            return G0.f406611a;
        }
    }

    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "org/koin/androidx/viewmodel/ext/android/z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<Fragment> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return LoadingSsoBottomSheetFragment.this;
        }
    }

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/M0;", "T", "invoke", "()Landroidx/lifecycle/M0;", "org/koin/androidx/viewmodel/ext/android/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<f> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f437879m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f437879m = bVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.M0, p31.f] */
        @Override // Y41.a
        public final f invoke() {
            S0 f42820b = LoadingSsoBottomSheetFragment.this.getF42820b();
            LoadingSsoBottomSheetFragment loadingSsoBottomSheetFragment = LoadingSsoBottomSheetFragment.this;
            return org.koin.androidx.viewmodel.b.a(m0.f406844a.b(f.class), f42820b, null, loadingSsoBottomSheetFragment.getDefaultViewModelCreationExtras(), C40542a.a(loadingSsoBottomSheetFragment));
        }
    }

    private final f getVm() {
        return (f) this.vm.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@k DialogInterface dialog) {
        super.onCancel(dialog);
        f vm2 = getVm();
        int i12 = C46888e.f428166a;
        vm2.getClass();
        N0 n02 = vm2.f428167E.f4110i;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup container, @l Bundle savedInstanceState) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(-1348981950, new a(), true));
        return composeView;
    }
}
