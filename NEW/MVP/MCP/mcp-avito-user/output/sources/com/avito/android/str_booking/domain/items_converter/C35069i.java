package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.str_booking.network.models.common.Button;
import kotlin.Metadata;

/* compiled from: StrBookingButtonsConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/str_booking/network/models/common/Button;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_booking.domain.items_converter.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35069i extends kotlin.jvm.internal.N implements Y41.l<Button, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final C35069i f285631l = new C35069i();

    public C35069i() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(Button button) {
        String title = button.getTitle();
        return title == null ? "" : title;
    }
}
