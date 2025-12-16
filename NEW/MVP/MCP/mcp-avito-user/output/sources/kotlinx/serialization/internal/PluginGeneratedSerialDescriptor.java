package kotlinx.serialization.internal;

import androidx.compose.runtime.C22026a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.p;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/n;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, InterfaceC43417n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f412799a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final N<?> f412800b;

    /* renamed from: c, reason: collision with root package name */
    public final int f412801c;

    /* renamed from: d, reason: collision with root package name */
    public int f412802d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String[] f412803e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<Annotation>[] f412804f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final boolean[] f412805g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public Object f412806h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f412807i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f412808j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Object f412809k;

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Integer> {
        public a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final Integer invoke() {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = PluginGeneratedSerialDescriptor.this;
            return Integer.valueOf(F0.a(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.f412808j.getValue()));
        }
    }

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/serialization/KSerializer;", "invoke", "()[Lkotlinx/serialization/KSerializer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<KSerializer<?>[]> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final KSerializer<?>[] invoke() {
            KSerializer<?>[] kSerializerArrChildSerializers;
            N<?> n12 = PluginGeneratedSerialDescriptor.this.f412800b;
            return (n12 == null || (kSerializerArrChildSerializers = n12.childSerializers()) == null) ? G0.f412773a : kSerializerArrChildSerializers;
        }
    }

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "i", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Integer, CharSequence> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(Integer num) {
            int iIntValue = num.intValue();
            StringBuilder sb2 = new StringBuilder();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = PluginGeneratedSerialDescriptor.this;
            sb2.append(pluginGeneratedSerialDescriptor.f412803e[iIntValue]);
            sb2.append(": ");
            sb2.append(pluginGeneratedSerialDescriptor.h(iIntValue).getF412796b());
            return sb2.toString();
        }
    }

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<SerialDescriptor[]> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final SerialDescriptor[] invoke() {
            ArrayList arrayList;
            KSerializer<?>[] kSerializerArrTypeParametersSerializers;
            N<?> n12 = PluginGeneratedSerialDescriptor.this.f412800b;
            if (n12 == null || (kSerializerArrTypeParametersSerializers = n12.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                    arrayList.add(kSerializer.getF412706c());
                }
            }
            return D0.b(arrayList);
        }
    }

    public PluginGeneratedSerialDescriptor(@Y61.k String str, @Y61.l N<?> n12, int i12) {
        this.f412799a = str;
        this.f412800b = n12;
        this.f412801c = i12;
        this.f412802d = -1;
        String[] strArr = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            strArr[i13] = "[UNINITIALIZED]";
        }
        this.f412803e = strArr;
        int i14 = this.f412801c;
        this.f412804f = new List[i14];
        this.f412805g = new boolean[i14];
        this.f412806h = kotlin.collections.P0.c();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406615c;
        this.f412807i = C42727D.b(lazyThreadSafetyMode, new b());
        this.f412808j = C42727D.b(lazyThreadSafetyMode, new d());
        this.f412809k = C42727D.b(lazyThreadSafetyMode, new a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.internal.InterfaceC43417n
    @Y61.k
    public final Set<String> a() {
        return this.f412806h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c, reason: from getter */
    public final int getF412730c() {
        return this.f412801c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final String d(int i12) {
        return this.f412803e[i12];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> e(int i12) {
        List<Annotation> list = this.f412804f[i12];
        return list == null ? C42784z0.f406748b : list;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.C] */
    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (kotlin.jvm.internal.L.f(this.f412799a, serialDescriptor.getF412796b()) && Arrays.equals((SerialDescriptor[]) this.f412808j.getValue(), (SerialDescriptor[]) ((PluginGeneratedSerialDescriptor) obj).f412808j.getValue())) {
                int f412801c = serialDescriptor.getF412730c();
                int i12 = this.f412801c;
                if (i12 == f412801c) {
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (kotlin.jvm.internal.L.f(h(i13).getF412796b(), serialDescriptor.h(i13).getF412796b()) && kotlin.jvm.internal.L.f(h(i13).getF412729b(), serialDescriptor.h(i13).getF412729b())) {
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
    public final String getF412796b() {
        return this.f412799a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(@Y61.k String str) {
        Integer num = (Integer) this.f412806h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public final List<Annotation> getAnnotations() {
        return C42784z0.f406748b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    /* renamed from: getKind */
    public kotlinx.serialization.descriptors.o getF412729b() {
        return p.a.f412751a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @Y61.k
    public SerialDescriptor h(int i12) {
        return ((KSerializer[]) this.f412807i.getValue())[i12].getF412706c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public int hashCode() {
        return ((Number) this.f412809k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i12) {
        return this.f412805g[i12];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public boolean getF412817l() {
        return false;
    }

    public final void j(@Y61.k String str, boolean z12) {
        int i12 = this.f412802d + 1;
        this.f412802d = i12;
        String[] strArr = this.f412803e;
        strArr[i12] = str;
        this.f412805g[i12] = z12;
        this.f412804f[i12] = null;
        if (i12 == this.f412801c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i13 = 0; i13 < length; i13++) {
                map.put(strArr[i13], Integer.valueOf(i13));
            }
            this.f412806h = map;
        }
    }

    @Y61.k
    public String toString() {
        return C42745f0.O(kotlin.ranges.s.r(0, this.f412801c), ", ", C22026a.c(new StringBuilder(), this.f412799a, '('), ")", new c(), 24);
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, N n12, int i12, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? null : n12, i12);
    }
}
