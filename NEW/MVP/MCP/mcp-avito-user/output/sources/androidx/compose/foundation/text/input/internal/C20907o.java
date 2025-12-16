package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.i;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChangeTracker.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/o;", "Landroidx/compose/foundation/text/input/i$a;", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20907o implements i.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public androidx.compose.runtime.collection.e<a> f31175a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public androidx.compose.runtime.collection.e<a> f31176b;

    /* compiled from: ChangeTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/o$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.input.internal.o$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public int f31177a;

        /* renamed from: b, reason: collision with root package name */
        public int f31178b;

        /* renamed from: c, reason: collision with root package name */
        public int f31179c;

        /* renamed from: d, reason: collision with root package name */
        public int f31180d;

        public a(int i12, int i13, int i14, int i15) {
            this.f31177a = i12;
            this.f31178b = i13;
            this.f31179c = i14;
            this.f31180d = i15;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31177a == aVar.f31177a && this.f31178b == aVar.f31178b && this.f31179c == aVar.f31179c && this.f31180d == aVar.f31180d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f31180d) + androidx.appcompat.app.r.e(this.f31179c, androidx.appcompat.app.r.e(this.f31178b, Integer.hashCode(this.f31177a) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Change(preStart=");
            sb2.append(this.f31177a);
            sb2.append(", preEnd=");
            sb2.append(this.f31178b);
            sb2.append(", originalStart=");
            sb2.append(this.f31179c);
            sb2.append(", originalEnd=");
            return androidx.appcompat.app.r.t(sb2, this.f31180d, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20907o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a(a aVar, int i12, int i13, int i14) {
        int i15;
        androidx.compose.runtime.collection.e<a> eVar = this.f31176b;
        int i16 = eVar.f38262d;
        if (i16 == 0) {
            i15 = 0;
        } else {
            if (i16 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            a aVar2 = eVar.f38260b[i16 - 1];
            i15 = aVar2.f31178b - aVar2.f31180d;
        }
        if (aVar == null) {
            int i17 = i12 - i15;
            aVar = new a(i12, i13 + i14, i17, (i13 - i12) + i17);
        } else {
            if (aVar.f31177a > i12) {
                aVar.f31177a = i12;
                aVar.f31179c = i12;
            }
            int i18 = aVar.f31178b;
            if (i13 > i18) {
                int i19 = i18 - aVar.f31180d;
                aVar.f31178b = i13;
                aVar.f31180d = i13 - i19;
            }
            aVar.f31178b += i14;
        }
        eVar.b(aVar);
    }

    public final void b() {
        this.f31175a.g();
    }

    public final long c(int i12) {
        a aVar = this.f31175a.f38260b[i12];
        return androidx.compose.ui.text.w0.a(aVar.f31179c, aVar.f31180d);
    }

    public final long d(int i12) {
        a aVar = this.f31175a.f38260b[i12];
        return androidx.compose.ui.text.w0.a(aVar.f31177a, aVar.f31178b);
    }

    public final void e(int i12, int i13, int i14) {
        int i15;
        if (i12 == i13 && i14 == 0) {
            return;
        }
        int iMin = Math.min(i12, i13);
        int iMax = Math.max(i12, i13);
        int i16 = i14 - (iMax - iMin);
        int i17 = 0;
        a aVar = null;
        boolean z12 = false;
        while (true) {
            androidx.compose.runtime.collection.e<a> eVar = this.f31175a;
            if (i17 >= eVar.f38262d) {
                break;
            }
            a aVar2 = eVar.f38260b[i17];
            int i18 = aVar2.f31177a;
            if ((iMin > i18 || i18 > iMax) && ((iMin > (i15 = aVar2.f31178b) || i15 > iMax) && ((iMin > i15 || i18 > iMin) && (iMax > i15 || i18 > iMax)))) {
                if (i18 > iMax && !z12) {
                    a(aVar, iMin, iMax, i16);
                    z12 = true;
                }
                if (z12) {
                    aVar2.f31177a += i16;
                    aVar2.f31178b += i16;
                }
                this.f31176b.b(aVar2);
            } else if (aVar == null) {
                aVar = aVar2;
            } else {
                aVar.f31178b = aVar2.f31178b;
                aVar.f31180d = aVar2.f31180d;
            }
            i17++;
        }
        if (!z12) {
            a(aVar, iMin, iMax, i16);
        }
        androidx.compose.runtime.collection.e<a> eVar2 = this.f31175a;
        this.f31175a = this.f31176b;
        this.f31176b = eVar2;
        eVar2.g();
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeList(changes=[");
        androidx.compose.runtime.collection.e<a> eVar = this.f31175a;
        a[] aVarArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            a aVar = aVarArr[i13];
            sb2.append("(" + aVar.f31179c + ',' + aVar.f31180d + ")->(" + aVar.f31177a + ',' + aVar.f31178b + ')');
            if (i13 < this.f31175a.f38262d - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    public C20907o(@Y61.l C20907o c20907o) {
        androidx.compose.runtime.collection.e<a> eVar;
        this.f31175a = new androidx.compose.runtime.collection.e<>(new a[16], 0);
        this.f31176b = new androidx.compose.runtime.collection.e<>(new a[16], 0);
        if (c20907o == null || (eVar = c20907o.f31175a) == null) {
            return;
        }
        a[] aVarArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            a aVar = aVarArr[i13];
            this.f31175a.b(new a(aVar.f31177a, aVar.f31178b, aVar.f31179c, aVar.f31180d));
        }
    }

    public /* synthetic */ C20907o(C20907o c20907o, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : c20907o);
    }
}
