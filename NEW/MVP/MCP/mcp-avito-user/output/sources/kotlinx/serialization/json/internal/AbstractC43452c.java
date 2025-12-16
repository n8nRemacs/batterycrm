package kotlinx.serialization.json.internal;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.o;
import kotlinx.serialization.descriptors.p;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractC43424q0;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.C43448f;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: TreeJsonDecoder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/internal/c;", "Lkotlinx/serialization/internal/q0;", "Lkotlinx/serialization/json/h;", "Lkotlinx/serialization/json/internal/N;", "Lkotlinx/serialization/json/internal/U;", "Lkotlinx/serialization/json/internal/W;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC43452c extends AbstractC43424q0 implements kotlinx.serialization.json.h {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AbstractC43443a f413063c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final JsonElement f413064d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final C43448f f413065e;

    public AbstractC43452c(AbstractC43443a abstractC43443a, JsonElement jsonElement, C42822w c42822w) {
        this.f413063c = abstractC43443a;
        this.f413064d = jsonElement;
        this.f413065e = abstractC43443a.f412955a;
    }

    @Override // kotlinx.serialization.internal.X0, kotlinx.serialization.encoding.Decoder
    @Y61.k
    public final Decoder A(@Y61.k SerialDescriptor serialDescriptor) {
        if (C42745f0.S(this.f412827a) != null) {
            return super.A(serialDescriptor);
        }
        return new N(this.f413063c, getF413064d()).A(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.X0, kotlinx.serialization.encoding.Decoder
    public boolean E() {
        return !(X() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.internal.X0
    public final byte G(String str) {
        try {
            int iD2 = kotlinx.serialization.json.k.d(Y(str));
            Byte bValueOf = (-128 > iD2 || iD2 > 127) ? null : Byte.valueOf((byte) iD2);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            a0("byte");
            throw null;
        } catch (IllegalArgumentException unused) {
            a0("byte");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.X0
    public final char H(String str) {
        try {
            String f413144d = Y(str).getF413144d();
            int length = f413144d.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return f413144d.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            a0(CharParameter.TYPE);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.X0
    public final double I(String str) throws NumberFormatException {
        String str2 = str;
        JsonPrimitive jsonPrimitiveY = Y(str2);
        try {
            kotlinx.serialization.internal.T t12 = kotlinx.serialization.json.k.f413132a;
            double d12 = Double.parseDouble(jsonPrimitiveY.getF413144d());
            if (this.f413063c.f412955a.f412991k || !(Double.isInfinite(d12) || Double.isNaN(d12))) {
                return d12;
            }
            throw D.c(-1, D.h(Double.valueOf(d12), str2, X().toString()));
        } catch (IllegalArgumentException unused) {
            a0("double");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.X0
    public final int J(String str, SerialDescriptor serialDescriptor) {
        return L.b(serialDescriptor, this.f413063c, Y(str).getF413144d(), "");
    }

    @Override // kotlinx.serialization.internal.X0
    public final float K(String str) throws NumberFormatException {
        String str2 = str;
        JsonPrimitive jsonPrimitiveY = Y(str2);
        try {
            kotlinx.serialization.internal.T t12 = kotlinx.serialization.json.k.f413132a;
            float f12 = Float.parseFloat(jsonPrimitiveY.getF413144d());
            if (this.f413063c.f412955a.f412991k || !(Float.isInfinite(f12) || Float.isNaN(f12))) {
                return f12;
            }
            throw D.c(-1, D.h(Float.valueOf(f12), str2, X().toString()));
        } catch (IllegalArgumentException unused) {
            a0("float");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.X0
    public final Decoder L(String str, SerialDescriptor serialDescriptor) {
        String str2 = str;
        if (l0.a(serialDescriptor)) {
            return new B(new m0(Y(str2).getF413144d()), this.f413063c);
        }
        this.f412827a.add(str2);
        return this;
    }

    @Override // kotlinx.serialization.internal.X0
    public final int M(String str) {
        try {
            return kotlinx.serialization.json.k.d(Y(str));
        } catch (IllegalArgumentException unused) {
            a0(IntParameter.TYPE);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.X0
    public final long N(String str) {
        JsonPrimitive jsonPrimitiveY = Y(str);
        try {
            kotlinx.serialization.internal.T t12 = kotlinx.serialization.json.k.f413132a;
            try {
                return new m0(jsonPrimitiveY.getF413144d()).i();
            } catch (JsonDecodingException e12) {
                throw new NumberFormatException(e12.getMessage());
            }
        } catch (IllegalArgumentException unused) {
            a0(Constants.LONG);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.X0
    public final boolean O(String str) {
        return W(str) != JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.X0
    public final short P(String str) {
        try {
            int iD2 = kotlinx.serialization.json.k.d(Y(str));
            Short shValueOf = (-32768 > iD2 || iD2 > 32767) ? null : Short.valueOf((short) iD2);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            a0("short");
            throw null;
        } catch (IllegalArgumentException unused) {
            a0("short");
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.X0
    public final String Q(String str) {
        String str2 = str;
        JsonPrimitive jsonPrimitiveY = Y(str2);
        if (!this.f413063c.f412955a.f412983c) {
            kotlinx.serialization.json.w wVar = jsonPrimitiveY instanceof kotlinx.serialization.json.w ? (kotlinx.serialization.json.w) jsonPrimitiveY : null;
            if (wVar == null) {
                throw D.c(-1, "Unexpected 'null' literal when non-nullable string was expected");
            }
            if (!wVar.f413142b) {
                throw D.d(AK.c.k("String literal for key '", str2, "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON."), X().toString(), -1);
            }
        }
        if (jsonPrimitiveY instanceof JsonNull) {
            throw D.d("Unexpected 'null' value instead of string literal", X().toString(), -1);
        }
        return jsonPrimitiveY.getF413144d();
    }

    @Y61.k
    public abstract JsonElement W(@Y61.k String str);

    @Y61.k
    public final JsonElement X() {
        JsonElement jsonElementW;
        String str = (String) C42745f0.S(this.f412827a);
        return (str == null || (jsonElementW = W(str)) == null) ? getF413064d() : jsonElementW;
    }

    @Y61.k
    public final JsonPrimitive Y(@Y61.k String str) {
        JsonElement jsonElementW = W(str);
        JsonPrimitive jsonPrimitive = jsonElementW instanceof JsonPrimitive ? (JsonPrimitive) jsonElementW : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw D.d("Expected JsonPrimitive at " + str + ", found " + jsonElementW, X().toString(), -1);
    }

    @Y61.k
    /* renamed from: Z, reason: from getter */
    public JsonElement getF413064d() {
        return this.f413064d;
    }

    @Override // kotlinx.serialization.internal.X0, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.c
    @Y61.k
    /* renamed from: a */
    public final kotlinx.serialization.modules.f getF412999b() {
        return this.f413063c.f412956b;
    }

    public final void a0(String str) {
        throw D.d(AK.c.k("Failed to parse literal as '", str, "' value"), X().toString(), -1);
    }

    @Override // kotlinx.serialization.internal.X0
    public final boolean b(String str) {
        JsonPrimitive jsonPrimitiveY = Y(str);
        try {
            kotlinx.serialization.internal.T t12 = kotlinx.serialization.json.k.f413132a;
            String f413144d = jsonPrimitiveY.getF413144d();
            String[] strArr = n0.f413114a;
            Boolean bool = f413144d.equalsIgnoreCase("true") ? Boolean.TRUE : f413144d.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            a0(BooleanParameter.TYPE);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0(BooleanParameter.TYPE);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.X0, kotlinx.serialization.encoding.Decoder
    @Y61.k
    public kotlinx.serialization.encoding.c c(@Y61.k SerialDescriptor serialDescriptor) {
        JsonElement jsonElementX = X();
        kotlinx.serialization.descriptors.o f412729b = serialDescriptor.getF412729b();
        boolean z12 = kotlin.jvm.internal.L.f(f412729b, p.b.f412752a) ? true : f412729b instanceof kotlinx.serialization.descriptors.d;
        AbstractC43443a abstractC43443a = this.f413063c;
        if (z12) {
            if (jsonElementX instanceof JsonArray) {
                return new W(abstractC43443a, (JsonArray) jsonElementX);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
            sb2.append(n0Var.b(JsonArray.class));
            sb2.append(" as the serialized body of ");
            sb2.append(serialDescriptor.getF412799a());
            sb2.append(", but had ");
            sb2.append(n0Var.b(jsonElementX.getClass()));
            throw D.c(-1, sb2.toString());
        }
        if (!kotlin.jvm.internal.L.f(f412729b, p.c.f412753a)) {
            if (jsonElementX instanceof JsonObject) {
                return new U(this.f413063c, (JsonObject) jsonElementX, null, null, 12, null);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            kotlin.jvm.internal.n0 n0Var2 = kotlin.jvm.internal.m0.f406844a;
            sb3.append(n0Var2.b(JsonObject.class));
            sb3.append(" as the serialized body of ");
            sb3.append(serialDescriptor.getF412799a());
            sb3.append(", but had ");
            sb3.append(n0Var2.b(jsonElementX.getClass()));
            throw D.c(-1, sb3.toString());
        }
        SerialDescriptor serialDescriptorA = s0.a(serialDescriptor.h(0), abstractC43443a.f412956b);
        kotlinx.serialization.descriptors.o f412729b2 = serialDescriptorA.getF412729b();
        if ((f412729b2 instanceof kotlinx.serialization.descriptors.e) || kotlin.jvm.internal.L.f(f412729b2, o.b.f412750a)) {
            if (jsonElementX instanceof JsonObject) {
                return new Y(abstractC43443a, (JsonObject) jsonElementX);
            }
            StringBuilder sb4 = new StringBuilder("Expected ");
            kotlin.jvm.internal.n0 n0Var3 = kotlin.jvm.internal.m0.f406844a;
            sb4.append(n0Var3.b(JsonObject.class));
            sb4.append(" as the serialized body of ");
            sb4.append(serialDescriptor.getF412799a());
            sb4.append(", but had ");
            sb4.append(n0Var3.b(jsonElementX.getClass()));
            throw D.c(-1, sb4.toString());
        }
        if (!abstractC43443a.f412955a.f412984d) {
            throw D.b(serialDescriptorA);
        }
        if (jsonElementX instanceof JsonArray) {
            return new W(abstractC43443a, (JsonArray) jsonElementX);
        }
        StringBuilder sb5 = new StringBuilder("Expected ");
        kotlin.jvm.internal.n0 n0Var4 = kotlin.jvm.internal.m0.f406844a;
        sb5.append(n0Var4.b(JsonArray.class));
        sb5.append(" as the serialized body of ");
        sb5.append(serialDescriptor.getF412799a());
        sb5.append(", but had ");
        sb5.append(n0Var4.b(jsonElementX.getClass()));
        throw D.c(-1, sb5.toString());
    }

    @Override // kotlinx.serialization.json.h
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final AbstractC43443a getF413063c() {
        return this.f413063c;
    }

    @Override // kotlinx.serialization.json.h
    @Y61.k
    public final JsonElement i() {
        return X();
    }

    @Override // kotlinx.serialization.internal.X0, kotlinx.serialization.encoding.Decoder
    public final <T> T m(@Y61.k InterfaceC43386e<? extends T> interfaceC43386e) {
        return (T) d0.d(this, interfaceC43386e);
    }

    @Override // kotlinx.serialization.internal.X0, kotlinx.serialization.encoding.c
    public void d(@Y61.k SerialDescriptor serialDescriptor) {
    }

    @Override // kotlinx.serialization.internal.AbstractC43424q0
    @Y61.k
    public final String U(@Y61.k String str, @Y61.k String str2) {
        return str2;
    }
}
