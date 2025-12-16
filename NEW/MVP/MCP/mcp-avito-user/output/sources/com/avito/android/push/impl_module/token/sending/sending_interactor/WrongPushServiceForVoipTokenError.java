package com.avito.android.push.impl_module.token.sending.sending_interactor;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendPushTokenInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/sending_interactor/WrongPushServiceForVoipTokenError;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class WrongPushServiceForVoipTokenError extends IllegalArgumentException {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f246051b;

    public WrongPushServiceForVoipTokenError(@k String str) {
        super("wrong_push_service_for_voip_".concat(str));
        this.f246051b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WrongPushServiceForVoipTokenError) && L.f(this.f246051b, ((WrongPushServiceForVoipTokenError) obj).f246051b);
    }

    public final int hashCode() {
        return this.f246051b.hashCode();
    }

    @Override // java.lang.Throwable
    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("WrongPushServiceForVoipTokenError(service="), this.f246051b, ')');
    }
}
