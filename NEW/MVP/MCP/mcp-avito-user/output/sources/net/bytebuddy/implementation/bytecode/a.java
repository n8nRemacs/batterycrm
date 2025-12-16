package net.bytebuddy.implementation.bytecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.s;

/* compiled from: ByteCodeAppender.java */
/* loaded from: classes7.dex */
public interface a {

    /* compiled from: ByteCodeAppender.java */
    @HashCodeAndEqualsPlugin.Enhance
    /* renamed from: net.bytebuddy.implementation.bytecode.a$a, reason: collision with other inner class name */
    public static class C12102a implements a {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f417846b;

        public C12102a() {
            throw null;
        }

        public C12102a(a... aVarArr) {
            List<a> listAsList = Arrays.asList(aVarArr);
            this.f417846b = new ArrayList();
            for (a aVar : listAsList) {
                if (aVar instanceof C12102a) {
                    this.f417846b.addAll(((C12102a) aVar).f417846b);
                } else {
                    this.f417846b.add(aVar);
                }
            }
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f417846b.equals(((C12102a) obj).f417846b);
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            c cVar = new c(0, aVar.p());
            Iterator it = this.f417846b.iterator();
            while (it.hasNext()) {
                c cVarH = ((a) it.next()).h(sVar, context, aVar);
                cVar = new c(Math.max(cVar.f417849a, cVarH.f417849a), Math.max(cVar.f417850b, cVarH.f417850b));
            }
            return cVar;
        }

        public final int hashCode() {
            return this.f417846b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    /* compiled from: ByteCodeAppender.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements a {

        /* renamed from: b, reason: collision with root package name */
        public final StackManipulation.b f417847b;

        public b(StackManipulation... stackManipulationArr) {
            this((List<? extends StackManipulation>) Arrays.asList(stackManipulationArr));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f417847b.equals(((b) obj).f417847b);
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            StackManipulation.d dVarN = this.f417847b.n(sVar, context);
            return new c(dVarN.f417834b, aVar.p());
        }

        public final int hashCode() {
            return this.f417847b.hashCode() + (getClass().hashCode() * 31);
        }

        public b(List<? extends StackManipulation> list) {
            this.f417847b = new StackManipulation.b(list);
        }
    }

    /* compiled from: ByteCodeAppender.java */
    @HashCodeAndEqualsPlugin.Enhance
    public static class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f417848c = new c(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f417849a;

        /* renamed from: b, reason: collision with root package name */
        public final int f417850b;

        public c(int i12, int i13) {
            this.f417849a = i12;
            this.f417850b = i13;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f417849a == cVar.f417849a && this.f417850b == cVar.f417850b;
        }

        public final int hashCode() {
            return (((getClass().hashCode() * 31) + this.f417849a) * 31) + this.f417850b;
        }
    }

    c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar);
}
