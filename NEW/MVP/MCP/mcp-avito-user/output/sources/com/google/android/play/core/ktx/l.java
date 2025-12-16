package com.google.android.play.core.ktx;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: com.google.android.play:asset-delivery-ktx@@2.1.0 */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt", f = "AssetPackManagerKtx.kt", i = {}, l = {36}, m = "requestFetch", n = {}, s = {})
/* loaded from: classes6.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f358601q;

    /* renamed from: r, reason: collision with root package name */
    public int f358602r;

    public l() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        l lVar;
        this.f358601q = obj;
        int i12 = this.f358602r | BeduinInputModel.MIN_TEXT_VERSION;
        this.f358602r = i12;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f358602r = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            lVar = this;
        } else {
            lVar = new l(this);
        }
        Object obj2 = lVar.f358601q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = lVar.f358602r;
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
