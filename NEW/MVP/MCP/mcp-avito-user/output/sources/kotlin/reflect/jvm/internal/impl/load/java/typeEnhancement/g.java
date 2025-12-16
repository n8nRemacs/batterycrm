package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.d;
import kotlin.reflect.jvm.internal.impl.types.H;
import kotlin.reflect.jvm.internal.impl.types.I0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Q;
import kotlin.reflect.jvm.internal.impl.types.X;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: typeEnhancement.kt */
@s0
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d.b f408332a;

    /* compiled from: typeEnhancement.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final J0 f408333a;

        /* renamed from: b, reason: collision with root package name */
        public final int f408334b;

        public a(@Y61.l J0 j02, int i12) {
            this.f408333a = j02;
            this.f408334b = i12;
        }
    }

    /* compiled from: typeEnhancement.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Y f408335a;

        /* renamed from: b, reason: collision with root package name */
        public final int f408336b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f408337c;

        public b(@Y61.l Y y12, int i12, boolean z12) {
            this.f408335a = y12;
            this.f408336b = i12;
            this.f408337c = z12;
        }
    }

    public g(@Y61.k d.b bVar) {
        this.f408332a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g.b a(kotlin.reflect.jvm.internal.impl.types.Y r19, Y41.l<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h> r20, int r21, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g.a(kotlin.reflect.jvm.internal.impl.types.Y, Y41.l, int, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition, boolean, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g$b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [kotlin.reflect.jvm.internal.impl.types.Y] */
    /* JADX WARN: Type inference failed for: r15v3, types: [kotlin.reflect.jvm.internal.impl.types.O] */
    /* JADX WARN: Type inference failed for: r15v4, types: [kotlin.reflect.jvm.internal.impl.types.Y] */
    /* JADX WARN: Type inference failed for: r15v5, types: [kotlin.reflect.jvm.internal.impl.types.J0] */
    /* JADX WARN: Type inference failed for: r15v6 */
    public final a b(J0 j02, Y41.l<? super Integer, h> lVar, int i12, boolean z12) {
        J0 j0B = null;
        if (Q.a(j02)) {
            return new a(null, 1);
        }
        if (!(j02 instanceof H)) {
            if (!(j02 instanceof Y)) {
                throw new NoWhenBranchMatchedException();
            }
            b bVarA = a((Y) j02, lVar, i12, TypeComponentPosition.f408318d, false, z12);
            boolean z13 = bVarA.f408337c;
            J0 j0B2 = bVarA.f408335a;
            if (z13) {
                j0B2 = I0.b(j02, j0B2);
            }
            return new a(j0B2, bVarA.f408336b);
        }
        boolean z14 = j02 instanceof X;
        H h12 = (H) j02;
        b bVarA2 = a(h12.f410024c, lVar, i12, TypeComponentPosition.f408316b, z14, z12);
        b bVarA3 = a(h12.f410025d, lVar, i12, TypeComponentPosition.f408317c, z14, z12);
        Y y12 = bVarA3.f408335a;
        ?? C12 = bVarA2.f408335a;
        if (C12 != 0 || y12 != null) {
            if (bVarA2.f408337c || bVarA3.f408337c) {
                if (y12 != null) {
                    if (C12 == 0) {
                        C12 = y12;
                    }
                    C12 = P.c(C12, y12);
                }
                j0B = I0.b(j02, C12);
            } else {
                Y y13 = h12.f410025d;
                Y y14 = h12.f410024c;
                Y y15 = C12;
                if (z14) {
                    Y y16 = C12;
                    if (C12 == 0) {
                        y16 = y14;
                    }
                    if (y12 == null) {
                        y12 = y13;
                    }
                    j0B = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.i(y16, y12, 0);
                } else {
                    if (C12 == 0) {
                        y15 = y14;
                    }
                    if (y12 == null) {
                        y12 = y13;
                    }
                    j0B = P.c(y15, y12);
                }
            }
        }
        return new a(j0B, bVarA2.f408336b);
    }
}
