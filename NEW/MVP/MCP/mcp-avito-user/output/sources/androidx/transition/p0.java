package androidx.transition;

/* compiled from: VisibilityPropagation.java */
/* loaded from: classes10.dex */
public abstract class p0 extends S {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f54836a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int b(V v12, int i12) {
        int[] iArr;
        if (v12 == null || (iArr = (int[]) v12.f54716a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i12];
    }
}
