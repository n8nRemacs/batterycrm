package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.LruCache;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class cie {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public Object f;
    public Object g;
    public Object h;

    public cie(Context context, h18 h18Var, pc2 pc2Var, f84 f84Var, so3 so3Var) {
        this.a = context;
        this.b = h18Var;
        this.c = pc2Var;
        this.d = f84Var;
        this.e = TextUtils.TruncateAt.END;
        this.f = getClass().getName();
        so3Var.a(so3.c | so3.d, new yr7(3, this));
        gw0.w(new g56((hbd) a93.s0.x(context).Y, new o4g(this, null), 1), f84Var);
        final int i = 0;
        this.g = new bwf(new cm6(this) { // from class: n4g
            public final /* synthetic */ cie b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        cie cieVar = this.b;
                        LruCache lruCache = new LruCache(100);
                        String str = (String) cieVar.f;
                        l6b l6bVar = wqi.a;
                        if (l6bVar != null) {
                            lg8 lg8Var = lg8.d;
                            if (l6bVar.b(lg8Var)) {
                                l6bVar.c(lg8Var, str, "TextLayoutManager cache initialized with size=100", null);
                            }
                        }
                        return lruCache;
                    default:
                        return new t4g(this.b);
                }
            }
        });
        final int i2 = 1;
        this.h = new bwf(new cm6(this) { // from class: n4g
            public final /* synthetic */ cie b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        cie cieVar = this.b;
                        LruCache lruCache = new LruCache(100);
                        String str = (String) cieVar.f;
                        l6b l6bVar = wqi.a;
                        if (l6bVar != null) {
                            lg8 lg8Var = lg8.d;
                            if (l6bVar.b(lg8Var)) {
                                l6bVar.c(lg8Var, str, "TextLayoutManager cache initialized with size=100", null);
                            }
                        }
                        return lruCache;
                    default:
                        return new t4g(this.b);
                }
            }
        });
    }

    public static u4g a(final cie cieVar, final CharSequence charSequence, oc2 oc2Var) {
        final cie cieVar2;
        bwf bwfVar;
        pc2 pc2Var = (pc2) cieVar.c;
        final t5g t5gVar = pc2Var.b;
        t75 t75Var = t75.b;
        lg8 lg8Var = lg8.d;
        final TextPaint textPaint = (TextPaint) ((t4g) ((bwf) cieVar.h).getValue()).get(new q4g(t5gVar, a93.s0.x(pc2Var.a).k().getText().g));
        EnumMap enumMap = t5gVar.c;
        sw4 sw4Var = (sw4) enumMap.get(t75Var);
        if (sw4Var == null) {
            sw4Var = (sw4) ue3.F(enumMap.values());
        }
        float fC = sw4.c(sw4Var.a, ((Context) cieVar.a).getResources().getDisplayMetrics());
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        final float f = fC - (fontMetrics.descent - fontMetrics.ascent);
        DisplayMetrics displayMetrics = ((Context) cieVar.a).getResources().getDisplayMetrics();
        boolean z = ((Context) cieVar.a).getResources().getConfiguration().orientation == 2;
        int i = z ? displayMetrics.heightPixels : displayMetrics.widthPixels;
        int i2 = z ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        ((pc2) cieVar.c).getClass();
        final int iA = pc2.a(i, oc2Var);
        ((pc2) cieVar.c).getClass();
        final int iA2 = pc2.a(i2, oc2Var);
        p4g p4gVar = new p4g(charSequence.hashCode(), oc2Var.hashCode(), iA);
        if (cieVar.c()) {
            u4g u4gVar = (u4g) cieVar.b().get(p4gVar);
            if (u4gVar != null) {
                String str = (String) cieVar.f;
                l6b l6bVar = wqi.a;
                if (l6bVar != null && l6bVar.b(lg8Var)) {
                    StringBuilder sbK = wy1.k("Cache HIT: textHash=", charSequence.hashCode(), ", optionsHash=", oc2Var.hashCode(), " ");
                    sbK.append((Object) charSequence);
                    l6bVar.c(lg8Var, str, sbK.toString(), null);
                }
                return u4gVar;
            }
            String str2 = (String) cieVar.f;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                StringBuilder sbK2 = wy1.k("Cache MISS: textHash=", charSequence.hashCode(), ", optionsHash=", oc2Var.hashCode(), " ");
                sbK2.append((Object) charSequence);
                l6bVar2.c(lg8Var, str2, sbK2.toString(), null);
            }
        }
        boolean z2 = iA == iA2;
        final int i3 = 0;
        bwf bwfVar2 = new bwf(new cm6(cieVar) { // from class: m4g
            public final /* synthetic */ cie b;

            {
                this.b = cieVar;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        cie cieVar3 = this.b;
                        h18 h18Var = (h18) cieVar3.b;
                        boolean z3 = t5gVar.d;
                        TextUtils.TruncateAt truncateAt = (TextUtils.TruncateAt) cieVar3.e;
                        return h18.a(h18Var, charSequence, textPaint, iA, cieVar3.e(), z3, truncateAt, f, cieVar3.d(), 16);
                    default:
                        cie cieVar4 = this.b;
                        h18 h18Var2 = (h18) cieVar4.b;
                        boolean z4 = t5gVar.d;
                        TextUtils.TruncateAt truncateAt2 = (TextUtils.TruncateAt) cieVar4.e;
                        return h18.a(h18Var2, charSequence, textPaint, iA, cieVar4.e(), z4, truncateAt2, f, cieVar4.d(), 16);
                }
            }
        });
        if (z2) {
            cieVar2 = cieVar;
            bwfVar = bwfVar2;
        } else {
            final int i4 = 1;
            cieVar2 = cieVar;
            bwfVar = new bwf(new cm6(cieVar2) { // from class: m4g
                public final /* synthetic */ cie b;

                {
                    this.b = cieVar2;
                }

                @Override // defpackage.cm6
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            cie cieVar3 = this.b;
                            h18 h18Var = (h18) cieVar3.b;
                            boolean z3 = t5gVar.d;
                            TextUtils.TruncateAt truncateAt = (TextUtils.TruncateAt) cieVar3.e;
                            return h18.a(h18Var, charSequence, textPaint, iA2, cieVar3.e(), z3, truncateAt, f, cieVar3.d(), 16);
                        default:
                            cie cieVar4 = this.b;
                            h18 h18Var2 = (h18) cieVar4.b;
                            boolean z4 = t5gVar.d;
                            TextUtils.TruncateAt truncateAt2 = (TextUtils.TruncateAt) cieVar4.e;
                            return h18.a(h18Var2, charSequence, textPaint, iA2, cieVar4.e(), z4, truncateAt2, f, cieVar4.d(), 16);
                    }
                }
            });
        }
        boolean z3 = ((Context) cieVar2.a).getResources().getConfiguration().orientation == 1;
        f5g f5gVar = new f5g(bwfVar2);
        f5g f5gVar2 = z2 ? f5gVar : new f5g(bwfVar);
        if (z2 || z3) {
            f5gVar.b((Layout) bwfVar2.getValue());
            if (f5gVar != f5gVar2) {
                svi.e((f84) cieVar2.d, null, null, new r4g(f5gVar2, bwfVar, null), 3);
            }
        } else {
            f5gVar2.b((Layout) bwfVar.getValue());
            svi.e((f84) cieVar2.d, null, null, new s4g(f5gVar, bwfVar2, null), 3);
        }
        u4g u4gVar2 = new u4g(f5gVar, f5gVar2);
        if (cieVar2.c()) {
            cieVar2.b().put(p4gVar, u4gVar2);
            String str3 = (String) cieVar2.f;
            l6b l6bVar3 = wqi.a;
            if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                l6bVar3.c(lg8Var, str3, ho7.g("Cached layout: textHash=", charSequence.hashCode(), cieVar2.b().size(), ", cacheSize="), null);
            }
        }
        return u4gVar2;
    }

    public LruCache b() {
        return (LruCache) ((bwf) this.g).getValue();
    }

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public cie() {
        this.a = new LinkedHashSet();
        this.b = new w30();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
    }
}
