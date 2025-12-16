package androidx.transition;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.L;
import com.avito.android.R;

/* compiled from: Explode.java */
/* renamed from: androidx.transition.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23501l extends o0 {

    /* renamed from: E, reason: collision with root package name */
    public static final DecelerateInterpolator f54804E = new DecelerateInterpolator();

    /* renamed from: F, reason: collision with root package name */
    public static final AccelerateInterpolator f54805F = new AccelerateInterpolator();

    /* renamed from: D, reason: collision with root package name */
    public final int[] f54806D = new int[2];

    public C23501l() {
        this.f54685v = new C23500k();
    }

    @Override // androidx.transition.o0
    @j.P
    public final Animator O(ViewGroup viewGroup, View view, V v12, V v13) {
        if (v13 == null) {
            return null;
        }
        Rect rect = (Rect) v13.f54716a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        T(viewGroup, rect, this.f54806D);
        return X.a(view, v13, rect.left, rect.top, translationX + r0[0], translationY + r0[1], translationX, translationY, f54804E, this);
    }

    @Override // androidx.transition.o0
    @j.P
    public final Animator Q(ViewGroup viewGroup, View view, V v12, V v13) {
        float f12;
        float f13;
        if (v12 == null) {
            return null;
        }
        Rect rect = (Rect) v12.f54716a.get("android:explode:screenBounds");
        int i12 = rect.left;
        int i13 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) v12.f54717b.getTag(R.id.transition_position);
        if (iArr != null) {
            f12 = (r7 - rect.left) + translationX;
            f13 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f12 = translationX;
            f13 = translationY;
        }
        T(viewGroup, rect, this.f54806D);
        return X.a(view, v12, i12, i13, translationX, translationY, f12 + r0[0], f13 + r0[1], f54805F, this);
    }

    public final void T(ViewGroup viewGroup, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        int[] iArr2 = this.f54806D;
        viewGroup.getLocationOnScreen(iArr2);
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        L.d dVar = this.f54686w;
        Rect rectA = dVar == null ? null : dVar.a();
        if (rectA == null) {
            iCenterX = Math.round(viewGroup.getTranslationX()) + (viewGroup.getWidth() / 2) + i12;
            iCenterY = Math.round(viewGroup.getTranslationY()) + (viewGroup.getHeight() / 2) + i13;
        } else {
            iCenterX = rectA.centerX();
            iCenterY = rectA.centerY();
        }
        float fCenterX = rect.centerX() - iCenterX;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
        int i14 = iCenterX - i12;
        int i15 = iCenterY - i13;
        float fMax = Math.max(i14, viewGroup.getWidth() - i14);
        float fMax2 = Math.max(i15, viewGroup.getHeight() - i15);
        float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
        iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
        iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
    }

    public final void U(V v12) {
        View view = v12.f54717b;
        int[] iArr = this.f54806D;
        view.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        v12.f54716a.put("android:explode:screenBounds", new Rect(i12, i13, view.getWidth() + i12, view.getHeight() + i13));
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void f(@j.N V v12) {
        o0.M(v12);
        U(v12);
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void j(@j.N V v12) {
        o0.M(v12);
        U(v12);
    }
}
