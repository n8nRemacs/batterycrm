package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.Z;

/* compiled from: rememberLottieComposition.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "kotlin.jvm.PlatformType", "e", "Lkotlin/G0;", "onResult", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class M<T> implements com.airbnb.lottie.E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f59397a;

    public M(kotlinx.coroutines.r rVar) {
        this.f59397a = rVar;
    }

    @Override // com.airbnb.lottie.E
    public final void onResult(Object obj) {
        Throwable th2 = (Throwable) obj;
        kotlinx.coroutines.r rVar = this.f59397a;
        if (rVar.v()) {
            return;
        }
        int i12 = Z.f406624c;
        rVar.resumeWith(new Z.b(th2));
    }
}
