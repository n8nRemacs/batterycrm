package com.google.android.play.core.ktx;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: com.google.android.play:asset-delivery-ktx@@2.1.0 */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt", f = "AssetPackManagerKtx.kt", i = {}, l = {83}, m = "requestPackStates", n = {}, s = {})
/* loaded from: classes6.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f358603q;

    /* renamed from: r, reason: collision with root package name */
    public int f358604r;

    public m() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        m mVar;
        this.f358603q = obj;
        int i12 = this.f358604r | BeduinInputModel.MIN_TEXT_VERSION;
        this.f358604r = i12;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f358604r = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            mVar = this;
        } else {
            mVar = new m(this);
        }
        Object obj2 = mVar.f358603q;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = mVar.f358604r;
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
