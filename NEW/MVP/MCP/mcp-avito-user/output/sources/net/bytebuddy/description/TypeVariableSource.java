package net.bytebuddy.description;

import net.bytebuddy.description.c;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.matcher.C44411u;

/* loaded from: classes8.dex */
public interface TypeVariableSource extends c.f {

    public interface Visitor<T> {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements Visitor<TypeVariableSource> {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f416032b = {new NoOp("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            NoOp EF5;

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f416032b.clone();
            }
        }
    }

    public static abstract class a extends c.a implements TypeVariableSource {
        @Override // net.bytebuddy.description.TypeVariableSource
        public final TypeDescription.Generic Y(String str) {
            TypeDescription.Generic genericW0 = w0(str);
            if (genericW0 != null) {
                return genericW0;
            }
            throw new IllegalArgumentException("Cannot resolve " + str + " from " + this);
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        @net.bytebuddy.utility.nullability.b
        public final TypeDescription.Generic w0(String str) {
            d.f fVarP1 = r().P1(C44411u.x(str));
            if (!fVarP1.isEmpty()) {
                return fVarP1.M2();
            }
            TypeVariableSource typeVariableSourceC0 = c0();
            if (typeVariableSourceC0 != null) {
                return typeVariableSourceC0.w0(str);
            }
            TypeDescription.Generic.d.b bVar = TypeDescription.Generic.f416323x2;
            return null;
        }
    }

    boolean Q();

    boolean T();

    TypeDescription.Generic Y(String str);

    @net.bytebuddy.utility.nullability.b
    TypeVariableSource c0();

    d.f r();

    Object v(TypeDescription.Generic.Visitor.d.e.b bVar);

    @net.bytebuddy.utility.nullability.b
    TypeDescription.Generic w0(String str);
}
