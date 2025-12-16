package com.avito.android.service_booking.mvi.domain.interactors;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.TypedResult;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ServiceBookingCoroutinesInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.service_booking.mvi.domain.interactors.ServiceBookingCoroutinesInteractorImpl", f = "ServiceBookingCoroutinesInteractor.kt", i = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 7, 7}, l = {133, 141, 159, 194, 200, JfifUtil.MARKER_RST7, 230, 252, 263}, m = "emitSuccessActions", n = {"this", "$this$emitSuccessActions", "result", "loadStepId", "this", "$this$emitSuccessActions", "result", "this", "$this$emitSuccessActions", "result", "$this$emitSuccessActions", "result"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f274380q;

    /* renamed from: r, reason: collision with root package name */
    public Object f274381r;

    /* renamed from: s, reason: collision with root package name */
    public TypedResult.Success f274382s;

    /* renamed from: t, reason: collision with root package name */
    public String f274383t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f274384u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f274385v;

    /* renamed from: w, reason: collision with root package name */
    public int f274386w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f274385v = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f274384u = obj;
        this.f274386w |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.c(this.f274385v, null, null, null, false, false, this);
    }
}
