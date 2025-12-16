package com.avito.android.hotel_booking.deeplink.create_messenger;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HotelCreateMessengerDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.hotel_booking.deeplink.create_messenger.HotelCreateMessengerDeeplinkHandler", f = "HotelCreateMessengerDeeplinkHandler.kt", i = {0}, l = {32}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f163283q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f163284r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f163285s;

    /* renamed from: t, reason: collision with root package name */
    public int f163286t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f163285s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f163284r = obj;
        this.f163286t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f163285s.o(null, this);
    }
}
