package com.avito.android.analytics.screens.utils;

import com.avito.android.analytics.screens.J;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CoroutineTracker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.analytics.screens.utils.CoroutineTrackerKt", f = "CoroutineTracker.kt", i = {0, 0, 0, 0, 0, 0}, l = {75}, m = "loadWithTrackerTyped", n = {"tracker", "contentType", "loadingType", "drawResult", "drawError", "drawTypedError"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* renamed from: com.avito.android.analytics.screens.utils.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28506c<R, T extends TypedResult<R>> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f90966q;

    /* renamed from: r, reason: collision with root package name */
    public int f90967r;

    public C28506c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f90966q = obj;
        this.f90967r = (this.f90967r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f90967r;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            C42729a0.b(obj);
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                D.e(null, null, null, new C28507d(typedResult, null));
            } else if (typedResult instanceof TypedResult.Error) {
                D.d(null, null, new J.a(((TypedResult.Error) typedResult).getError()), null, new C28508e(typedResult, null));
            }
            return G0.f406611a;
        } catch (Throwable th2) {
            D.d(null, null, new J.a(th2), null, new f(null, th2));
            return G0.f406611a;
        }
    }
}
