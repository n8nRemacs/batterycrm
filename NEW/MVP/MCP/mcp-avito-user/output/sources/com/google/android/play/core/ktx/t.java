package com.google.android.play.core.ktx;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: com.google.android.play:review-ktx@@2.0.1 */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", f = "ReviewManagerKtx.kt", i = {}, l = {22}, m = "requestReview", n = {}, s = {})
/* loaded from: classes6.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f358605q;

    /* renamed from: r, reason: collision with root package name */
    public int f358606r;

    public t() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        t tVar;
        this.f358605q = obj;
        int i12 = this.f358606r | BeduinInputModel.MIN_TEXT_VERSION;
        this.f358606r = i12;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f358606r = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            tVar = this;
        } else {
            tVar = new t(this);
        }
        Object obj2 = tVar.f358605q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = tVar.f358606r;
        if (i13 == 0) {
            C42729a0.b(obj2);
            throw null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj2);
        return obj2;
    }
}
