package com.avito.android.bxcontent.mvi.entity;

import android.content.Context;
import android.os.Parcel;
import android.view.View;
import androidx.compose.ui.platform.C22501m2;
import androidx.core.graphics.C22771k;
import androidx.core.view.M;
import bU.InterfaceC25560d;
import bj.InterfaceC25659b;
import com.akita.compose.component.gradient.linear.GradientLinearStyle;
import com.avito.android.J0;
import com.avito.android.R;
import com.avito.android.app.task.X1;
import com.avito.android.code_confirmation.code_confirmation.j0;
import com.avito.android.grid.GridElementType;
import com.avito.android.home.HomeActivity;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43187o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class f implements com.avito.android.code_check_public.c, InterfaceC37022e, InterfaceC37023f, X1, M, com.avito.avcalls.android.network_test.k, com.avito.avcalls.network_test.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f112200b;

    public /* synthetic */ f(int i12) {
        this.f112200b = i12;
    }

    public static int b(GridElementType gridElementType, int i12, int i13) {
        return (gridElementType.hashCode() + i12) * i13;
    }

    public static int c(Class cls, Parcel parcel, LinkedHashMap linkedHashMap, String str, int i12, int i13) {
        linkedHashMap.put(str, parcel.readParcelable(cls.getClassLoader()));
        return i12 + i13;
    }

    public static androidx.compose.ui.v d(int i12, androidx.compose.ui.v vVar, String str) {
        return C22501m2.a(vVar, str + i12);
    }

    public static InterfaceC25560d.b e(GradientLinearStyle gradientLinearStyle, androidx.compose.runtime.A a12) {
        InterfaceC25560d.b bVar = new InterfaceC25560d.b(gradientLinearStyle);
        a12.h();
        return bVar;
    }

    public static InterfaceC25560d.c f(com.akita.compose.component.gradient.radial.c cVar, androidx.compose.runtime.A a12) {
        InterfaceC25560d.c cVar2 = new InterfaceC25560d.c(cVar);
        a12.h();
        return cVar2;
    }

    public static com.akita.compose.component.list_item.s g(com.akita.compose.theme.re23.b bVar, androidx.compose.runtime.B b12) {
        bVar.getClass();
        return com.akita.compose.theme.re23.b.m(b12).b();
    }

    public static com.avito.android.beduin.common.component.adapter.a i(int i12, InterfaceC25659b interfaceC25659b) {
        return interfaceC25659b.b(Integer.valueOf(y6.b(i12)));
    }

    public static String j(androidx.compose.runtime.B b12, int i12, int i13, androidx.compose.runtime.B b13, boolean z12) {
        b12.C(i12);
        String strC = u0.i.c(b13, i13);
        b12.X(z12);
        return strC;
    }

    public static String k(J0 j02, StringBuilder sb2) {
        sb2.append(j02.a());
        return sb2.toString();
    }

    public static String l(String str, boolean z12) {
        return str + z12;
    }

    public static String m(StringBuilder sb2, SearchParams searchParams, char c12) {
        sb2.append(searchParams);
        sb2.append(c12);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, Date date, char c12) {
        sb2.append(date);
        sb2.append(c12);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Iterator o(Object obj, Parcel parcel) {
        parcel.writeInt(obj.size());
        return obj.entrySet().iterator();
    }

    public static Map p(String str, CallInit callInit, Map map) {
        return P0.l(map, new Q(str, callInit));
    }

    public static NoWhenBranchMatchedException q(int i12, androidx.compose.runtime.B b12, boolean z12) {
        b12.C(i12);
        b12.X(z12);
        return new NoWhenBranchMatchedException();
    }

    public static C0 r(Iterable iterable) {
        return C43175k.D(new C43187o(iterable));
    }

    public static void s(String str, int i12, C42822w c42822w, IacActionProcessing iacActionProcessing, IacActionOutput iacActionOutput) {
        iacActionProcessing.plusAssign(iacActionOutput, new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.s(str, i12, c42822w));
    }

    public static void t(String str, Throwable th2, V2 v22, Throwable th3) {
        v22.e(str + th2, th3);
    }

    public void a(String str) {
        switch (this.f112200b) {
            case 23:
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AvCallsNetworkTest", str, null);
                break;
            default:
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AvCallsNetworkTest", str, null);
                break;
        }
    }

    @Override // androidx.core.view.M
    public androidx.core.view.J0 h(View view, androidx.core.view.J0 j02) {
        switch (this.f112200b) {
            case 20:
                BottomNavigationFragment.a aVar = BottomNavigationFragment.f162243V0;
                com.avito.android.lib.util.i.f181373a.getClass();
                C22771k c22771kE = j02.e(com.avito.android.lib.util.i.f181375c);
                view.setPadding(c22771kE.f44775a, view.getPaddingTop(), c22771kE.f44777c, view.getPaddingBottom());
                D6.c(view, null, null, null, Integer.valueOf(c22771kE.f44778d), 7);
                break;
            case 21:
                BottomNavigationFragment.a aVar2 = BottomNavigationFragment.f162243V0;
                com.avito.android.lib.util.i.f181373a.getClass();
                C22771k c22771kE2 = j02.e(com.avito.android.lib.util.i.f181375c);
                view.setPadding(c22771kE2.f44775a, view.getPaddingTop(), c22771kE2.f44777c, view.getPaddingBottom());
                D6.c(view, null, null, null, Integer.valueOf(c22771kE2.f44778d), 7);
                break;
            default:
                BottomNavigationFragment.a aVar3 = BottomNavigationFragment.f162243V0;
                com.avito.android.lib.util.i.f181373a.getClass();
                C22771k c22771kE3 = j02.e(com.avito.android.lib.util.i.f181375c);
                view.setPadding(c22771kE3.f44775a, view.getPaddingTop(), c22771kE3.f44777c, view.getPaddingBottom());
                D6.c(view, null, null, null, Integer.valueOf(c22771kE3.f44778d), 7);
                break;
        }
        return j02;
    }

    @Override // com.avito.android.code_check_public.c
    public Object k0(Context context) {
        switch (this.f112200b) {
            case 6:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.code_check_code_subtitle_margin_top));
            case 7:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.code_check_code_input_margin_top));
            default:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.code_check_phone_input_margin_top));
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public void onComplete(Task task) {
        int i12 = j0.f119560e;
        V2.f318762a.g("CodeReceiver", "Sms retriever started");
    }

    @Override // com.google.android.gms.tasks.InterfaceC37023f
    public void onFailure(Exception exc) {
        switch (this.f112200b) {
            case 10:
                int i12 = j0.f119560e;
                V2.f318762a.d("CodeReceiver", "Failed to start sms retriever");
                break;
            default:
                int i13 = HomeActivity.f162176x;
                V2.f318762a.a("DEFAULT_TAG", "InAppUpdate: failure", exc);
                break;
        }
    }
}
