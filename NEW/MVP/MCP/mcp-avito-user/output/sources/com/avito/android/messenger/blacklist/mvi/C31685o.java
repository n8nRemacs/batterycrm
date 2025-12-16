package com.avito.android.messenger.blacklist.mvi;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.graphics.vector.C22295f;
import androidx.core.view.J0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.data.c0;
import com.avito.android.messenger.conversation.mvi.data.d0;
import com.avito.android.mortgage.person_form.suggestion.SuggestionFragment;
import com.avito.android.mortgage_calculator.MortgageCalculatorView;
import com.avito.android.mortgage_calculator.internal.S0;
import com.avito.android.pagination.mvi.InterfaceC32952a;
import com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment;
import com.avito.android.phone_confirmation.PhoneConfirmationActivity;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarView;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.c;
import com.avito.android.util.V2;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.google.android.exoplayer2.util.C36604u;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.Task;
import com.google.firebase.encoders.c;
import com.huawei.hms.adapter.internal.AvailableCode;
import iF.InterfaceC41278b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.U;
import qK0.C47313c;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.blacklist.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C31685o implements androidx.core.view.M, InterfaceC32952a, C47313c.a, InterfaceC37022e, InterfaceC37023f, com.avito.android.code_check_public.c, InterfaceC41278b, RecyclerView.h, c.b, com.avito.beduin.v2.interaction.network.parser.serializer.b, com.google.android.datatransport.i, C36604u.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f186482b;

    public /* synthetic */ C31685o(int i12) {
        this.f186482b = i12;
    }

    public static int f(com.avito.beduin.v2.theme.f fVar, int i12, int i13) {
        return (fVar.hashCode() + i12) * i13;
    }

    public static int g(com.avito.beduin.v2.theme.l lVar, int i12, int i13) {
        return (lVar.hashCode() + i12) * i13;
    }

    public static C22295f i(float f12, float f13) {
        C22295f c22295f = new C22295f();
        c22295f.j(f12, f13);
        return c22295f;
    }

    public static M0 j(StringBuilder sb2, String str, P0 p02, Class cls) {
        sb2.append(str);
        return p02.b(cls, sb2.toString());
    }

    public static InterfaceC36252b k(com.avito.beduin.v2.engine.core.z zVar, String str, List list) {
        InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336594a(), str, list);
        zVar.w(interfaceC36252bE);
        return interfaceC36252bE;
    }

    public static com.google.firebase.encoders.c l(com.google.firebase.encoders.proto.a aVar, c.b bVar) {
        bVar.b(aVar.a());
        return bVar.a();
    }

    public static com.jakewharton.rxrelay3.d m() {
        return new com.jakewharton.rxrelay3.c().M0();
    }

    public static C41828t n(d0 d0Var, String str, LinkedHashMap linkedHashMap, io.reactivex.rxjava3.internal.operators.completable.r rVar) {
        return rVar.t(new c0(d0Var, str, linkedHashMap));
    }

    public static String o(StringBuilder sb2, com.avito.beduin.v2.theme.f fVar, char c12) {
        sb2.append(fVar);
        sb2.append(c12);
        return sb2.toString();
    }

    public static void p(Class cls, StringBuilder sb2, char c12) {
        sb2.append(cls.getCanonicalName());
        sb2.append(c12);
    }

    public static void q(String str, ArrayList arrayList) {
        arrayList.add(Boxing.boxLong(Long.parseLong(str)));
    }

    public static void r(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }

    public static boolean s(androidx.compose.runtime.A a12, MortgageCalculatorView mortgageCalculatorView, int i12) {
        a12.h();
        S0 viewModel = mortgageCalculatorView.getViewModel();
        a12.C(i12);
        return a12.B(viewModel);
    }

    @Override // qK0.C47313c.a
    public void a(Object obj) {
        switch (this.f186482b) {
            case 8:
                CodeConfirmFragment.a aVar = CodeConfirmFragment.f212682G0;
                io.reactivex.rxjava3.internal.observers.y yVar = ((com.avito.android.lib.design.ticking_button.b) obj).f180944d;
                if (yVar != null) {
                    DisposableHelper.a(yVar);
                    break;
                }
                break;
            default:
                StrOrdersCalendarView strOrdersCalendarView = (StrOrdersCalendarView) obj;
                kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                U.b(strOrdersCalendarView.f290556P, null);
                RecyclerView recyclerView = strOrdersCalendarView.f290544D;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.setAdapter(null);
                RecyclerView recyclerView2 = strOrdersCalendarView.f290545E;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                recyclerView2.setAdapter(null);
                RecyclerView recyclerView3 = strOrdersCalendarView.f290543C;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                recyclerView3.setAdapter(null);
                break;
        }
    }

    @Override // iF.InterfaceC41278b
    public void c() {
        int i12 = com.avito.android.str_booking.ui.gallery.h.f286037f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e(int i12, int i13) {
        int i14 = StrOrdersCalendarView.f290540Q;
        return (i12 - i13) - 1;
    }

    @Override // androidx.core.view.M
    public J0 h(View view, J0 j02) {
        SuggestionFragment.a aVar = SuggestionFragment.f201353r0;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), j02.e(8).f44778d);
        return j02;
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public void invoke(Object obj) {
        com.google.android.exoplayer2.analytics.b bVar = (com.google.android.exoplayer2.analytics.b) obj;
        switch (this.f186482b) {
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                bVar.getClass();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                bVar.getClass();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    @Override // com.avito.android.code_check_public.c
    public Object k0(Context context) {
        return new AttributedText(context.getString(R.string.phone_request_subtitle), C42784z0.f406748b, 0, 4, null);
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public void onComplete(Task task) {
        switch (this.f186482b) {
            case 9:
                int i12 = PhoneConfirmationActivity.f215875t;
                V2.f318762a.g("PhoneConfirmationActivity", "Sms retriever started");
                break;
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC37023f
    public void onFailure(Exception exc) {
        int i12 = PhoneConfirmationActivity.f215875t;
        V2.f318762a.d("PhoneConfirmationActivity", "Failed to start sms retriever");
    }

    private final void t(Task task) {
    }

    @Override // com.google.android.datatransport.i
    public void b(Exception exc) {
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.host_view.c.b
    public void d(com.avito.android.user_adverts.root_screen.adverts_host.host_view.a aVar) {
    }
}
