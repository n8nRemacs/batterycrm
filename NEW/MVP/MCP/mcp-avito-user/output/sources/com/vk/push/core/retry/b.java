package com.vk.push.core.retry;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RequestRetryComponent.kt */
@Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
@DebugMetadata(c = "com.vk.push.core.retry.RequestRetryComponent", f = "RequestRetryComponent.kt", i = {0, 0, 0, 1, 1, 1}, l = {17, 39, 41}, m = "invoke-gIAlu-s", n = {"this", "request", "attempt", "this", "request", "attempt"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes7.dex */
final class b<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f367147q;

    /* renamed from: r, reason: collision with root package name */
    public l f367148r;

    /* renamed from: s, reason: collision with root package name */
    public int f367149s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f367150t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f367151u;

    /* renamed from: v, reason: collision with root package name */
    public int f367152v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f367151u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        this.f367150t = obj;
        this.f367152v |= BeduinInputModel.MIN_TEXT_VERSION;
        Object objB = this.f367151u.b(null, this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Z.a(objB);
    }
}
