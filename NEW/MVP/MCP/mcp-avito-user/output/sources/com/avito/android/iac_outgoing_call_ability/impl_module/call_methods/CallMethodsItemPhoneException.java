package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: CallMethodsInteractorImpl.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/CallMethodsItemPhoneException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CallMethodsItemPhoneException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f168432b;

    public CallMethodsItemPhoneException(@l String str) {
        this.f168432b = str;
    }

    @Override // java.lang.Throwable
    @l
    public final String getMessage() {
        return this.f168432b;
    }
}
