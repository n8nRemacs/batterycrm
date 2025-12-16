package kotlinx.serialization.descriptors;

import androidx.compose.runtime.C22026a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.H0;
import kotlin.collections.I0;
import kotlin.collections.J0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlinx.serialization.internal.D0;
import kotlinx.serialization.internal.F0;
import kotlinx.serialization.internal.InterfaceC43417n;

/* compiled from: SerialDescriptors.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/f;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/n;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f implements SerialDescriptor, InterfaceC43417n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f412728a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f412729b;

    /* renamed from: c, reason: collision with root package name */
    public final int f412730c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<Annotation> f412731d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final HashSet f412732e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String[] f412733f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SerialDescriptor[] f412734g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<Annotation>[] f412735h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final boolean[] f412736i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Map<String, Integer> f412737j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SerialDescriptor[] f412738k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f412739l;

    /* compiled from: SerialDescriptors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            f fVar = f.this;
            return Integer.valueOf(F0.a(fVar, fVar.f412738k));
        }
    }

    /* compiled from: SerialDescriptors.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<Integer, CharSequence> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(Integer num) {
            int iIntValue = num.intValue();
            StringBuilder sb2 = new StringBuilder();
            f fVar = f.this;
            sb2.append(fVar.f412733f[iIntValue]);
            sb2.append(": ");
            sb2.append(fVar.f412734g[iIntValue].getF412728a());
            return sb2.toString();
        }
    }

    public f(@Y61.k String str, @Y61.k o oVar, int i12, @Y61.k List<? extends SerialDescriptor> list, @Y61.k kotlinx.serialization.descriptors.a aVar) {
        this.f412728a = str;
        this.f412729b = oVar;
        this.f412730c = i12;
        this.f412731d = aVar.f412708b;
        ArrayList arrayList = aVar.f412709c;
        this.f412732e = C42745f0.K0(arrayList);
        int i13 = 0;
        this.f412733f = (String[]) arrayList.toArray(new String[0]);
        this.f412734g = D0.b(aVar.f412711e);
        this.f412735h = (List[]) aVar.f412712f.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f412713g;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i13] = ((Boolean) it.next()).booleanValue();
            i13++;
        }
        this.f412736i = zArr;
        I0 i0M0 = C42756l.m0(this.f412733f);
        ArrayList arrayList3 = new ArrayList(C42745f0.q(i0M0, 10));
        Iterator it2 = i0M0.iterator();
        while (true) {
            J0 j02 = (J0) it2;
            if (!j02.f406646b.hasNext()) {
                this.f412737j = P0.p(arrayList3);
                this.f412738k = D0.b(list);
                this.f412739l = C42727D.c(new a());
                return;
            }
            H0 h02 = (H0) j02.next();
            arrayList3.add(new Q(h02.f406644b, Integer.valueOf(h02.f406643a)));
        }
    }

    @Override // kotlinx.serialization.internal.InterfaceC43417n
    @Y61.k
    public final Set<String> a() {
        return this.f412732e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c, reason: from getter */
    public final int getF412730c() {
        return this.f412730c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final String d(int i12) {
        return this.f412733f[i12];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> e(int i12) {
        return this.f412735h[i12];
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (L.f(this.f412728a, serialDescriptor.getF412728a()) && Arrays.equals(this.f412738k, ((f) obj).f412738k)) {
                int f412730c = serialDescriptor.getF412730c();
                int i12 = this.f412730c;
                if (i12 == f412730c) {
                    for (int i13 = 0; i13 < i12; i13++) {
                        SerialDescriptor[] serialDescriptorArr = this.f412734g;
                        if (L.f(serialDescriptorArr[i13].getF412728a(), serialDescriptor.h(i13).getF412728a()) && L.f(serialDescriptorArr[i13].getF412729b(), serialDescriptor.h(i13).getF412729b())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF412728a() {
        return this.f412728a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(@Y61.k String str) {
        Integer num = this.f412737j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> getAnnotations() {
        return this.f412731d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    /* renamed from: getKind, reason: from getter */
    public final o getF412729b() {
        return this.f412729b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final SerialDescriptor h(int i12) {
        return this.f412734g[i12];
    }

    public final int hashCode() {
        return ((Number) this.f412739l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i12) {
        return this.f412736i[i12];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public final boolean getF412817l() {
        return false;
    }

    @Y61.k
    public final String toString() {
        return C42745f0.O(s.r(0, this.f412730c), ", ", C22026a.c(new StringBuilder(), this.f412728a, '('), ")", new b(), 24);
    }
}
