package shark.internal;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import shark.AbstractC48345t2;
import shark.C48240c2;
import shark.L1;
import shark.M1;
import shark.N2;
import shark.PrimitiveType;
import shark.g3;
import shark.h3;
import shark.i3;
import shark.internal.C0;

/* compiled from: FieldInstanceReferenceReader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lshark/internal/I;", "Lshark/internal/E0;", "Lshark/M1$c;", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class I implements E0<M1.c> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f438362a;

    /* renamed from: b, reason: collision with root package name */
    public final long f438363b;

    /* renamed from: c, reason: collision with root package name */
    public final int f438364c;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b((String) ((kotlin.Q) t12).f406619b, (String) ((kotlin.Q) t13).f406619b);
        }
    }

    /* compiled from: FieldInstanceReferenceReader.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lshark/internal/C0$a;", "resolve", "()Lshark/internal/C0$a;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements C0.a.InterfaceC12630a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f438365a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f438366b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g3 f438367c;

        public b(String str, long j12, g3 g3Var) {
            this.f438365a = str;
            this.f438366b = j12;
            this.f438367c = g3Var;
        }

        @Override // shark.internal.C0.a.InterfaceC12630a
        @Y61.k
        public final C0.a a() {
            return new C0.a(this.f438365a, this.f438366b, ReferenceLocationType.f438449b, (N2) this.f438367c);
        }
    }

    /* compiled from: FieldInstanceReferenceReader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "Lshark/internal/C0;", "it", "invoke", "(Lkotlin/Q;)Lshark/internal/C0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<kotlin.Q<? extends String, ? extends C0>, C0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f438368l = new c();

        public c() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final C0 invoke(kotlin.Q<? extends String, ? extends C0> q12) {
            return (C0) q12.f406620c;
        }
    }

    /* compiled from: FieldInstanceReferenceReader.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lshark/internal/H;", "invoke", "()Lshark/internal/H;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<H> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ M1.c f438369l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ L1 f438370m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(M1.c cVar, L1 l12) {
            super(0);
            this.f438369l = cVar;
            this.f438370m = l12;
        }

        @Override // Y41.a
        public final H invoke() {
            return new H(this.f438369l.d(), this.f438370m.a());
        }
    }

    public I(@Y61.k List list, @Y61.k C48240c2 c48240c2) {
        int iIntValue;
        M1.b bVarC = c48240c2.c("java.lang.Object");
        this.f438363b = bVarC != null ? bVarC.f438147e : -1L;
        int i12 = 0;
        if (bVarC != null) {
            int i13 = 0;
            for (AbstractC48345t2.b.c.a.C12636a c12636a : bVarC.k()) {
                if (c12636a.f438721b == 2) {
                    iIntValue = bVarC.f438145c.f438258g.f438248d;
                } else {
                    PrimitiveType.f438195g.getClass();
                    iIntValue = ((Number) P0.d(PrimitiveType.f438193e, Integer.valueOf(c12636a.f438721b))).intValue();
                }
                i13 += iIntValue;
            }
            int i14 = c48240c2.f438258g.f438248d;
            PrimitiveType[] primitiveTypeArr = PrimitiveType.f438192d;
            int i15 = i14 + 4;
            if (i13 == i15) {
                i12 = i15;
            }
        }
        this.f438364c = i12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = h3.a(list, c48240c2).iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            i3 f438839a = g3Var.getF438839a();
            if (f438839a instanceof i3.b) {
                i3.b bVar = (i3.b) f438839a;
                Map linkedHashMap2 = (Map) linkedHashMap.get(bVar.f438290b);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(bVar.f438290b, linkedHashMap2);
                }
                linkedHashMap2.put(bVar.f438291c, g3Var);
            }
        }
        this.f438362a = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0228  */
    @Override // shark.internal.E0
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.sequences.InterfaceC43030m<shark.internal.C0> b(@Y61.k shark.M1.c r24) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.internal.I.b(shark.M1$c):kotlin.sequences.m");
    }
}
