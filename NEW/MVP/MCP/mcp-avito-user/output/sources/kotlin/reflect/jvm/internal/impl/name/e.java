package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: FqNamesUtil.kt */
@s0
/* loaded from: classes8.dex */
public final class e {

    /* compiled from: FqNamesUtil.kt */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                k kVar = k.f409286b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                k kVar2 = k.f409286b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(@Y61.l java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            kotlin.reflect.jvm.internal.impl.name.k r1 = kotlin.reflect.jvm.internal.impl.name.k.f409286b
            r2 = r0
        L7:
            int r3 = r6.length()
            r4 = 1
            if (r2 >= r3) goto L38
            char r3 = r6.charAt(r2)
            int r5 = r1.ordinal()
            if (r5 == 0) goto L2c
            if (r5 == r4) goto L1e
            r4 = 2
            if (r5 == r4) goto L2c
            goto L35
        L1e:
            r4 = 46
            if (r3 != r4) goto L25
            kotlin.reflect.jvm.internal.impl.name.k r1 = kotlin.reflect.jvm.internal.impl.name.k.f409288d
            goto L35
        L25:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r3 != 0) goto L35
            return r0
        L2c:
            boolean r1 = java.lang.Character.isJavaIdentifierStart(r3)
            if (r1 != 0) goto L33
            return r0
        L33:
            kotlin.reflect.jvm.internal.impl.name.k r1 = kotlin.reflect.jvm.internal.impl.name.k.f409287c
        L35:
            int r2 = r2 + 1
            goto L7
        L38:
            kotlin.reflect.jvm.internal.impl.name.k r6 = kotlin.reflect.jvm.internal.impl.name.k.f409288d
            if (r1 == r6) goto L3d
            r0 = r4
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.name.e.a(java.lang.String):boolean");
    }

    @Y61.k
    public static final c b(@Y61.k c cVar, @Y61.k c cVar2) {
        if (!cVar.equals(cVar2) && !cVar2.d()) {
            String strB = cVar.b();
            String strB2 = cVar2.b();
            if (!C43066x.h0(strB, strB2, false) || strB.charAt(strB2.length()) != '.') {
                return cVar;
            }
        }
        return cVar2.d() ? cVar : cVar.equals(cVar2) ? c.f409242c : new c(cVar.b().substring(cVar2.b().length() + 1));
    }
}
