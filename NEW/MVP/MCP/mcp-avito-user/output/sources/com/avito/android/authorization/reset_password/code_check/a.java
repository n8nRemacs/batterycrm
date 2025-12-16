package com.avito.android.authorization.reset_password.code_check;

import Ju.InterfaceC14249c;
import To.InterfaceC15383a;
import Y41.p;
import com.avito.android.authorization.reset_password.code_check.ResetPasswordCodeCheckResult;
import com.avito.android.code_check_public.a;
import com.avito.android.deep_linking.links.auth.EmailUnavailableReasonLink;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kv.C43501a;

/* compiled from: ResetPasswordCodeCheckScenarioBuilder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class a extends C42801a implements p<C43501a, Continuation<? super InterfaceC15383a>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC15383a> continuation) {
        ((c) this.receiver).getClass();
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        if (interfaceC14249c instanceof EmailUnavailableReasonLink.b.C4025b) {
            return new InterfaceC15383a.e(new a.b.C3497b(new To.b(ResetPasswordCodeCheckResult.CancelByAutoRecovery.f94109b), null, null, null, null, 30, null));
        }
        if (interfaceC14249c instanceof EmailUnavailableReasonLink.b.a) {
            return new InterfaceC15383a.e(new a.b.C3496a(null, 1, null));
        }
        return null;
    }
}
