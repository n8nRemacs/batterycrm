package com.avito.android.code_check.phone_request.mvi;

import com.avito.android.code_check.phone_request.mvi.entity.PhoneRequestInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhoneRequestBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_request/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestInternalAction;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements com.avito.android.arch.mvi.b<PhoneRequestInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<To.d> f119122a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.code_check.d f119123b;

    @Inject
    public h(@Y61.k InterfaceC43160i<To.d> interfaceC43160i, @Y61.k com.avito.android.code_check.d dVar) {
        this.f119122a = interfaceC43160i;
        this.f119123b = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PhoneRequestInternalAction> a() {
        InterfaceC43160i<To.d> interfaceC43160i = this.f119122a;
        com.avito.android.code_check.d dVar = this.f119123b;
        C43152f0 c43152f0A = f.a(interfaceC43160i, dVar);
        String strA = dVar.G3().a();
        return C43175k.N(c43152f0A, strA != null ? new C43210w(new PhoneRequestInternalAction.SetPhone(strA)) : C43175k.w());
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
