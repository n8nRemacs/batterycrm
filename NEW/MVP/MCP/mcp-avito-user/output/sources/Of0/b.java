package OF0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsDatePickerOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LOF0/b;", "", "a", "b", "c", "LOF0/b$a;", "LOF0/b$b;", "LOF0/b$c;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TrxPromoGoodsDatePickerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOF0/b$a;", "LOF0/b;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LocalDate f12104a;

        public a(@k LocalDate localDate) {
            this.f12104a = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f12104a, ((a) obj).f12104a);
        }

        public final int hashCode() {
            return this.f12104a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.t(new StringBuilder("CloseWithSelectedDate(selectedDate="), this.f12104a, ')');
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOF0/b$b;", "LOF0/b;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: OF0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0782b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f12105a;

        public C0782b(@k DeepLink deepLink) {
            this.f12105a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0782b) && L.f(this.f12105a, ((C0782b) obj).f12105a);
        }

        public final int hashCode() {
            return this.f12105a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f12105a, ')');
        }
    }

    /* compiled from: TrxPromoGoodsDatePickerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOF0/b$c;", "LOF0/b;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f12106a;

        public c(@k PrintableText printableText) {
            this.f12106a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f12106a, ((c) obj).f12106a);
        }

        public final int hashCode() {
            return this.f12106a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(message="), this.f12106a, ')');
        }
    }
}
