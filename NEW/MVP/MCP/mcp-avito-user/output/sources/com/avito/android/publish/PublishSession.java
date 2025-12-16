package com.avito.android.publish;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishSession.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/PublishSession;", "", "()V", "StepType", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PublishSession {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PublishSession.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/PublishSession$StepType;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StepType {

        /* renamed from: e, reason: collision with root package name */
        public static final StepType f232003e;

        /* renamed from: f, reason: collision with root package name */
        public static final StepType f232004f;

        /* renamed from: g, reason: collision with root package name */
        public static final StepType f232005g;

        /* renamed from: h, reason: collision with root package name */
        public static final StepType f232006h;

        /* renamed from: i, reason: collision with root package name */
        public static final StepType f232007i;

        /* renamed from: j, reason: collision with root package name */
        public static final StepType f232008j;

        /* renamed from: k, reason: collision with root package name */
        public static final StepType f232009k;

        /* renamed from: l, reason: collision with root package name */
        public static final StepType f232010l;

        /* renamed from: m, reason: collision with root package name */
        public static final StepType f232011m;

        /* renamed from: n, reason: collision with root package name */
        public static final StepType f232012n;

        /* renamed from: o, reason: collision with root package name */
        public static final StepType f232013o;

        /* renamed from: p, reason: collision with root package name */
        public static final StepType f232014p;

        /* renamed from: q, reason: collision with root package name */
        public static final StepType f232015q;

        /* renamed from: r, reason: collision with root package name */
        public static final StepType f232016r;

        /* renamed from: s, reason: collision with root package name */
        public static final StepType f232017s;

        /* renamed from: t, reason: collision with root package name */
        public static final StepType f232018t;

        /* renamed from: u, reason: collision with root package name */
        public static final StepType f232019u;

        /* renamed from: v, reason: collision with root package name */
        public static final StepType f232020v;

        /* renamed from: w, reason: collision with root package name */
        public static final StepType f232021w;

        /* renamed from: x, reason: collision with root package name */
        public static final StepType f232022x;

        /* renamed from: y, reason: collision with root package name */
        public static final /* synthetic */ StepType[] f232023y;

        /* renamed from: z, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f232024z;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f232025b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f232026c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f232027d;

        static {
            StepType stepType = new StepType("PARAMS", 0, "params", null, true, 2, null);
            f232003e = stepType;
            StepType stepType2 = new StepType("PARAMS_ADDRESS", "params", AddressParameter.TYPE, 1, true);
            f232004f = stepType2;
            StepType stepType3 = new StepType("SELECT", 2, "select", null, true, 2, null);
            f232005g = stepType3;
            C42822w c42822w = null;
            String str = null;
            StepType stepType4 = new StepType("WIZARD", 3, "wizard", str, true, 2, c42822w);
            f232006h = stepType4;
            StepType stepType5 = new StepType("VIN", 4, "vin", null, true, 2, null);
            f232007i = stepType5;
            StepType stepType6 = new StepType("IMEI", "params", "imei", 5, true);
            f232008j = stepType6;
            StepType stepType7 = new StepType("FREE_DELIVERY", "params", "free_delivery", 6, true);
            f232009k = stepType7;
            StepType stepType8 = new StepType("PRICE_LIST", 7, "priceList", null, true, 2, null);
            f232010l = stepType8;
            StepType stepType9 = new StepType("PREMODERATION", 8, "premoderation", str, false, 6, c42822w);
            f232011m = stepType9;
            StepType stepType10 = new StepType("ACCORDION", 9, "accordion", null, false, 6, null);
            f232012n = stepType10;
            C42822w c42822w2 = null;
            boolean z12 = false;
            StepType stepType11 = new StepType("CONTACTS", 10, "contacts", null, z12, 6, c42822w2);
            f232013o = stepType11;
            C42822w c42822w3 = null;
            StepType stepType12 = new StepType("SUGGEST_CATEGORY", 11, "suggestCategory", null, true, 2, c42822w3);
            f232014p = stepType12;
            int i12 = 4;
            StepType stepType13 = new StepType("REQUEST_PRETEND", 12, "request", "pretend", z12, i12, c42822w2);
            f232015q = stepType13;
            int i13 = 4;
            boolean z13 = false;
            StepType stepType14 = new StepType("MERGED_PRETEND_PREMODERATION", 13, "merged_pretend_premoderation", "pretend", z13, i13, c42822w3);
            f232016r = stepType14;
            StepType stepType15 = new StepType("REQUEST_STEPS", 14, "request", "steps", z12, i12, c42822w2);
            f232017s = stepType15;
            StepType stepType16 = new StepType("REQUEST_PUBLISH", 15, "request", "publish", z13, i13, c42822w3);
            f232018t = stepType16;
            StepType stepType17 = new StepType("REQUEST_EDIT", 16, "request", "edit", z12, i12, c42822w2);
            f232019u = stepType17;
            StepType stepType18 = new StepType("REQUEST_SUGGEST_PARAMS", 17, "request", "suggest", z13, i13, c42822w3);
            f232020v = stepType18;
            StepType stepType19 = new StepType("RESTRICTION", 18, "restriction", null, z12, 6, c42822w2);
            f232021w = stepType19;
            StepType stepType20 = new StepType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 19, "unknown", null, false, 6, null);
            f232022x = stepType20;
            StepType[] stepTypeArr = {stepType, stepType2, stepType3, stepType4, stepType5, stepType6, stepType7, stepType8, stepType9, stepType10, stepType11, stepType12, stepType13, stepType14, stepType15, stepType16, stepType17, stepType18, stepType19, stepType20};
            f232023y = stepTypeArr;
            f232024z = kotlin.enums.c.a(stepTypeArr);
        }

        public StepType(String str, String str2, String str3, int i12, boolean z12) {
            this.f232025b = str2;
            this.f232026c = str3;
            this.f232027d = z12;
        }

        public static StepType valueOf(String str) {
            return (StepType) Enum.valueOf(StepType.class, str);
        }

        public static StepType[] values() {
            return (StepType[]) f232023y.clone();
        }

        @Override // java.lang.Enum
        @Y61.k
        public final String toString() {
            String str = this.f232026c;
            int length = str.length();
            String str2 = this.f232025b;
            if (length == 0) {
                return str2;
            }
            return str2 + '-' + str;
        }

        public /* synthetic */ StepType(String str, int i12, String str2, String str3, boolean z12, int i13, C42822w c42822w) {
            this(str, str2, (i13 & 2) != 0 ? "" : str3, i12, (i13 & 4) != 0 ? false : z12);
        }
    }

    static {
        new PublishSession();
    }
}
