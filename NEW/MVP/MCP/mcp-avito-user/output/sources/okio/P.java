package okio;

import java.util.ArrayList;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Options.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lokio/P;", "Lkotlin/collections/c;", "Lokio/o;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class P extends AbstractC42738c<C44805o> implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f420028e = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C44805o[] f420029c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final int[] f420030d;

    /* compiled from: Options.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/P$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a(long j12, C44802l c44802l, int i12, ArrayList arrayList, int i13, int i14, ArrayList arrayList2) {
            int i15;
            int i16;
            int i17;
            int i18;
            C44802l c44802l2;
            int i19 = i12;
            if (i13 >= i14) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i22 = i13; i22 < i14; i22++) {
                if (((C44805o) arrayList.get(i22)).d() < i19) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C44805o c44805o = (C44805o) arrayList.get(i13);
            C44805o c44805o2 = (C44805o) arrayList.get(i14 - 1);
            int i23 = -1;
            if (i19 == c44805o.d()) {
                int iIntValue = ((Number) arrayList2.get(i13)).intValue();
                int i24 = i13 + 1;
                C44805o c44805o3 = (C44805o) arrayList.get(i24);
                i15 = i24;
                i16 = iIntValue;
                c44805o = c44805o3;
            } else {
                i15 = i13;
                i16 = -1;
            }
            if (c44805o.k(i19) == c44805o2.k(i19)) {
                int iMin = Math.min(c44805o.d(), c44805o2.d());
                int i25 = 0;
                for (int i26 = i19; i26 < iMin && c44805o.k(i26) == c44805o2.k(i26); i26++) {
                    i25++;
                }
                long j13 = 4;
                long j14 = (c44802l.f420125c / j13) + j12 + 2 + i25 + 1;
                c44802l.H(-i25);
                c44802l.H(i16);
                int i27 = i25 + i19;
                while (i19 < i27) {
                    c44802l.H(c44805o.k(i19) & 255);
                    i19++;
                }
                if (i15 + 1 == i14) {
                    if (i27 != ((C44805o) arrayList.get(i15)).d()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c44802l.H(((Number) arrayList2.get(i15)).intValue());
                    return;
                } else {
                    C44802l c44802l3 = new C44802l();
                    c44802l.H(((int) ((c44802l3.f420125c / j13) + j14)) * (-1));
                    a(j14, c44802l3, i27, arrayList, i15, i14, arrayList2);
                    c44802l.h2(c44802l3);
                    return;
                }
            }
            int i28 = 1;
            for (int i29 = i15 + 1; i29 < i14; i29++) {
                if (((C44805o) arrayList.get(i29 - 1)).k(i19) != ((C44805o) arrayList.get(i29)).k(i19)) {
                    i28++;
                }
            }
            long j15 = 4;
            long j16 = (c44802l.f420125c / j15) + j12 + 2 + (i28 * 2);
            c44802l.H(i28);
            c44802l.H(i16);
            for (int i32 = i15; i32 < i14; i32++) {
                int iK2 = ((C44805o) arrayList.get(i32)).k(i19);
                if (i32 == i15 || iK2 != ((C44805o) arrayList.get(i32 - 1)).k(i19)) {
                    c44802l.H(iK2 & 255);
                }
            }
            C44802l c44802l4 = new C44802l();
            int i33 = i15;
            while (i33 < i14) {
                byte bK2 = ((C44805o) arrayList.get(i33)).k(i19);
                int i34 = i33 + 1;
                int i35 = i34;
                while (true) {
                    if (i35 >= i14) {
                        i17 = i14;
                        break;
                    } else {
                        if (bK2 != ((C44805o) arrayList.get(i35)).k(i19)) {
                            i17 = i35;
                            break;
                        }
                        i35++;
                    }
                }
                if (i34 == i17 && i19 + 1 == ((C44805o) arrayList.get(i33)).d()) {
                    c44802l.H(((Number) arrayList2.get(i33)).intValue());
                    i18 = i17;
                    c44802l2 = c44802l4;
                } else {
                    c44802l.H(((int) ((c44802l4.f420125c / j15) + j16)) * i23);
                    i18 = i17;
                    c44802l2 = c44802l4;
                    a(j16, c44802l4, i19 + 1, arrayList, i33, i17, arrayList2);
                }
                c44802l4 = c44802l2;
                i33 = i18;
                i23 = -1;
            }
            c44802l.h2(c44802l4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
        
            continue;
         */
        @X41.n
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static okio.P b(@Y61.k okio.C44805o... r12) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.P.a.b(okio.o[]):okio.P");
        }

        public a() {
        }
    }

    public P(C44805o[] c44805oArr, int[] iArr, C42822w c42822w) {
        this.f420029c = c44805oArr;
        this.f420030d = iArr;
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C44805o) {
            return super.contains((C44805o) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final Object get(int i12) {
        return this.f420029c[i12];
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF395503d() {
        return this.f420029c.length;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C44805o) {
            return super.indexOf((C44805o) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C44805o) {
            return super.lastIndexOf((C44805o) obj);
        }
        return -1;
    }
}
