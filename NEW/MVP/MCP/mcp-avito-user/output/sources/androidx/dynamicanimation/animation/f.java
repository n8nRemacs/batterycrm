package androidx.dynamicanimation.animation;

/* compiled from: FloatPropertyCompat.java */
/* loaded from: classes.dex */
public abstract class f<T> {
    final String mPropertyName;

    public f(String str) {
        this.mPropertyName = str;
    }

    public abstract float getValue(T t12);

    public abstract void setValue(T t12, float f12);
}
