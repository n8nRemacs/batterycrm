package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import j.N;
import j.P;

/* compiled from: WrappedDrawableState.java */
/* loaded from: classes.dex */
final class m extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f44769a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f44770b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f44771c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f44772d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i12 = this.f44769a;
        Drawable.ConstantState constantState = this.f44770b;
        return i12 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @N
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @N
    public final Drawable newDrawable(@P Resources resources) {
        l lVar = new l();
        lVar.f44765e = this;
        Drawable.ConstantState constantState = this.f44770b;
        if (constantState != null) {
            lVar.a(constantState.newDrawable(resources));
        }
        if (l.f44768i == null) {
            try {
                l.f44768i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return lVar;
    }
}
