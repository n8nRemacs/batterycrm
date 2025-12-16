package com.google.common.hash;

/* compiled from: AbstractCompositeHashFunction.java */
@InterfaceC37497l
@aZ0.j
/* renamed from: com.google.common.hash.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37488c extends AbstractC37489d {

    /* renamed from: b, reason: collision with root package name */
    public final r[] f360245b;

    public AbstractC37488c(r... rVarArr) {
        for (r rVar : rVarArr) {
            rVar.getClass();
        }
        this.f360245b = rVarArr;
    }

    @Override // com.google.common.hash.r
    public final s a() {
        r[] rVarArr = this.f360245b;
        int length = rVarArr.length;
        s[] sVarArr = new s[length];
        for (int i12 = 0; i12 < length; i12++) {
            sVarArr[i12] = rVarArr[i12].a();
        }
        return new C37487b(this, sVarArr);
    }

    public abstract q c(s[] sVarArr);
}
