package net.bytebuddy.jar.asm;

/* compiled from: Handler.java */
/* loaded from: classes7.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    public final r f418261a;

    /* renamed from: b, reason: collision with root package name */
    public final r f418262b;

    /* renamed from: c, reason: collision with root package name */
    public final r f418263c;

    /* renamed from: d, reason: collision with root package name */
    public final int f418264d;

    /* renamed from: e, reason: collision with root package name */
    public final String f418265e;

    /* renamed from: f, reason: collision with root package name */
    public q f418266f;

    public q(r rVar, r rVar2, r rVar3, int i12, String str) {
        this.f418261a = rVar;
        this.f418262b = rVar2;
        this.f418263c = rVar3;
        this.f418264d = i12;
        this.f418265e = str;
    }

    public static q a(q qVar, r rVar, r rVar2) {
        if (qVar == null) {
            return null;
        }
        q qVarA = a(qVar.f418266f, rVar, rVar2);
        qVar.f418266f = qVarA;
        r rVar3 = qVar.f418261a;
        int i12 = rVar3.f418271d;
        r rVar4 = qVar.f418262b;
        int i13 = rVar4.f418271d;
        int i14 = rVar.f418271d;
        int i15 = rVar2 == null ? Integer.MAX_VALUE : rVar2.f418271d;
        if (i14 >= i13 || i15 <= i12) {
            return qVar;
        }
        if (i14 <= i12) {
            return i15 >= i13 ? qVarA : new q(qVar, rVar2, rVar4);
        }
        if (i15 >= i13) {
            return new q(qVar, rVar3, rVar);
        }
        qVar.f418266f = new q(qVar, rVar2, rVar4);
        return new q(qVar, rVar3, rVar);
    }

    public q(q qVar, r rVar, r rVar2) {
        this(rVar, rVar2, qVar.f418263c, qVar.f418264d, qVar.f418265e);
        this.f418266f = qVar.f418266f;
    }
}
