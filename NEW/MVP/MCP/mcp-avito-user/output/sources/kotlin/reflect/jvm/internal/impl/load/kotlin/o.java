package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collections;
import java.util.Set;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;

/* compiled from: DeserializedDescriptorResolver.kt */
@s0
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f408534b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Set<KotlinClassHeader.Kind> f408535c = Collections.singleton(KotlinClassHeader.Kind.f408499f);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Set<KotlinClassHeader.Kind> f408536d = C42756l.l0(new KotlinClassHeader.Kind[]{KotlinClassHeader.Kind.f408500g, KotlinClassHeader.Kind.f408503j});

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final m51.e f408537e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final m51.e f408538f;

    /* renamed from: a, reason: collision with root package name */
    public C42954k f408539a;

    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new m51.e(new int[]{1, 1, 2}, false);
        f408537e = new m51.e(new int[]{1, 1, 11}, false);
        f408538f = new m51.e(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w a(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.K r14, @Y61.k kotlin.reflect.jvm.internal.impl.load.kotlin.z r15) {
        /*
            r13 = this;
            java.lang.String r0 = "Could not read data from "
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r15.a()
            java.lang.String[] r2 = r1.f408491c
            if (r2 != 0) goto Lc
            java.lang.String[] r2 = r1.f408492d
        Lc:
            r3 = 0
            if (r2 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = r1.f408489a
            java.util.Set<kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind> r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.o.f408536d
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L1a
            goto L1b
        L1a:
            r2 = r3
        L1b:
            if (r2 != 0) goto L1e
            return r3
        L1e:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r15.a()
            java.lang.String[] r1 = r1.f408493e
            if (r1 != 0) goto L27
            return r3
        L27:
            kotlin.Q r0 = m51.i.h(r2, r1)     // Catch: java.lang.Throwable -> L2c kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L2e
            goto L61
        L2c:
            r0 = move-exception
            goto L45
        L2e:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r15.j()     // Catch: java.lang.Throwable -> L2c
            r4.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L45:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r1 = r13.f408539a
            if (r1 == 0) goto L4a
            goto L4b
        L4a:
            r1 = r3
        L4b:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l r1 = r1.f409916c
            r1.getClass()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r15.a()
            m51.e r1 = r1.f408490b
            m51.e r2 = r13.d()
            boolean r1 = r1.b(r2)
            if (r1 != 0) goto La9
            r0 = r3
        L61:
            if (r0 != 0) goto L64
            return r3
        L64:
            A r1 = r0.f406619b
            r7 = r1
            m51.f r7 = (m51.f) r7
            B r0 = r0.f406620c
            r6 = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$f r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.f) r6
            kotlin.reflect.jvm.internal.impl.load.kotlin.t r9 = new kotlin.reflect.jvm.internal.impl.load.kotlin.t
            r13.c(r15)
            r13.e(r15)
            r13.b(r15)
            r9.<init>(r15, r6, r7)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r15 = r15.a()
            m51.e r8 = r15.f408490b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r15 = r13.f408539a
            if (r15 == 0) goto L8a
            r10 = r15
            goto L8b
        L8a:
            r10 = r3
        L8b:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "scope for "
            r15.<init>(r1)
            r15.append(r9)
            java.lang.String r1 = " in "
            r15.append(r1)
            r15.append(r14)
            java.lang.String r11 = r15.toString()
            kotlin.reflect.jvm.internal.impl.load.kotlin.p r12 = kotlin.reflect.jvm.internal.impl.load.kotlin.p.f408540l
            r4 = r0
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.o.a(kotlin.reflect.jvm.internal.impl.descriptors.K, kotlin.reflect.jvm.internal.impl.load.kotlin.z):kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w");
    }

    public final DeserializedContainerAbiStability b(z zVar) {
        C42954k c42954k = this.f408539a;
        if (c42954k == null) {
            c42954k = null;
        }
        c42954k.f409916c.getClass();
        int i12 = zVar.a().f408495g;
        if (((i12 & 64) != 0) && (i12 & 32) == 0) {
            return DeserializedContainerAbiStability.f409789c;
        }
        int i13 = zVar.a().f408495g;
        return ((i13 & 16) == 0 || (i13 & 32) != 0) ? DeserializedContainerAbiStability.f409788b : DeserializedContainerAbiStability.f409790d;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.u<m51.e> c(z zVar) {
        C42954k c42954k = this.f408539a;
        if (c42954k == null) {
            c42954k = null;
        }
        c42954k.f409916c.getClass();
        if (zVar.a().f408490b.b(d())) {
            return null;
        }
        m51.e eVar = zVar.a().f408490b;
        m51.e eVar2 = m51.e.f414319g;
        m51.e eVarD = d();
        m51.e eVarD2 = d();
        m51.e eVar3 = zVar.a().f408490b;
        eVarD2.getClass();
        m51.e eVar4 = eVar3.f414321f ? eVar2 : m51.e.f414320h;
        eVar4.getClass();
        int i12 = eVarD2.f409092b;
        int i13 = eVar4.f409092b;
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.u<>(eVar, eVar2, eVarD, (i13 <= i12 && (i13 < i12 || eVar4.f409093c <= eVarD2.f409093c)) ? eVarD2 : eVar4, zVar.j(), zVar.c());
    }

    public final m51.e d() {
        C42954k c42954k = this.f408539a;
        if (c42954k == null) {
            c42954k = null;
        }
        c42954k.f409916c.getClass();
        return m51.e.f414319g;
    }

    public final boolean e(z zVar) {
        C42954k c42954k = this.f408539a;
        if (c42954k == null) {
            c42954k = null;
        }
        c42954k.f409916c.getClass();
        C42954k c42954k2 = this.f408539a;
        (c42954k2 != null ? c42954k2 : null).f409916c.getClass();
        return (zVar.a().f408495g & 2) != 0 && zVar.a().f408490b.equals(f408537e);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42950g f(@Y61.k kotlin.reflect.jvm.internal.impl.load.kotlin.z r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Could not read data from "
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r6.a()
            java.lang.String[] r2 = r1.f408491c
            if (r2 != 0) goto Lc
            java.lang.String[] r2 = r1.f408492d
        Lc:
            r3 = 0
            if (r2 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = r1.f408489a
            java.util.Set<kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind> r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.o.f408535c
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L1a
            goto L1b
        L1a:
            r2 = r3
        L1b:
            if (r2 != 0) goto L1e
            return r3
        L1e:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r6.a()
            java.lang.String[] r1 = r1.f408493e
            if (r1 != 0) goto L27
            return r3
        L27:
            kotlin.Q r0 = m51.i.f(r2, r1)     // Catch: java.lang.Throwable -> L2c kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L2e
            goto L61
        L2c:
            r0 = move-exception
            goto L45
        L2e:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r6.j()     // Catch: java.lang.Throwable -> L2c
            r4.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L45:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r1 = r5.f408539a
            if (r1 == 0) goto L4a
            goto L4b
        L4a:
            r1 = r3
        L4b:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l r1 = r1.f409916c
            r1.getClass()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r6.a()
            m51.e r1 = r1.f408490b
            m51.e r2 = r5.d()
            boolean r1 = r1.b(r2)
            if (r1 != 0) goto L86
            r0 = r3
        L61:
            if (r0 != 0) goto L64
            return r3
        L64:
            A r1 = r0.f406619b
            m51.f r1 = (m51.f) r1
            B r0 = r0.f406620c
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r0
            kotlin.reflect.jvm.internal.impl.load.kotlin.B r2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.B
            r5.c(r6)
            r5.e(r6)
            r5.b(r6)
            r2.<init>(r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.g r3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.g
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r6 = r6.a()
            m51.e r6 = r6.f408490b
            r3.<init>(r1, r0, r6, r2)
            return r3
        L86:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.o.f(kotlin.reflect.jvm.internal.impl.load.kotlin.z):kotlin.reflect.jvm.internal.impl.serialization.deserialization.g");
    }
}
