package androidx.compose.material3;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.l0;

/* compiled from: AlertDialog.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21621i implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f36510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f36511b;

    /* compiled from: AlertDialog.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.i$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f36512l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f36513m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f36514n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f36515o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ ArrayList f36516p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, InterfaceC22369k0 interfaceC22369k0, float f12, int i12, ArrayList arrayList2) {
            super(1);
            this.f36512l = arrayList;
            this.f36513m = interfaceC22369k0;
            this.f36514n = f12;
            this.f36515o = i12;
            this.f36516p = arrayList2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            InterfaceC22369k0 interfaceC22369k0;
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f36512l;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                List list = (List) arrayList.get(i12);
                int size2 = list.size();
                int[] iArr = new int[size2];
                int i13 = 0;
                while (true) {
                    interfaceC22369k0 = this.f36513m;
                    if (i13 >= size2) {
                        break;
                    }
                    iArr[i13] = ((androidx.compose.ui.layout.K0) list.get(i13)).f40345b + (i13 < list.size() + (-1) ? interfaceC22369k0.y0(this.f36514n) : 0);
                    i13++;
                }
                C20585k.f28659a.getClass();
                C20585k.d dVar = C20585k.f28661c;
                int[] iArr2 = new int[size2];
                for (int i14 = 0; i14 < size2; i14++) {
                    iArr2[i14] = 0;
                }
                dVar.b(interfaceC22369k0, this.f36515o, iArr, interfaceC22369k0.getF40449b(), iArr2);
                int size3 = list.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    aVar2.e((androidx.compose.ui.layout.K0) list.get(i15), iArr2[i15], ((Number) this.f36516p.get(i12)).intValue(), 0.0f);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    public C21621i(float f12, float f13) {
        this.f36510a = f12;
        this.f36511b = f13;
    }

    public static final void a(ArrayList arrayList, l0.f fVar, InterfaceC22369k0 interfaceC22369k0, float f12, ArrayList arrayList2, ArrayList arrayList3, l0.f fVar2, ArrayList arrayList4, l0.f fVar3, l0.f fVar4) {
        if (!arrayList.isEmpty()) {
            fVar.f406840b = interfaceC22369k0.y0(f12) + fVar.f406840b;
        }
        arrayList.add(0, C42745f0.M0(arrayList2));
        arrayList3.add(Integer.valueOf(fVar2.f406840b));
        arrayList4.add(Integer.valueOf(fVar.f406840b));
        fVar.f406840b += fVar2.f406840b;
        fVar3.f406840b = Math.max(fVar3.f406840b, fVar4.f406840b);
        arrayList2.clear();
        fVar4.f406840b = 0;
        fVar2.f406840b = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.InterfaceC22367j0 b(@Y61.k androidx.compose.ui.layout.InterfaceC22369k0 r25, @Y61.k java.util.List<? extends androidx.compose.ui.layout.InterfaceC22363h0> r26, long r27) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21621i.b(androidx.compose.ui.layout.k0, java.util.List, long):androidx.compose.ui.layout.j0");
    }
}
