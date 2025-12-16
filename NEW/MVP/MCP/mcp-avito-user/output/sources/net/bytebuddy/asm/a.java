package net.bytebuddy.asm;

import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.attribute.FieldAttributeAppender;
import net.bytebuddy.implementation.attribute.MethodAttributeAppender;
import net.bytebuddy.jar.asm.m;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.pool.TypePool;

/* compiled from: MemberAttributeExtension.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public abstract class a<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AnnotationValueFilter.Default f415912b;

    /* renamed from: c, reason: collision with root package name */
    public final T f415913c;

    /* compiled from: MemberAttributeExtension.java */
    public static class b extends a<FieldAttributeAppender.c> implements AsmVisitorWrapper.c.InterfaceC11937c {

        /* compiled from: MemberAttributeExtension.java */
        /* renamed from: net.bytebuddy.asm.a$b$a, reason: collision with other inner class name */
        public static class C11949a extends m {

            /* renamed from: c, reason: collision with root package name */
            public final net.bytebuddy.description.field.a f415914c;

            /* renamed from: d, reason: collision with root package name */
            public final FieldAttributeAppender f415915d;

            /* renamed from: e, reason: collision with root package name */
            public final AnnotationValueFilter f415916e;

            public C11949a(m mVar, net.bytebuddy.description.field.a aVar, FieldAttributeAppender fieldAttributeAppender, AnnotationValueFilter annotationValueFilter, C11948a c11948a) {
                super(net.bytebuddy.utility.e.f418981b, mVar);
                this.f415914c = aVar;
                this.f415915d = fieldAttributeAppender;
                this.f415916e = annotationValueFilter;
            }

            @Override // net.bytebuddy.jar.asm.m
            public final void c() {
                this.f415915d.a(this.f418235b, this.f415914c, this.f415916e);
                super.c();
            }
        }

        public b() {
            super(AnnotationValueFilter.Default.f417489b, FieldAttributeAppender.NoOp.f417493b);
        }
    }

    /* compiled from: MemberAttributeExtension.java */
    public static class c extends a<MethodAttributeAppender.c> implements AsmVisitorWrapper.d.c {

        /* compiled from: MemberAttributeExtension.java */
        /* renamed from: net.bytebuddy.asm.a$c$a, reason: collision with other inner class name */
        public static class C11950a extends s {

            /* renamed from: d, reason: collision with root package name */
            public final net.bytebuddy.description.method.a f415917d;

            /* renamed from: e, reason: collision with root package name */
            public final MethodAttributeAppender f415918e;

            /* renamed from: f, reason: collision with root package name */
            public final AnnotationValueFilter f415919f;

            /* renamed from: g, reason: collision with root package name */
            public boolean f415920g;

            public C11950a(s sVar, net.bytebuddy.description.method.a aVar, MethodAttributeAppender methodAttributeAppender, AnnotationValueFilter annotationValueFilter, C11948a c11948a) {
                super(net.bytebuddy.utility.e.f418981b, sVar);
                this.f415917d = aVar;
                this.f415918e = methodAttributeAppender;
                this.f415919f = annotationValueFilter;
                this.f415920g = true;
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void h() {
                if (this.f415920g) {
                    this.f415918e.c(this.f418282c, this.f415917d, this.f415919f);
                    this.f415920g = false;
                }
                super.h();
            }

            @Override // net.bytebuddy.jar.asm.s
            public final void i() {
                if (this.f415920g) {
                    this.f415918e.c(this.f418282c, this.f415917d, this.f415919f);
                    this.f415920g = false;
                }
                super.i();
            }
        }

        public c() {
            super(AnnotationValueFilter.Default.f417489b, MethodAttributeAppender.NoOp.f417502b);
        }

        @Override // net.bytebuddy.asm.AsmVisitorWrapper.d.c
        public final s a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, s sVar, Implementation.Context context, TypePool typePool, int i12, int i13) {
            MethodAttributeAppender methodAttributeAppenderA = ((MethodAttributeAppender.c) this.f415913c).a(typeDescription);
            AnnotationValueFilter.Default r42 = this.f415912b;
            r42.getClass();
            return new C11950a(sVar, aVar, methodAttributeAppenderA, r42, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(AnnotationValueFilter.Default r12, Object obj) {
        this.f415912b = r12;
        this.f415913c = obj;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f415912b.equals(aVar.f415912b) && this.f415913c.equals(aVar.f415913c);
    }

    public final int hashCode() {
        return this.f415913c.hashCode() + ((this.f415912b.hashCode() + (getClass().hashCode() * 31)) * 31);
    }
}
