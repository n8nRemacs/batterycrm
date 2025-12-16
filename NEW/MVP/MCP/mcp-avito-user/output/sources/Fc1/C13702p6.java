package Fc1;

import androidx.compose.runtime.C22066f2;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.p6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13702p6 {

    @kotlin.jvm.internal.s0
    /* renamed from: Fc1.p6$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<List<? extends C13623h>, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l f5754l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.l lVar) {
            super(1);
            this.f5754l = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(List<? extends C13623h> list) {
            this.f5754l.invoke(list);
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.p6$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<List<C13623h>, kotlin.G0> f5755l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f5756m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, Y41.l lVar) {
            super(2);
            this.f5755l = lVar;
            this.f5756m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5756m | 1);
            C13702p6.a(this.f5755l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @kotlin.jvm.internal.s0
    /* renamed from: Fc1.p6$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<C13623h, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.snapshots.D<C13623h> f5757l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<List<C13623h>, kotlin.G0> f5758m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(androidx.compose.runtime.snapshots.D<C13623h> d12, Y41.l<? super List<C13623h>, kotlin.G0> lVar) {
            super(1);
            this.f5757l = d12;
            this.f5758m = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C13623h c13623h) {
            C13623h c13623h2 = c13623h;
            List<C13623h> list = this.f5757l;
            boolean zContains = list.contains(c13623h2);
            if (zContains) {
                list.remove(c13623h2);
            } else if (!zContains) {
                boolean z12 = c13623h2.f5539d;
                if (z12) {
                    list.clear();
                } else if (!z12) {
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator = list.listIterator();
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        if (((C13623h) next).f5539d) {
                            arrayList.add(next);
                        }
                    }
                    list.removeAll(arrayList);
                }
                list.add(c13623h2);
            }
            this.f5758m.invoke(list);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Y41.l<? super java.util.List<Fc1.C13623h>, kotlin.G0> r9, @Y61.l androidx.compose.runtime.A r10, int r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.C13702p6.a(Y41.l, androidx.compose.runtime.A, int):void");
    }
}
