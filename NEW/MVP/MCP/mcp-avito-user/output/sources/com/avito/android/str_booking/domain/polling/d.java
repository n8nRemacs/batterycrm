package com.avito.android.str_booking.domain.polling;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StrBookingPollingDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.str_booking.domain.polling.StrBookingPollingDelegateImpl", f = "StrBookingPollingDelegate.kt", i = {0, 0, 1, 1}, l = {67, 73}, m = "fetchUpdatedTimeByFeature", n = {"onSuccess", "onFailure", "onSuccess", "onFailure"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l f285694q;

    /* renamed from: r, reason: collision with root package name */
    public l f285695r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f285696s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f285697t;

    /* renamed from: u, reason: collision with root package name */
    public int f285698u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f285697t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        this.f285696s = obj;
        this.f285698u |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = c.f285689e;
        return this.f285697t.b(null, null, this);
    }
}
