package com.avito.android.credits.models;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.credits.v;
import com.avito.android.remote.model.credit_broker.CalculatorPosition;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import com.avito.android.remote.model.text.AttributedText;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CreditCalculator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/models/CreditCalculator;", "", "Type", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CreditCalculator {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f128951a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f128952b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f128953c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f128954d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f128955e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f128956f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Type f128957g;

    /* renamed from: h, reason: collision with root package name */
    public final float f128958h;

    /* renamed from: i, reason: collision with root package name */
    public final int f128959i;

    /* renamed from: j, reason: collision with root package name */
    public final int f128960j;

    /* renamed from: k, reason: collision with root package name */
    public final int f128961k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final CalculatorPosition f128962l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Uri f128963m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f128964n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final v f128965o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final NumberFormat f128966p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final DecimalFormat f128967q;

    /* renamed from: r, reason: collision with root package name */
    public final int f128968r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final int[] f128969s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final String f128970t;

    /* renamed from: u, reason: collision with root package name */
    public int f128971u;

    /* renamed from: v, reason: collision with root package name */
    public int f128972v;

    /* renamed from: w, reason: collision with root package name */
    public int f128973w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public String f128974x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public String f128975y;

    /* renamed from: z, reason: collision with root package name */
    @k
    public String f128976z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCalculator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/models/CreditCalculator$Type;", "", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f128977b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f128978c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f128979d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f128980e;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f128981f;

        /* renamed from: g, reason: collision with root package name */
        public static final Type f128982g;

        /* renamed from: h, reason: collision with root package name */
        public static final Type f128983h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ Type[] f128984i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f128985j;

        static {
            Type type = new Type("TINKOFF_AUTO", 0);
            f128977b = type;
            Type type2 = new Type("TINKOFF_CASH", 1);
            f128978c = type2;
            Type type3 = new Type("INSTALLMENTS", 2);
            f128979d = type3;
            Type type4 = new Type("INSTALLMENTS_V2", 3);
            f128980e = type4;
            Type type5 = new Type("SBER_AUTO", 4);
            f128981f = type5;
            Type type6 = new Type("HARABA", 5);
            f128982g = type6;
            Type type7 = new Type("INSTALLMENTS_V3", 6);
            f128983h = type7;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            f128984i = typeArr;
            f128985j = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f128984i.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CreditCalculator(java.lang.String r20, com.avito.android.remote.model.text.AttributedText r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, com.avito.android.remote.model.text.AttributedText r25, com.avito.android.credits.models.CreditCalculator.Type r26, int r27, float r28, int r29, int r30, int r31, com.avito.android.remote.model.credit_broker.CalculatorPosition r32, android.net.Uri r33, boolean r34, int r35, int r36, int r37, com.avito.android.credits.utils.a r38, int r39, kotlin.jvm.internal.C42822w r40) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.credits.models.CreditCalculator.<init>(java.lang.String, com.avito.android.remote.model.text.AttributedText, java.lang.String, java.lang.String, java.lang.String, com.avito.android.remote.model.text.AttributedText, com.avito.android.credits.models.CreditCalculator$Type, int, float, int, int, int, com.avito.android.remote.model.credit_broker.CalculatorPosition, android.net.Uri, boolean, int, int, int, com.avito.android.credits.utils.a, int, kotlin.jvm.internal.w):void");
    }

    public final void c(int i12, int i13) {
        v vVar = this.f128965o;
        vVar.getClass();
        int iMin = Math.min(Math.max(i13, this.f128961k), this.f128968r);
        Integer numValueOf = Integer.valueOf(iMin);
        NumberFormat numberFormat = this.f128966p;
        this.f128976z = numberFormat.format(numValueOf);
        this.f128971u = iMin;
        int i14 = this.f128960j - iMin;
        if (!this.f128964n || i14 < 0) {
            i14 = 0;
        }
        this.f128975y = numberFormat.format(Integer.valueOf(i14));
        this.f128972v = i14;
        this.f128973w = i12;
        Integer numA = vVar.f129056a.a(this.f128958h, this.f128971u, i12);
        if (numA != null) {
            this.f128974x = numberFormat.format(Integer.valueOf(numA.intValue()));
        }
    }

    @l
    public abstract String d();

    @l
    public EntryPoint e() {
        return null;
    }

    @l
    public String f() {
        return null;
    }
}
