package com.avito.android.service_booking_details;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ServiceBookingItemDetailsActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.service_booking_details.ServiceBookingItemDetailsActivity", f = "ServiceBookingItemDetailsActivity.kt", i = {0}, l = {242}, m = "observeItemPresenters", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public ServiceBookingItemDetailsActivity f277350q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f277351r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f277352s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingItemDetailsActivity f277353t;

    /* renamed from: u, reason: collision with root package name */
    public int f277354u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ServiceBookingItemDetailsActivity serviceBookingItemDetailsActivity, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f277353t = serviceBookingItemDetailsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f277352s = obj;
        this.f277354u |= BeduinInputModel.MIN_TEXT_VERSION;
        return ServiceBookingItemDetailsActivity.a2(this.f277353t, null, this);
    }
}
