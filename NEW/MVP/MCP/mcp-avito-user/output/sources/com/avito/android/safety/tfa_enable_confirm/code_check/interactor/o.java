package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import To.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import no0.InterfaceC44459b;

/* compiled from: TfaEnableCodeCheckPhoneRequestInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lno0/b;", "requestResult", "LTo/d;", "invoke", "(Lno0/b;)LTo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class o extends N implements Y41.l<InterfaceC44459b, To.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f258187l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str) {
        super(1);
        this.f258187l = str;
    }

    @Override // Y41.l
    public final To.d invoke(InterfaceC44459b interfaceC44459b) {
        InterfaceC44459b interfaceC44459b2 = interfaceC44459b;
        if (interfaceC44459b2 instanceof InterfaceC44459b.C12151b) {
            return new d.a(this.f258187l, ((InterfaceC44459b.C12151b) interfaceC44459b2).getTimer(), 5, null, 8, null);
        }
        if (!(interfaceC44459b2 instanceof InterfaceC44459b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        String phone = ((InterfaceC44459b.a) interfaceC44459b2).getMessages().getPhone();
        return new d.c.b(phone != null ? com.avito.android.printable_text.b.f(phone) : com.avito.android.code_check_public.k.a());
    }
}
