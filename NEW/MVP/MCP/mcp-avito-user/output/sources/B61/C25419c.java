package b61;

import net.bytebuddy.jar.asm.AbstractC44388a;
import net.bytebuddy.jar.asm.C;
import net.bytebuddy.jar.asm.m;

/* compiled from: FieldRemapper.java */
/* renamed from: b61.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C25419c extends m {

    /* renamed from: c, reason: collision with root package name */
    public final j f56923c;

    public C25419c(int i12, m mVar, j jVar) {
        super(i12, mVar);
        this.f56923c = jVar;
    }

    @Override // net.bytebuddy.jar.asm.m
    public final AbstractC44388a a(String str, boolean z12) {
        j jVar = this.f56923c;
        AbstractC44388a abstractC44388aA = super.a(jVar.c(str), z12);
        if (abstractC44388aA == null) {
            return null;
        }
        int i12 = this.f418234a;
        return new C25417a(i12, str, abstractC44388aA, jVar).f(new C25417a(i12, null, abstractC44388aA, jVar));
    }

    @Override // net.bytebuddy.jar.asm.m
    public final AbstractC44388a d(int i12, C c12, String str, boolean z12) {
        j jVar = this.f56923c;
        AbstractC44388a abstractC44388aD = super.d(i12, c12, jVar.c(str), z12);
        if (abstractC44388aD == null) {
            return null;
        }
        int i13 = this.f418234a;
        return new C25417a(i13, str, abstractC44388aD, jVar).f(new C25417a(i13, null, abstractC44388aD, jVar));
    }
}
