package com.avito.android.search_ux_feedback;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchFeedbackCampaign.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign;", "LSK0/c;", "a", "b", "c", "d", "e", "f", "g", "Vertical", "h", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$a;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$b;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$c;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$d;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$e;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$f;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$g;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$h;", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SearchFeedbackCampaign implements SK0.c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f264386a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchFeedbackCampaign.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$Vertical;", "", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Vertical {

        /* renamed from: b, reason: collision with root package name */
        public static final Vertical f264387b;

        /* renamed from: c, reason: collision with root package name */
        public static final Vertical f264388c;

        /* renamed from: d, reason: collision with root package name */
        public static final Vertical f264389d;

        /* renamed from: e, reason: collision with root package name */
        public static final Vertical f264390e;

        /* renamed from: f, reason: collision with root package name */
        public static final Vertical f264391f;

        /* renamed from: g, reason: collision with root package name */
        public static final Vertical f264392g;

        /* renamed from: h, reason: collision with root package name */
        public static final Vertical f264393h;

        /* renamed from: i, reason: collision with root package name */
        public static final Vertical f264394i;

        /* renamed from: j, reason: collision with root package name */
        public static final Vertical f264395j;

        /* renamed from: k, reason: collision with root package name */
        public static final Vertical f264396k;

        /* renamed from: l, reason: collision with root package name */
        public static final Vertical f264397l;

        /* renamed from: m, reason: collision with root package name */
        public static final Vertical f264398m;

        /* renamed from: n, reason: collision with root package name */
        public static final Vertical f264399n;

        /* renamed from: o, reason: collision with root package name */
        public static final Vertical f264400o;

        /* renamed from: p, reason: collision with root package name */
        public static final Vertical f264401p;

        /* renamed from: q, reason: collision with root package name */
        public static final Vertical f264402q;

        /* renamed from: r, reason: collision with root package name */
        public static final /* synthetic */ Vertical[] f264403r;

        /* renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f264404s;

        static {
            Vertical vertical = new Vertical("REALTY", 0);
            f264387b = vertical;
            Vertical vertical2 = new Vertical("AUTO", 1);
            f264388c = vertical2;
            Vertical vertical3 = new Vertical("GENERAL", 2);
            f264389d = vertical3;
            Vertical vertical4 = new Vertical("JOB", 3);
            f264390e = vertical4;
            Vertical vertical5 = new Vertical("SERVICES", 4);
            f264391f = vertical5;
            Vertical vertical6 = new Vertical("ELECTRONICS", 5);
            f264392g = vertical6;
            Vertical vertical7 = new Vertical("FOR_HOME", 6);
            f264393h = vertical7;
            Vertical vertical8 = new Vertical("SPARES", 7);
            f264394i = vertical8;
            Vertical vertical9 = new Vertical("CLOTHES", 8);
            f264395j = vertical9;
            Vertical vertical10 = new Vertical("KIDS", 9);
            f264396k = vertical10;
            Vertical vertical11 = new Vertical("HOBBY", 10);
            f264397l = vertical11;
            Vertical vertical12 = new Vertical("ANIMALS", 11);
            f264398m = vertical12;
            Vertical vertical13 = new Vertical("TRAVEL", 12);
            f264399n = vertical13;
            Vertical vertical14 = new Vertical("BUSINESS", 13);
            f264400o = vertical14;
            Vertical vertical15 = new Vertical("BEAUTY", 14);
            f264401p = vertical15;
            Vertical vertical16 = new Vertical("ALL", 15);
            f264402q = vertical16;
            Vertical[] verticalArr = {vertical, vertical2, vertical3, vertical4, vertical5, vertical6, vertical7, vertical8, vertical9, vertical10, vertical11, vertical12, vertical13, vertical14, vertical15, vertical16};
            f264403r = verticalArr;
            f264404s = kotlin.enums.c.a(verticalArr);
        }

        public Vertical() {
            throw null;
        }

        public static Vertical valueOf(String str) {
            return (Vertical) Enum.valueOf(Vertical.class, str);
        }

        public static Vertical[] values() {
            return (Vertical[]) f264403r.clone();
        }
    }

    /* compiled from: SearchFeedbackCampaign.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$a;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign;", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends SearchFeedbackCampaign {
        public a() {
            this(null, 1, null);
        }

        @Override // com.avito.android.search_ux_feedback.SearchFeedbackCampaign
        @k
        public final String b(@k Vertical vertical) {
            return SearchFeedbackCampaign.c("filterSearch", vertical);
        }

        public a(String str, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? null : str, null);
        }
    }

    /* compiled from: SearchFeedbackCampaign.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$b;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign;", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends SearchFeedbackCampaign {
        public b() {
            this(null, 1, null);
        }

        @Override // com.avito.android.search_ux_feedback.SearchFeedbackCampaign
        @k
        public final String b(@k Vertical vertical) {
            return SearchFeedbackCampaign.c("hintSearch", vertical);
        }

        public b(String str, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? null : str, null);
        }
    }

    /* compiled from: SearchFeedbackCampaign.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$c;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign;", "<init>", "()V", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends SearchFeedbackCampaign {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f264405b = new c();

        public c() {
            super(null, null);
        }

        @Override // com.avito.android.search_ux_feedback.SearchFeedbackCampaign
        @k
        public final String b(@k Vertical vertical) {
            return "app_moto_filters";
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -353034436;
        }

        @k
        public final String toString() {
            return "MotoTransportSearch";
        }
    }

    /* compiled from: SearchFeedbackCampaign.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$d;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign;", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends SearchFeedbackCampaign {
        public d() {
            this(null, 1, null);
        }

        @Override // com.avito.android.search_ux_feedback.SearchFeedbackCampaign
        @k
        public final String b(@k Vertical vertical) {
            return SearchFeedbackCampaign.c("querySearch", vertical);
        }

        public d(String str, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? null : str, null);
        }
    }

    /* compiled from: SearchFeedbackCampaign.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$e;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign;", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends SearchFeedbackCampaign {
        public e() {
            this(null, 1, null);
        }

        @Override // com.avito.android.search_ux_feedback.SearchFeedbackCampaign
        @k
        public final String b(@k Vertical vertical) {
            return SearchFeedbackCampaign.c("searchResult", vertical);
        }

        public e(String str, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? null : str, null);
        }
    }

    /* compiled from: SearchFeedbackCampaign.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$f;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign;", "<init>", "()V", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends SearchFeedbackCampaign {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final f f264406b = new f();

        public f() {
            super(null, null);
        }

        @Override // com.avito.android.search_ux_feedback.SearchFeedbackCampaign
        @k
        public final String b(@k Vertical vertical) {
            return "searchSubscription";
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 701506898;
        }

        @k
        public final String toString() {
            return "SearchSubscriptionFeedbackCampaign";
        }
    }

    /* compiled from: SearchFeedbackCampaign.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$g;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign;", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends SearchFeedbackCampaign {
        public g() {
            this(null, 1, null);
        }

        @Override // com.avito.android.search_ux_feedback.SearchFeedbackCampaign
        @k
        public final String b(@k Vertical vertical) {
            return SearchFeedbackCampaign.c("shortcutSearch", vertical);
        }

        public g(String str, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? null : str, null);
        }
    }

    /* compiled from: SearchFeedbackCampaign.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign$h;", "Lcom/avito/android/search_ux_feedback/SearchFeedbackCampaign;", "<init>", "()V", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h extends SearchFeedbackCampaign {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final h f264407b = new h();

        public h() {
            super(null, null);
        }

        @Override // com.avito.android.search_ux_feedback.SearchFeedbackCampaign
        @k
        public final String b(@k Vertical vertical) {
            return "app_water_filters";
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1751602510;
        }

        @k
        public final String toString() {
            return "WaterTransportSearch";
        }
    }

    /* compiled from: SearchFeedbackCampaign.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i {
        static {
            int[] iArr = new int[Vertical.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Vertical vertical = Vertical.f264387b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Vertical vertical2 = Vertical.f264387b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Vertical vertical3 = Vertical.f264387b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Vertical vertical4 = Vertical.f264387b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Vertical vertical5 = Vertical.f264387b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Vertical vertical6 = Vertical.f264387b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Vertical vertical7 = Vertical.f264387b;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Vertical vertical8 = Vertical.f264387b;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Vertical vertical9 = Vertical.f264387b;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Vertical vertical10 = Vertical.f264387b;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Vertical vertical11 = Vertical.f264387b;
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Vertical vertical12 = Vertical.f264387b;
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                Vertical vertical13 = Vertical.f264387b;
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                Vertical vertical14 = Vertical.f264387b;
                iArr[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                Vertical vertical15 = Vertical.f264387b;
                iArr[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public SearchFeedbackCampaign(String str, C42822w c42822w) {
        this.f264386a = str;
    }

    @k
    public static String c(@k String str, @k Vertical vertical) {
        String str2;
        switch (vertical.ordinal()) {
            case 0:
                str2 = "Realty";
                break;
            case 1:
                str2 = "Auto";
                break;
            case 2:
                str2 = "General";
                break;
            case 3:
                str2 = "Job";
                break;
            case 4:
                str2 = "Services";
                break;
            case 5:
                str2 = "Electronics";
                break;
            case 6:
                str2 = "ForHome";
                break;
            case 7:
                str2 = "Spares";
                break;
            case 8:
                str2 = "Clothes";
                break;
            case 9:
                str2 = "Kids";
                break;
            case 10:
                str2 = "Hobby";
                break;
            case 11:
                str2 = "Animals";
                break;
            case 12:
                str2 = "Travel";
                break;
            case 13:
                str2 = "Business";
                break;
            case 14:
                str2 = "Beauty";
                break;
            case 15:
                str2 = "";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return str.concat(str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x005f. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0315  */
    @Override // SK0.c
    @Y61.k
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getF442240a() {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search_ux_feedback.SearchFeedbackCampaign.getF442240a():java.lang.String");
    }

    @k
    public abstract String b(@k Vertical vertical);
}
