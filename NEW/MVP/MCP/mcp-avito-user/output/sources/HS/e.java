package hs;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CpxPromoSliderResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bBI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lhs/e;", "", "Lhs/a;", "title", "", "selectedValue", "minInput", "maxInput", "", "Lhs/e$a;", "values", "Lhs/c;", "inputSheet", "<init>", "(Lhs/a;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Lhs/c;)V", "Lhs/a;", "e", "()Lhs/a;", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "c", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lhs/c;", "a", "()Lhs/c;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    @com.google.gson.annotations.c("inputSheet")
    @l
    private final c inputSheet;

    @com.google.gson.annotations.c("maxInput")
    @l
    private final Long maxInput;

    @com.google.gson.annotations.c("minInput")
    @l
    private final Long minInput;

    @com.google.gson.annotations.c("selectedValue")
    @l
    private final Long selectedValue;

    @com.google.gson.annotations.c("title")
    @l
    private final C40975a title;

    @com.google.gson.annotations.c("values")
    @l
    private final List<a> values;

    /* compiled from: CpxPromoSliderResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lhs/e$a;", "", "", "value", "", "input", "description", "color", RequestReviewResultKt.INFO_TYPE, "Lcom/avito/android/remote/model/text/AttributedText;", "forecast", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "a", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @com.google.gson.annotations.c("color")
        @l
        private final String color;

        @com.google.gson.annotations.c("description")
        @l
        private final String description;

        @com.google.gson.annotations.c("forecast")
        @l
        private final AttributedText forecast;

        @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
        @l
        private final String info;

        @com.google.gson.annotations.c("input")
        @l
        private final String input;

        @com.google.gson.annotations.c("value")
        @l
        private final Long value;

        public a(@l Long l12, @l String str, @l String str2, @l String str3, @l String str4, @l AttributedText attributedText) {
            this.value = l12;
            this.input = str;
            this.description = str2;
            this.color = str3;
            this.info = str4;
            this.forecast = attributedText;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AttributedText getForecast() {
            return this.forecast;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getInfo() {
            return this.info;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final String getInput() {
            return this.input;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final Long getValue() {
            return this.value;
        }
    }

    public e(@l C40975a c40975a, @l Long l12, @l Long l13, @l Long l14, @l List<a> list, @l c cVar) {
        this.title = c40975a;
        this.selectedValue = l12;
        this.minInput = l13;
        this.maxInput = l14;
        this.values = list;
        this.inputSheet = cVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final c getInputSheet() {
        return this.inputSheet;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getMaxInput() {
        return this.maxInput;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getMinInput() {
        return this.minInput;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getSelectedValue() {
        return this.selectedValue;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final C40975a getTitle() {
        return this.title;
    }

    @l
    public final List<a> f() {
        return this.values;
    }
}
