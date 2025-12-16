package defpackage;

/* loaded from: classes.dex */
public abstract class za2 implements l7c {
    public abstract boolean a(char c);

    @Override // defpackage.l7c
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
