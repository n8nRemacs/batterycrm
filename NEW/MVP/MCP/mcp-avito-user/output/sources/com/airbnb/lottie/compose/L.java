package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.Z;

/* compiled from: rememberLottieComposition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "kotlin.jvm.PlatformType", "c", "Lkotlin/G0;", "onResult", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class L<T> implements com.airbnb.lottie.E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f59391a;

    public L(kotlinx.coroutines.r rVar) {
        this.f59391a = rVar;
    }

    @Override // com.airbnb.lottie.E
    public final void onResult(T t12) {
        kotlinx.coroutines.r rVar = this.f59391a;
        if (rVar.v()) {
            return;
        }
        int i12 = Z.f406624c;
        rVar.resumeWith(t12);
    }
}
