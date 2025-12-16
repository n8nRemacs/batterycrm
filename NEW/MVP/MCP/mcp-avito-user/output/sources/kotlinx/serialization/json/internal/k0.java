package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.C43448f;
import kotlinx.serialization.json.JsonElement;

/* compiled from: StreamingJsonEncoder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/internal/k0;", "Lkotlinx/serialization/json/t;", "Lkotlinx/serialization/encoding/b;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k0 extends kotlinx.serialization.encoding.b implements kotlinx.serialization.json.t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43466q f413100a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC43443a f413101b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WriteMode f413102c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final kotlinx.serialization.json.t[] f413103d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlinx.serialization.modules.f f413104e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43448f f413105f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f413106g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public String f413107h;

    /* compiled from: StreamingJsonEncoder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WriteMode writeMode = WriteMode.f413034d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WriteMode writeMode2 = WriteMode.f413034d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k0(@Y61.k C43466q c43466q, @Y61.k AbstractC43443a abstractC43443a, @Y61.k WriteMode writeMode, @Y61.l kotlinx.serialization.json.t[] tVarArr) {
        this.f413100a = c43466q;
        this.f413101b = abstractC43443a;
        this.f413102c = writeMode;
        this.f413103d = tVarArr;
        this.f413104e = abstractC43443a.f412956b;
        this.f413105f = abstractC43443a.f412955a;
        int iOrdinal = writeMode.ordinal();
        if (tVarArr != null) {
            kotlinx.serialization.json.t tVar = tVarArr[iOrdinal];
            if (tVar == null && tVar == this) {
                return;
            }
            tVarArr[iOrdinal] = this;
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void B(double d12) {
        boolean z12 = this.f413106g;
        C43466q c43466q = this.f413100a;
        if (z12) {
            b(String.valueOf(d12));
        } else {
            c43466q.f413124a.c(String.valueOf(d12));
        }
        if (this.f413105f.f412991k) {
            return;
        }
        if (Double.isInfinite(d12) || Double.isNaN(d12)) {
            throw D.a(Double.valueOf(d12), c43466q.f413124a.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void C() {
        this.f413100a.f413124a.c("null");
    }

    @Override // kotlinx.serialization.encoding.b
    public final void H(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        String strD;
        int iOrdinal = this.f413102c.ordinal();
        boolean z12 = true;
        C43466q c43466q = this.f413100a;
        if (iOrdinal == 1) {
            if (!c43466q.f413125b) {
                c43466q.e(',');
            }
            c43466q.b();
            return;
        }
        if (iOrdinal == 2) {
            if (c43466q.f413125b) {
                this.f413106g = true;
                c43466q.b();
                return;
            }
            if (i12 % 2 == 0) {
                c43466q.e(',');
                c43466q.b();
            } else {
                c43466q.e(':');
                c43466q.k();
                z12 = false;
            }
            this.f413106g = z12;
            return;
        }
        if (iOrdinal == 3) {
            if (i12 == 0) {
                this.f413106g = true;
            }
            if (i12 == 1) {
                c43466q.e(',');
                c43466q.k();
                this.f413106g = false;
                return;
            }
            return;
        }
        if (!c43466q.f413125b) {
            c43466q.e(',');
        }
        c43466q.b();
        AbstractC43443a abstractC43443a = this.f413101b;
        kotlinx.serialization.json.z zVarD = L.d(serialDescriptor, abstractC43443a);
        if (zVarD == null) {
            strD = serialDescriptor.d(i12);
        } else {
            strD = ((String[]) abstractC43443a.f412957c.a(serialDescriptor, L.f413015b, new J(serialDescriptor, zVarD)))[i12];
        }
        b(strD);
        c43466q.e(':');
        c43466q.k();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final kotlinx.serialization.modules.f getF413080a() {
        return this.f413104e;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void b(@Y61.k String str) {
        this.f413100a.j(str);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    @Y61.k
    public final kotlinx.serialization.encoding.d c(@Y61.k SerialDescriptor serialDescriptor) {
        kotlinx.serialization.json.t tVar;
        AbstractC43443a abstractC43443a = this.f413101b;
        WriteMode writeModeB = s0.b(serialDescriptor, abstractC43443a);
        C43466q c43466q = this.f413100a;
        c43466q.e(writeModeB.f413040b);
        c43466q.a();
        if (this.f413107h != null) {
            c43466q.b();
            b(this.f413107h);
            c43466q.e(':');
            c43466q.k();
            b(serialDescriptor.getF412799a());
            this.f413107h = null;
        }
        if (this.f413102c == writeModeB) {
            return this;
        }
        kotlinx.serialization.json.t[] tVarArr = this.f413103d;
        return (tVarArr == null || (tVar = tVarArr[writeModeB.ordinal()]) == null) ? new k0(c43466q, abstractC43443a, writeModeB, tVarArr) : tVar;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public final void d(@Y61.k SerialDescriptor serialDescriptor) {
        WriteMode writeMode = this.f413102c;
        char c12 = writeMode.f413041c;
        C43466q c43466q = this.f413100a;
        c43466q.l();
        c43466q.c();
        c43466q.e(writeMode.f413041c);
    }

    @Override // kotlinx.serialization.json.t
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final AbstractC43443a getF413070b() {
        return this.f413101b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> void f(@Y61.k kotlinx.serialization.x<? super T> r5, T r6) {
        /*
            r4 = this;
            kotlinx.serialization.json.a r0 = r4.f413101b
            kotlinx.serialization.json.f r1 = r0.f412955a
            boolean r2 = r1.f412989i
            if (r2 == 0) goto Ld
            r5.serialize(r4, r6)
            goto L94
        Ld:
            boolean r2 = r5 instanceof kotlinx.serialization.internal.AbstractC43393b
            if (r2 == 0) goto L18
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f412996p
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.f412937b
            if (r1 == r3) goto L4e
            goto L45
        L18:
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f412996p
            int r1 = r1.ordinal()
            if (r1 == 0) goto L4e
            r3 = 1
            if (r1 == r3) goto L2d
            r0 = 2
            if (r1 != r0) goto L27
            goto L4e
        L27:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L2d:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getF332717a()
            kotlinx.serialization.descriptors.o r1 = r1.getF412729b()
            kotlinx.serialization.descriptors.p$a r3 = kotlinx.serialization.descriptors.p.a.f412751a
            boolean r3 = kotlin.jvm.internal.L.f(r1, r3)
            if (r3 != 0) goto L45
            kotlinx.serialization.descriptors.p$d r3 = kotlinx.serialization.descriptors.p.d.f412754a
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 == 0) goto L4e
        L45:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r5.getF332717a()
            java.lang.String r0 = kotlinx.serialization.json.internal.d0.c(r1, r0)
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r2 == 0) goto L8d
            r1 = r5
            kotlinx.serialization.internal.b r1 = (kotlinx.serialization.internal.AbstractC43393b) r1
            if (r6 == 0) goto L6c
            kotlinx.serialization.x r1 = kotlinx.serialization.n.b(r1, r4, r6)
            if (r0 == 0) goto L5f
            kotlinx.serialization.json.internal.d0.a(r5, r1, r0)
        L5f:
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r1.getF332717a()
            kotlinx.serialization.descriptors.o r5 = r5.getF412729b()
            kotlinx.serialization.json.internal.d0.b(r5)
            r5 = r1
            goto L8d
        L6c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Value for serializer "
            r6.<init>(r0)
            kotlinx.serialization.descriptors.SerialDescriptor r5 = r5.getF332717a()
            r6.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L8d:
            if (r0 == 0) goto L91
            r4.f413107h = r0
        L91:
            r5.serialize(r4, r6)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.k0.f(kotlinx.serialization.x, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void g(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        b(serialDescriptor.d(i12));
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    @Y61.k
    public final Encoder h(@Y61.k SerialDescriptor serialDescriptor) {
        boolean zA2 = l0.a(serialDescriptor);
        WriteMode writeMode = this.f413102c;
        AbstractC43443a abstractC43443a = this.f413101b;
        C43466q rVar = this.f413100a;
        if (zA2) {
            if (!(rVar instanceof C43467s)) {
                rVar = new C43467s(rVar.f413124a, this.f413106g);
            }
            return new k0(rVar, abstractC43443a, writeMode, null);
        }
        if (!serialDescriptor.getF412817l() || !serialDescriptor.equals(kotlinx.serialization.json.k.f413132a)) {
            return this;
        }
        if (!(rVar instanceof r)) {
            rVar = new r(rVar.f413124a, this.f413106g);
        }
        return new k0(rVar, abstractC43443a, writeMode, null);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void i(short s5) {
        if (this.f413106g) {
            b(String.valueOf((int) s5));
        } else {
            this.f413100a.i(s5);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void j(boolean z12) {
        if (this.f413106g) {
            b(String.valueOf(z12));
        } else {
            this.f413100a.f413124a.c(String.valueOf(z12));
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void m(int i12) {
        if (this.f413106g) {
            b(String.valueOf(i12));
        } else {
            this.f413100a.f(i12);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public final <T> void p(@Y61.k SerialDescriptor serialDescriptor, int i12, @Y61.k kotlinx.serialization.x<? super T> xVar, @Y61.l T t12) {
        if (t12 != null || this.f413105f.f412986f) {
            super.p(serialDescriptor, i12, xVar, t12);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void r(long j12) {
        if (this.f413106g) {
            b(String.valueOf(j12));
        } else {
            this.f413100a.g(j12);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void t(char c12) {
        b(String.valueOf(c12));
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public final boolean u() {
        return this.f413105f.f412981a;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void w(byte b12) {
        if (this.f413106g) {
            b(String.valueOf((int) b12));
        } else {
            this.f413100a.d(b12);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.Encoder
    public final void y(float f12) {
        boolean z12 = this.f413106g;
        C43466q c43466q = this.f413100a;
        if (z12) {
            b(String.valueOf(f12));
        } else {
            c43466q.f413124a.c(String.valueOf(f12));
        }
        if (this.f413105f.f412991k) {
            return;
        }
        if (Float.isInfinite(f12) || Float.isNaN(f12)) {
            throw D.a(Float.valueOf(f12), c43466q.f413124a.toString());
        }
    }

    @Override // kotlinx.serialization.json.t
    public final void z(@Y61.k JsonElement jsonElement) {
        f(kotlinx.serialization.json.q.f413138a, jsonElement);
    }
}
