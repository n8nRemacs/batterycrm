package com.avito.avcalls.android.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSessionSignalingApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSessionSignalingApi", f = "CallSessionSignalingApi.kt", i = {0}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "accept", n = {"this_$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public x f331645q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331646r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f331647s;

    /* renamed from: t, reason: collision with root package name */
    public int f331648t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331647s = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331646r = obj;
        this.f331648t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f331647s.c(null, null, null, null, null, null, this);
    }
}
