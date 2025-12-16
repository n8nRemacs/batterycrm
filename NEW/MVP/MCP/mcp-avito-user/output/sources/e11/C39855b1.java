package e11;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: e11.b1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39855b1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final ArrayList<V1> f394536a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final ArrayList<Q> f394537b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public WeakReference<View> f394538c;

    /* renamed from: d, reason: collision with root package name */
    public float f394539d = -1.0f;

    public C39855b1(@j.N ArrayList<V1> arrayList, @j.N ArrayList<Q> arrayList2) {
        this.f394537b = arrayList2;
        this.f394536a = arrayList;
    }

    public static C39855b1 a(@j.N e2 e2Var) {
        e2Var.getClass();
        return new C39855b1(new ArrayList(e2Var.f394589e), new ArrayList(e2Var.f394590f));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec A[PHI: r11
  0x00ec: PHI (r11v6 char) = (r11v4 char), (r11v9 char) binds: [B:66:0x00ea, B:55:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(float r17, float r18) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.C39855b1.b(float, float):void");
    }

    public final void c(@j.P ViewGroup viewGroup) {
        WeakReference<View> weakReference;
        if (viewGroup != null || (weakReference = this.f394538c) == null) {
            this.f394538c = new WeakReference<>(viewGroup);
        } else {
            weakReference.clear();
        }
    }
}
