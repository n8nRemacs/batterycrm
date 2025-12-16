package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: Composer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/N1;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class N1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f38055a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38056b;

    /* renamed from: c, reason: collision with root package name */
    public int f38057c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f38058d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.A0<B0> f38059e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f38060f;

    public N1(int i12, @Y61.k ArrayList arrayList) {
        this.f38055a = arrayList;
        this.f38056b = i12;
        if (i12 < 0) {
            P1.a("Invalid start index");
        }
        this.f38058d = new ArrayList();
        androidx.collection.A0<B0> a02 = new androidx.collection.A0<>(0, 1, null);
        int size = arrayList.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            O0 o02 = (O0) this.f38055a.get(i14);
            int i15 = o02.f38065c;
            int i16 = o02.f38066d;
            a02.h(i15, new B0(i14, i13, i16));
            i13 += i16;
        }
        this.f38059e = a02;
        this.f38060f = C42727D.c(new M1(this));
    }

    public final boolean a(int i12, int i13) {
        int i14;
        androidx.collection.A0<B0> a02 = this.f38059e;
        B0 b0B = a02.b(i12);
        if (b0B == null) {
            return false;
        }
        int i15 = b0B.f37927b;
        int i16 = i13 - b0B.f37928c;
        b0B.f37928c = i13;
        if (i16 == 0) {
            return true;
        }
        Object[] objArr = a02.f25555c;
        long[] jArr = a02.f25553a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i17 = 0;
        while (true) {
            long j12 = jArr[i17];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i18 = 8 - ((~(i17 - length)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((255 & j12) < 128) {
                        B0 b02 = (B0) objArr[(i17 << 3) + i19];
                        if (b02.f37927b >= i15 && !b02.equals(b0B) && (i14 = b02.f37927b + i16) >= 0) {
                            b02.f37927b = i14;
                        }
                    }
                    j12 >>= 8;
                }
                if (i18 != 8) {
                    return true;
                }
            }
            if (i17 == length) {
                return true;
            }
            i17++;
        }
    }
}
