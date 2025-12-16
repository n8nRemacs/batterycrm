package b61;

import net.bytebuddy.jar.asm.AbstractC44388a;

/* compiled from: AnnotationRemapper.java */
/* renamed from: b61.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C25417a extends AbstractC44388a {

    /* renamed from: c, reason: collision with root package name */
    public final String f56919c;

    /* renamed from: d, reason: collision with root package name */
    public final h f56920d;

    public C25417a(int i12, String str, AbstractC44388a abstractC44388a, h hVar) {
        super(i12, abstractC44388a);
        this.f56919c = str;
        this.f56920d = hVar;
    }

    @Override // net.bytebuddy.jar.asm.AbstractC44388a
    public final void a(Object obj, String str) {
        h hVar = this.f56920d;
        String str2 = this.f56919c;
        if (str2 != null) {
            str = hVar.b(str2, str);
        }
        super.a(hVar.l(obj), str);
    }

    @Override // net.bytebuddy.jar.asm.AbstractC44388a
    public final AbstractC44388a b(String str, String str2) {
        h hVar = this.f56920d;
        String str3 = this.f56919c;
        if (str3 != null) {
            str = hVar.b(str3, str);
        }
        AbstractC44388a abstractC44388aB = super.b(str, hVar.c(str2));
        if (abstractC44388aB == null) {
            return null;
        }
        if (abstractC44388aB == this.f418152b) {
            return this;
        }
        int i12 = this.f418151a;
        return new C25417a(i12, str2, abstractC44388aB, hVar).f(new C25417a(i12, null, abstractC44388aB, hVar));
    }

    @Override // net.bytebuddy.jar.asm.AbstractC44388a
    public final AbstractC44388a c(String str) {
        h hVar = this.f56920d;
        String str2 = this.f56919c;
        if (str2 != null) {
            str = hVar.b(str2, str);
        }
        AbstractC44388a abstractC44388aC = super.c(str);
        if (abstractC44388aC == null) {
            return null;
        }
        if (abstractC44388aC == this.f418152b) {
            return this;
        }
        int i12 = this.f418151a;
        return new C25417a(i12, null, abstractC44388aC, hVar).f(new C25417a(i12, null, abstractC44388aC, hVar));
    }

    @Override // net.bytebuddy.jar.asm.AbstractC44388a
    public final void e(String str, String str2, String str3) {
        h hVar = this.f56920d;
        String str4 = this.f56919c;
        if (str4 != null) {
            str = hVar.b(str4, str);
        }
        super.e(str, hVar.c(str2), str3);
    }

    public final AbstractC44388a f(C25417a c25417a) {
        return (c25417a.getClass() == getClass() && c25417a.f418151a == this.f418151a && c25417a.f418152b == this.f418152b && c25417a.f56920d == this.f56920d) ? this : c25417a;
    }
}
