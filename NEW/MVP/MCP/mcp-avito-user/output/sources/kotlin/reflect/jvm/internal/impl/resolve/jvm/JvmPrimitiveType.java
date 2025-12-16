package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.c;

/* loaded from: classes8.dex */
public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.f407160g, BooleanParameter.TYPE, "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.f407161h, CharParameter.TYPE, "C", "java.lang.Character"),
    BYTE(PrimitiveType.f407162i, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.f407163j, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.f407164k, IntParameter.TYPE, "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.f407165l, "float", "F", "java.lang.Float"),
    LONG(PrimitiveType.f407166m, Constants.LONG, "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.f407167n, "double", "D", "java.lang.Double");


    /* renamed from: n, reason: collision with root package name */
    public static final HashSet f409634n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f409635o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public static final EnumMap f409636p = new EnumMap(PrimitiveType.class);

    /* renamed from: q, reason: collision with root package name */
    public static final HashMap f409637q = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final PrimitiveType f409639b;

    /* renamed from: c, reason: collision with root package name */
    public final String f409640c;

    /* renamed from: d, reason: collision with root package name */
    public final String f409641d;

    /* renamed from: e, reason: collision with root package name */
    public final c f409642e;

    static {
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            f409634n.add(jvmPrimitiveType.e());
            f409635o.put(jvmPrimitiveType.f409640c, jvmPrimitiveType);
            f409636p.put((EnumMap) jvmPrimitiveType.d(), (PrimitiveType) jvmPrimitiveType);
            f409637q.put(jvmPrimitiveType.c(), jvmPrimitiveType);
        }
    }

    JvmPrimitiveType(@k PrimitiveType primitiveType, @k String str, @k String str2, @k String str3) {
        if (primitiveType == null) {
            a(6);
            throw null;
        }
        this.f409639b = primitiveType;
        this.f409640c = str;
        this.f409641d = str2;
        this.f409642e = new c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r7) {
        /*
            r0 = 4
            r1 = 2
            if (r7 == r1) goto Lc
            if (r7 == r0) goto Lc
            switch(r7) {
                case 10: goto Lc;
                case 11: goto Lc;
                case 12: goto Lc;
                case 13: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            if (r7 == r1) goto L17
            if (r7 == r0) goto L17
            switch(r7) {
                case 10: goto L17;
                case 11: goto L17;
                case 12: goto L17;
                case 13: goto L17;
                default: goto L15;
            }
        L15:
            r3 = 3
            goto L18
        L17:
            r3 = r1
        L18:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"
            r5 = 0
            switch(r7) {
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L34;
                case 4: goto L39;
                case 5: goto L2f;
                case 6: goto L2a;
                case 7: goto L3c;
                case 8: goto L2f;
                case 9: goto L25;
                case 10: goto L39;
                case 11: goto L39;
                case 12: goto L39;
                case 13: goto L39;
                default: goto L20;
            }
        L20:
            java.lang.String r6 = "className"
            r3[r5] = r6
            goto L40
        L25:
            java.lang.String r6 = "wrapperClassName"
            r3[r5] = r6
            goto L40
        L2a:
            java.lang.String r6 = "primitiveType"
            r3[r5] = r6
            goto L40
        L2f:
            java.lang.String r6 = "desc"
            r3[r5] = r6
            goto L40
        L34:
            java.lang.String r6 = "type"
            r3[r5] = r6
            goto L40
        L39:
            r3[r5] = r4
            goto L40
        L3c:
            java.lang.String r6 = "name"
            r3[r5] = r6
        L40:
            java.lang.String r5 = "get"
            r6 = 1
            if (r7 == r1) goto L61
            if (r7 == r0) goto L61
            switch(r7) {
                case 10: goto L5c;
                case 11: goto L57;
                case 12: goto L52;
                case 13: goto L4d;
                default: goto L4a;
            }
        L4a:
            r3[r6] = r4
            goto L63
        L4d:
            java.lang.String r4 = "getWrapperFqName"
            r3[r6] = r4
            goto L63
        L52:
            java.lang.String r4 = "getDesc"
            r3[r6] = r4
            goto L63
        L57:
            java.lang.String r4 = "getJavaKeywordName"
            r3[r6] = r4
            goto L63
        L5c:
            java.lang.String r4 = "getPrimitiveType"
            r3[r6] = r4
            goto L63
        L61:
            r3[r6] = r5
        L63:
            switch(r7) {
                case 1: goto L75;
                case 2: goto L77;
                case 3: goto L75;
                case 4: goto L77;
                case 5: goto L70;
                case 6: goto L6b;
                case 7: goto L6b;
                case 8: goto L6b;
                case 9: goto L6b;
                case 10: goto L77;
                case 11: goto L77;
                case 12: goto L77;
                case 13: goto L77;
                default: goto L66;
            }
        L66:
            java.lang.String r4 = "isWrapperClassName"
            r3[r1] = r4
            goto L77
        L6b:
            java.lang.String r4 = "<init>"
            r3[r1] = r4
            goto L77
        L70:
            java.lang.String r4 = "getByDesc"
            r3[r1] = r4
            goto L77
        L75:
            r3[r1] = r5
        L77:
            java.lang.String r2 = java.lang.String.format(r2, r3)
            if (r7 == r1) goto L88
            if (r7 == r0) goto L88
            switch(r7) {
                case 10: goto L88;
                case 11: goto L88;
                case 12: goto L88;
                case 13: goto L88;
                default: goto L82;
            }
        L82:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r2)
            goto L8d
        L88:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
        L8d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.a(int):void");
    }

    @k
    public static JvmPrimitiveType b(@k String str) {
        JvmPrimitiveType jvmPrimitiveType = (JvmPrimitiveType) f409635o.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    @k
    public final String c() {
        String str = this.f409641d;
        if (str != null) {
            return str;
        }
        a(12);
        throw null;
    }

    @k
    public final PrimitiveType d() {
        PrimitiveType primitiveType = this.f409639b;
        if (primitiveType != null) {
            return primitiveType;
        }
        a(10);
        throw null;
    }

    @k
    public final c e() {
        c cVar = this.f409642e;
        if (cVar != null) {
            return cVar;
        }
        a(13);
        throw null;
    }
}
