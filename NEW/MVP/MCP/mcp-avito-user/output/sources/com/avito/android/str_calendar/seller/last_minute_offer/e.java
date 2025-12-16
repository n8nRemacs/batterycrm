package com.avito.android.str_calendar.seller.last_minute_offer;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LastMinuteOfferInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.str_calendar.seller.last_minute_offer.LastMinuteOfferInteractorImpl", f = "LastMinuteOfferInteractor.kt", i = {0, 0}, l = {98, 104}, m = "handleSuccess", n = {"this", "$this$handleSuccess"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f287881q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f287882r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f287883s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f287884t;

    /* renamed from: u, reason: collision with root package name */
    public int f287885u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f287884t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f287883s = obj;
        this.f287885u |= BeduinInputModel.MIN_TEXT_VERSION;
        return c.d(this.f287884t, null, this);
    }
}
