package com.vk.id;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VKID.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.vk.id.VKID", f = "VKID.kt", i = {}, l = {685}, m = "fetchUserData-IoAF18A", n = {}, s = {})
/* loaded from: classes7.dex */
public final class VKID$fetchUserData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VKID this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKID$fetchUserData$1(VKID vkid, Continuation<? super VKID$fetchUserData$1> continuation) {
        super(continuation);
        this.this$0 = vkid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objM112fetchUserDataIoAF18A = this.this$0.m112fetchUserDataIoAF18A(this);
        return objM112fetchUserDataIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM112fetchUserDataIoAF18A : Z.a(objM112fetchUserDataIoAF18A);
    }
}
