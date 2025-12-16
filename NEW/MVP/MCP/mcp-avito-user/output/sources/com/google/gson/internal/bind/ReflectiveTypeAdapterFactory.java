package com.google.gson.internal.bind;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.B;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.m;
import com.google.gson.internal.y;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class ReflectiveTypeAdapterFactory implements r {

    /* renamed from: b, reason: collision with root package name */
    public final m f362051b;

    /* renamed from: c, reason: collision with root package name */
    public final FieldNamingPolicy f362052c;

    /* renamed from: d, reason: collision with root package name */
    public final Excluder f362053d;

    /* renamed from: e, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f362054e;

    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public final y<T> f362055a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f362056b;

        public Adapter(y yVar, LinkedHashMap linkedHashMap) {
            this.f362055a = yVar;
            this.f362056b = linkedHashMap;
        }

        @Override // com.google.gson.TypeAdapter
        public final T read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.F() == JsonToken.f362204j) {
                aVar.z();
                return null;
            }
            T tA2 = this.f362055a.a();
            try {
                aVar.b();
                while (aVar.k()) {
                    a aVar2 = (a) this.f362056b.get(aVar.x());
                    if (aVar2 == null || !aVar2.f362059c) {
                        aVar.L();
                    } else {
                        aVar2.a(aVar, tA2);
                    }
                }
                aVar.g();
                return tA2;
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e12);
            } catch (IllegalStateException e13) {
                throw new JsonSyntaxException(e13);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, T t12) throws IOException {
            if (t12 == null) {
                cVar.j();
                return;
            }
            cVar.c();
            try {
                Iterator it = this.f362056b.values().iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b(cVar, t12);
                }
                cVar.g();
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e12);
            }
        }
    }

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f362057a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f362058b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f362059c;

        public a(String str, boolean z12, boolean z13) {
            this.f362057a = str;
            this.f362058b = z12;
            this.f362059c = z13;
        }

        public abstract void a(com.google.gson.stream.a aVar, Object obj);

        public abstract void b(com.google.gson.stream.c cVar, Object obj);
    }

    public ReflectiveTypeAdapterFactory(m mVar, FieldNamingPolicy fieldNamingPolicy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f362051b = mVar;
        this.f362052c = fieldNamingPolicy;
        this.f362053d = excluder;
        this.f362054e = list;
    }

    public static void b(Field field, Object obj) {
        if (Modifier.isStatic(field.getModifiers())) {
            obj = null;
        }
        if (B.a(field, obj)) {
            return;
        }
        throw new JsonIOException("Field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type or adjust the access filter.");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // com.google.gson.r
    public final <T> com.google.gson.TypeAdapter<T> a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r41v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
