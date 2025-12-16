package JF0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LJF0/d;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "step", "value", "minValue", "maxValue", "", "valueSuffix", "divisor", "", "LJF0/d$a;", "valueRanges", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;IIIILjava/lang/String;ILjava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "I", "d", "()I", "f", "c", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d {

    @com.google.gson.annotations.c("divisor")
    private final int divisor;

    @com.google.gson.annotations.c("valueMax")
    private final int maxValue;

    @com.google.gson.annotations.c("valueMin")
    private final int minValue;

    @com.google.gson.annotations.c("step")
    private final int step;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    @com.google.gson.annotations.c("value")
    private final int value;

    @com.google.gson.annotations.c("valueRanges")
    @k
    private final List<a> valueRanges;

    @com.google.gson.annotations.c("valueSuffix")
    @k
    private final String valueSuffix;

    /* compiled from: TrxPromoGoodsConfigureResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LJF0/d$a;", "", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lcom/avito/android/remote/model/text/AttributedText;", "description", "<init>", "(IILcom/avito/android/remote/model/text/AttributedText;)V", "I", "b", "()I", "c", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @com.google.gson.annotations.c("description")
        @l
        private final AttributedText description;

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        private final int from;

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
        private final int to;

        public a(int i12, int i13, @l AttributedText attributedText) {
            this.from = i12;
            this.to = i13;
            this.description = attributedText;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        /* renamed from: b, reason: from getter */
        public final int getFrom() {
            return this.from;
        }

        /* renamed from: c, reason: from getter */
        public final int getTo() {
            return this.to;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.from == aVar.from && this.to == aVar.to && L.f(this.description, aVar.description);
        }

        public final int hashCode() {
            int iE2 = r.e(this.to, Integer.hashCode(this.from) * 31, 31);
            AttributedText attributedText = this.description;
            return iE2 + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ValueRange(from=");
            sb2.append(this.from);
            sb2.append(", to=");
            sb2.append(this.to);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.description, ')');
        }
    }

    public d(@k AttributedText attributedText, int i12, int i13, int i14, int i15, @k String str, int i16, @k List<a> list) {
        this.title = attributedText;
        this.step = i12;
        this.value = i13;
        this.minValue = i14;
        this.maxValue = i15;
        this.valueSuffix = str;
        this.divisor = i16;
        this.valueRanges = list;
    }

    /* renamed from: a, reason: from getter */
    public final int getDivisor() {
        return this.divisor;
    }

    /* renamed from: b, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: c, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* renamed from: d, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.title, dVar.title) && this.step == dVar.step && this.value == dVar.value && this.minValue == dVar.minValue && this.maxValue == dVar.maxValue && L.f(this.valueSuffix, dVar.valueSuffix) && this.divisor == dVar.divisor && L.f(this.valueRanges, dVar.valueRanges);
    }

    /* renamed from: f, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @k
    public final List<a> g() {
        return this.valueRanges;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getValueSuffix() {
        return this.valueSuffix;
    }

    public final int hashCode() {
        return this.valueRanges.hashCode() + r.e(this.divisor, H.d(r.e(this.maxValue, r.e(this.minValue, r.e(this.value, r.e(this.step, this.title.hashCode() * 31, 31), 31), 31), 31), 31, this.valueSuffix), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoGoodsConfigureCommission(title=");
        sb2.append(this.title);
        sb2.append(", step=");
        sb2.append(this.step);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", minValue=");
        sb2.append(this.minValue);
        sb2.append(", maxValue=");
        sb2.append(this.maxValue);
        sb2.append(", valueSuffix=");
        sb2.append(this.valueSuffix);
        sb2.append(", divisor=");
        sb2.append(this.divisor);
        sb2.append(", valueRanges=");
        return H.p(sb2, this.valueRanges, ')');
    }
}
