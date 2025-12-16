package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.a9;
import defpackage.aag;
import defpackage.d45;
import defpackage.eri;
import defpackage.i21;
import defpackage.j7g;
import defpackage.lk6;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    public final a9 a;
    public final lk6 b;
    public boolean c;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a9 a9Var = this.a;
        if (a9Var != null) {
            a9Var.j();
        }
        lk6 lk6Var = this.b;
        if (lk6Var != null) {
            lk6Var.r();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        a9 a9Var = this.a;
        if (a9Var != null) {
            return a9Var.r();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a9 a9Var = this.a;
        if (a9Var != null) {
            return a9Var.s();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        i21 i21Var;
        lk6 lk6Var = this.b;
        if (lk6Var == null || (i21Var = (i21) lk6Var.d) == null) {
            return null;
        }
        return (ColorStateList) i21Var.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        i21 i21Var;
        lk6 lk6Var = this.b;
        if (lk6Var == null || (i21Var = (i21) lk6Var.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) i21Var.e;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a9 a9Var = this.a;
        if (a9Var != null) {
            a9Var.y();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        a9 a9Var = this.a;
        if (a9Var != null) {
            a9Var.z(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        lk6 lk6Var = this.b;
        if (lk6Var != null) {
            lk6Var.r();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        lk6 lk6Var = this.b;
        if (lk6Var != null && drawable != null && !this.c) {
            lk6Var.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (lk6Var != null) {
            lk6Var.r();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) lk6Var.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(lk6Var.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        lk6 lk6Var = this.b;
        if (lk6Var != null) {
            ImageView imageView = (ImageView) lk6Var.c;
            if (i != 0) {
                Drawable drawableA = eri.a(imageView.getContext(), i);
                if (drawableA != null) {
                    d45.a(drawableA);
                }
                imageView.setImageDrawable(drawableA);
            } else {
                imageView.setImageDrawable(null);
            }
            lk6Var.r();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        lk6 lk6Var = this.b;
        if (lk6Var != null) {
            lk6Var.r();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a9 a9Var = this.a;
        if (a9Var != null) {
            a9Var.G(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a9 a9Var = this.a;
        if (a9Var != null) {
            a9Var.H(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        lk6 lk6Var = this.b;
        if (lk6Var != null) {
            if (((i21) lk6Var.d) == null) {
                lk6Var.d = new i21(3);
            }
            i21 i21Var = (i21) lk6Var.d;
            i21Var.d = colorStateList;
            i21Var.c = true;
            lk6Var.r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        lk6 lk6Var = this.b;
        if (lk6Var != null) {
            if (((i21) lk6Var.d) == null) {
                lk6Var.d = new i21(3);
            }
            i21 i21Var = (i21) lk6Var.d;
            i21Var.e = mode;
            i21Var.b = true;
            lk6Var.r();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aag.a(context);
        this.c = false;
        j7g.a(this, getContext());
        a9 a9Var = new a9(this);
        this.a = a9Var;
        a9Var.v(attributeSet, i);
        lk6 lk6Var = new lk6(this);
        this.b = lk6Var;
        lk6Var.Q(attributeSet, i);
    }
}
