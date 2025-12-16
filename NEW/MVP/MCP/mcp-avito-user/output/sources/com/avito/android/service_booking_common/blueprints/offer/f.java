package com.avito.android.service_booking_common.blueprints.offer;

import Y61.k;
import android.widget.TextView;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.R0;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import qt0.C47443g;

/* compiled from: SbOfferItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/offer/f;", "Lcom/avito/android/service_booking_common/blueprints/offer/d;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f276462b = f2.b(0, 1, BufferOverflow.f410778c, 1);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43238h f276463c;

    @Inject
    public f(@k R0 r02) {
        this.f276463c = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        InterfaceC43160i<DeepLink> interfaceC43160iLinkClicks;
        TextView textView = ((h) eVar).f276465b;
        AttributedText attributedText = ((C47443g) aVar).f429444c;
        j.a(textView, attributedText, null);
        if (attributedText == null || (interfaceC43160iLinkClicks = attributedText.linkClicks()) == null) {
            return;
        }
        C43175k.K(new C43197r1(new e(this, null), interfaceC43160iLinkClicks), this.f276463c);
    }

    @Override // com.avito.android.service_booking_common.blueprints.offer.c
    @k
    /* renamed from: f, reason: from getter */
    public final e2 getF276462b() {
        return this.f276462b;
    }
}
