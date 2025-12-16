package defpackage;

/* loaded from: classes2.dex */
public abstract class jt0 {
    public boolean canRepeat() {
        return true;
    }

    public fm intoParam(String str) {
        return intoParam(new mmf(str));
    }

    public boolean isSupplied() {
        return false;
    }

    public boolean shouldPost() {
        return false;
    }

    public boolean shouldSkipParam() {
        return false;
    }

    public abstract void write(gy7 gy7Var);

    public final fm intoParam(ht0 ht0Var) {
        return new it0(ht0Var, this);
    }
}
