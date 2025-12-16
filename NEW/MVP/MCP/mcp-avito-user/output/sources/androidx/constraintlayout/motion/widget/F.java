package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.w;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.h;
import com.avito.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewTransition.java */
/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    public int f43743a;

    /* renamed from: e, reason: collision with root package name */
    public int f43747e;

    /* renamed from: f, reason: collision with root package name */
    public final i f43748f;

    /* renamed from: g, reason: collision with root package name */
    public final d.a f43749g;

    /* renamed from: j, reason: collision with root package name */
    public int f43752j;

    /* renamed from: k, reason: collision with root package name */
    public String f43753k;

    /* renamed from: o, reason: collision with root package name */
    public final Context f43757o;

    /* renamed from: b, reason: collision with root package name */
    public int f43744b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43745c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f43746d = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f43750h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f43751i = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f43754l = 0;

    /* renamed from: m, reason: collision with root package name */
    public String f43755m = null;

    /* renamed from: n, reason: collision with root package name */
    public int f43756n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f43758p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f43759q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f43760r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f43761s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f43762t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f43763u = -1;

    /* compiled from: ViewTransition.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f43764a;

        /* renamed from: b, reason: collision with root package name */
        public final int f43765b;

        /* renamed from: c, reason: collision with root package name */
        public final p f43766c;

        /* renamed from: d, reason: collision with root package name */
        public final int f43767d;

        /* renamed from: f, reason: collision with root package name */
        public final H f43769f;

        /* renamed from: g, reason: collision with root package name */
        public final Interpolator f43770g;

        /* renamed from: i, reason: collision with root package name */
        public float f43772i;

        /* renamed from: j, reason: collision with root package name */
        public float f43773j;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f43776m;

        /* renamed from: e, reason: collision with root package name */
        public final androidx.constraintlayout.core.motion.utils.g f43768e = new androidx.constraintlayout.core.motion.utils.g();

        /* renamed from: h, reason: collision with root package name */
        public boolean f43771h = false;

        /* renamed from: l, reason: collision with root package name */
        public final Rect f43775l = new Rect();

        /* renamed from: k, reason: collision with root package name */
        public long f43774k = System.nanoTime();

        public a(H h12, p pVar, int i12, int i13, int i14, Interpolator interpolator, int i15, int i16) {
            this.f43776m = false;
            this.f43769f = h12;
            this.f43766c = pVar;
            this.f43767d = i13;
            if (h12.f43780d == null) {
                h12.f43780d = new ArrayList<>();
            }
            h12.f43780d.add(this);
            this.f43770g = interpolator;
            this.f43764a = i15;
            this.f43765b = i16;
            if (i14 == 3) {
                this.f43776m = true;
            }
            this.f43773j = i12 == 0 ? Float.MAX_VALUE : 1.0f / i12;
            a();
        }

        public final void a() {
            boolean z12 = this.f43771h;
            H h12 = this.f43769f;
            Interpolator interpolator = this.f43770g;
            p pVar = this.f43766c;
            int i12 = this.f43765b;
            int i13 = this.f43764a;
            if (!z12) {
                long jNanoTime = System.nanoTime();
                long j12 = jNanoTime - this.f43774k;
                this.f43774k = jNanoTime;
                float f12 = (((float) (j12 * 1.0E-6d)) * this.f43773j) + this.f43772i;
                this.f43772i = f12;
                if (f12 >= 1.0f) {
                    this.f43772i = 1.0f;
                }
                boolean zH2 = pVar.h(interpolator == null ? this.f43772i : interpolator.getInterpolation(this.f43772i), jNanoTime, pVar.f44006b, this.f43768e);
                if (this.f43772i >= 1.0f) {
                    if (i13 != -1) {
                        pVar.f44006b.setTag(i13, Long.valueOf(System.nanoTime()));
                    }
                    if (i12 != -1) {
                        pVar.f44006b.setTag(i12, null);
                    }
                    if (!this.f43776m) {
                        h12.f43781e.add(this);
                    }
                }
                if (this.f43772i < 1.0f || zH2) {
                    h12.f43777a.invalidate();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j13 = jNanoTime2 - this.f43774k;
            this.f43774k = jNanoTime2;
            float f13 = this.f43772i - (((float) (j13 * 1.0E-6d)) * this.f43773j);
            this.f43772i = f13;
            if (f13 < 0.0f) {
                this.f43772i = 0.0f;
            }
            float interpolation = this.f43772i;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            boolean zH3 = pVar.h(interpolation, jNanoTime2, pVar.f44006b, this.f43768e);
            if (this.f43772i <= 0.0f) {
                if (i13 != -1) {
                    pVar.f44006b.setTag(i13, Long.valueOf(System.nanoTime()));
                }
                if (i12 != -1) {
                    pVar.f44006b.setTag(i12, null);
                }
                h12.f43781e.add(this);
            }
            if (this.f43772i > 0.0f || zH3) {
                h12.f43777a.invalidate();
            }
        }

        public final void b() {
            this.f43771h = true;
            int i12 = this.f43767d;
            if (i12 != -1) {
                this.f43773j = i12 == 0 ? Float.MAX_VALUE : 1.0f / i12;
            }
            this.f43769f.f43777a.invalidate();
            this.f43774k = System.nanoTime();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public F(android.content.Context r10, android.content.res.XmlResourceParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f43744b = r0
            r1 = 0
            r9.f43745c = r1
            r9.f43746d = r1
            r9.f43750h = r0
            r9.f43751i = r0
            r9.f43754l = r1
            r2 = 0
            r9.f43755m = r2
            r9.f43756n = r0
            r9.f43758p = r0
            r9.f43759q = r0
            r9.f43760r = r0
            r9.f43761s = r0
            r9.f43762t = r0
            r9.f43763u = r0
            r9.f43757o = r10
            int r2 = r11.getEventType()     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
        L28:
            r3 = 1
            if (r2 == r3) goto Lbc
            java.lang.String r4 = "ViewTransition"
            r5 = 3
            r6 = 2
            if (r2 == r6) goto L46
            if (r2 == r5) goto L35
            goto Laf
        L35:
            java.lang.String r2 = r11.getName()     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            boolean r2 = r4.equals(r2)     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            if (r2 == 0) goto Laf
            return
        L40:
            r10 = move-exception
            goto Lb5
        L43:
            r10 = move-exception
            goto Lb9
        L46:
            java.lang.String r2 = r11.getName()     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            int r7 = r2.hashCode()     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            r8 = 4
            switch(r7) {
                case -1962203927: goto L79;
                case -1239391468: goto L6f;
                case 61998586: goto L67;
                case 366511058: goto L5d;
                case 1791837707: goto L53;
                default: goto L52;
            }     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
        L52:
            goto L83
        L53:
            java.lang.String r4 = "CustomAttribute"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            if (r2 == 0) goto L83
            r2 = r5
            goto L84
        L5d:
            java.lang.String r4 = "CustomMethod"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            if (r2 == 0) goto L83
            r2 = r8
            goto L84
        L67:
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            if (r2 == 0) goto L83
            r2 = r1
            goto L84
        L6f:
            java.lang.String r4 = "KeyFrameSet"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            if (r2 == 0) goto L83
            r2 = r3
            goto L84
        L79:
            java.lang.String r4 = "ConstraintOverride"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            if (r2 == 0) goto L83
            r2 = r6
            goto L84
        L83:
            r2 = r0
        L84:
            if (r2 == 0) goto Lac
            if (r2 == r3) goto La4
            if (r2 == r6) goto L9d
            if (r2 == r5) goto L95
            if (r2 == r8) goto L95
            androidx.constraintlayout.motion.widget.C22737c.a()     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            r11.getLineNumber()     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            goto Laf
        L95:
            androidx.constraintlayout.widget.d$a r2 = r9.f43749g     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.f44271g     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            androidx.constraintlayout.widget.ConstraintAttribute.d(r10, r11, r2)     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            goto Laf
        L9d:
            androidx.constraintlayout.widget.d$a r2 = androidx.constraintlayout.widget.d.e(r10, r11)     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            r9.f43749g = r2     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            goto Laf
        La4:
            androidx.constraintlayout.motion.widget.i r2 = new androidx.constraintlayout.motion.widget.i     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            r2.<init>(r10, r11)     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            r9.f43748f = r2     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            goto Laf
        Lac:
            r9.d(r10, r11)     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
        Laf:
            int r2 = r11.next()     // Catch: java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L43
            goto L28
        Lb5:
            r10.printStackTrace()
            goto Lbc
        Lb9:
            r10.printStackTrace()
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.F.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public final void a(H h12, MotionLayout motionLayout, int i12, androidx.constraintlayout.widget.d dVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator interpolator;
        if (this.f43745c) {
            return;
        }
        int i13 = this.f43747e;
        i iVar = this.f43748f;
        if (i13 == 2) {
            View view = viewArr[0];
            p pVar = new p(view);
            v vVar = pVar.f44010f;
            vVar.f44038d = 0.0f;
            vVar.f44039e = 0.0f;
            pVar.f44004H = true;
            vVar.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            pVar.f44011g.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            n nVar = pVar.f44012h;
            nVar.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            nVar.b(view);
            n nVar2 = pVar.f44013i;
            nVar2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            nVar2.b(view);
            ArrayList<AbstractC22740f> arrayList = iVar.f43928a.get(-1);
            if (arrayList != null) {
                pVar.f44027w.addAll(arrayList);
            }
            pVar.k(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
            int i14 = this.f43750h;
            int i15 = this.f43751i;
            int i16 = this.f43744b;
            Context context = motionLayout.getContext();
            int i17 = this.f43754l;
            if (i17 == -2) {
                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f43756n);
            } else if (i17 == -1) {
                interpolatorLoadInterpolator = new E(androidx.constraintlayout.core.motion.utils.d.c(this.f43755m));
            } else if (i17 == 0) {
                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
            } else if (i17 == 1) {
                interpolatorLoadInterpolator = new AccelerateInterpolator();
            } else if (i17 == 2) {
                interpolatorLoadInterpolator = new DecelerateInterpolator();
            } else if (i17 == 4) {
                interpolatorLoadInterpolator = new BounceInterpolator();
            } else if (i17 == 5) {
                interpolatorLoadInterpolator = new OvershootInterpolator();
            } else {
                if (i17 != 6) {
                    interpolator = null;
                    new a(h12, pVar, i14, i15, i16, interpolator, this.f43758p, this.f43759q);
                    return;
                }
                interpolatorLoadInterpolator = new AnticipateInterpolator();
            }
            interpolator = interpolatorLoadInterpolator;
            new a(h12, pVar, i14, i15, i16, interpolator, this.f43758p, this.f43759q);
            return;
        }
        d.a aVar = this.f43749g;
        if (i13 == 1) {
            for (int i18 : motionLayout.getConstraintSetIds()) {
                if (i18 != i12) {
                    w wVar = motionLayout.f43807b;
                    androidx.constraintlayout.widget.d dVarB = wVar == null ? null : wVar.b(i18);
                    for (View view2 : viewArr) {
                        d.a aVarQ = dVarB.q(view2.getId());
                        if (aVar != null) {
                            aVar.a(aVarQ);
                            aVarQ.f44271g.putAll(aVar.f44271g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
        dVar2.h(dVar);
        for (View view3 : viewArr) {
            d.a aVarQ2 = dVar2.q(view3.getId());
            if (aVar != null) {
                aVar.a(aVarQ2);
                aVarQ2.f44271g.putAll(aVar.f44271g);
            }
        }
        motionLayout.G(i12, dVar2);
        motionLayout.G(R.id.view_transition, dVar);
        motionLayout.B(R.id.view_transition);
        w.b bVar = new w.b(motionLayout.f43807b, i12);
        for (View view4 : viewArr) {
            int i19 = this.f43750h;
            if (i19 != -1) {
                bVar.f44080h = Math.max(i19, 8);
            }
            bVar.f44088p = this.f43746d;
            int i22 = this.f43754l;
            String str = this.f43755m;
            int i23 = this.f43756n;
            bVar.f44077e = i22;
            bVar.f44078f = str;
            bVar.f44079g = i23;
            int id2 = view4.getId();
            if (iVar != null) {
                ArrayList<AbstractC22740f> arrayList2 = iVar.f43928a.get(-1);
                i iVar2 = new i();
                Iterator<AbstractC22740f> it = arrayList2.iterator();
                while (it.hasNext()) {
                    AbstractC22740f abstractC22740fClone = it.next().clone();
                    abstractC22740fClone.f43888b = id2;
                    iVar2.b(abstractC22740fClone);
                }
                bVar.f44083k.add(iVar2);
            }
        }
        motionLayout.setTransition(bVar);
        J11.c cVar = new J11.c(6, this, viewArr);
        motionLayout.l(1.0f);
        motionLayout.f43818g0 = cVar;
    }

    public final boolean b(View view) {
        int i12 = this.f43760r;
        boolean z12 = i12 == -1 || view.getTag(i12) != null;
        int i13 = this.f43761s;
        return z12 && (i13 == -1 || view.getTag(i13) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f43752j == -1 && this.f43753k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.f43752j) {
            return true;
        }
        return this.f43753k != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).f44179Z) != null && str.matches(this.f43753k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h.m.f44427x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            if (index == 0) {
                this.f43743a = typedArrayObtainStyledAttributes.getResourceId(index, this.f43743a);
            } else if (index == 8) {
                if (MotionLayout.f43782q0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f43752j);
                    this.f43752j = resourceId;
                    if (resourceId == -1) {
                        this.f43753k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f43753k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f43752j = typedArrayObtainStyledAttributes.getResourceId(index, this.f43752j);
                }
            } else if (index == 9) {
                this.f43744b = typedArrayObtainStyledAttributes.getInt(index, this.f43744b);
            } else if (index == 12) {
                this.f43745c = typedArrayObtainStyledAttributes.getBoolean(index, this.f43745c);
            } else if (index == 10) {
                this.f43746d = typedArrayObtainStyledAttributes.getInt(index, this.f43746d);
            } else if (index == 4) {
                this.f43750h = typedArrayObtainStyledAttributes.getInt(index, this.f43750h);
            } else if (index == 13) {
                this.f43751i = typedArrayObtainStyledAttributes.getInt(index, this.f43751i);
            } else if (index == 14) {
                this.f43747e = typedArrayObtainStyledAttributes.getInt(index, this.f43747e);
            } else if (index == 7) {
                int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i13 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f43756n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f43754l = -2;
                    }
                } else if (i13 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f43755m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f43754l = -1;
                    } else {
                        this.f43756n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f43754l = -2;
                    }
                } else {
                    this.f43754l = typedArrayObtainStyledAttributes.getInteger(index, this.f43754l);
                }
            } else if (index == 11) {
                this.f43758p = typedArrayObtainStyledAttributes.getResourceId(index, this.f43758p);
            } else if (index == 3) {
                this.f43759q = typedArrayObtainStyledAttributes.getResourceId(index, this.f43759q);
            } else if (index == 6) {
                this.f43760r = typedArrayObtainStyledAttributes.getResourceId(index, this.f43760r);
            } else if (index == 5) {
                this.f43761s = typedArrayObtainStyledAttributes.getResourceId(index, this.f43761s);
            } else if (index == 2) {
                this.f43763u = typedArrayObtainStyledAttributes.getResourceId(index, this.f43763u);
            } else if (index == 1) {
                this.f43762t = typedArrayObtainStyledAttributes.getInteger(index, this.f43762t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + C22737c.c(this.f43743a, this.f43757o) + ")";
    }
}
