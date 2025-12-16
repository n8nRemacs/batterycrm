package net.bytebuddy.dynamic.scaffold.subclass;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.b;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.Q;
import net.bytebuddy.matcher.W;
import net.bytebuddy.matcher.z;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class SubclassImplementationTarget extends Implementation.Target.AbstractBase {

    /* renamed from: d, reason: collision with root package name */
    public final OriginTypeResolver f417168d;

    public enum Factory implements Implementation.Target.a {
        SUPER_CLASS(OriginTypeResolver.f417173b),
        LEVEL_TYPE(OriginTypeResolver.f417174c);


        /* renamed from: b, reason: collision with root package name */
        public final OriginTypeResolver f417172b;

        Factory(OriginTypeResolver originTypeResolver) {
            this.f417172b = originTypeResolver;
        }

        @Override // net.bytebuddy.implementation.Implementation.Target.a
        public final Implementation.Target a(TypeDescription typeDescription, MethodGraph.a aVar, ClassFileVersion classFileVersion) {
            Implementation.Target.AbstractBase.DefaultMethodInvocation defaultMethodInvocation = Implementation.Target.AbstractBase.DefaultMethodInvocation.f417330b;
            return new SubclassImplementationTarget(typeDescription, aVar, classFileVersion.c(ClassFileVersion.f415298j) ? Implementation.Target.AbstractBase.DefaultMethodInvocation.f417330b : Implementation.Target.AbstractBase.DefaultMethodInvocation.f417331c, this.f417172b);
        }
    }

    public SubclassImplementationTarget(TypeDescription typeDescription, MethodGraph.a aVar, Implementation.Target.AbstractBase.DefaultMethodInvocation defaultMethodInvocation, OriginTypeResolver originTypeResolver) {
        super(typeDescription, aVar, defaultMethodInvocation);
        this.f417168d = originTypeResolver;
    }

    @Override // net.bytebuddy.implementation.Implementation.Target
    public final Implementation.SpecialMethodInvocation c(a.g gVar) {
        boolean zEquals = gVar.f416189a.equals("<init>");
        Implementation.SpecialMethodInvocation.Illegal illegal = Implementation.SpecialMethodInvocation.Illegal.f417321b;
        TypeDescription typeDescription = this.f417327a;
        if (!zEquals) {
            MethodGraph.Node nodeD = this.f417328b.a().d(gVar);
            return nodeD.o().f416908c ? Implementation.SpecialMethodInvocation.b.g(nodeD.b(), typeDescription.C3().f5()) : illegal;
        }
        TypeDescription.Generic genericC3 = typeDescription.C3();
        z c11978b = genericC3 == null ? new b.C11978b() : (net.bytebuddy.description.method.b) genericC3.q().P1(new Q(C44411u.f(gVar)).a(new W(typeDescription)));
        return c11978b.size() == 1 ? Implementation.SpecialMethodInvocation.b.g((net.bytebuddy.description.method.a) c11978b.M2(), genericC3.f5()) : illegal;
    }

    @Override // net.bytebuddy.implementation.Implementation.Target.AbstractBase
    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f417168d.equals(((SubclassImplementationTarget) obj).f417168d);
        }
        return false;
    }

    @Override // net.bytebuddy.implementation.Implementation.Target
    public final TypeDefinition f() {
        return this.f417168d.a(this.f417327a);
    }

    @Override // net.bytebuddy.implementation.Implementation.Target.AbstractBase
    public final int hashCode() {
        return this.f417168d.hashCode() + (super.hashCode() * 31);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class OriginTypeResolver {

        /* renamed from: b, reason: collision with root package name */
        public static final OriginTypeResolver f417173b;

        /* renamed from: c, reason: collision with root package name */
        public static final OriginTypeResolver f417174c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ OriginTypeResolver[] f417175d;

        public enum a extends OriginTypeResolver {
            @Override // net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver
            @SuppressFBWarnings(justification = "Assuming super class for given instance.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public final TypeDefinition a(TypeDescription typeDescription) {
                return typeDescription.C3();
            }
        }

        static {
            a aVar = new a("SUPER_CLASS", 0, null);
            f417173b = aVar;
            b bVar = new b("LEVEL_TYPE", 1, null);
            f417174c = bVar;
            f417175d = new OriginTypeResolver[]{aVar, bVar};
        }

        public OriginTypeResolver() {
            throw null;
        }

        public OriginTypeResolver(String str, int i12, a aVar) {
        }

        public static OriginTypeResolver valueOf(String str) {
            return (OriginTypeResolver) Enum.valueOf(OriginTypeResolver.class, str);
        }

        public static OriginTypeResolver[] values() {
            return (OriginTypeResolver[]) f417175d.clone();
        }

        public abstract TypeDefinition a(TypeDescription typeDescription);

        public enum b extends OriginTypeResolver {
            @Override // net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver
            public final TypeDefinition a(TypeDescription typeDescription) {
                return typeDescription;
            }
        }
    }
}
