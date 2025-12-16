package com.avito.android.messenger.conversation.mvi.send;

import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: Observables.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Object;)V", "com/avito/android/util/rx3/Q", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.s0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32236s0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194554b;

    public C32236s0(D d12) {
        this.f194554b = d12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(@Y61.k T t12) {
        kotlin.Q q12 = (kotlin.Q) t12;
        arrow.core.Y0 y02 = (arrow.core.Y0) q12.f406619b;
        String str = (String) q12.f406620c;
        com.avito.android.persistence.messenger.P0 p02 = (com.avito.android.persistence.messenger.P0) y02.c();
        String str2 = p02 != null ? p02.f215280d : null;
        if (str2 == null || C43066x.K(str2)) {
            return;
        }
        this.f194554b.f194199b0.c(new com.avito.android.messenger.analytics.g0(str));
    }
}
