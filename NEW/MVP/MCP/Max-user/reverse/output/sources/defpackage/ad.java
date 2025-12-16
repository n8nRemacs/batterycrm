package defpackage;

/* loaded from: classes2.dex */
public final class ad implements kyg {
    public final yid a = new yid("^[a-zA-ZА-я\\u0401\\u0451\\u00eb\\u00cb\\- ]+$");

    @Override // defpackage.kyg
    public final n5g a(int i, String str) {
        Integer numB;
        if (str.length() <= 0 || this.a.a(str) || (numB = api.b(i, vid.a(ad.class))) == null) {
            return null;
        }
        return new n5g(numB.intValue());
    }
}
