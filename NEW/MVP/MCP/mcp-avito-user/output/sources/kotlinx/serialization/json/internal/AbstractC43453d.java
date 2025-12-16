package kotlinx.serialization.json.internal;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.o;
import kotlinx.serialization.descriptors.p;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractC43425r0;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.C43448f;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;

/* compiled from: TreeJsonEncoder.kt */
@InterfaceC43387f
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/internal/d;", "Lkotlinx/serialization/internal/r0;", "Lkotlinx/serialization/json/t;", "Lkotlinx/serialization/json/internal/O;", "Lkotlinx/serialization/json/internal/V;", "Lkotlinx/serialization/json/internal/X;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC43453d extends AbstractC43425r0 implements kotlinx.serialization.json.t {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC43443a f413070b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<JsonElement, G0> f413071c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final C43448f f413072d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public String f413073e;

    /* compiled from: TreeJsonEncoder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/serialization/json/JsonElement;", "node", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/json/JsonElement;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.serialization.json.internal.d$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<JsonElement, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(JsonElement jsonElement) {
            AbstractC43453d abstractC43453d = AbstractC43453d.this;
            abstractC43453d.a0((String) C42745f0.Q(abstractC43453d.f412837a), jsonElement);
            return G0.f406611a;
        }
    }

    public AbstractC43453d() {
        throw null;
    }

    public AbstractC43453d(AbstractC43443a abstractC43443a, Y41.l lVar, C42822w c42822w) {
        this.f413070b = abstractC43443a;
        this.f413071c = lVar;
        this.f413072d = abstractC43443a.f412955a;
    }

    @Override // kotlinx.serialization.internal.Y0, kotlinx.serialization.encoding.Encoder
    public final void C() {
        String str = (String) C42745f0.S(this.f412837a);
        if (str == null) {
            this.f413071c.invoke(JsonNull.INSTANCE);
        } else {
            a0(str, JsonNull.INSTANCE);
        }
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void H(String str, boolean z12) {
        a0(str, kotlinx.serialization.json.k.a(Boolean.valueOf(z12)));
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void I(byte b12, Object obj) {
        a0((String) obj, kotlinx.serialization.json.k.b(Byte.valueOf(b12)));
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void J(String str, char c12) {
        a0(str, kotlinx.serialization.json.k.c(String.valueOf(c12)));
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void K(String str, double d12) {
        String str2 = str;
        a0(str2, kotlinx.serialization.json.k.b(Double.valueOf(d12)));
        if (this.f413072d.f412991k) {
            return;
        }
        if (Double.isInfinite(d12) || Double.isNaN(d12)) {
            throw new JsonEncodingException(D.h(Double.valueOf(d12), str2, Z().toString()));
        }
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void L(String str, SerialDescriptor serialDescriptor, int i12) {
        a0(str, kotlinx.serialization.json.k.c(serialDescriptor.d(i12)));
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void M(String str, float f12) {
        String str2 = str;
        a0(str2, kotlinx.serialization.json.k.b(Float.valueOf(f12)));
        if (this.f413072d.f412991k) {
            return;
        }
        if (Float.isInfinite(f12) || Float.isNaN(f12)) {
            throw new JsonEncodingException(D.h(Float.valueOf(f12), str2, Z().toString()));
        }
    }

    @Override // kotlinx.serialization.internal.Y0
    public final Encoder N(String str, SerialDescriptor serialDescriptor) {
        String str2 = str;
        if (l0.a(serialDescriptor)) {
            return new C43455f(this, str2);
        }
        if (serialDescriptor.getF412817l() && serialDescriptor.equals(kotlinx.serialization.json.k.f413132a)) {
            return new C43454e(this, str2, serialDescriptor);
        }
        this.f412837a.add(str2);
        return this;
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void O(int i12, Object obj) {
        a0((String) obj, kotlinx.serialization.json.k.b(Integer.valueOf(i12)));
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void P(long j12, Object obj) {
        a0((String) obj, kotlinx.serialization.json.k.b(Long.valueOf(j12)));
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void Q(String str) {
        a0(str, JsonNull.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void R(String str, short s5) {
        a0(str, kotlinx.serialization.json.k.b(Short.valueOf(s5)));
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void S(String str, String str2) {
        a0(str, kotlinx.serialization.json.k.c(str2));
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void T(String str, Object obj) {
        a0(str, kotlinx.serialization.json.k.c(obj.toString()));
    }

    @Override // kotlinx.serialization.internal.Y0
    public final void U() {
        this.f413071c.invoke(Z());
    }

    @Override // kotlinx.serialization.internal.AbstractC43425r0
    @Y61.k
    public String Y(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        AbstractC43443a abstractC43443a = this.f413070b;
        kotlinx.serialization.json.z zVarD = L.d(serialDescriptor, abstractC43443a);
        if (zVarD == null) {
            return serialDescriptor.d(i12);
        }
        return ((String[]) abstractC43443a.f412957c.a(serialDescriptor, L.f413015b, new J(serialDescriptor, zVarD)))[i12];
    }

    @Y61.k
    public abstract JsonElement Z();

    @Override // kotlinx.serialization.internal.Y0, kotlinx.serialization.encoding.Encoder
    @Y61.k
    /* renamed from: a */
    public final kotlinx.serialization.modules.f getF413080a() {
        return this.f413070b.f412956b;
    }

    public abstract void a0(@Y61.k String str, @Y61.k JsonElement jsonElement);

    @Override // kotlinx.serialization.internal.Y0, kotlinx.serialization.encoding.Encoder
    @Y61.k
    public final kotlinx.serialization.encoding.d c(@Y61.k SerialDescriptor serialDescriptor) {
        AbstractC43453d v12;
        Y41.l aVar = C42745f0.S(this.f412837a) == null ? this.f413071c : new a();
        kotlinx.serialization.descriptors.o f412729b = serialDescriptor.getF412729b();
        boolean z12 = kotlin.jvm.internal.L.f(f412729b, p.b.f412752a) ? true : f412729b instanceof kotlinx.serialization.descriptors.d;
        AbstractC43443a abstractC43443a = this.f413070b;
        if (z12) {
            v12 = new X(abstractC43443a, aVar);
        } else if (kotlin.jvm.internal.L.f(f412729b, p.c.f412753a)) {
            SerialDescriptor serialDescriptorA = s0.a(serialDescriptor.h(0), abstractC43443a.f412956b);
            kotlinx.serialization.descriptors.o f412729b2 = serialDescriptorA.getF412729b();
            if ((f412729b2 instanceof kotlinx.serialization.descriptors.e) || kotlin.jvm.internal.L.f(f412729b2, o.b.f412750a)) {
                Z z13 = new Z(abstractC43443a, aVar);
                z13.f413048h = true;
                v12 = z13;
            } else {
                if (!abstractC43443a.f412955a.f412984d) {
                    throw D.b(serialDescriptorA);
                }
                v12 = new X(abstractC43443a, aVar);
            }
        } else {
            v12 = new V(abstractC43443a, aVar);
        }
        String str = this.f413073e;
        if (str != null) {
            v12.a0(str, kotlinx.serialization.json.k.c(serialDescriptor.getF412799a()));
            this.f413073e = null;
        }
        return v12;
    }

    @Override // kotlinx.serialization.json.t
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final AbstractC43443a getF413070b() {
        return this.f413070b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    @Override // kotlinx.serialization.internal.Y0, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> void f(@Y61.k kotlinx.serialization.x<? super T> r5, T r6) {
        /*
            r4 = this;
            java.util.ArrayList<Tag> r0 = r4.f412837a
            java.lang.Object r0 = kotlin.collections.C42745f0.S(r0)
            kotlinx.serialization.json.a r1 = r4.f413070b
            if (r0 != 0) goto L30
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getF412706c()
            kotlinx.serialization.modules.f r2 = r1.f412956b
            kotlinx.serialization.descriptors.SerialDescriptor r0 = kotlinx.serialization.json.internal.s0.a(r0, r2)
            kotlinx.serialization.descriptors.o r2 = r0.getF412729b()
            boolean r2 = r2 instanceof kotlinx.serialization.descriptors.e
            if (r2 != 0) goto L24
            kotlinx.serialization.descriptors.o r0 = r0.getF412729b()
            kotlinx.serialization.descriptors.o$b r2 = kotlinx.serialization.descriptors.o.b.f412750a
            if (r0 != r2) goto L30
        L24:
            kotlinx.serialization.json.internal.O r0 = new kotlinx.serialization.json.internal.O
            Y41.l<kotlinx.serialization.json.JsonElement, kotlin.G0> r2 = r4.f413071c
            r0.<init>(r1, r2)
            r0.f(r5, r6)
            goto Lc2
        L30:
            kotlinx.serialization.json.f r0 = r1.f412955a
            boolean r2 = r0.f412989i
            if (r2 == 0) goto L3b
            r5.serialize(r4, r6)
            goto Lc2
        L3b:
            boolean r2 = r5 instanceof kotlinx.serialization.internal.AbstractC43393b
            if (r2 == 0) goto L46
            kotlinx.serialization.json.ClassDiscriminatorMode r0 = r0.f412996p
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.f412937b
            if (r0 == r3) goto L7c
            goto L73
        L46:
            kotlinx.serialization.json.ClassDiscriminatorMode r0 = r0.f412996p
            int r0 = r0.ordinal()
            if (r0 == 0) goto L7c
            r3 = 1
            if (r0 == r3) goto L5b
            r1 = 2
            if (r0 != r1) goto L55
            goto L7c
        L55:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L5b:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getF412706c()
            kotlinx.serialization.descriptors.o r0 = r0.getF412729b()
            kotlinx.serialization.descriptors.p$a r3 = kotlinx.serialization.descriptors.p.a.f412751a
            boolean r3 = kotlin.jvm.internal.L.f(r0, r3)
            if (r3 != 0) goto L73
            kotlinx.serialization.descriptors.p$d r3 = kotlinx.serialization.descriptors.p.d.f412754a
            boolean r0 = kotlin.jvm.internal.L.f(r0, r3)
            if (r0 == 0) goto L7c
        L73:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r5.getF412706c()
            java.lang.String r0 = kotlinx.serialization.json.internal.d0.c(r0, r1)
            goto L7d
        L7c:
            r0 = 0
        L7d:
            if (r2 == 0) goto Lbb
            r1 = r5
            kotlinx.serialization.internal.b r1 = (kotlinx.serialization.internal.AbstractC43393b) r1
            if (r6 == 0) goto L9a
            kotlinx.serialization.x r1 = kotlinx.serialization.n.b(r1, r4, r6)
            if (r0 == 0) goto L8d
            kotlinx.serialization.json.internal.d0.a(r5, r1, r0)
        L8d:
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r1.getF412706c()
            kotlinx.serialization.descriptors.o r5 = r5.getF412729b()
            kotlinx.serialization.json.internal.d0.b(r5)
            r5 = r1
            goto Lbb
        L9a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Value for serializer "
            r6.<init>(r0)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r5.getF412706c()
            r6.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        Lbb:
            if (r0 == 0) goto Lbf
            r4.f413073e = r0
        Lbf:
            r5.serialize(r4, r6)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractC43453d.f(kotlinx.serialization.x, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.internal.Y0, kotlinx.serialization.encoding.Encoder
    @Y61.k
    public final Encoder h(@Y61.k SerialDescriptor serialDescriptor) {
        return C42745f0.S(this.f412837a) != null ? super.h(serialDescriptor) : new O(this.f413070b, this.f413071c).h(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.Y0, kotlinx.serialization.encoding.d
    public final boolean u() {
        return this.f413072d.f412981a;
    }

    @Override // kotlinx.serialization.json.t
    public final void z(@Y61.k JsonElement jsonElement) {
        f(kotlinx.serialization.json.q.f413138a, jsonElement);
    }

    @Override // kotlinx.serialization.internal.Y0, kotlinx.serialization.encoding.Encoder
    public final void E() {
    }

    @Override // kotlinx.serialization.internal.AbstractC43425r0
    @Y61.k
    public final String X(@Y61.k String str, @Y61.k String str2) {
        return str2;
    }
}
