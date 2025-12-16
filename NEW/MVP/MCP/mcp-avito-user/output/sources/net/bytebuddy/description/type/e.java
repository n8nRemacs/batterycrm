package net.bytebuddy.description.type;

import net.bytebuddy.build.k;
import net.bytebuddy.description.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;

/* compiled from: TypeVariableToken.java */
/* loaded from: classes8.dex */
public class e implements a.InterfaceC11963a<e> {

    /* renamed from: a, reason: collision with root package name */
    public final String f416560a;

    /* renamed from: b, reason: collision with root package name */
    public final d.f f416561b;

    /* renamed from: c, reason: collision with root package name */
    public final net.bytebuddy.description.annotation.a f416562c;

    /* renamed from: d, reason: collision with root package name */
    public transient /* synthetic */ int f416563d;

    public e(String str, d.f fVar, net.bytebuddy.description.annotation.a aVar) {
        this.f416560a = str;
        this.f416561b = fVar;
        this.f416562c = aVar;
    }

    @Override // net.bytebuddy.description.a.InterfaceC11963a
    public final a.InterfaceC11963a a(TypeDescription.Generic.Visitor.d.b bVar) {
        return new e(this.f416560a, new d.f.c(this.f416561b).h0(bVar), this.f416562c);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f416560a.equals(eVar.f416560a) && this.f416561b.equals(eVar.f416561b) && this.f416562c.equals(eVar.f416562c);
    }

    @k.c
    public final int hashCode() {
        int iHashCode;
        if (this.f416563d != 0) {
            iHashCode = 0;
        } else {
            iHashCode = this.f416562c.hashCode() + ((this.f416561b.hashCode() + (this.f416560a.hashCode() * 31)) * 31);
        }
        if (iHashCode == 0) {
            return this.f416563d;
        }
        this.f416563d = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.f416560a;
    }
}
