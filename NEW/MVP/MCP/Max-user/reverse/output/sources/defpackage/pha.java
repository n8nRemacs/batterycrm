package defpackage;

/* loaded from: classes2.dex */
public final class pha implements kyg {
    @Override // defpackage.kyg
    public final n5g a(int i, String str) {
        if (str.length() <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '-' && cCharAt != ' ') {
                return null;
            }
        }
        Integer numB = api.b(i, vid.a(pha.class));
        if (numB != null) {
            return new n5g(numB.intValue());
        }
        return null;
    }
}
