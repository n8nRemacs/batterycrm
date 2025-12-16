package com.avito.android.hotel_booking.konveyor.dotted_text;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormDottedTextPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/dotted_text/f;", "LTV0/f;", "Lcom/avito/android/hotel_booking/konveyor/dotted_text/h;", "Lcom/avito/android/hotel_booking/konveyor/dotted_text/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements TV0.f<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<RI.b, G0> f163661b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super RI.b, G0> lVar) {
        this.f163661b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.D9(cVar.f163654d);
        AttributedText attributedText = cVar.f163655e;
        hVar.ed(attributedText);
        AttributedText attributedText2 = cVar.f163654d;
        if (attributedText2 != null) {
            attributedText2.setOnDeepLinkClickListener(new e(this, cVar, 0));
        }
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new e(this, cVar, 1));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof d) {
                obj = obj2;
            }
        }
        d dVar = (d) (obj instanceof d ? obj : null);
        if (dVar == null) {
            hVar.D9(cVar.f163654d);
            AttributedText attributedText = cVar.f163655e;
            hVar.ed(attributedText);
            AttributedText attributedText2 = cVar.f163654d;
            if (attributedText2 != null) {
                attributedText2.setOnDeepLinkClickListener(new e(this, cVar, 0));
            }
            if (attributedText == null) {
                return;
            }
            attributedText.setOnDeepLinkClickListener(new e(this, cVar, 1));
            return;
        }
        AttributedText attributedText3 = dVar.f163656a;
        if (attributedText3 != null) {
            hVar.D9(attributedText3);
        }
        AttributedText attributedText4 = dVar.f163657b;
        if (attributedText4 != null) {
            hVar.ed(attributedText4);
        }
        AttributedText attributedText5 = cVar.f163654d;
        if (attributedText5 != null) {
            attributedText5.setOnDeepLinkClickListener(new e(this, cVar, 0));
        }
        AttributedText attributedText6 = cVar.f163655e;
        if (attributedText6 == null) {
            return;
        }
        attributedText6.setOnDeepLinkClickListener(new e(this, cVar, 1));
    }
}
