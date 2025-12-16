package com.avito.android.bbip_remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BbipPrivateConfiguratorResult.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\fB7\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData;", "", "", "Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$BbipPrivateSegment;", "segments", "Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$b;", "summarySection", "Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$a;", "presets", "<init>", "(Ljava/util/List;Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$b;Ljava/util/List;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$b;", "c", "()Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$b;", "a", "BbipPrivateSegment", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BbipPrivatePresetsData {

    @c("presets")
    @l
    private final List<a> presets;

    @c("segments")
    @l
    private final List<BbipPrivateSegment> segments;

    @c("summarySection")
    @l
    private final b summarySection;

    /* compiled from: BbipPrivateConfiguratorResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$b;", "", "", "forecastTitle", "budgetTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        @c("budgetTitle")
        @k
        private final String budgetTitle;

        @c("forecastTitle")
        @k
        private final String forecastTitle;

        public b(@k String str, @k String str2) {
            this.forecastTitle = str;
            this.budgetTitle = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getBudgetTitle() {
            return this.budgetTitle;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getForecastTitle() {
            return this.forecastTitle;
        }
    }

    public BbipPrivatePresetsData() {
        this(null, null, null, 7, null);
    }

    @l
    public final List<a> a() {
        return this.presets;
    }

    @l
    public final List<BbipPrivateSegment> b() {
        return this.segments;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final b getSummarySection() {
        return this.summarySection;
    }

    public BbipPrivatePresetsData(@l List<BbipPrivateSegment> list, @l b bVar, @l List<a> list2) {
        this.segments = list;
        this.summarySection = bVar;
        this.presets = list2;
    }

    /* compiled from: BbipPrivateConfiguratorResult.kt */
    @P
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$BbipPrivateSegment;", "", "", "title", "", "selected", "Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$BbipPrivateSegment$BbipPrivateSegmentValue;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$BbipPrivateSegment$BbipPrivateSegmentValue;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$BbipPrivateSegment$BbipPrivateSegmentValue;", "c", "()Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$BbipPrivateSegment$BbipPrivateSegmentValue;", "BbipPrivateSegmentValue", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BbipPrivateSegment {

        @c("selected")
        @l
        private final Boolean selected;

        @c("title")
        @k
        private final String title;

        @c("value")
        @k
        private final BbipPrivateSegmentValue value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BbipPrivateConfiguratorResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$BbipPrivateSegment$BbipPrivateSegmentValue;", "", "(Ljava/lang/String;I)V", "PRESETS", "MANUAL", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BbipPrivateSegmentValue {

            @c("manual")
            public static final BbipPrivateSegmentValue MANUAL;

            @c("presets")
            public static final BbipPrivateSegmentValue PRESETS;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ BbipPrivateSegmentValue[] f99071b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f99072c;

            static {
                BbipPrivateSegmentValue bbipPrivateSegmentValue = new BbipPrivateSegmentValue("PRESETS", 0);
                PRESETS = bbipPrivateSegmentValue;
                BbipPrivateSegmentValue bbipPrivateSegmentValue2 = new BbipPrivateSegmentValue("MANUAL", 1);
                MANUAL = bbipPrivateSegmentValue2;
                BbipPrivateSegmentValue[] bbipPrivateSegmentValueArr = {bbipPrivateSegmentValue, bbipPrivateSegmentValue2};
                f99071b = bbipPrivateSegmentValueArr;
                f99072c = kotlin.enums.c.a(bbipPrivateSegmentValueArr);
            }

            private BbipPrivateSegmentValue(String str, int i12) {
            }

            public static BbipPrivateSegmentValue valueOf(String str) {
                return (BbipPrivateSegmentValue) Enum.valueOf(BbipPrivateSegmentValue.class, str);
            }

            public static BbipPrivateSegmentValue[] values() {
                return (BbipPrivateSegmentValue[]) f99071b.clone();
            }
        }

        public BbipPrivateSegment(@k String str, @l Boolean bool, @k BbipPrivateSegmentValue bbipPrivateSegmentValue) {
            this.title = str;
            this.selected = bool;
            this.value = bbipPrivateSegmentValue;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final Boolean getSelected() {
            return this.selected;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final BbipPrivateSegmentValue getValue() {
            return this.value;
        }

        public /* synthetic */ BbipPrivateSegment(String str, Boolean bool, BbipPrivateSegmentValue bbipPrivateSegmentValue, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? Boolean.FALSE : bool, bbipPrivateSegmentValue);
        }
    }

    /* compiled from: BbipPrivateConfiguratorResult.kt */
    @P
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001:\u0001&Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b!\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b&\u0010\u0018¨\u0006'"}, d2 = {"Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$a;", "", "Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$a$a;", Navigation.CONFIG, "", "title", "priceDurationFormatted", "Lcom/avito/android/remote/model/UniversalImage;", "iconUrl", "", "selected", "forecast", "discountPctFormatted", "oldPriceFormatted", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "bblContacts", "additionalInfo", "<init>", "(Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$a$a;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;Ljava/lang/String;)V", "Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$a$a;", "c", "()Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$a$a;", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "h", "Lcom/avito/android/remote/model/UniversalImage;", "f", "()Lcom/avito/android/remote/model/UniversalImage;", "Z", "i", "()Z", "e", "d", "g", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "b", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @c("additionalInfo")
        @l
        private final String additionalInfo;

        @c("bblContacts")
        @l
        private final MnzFloatingFooterContact bblContacts;

        @c(Navigation.CONFIG)
        @k
        private final C2986a config;

        @c("discountPctFormatted")
        @l
        private final String discountPctFormatted;

        @c("forecast")
        @l
        private final String forecast;

        @c("iconUrl")
        @k
        private final UniversalImage iconUrl;

        @c("oldPriceFormatted")
        @l
        private final String oldPriceFormatted;

        @c("priceDurationFormatted")
        @k
        private final String priceDurationFormatted;

        @c("selected")
        private final boolean selected;

        @c("title")
        @k
        private final String title;

        public a(@k C2986a c2986a, @k String str, @k String str2, @k UniversalImage universalImage, boolean z12, @l String str3, @l String str4, @l String str5, @l MnzFloatingFooterContact mnzFloatingFooterContact, @l String str6) {
            this.config = c2986a;
            this.title = str;
            this.priceDurationFormatted = str2;
            this.iconUrl = universalImage;
            this.selected = z12;
            this.forecast = str3;
            this.discountPctFormatted = str4;
            this.oldPriceFormatted = str5;
            this.bblContacts = mnzFloatingFooterContact;
            this.additionalInfo = str6;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getAdditionalInfo() {
            return this.additionalInfo;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final MnzFloatingFooterContact getBblContacts() {
            return this.bblContacts;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final C2986a getConfig() {
            return this.config;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getDiscountPctFormatted() {
            return this.discountPctFormatted;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final String getForecast() {
            return this.forecast;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final UniversalImage getIconUrl() {
            return this.iconUrl;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final String getOldPriceFormatted() {
            return this.oldPriceFormatted;
        }

        @k
        /* renamed from: h, reason: from getter */
        public final String getPriceDurationFormatted() {
            return this.priceDurationFormatted;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        @k
        /* renamed from: j, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* compiled from: BbipPrivateConfiguratorResult.kt */
        @P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/bbip_remote/model/BbipPrivatePresetsData$a$a;", "", "", "price", "", "duration", "budget", "discountPct", "<init>", "(JILjava/lang/Long;Ljava/lang/Long;)V", "J", "d", "()J", "I", "c", "()I", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "b", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.bbip_remote.model.BbipPrivatePresetsData$a$a, reason: collision with other inner class name */
        public static final class C2986a {

            @c("budget")
            @l
            private final Long budget;

            @c("discountPct")
            @l
            private final Long discountPct;

            @c("duration")
            private final int duration;

            @c("price")
            private final long price;

            public C2986a(long j12, int i12, @l Long l12, @l Long l13) {
                this.price = j12;
                this.duration = i12;
                this.budget = l12;
                this.discountPct = l13;
            }

            @l
            /* renamed from: a, reason: from getter */
            public final Long getBudget() {
                return this.budget;
            }

            @l
            /* renamed from: b, reason: from getter */
            public final Long getDiscountPct() {
                return this.discountPct;
            }

            /* renamed from: c, reason: from getter */
            public final int getDuration() {
                return this.duration;
            }

            /* renamed from: d, reason: from getter */
            public final long getPrice() {
                return this.price;
            }

            public /* synthetic */ C2986a(long j12, int i12, Long l12, Long l13, int i13, C42822w c42822w) {
                this(j12, i12, (i13 & 4) != 0 ? null : l12, (i13 & 8) != 0 ? null : l13);
            }
        }
    }

    public /* synthetic */ BbipPrivatePresetsData(List list, b bVar, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? null : bVar, (i12 & 4) != 0 ? null : list2);
    }
}
