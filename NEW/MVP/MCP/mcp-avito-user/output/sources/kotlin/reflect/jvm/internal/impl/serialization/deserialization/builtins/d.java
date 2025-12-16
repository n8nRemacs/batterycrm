package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import Y61.k;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;
import kotlin.reflect.jvm.internal.impl.storage.p;
import l51.C43547a;

/* compiled from: BuiltInsPackageFragmentImpl.kt */
/* loaded from: classes8.dex */
public final class d extends q implements kotlin.reflect.jvm.internal.impl.builtins.b {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f409781n = new a(null);

    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d a(@Y61.k kotlin.reflect.jvm.internal.impl.name.c r9, @Y61.k kotlin.reflect.jvm.internal.impl.storage.f r10, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.E r11, @Y61.k java.io.InputStream r12, boolean r13) {
            /*
                l51.a$a r0 = l51.C43547a.f413510f     // Catch: java.lang.Throwable -> L4d
                r0.getClass()     // Catch: java.lang.Throwable -> L4d
                l51.a r6 = l51.C43547a.C11773a.a(r12)     // Catch: java.lang.Throwable -> L4d
                l51.a r0 = l51.C43547a.f413511g     // Catch: java.lang.Throwable -> L4d
                int r1 = r0.f409093c     // Catch: java.lang.Throwable -> L4d
                int r2 = r6.f409093c     // Catch: java.lang.Throwable -> L4d
                int r3 = r0.f409092b     // Catch: java.lang.Throwable -> L4d
                int r4 = r6.f409092b     // Catch: java.lang.Throwable -> L4d
                r5 = 0
                r7 = 1
                if (r4 != 0) goto L1e
                if (r3 != 0) goto L1c
                if (r2 != r1) goto L1c
                goto L22
            L1c:
                r7 = r5
                goto L22
            L1e:
                if (r4 != r3) goto L1c
                if (r2 > r1) goto L1c
            L22:
                r1 = 0
                if (r7 == 0) goto L4f
                kotlin.reflect.jvm.internal.impl.protobuf.f r2 = new kotlin.reflect.jvm.internal.impl.protobuf.f     // Catch: java.lang.Throwable -> L4d
                r2.<init>()     // Catch: java.lang.Throwable -> L4d
                l51.C43548b.a(r2)     // Catch: java.lang.Throwable -> L4d
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$g> r3 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.g.f408970l     // Catch: java.lang.Throwable -> L4d
                kotlin.reflect.jvm.internal.impl.protobuf.b r3 = (kotlin.reflect.jvm.internal.impl.protobuf.b) r3     // Catch: java.lang.Throwable -> L4d
                r3.getClass()     // Catch: java.lang.Throwable -> L4d
                kotlin.reflect.jvm.internal.impl.protobuf.e r4 = new kotlin.reflect.jvm.internal.impl.protobuf.e     // Catch: java.lang.Throwable -> L4d
                r4.<init>(r12)     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r2 = r3.a(r4, r2)     // Catch: java.lang.Throwable -> L4d
                kotlin.reflect.jvm.internal.impl.protobuf.o r2 = (kotlin.reflect.jvm.internal.impl.protobuf.o) r2     // Catch: java.lang.Throwable -> L4d
                r4.a(r5)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L49 java.lang.Throwable -> L4d
                kotlin.reflect.jvm.internal.impl.protobuf.b.b(r2)     // Catch: java.lang.Throwable -> L4d
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$g r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.g) r2     // Catch: java.lang.Throwable -> L4d
                r5 = r2
                goto L50
            L49:
                r9 = move-exception
                r9.f409295b = r2     // Catch: java.lang.Throwable -> L4d
                throw r9     // Catch: java.lang.Throwable -> L4d
            L4d:
                r9 = move-exception
                goto L82
            L4f:
                r5 = r1
            L50:
                kotlin.io.c.a(r12, r1)
                if (r5 == 0) goto L61
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d r12 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d
                r8 = 0
                r1 = r12
                r2 = r9
                r3 = r10
                r4 = r11
                r7 = r13
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r12
            L61:
                java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                java.lang.String r11 = "Kotlin built-in definition format version is not supported: expected "
                r10.<init>(r11)
                r10.append(r0)
                java.lang.String r11 = ", actual "
                r10.append(r11)
                r10.append(r6)
                java.lang.String r11 = ". Please update Kotlin"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.<init>(r10)
                throw r9
            L82:
                throw r9     // Catch: java.lang.Throwable -> L83
            L83:
                r10 = move-exception
                kotlin.io.c.a(r12, r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d.a.a(kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.storage.f, kotlin.reflect.jvm.internal.impl.descriptors.E, java.io.InputStream, boolean):kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d");
        }

        public a() {
        }
    }

    public d(kotlin.reflect.jvm.internal.impl.name.c cVar, p pVar, E e12, ProtoBuf.g gVar, C43547a c43547a, boolean z12, C42822w c42822w) {
        super(cVar, pVar, e12, gVar, c43547a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.I, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n
    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("builtins package fragment for ");
        sb2.append(this.f407568f);
        sb2.append(" from ");
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        sb2.append(j.d(this));
        return sb2.toString();
    }
}
