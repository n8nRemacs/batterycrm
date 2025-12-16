package hs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.impl.network.response.CpxPromoBidSelectorResponse;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CpxPromoResponse.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001:\u0003%\u001f\u001dBk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lhs/d;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lhs/b;", "helpButton", "skipButton", "continueButton", "cancelButton", "Lcom/avito/android/cpx_promo/impl/network/response/CpxPromoBidSelectorResponse;", "bidSelector", "Lhs/d$c;", "manual", "Lhs/d$a;", "auto", "Lhs/d$b;", "errorTexts", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lhs/b;Lhs/b;Lhs/b;Lhs/b;Lcom/avito/android/cpx_promo/impl/network/response/CpxPromoBidSelectorResponse;Lhs/d$c;Lhs/d$a;Lhs/d$b;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "j", "()Lcom/avito/android/remote/model/text/AttributedText;", "i", "Lhs/b;", "f", "()Lhs/b;", "h", "d", "c", "Lcom/avito/android/cpx_promo/impl/network/response/CpxPromoBidSelectorResponse;", "b", "()Lcom/avito/android/cpx_promo/impl/network/response/CpxPromoBidSelectorResponse;", "Lhs/d$c;", "g", "()Lhs/d$c;", "Lhs/d$a;", "a", "()Lhs/d$a;", "Lhs/d$b;", "e", "()Lhs/d$b;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    @com.google.gson.annotations.c("auto")
    @l
    private final a auto;

    @com.google.gson.annotations.c("bidSelector")
    @l
    private final CpxPromoBidSelectorResponse bidSelector;

    @com.google.gson.annotations.c("cancel")
    @l
    private final C40976b cancelButton;

    @com.google.gson.annotations.c("continue")
    @l
    private final C40976b continueButton;

    @com.google.gson.annotations.c("errorTexts")
    @l
    private final b errorTexts;

    @com.google.gson.annotations.c("help")
    @l
    private final C40976b helpButton;

    @com.google.gson.annotations.c("manual")
    @l
    private final c manual;

    @com.google.gson.annotations.c("skip")
    @l
    private final C40976b skipButton;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @l
    private final AttributedText title;

    /* compiled from: CpxPromoResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhs/d$a;", "", "Lhs/d$a$a;", "budget", "<init>", "(Lhs/d$a$a;)V", "Lhs/d$a$a;", "a", "()Lhs/d$a$a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @com.google.gson.annotations.c("budget")
        @l
        private final C11279a budget;

        /* compiled from: CpxPromoResponse.kt */
        @P
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhs/d$a$a;", "", "Lhs/a;", "title", "", "selectedValue", "", "Lhs/d$a$a$a;", "values", "<init>", "(Lhs/a;Ljava/lang/String;Ljava/util/List;)V", "Lhs/a;", "b", "()Lhs/a;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: hs.d$a$a, reason: collision with other inner class name */
        public static final class C11279a {

            @com.google.gson.annotations.c("selectedValue")
            @l
            private final String selectedValue;

            @com.google.gson.annotations.c("title")
            @l
            private final C40975a title;

            @com.google.gson.annotations.c("values")
            @l
            private final List<C11280a> values;

            /* compiled from: CpxPromoResponse.kt */
            @P
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lhs/d$a$a$a;", "", "", "id", "title", "Lhs/e;", "slider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhs/e;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "Lhs/e;", "b", "()Lhs/e;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: hs.d$a$a$a, reason: collision with other inner class name */
            public static final class C11280a {

                @com.google.gson.annotations.c("id")
                @l
                private final String id;

                @com.google.gson.annotations.c("slider")
                @l
                private final e slider;

                @com.google.gson.annotations.c("title")
                @l
                private final String title;

                public C11280a(@l String str, @l String str2, @l e eVar) {
                    this.id = str;
                    this.title = str2;
                    this.slider = eVar;
                }

                @l
                /* renamed from: a, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                @l
                /* renamed from: b, reason: from getter */
                public final e getSlider() {
                    return this.slider;
                }

                @l
                /* renamed from: c, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }
            }

            public C11279a(@l C40975a c40975a, @l String str, @l List<C11280a> list) {
                this.title = c40975a;
                this.selectedValue = str;
                this.values = list;
            }

            @l
            /* renamed from: a, reason: from getter */
            public final String getSelectedValue() {
                return this.selectedValue;
            }

            @l
            /* renamed from: b, reason: from getter */
            public final C40975a getTitle() {
                return this.title;
            }

            @l
            public final List<C11280a> c() {
                return this.values;
            }
        }

        public a(@l C11279a c11279a) {
            this.budget = c11279a;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final C11279a getBudget() {
            return this.budget;
        }
    }

    /* compiled from: CpxPromoResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lhs/d$b;", "", "", "limitLessThanBid", "minimumLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        @com.google.gson.annotations.c("limitLessThanBid")
        @k
        private final String limitLessThanBid;

        @com.google.gson.annotations.c("minimumLimit")
        @k
        private final String minimumLimit;

        public b(@k String str, @k String str2) {
            this.limitLessThanBid = str;
            this.minimumLimit = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getLimitLessThanBid() {
            return this.limitLessThanBid;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getMinimumLimit() {
            return this.minimumLimit;
        }
    }

    /* compiled from: CpxPromoResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lhs/d$c;", "", "Lhs/e;", "slider", "Lhs/d$c$a;", "expenseLimit", "<init>", "(Lhs/e;Lhs/d$c$a;)V", "Lhs/e;", "b", "()Lhs/e;", "Lhs/d$c$a;", "a", "()Lhs/d$c$a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        @com.google.gson.annotations.c("expenseLimit")
        @l
        private final a expenseLimit;

        @com.google.gson.annotations.c("slider")
        @l
        private final e slider;

        /* compiled from: CpxPromoResponse.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lhs/d$c$a;", "", "Lhs/a;", "title", "", "selectedValue", "", ChannelContext.Item.PLACEHOLDER, "maxInput", "minInput", "Lhs/c;", "inputSheet", "<init>", "(Lhs/a;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lhs/c;)V", "Lhs/a;", "f", "()Lhs/a;", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "c", "Lhs/c;", "a", "()Lhs/c;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            @com.google.gson.annotations.c("inputSheet")
            @l
            private final hs.c inputSheet;

            @com.google.gson.annotations.c("maxInput")
            @l
            private final Long maxInput;

            @com.google.gson.annotations.c("minInput")
            @l
            private final Long minInput;

            @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
            @l
            private final String placeholder;

            @com.google.gson.annotations.c("selectedValue")
            @l
            private final Long selectedValue;

            @com.google.gson.annotations.c("title")
            @l
            private final C40975a title;

            public a(@l C40975a c40975a, @l Long l12, @l String str, @l Long l13, @l Long l14, @l hs.c cVar) {
                this.title = c40975a;
                this.selectedValue = l12;
                this.placeholder = str;
                this.maxInput = l13;
                this.minInput = l14;
                this.inputSheet = cVar;
            }

            @l
            /* renamed from: a, reason: from getter */
            public final hs.c getInputSheet() {
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
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final Long getSelectedValue() {
                return this.selectedValue;
            }

            @l
            /* renamed from: f, reason: from getter */
            public final C40975a getTitle() {
                return this.title;
            }
        }

        public c(@l e eVar, @l a aVar) {
            this.slider = eVar;
            this.expenseLimit = aVar;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final a getExpenseLimit() {
            return this.expenseLimit;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final e getSlider() {
            return this.slider;
        }
    }

    public d(@l AttributedText attributedText, @l AttributedText attributedText2, @l C40976b c40976b, @l C40976b c40976b2, @l C40976b c40976b3, @l C40976b c40976b4, @l CpxPromoBidSelectorResponse cpxPromoBidSelectorResponse, @l c cVar, @l a aVar, @l b bVar) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.helpButton = c40976b;
        this.skipButton = c40976b2;
        this.continueButton = c40976b3;
        this.cancelButton = c40976b4;
        this.bidSelector = cpxPromoBidSelectorResponse;
        this.manual = cVar;
        this.auto = aVar;
        this.errorTexts = bVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final a getAuto() {
        return this.auto;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final CpxPromoBidSelectorResponse getBidSelector() {
        return this.bidSelector;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C40976b getCancelButton() {
        return this.cancelButton;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C40976b getContinueButton() {
        return this.continueButton;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final b getErrorTexts() {
        return this.errorTexts;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final C40976b getHelpButton() {
        return this.helpButton;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final c getManual() {
        return this.manual;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final C40976b getSkipButton() {
        return this.skipButton;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
