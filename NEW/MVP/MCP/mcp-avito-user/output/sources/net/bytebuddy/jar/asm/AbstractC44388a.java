package net.bytebuddy.jar.asm;

import java.io.IOException;

/* compiled from: AnnotationVisitor.java */
/* renamed from: net.bytebuddy.jar.asm.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC44388a {

    /* renamed from: a, reason: collision with root package name */
    public final int f418151a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC44388a f418152b;

    public AbstractC44388a(int i12, AbstractC44388a abstractC44388a) throws IOException {
        if (i12 != 589824 && i12 != 524288 && i12 != 458752 && i12 != 393216 && i12 != 327680 && i12 != 262144 && i12 != 17432576) {
            throw new IllegalArgumentException(AK.c.g(i12, "Unsupported api "));
        }
        if (i12 == 17432576) {
            i.a(this);
        }
        this.f418151a = i12;
        this.f418152b = abstractC44388a;
    }

    public void a(Object obj, String str) {
        AbstractC44388a abstractC44388a = this.f418152b;
        if (abstractC44388a != null) {
            abstractC44388a.a(obj, str);
        }
    }

    public AbstractC44388a b(String str, String str2) {
        AbstractC44388a abstractC44388a = this.f418152b;
        if (abstractC44388a != null) {
            return abstractC44388a.b(str, str2);
        }
        return null;
    }

    public AbstractC44388a c(String str) {
        AbstractC44388a abstractC44388a = this.f418152b;
        if (abstractC44388a != null) {
            return abstractC44388a.c(str);
        }
        return null;
    }

    public void d() {
        AbstractC44388a abstractC44388a = this.f418152b;
        if (abstractC44388a != null) {
            abstractC44388a.d();
        }
    }

    public void e(String str, String str2, String str3) {
        AbstractC44388a abstractC44388a = this.f418152b;
        if (abstractC44388a != null) {
            abstractC44388a.e(str, str2, str3);
        }
    }
}
