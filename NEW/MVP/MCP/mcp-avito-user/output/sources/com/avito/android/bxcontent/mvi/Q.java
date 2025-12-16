package com.avito.android.bxcontent.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BxContentInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl", f = "BxContentInteractor.kt", i = {0, 0, 0}, l = {1367}, m = "getItemListForPushContent", n = {"subtitle", "title", "additionalTopicsFlows"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes12.dex */
final class Q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f111448q;

    /* renamed from: r, reason: collision with root package name */
    public String f111449r;

    /* renamed from: s, reason: collision with root package name */
    public Object[] f111450s;

    /* renamed from: t, reason: collision with root package name */
    public kotlin.jvm.internal.t0 f111451t;

    /* renamed from: u, reason: collision with root package name */
    public kotlin.jvm.internal.t0 f111452u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f111453v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ F f111454w;

    /* renamed from: x, reason: collision with root package name */
    public int f111455x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(F f12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f111454w = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f111453v = obj;
        this.f111455x |= BeduinInputModel.MIN_TEXT_VERSION;
        return F.w(this.f111454w, null, null, null, null, null, null, null, null, null, null, null, null, this);
    }
}
