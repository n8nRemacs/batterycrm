package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.C21045x;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectionLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/q;", "Landroidx/compose/foundation/text/selection/l0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21032q implements InterfaceC21023l0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.E0 f32108a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f32109b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32110c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32111d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f32112e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final C21045x f32113f;

    /* compiled from: SelectionLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.q$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CrossStatus crossStatus = CrossStatus.f31829b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CrossStatus crossStatus2 = CrossStatus.f31829b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C21032q(@Y61.k androidx.collection.E0 e02, @Y61.k ArrayList arrayList, int i12, int i13, boolean z12, @Y61.l C21045x c21045x) {
        this.f32108a = e02;
        this.f32109b = arrayList;
        this.f32110c = i12;
        this.f32111d = i13;
        this.f32112e = z12;
        this.f32113f = c21045x;
        if (arrayList.size() > 1) {
            return;
        }
        androidx.compose.foundation.internal.e.c("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList.size() + '.');
    }

    public static void m(androidx.collection.H0 h02, C21045x c21045x, C21043w c21043w, int i12, int i13) {
        C21045x c21045x2;
        if (c21045x.f32158c) {
            c21045x2 = new C21045x(c21043w.a(i13), c21043w.a(i12), i13 > i12);
        } else {
            c21045x2 = new C21045x(c21043w.a(i12), c21043w.a(i13), i12 > i13);
        }
        if (i12 > i13) {
            androidx.compose.foundation.internal.e.c("minOffset should be less than or equal to maxOffset: " + c21045x2);
        }
        long j12 = c21043w.f32149a;
        int iD2 = h02.d(j12);
        Object[] objArr = h02.f25654c;
        Object obj = objArr[iD2];
        h02.f25653b[iD2] = j12;
        objArr[iD2] = c21045x2;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    /* renamed from: a, reason: from getter */
    public final boolean getF32112e() {
        return this.f32112e;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    /* renamed from: b */
    public final C21043w getF31949e() {
        return this.f32112e ? j() : i();
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    public final CrossStatus c() {
        int i12 = this.f32110c;
        int i13 = this.f32111d;
        if (i12 < i13) {
            return CrossStatus.f31830c;
        }
        if (i12 > i13) {
            return CrossStatus.f31829b;
        }
        return ((C21043w) this.f32109b.get(i12 / 2)).b();
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    public final C21043w d() {
        return c() == CrossStatus.f31829b ? i() : j();
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    /* renamed from: e, reason: from getter */
    public final int getF32111d() {
        return this.f32111d;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    public final androidx.collection.H0 f(@Y61.k C21045x c21045x) {
        C21045x.a aVar = c21045x.f32156a;
        long j12 = aVar.f32161c;
        C21045x.a aVar2 = c21045x.f32157b;
        long j13 = aVar2.f32161c;
        boolean z12 = c21045x.f32158c;
        if (j12 != j13) {
            androidx.collection.H0 h0A = androidx.collection.Z.a();
            m(h0A, c21045x, d(), (z12 ? aVar2 : aVar).f32160b, d().f32154f.f42526a.f42506a.f42127c.length());
            l(new r(this, h0A, c21045x));
            if (!z12) {
                aVar = aVar2;
            }
            m(h0A, c21045x, c() == CrossStatus.f31829b ? j() : i(), 0, aVar.f32160b);
            return h0A;
        }
        int i12 = aVar.f32160b;
        int i13 = aVar2.f32160b;
        if ((!z12 || i12 < i13) && (z12 || i12 > i13)) {
            androidx.compose.foundation.internal.e.c("unexpectedly miss-crossed selection: " + c21045x);
        }
        long j14 = aVar.f32161c;
        androidx.collection.H0 h02 = androidx.collection.Z.f25658a;
        androidx.collection.H0 h03 = new androidx.collection.H0(0, 1, null);
        h03.h(j14, c21045x);
        return h03;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.l
    /* renamed from: g, reason: from getter */
    public final C21045x getF32113f() {
        return this.f32113f;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    public final int getSize() {
        return this.f32109b.size();
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    public final boolean h(@Y61.l InterfaceC21023l0 interfaceC21023l0) {
        if (this.f32113f != null && interfaceC21023l0 != null && (interfaceC21023l0 instanceof C21032q)) {
            if (this.f32112e == interfaceC21023l0.getF32112e()) {
                if (this.f32110c == interfaceC21023l0.getF32110c()) {
                    if (this.f32111d == interfaceC21023l0.getF32111d()) {
                        ArrayList arrayList = this.f32109b;
                        int size = arrayList.size();
                        ArrayList arrayList2 = ((C21032q) interfaceC21023l0).f32109b;
                        if (size == arrayList2.size()) {
                            int size2 = arrayList.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                C21043w c21043w = (C21043w) arrayList.get(i12);
                                C21043w c21043w2 = (C21043w) arrayList2.get(i12);
                                c21043w.getClass();
                                if (c21043w.f32149a == c21043w2.f32149a && c21043w.f32151c == c21043w2.f32151c && c21043w.f32152d == c21043w2.f32152d) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    public final C21043w i() {
        return (C21043w) this.f32109b.get(o(this.f32111d, false));
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    public final C21043w j() {
        return (C21043w) this.f32109b.get(o(this.f32110c, true));
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    /* renamed from: k, reason: from getter */
    public final int getF32110c() {
        return this.f32110c;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    public final void l(@Y61.k Y41.l<? super C21043w, kotlin.G0> lVar) {
        int iN2 = n(d().f32149a);
        int iN3 = n((c() == CrossStatus.f31829b ? j() : i()).f32149a);
        int i12 = iN2 + 1;
        if (i12 >= iN3) {
            return;
        }
        while (i12 < iN3) {
            lVar.invoke(this.f32109b.get(i12));
            i12++;
        }
    }

    public final int n(long j12) {
        try {
            return this.f32108a.b(j12);
        } catch (NoSuchElementException e12) {
            throw new IllegalStateException(C21030p.a(j12, "Invalid selectableId: "), e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(int i12, boolean z12) {
        int iOrdinal = c().ordinal();
        int i13 = z12;
        if (iOrdinal == 0) {
            i13 = z12 == 0 ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return (i12 - (i13 ^ 1)) / 2;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb2.append(this.f32112e);
        sb2.append(", startPosition=");
        boolean z12 = true;
        float f12 = 2;
        sb2.append((this.f32110c + 1) / f12);
        sb2.append(", endPosition=");
        sb2.append((this.f32111d + 1) / f12);
        sb2.append(", crossed=");
        sb2.append(c());
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder("[\n\t");
        ArrayList arrayList = this.f32109b;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            C21043w c21043w = (C21043w) arrayList.get(i12);
            if (z12) {
                z12 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i12++;
            sb4.append(i12);
            sb4.append(" -> ");
            sb4.append(c21043w);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        sb2.append(sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
