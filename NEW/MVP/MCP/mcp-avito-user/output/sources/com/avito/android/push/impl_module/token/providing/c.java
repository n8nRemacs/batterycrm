package com.avito.android.push.impl_module.token.providing;

import com.avito.android.push.impl_module.token.providing.CompositePushTokenProviderException;
import fg0.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import l41.o;

/* compiled from: CompositePushTokenProviderImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfg0/f;", "kotlin.jvm.PlatformType", "providerResult", "Lcom/avito/android/push/PushToken;", "apply", "(Lfg0/f;)Lcom/avito/android/push/PushToken;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final c<T, R> f245985b = new c<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        fg0.f fVar = (fg0.f) obj;
        if (fVar instanceof f.c) {
            return ((f.c) fVar).f396040a;
        }
        if (fVar instanceof f.a) {
            throw new CompositePushTokenProviderException.PushProviderError(((f.a) fVar).f396038a);
        }
        if (L.f(fVar, f.b.f396039a)) {
            throw new CompositePushTokenProviderException.NoPushServiceError();
        }
        throw new NoWhenBranchMatchedException();
    }
}
