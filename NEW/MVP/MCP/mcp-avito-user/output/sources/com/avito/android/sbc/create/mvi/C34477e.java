package com.avito.android.sbc.create.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CreateDiscountDispatchActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor", f = "CreateDiscountDispatchActor.kt", i = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4}, l = {1567, 1575, 1600, 1603, 1607}, m = "createAutoDispatch", n = {"this", "$this$createAutoDispatch", "emit", VoiceInfo.STATE, "autoDispatchViewState", "discountValue", "endDateSeconds", "offerTTLDays", "this", "$this$createAutoDispatch", "emit", VoiceInfo.STATE, "this", "$this$createAutoDispatch", "emit", VoiceInfo.STATE, "$this$onFailureSuspend$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* renamed from: com.avito.android.sbc.create.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34477e extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public int f259592A;

    /* renamed from: q, reason: collision with root package name */
    public Object f259593q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.arch.mvi.utils.l f259594r;

    /* renamed from: s, reason: collision with root package name */
    public Y41.p f259595s;

    /* renamed from: t, reason: collision with root package name */
    public CreateDiscountDispatchState.DiscountDispatchDataLoaded f259596t;

    /* renamed from: u, reason: collision with root package name */
    public CreateDiscountDispatchState.DiscountDispatchDataLoaded.d f259597u;

    /* renamed from: v, reason: collision with root package name */
    public Long f259598v;

    /* renamed from: w, reason: collision with root package name */
    public long f259599w;

    /* renamed from: x, reason: collision with root package name */
    public long f259600x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f259601y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C34469a f259602z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34477e(C34469a c34469a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f259602z = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f259601y = obj;
        this.f259592A |= BeduinInputModel.MIN_TEXT_VERSION;
        return C34469a.g(this.f259602z, null, null, this);
    }
}
