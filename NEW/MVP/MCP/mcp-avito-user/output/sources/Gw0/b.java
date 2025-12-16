package GW0;

import I41.h;
import android.content.res.Resources;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Iterator;
import java.util.List;

/* compiled from: GenericDraweeHierarchyBuilder.java */
@Nullsafe
/* loaded from: classes10.dex */
public class b {

    /* renamed from: r, reason: collision with root package name */
    public static final s.c f6534r = s.c.f340136h;

    /* renamed from: s, reason: collision with root package name */
    public static final s.c f6535s = s.c.f340137i;

    /* renamed from: a, reason: collision with root package name */
    public final Resources f6536a;

    /* renamed from: b, reason: collision with root package name */
    public int f6537b = 300;

    /* renamed from: c, reason: collision with root package name */
    public float f6538c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    @h
    public Drawable f6539d = null;

    /* renamed from: e, reason: collision with root package name */
    @h
    public s.a f6540e;

    /* renamed from: f, reason: collision with root package name */
    @h
    public Drawable f6541f;

    /* renamed from: g, reason: collision with root package name */
    @h
    public s.a f6542g;

    /* renamed from: h, reason: collision with root package name */
    @h
    public Drawable f6543h;

    /* renamed from: i, reason: collision with root package name */
    @h
    public s.a f6544i;

    /* renamed from: j, reason: collision with root package name */
    @h
    public Drawable f6545j;

    /* renamed from: k, reason: collision with root package name */
    @h
    public s.a f6546k;

    /* renamed from: l, reason: collision with root package name */
    @h
    public s.a f6547l;

    /* renamed from: m, reason: collision with root package name */
    @h
    public ColorMatrixColorFilter f6548m;

    /* renamed from: n, reason: collision with root package name */
    @h
    public Drawable f6549n;

    /* renamed from: o, reason: collision with root package name */
    @h
    public List<Drawable> f6550o;

    /* renamed from: p, reason: collision with root package name */
    @h
    public StateListDrawable f6551p;

    /* renamed from: q, reason: collision with root package name */
    @h
    public RoundingParams f6552q;

    public b(Resources resources) {
        this.f6536a = resources;
        s.a aVar = (s.a) f6534r;
        this.f6540e = aVar;
        this.f6541f = null;
        this.f6542g = aVar;
        this.f6543h = null;
        this.f6544i = aVar;
        this.f6545j = null;
        this.f6546k = aVar;
        this.f6547l = (s.a) f6535s;
        this.f6548m = null;
        this.f6549n = null;
        this.f6550o = null;
        this.f6551p = null;
        this.f6552q = null;
    }

    public final a a() {
        List<Drawable> list = this.f6550o;
        if (list != null) {
            Iterator<Drawable> it = list.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        return new a(this);
    }
}
