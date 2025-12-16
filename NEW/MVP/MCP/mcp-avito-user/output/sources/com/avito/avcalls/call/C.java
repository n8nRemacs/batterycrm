package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSessionSignalingApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.call.CallSessionSignalingApi", f = "CallSessionSignalingApi.kt", i = {0}, l = {49}, m = "createCall", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class C extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public A f332556q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f332557r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f332558s;

    /* renamed from: t, reason: collision with root package name */
    public int f332559t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(A a12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f332558s = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f332557r = obj;
        this.f332559t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f332558s.d(null, null, null, false, null, null, this);
    }
}
