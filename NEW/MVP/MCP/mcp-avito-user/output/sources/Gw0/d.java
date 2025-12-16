package GW0;

import I41.h;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.drawable.i;
import com.facebook.drawee.drawable.v;
import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import uW0.C48986a;

/* compiled from: RootDrawable.java */
@Nullsafe
/* loaded from: classes10.dex */
public class d extends i implements v {

    /* renamed from: f, reason: collision with root package name */
    @k0
    @h
    public EW0.a f6553f;

    /* renamed from: g, reason: collision with root package name */
    @h
    public com.facebook.drawee.view.b f6554g;

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            com.facebook.drawee.view.b bVar = this.f6554g;
            if (bVar != null && !bVar.f340166a) {
                C48986a.j(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(bVar)), Integer.valueOf(System.identityHashCode(bVar.f340170e)), bVar.toString());
                bVar.f340167b = true;
                bVar.f340168c = true;
                bVar.b();
            }
            super.draw(canvas);
            EW0.a aVar = this.f6553f;
            if (aVar != null) {
                aVar.setBounds(getBounds());
                this.f6553f.draw(canvas);
            }
        }
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    public final void o(@h com.facebook.drawee.view.b bVar) {
        this.f6554g = bVar;
    }

    @Override // com.facebook.drawee.drawable.i, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        com.facebook.drawee.view.b bVar = this.f6554g;
        if (bVar != null) {
            bVar.d(z12);
        }
        return super.setVisible(z12, z13);
    }
}
