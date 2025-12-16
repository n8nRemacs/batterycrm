package com.avito.android.str_booking.domain.polling;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: StrBookingPollingDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.str_booking.domain.polling.StrBookingPollingDelegateImpl", f = "StrBookingPollingDelegate.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {44, 46}, m = "poll", n = {"this", "onDataUpdate", "isRequired", "currentTime", "failCount", "count", "maxCount", "timeout", "this", "onDataUpdate", "isRequired", "currentTime", "failCount", "count", "maxCount", "timeout"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2"})
/* loaded from: classes4.dex */
final class e extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public int f285699A;

    /* renamed from: q, reason: collision with root package name */
    public c f285700q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.a f285701r;

    /* renamed from: s, reason: collision with root package name */
    public l0.a f285702s;

    /* renamed from: t, reason: collision with root package name */
    public String f285703t;

    /* renamed from: u, reason: collision with root package name */
    public l0.f f285704u;

    /* renamed from: v, reason: collision with root package name */
    public int f285705v;

    /* renamed from: w, reason: collision with root package name */
    public int f285706w;

    /* renamed from: x, reason: collision with root package name */
    public int f285707x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f285708y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f285709z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f285709z = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f285708y = obj;
        this.f285699A |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f285709z.a(null, null, this);
    }
}
