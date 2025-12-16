package com.avito.beduin.v2.render.android_view.diff;

import com.avito.beduin.v2.render.android_view.diff.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DiffResult.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/h;", "", "a", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e.a f337970a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final int[] f337971b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final int[] f337972c;

    /* renamed from: d, reason: collision with root package name */
    public final int f337973d;

    /* renamed from: e, reason: collision with root package name */
    public final int f337974e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f337975f;

    /* compiled from: DiffResult.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/h$a;", "", "<init>", "()V", "", "FLAG_CHANGED", "I", "FLAG_MASK", "FLAG_MOVED", "FLAG_MOVED_CHANGED", "FLAG_MOVED_NOT_CHANGED", "FLAG_NOT_CHANGED", "FLAG_OFFSET", "NO_POSITION", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public h(@Y61.k e.a aVar, @Y61.k ArrayList arrayList, @Y61.k int[] iArr, @Y61.k int[] iArr2) {
        int[] iArr3;
        int[] iArr4;
        e.a aVar2;
        int i12;
        d dVar;
        int i13;
        this.f337970a = aVar;
        this.f337971b = iArr;
        this.f337972c = iArr2;
        int iC2 = aVar.c();
        this.f337973d = iC2;
        int iD2 = aVar.d();
        this.f337974e = iD2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f337975f = arrayList2;
        Arrays.fill(iArr, 0, iArr.length, 0);
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        d dVar2 = (d) C42745f0.G(arrayList2);
        if (dVar2 == null || dVar2.f337966b != 0 || dVar2.f337967c != 0) {
            arrayList2.add(0, new d(0, 0, 0));
        }
        arrayList2.add(new d(iC2, iD2, 0));
        int size = arrayList2.size();
        int i14 = 0;
        while (true) {
            iArr3 = this.f337972c;
            iArr4 = this.f337971b;
            aVar2 = this.f337970a;
            if (i14 >= size) {
                break;
            }
            d dVar3 = (d) arrayList2.get(i14);
            int i15 = dVar3.f337968d;
            for (int i16 = 0; i16 < i15; i16++) {
                int i17 = dVar3.f337966b + i16;
                int i18 = dVar3.f337967c + i16;
                int i19 = aVar2.b(i17, i18) ? 1 : 2;
                iArr4[i17] = (i18 << 4) | i19;
                iArr3[i18] = (i17 << 4) | i19;
            }
            i14++;
        }
        int size2 = arrayList2.size();
        int i22 = 0;
        for (int i23 = 0; i23 < size2; i23++) {
            d dVar4 = (d) arrayList2.get(i23);
            while (true) {
                i12 = dVar4.f337966b;
                if (i22 < i12) {
                    if (iArr4[i22] == 0) {
                        int size3 = arrayList2.size();
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            if (i24 < size3) {
                                dVar = (d) arrayList2.get(i24);
                                while (true) {
                                    i13 = dVar.f337967c;
                                    if (i25 < i13) {
                                        if (iArr3[i25] == 0 && aVar2.a(i22, i25)) {
                                            int i26 = aVar2.b(i22, i25) ? 8 : 4;
                                            iArr4[i22] = (i25 << 4) | i26;
                                            iArr3[i25] = i26 | (i22 << 4);
                                        } else {
                                            i25++;
                                        }
                                    }
                                }
                            }
                            i25 = dVar.f337968d + i13;
                            i24++;
                        }
                    }
                    i22++;
                }
            }
            i22 = dVar4.f337968d + i12;
        }
    }

    public static void a(h hVar, g gVar) {
        int[] iArr;
        int i12;
        ArrayList arrayList;
        g aVar = gVar;
        if (!(aVar instanceof com.avito.beduin.v2.render.android_view.diff.a)) {
            aVar = new com.avito.beduin.v2.render.android_view.diff.a(aVar);
        }
        C42754k c42754k = new C42754k();
        ArrayList arrayList2 = hVar.f337975f;
        int iJ2 = C42745f0.J(arrayList2);
        int i13 = hVar.f337973d;
        int i14 = hVar.f337974e;
        int i15 = i13;
        while (-1 < iJ2) {
            d dVar = (d) arrayList2.get(iJ2);
            int i16 = dVar.f337967c;
            int i17 = dVar.f337968d;
            int i18 = i16 + i17;
            int i19 = dVar.f337966b;
            int i22 = i19 + i17;
            while (true) {
                iArr = hVar.f337971b;
                if (i15 <= i22) {
                    break;
                }
                i15--;
                int i23 = iArr[i15];
                if ((i23 & 12) != 0) {
                    int i24 = i23 >> 4;
                    j jVarB = b(c42754k, i24, false);
                    if (jVarB != null) {
                        arrayList = arrayList2;
                        int i25 = (i13 - jVarB.f337977b) - 1;
                        aVar.d(i15, i25);
                        if ((i23 & 4) != 0) {
                            aVar.a(i25, i24);
                        }
                    } else {
                        arrayList = arrayList2;
                        c42754k.addLast(new j(i15, (i13 - i15) - 1, true));
                    }
                } else {
                    arrayList = arrayList2;
                    aVar.b(i15, 1);
                    i13--;
                }
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            while (i14 > i18) {
                i14--;
                int i26 = hVar.f337972c[i14];
                if ((i26 & 12) != 0) {
                    j jVarB2 = b(c42754k, i26 >> 4, true);
                    if (jVarB2 != null) {
                        aVar.d((i13 - jVarB2.f337977b) - 1, i15);
                        if ((i26 & 4) != 0) {
                            aVar.a(i15, i14);
                        }
                    } else {
                        c42754k.addLast(new j(i14, i13 - i15, false));
                    }
                } else {
                    aVar.c(i15, i14);
                    i13++;
                }
            }
            i14 = dVar.f337967c;
            int i27 = i14;
            int i28 = i19;
            for (i12 = 0; i12 < i17; i12++) {
                if ((iArr[i28] & 15) == 2) {
                    aVar.a(i28, i27);
                }
                i28++;
                i27++;
            }
            iJ2--;
            i15 = i19;
            arrayList2 = arrayList3;
        }
        if (aVar instanceof com.avito.beduin.v2.render.android_view.diff.a) {
            ((com.avito.beduin.v2.render.android_view.diff.a) aVar).g();
        }
    }

    public static j b(C42754k c42754k, int i12, boolean z12) {
        j jVar;
        Iterator<E> it = c42754k.iterator();
        while (true) {
            if (!it.hasNext()) {
                jVar = null;
                break;
            }
            jVar = (j) it.next();
            if (jVar.f337976a == i12 && jVar.f337978c == z12) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            j jVar2 = (j) it.next();
            if (z12) {
                jVar2.f337977b--;
            } else {
                jVar2.f337977b++;
            }
        }
        return jVar;
    }
}
