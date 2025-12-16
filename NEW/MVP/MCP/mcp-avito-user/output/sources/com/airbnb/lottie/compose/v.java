package com.airbnb.lottie.compose;

import com.airbnb.lottie.C27291k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LottieCompositionResult.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.LottieCompositionResultKt", f = "LottieCompositionResult.kt", i = {}, l = {85}, m = "awaitOrNull", n = {}, s = {})
/* loaded from: classes10.dex */
final class v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f59555q;

    /* renamed from: r, reason: collision with root package name */
    public int f59556r;

    public v() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        v vVar;
        this.f59555q = obj;
        int i12 = this.f59556r | BeduinInputModel.MIN_TEXT_VERSION;
        this.f59556r = i12;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f59556r = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            vVar = this;
        } else {
            vVar = new v(this);
        }
        Object obj2 = vVar.f59555q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = vVar.f59556r;
        try {
            if (i13 == 0) {
                C42729a0.b(obj2);
                vVar.f59556r = 1;
                throw null;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj2);
            return (C27291k) obj2;
        } catch (Throwable unused) {
            return null;
        }
    }
}
