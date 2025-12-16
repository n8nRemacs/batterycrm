package com.avito.android.profile.user_profile.cards.service_booking;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ActiveServiceBookingsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile.user_profile.cards.service_booking.ActiveServiceBookingsInteractorImpl", f = "ActiveServiceBookingsInteractor.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "getActiveBookings", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f225398q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f225399r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f225400s;

    /* renamed from: t, reason: collision with root package name */
    public int f225401t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f225400s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f225399r = obj;
        this.f225401t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f225400s.a(this);
    }
}
