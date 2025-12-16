package com.avito.android.str_booking.deeplink.create_messenger;

import Px0.InterfaceC14851a;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: StrCreateMessengerDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/deeplink/create_messenger/f;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/str_booking/deeplink/create_messenger/StrCreateMessengerDeeplink;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends com.avito.android.deeplink_handler.handler.base.coroutines.a<StrCreateMessengerDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14851a f285424g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f285425h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.i f285426i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f285427j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f285428k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final R0 f285429l;

    @Inject
    public f(@Y61.k InterfaceC14851a interfaceC14851a, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02) {
        super(r02);
        this.f285424g = interfaceC14851a;
        this.f285425h = gVar;
        this.f285426i = iVar;
        this.f285427j = interfaceC35741a1;
        this.f285428k = aVar;
        this.f285429l = r02;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        Object objI = C43175k.i(new C43152f0(new b(C43175k.I(this.f285429l.a(), C43175k.n(new C43137a0(new d(2, null), new a(C43175k.G(new c(this, (StrCreateMessengerDeeplink) deepLink, null)))), 150L)), this), new e(this, null)), continuation);
        return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : G0.f406611a;
    }
}
