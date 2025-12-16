package com.avito.android.str_calendar.seller.last_minute_offer;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LastMinuteOfferInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.str_calendar.seller.last_minute_offer.LastMinuteOfferInteractorImpl", f = "LastMinuteOfferInteractor.kt", i = {0, 0, 0}, l = {113, 132}, m = "handleError", n = {"this", "$this$handleError", "error"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f287853q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f287854r;

    /* renamed from: s, reason: collision with root package name */
    public ApiError f287855s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f287856t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f287857u;

    /* renamed from: v, reason: collision with root package name */
    public int f287858v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f287857u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f287856t = obj;
        this.f287858v |= BeduinInputModel.MIN_TEXT_VERSION;
        return c.c(this.f287857u, null, null, this);
    }
}
