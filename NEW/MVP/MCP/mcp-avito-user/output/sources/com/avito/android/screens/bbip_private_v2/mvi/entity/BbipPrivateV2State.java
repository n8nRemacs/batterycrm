package com.avito.android.screens.bbip_private_v2.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;
import wZ.C49582f;

/* compiled from: BbipPrivateV2State.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "f", "g", "SegmentsBlock", "h", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BbipPrivateV2State extends q {

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final d f261013s = new d(null);

    /* renamed from: t, reason: collision with root package name */
    @k
    public static final BbipPrivateV2State f261014t = new BbipPrivateV2State(null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, 131071, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final uZ.e f261015b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final f f261016c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final e f261017d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final b f261018e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final c f261019f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final c f261020g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f261021h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f261022i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f261023j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f261024k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final wZ.g f261025l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f261026m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f261027n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final SegmentsBlock f261028o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final h f261029p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final List<g> f261030q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final a f261031r;

    /* compiled from: BbipPrivateV2State.kt */
    @H0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$SegmentsBlock;", "", "Segment", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SegmentsBlock {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Segment> f261032a;

        /* renamed from: b, reason: collision with root package name */
        public final int f261033b;

        /* compiled from: BbipPrivateV2State.kt */
        @H0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$SegmentsBlock$Segment;", "", "Type", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Segment {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f261034a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Type f261035b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: BbipPrivateV2State.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$SegmentsBlock$Segment$Type;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Type {

                /* renamed from: b, reason: collision with root package name */
                public static final Type f261036b;

                /* renamed from: c, reason: collision with root package name */
                public static final Type f261037c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ Type[] f261038d;

                /* renamed from: e, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f261039e;

                static {
                    Type type = new Type("PRESETS", 0);
                    f261036b = type;
                    Type type2 = new Type("MANUAL", 1);
                    f261037c = type2;
                    Type[] typeArr = {type, type2};
                    f261038d = typeArr;
                    f261039e = kotlin.enums.c.a(typeArr);
                }

                public Type() {
                    throw null;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) f261038d.clone();
                }
            }

            public Segment(@k String str, @k Type type) {
                this.f261034a = str;
                this.f261035b = type;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Segment)) {
                    return false;
                }
                Segment segment = (Segment) obj;
                return L.f(this.f261034a, segment.f261034a) && this.f261035b == segment.f261035b;
            }

            public final int hashCode() {
                return this.f261035b.hashCode() + (this.f261034a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "Segment(title=" + this.f261034a + ", type=" + this.f261035b + ')';
            }
        }

        public SegmentsBlock(@k List<Segment> list, int i12) {
            this.f261032a = list;
            this.f261033b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SegmentsBlock)) {
                return false;
            }
            SegmentsBlock segmentsBlock = (SegmentsBlock) obj;
            return L.f(this.f261032a, segmentsBlock.f261032a) && this.f261033b == segmentsBlock.f261033b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f261033b) + (this.f261032a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SegmentsBlock(segments=");
            sb2.append(this.f261032a);
            sb2.append(", selectedSegmentIndex=");
            return r.t(sb2, this.f261033b, ')');
        }
    }

    /* compiled from: BbipPrivateV2State.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f261040a;

        /* renamed from: b, reason: collision with root package name */
        public final float f261041b;

        /* renamed from: c, reason: collision with root package name */
        public final int f261042c;

        public a(float f12, float f13, int i12) {
            this.f261040a = f12;
            this.f261041b = f13;
            this.f261042c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f261040a, aVar.f261040a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f261041b, aVar.f261041b) == 0 && this.f261042c == aVar.f261042c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f261042c) + r.d(this.f261041b, r.d(0.0f, Float.hashCode(this.f261040a) * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BbipBudgetSliderState(value=");
            sb2.append(this.f261040a);
            sb2.append(", min=0.0, max=");
            sb2.append(this.f261041b);
            sb2.append(", stepsCount=");
            return r.t(sb2, this.f261042c, ')');
        }
    }

    /* compiled from: BbipPrivateV2State.kt */
    @H0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$b;", "", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f261043a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<a> f261044b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final a.C7820a f261045c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final a.C7820a f261046d;

        /* compiled from: BbipPrivateV2State.kt */
        @H0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$b$a;", "", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            public final int f261047a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<C7820a> f261048b;

            /* compiled from: BbipPrivateV2State.kt */
            @H0
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$b$a$a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$b$a$a, reason: collision with other inner class name */
            public static final /* data */ class C7820a {

                /* renamed from: a, reason: collision with root package name */
                public final int f261049a;

                /* renamed from: b, reason: collision with root package name */
                @l
                public final Long f261050b;

                /* renamed from: c, reason: collision with root package name */
                @l
                public final String f261051c;

                /* renamed from: d, reason: collision with root package name */
                @l
                public final Long f261052d;

                /* renamed from: e, reason: collision with root package name */
                @l
                public final String f261053e;

                /* renamed from: f, reason: collision with root package name */
                @l
                public final Long f261054f;

                /* renamed from: g, reason: collision with root package name */
                @l
                public final String f261055g;

                /* renamed from: h, reason: collision with root package name */
                @l
                public final Long f261056h;

                /* renamed from: i, reason: collision with root package name */
                @l
                public final Long f261057i;

                /* renamed from: j, reason: collision with root package name */
                @l
                public final String f261058j;

                /* renamed from: k, reason: collision with root package name */
                @l
                public final String f261059k;

                /* renamed from: l, reason: collision with root package name */
                @l
                public final String f261060l;

                /* renamed from: m, reason: collision with root package name */
                @l
                public final C49582f f261061m;

                public C7820a(int i12, @l Long l12, @l String str, @l Long l13, @l String str2, @l Long l14, @l String str3, @l Long l15, @l Long l16, @l String str4, @l String str5, @l String str6, @l C49582f c49582f) {
                    this.f261049a = i12;
                    this.f261050b = l12;
                    this.f261051c = str;
                    this.f261052d = l13;
                    this.f261053e = str2;
                    this.f261054f = l14;
                    this.f261055g = str3;
                    this.f261056h = l15;
                    this.f261057i = l16;
                    this.f261058j = str4;
                    this.f261059k = str5;
                    this.f261060l = str6;
                    this.f261061m = c49582f;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C7820a)) {
                        return false;
                    }
                    C7820a c7820a = (C7820a) obj;
                    return this.f261049a == c7820a.f261049a && L.f(this.f261050b, c7820a.f261050b) && L.f(this.f261051c, c7820a.f261051c) && L.f(this.f261052d, c7820a.f261052d) && L.f(this.f261053e, c7820a.f261053e) && L.f(this.f261054f, c7820a.f261054f) && L.f(this.f261055g, c7820a.f261055g) && L.f(this.f261056h, c7820a.f261056h) && L.f(this.f261057i, c7820a.f261057i) && L.f(this.f261058j, c7820a.f261058j) && L.f(this.f261059k, c7820a.f261059k) && L.f(this.f261060l, c7820a.f261060l) && L.f(this.f261061m, c7820a.f261061m);
                }

                public final int hashCode() {
                    int iHashCode = Integer.hashCode(this.f261049a) * 31;
                    Long l12 = this.f261050b;
                    int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
                    String str = this.f261051c;
                    int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    Long l13 = this.f261052d;
                    int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
                    String str2 = this.f261053e;
                    int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Long l14 = this.f261054f;
                    int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
                    String str3 = this.f261055g;
                    int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    Long l15 = this.f261056h;
                    int iHashCode8 = (iHashCode7 + (l15 == null ? 0 : l15.hashCode())) * 31;
                    Long l16 = this.f261057i;
                    int iHashCode9 = (iHashCode8 + (l16 == null ? 0 : l16.hashCode())) * 31;
                    String str4 = this.f261058j;
                    int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.f261059k;
                    int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
                    String str6 = this.f261060l;
                    int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
                    C49582f c49582f = this.f261061m;
                    return iHashCode12 + (c49582f != null ? c49582f.hashCode() : 0);
                }

                @k
                public final String toString() {
                    return "BudgetItem(id=" + this.f261049a + ", price=" + this.f261050b + ", priceFormatted=" + this.f261051c + ", budget=" + this.f261052d + ", budgetFormatted=" + this.f261053e + ", discountPct=" + this.f261054f + ", discountPctFormatted=" + this.f261055g + ", dailyPrice=" + this.f261056h + ", dailyBudget=" + this.f261057i + ", dailyPriceFormatted=" + this.f261058j + ", dailyBudgetFormatted=" + this.f261059k + ", forecast=" + this.f261060l + ", contact=" + this.f261061m + ')';
                }
            }

            public a(int i12, @k List<C7820a> list) {
                this.f261047a = i12;
                this.f261048b = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f261047a == aVar.f261047a && L.f(this.f261048b, aVar.f261048b);
            }

            public final int hashCode() {
                return this.f261048b.hashCode() + (Integer.hashCode(this.f261047a) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("BudgetsByDay(duration=");
                sb2.append(this.f261047a);
                sb2.append(", budgets=");
                return H.p(sb2, this.f261048b, ')');
            }
        }

        public b(@k String str, @k List<a> list, @l a.C7820a c7820a, @l a.C7820a c7820a2) {
            this.f261043a = str;
            this.f261044b = list;
            this.f261045c = c7820a;
            this.f261046d = c7820a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(b bVar, ArrayList arrayList, a.C7820a c7820a, int i12) {
            String str = bVar.f261043a;
            List list = arrayList;
            if ((i12 & 2) != 0) {
                list = bVar.f261044b;
            }
            a.C7820a c7820a2 = bVar.f261045c;
            bVar.getClass();
            return new b(str, list, c7820a2, c7820a);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f261043a, bVar.f261043a) && L.f(this.f261044b, bVar.f261044b) && L.f(this.f261045c, bVar.f261045c) && L.f(this.f261046d, bVar.f261046d);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f261043a.hashCode() * 31, 31, this.f261044b);
            a.C7820a c7820a = this.f261045c;
            int iHashCode = (iE2 + (c7820a == null ? 0 : c7820a.hashCode())) * 31;
            a.C7820a c7820a2 = this.f261046d;
            return iHashCode + (c7820a2 != null ? c7820a2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "BudgetBlock(title=" + this.f261043a + ", budgetsByDayList=" + this.f261044b + ", preselectedBudget=" + this.f261045c + ", selectedBudget=" + this.f261046d + ')';
        }
    }

    /* compiled from: BbipPrivateV2State.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$c;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f261062a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f261063b;

        public c(@k String str, @l DeepLink deepLink) {
            this.f261062a = str;
            this.f261063b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f261062a, cVar.f261062a) && L.f(this.f261063b, cVar.f261063b);
        }

        public final int hashCode() {
            int iHashCode = this.f261062a.hashCode() * 31;
            DeepLink deepLink = this.f261063b;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonAction(title=");
            sb2.append(this.f261062a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f261063b, ')');
        }
    }

    /* compiled from: BbipPrivateV2State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$d;", "", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: BbipPrivateV2State.kt */
    @H0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$e;", "", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f261064a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Integer> f261065b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<Integer> f261066c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f261067d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final a f261068e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f261069f;

        /* renamed from: g, reason: collision with root package name */
        public final int f261070g;

        /* compiled from: BbipPrivateV2State.kt */
        @H0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$e$a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f261071a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f261072b;

            /* renamed from: c, reason: collision with root package name */
            public final int f261073c;

            /* renamed from: d, reason: collision with root package name */
            public final int f261074d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final String f261075e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final String f261076f;

            public a(boolean z12, boolean z13, int i12, int i13, @l String str, @l String str2) {
                this.f261071a = z12;
                this.f261072b = z13;
                this.f261073c = i12;
                this.f261074d = i13;
                this.f261075e = str;
                this.f261076f = str2;
            }

            public static a a(a aVar, boolean z12, boolean z13, int i12) {
                if ((i12 & 1) != 0) {
                    z12 = aVar.f261071a;
                }
                int i13 = aVar.f261073c;
                int i14 = aVar.f261074d;
                String str = aVar.f261075e;
                String str2 = aVar.f261076f;
                aVar.getClass();
                return new a(z12, z13, i13, i14, str, str2);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f261071a == aVar.f261071a && this.f261072b == aVar.f261072b && this.f261073c == aVar.f261073c && this.f261074d == aVar.f261074d && L.f(this.f261075e, aVar.f261075e) && L.f(this.f261076f, aVar.f261076f);
            }

            public final int hashCode() {
                int iE2 = r.e(this.f261074d, r.e(this.f261073c, r.i(Boolean.hashCode(this.f261071a) * 31, 31, this.f261072b), 31), 31);
                String str = this.f261075e;
                int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f261076f;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DurationPicker(showPicker=");
                sb2.append(this.f261071a);
                sb2.append(", isLoading=");
                sb2.append(this.f261072b);
                sb2.append(", min=");
                sb2.append(this.f261073c);
                sb2.append(", max=");
                sb2.append(this.f261074d);
                sb2.append(", selectTitle=");
                sb2.append(this.f261075e);
                sb2.append(", selectButtonText=");
                return C22026a.c(sb2, this.f261076f, ')');
            }
        }

        public e(@k String str, @k List<Integer> list, @k List<Integer> list2, @l String str2, @k a aVar, @l Integer num, int i12) {
            this.f261064a = str;
            this.f261065b = list;
            this.f261066c = list2;
            this.f261067d = str2;
            this.f261068e = aVar;
            this.f261069f = num;
            this.f261070g = i12;
        }

        public static e a(e eVar, List list, a aVar, int i12, int i13) {
            String str = eVar.f261064a;
            if ((i13 & 2) != 0) {
                list = eVar.f261065b;
            }
            List list2 = list;
            List<Integer> list3 = eVar.f261066c;
            String str2 = eVar.f261067d;
            if ((i13 & 16) != 0) {
                aVar = eVar.f261068e;
            }
            a aVar2 = aVar;
            Integer num = eVar.f261069f;
            if ((i13 & 64) != 0) {
                i12 = eVar.f261070g;
            }
            eVar.getClass();
            return new e(str, list2, list3, str2, aVar2, num, i12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f261064a, eVar.f261064a) && L.f(this.f261065b, eVar.f261065b) && L.f(this.f261066c, eVar.f261066c) && L.f(this.f261067d, eVar.f261067d) && L.f(this.f261068e, eVar.f261068e) && L.f(this.f261069f, eVar.f261069f) && this.f261070g == eVar.f261070g;
        }

        public final int hashCode() {
            int iE2 = H.e(H.e(this.f261064a.hashCode() * 31, 31, this.f261065b), 31, this.f261066c);
            String str = this.f261067d;
            int iHashCode = (this.f261068e.hashCode() + ((iE2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Integer num = this.f261069f;
            return Integer.hashCode(this.f261070g) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DurationBlock(title=");
            sb2.append(this.f261064a);
            sb2.append(", durations=");
            sb2.append(this.f261065b);
            sb2.append(", recommended=");
            sb2.append(this.f261066c);
            sb2.append(", moreButtonLabel=");
            sb2.append(this.f261067d);
            sb2.append(", picker=");
            sb2.append(this.f261068e);
            sb2.append(", preselectedDuration=");
            sb2.append(this.f261069f);
            sb2.append(", selectedDuration=");
            return r.t(sb2, this.f261070g, ')');
        }
    }

    /* compiled from: BbipPrivateV2State.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$f;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f261077a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f261078b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f261079c;

        public f(@k String str, @l String str2, @l AttributedText attributedText) {
            this.f261077a = str;
            this.f261078b = str2;
            this.f261079c = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f261077a, fVar.f261077a) && L.f(this.f261078b, fVar.f261078b) && L.f(this.f261079c, fVar.f261079c);
        }

        public final int hashCode() {
            int iHashCode = this.f261077a.hashCode() * 31;
            String str = this.f261078b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.f261079c;
            return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HeaderBlock(title=");
            sb2.append(this.f261077a);
            sb2.append(", subTitle=");
            sb2.append(this.f261078b);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f261079c, ')');
        }
    }

    /* compiled from: BbipPrivateV2State.kt */
    @H0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$g;", "", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final a f261080a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f261081b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f261082c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final wZ.l f261083d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f261084e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f261085f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f261086g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f261087h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final C49582f f261088i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f261089j;

        /* compiled from: BbipPrivateV2State.kt */
        @H0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$g$a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            public final long f261090a;

            /* renamed from: b, reason: collision with root package name */
            public final int f261091b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Long f261092c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final Long f261093d;

            public a(long j12, int i12, @l Long l12, @l Long l13) {
                this.f261090a = j12;
                this.f261091b = i12;
                this.f261092c = l12;
                this.f261093d = l13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f261090a == aVar.f261090a && this.f261091b == aVar.f261091b && L.f(this.f261092c, aVar.f261092c) && L.f(this.f261093d, aVar.f261093d);
            }

            public final int hashCode() {
                int iE2 = r.e(this.f261091b, Long.hashCode(this.f261090a) * 31, 31);
                Long l12 = this.f261092c;
                int iHashCode = (iE2 + (l12 == null ? 0 : l12.hashCode())) * 31;
                Long l13 = this.f261093d;
                return iHashCode + (l13 != null ? l13.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Config(price=");
                sb2.append(this.f261090a);
                sb2.append(", duration=");
                sb2.append(this.f261091b);
                sb2.append(", budget=");
                sb2.append(this.f261092c);
                sb2.append(", discountPct=");
                return m.m(sb2, this.f261093d, ')');
            }
        }

        public g(@k a aVar, @k String str, @k String str2, @l wZ.l lVar, boolean z12, @l String str3, @l String str4, @l String str5, @l C49582f c49582f, @l String str6) {
            this.f261080a = aVar;
            this.f261081b = str;
            this.f261082c = str2;
            this.f261083d = lVar;
            this.f261084e = z12;
            this.f261085f = str3;
            this.f261086g = str4;
            this.f261087h = str5;
            this.f261088i = c49582f;
            this.f261089j = str6;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f261080a, gVar.f261080a) && L.f(this.f261081b, gVar.f261081b) && L.f(this.f261082c, gVar.f261082c) && L.f(this.f261083d, gVar.f261083d) && this.f261084e == gVar.f261084e && L.f(this.f261085f, gVar.f261085f) && L.f(this.f261086g, gVar.f261086g) && L.f(this.f261087h, gVar.f261087h) && L.f(this.f261088i, gVar.f261088i) && L.f(this.f261089j, gVar.f261089j);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f261080a.hashCode() * 31, 31, this.f261081b), 31, this.f261082c);
            wZ.l lVar = this.f261083d;
            int i12 = r.i((iD2 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f261084e);
            String str = this.f261085f;
            int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f261086g;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f261087h;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            C49582f c49582f = this.f261088i;
            int iHashCode4 = (iHashCode3 + (c49582f == null ? 0 : c49582f.hashCode())) * 31;
            String str4 = this.f261089j;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Preset(config=");
            sb2.append(this.f261080a);
            sb2.append(", title=");
            sb2.append(this.f261081b);
            sb2.append(", priceDurationFormatted=");
            sb2.append(this.f261082c);
            sb2.append(", iconUrl=");
            sb2.append(this.f261083d);
            sb2.append(", selected=");
            sb2.append(this.f261084e);
            sb2.append(", forecast=");
            sb2.append(this.f261085f);
            sb2.append(", discountPctFormatted=");
            sb2.append(this.f261086g);
            sb2.append(", oldPriceFormatted=");
            sb2.append(this.f261087h);
            sb2.append(", bblContacts=");
            sb2.append(this.f261088i);
            sb2.append(", additionalInfo=");
            return C22026a.c(sb2, this.f261089j, ')');
        }
    }

    /* compiled from: BbipPrivateV2State.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State$h;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f261094a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f261095b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f261096c;

        public h(@k String str, @k String str2, boolean z12) {
            this.f261094a = str;
            this.f261095b = str2;
            this.f261096c = z12;
        }

        public static h a(h hVar, boolean z12) {
            String str = hVar.f261094a;
            String str2 = hVar.f261095b;
            hVar.getClass();
            return new h(str, str2, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f261094a, hVar.f261094a) && L.f(this.f261095b, hVar.f261095b) && this.f261096c == hVar.f261096c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f261096c) + H.d(this.f261094a.hashCode() * 31, 31, this.f261095b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SummarySection(forecastTitle=");
            sb2.append(this.f261094a);
            sb2.append(", budgetTitle=");
            sb2.append(this.f261095b);
            sb2.append(", isForecastLoading=");
            return r.x(sb2, this.f261096c, ')');
        }
    }

    public BbipPrivateV2State() {
        this(null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BbipPrivateV2State a(BbipPrivateV2State bbipPrivateV2State, e eVar, b bVar, String str, boolean z12, boolean z13, wZ.g gVar, SegmentsBlock segmentsBlock, h hVar, ArrayList arrayList, a aVar, int i12) {
        uZ.e eVar2 = bbipPrivateV2State.f261015b;
        f fVar = bbipPrivateV2State.f261016c;
        e eVar3 = (i12 & 4) != 0 ? bbipPrivateV2State.f261017d : eVar;
        b bVar2 = (i12 & 8) != 0 ? bbipPrivateV2State.f261018e : bVar;
        c cVar = bbipPrivateV2State.f261019f;
        c cVar2 = bbipPrivateV2State.f261020g;
        String str2 = bbipPrivateV2State.f261021h;
        String str3 = (i12 & 128) != 0 ? bbipPrivateV2State.f261022i : str;
        boolean z14 = (i12 & 256) != 0 ? bbipPrivateV2State.f261023j : z12;
        boolean z15 = (i12 & 512) != 0 ? bbipPrivateV2State.f261024k : z13;
        wZ.g gVar2 = (i12 & 1024) != 0 ? bbipPrivateV2State.f261025l : gVar;
        String str4 = bbipPrivateV2State.f261026m;
        String str5 = bbipPrivateV2State.f261027n;
        SegmentsBlock segmentsBlock2 = (i12 & 8192) != 0 ? bbipPrivateV2State.f261028o : segmentsBlock;
        h hVar2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? bbipPrivateV2State.f261029p : hVar;
        List list = (i12 & 32768) != 0 ? bbipPrivateV2State.f261030q : arrayList;
        a aVar2 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? bbipPrivateV2State.f261031r : aVar;
        bbipPrivateV2State.getClass();
        return new BbipPrivateV2State(eVar2, fVar, eVar3, bVar2, cVar, cVar2, str2, str3, z14, z15, gVar2, str4, str5, segmentsBlock2, hVar2, list, aVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BbipPrivateV2State)) {
            return false;
        }
        BbipPrivateV2State bbipPrivateV2State = (BbipPrivateV2State) obj;
        return L.f(this.f261015b, bbipPrivateV2State.f261015b) && L.f(this.f261016c, bbipPrivateV2State.f261016c) && L.f(this.f261017d, bbipPrivateV2State.f261017d) && L.f(this.f261018e, bbipPrivateV2State.f261018e) && L.f(this.f261019f, bbipPrivateV2State.f261019f) && L.f(this.f261020g, bbipPrivateV2State.f261020g) && L.f(this.f261021h, bbipPrivateV2State.f261021h) && L.f(this.f261022i, bbipPrivateV2State.f261022i) && this.f261023j == bbipPrivateV2State.f261023j && this.f261024k == bbipPrivateV2State.f261024k && L.f(this.f261025l, bbipPrivateV2State.f261025l) && L.f(this.f261026m, bbipPrivateV2State.f261026m) && L.f(this.f261027n, bbipPrivateV2State.f261027n) && L.f(this.f261028o, bbipPrivateV2State.f261028o) && L.f(this.f261029p, bbipPrivateV2State.f261029p) && L.f(this.f261030q, bbipPrivateV2State.f261030q) && L.f(this.f261031r, bbipPrivateV2State.f261031r);
    }

    public final int hashCode() {
        uZ.e eVar = this.f261015b;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        f fVar = this.f261016c;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        e eVar2 = this.f261017d;
        int iHashCode3 = (iHashCode2 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        b bVar = this.f261018e;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.f261019f;
        int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f261020g;
        int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        String str = this.f261021h;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f261022i;
        int i12 = r.i(r.i((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f261023j), 31, this.f261024k);
        wZ.g gVar = this.f261025l;
        int iHashCode8 = (i12 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str3 = this.f261026m;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f261027n;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SegmentsBlock segmentsBlock = this.f261028o;
        int iHashCode11 = (iHashCode10 + (segmentsBlock == null ? 0 : segmentsBlock.hashCode())) * 31;
        h hVar = this.f261029p;
        int iE2 = H.e((iHashCode11 + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.f261030q);
        a aVar = this.f261031r;
        return iE2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BbipPrivateV2State(navBar=" + this.f261015b + ", header=" + this.f261016c + ", duration=" + this.f261017d + ", budget=" + this.f261018e + ", skipAction=" + this.f261019f + ", nextAction=" + this.f261020g + ", checkoutContext=" + this.f261021h + ", error=" + this.f261022i + ", isConfiguratorLoading=" + this.f261023j + ", isContextLoading=" + this.f261024k + ", floatingFooter=" + this.f261025l + ", nextActionUxFeedbackCampaignName=" + this.f261026m + ", skipActionUxFeedbackCampaignName=" + this.f261027n + ", segmentsBlock=" + this.f261028o + ", summarySection=" + this.f261029p + ", presets=" + this.f261030q + ", sliderState=" + this.f261031r + ')';
    }

    public BbipPrivateV2State(@l uZ.e eVar, @l f fVar, @l e eVar2, @l b bVar, @l c cVar, @l c cVar2, @l String str, @l String str2, boolean z12, boolean z13, @l wZ.g gVar, @l String str3, @l String str4, @l SegmentsBlock segmentsBlock, @l h hVar, @k List<g> list, @l a aVar) {
        this.f261015b = eVar;
        this.f261016c = fVar;
        this.f261017d = eVar2;
        this.f261018e = bVar;
        this.f261019f = cVar;
        this.f261020g = cVar2;
        this.f261021h = str;
        this.f261022i = str2;
        this.f261023j = z12;
        this.f261024k = z13;
        this.f261025l = gVar;
        this.f261026m = str3;
        this.f261027n = str4;
        this.f261028o = segmentsBlock;
        this.f261029p = hVar;
        this.f261030q = list;
        this.f261031r = aVar;
    }

    public BbipPrivateV2State(uZ.e eVar, f fVar, e eVar2, b bVar, c cVar, c cVar2, String str, String str2, boolean z12, boolean z13, wZ.g gVar, String str3, String str4, SegmentsBlock segmentsBlock, h hVar, List list, a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : eVar, (i12 & 2) != 0 ? null : fVar, (i12 & 4) != 0 ? null : eVar2, (i12 & 8) != 0 ? null : bVar, (i12 & 16) != 0 ? null : cVar, (i12 & 32) != 0 ? null : cVar2, (i12 & 64) != 0 ? null : str, (i12 & 128) != 0 ? null : str2, (i12 & 256) != 0 ? true : z12, (i12 & 512) != 0 ? false : z13, (i12 & 1024) != 0 ? null : gVar, (i12 & 2048) != 0 ? null : str3, (i12 & 4096) != 0 ? null : str4, (i12 & 8192) != 0 ? null : segmentsBlock, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : hVar, (i12 & 32768) != 0 ? C42784z0.f406748b : list, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : aVar);
    }
}
