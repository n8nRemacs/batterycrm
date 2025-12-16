package defpackage;

/* loaded from: classes2.dex */
public final class irb implements ieg {
    public final boolean a;
    public final int b;

    public irb(bj bjVar) {
        Boolean bool = (Boolean) bjVar.c;
        this.a = bool != null ? bool.booleanValue() : false;
        this.b = bjVar.b;
    }

    @Override // defpackage.ieg
    public final nme a() {
        return t6d.a;
    }
}
