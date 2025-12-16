package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.sections.AttributedTextSection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: StrBookingAttributedTextConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/c;", "Lcom/avito/android/str_booking/domain/items_converter/a;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_booking.domain.items_converter.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35063c implements InterfaceC35061a {
    @Inject
    public C35063c() {
    }

    @Override // com.avito.android.str_booking.domain.items_converter.InterfaceC35061a
    @Y61.k
    public final com.avito.android.str_booking.ui.attributed_text.c a(@Y61.k AttributedTextSection attributedTextSection) {
        List<Attribute> attributes;
        AttributedText content = attributedTextSection.getContent();
        AttributedText content2 = attributedTextSection.getContent();
        String strO = null;
        String text = content2 != null ? content2.getText() : null;
        if (text == null) {
            text = "";
        }
        AttributedText content3 = attributedTextSection.getContent();
        if (content3 != null && (attributes = content3.getAttributes()) != null) {
            strO = C42745f0.O(attributes, ",", null, null, C35062b.f285628l, 30);
        }
        return new com.avito.android.str_booking.ui.attributed_text.c(content, text.concat(strO != null ? strO : ""));
    }
}
