package androidx.legacy.app;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import androidx.drawerlayout.widget.DrawerLayout;
import j.N;

/* compiled from: ActionBarDrawerToggle.java */
@Deprecated
/* loaded from: classes.dex */
public class a implements DrawerLayout.d {

    /* compiled from: ActionBarDrawerToggle.java */
    @Deprecated
    /* renamed from: androidx.legacy.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC1791a {
    }

    /* compiled from: ActionBarDrawerToggle.java */
    @Deprecated
    public interface b {
    }

    /* compiled from: ActionBarDrawerToggle.java */
    public static class c {
    }

    /* compiled from: ActionBarDrawerToggle.java */
    public class d extends InsetDrawable implements Drawable.Callback {
        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public final void draw(@N Canvas canvas) {
            copyBounds(null);
            canvas.save();
            throw null;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public final void a() {
        throw null;
    }
}
