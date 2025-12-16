package com.airbnb.lottie.compose;

import com.airbnb.lottie.C27291k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LottieClipSpec.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/airbnb/lottie/compose/s;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/airbnb/lottie/compose/s$a;", "Lcom/airbnb/lottie/compose/s$b;", "Lcom/airbnb/lottie/compose/s$c;", "Lcom/airbnb/lottie/compose/s$d;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.airbnb.lottie.compose.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC27282s {

    /* compiled from: LottieClipSpec.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/s$a;", "Lcom/airbnb/lottie/compose/s;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.s$a */
    public static final /* data */ class a extends AbstractC27282s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Integer f59535a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f59536b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f59537c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f59538d;

        public a() {
            this(null, null, false, 7, null);
        }

        @Override // com.airbnb.lottie.compose.AbstractC27282s
        public final float a(@Y61.k C27291k c27291k) {
            if (this.f59538d == null) {
                return 1.0f;
            }
            return kotlin.ranges.s.f(r1.intValue() / c27291k.f59594m, 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.AbstractC27282s
        public final float b(@Y61.k C27291k c27291k) {
            if (this.f59535a == null) {
                return 0.0f;
            }
            return kotlin.ranges.s.f(r1.intValue() / c27291k.f59594m, 0.0f, 1.0f);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f59535a, aVar.f59535a) && kotlin.jvm.internal.L.f(this.f59536b, aVar.f59536b) && this.f59537c == aVar.f59537c;
        }

        public final int hashCode() {
            Integer num = this.f59535a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f59536b;
            return Boolean.hashCode(this.f59537c) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Frame(min=");
            sb2.append(this.f59535a);
            sb2.append(", max=");
            sb2.append(this.f59536b);
            sb2.append(", maxInclusive=");
            return androidx.appcompat.app.r.s(")", sb2, this.f59537c);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Integer num, Integer num2, boolean z12, int i12, C42822w c42822w) {
            Object[] objArr = 0;
            num = (i12 & 1) != 0 ? null : num;
            num2 = (i12 & 2) != 0 ? null : num2;
            z12 = (i12 & 4) != 0 ? true : z12;
            super(objArr == true ? 1 : 0);
            this.f59535a = num;
            this.f59536b = num2;
            this.f59537c = z12;
            this.f59538d = num2 != null ? z12 ? num2 : Integer.valueOf(num2.intValue() - 1) : null;
        }
    }

    /* compiled from: LottieClipSpec.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/s$b;", "Lcom/airbnb/lottie/compose/s;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.s$b */
    public static final /* data */ class b extends AbstractC27282s {
        @Override // com.airbnb.lottie.compose.AbstractC27282s
        public final float a(@Y61.k C27291k c27291k) {
            O2.g gVarD = c27291k.d(null);
            if (gVarD == null) {
                return 1.0f;
            }
            return kotlin.ranges.s.f((gVarD.f11947b + gVarD.f11948c) / c27291k.f59594m, 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.AbstractC27282s
        public final float b(@Y61.k C27291k c27291k) {
            O2.g gVarD = c27291k.d(null);
            return kotlin.ranges.s.f((gVarD != null ? gVarD.f11947b : 0.0f) / c27291k.f59594m, 0.0f, 1.0f);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "Marker(marker=null)";
        }
    }

    /* compiled from: LottieClipSpec.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/s$c;", "Lcom/airbnb/lottie/compose/s;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.s$c */
    public static final /* data */ class c extends AbstractC27282s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f59539a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f59540b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f59541c;

        public c() {
            this(null, null, false, 7, null);
        }

        @Override // com.airbnb.lottie.compose.AbstractC27282s
        public final float a(@Y61.k C27291k c27291k) {
            String str = this.f59540b;
            if (str == null) {
                return 1.0f;
            }
            int i12 = this.f59541c ? 0 : -1;
            O2.g gVarD = c27291k.d(str);
            return kotlin.ranges.s.f((gVarD != null ? gVarD.f11947b + i12 : 0.0f) / c27291k.f59594m, 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.AbstractC27282s
        public final float b(@Y61.k C27291k c27291k) {
            String str = this.f59539a;
            if (str == null) {
                return 0.0f;
            }
            O2.g gVarD = c27291k.d(str);
            return kotlin.ranges.s.f((gVarD != null ? gVarD.f11947b : 0.0f) / c27291k.f59594m, 0.0f, 1.0f);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.L.f(this.f59539a, cVar.f59539a) && kotlin.jvm.internal.L.f(this.f59540b, cVar.f59540b) && this.f59541c == cVar.f59541c;
        }

        public final int hashCode() {
            String str = this.f59539a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f59540b;
            return Boolean.hashCode(this.f59541c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Markers(min=");
            sb2.append(this.f59539a);
            sb2.append(", max=");
            sb2.append(this.f59540b);
            sb2.append(", maxInclusive=");
            return androidx.appcompat.app.r.s(")", sb2, this.f59541c);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(String str, String str2, boolean z12, int i12, C42822w c42822w) {
            C42822w c42822w2 = null;
            str = (i12 & 1) != 0 ? null : str;
            str2 = (i12 & 2) != 0 ? null : str2;
            z12 = (i12 & 4) != 0 ? true : z12;
            super(c42822w2);
            this.f59539a = str;
            this.f59540b = str2;
            this.f59541c = z12;
        }
    }

    /* compiled from: LottieClipSpec.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/s$d;", "Lcom/airbnb/lottie/compose/s;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.s$d */
    public static final /* data */ class d extends AbstractC27282s {

        /* renamed from: a, reason: collision with root package name */
        public final float f59542a;

        /* renamed from: b, reason: collision with root package name */
        public final float f59543b;

        public d() {
            this(0.0f, 0.0f, 3, null);
        }

        @Override // com.airbnb.lottie.compose.AbstractC27282s
        public final float a(@Y61.k C27291k c27291k) {
            return this.f59543b;
        }

        @Override // com.airbnb.lottie.compose.AbstractC27282s
        public final float b(@Y61.k C27291k c27291k) {
            return this.f59542a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Float.compare(this.f59542a, dVar.f59542a) == 0 && Float.compare(this.f59543b, dVar.f59543b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f59543b) + (Float.hashCode(this.f59542a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "Progress(min=" + this.f59542a + ", max=" + this.f59543b + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f12, float f13, int i12, C42822w c42822w) {
            super(null);
            f12 = (i12 & 1) != 0 ? 0.0f : f12;
            f13 = (i12 & 2) != 0 ? 1.0f : f13;
            this.f59542a = f12;
            this.f59543b = f13;
        }
    }

    public /* synthetic */ AbstractC27282s(C42822w c42822w) {
        this();
    }

    public abstract float a(@Y61.k C27291k c27291k);

    public abstract float b(@Y61.k C27291k c27291k);

    public AbstractC27282s() {
    }
}
