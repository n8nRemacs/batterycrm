package net.bytebuddy.dynamic.scaffold.inline;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.C44396e;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.C44413w;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.K;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.matcher.M;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.ModifierMatcher;

/* compiled from: InliningImplementationMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class c implements LatentMatcher<net.bytebuddy.description.method.a> {

    /* renamed from: b, reason: collision with root package name */
    public final LatentMatcher<? super net.bytebuddy.description.method.a> f417152b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC44410t.a f417153c;

    public c(LatentMatcher latentMatcher, InterfaceC44410t.a aVar) {
        this.f417152b = latentMatcher;
        this.f417153c = aVar;
    }

    public static c b(LatentMatcher latentMatcher, TypeDescription typeDescription) {
        InterfaceC44410t.a aVarD = C44396e.f418423d;
        for (a.d dVar : typeDescription.q()) {
            aVarD = aVarD.d((dVar.v0() ? MethodSortMatcher.Sort.f418387e.f418392c : C44411u.x(dVar.getName())).a(new K(new C44413w(C44411u.f(dVar.getReturnType().f5())))).a(C44411u.A(dVar.getParameters().p2().f1())));
        }
        return new c(latentMatcher, aVarD);
    }

    @Override // net.bytebuddy.matcher.LatentMatcher
    public final InterfaceC44410t<? super net.bytebuddy.description.method.a> a(TypeDescription typeDescription) {
        return new M(this.f417152b.a(typeDescription)).a(MethodSortMatcher.Sort.f418389g.f418392c.a(new M(ModifierMatcher.Mode.FINAL.f418407d)).d(C44411u.k(typeDescription))).d(C44411u.k(typeDescription).a(new M(this.f417153c)));
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f417152b.equals(cVar.f417152b) && this.f417153c.equals(cVar.f417153c);
    }

    public final int hashCode() {
        return this.f417153c.hashCode() + ((this.f417152b.hashCode() + (getClass().hashCode() * 31)) * 31);
    }
}
