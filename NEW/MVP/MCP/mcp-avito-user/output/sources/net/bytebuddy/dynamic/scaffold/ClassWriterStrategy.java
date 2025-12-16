package net.bytebuddy.dynamic.scaffold;

import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.jar.asm.e;
import net.bytebuddy.jar.asm.g;
import net.bytebuddy.pool.TypePool;

/* loaded from: classes8.dex */
public interface ClassWriterStrategy {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Default implements ClassWriterStrategy {

        /* renamed from: b, reason: collision with root package name */
        public static final Default f416813b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Default[] f416814c;

        public enum a extends Default {
            @Override // net.bytebuddy.dynamic.scaffold.ClassWriterStrategy
            public final b a(int i12, e eVar, TypePool typePool) {
                return new b(i12, eVar, typePool);
            }
        }

        public enum b extends Default {
            @Override // net.bytebuddy.dynamic.scaffold.ClassWriterStrategy
            public final b a(int i12, e eVar, TypePool typePool) {
                return new b(i12, typePool);
            }
        }

        static {
            a aVar = new a("CONSTANT_POOL_RETAINING", 0, null);
            f416813b = aVar;
            f416814c = new Default[]{aVar, new b("CONSTANT_POOL_DISCARDING", 1, null)};
        }

        public Default() {
            throw null;
        }

        public Default(String str, int i12, a aVar) {
        }

        public static Default valueOf(String str) {
            return (Default) Enum.valueOf(Default.class, str);
        }

        public static Default[] values() {
            return (Default[]) f416814c.clone();
        }

        @Override // net.bytebuddy.dynamic.scaffold.ClassWriterStrategy
        public final b b(int i12, TypePool typePool) {
            return new b(i12, typePool);
        }
    }

    b a(int i12, e eVar, TypePool typePool);

    b b(int i12, TypePool typePool);

    public static class b extends g {

        /* renamed from: J, reason: collision with root package name */
        public final TypePool f416815J;

        public b(int i12, e eVar, TypePool typePool) {
            super(eVar, i12);
            this.f416815J = typePool;
        }

        @Override // net.bytebuddy.jar.asm.g
        public final String r(String str, String str2) {
            String strReplace = str.replace('/', '.');
            TypePool typePool = this.f416815J;
            TypeDescription typeDescriptionA = typePool.a(strReplace).a();
            TypeDescription typeDescriptionA2 = typePool.a(str2.replace('/', '.')).a();
            if (typeDescriptionA.Z5(typeDescriptionA2)) {
                return typeDescriptionA.V();
            }
            if (typeDescriptionA.m5(typeDescriptionA2)) {
                return typeDescriptionA2.V();
            }
            if (typeDescriptionA.E() || typeDescriptionA2.E()) {
                return TypeDescription.f416317A2.V();
            }
            do {
                TypeDescription.Generic genericC3 = typeDescriptionA.C3();
                if (genericC3 == null) {
                    return TypeDescription.f416317A2.V();
                }
                typeDescriptionA = genericC3.f5();
            } while (!typeDescriptionA.Z5(typeDescriptionA2));
            return typeDescriptionA.V();
        }

        public b(int i12, TypePool typePool) {
            super(null, i12);
            this.f416815J = typePool;
        }
    }
}
