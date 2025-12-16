package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class hr6 {
    public static final tyd q = tyd.d;
    public static final tyd r = tyd.c;
    public final Resources a;
    public int b = HttpStatus.SC_MULTIPLE_CHOICES;
    public float c = 0.0f;
    public Drawable d = null;
    public syd e;
    public Drawable f;
    public syd g;
    public Drawable h;
    public syd i;
    public Drawable j;
    public syd k;
    public syd l;
    public Drawable m;
    public List n;
    public StateListDrawable o;
    public vtd p;

    public hr6(Resources resources) {
        this.a = resources;
        tyd tydVar = q;
        this.e = tydVar;
        this.f = null;
        this.g = tydVar;
        this.h = null;
        this.i = tydVar;
        this.j = null;
        this.k = tydVar;
        this.l = r;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public final gr6 a() {
        List list = this.n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Drawable) it.next()).getClass();
            }
        }
        return new gr6(this);
    }
}
