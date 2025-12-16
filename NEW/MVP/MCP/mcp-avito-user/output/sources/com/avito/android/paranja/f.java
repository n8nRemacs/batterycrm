package com.avito.android.paranja;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ParanjaStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/paranja/f;", "", "a", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f210871a;

    /* renamed from: b, reason: collision with root package name */
    public final int f210872b;

    /* renamed from: c, reason: collision with root package name */
    public final float f210873c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final KV.a f210874d;

    /* compiled from: ParanjaStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paranja/f$a;", "", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f210875a;

        /* renamed from: b, reason: collision with root package name */
        public final int f210876b;

        /* renamed from: c, reason: collision with root package name */
        public final int f210877c;

        /* renamed from: d, reason: collision with root package name */
        public final int f210878d;

        public a() {
            this(0, 0, 0, 0, 15, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f210875a == aVar.f210875a && this.f210876b == aVar.f210876b && this.f210877c == aVar.f210877c && this.f210878d == aVar.f210878d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f210878d) + r.e(this.f210877c, r.e(this.f210876b, Integer.hashCode(this.f210875a) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Padding(start=");
            sb2.append(this.f210875a);
            sb2.append(", end=");
            sb2.append(this.f210876b);
            sb2.append(", top=");
            sb2.append(this.f210877c);
            sb2.append(", bottom=");
            return r.t(sb2, this.f210878d, ')');
        }

        public a(int i12, int i13, int i14, int i15) {
            this.f210875a = i12;
            this.f210876b = i13;
            this.f210877c = i14;
            this.f210878d = i15;
        }

        public /* synthetic */ a(int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
            this((i16 & 1) != 0 ? 0 : i12, (i16 & 2) != 0 ? 0 : i13, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(int i12, int i13, C42822w c42822w) {
            i12 = (i13 & 1) != 0 ? 0 : i12;
            this(i12, i12, i12, i12);
        }
    }

    public f() {
        this(null, 0, 0.0f, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f210871a, fVar.f210871a) && this.f210872b == fVar.f210872b && Float.compare(this.f210873c, fVar.f210873c) == 0 && L.f(this.f210874d, fVar.f210874d);
    }

    public final int hashCode() {
        int iD2 = r.d(this.f210873c, r.e(this.f210872b, this.f210871a.hashCode() * 31, 31), 31);
        KV.a aVar = this.f210874d;
        return iD2 + (aVar == null ? 0 : aVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ParanjaStyle(padding=" + this.f210871a + ", shadowColor=" + this.f210872b + ", cornerRadius=" + this.f210873c + ", tooltipStyle=" + this.f210874d + ')';
    }

    public f(@Y61.k a aVar, int i12, float f12, @Y61.l KV.a aVar2) {
        this.f210871a = aVar;
        this.f210872b = i12;
        this.f210873c = f12;
        this.f210874d = aVar2;
    }

    public /* synthetic */ f(a aVar, int i12, float f12, KV.a aVar2, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? new a(0, 1, null) : aVar, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? 0.0f : f12, (i13 & 8) != 0 ? null : aVar2);
    }
}
