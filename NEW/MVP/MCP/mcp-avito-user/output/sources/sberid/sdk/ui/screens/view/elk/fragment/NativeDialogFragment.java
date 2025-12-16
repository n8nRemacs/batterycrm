package sberid.sdk.ui.screens.view.elk.fragment;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.h;
import gc1.InterfaceC40658b;
import ic1.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.json.AbstractC43443a;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsberid/sdk/ui/screens/view/elk/fragment/NativeDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "a", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NativeDialogFragment extends BottomSheetDialogFragment {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public static final a f437870h0 = new a(null);

    /* renamed from: f0, reason: collision with root package name */
    @k
    public N f437871f0;

    /* renamed from: g0, reason: collision with root package name */
    @l
    public InterfaceC40658b.k f437872g0;

    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsberid/sdk/ui/screens/view/elk/fragment/NativeDialogFragment$a;", "", "<init>", "()V", "", "elkDataRootTeg", "Ljava/lang/String;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                T.a aVar2 = T.f39320b;
                a13.I(-728886447);
                long jD2 = V.d(d.a(a13) ? 4280756007L : 4294967295L);
                a13.O();
                I81.b.a(androidx.compose.foundation.A.b(aVar, jD2, Y0.f39346a), 0L, 0.0f, true, 0L, r.b(a13, 1702219546, new sberid.sdk.ui.screens.view.elk.fragment.a(NativeDialogFragment.this)), a13, 199680, 22);
            }
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f437874l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public /* synthetic */ NativeDialogFragment(C42822w c42822w) {
        this();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.BottomSheetDialogTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.Z$b] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        String string;
        Object bVar;
        InterfaceC40658b.k bVar2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("NativeDialogFragmentTag")) != null) {
            try {
                int i12 = Z.f406624c;
                AbstractC43443a.C11757a c11757a = AbstractC43443a.f412954d;
                c11757a.getClass();
                bVar = c11757a.d(string, L51.a.a(InterfaceC40658b.k.INSTANCE.serializer()));
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            boolean z12 = bVar instanceof Z.b;
            Object obj = bVar;
            if (z12) {
                obj = null;
            }
            if (z12 || obj == null) {
                InterfaceC40658b.k.class.toString();
            }
            if (obj == null) {
                try {
                    bVar2 = Dc1.c.f3297a.d(InterfaceC40658b.k.class, string);
                } catch (Throwable th3) {
                    int i14 = Z.f406624c;
                    bVar2 = new Z.b(th3);
                }
                boolean z13 = bVar2 instanceof Z.b;
                kVar = z13 ? null : bVar2;
                if (z13 || kVar == null) {
                    InterfaceC40658b.k.class.toString();
                }
                obj = kVar;
            }
            kVar = (InterfaceC40658b.k) obj;
        }
        this.f437872g0 = kVar;
        if (kVar == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(343887369, new b(), true));
        return composeView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f437871f0.invoke();
        onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        h hVar = dialog instanceof h ? (h) dialog : null;
        if (hVar != null) {
            hVar.s().b(3);
            hVar.s().f355973J = true;
        }
    }

    private NativeDialogFragment() {
        this.f437871f0 = c.f437874l;
    }
}
