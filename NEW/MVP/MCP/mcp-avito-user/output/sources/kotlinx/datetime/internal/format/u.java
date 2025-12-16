package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FormatStructure.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/u;", "T", "Lkotlinx/datetime/internal/format/t;", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class u<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f412605a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f412606b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f412607c;

    /* compiled from: FormatStructure.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0000*\u0004\b\u0002\u0010\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/internal/format/u$a;", "T", "E", "", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, E> {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final C11754a f412608c = new C11754a(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC43370b<T, E> f412609a;

        /* renamed from: b, reason: collision with root package name */
        public final E f412610b;

        /* compiled from: FormatStructure.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/u$a$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlinx.datetime.internal.format.u$a$a, reason: collision with other inner class name */
        public static final class C11754a {
            public /* synthetic */ C11754a(C42822w c42822w) {
                this();
            }

            public C11754a() {
            }
        }

        public a() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43370b interfaceC43370b, Object obj, C42822w c42822w) {
            this.f412609a = interfaceC43370b;
            this.f412610b = obj;
        }
    }

    /* compiled from: FormatStructure.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<T, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((w) this.receiver).test(obj));
        }
    }

    /* compiled from: FormatStructure.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Object, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            ((D) this.receiver).getClass();
            return Boolean.TRUE;
        }
    }

    /* compiled from: FormatStructure.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000 \u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<T, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ u<T> f412611l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(u<? super T> uVar) {
            super(1);
            this.f412611l = uVar;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            Iterator it = this.f412611l.f412607c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                aVar.f412609a.c(obj, aVar.f412610b);
            }
            return G0.f406611a;
        }
    }

    public u(@Y61.k String str, @Y61.k h hVar) {
        this.f412605a = str;
        this.f412606b = hVar;
        kotlin.collections.builders.b bVarT = C42745f0.t();
        p.a(bVarT, hVar);
        kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
        ArrayList arrayList = new ArrayList(C42745f0.q(bVarP, 10));
        ListIterator listIterator = bVarP.listIterator(0);
        while (listIterator.hasNext()) {
            arrayList.add(((l) listIterator.next()).a());
        }
        List<n> listV = C42745f0.v(arrayList);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listV, 10));
        for (n nVar : listV) {
            a.f412608c.getClass();
            Object defaultValue = nVar.getDefaultValue();
            if (defaultValue == null) {
                throw new IllegalArgumentException(("The field '" + nVar.getF412598b() + "' does not define a default value").toString());
            }
            arrayList2.add(new a(nVar.a(), defaultValue, null));
        }
        this.f412607c = arrayList2;
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public final J51.e<T> b() {
        J51.e<T> eVarB = this.f412606b.b();
        ArrayList arrayList = this.f412607c;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            arrayList2.add(new g(aVar.f412610b, new v(1, aVar.f412609a, InterfaceC43370b.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0)));
        }
        Object iVar = arrayList2.isEmpty() ? D.f412504a : arrayList2.size() == 1 ? (w) C42745f0.u0(arrayList2) : new i(arrayList2);
        return iVar instanceof D ? new J51.c() : new J51.b(C42745f0.U(new Q(new b(1, iVar, w.class, "test", "test(Ljava/lang/Object;)Z", 0), new J51.c()), new Q(new c(1, D.f412504a, D.class, "test", "test(Ljava/lang/Object;)Z", 0), eVarB)));
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public final kotlinx.datetime.internal.format.parser.v<T> c() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        return new kotlinx.datetime.internal.format.parser.v<>(c42784z0, C42745f0.U(this.f412606b.c(), kotlinx.datetime.internal.format.parser.r.a(C42745f0.U(new j(this.f412605a).c(), new kotlinx.datetime.internal.format.parser.v(this.f412607c.isEmpty() ? c42784z0 : Collections.singletonList(new kotlinx.datetime.internal.format.parser.E(new d(this))), c42784z0)))));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f412605a.equals(uVar.f412605a) && this.f412606b.equals(uVar.f412606b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f412606b.hashCode() + (this.f412605a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "Optional(" + this.f412605a + ", " + this.f412606b + ')';
    }
}
