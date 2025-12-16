package kotlinx.serialization.json.internal;

import androidx.media3.common.C23088b;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.o;
import kotlinx.serialization.internal.AbstractC43393b;
import kotlinx.serialization.internal.D0;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.InterfaceC43447e;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: Polymorphic.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d0 {

    /* compiled from: Polymorphic.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ClassDiscriminatorMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ClassDiscriminatorMode classDiscriminatorMode = ClassDiscriminatorMode.f412937b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ClassDiscriminatorMode classDiscriminatorMode2 = ClassDiscriminatorMode.f412937b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(kotlinx.serialization.x xVar, kotlinx.serialization.x xVar2, String str) {
        if ((xVar instanceof kotlinx.serialization.r) && D0.a(xVar2.getF332717a()).contains(str)) {
            StringBuilder sbB = C23088b.b("Sealed class '", xVar2.getF332717a().getF412799a(), "' cannot be serialized as base class '", ((kotlinx.serialization.r) xVar).getF332717a().getF412799a(), "' because it has property name that conflicts with JSON class discriminator '");
            sbB.append(str);
            sbB.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            throw new IllegalStateException(sbB.toString().toString());
        }
    }

    public static final void b(@Y61.k kotlinx.serialization.descriptors.o oVar) {
        if (oVar instanceof o.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (oVar instanceof kotlinx.serialization.descriptors.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (oVar instanceof kotlinx.serialization.descriptors.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    @Y61.k
    public static final String c(@Y61.k SerialDescriptor serialDescriptor, @Y61.k AbstractC43443a abstractC43443a) {
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof InterfaceC43447e) {
                ((InterfaceC43447e) annotation).getClass();
                return null;
            }
        }
        return abstractC43443a.f412955a.f412990j;
    }

    public static final <T> T d(@Y61.k kotlinx.serialization.json.h hVar, @Y61.k InterfaceC43386e<? extends T> interfaceC43386e) {
        if (!(interfaceC43386e instanceof AbstractC43393b) || hVar.getF413090a().f412955a.f412989i) {
            return interfaceC43386e.deserialize(hVar);
        }
        String strC = c(interfaceC43386e.getF332717a(), hVar.getF413090a());
        JsonElement jsonElementI = hVar.i();
        SerialDescriptor f412706c = interfaceC43386e.getF332717a();
        if (!(jsonElementI instanceof JsonObject)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
            sb2.append(n0Var.b(JsonObject.class));
            sb2.append(" as the serialized body of ");
            sb2.append(f412706c.getF412799a());
            sb2.append(", but had ");
            sb2.append(n0Var.b(jsonElementI.getClass()));
            throw D.c(-1, sb2.toString());
        }
        JsonObject jsonObject = (JsonObject) jsonElementI;
        JsonElement jsonElement = (JsonElement) jsonObject.get(strC);
        String f413144d = null;
        if (jsonElement != null) {
            kotlinx.serialization.internal.T t12 = kotlinx.serialization.json.k.f413132a;
            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
            if (jsonPrimitive == null) {
                throw new IllegalArgumentException("Element " + kotlin.jvm.internal.m0.f406844a.b(jsonElement.getClass()) + " is not a JsonPrimitive");
            }
            if (!(jsonPrimitive instanceof JsonNull)) {
                f413144d = jsonPrimitive.getF413144d();
            }
        }
        try {
            InterfaceC43386e interfaceC43386eA = kotlinx.serialization.n.a((AbstractC43393b) interfaceC43386e, hVar, f413144d);
            return (T) d(new U(hVar.getF413090a(), jsonObject, strC, interfaceC43386eA.getF332717a()), interfaceC43386eA);
        } catch (SerializationException e12) {
            throw D.d(e12.getMessage(), jsonObject.toString(), -1);
        }
    }
}
