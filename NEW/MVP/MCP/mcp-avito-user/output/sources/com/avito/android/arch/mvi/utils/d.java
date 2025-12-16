package com.avito.android.arch.mvi.utils;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: EitherExt.kt */
@s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "com.avito.android.arch.mvi.utils.EitherExtKt", f = "EitherExt.kt", i = {0}, l = {57}, m = "onFailureSuspend", n = {"$this$onFailureSuspend"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class d<F, S> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f92029q;

    /* renamed from: r, reason: collision with root package name */
    public int f92030r;

    public d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f92029q = obj;
        this.f92030r = (this.f92030r | BeduinInputModel.MIN_TEXT_VERSION) - BeduinInputModel.MIN_TEXT_VERSION;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f92030r;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw new NoWhenBranchMatchedException();
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return null;
    }
}
