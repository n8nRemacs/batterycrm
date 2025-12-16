package Vy0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.str_cancellation_settings.models.items.CancellationDiscountInputItem;
import com.avito.android.str_cancellation_settings.models.items.CancellationDiscountSwitcherItem;
import com.avito.android.str_cancellation_settings.models.items.DaysOptionChipable;
import com.avito.android.str_cancellation_settings.models.items.ExplanationItem;
import com.avito.android.str_cancellation_settings.models.items.FreeCancellationDaysChipsItem;
import com.avito.android.str_cancellation_settings.models.items.FreeCancellationSwitcherItem;
import com.avito.android.str_cancellation_settings.models.items.HeaderItem;
import com.avito.android.str_cancellation_settings.mvi.entity.a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PreviewData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVy0/b;", "", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vy0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15730b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C15730b f17532a = new C15730b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a.b f17533b = new a.b(com.avito.android.printable_text.b.f("Правила отмены"), com.avito.android.printable_text.b.f("Для всех дат в календаре"), true, false, C42745f0.U(new FreeCancellationSwitcherItem("FreeCancellationSwitcherItem", "Период бесплатной отмены для гостя", true), new FreeCancellationDaysChipsItem("FreeCancellationDaysChipsItem", "Отмена станет платной, когда до заселения:", C42745f0.U(new DaysOptionChipable(1, "1 День", false, false, 12, null), new DaysOptionChipable(3, "3 Дня", false, false, 12, null), new DaysOptionChipable(5, "5 Дней", false, false, 12, null), new DaysOptionChipable(7, "7 Дней", true, false, 8, null), new DaysOptionChipable(14, "14 Дней", false, false, 12, null))), new CancellationDiscountSwitcherItem("CancellationDiscountSwitcherItem", "Скидка за выбор платной отмены", true, "У гостя будет выбор: с бесплатным периодом или без возврата оплаты, но со скидкой", true), new CancellationDiscountInputItem("CancellationDiscountInputItem", "5", "Укажите размер скидки  %", com.avito.android.printable_text.b.f("от 5% до 10%"), ""), new HeaderItem("HeaderItem:Что получается", "Что получается"), new ExplanationItem("ExplanationItem1", "checklist", "Гость сможет выбрать: бронировать с бесплатным периодом отмены, или без возврата оплаты, но со скидкой"), new ExplanationItem("ExplanationItem2", "operations", "С бесплатным периодом. Если гость отменит бронь раньше выбранного вами срока, оплата вернётся ему. Позже — придёт вам за вычетом комиссии"), new ExplanationItem("ExplanationItem3", "blockOutline", "Без возврата оплаты. Если гость отменит бронь, деньги придут вам за вычетом комиссии"), new ExplanationItem("ExplanationItem4", RequestReviewResultKt.INFO_TYPE, "В платном периоде деньги вернутся гостю при отмене в течение 6 часов после оплаты, кроме броней в день заселения")), true);
}
