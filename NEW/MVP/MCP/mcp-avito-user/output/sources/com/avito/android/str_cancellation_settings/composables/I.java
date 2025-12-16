package com.avito.android.str_cancellation_settings.composables;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: Explanation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_cancellation_settings/composables/I;", "LB0/h;", "Lcom/avito/android/str_cancellation_settings/composables/J;", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class I implements B0.h<J> {
    @Override // B0.h
    @Y61.k
    public final InterfaceC43030m<J> a() {
        return C42756l.f(new J[]{new J("checklist", "Гость сможет выбрать: бронировать с бесплатным периодом отмены, или без возврата оплаты, но со скидкой"), new J("operations", "С бесплатным периодом. Если гость отменит бронь раньше выбранного вами срока, оплата вернётся ему. Позже — придёт вам за вычетом комиссии"), new J("blockOutline", "Без возврата оплаты. Если гость отменит бронь, деньги придут вам за вычетом комиссии"), new J(RequestReviewResultKt.INFO_TYPE, "В платном периоде деньги вернутся гостю при отмене в течение 6 часов после оплаты, кроме броней в день заселения")});
    }
}
