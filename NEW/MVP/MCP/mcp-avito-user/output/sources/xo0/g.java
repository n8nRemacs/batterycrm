package xo0;

import To.InterfaceC15383a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.safety.tfa_enable_confirm.code_check.interactor.l;
import com.avito.android.safety.tfa_enable_confirm.code_check.interactor.r;
import com.squareup.anvil.annotations.ContributesBinding;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Y1;

/* compiled from: TfaEnableCodeCheckScreenBuilder.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo0/g;", "Lxo0/f;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.safety.tfa_enable_confirm.code_check.interactor.f f442656a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f442657b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final r f442658c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y1<InterfaceC15383a> f442659d;

    @Inject
    public g(@k com.avito.android.safety.tfa_enable_confirm.code_check.interactor.f fVar, @k l lVar, @k r rVar, @com.avito.android.code_check_public.g @k Y1<InterfaceC15383a> y12) {
        this.f442656a = fVar;
        this.f442657b = lVar;
        this.f442658c = rVar;
        this.f442659d = y12;
    }

    @Override // xo0.f
    @k
    public final a.InterfaceC3494a.d a() {
        a.InterfaceC3494a.d dVarC = c(b(new a.InterfaceC3494a.C3495a(null, 1, null)));
        a.InterfaceC3494a.d dVarB = b(c(new a.InterfaceC3494a.C3495a(null, 1, null)));
        a.InterfaceC3494a.d dVar = new a.InterfaceC3494a.d(new PhoneList("TfaEnableSelectPhone", new com.avito.android.code_check_public.screen.i(dVarB, new a.InterfaceC3494a.C3495a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.InterfaceC3494a.C3495a(null, 1, null), AppbarNavigationIcon.f119297b, null, 4, null), C42756l.l0(new a.InterfaceC3494a.d[]{dVarC, dVarB})), null, new PhoneList.b(com.avito.android.printable_text.b.c(R.string.tfa_enable_code_check_select_phone_title, new Serializable[0]), null, null, new org.webrtc.h(15), com.avito.android.printable_text.b.c(R.string.tfa_enable_code_check_select_phone_search_hint, new Serializable[0]), null, new PhoneList.a(com.avito.android.printable_text.b.c(R.string.tfa_enable_code_check_select_phone_empty_search, new Serializable[0]), dVarC, null), null, false, 4, null), this.f442657b, null, null, 36, null), false, null, 6, null);
        return new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.g("TfaEnablePreRequest", new com.avito.android.code_check_public.screen.i(null, new a.b.C3496a(null, 1, null), null, C42756l.l0(new a.InterfaceC3494a.d[]{dVarB, dVarC, dVar}), 1, null), null, this.f442658c.a(dVar, dVarB, dVarC), null, 20, null), false, null, 6, null);
    }

    public final a.InterfaceC3494a.d b(com.avito.android.code_check_public.a aVar) {
        String str = aVar instanceof a.InterfaceC3494a.C3495a ? "TfaEnableConfirmMany" : "TfaEnableConfirmSingle";
        a.b.C3497b c3497b = new a.b.C3497b(null, null, null, null, null, 31, null);
        a.InterfaceC3494a.C3495a c3495a = new a.InterfaceC3494a.C3495a(null, 1, null);
        com.avito.android.code_check_public.screen.b bVar = new com.avito.android.code_check_public.screen.b(new a.InterfaceC3494a.C3495a(null, 1, null), AppbarNavigationIcon.f119297b, new com.avito.android.code_check_public.screen.a(com.avito.android.printable_text.b.c(R.string.tfa_enable_code_check_code_confirm_change_number, new Serializable[0]), aVar));
        Set<com.avito.android.code_check_public.a> setSingleton = Collections.singleton(aVar);
        ArrayList arrayList = new ArrayList();
        for (com.avito.android.code_check_public.a aVar2 : setSingleton) {
            a.InterfaceC3494a.d dVar = aVar2 instanceof a.InterfaceC3494a.d ? (a.InterfaceC3494a.d) aVar2 : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.c(str, new com.avito.android.code_check_public.screen.i(c3497b, c3495a, bVar, C42745f0.P0(arrayList)), null, new c.a(com.avito.android.printable_text.b.c(R.string.tfa_enable_code_check_code_confirm_title, new Serializable[0]), null, new c.d.b(com.avito.android.printable_text.b.c(R.string.tfa_enable_code_check_code_confirm_subtitle, new Serializable[0]), new org.webrtc.h(13)), com.avito.android.printable_text.b.c(R.string.tfa_enable_code_check_code_confirm_input_hint, new Serializable[0]), new org.webrtc.h(14), null, com.avito.android.printable_text.b.c(R.string.tfa_enable_code_check_code_confirm_resend_timer, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.tfa_enable_code_check_code_confirm_continue, new Serializable[0]), 34, null), this.f442656a, this.f442657b, this.f442659d, null, 4, null), false, null, 6, null);
    }

    public final a.InterfaceC3494a.d c(com.avito.android.code_check_public.a aVar) {
        String str = aVar instanceof a.InterfaceC3494a.C3495a ? "TfaEnableNewPhoneMany" : "TfaEnableNewPhoneSingle";
        a.InterfaceC3494a.C3495a c3495a = new a.InterfaceC3494a.C3495a(null, 1, null);
        com.avito.android.code_check_public.screen.b bVar = new com.avito.android.code_check_public.screen.b(new a.InterfaceC3494a.C3495a(null, 1, null), AppbarNavigationIcon.f119297b, null, 4, null);
        Set<com.avito.android.code_check_public.a> setSingleton = Collections.singleton(aVar);
        ArrayList arrayList = new ArrayList();
        for (com.avito.android.code_check_public.a aVar2 : setSingleton) {
            a.InterfaceC3494a.d dVar = aVar2 instanceof a.InterfaceC3494a.d ? (a.InterfaceC3494a.d) aVar2 : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.d(str, new com.avito.android.code_check_public.screen.i(aVar, c3495a, bVar, C42745f0.P0(arrayList)), null, this.f442657b, new d.a(com.avito.android.printable_text.b.c(R.string.tfa_enable_code_check_new_phone_title, new Serializable[0]), null, null, com.avito.android.printable_text.b.c(R.string.tfa_enable_code_check_new_phone_continue, new Serializable[0]), null, null, null, null, null, true, 454, null), null, null, 36, null), false, null, 6, null);
    }
}
