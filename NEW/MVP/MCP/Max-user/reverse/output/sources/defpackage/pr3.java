package defpackage;

import java.util.Arrays;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class pr3 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte[] b;

    public /* synthetic */ pr3(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return Arrays.equals((byte[]) obj, this.b);
            default:
                return Arrays.equals(((or3) obj).d, this.b);
        }
    }
}
