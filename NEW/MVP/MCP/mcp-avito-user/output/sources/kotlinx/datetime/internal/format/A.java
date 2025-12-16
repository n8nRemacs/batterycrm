package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FormatStructure.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/A;", "T", "Lkotlinx/datetime/internal/format/t;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43373e f412497a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<m<T>> f412498b;

    /* compiled from: FormatStructure.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<T, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A<T> f412499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(A<? super T> a12) {
            super(1, L.a.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
            this.f412499b = a12;
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            Iterator<m<T>> it = this.f412499b.f412498b.iterator();
            boolean z12 = false;
            boolean z13 = false;
            while (true) {
                if (!it.hasNext()) {
                    z12 = z13;
                    break;
                }
                m<T> next = it.next();
                if (L.f(next.getF412440a().f412612a.get(obj), Boolean.TRUE)) {
                    z13 = true;
                } else if (!next.b(obj)) {
                    break;
                }
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: FormatStructure.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000 \u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "value", "", "isNegative", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<T, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ A<T> f412500l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(A<? super T> a12) {
            super(2);
            this.f412500l = a12;
        }

        @Override // Y41.p
        public final G0 invoke(Object obj, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            for (m<T> mVar : this.f412500l.f412498b) {
                mVar.getF412440a().c(obj, Boolean.valueOf(zBooleanValue != L.f(mVar.getF412440a().f412612a.get(obj), Boolean.TRUE)));
            }
            return G0.f406611a;
        }
    }

    public A(@Y61.k C43373e c43373e) {
        this.f412497a = c43373e;
        kotlin.collections.builders.b bVarT = C42745f0.t();
        p.a(bVarT, c43373e);
        kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = bVarP.listIterator(0);
        while (listIterator.hasNext()) {
            m mVarB = ((l) listIterator.next()).a().b();
            if (mVarB != null) {
                arrayList.add(mVarB);
            }
        }
        Set<m<T>> setP0 = C42745f0.P0(arrayList);
        this.f412498b = setP0;
        if (setP0.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public final J51.e<T> b() {
        return new J51.g(this.f412497a.f412519a.b(), new a(this));
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public final kotlinx.datetime.internal.format.parser.v<T> c() {
        return kotlinx.datetime.internal.format.parser.r.a(C42745f0.U(new kotlinx.datetime.internal.format.parser.v(Collections.singletonList(new kotlinx.datetime.internal.format.parser.B(new b(this), "sign for " + this.f412498b)), C42784z0.f406748b), this.f412497a.f412519a.c()));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof A) {
            if (this.f412497a.equals(((A) obj).f412497a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f412497a.f412519a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SignedFormatStructure(" + this.f412497a + ')';
    }
}
