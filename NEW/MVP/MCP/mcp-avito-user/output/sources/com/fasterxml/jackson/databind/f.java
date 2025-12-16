package com.fasterxml.jackson.databind;

import androidx.camera.camera2.internal.G;
import androidx.media3.common.C23088b;
import com.fasterxml.jackson.annotation.I;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.impl.B;
import com.fasterxml.jackson.databind.deser.m;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.AbstractC36463b;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C;
import com.fasterxml.jackson.databind.util.C36496b;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import lX0.AbstractC43699b;
import oX0.C44705e;

/* compiled from: DeserializationContext.java */
/* loaded from: classes4.dex */
public abstract class f extends d implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.o f341919b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.f f341920c;

    /* renamed from: d, reason: collision with root package name */
    public final e f341921d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341922e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.core.util.i<StreamReadCapability> f341923f;

    /* renamed from: g, reason: collision with root package name */
    public final transient AbstractC43699b f341924g;

    /* renamed from: h, reason: collision with root package name */
    public transient C36496b f341925h;

    /* renamed from: i, reason: collision with root package name */
    public transient com.fasterxml.jackson.databind.util.v f341926i;

    /* renamed from: j, reason: collision with root package name */
    public transient DateFormat f341927j;

    /* renamed from: k, reason: collision with root package name */
    public com.fasterxml.jackson.databind.util.r<h> f341928k;

    /* compiled from: DeserializationContext.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341929a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f341929a = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341929a[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341929a[JsonToken.FIELD_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f341929a[JsonToken.START_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f341929a[JsonToken.END_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f341929a[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f341929a[JsonToken.VALUE_TRUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f341929a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f341929a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f341929a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f341929a[JsonToken.VALUE_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f341929a[JsonToken.VALUE_NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f341929a[JsonToken.NOT_AVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public f(com.fasterxml.jackson.databind.deser.f fVar) {
        if (fVar == null) {
            throw new NullPointerException("Cannot pass null DeserializerFactory");
        }
        this.f341920c = fVar;
        this.f341919b = new com.fasterxml.jackson.databind.deser.o();
        this.f341922e = 0;
        this.f341923f = null;
        this.f341921d = null;
    }

    public static MismatchedInputException b0(AbstractC43699b abstractC43699b, JsonToken jsonToken, String str) {
        return new MismatchedInputException((Closeable) abstractC43699b, d.a("Unexpected token (" + abstractC43699b.f413872d + "), expected " + jsonToken, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> A(i<?> iVar, c cVar, h hVar) {
        boolean z12 = iVar instanceof com.fasterxml.jackson.databind.deser.i;
        i<?> iVar2 = iVar;
        if (z12) {
            this.f341928k = new com.fasterxml.jackson.databind.util.r<>(hVar, this.f341928k);
            try {
                i<?> iVarA = ((com.fasterxml.jackson.databind.deser.i) iVar).a(this, cVar);
            } finally {
                this.f341928k = this.f341928k.f342627b;
            }
        }
        return iVar2;
    }

    public final void B(JsonParser jsonParser, h hVar) throws MismatchedInputException {
        C(hVar, jsonParser.f(), jsonParser, null, new Object[0]);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(h hVar, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws MismatchedInputException {
        String str2;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f341921d.getClass();
        for (com.fasterxml.jackson.databind.util.r rVar = null; rVar != null; rVar = rVar.f342627b) {
            ((com.fasterxml.jackson.databind.deser.n) rVar.f342626a).getClass();
            hVar.getClass();
        }
        if (str == null) {
            String strT = com.fasterxml.jackson.databind.util.g.t(hVar);
            if (jsonToken == null) {
                str = G.f("Unexpected end-of-input when trying read value of type ", strT);
            } else {
                switch (jsonToken.ordinal()) {
                    case 1:
                    case 2:
                    case 5:
                        str2 = "Object value";
                        break;
                    case 3:
                    case 4:
                        str2 = "Array value";
                        break;
                    case 6:
                        str2 = "Embedded Object";
                        break;
                    case 7:
                        str2 = "String value";
                        break;
                    case 8:
                        str2 = "Integer value";
                        break;
                    case 9:
                        str2 = "Floating-point value";
                        break;
                    case 10:
                    case 11:
                        str2 = "Boolean value";
                        break;
                    case 12:
                        str2 = "Null value";
                        break;
                    default:
                        str2 = "[Unavailable value]";
                        break;
                }
                StringBuilder sbB = C23088b.b("Cannot deserialize value of type ", strT, " from ", str2, " (token `JsonToken.");
                sbB.append(jsonToken);
                sbB.append("`)");
                str = sbB.toString();
            }
        }
        if (jsonToken != null && jsonToken.f341103i) {
            jsonParser.L();
        }
        W(str, new Object[0]);
        throw null;
    }

    public final void E(Class cls, JsonParser jsonParser) throws MismatchedInputException {
        C(l(cls), jsonParser.f(), jsonParser, null, new Object[0]);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(h hVar, String str, String str2) throws InvalidTypeIdException {
        this.f341921d.getClass();
        for (com.fasterxml.jackson.databind.util.r rVar = null; rVar != null; rVar = rVar.f342627b) {
            ((com.fasterxml.jackson.databind.deser.n) rVar.f342626a).getClass();
        }
        if (O(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            throw L(hVar, str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(Class cls, String str, String str2, Object... objArr) throws InvalidFormatException {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        this.f341921d.getClass();
        for (com.fasterxml.jackson.databind.util.r rVar = null; rVar != null; rVar = rVar.f342627b) {
            ((com.fasterxml.jackson.databind.deser.n) rVar.f342626a).getClass();
        }
        StringBuilder sbB = C23088b.b("Cannot deserialize Map key of type ", com.fasterxml.jackson.databind.util.g.A(cls), " from String ", d.b(str), ": ");
        sbB.append(str2);
        throw new InvalidFormatException(this.f341924g, sbB.toString(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Class cls, Number number, String str, Object... objArr) throws InvalidFormatException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f341921d.getClass();
        for (com.fasterxml.jackson.databind.util.r rVar = null; rVar != null; rVar = rVar.f342627b) {
            ((com.fasterxml.jackson.databind.deser.n) rVar.f342626a).getClass();
        }
        StringBuilder sbB = C23088b.b("Cannot deserialize value of type ", com.fasterxml.jackson.databind.util.g.A(cls), " from number ", String.valueOf(number), ": ");
        sbB.append(str);
        throw new InvalidFormatException(this.f341924g, sbB.toString(), number);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(Class cls, String str, String str2, Object... objArr) throws InvalidFormatException {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        this.f341921d.getClass();
        for (com.fasterxml.jackson.databind.util.r rVar = null; rVar != null; rVar = rVar.f342627b) {
            ((com.fasterxml.jackson.databind.deser.n) rVar.f342626a).getClass();
        }
        throw a0(str, str2, cls);
    }

    public final boolean J(int i12) {
        return (i12 & this.f341922e) != 0;
    }

    public final ValueInstantiationException K(Class cls, Throwable th2) {
        String strI;
        if (th2 == null) {
            strI = "N/A";
        } else {
            strI = com.fasterxml.jackson.databind.util.g.i(th2);
            if (strI == null) {
                strI = com.fasterxml.jackson.databind.util.g.A(th2.getClass());
            }
        }
        String strN = androidx.compose.ui.graphics.colorspace.e.n("Cannot construct instance of ", com.fasterxml.jackson.databind.util.g.A(cls), ", problem: ", strI);
        l(cls);
        return new ValueInstantiationException(this.f341924g, strN, th2);
    }

    public final InvalidTypeIdException L(h hVar, String str, String str2) {
        return new InvalidTypeIdException(this.f341924g, d.a(androidx.compose.ui.graphics.colorspace.e.n("Could not resolve type id '", str, "' as a subtype of ", com.fasterxml.jackson.databind.util.g.t(hVar)), str2));
    }

    public final boolean N(StreamReadCapability streamReadCapability) {
        com.fasterxml.jackson.core.util.i<StreamReadCapability> iVar = this.f341923f;
        iVar.getClass();
        return (streamReadCapability.a() & iVar.f341305a) != 0;
    }

    public final boolean O(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.f341372c & this.f341922e) != 0;
    }

    public abstract m P(AbstractC36463b abstractC36463b, Object obj);

    public final com.fasterxml.jackson.databind.util.v Q() {
        com.fasterxml.jackson.databind.util.v vVar = this.f341926i;
        if (vVar == null) {
            return new com.fasterxml.jackson.databind.util.v();
        }
        this.f341926i = null;
        return vVar;
    }

    public final Date R(String str) {
        try {
            DateFormat dateFormat = this.f341927j;
            if (dateFormat == null) {
                dateFormat = (DateFormat) this.f341921d.f341506c.f341479g.clone();
                this.f341927j = dateFormat;
            }
            return dateFormat.parse(str);
        } catch (ParseException e12) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.n("Failed to parse Date value '", str, "': ", com.fasterxml.jackson.databind.util.g.i(e12)));
        }
    }

    public final void S(b bVar, com.fasterxml.jackson.databind.introspect.u uVar, String str, Object... objArr) throws InvalidDefinitionException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        StringBuilder sbB = C23088b.b("Invalid definition for property ", com.fasterxml.jackson.databind.util.g.c(uVar.getName()), " (of type ", com.fasterxml.jackson.databind.util.g.A(bVar.f341454a.f341930b), "): ");
        sbB.append(str);
        throw new InvalidDefinitionException(this.f341924g, sbB.toString());
    }

    public final void T(b bVar, String str, Object... objArr) throws InvalidDefinitionException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new InvalidDefinitionException(this.f341924g, androidx.compose.ui.graphics.colorspace.e.n("Invalid type definition for type ", com.fasterxml.jackson.databind.util.g.A(bVar.f341454a.f341930b), ": ", str));
    }

    public final void U(c cVar, String str, Object... objArr) throws MismatchedInputException {
        AbstractC36471j abstractC36471jB;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (cVar != null) {
            cVar.getType();
        }
        MismatchedInputException mismatchedInputException = new MismatchedInputException(this.f341924g, str);
        if (cVar == null || (abstractC36471jB = cVar.b()) == null) {
            throw mismatchedInputException;
        }
        mismatchedInputException.e(abstractC36471jB.h(), cVar.getName());
        throw mismatchedInputException;
    }

    public final void V(i iVar, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        iVar.o();
        throw new MismatchedInputException((Closeable) this.f341924g, str);
    }

    public final void W(String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new MismatchedInputException(this.f341924g, str);
    }

    public final void X(JsonToken jsonToken, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        AbstractC43699b abstractC43699b = this.f341924g;
        throw new MismatchedInputException(abstractC43699b, d.a("Unexpected token (" + abstractC43699b.f413872d + "), expected " + jsonToken, str));
    }

    public final void Y(i<?> iVar, JsonToken jsonToken, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        iVar.o();
        throw b0(this.f341924g, jsonToken, str);
    }

    public final void Z(com.fasterxml.jackson.databind.util.v vVar) {
        com.fasterxml.jackson.databind.util.v vVar2 = this.f341926i;
        if (vVar2 != null) {
            Object[] objArr = vVar.f342638d;
            int length = objArr == null ? 0 : objArr.length;
            Object[] objArr2 = vVar2.f342638d;
            if (length < (objArr2 != null ? objArr2.length : 0)) {
                return;
            }
        }
        this.f341926i = vVar;
    }

    public final InvalidFormatException a0(String str, String str2, Class cls) {
        StringBuilder sbB = C23088b.b("Cannot deserialize value of type ", com.fasterxml.jackson.databind.util.g.A(cls), " from String ", d.b(str), ": ");
        sbB.append(str2);
        return new InvalidFormatException(this.f341924g, sbB.toString(), str);
    }

    @Override // com.fasterxml.jackson.databind.d
    public final com.fasterxml.jackson.databind.cfg.l d() {
        return this.f341921d;
    }

    @Override // com.fasterxml.jackson.databind.d
    public final com.fasterxml.jackson.databind.type.n e() {
        return this.f341921d.f341506c.f341474b;
    }

    @Override // com.fasterxml.jackson.databind.d
    public final Object i(String str) throws InvalidDefinitionException {
        throw new InvalidDefinitionException(this.f341924g, str);
    }

    public final C k(JsonParser jsonParser) {
        C c12 = new C();
        c12.f342555o = false;
        c12.f342543c = jsonParser.k();
        c12.f342544d = jsonParser.H();
        c12.f342545e = C.f342542q;
        c12.f342556p = new C44705e(0, null, null);
        C.c cVar = new C.c();
        c12.f342551k = cVar;
        c12.f342550j = cVar;
        c12.f342552l = 0;
        c12.f342546f = jsonParser.b();
        boolean zA2 = jsonParser.a();
        c12.f342547g = zA2;
        c12.f342548h = c12.f342546f || zA2;
        c12.f342549i = O(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        return c12;
    }

    public final h l(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this.f341921d.c(cls);
    }

    public abstract i<Object> m(AbstractC36463b abstractC36463b, Object obj);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r9.p(com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r9.p(com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:
    
        if (r8 == com.fasterxml.jackson.databind.type.LogicalType.f342444n) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.cfg.CoercionAction n(com.fasterxml.jackson.databind.type.LogicalType r8, java.lang.Class<?> r9, com.fasterxml.jackson.databind.cfg.CoercionInputShape r10) {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.e r9 = r7.f341921d
            com.fasterxml.jackson.databind.cfg.c r0 = r9.f341911m
            r0.getClass()
            com.fasterxml.jackson.databind.cfg.n r1 = r0.f341485c
            com.fasterxml.jackson.databind.cfg.CoercionAction[] r1 = r1.f341483b
            int r2 = r10.ordinal()
            r1 = r1[r2]
            if (r1 == 0) goto L15
            goto L83
        L15:
            int r1 = r10.ordinal()
            com.fasterxml.jackson.databind.cfg.CoercionAction r2 = com.fasterxml.jackson.databind.cfg.CoercionAction.f341462d
            com.fasterxml.jackson.databind.cfg.CoercionAction r3 = com.fasterxml.jackson.databind.cfg.CoercionAction.f341461c
            com.fasterxml.jackson.databind.cfg.CoercionAction r4 = com.fasterxml.jackson.databind.cfg.CoercionAction.f341460b
            r5 = 2
            com.fasterxml.jackson.databind.type.LogicalType r6 = com.fasterxml.jackson.databind.type.LogicalType.f342437g
            if (r1 == r5) goto L3f
            r5 = 3
            if (r1 == r5) goto L34
            r5 = 7
            if (r1 == r5) goto L2b
            goto L4d
        L2b:
            com.fasterxml.jackson.databind.DeserializationFeature r8 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT
            boolean r8 = r9.p(r8)
            if (r8 == 0) goto L4b
            goto L7f
        L34:
            if (r8 != r6) goto L4d
            com.fasterxml.jackson.databind.DeserializationFeature r8 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT
            boolean r8 = r9.p(r8)
            if (r8 == 0) goto L4b
            goto L7d
        L3f:
            com.fasterxml.jackson.databind.type.LogicalType r1 = com.fasterxml.jackson.databind.type.LogicalType.f342440j
            if (r8 != r1) goto L4d
            com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS
            boolean r1 = r9.p(r1)
            if (r1 == 0) goto L4d
        L4b:
            r1 = r4
            goto L83
        L4d:
            com.fasterxml.jackson.databind.type.LogicalType r1 = com.fasterxml.jackson.databind.type.LogicalType.f342438h
            if (r8 == r1) goto L5e
            if (r8 == r6) goto L5e
            com.fasterxml.jackson.databind.type.LogicalType r1 = com.fasterxml.jackson.databind.type.LogicalType.f342439i
            if (r8 == r1) goto L5e
            com.fasterxml.jackson.databind.type.LogicalType r1 = com.fasterxml.jackson.databind.type.LogicalType.f342443m
            if (r8 != r1) goto L5c
            goto L5e
        L5c:
            r1 = 0
            goto L5f
        L5e:
            r1 = 1
        L5f:
            if (r1 == 0) goto L6a
            com.fasterxml.jackson.databind.MapperFeature r5 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_COERCION_OF_SCALARS
            boolean r5 = r9.k(r5)
            if (r5 != 0) goto L6a
            goto L4b
        L6a:
            com.fasterxml.jackson.databind.cfg.CoercionInputShape r5 = com.fasterxml.jackson.databind.cfg.CoercionInputShape.f341469f
            if (r10 != r5) goto L81
            if (r1 != 0) goto L7f
            com.fasterxml.jackson.databind.DeserializationFeature r10 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
            boolean r9 = r9.p(r10)
            if (r9 == 0) goto L79
            goto L7f
        L79:
            com.fasterxml.jackson.databind.type.LogicalType r9 = com.fasterxml.jackson.databind.type.LogicalType.f342444n
            if (r8 != r9) goto L4b
        L7d:
            r1 = r3
            goto L83
        L7f:
            r1 = r2
            goto L83
        L81:
            com.fasterxml.jackson.databind.cfg.CoercionAction r1 = r0.f341484b
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.f.n(com.fasterxml.jackson.databind.type.LogicalType, java.lang.Class, com.fasterxml.jackson.databind.cfg.CoercionInputShape):com.fasterxml.jackson.databind.cfg.CoercionAction");
    }

    public final CoercionAction o(LogicalType logicalType, Class cls) {
        CoercionAction coercionAction = CoercionAction.f341460b;
        e eVar = this.f341921d;
        com.fasterxml.jackson.databind.cfg.c cVar = eVar.f341911m;
        cVar.getClass();
        com.fasterxml.jackson.databind.cfg.n nVar = cVar.f341485c;
        nVar.getClass();
        CoercionAction coercionAction2 = nVar.f341483b[9];
        if (Boolean.FALSE.equals(null)) {
            return coercionAction;
        }
        if (coercionAction2 == null) {
            boolean z12 = logicalType == LogicalType.f342438h || logicalType == LogicalType.f342437g || logicalType == LogicalType.f342439i || logicalType == LogicalType.f342443m;
            coercionAction2 = CoercionAction.f341462d;
            if (!z12 && !eVar.p(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return coercionAction;
            }
        }
        return coercionAction2;
    }

    public final i<Object> p(h hVar, c cVar) {
        return A(this.f341919b.d(this, this.f341920c, hVar), cVar, hVar);
    }

    public final Object q(Object obj, c cVar, Object obj2) {
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        h(obj == null ? null : obj.getClass(), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m r(h hVar, c cVar) throws InvalidDefinitionException {
        try {
            com.fasterxml.jackson.databind.deser.o oVar = this.f341919b;
            com.fasterxml.jackson.databind.deser.f fVar = this.f341920c;
            oVar.getClass();
            m mVarL = fVar.l(this, hVar);
            if (mVarL != 0) {
                if (mVarL instanceof com.fasterxml.jackson.databind.deser.t) {
                    ((com.fasterxml.jackson.databind.deser.t) mVarL).c(this);
                }
                return mVarL instanceof com.fasterxml.jackson.databind.deser.j ? ((com.fasterxml.jackson.databind.deser.j) mVarL).a() : mVarL;
            }
            i("Cannot find a (Map) Key deserializer for type " + hVar);
            throw null;
        } catch (IllegalArgumentException e12) {
            i(com.fasterxml.jackson.databind.util.g.i(e12));
            throw null;
        }
    }

    public final i<Object> s(h hVar) {
        return this.f341919b.d(this, this.f341920c, hVar);
    }

    public abstract com.fasterxml.jackson.databind.deser.impl.z t(Object obj, com.fasterxml.jackson.annotation.G<?> g12, I i12);

    public final i<Object> u(h hVar) {
        com.fasterxml.jackson.databind.deser.o oVar = this.f341919b;
        com.fasterxml.jackson.databind.deser.f fVar = this.f341920c;
        i<?> iVarA = A(oVar.d(this, fVar, hVar), null, hVar);
        com.fasterxml.jackson.databind.jsontype.l lVarO = fVar.o(this.f341921d, hVar);
        return lVarO != null ? new B(lVarO.f(null), iVarA) : iVarA;
    }

    public final C36496b v() {
        if (this.f341925h == null) {
            this.f341925h = new C36496b();
        }
        return this.f341925h;
    }

    public final void w(i<?> iVar) throws InvalidDefinitionException {
        if (this.f341921d.k(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        throw new InvalidDefinitionException(this.f341924g, AK.c.k("Invalid configuration: values of type ", com.fasterxml.jackson.databind.util.g.t(l(iVar.o())), " cannot be merged"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(Class cls, Throwable th2) throws ValueInstantiationException {
        this.f341921d.getClass();
        for (com.fasterxml.jackson.databind.util.r rVar = null; rVar != null; rVar = rVar.f342627b) {
            ((com.fasterxml.jackson.databind.deser.n) rVar.f342626a).getClass();
        }
        com.fasterxml.jackson.databind.util.g.E(th2);
        if (!O(DeserializationFeature.WRAP_EXCEPTIONS)) {
            com.fasterxml.jackson.databind.util.g.F(th2);
        }
        throw K(cls, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object y(Class cls, com.fasterxml.jackson.databind.deser.x xVar, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f341921d.getClass();
        for (com.fasterxml.jackson.databind.util.r rVar = null; rVar != null; rVar = rVar.f342627b) {
            ((com.fasterxml.jackson.databind.deser.n) rVar.f342626a).getClass();
        }
        if (xVar == null) {
            h(cls, androidx.compose.ui.graphics.colorspace.e.n("Cannot construct instance of ", com.fasterxml.jackson.databind.util.g.A(cls), ": ", str));
            throw null;
        }
        if (xVar.m()) {
            throw new MismatchedInputException((Closeable) this.f341924g, androidx.compose.ui.graphics.colorspace.e.n("Cannot construct instance of ", com.fasterxml.jackson.databind.util.g.A(cls), " (although at least one Creator exists): ", str));
        }
        h(cls, androidx.compose.ui.graphics.colorspace.e.n("Cannot construct instance of ", com.fasterxml.jackson.databind.util.g.A(cls), " (no Creators, like default constructor, exist): ", str));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> z(i<?> iVar, c cVar, h hVar) {
        boolean z12 = iVar instanceof com.fasterxml.jackson.databind.deser.i;
        i<?> iVar2 = iVar;
        if (z12) {
            this.f341928k = new com.fasterxml.jackson.databind.util.r<>(hVar, this.f341928k);
            try {
                i<?> iVarA = ((com.fasterxml.jackson.databind.deser.i) iVar).a(this, cVar);
            } finally {
                this.f341928k = this.f341928k.f342627b;
            }
        }
        return iVar2;
    }

    public f(m.a aVar, e eVar, AbstractC43699b abstractC43699b) {
        this.f341919b = aVar.f341919b;
        this.f341920c = aVar.f341920c;
        this.f341923f = abstractC43699b.I();
        this.f341921d = eVar;
        this.f341922e = eVar.f341912n;
        this.f341924g = abstractC43699b;
    }

    public f(m.a aVar, e eVar) {
        this.f341919b = aVar.f341919b;
        this.f341920c = aVar.f341920c;
        this.f341923f = null;
        this.f341921d = eVar;
        this.f341922e = eVar.f341912n;
        this.f341924g = null;
    }
}
