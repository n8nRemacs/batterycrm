package com.avito.android.analytics.screens.utils;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CoroutineTracker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.analytics.screens.utils.CoroutineTrackerKt", f = "CoroutineTracker.kt", i = {0, 0, 0, 0, 0}, l = {21}, m = "asTrackable", n = {"tracker", "contentType", "loadingType", "onSuccess", "onError"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* renamed from: com.avito.android.analytics.screens.utils.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28504a<T, Success, Failure> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f90962q;

    /* renamed from: r, reason: collision with root package name */
    public int f90963r;

    public C28504a() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f90962q = obj;
        this.f90963r = (this.f90963r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f90963r;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            C42729a0.b(obj);
            ScreenPerformanceTracker.a.d(null, null, null, J.b.f90385a, null, 8);
            throw null;
        } catch (Throwable th2) {
            ScreenPerformanceTracker.a.d(null, null, null, new J.a(th2), null, 8);
            throw null;
        }
    }
}
