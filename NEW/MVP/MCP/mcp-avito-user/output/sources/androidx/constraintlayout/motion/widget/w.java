package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.h;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MotionScene.java */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final MotionLayout f44053a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.constraintlayout.widget.k f44054b;

    /* renamed from: c, reason: collision with root package name */
    public b f44055c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f44056d;

    /* renamed from: e, reason: collision with root package name */
    public final b f44057e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<b> f44058f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.d> f44059g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap<String, Integer> f44060h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseIntArray f44061i;

    /* renamed from: j, reason: collision with root package name */
    public int f44062j;

    /* renamed from: k, reason: collision with root package name */
    public int f44063k;

    /* renamed from: l, reason: collision with root package name */
    public MotionEvent f44064l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f44065m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f44066n;

    /* renamed from: o, reason: collision with root package name */
    public MotionLayout.g f44067o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f44068p;

    /* renamed from: q, reason: collision with root package name */
    public final H f44069q;

    /* renamed from: r, reason: collision with root package name */
    public float f44070r;

    /* renamed from: s, reason: collision with root package name */
    public float f44071s;

    /* compiled from: MotionScene.java */
    public class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f44072a;

        public a(androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f44072a = dVar;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f12) {
            return (float) this.f44072a.a(f12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(android.content.Context r12, androidx.constraintlayout.motion.widget.MotionLayout r13, int r14) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.w.<init>(android.content.Context, androidx.constraintlayout.motion.widget.MotionLayout, int):void");
    }

    public final boolean a(int i12, MotionLayout motionLayout) {
        b bVar;
        if (this.f44067o != null) {
            return false;
        }
        Iterator<b> it = this.f44056d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i13 = next.f44086n;
            if (i13 != 0 && ((bVar = this.f44055c) != next || (bVar.f44090r & 2) == 0)) {
                int i14 = next.f44076d;
                MotionLayout.k kVar = MotionLayout.k.f43885e;
                MotionLayout.k kVar2 = MotionLayout.k.f43884d;
                MotionLayout.k kVar3 = MotionLayout.k.f43883c;
                if (i12 == i14 && (i13 == 4 || i13 == 2)) {
                    motionLayout.setState(kVar);
                    motionLayout.setTransition(next);
                    if (next.f44086n == 4) {
                        motionLayout.E();
                        motionLayout.setState(kVar3);
                        motionLayout.setState(kVar2);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.o(true);
                        motionLayout.setState(kVar3);
                        motionLayout.setState(kVar2);
                        motionLayout.setState(kVar);
                        motionLayout.x();
                    }
                    return true;
                }
                if (i12 == next.f44075c && (i13 == 3 || i13 == 1)) {
                    motionLayout.setState(kVar);
                    motionLayout.setTransition(next);
                    if (next.f44086n == 3) {
                        motionLayout.l(0.0f);
                        motionLayout.setState(kVar3);
                        motionLayout.setState(kVar2);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.o(true);
                        motionLayout.setState(kVar3);
                        motionLayout.setState(kVar2);
                        motionLayout.setState(kVar);
                        motionLayout.x();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.d b(int i12) {
        int iB2;
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f44059g;
        androidx.constraintlayout.widget.k kVar = this.f44054b;
        if (kVar != null && (iB2 = kVar.b(i12)) != -1) {
            i12 = iB2;
        }
        if (sparseArray.get(i12) != null) {
            return sparseArray.get(i12);
        }
        C22737c.c(i12, this.f44053a.getContext());
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c() {
        b bVar = this.f44055c;
        return bVar != null ? bVar.f44080h : this.f44062j;
    }

    public final int d(Context context, String str) {
        int identifier = str.contains("/") ? context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName()) : -1;
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    public final Interpolator e() {
        b bVar = this.f44055c;
        int i12 = bVar.f44077e;
        if (i12 == -2) {
            return AnimationUtils.loadInterpolator(this.f44053a.getContext(), this.f44055c.f44079g);
        }
        if (i12 == -1) {
            return new a(androidx.constraintlayout.core.motion.utils.d.c(bVar.f44078f));
        }
        if (i12 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i12 == 1) {
            return new AccelerateInterpolator();
        }
        if (i12 == 2) {
            return new DecelerateInterpolator();
        }
        if (i12 == 4) {
            return new BounceInterpolator();
        }
        if (i12 == 5) {
            return new OvershootInterpolator();
        }
        if (i12 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void f(p pVar) {
        b bVar = this.f44055c;
        if (bVar != null) {
            Iterator<i> it = bVar.f44083k.iterator();
            while (it.hasNext()) {
                it.next().a(pVar);
            }
        } else {
            b bVar2 = this.f44057e;
            if (bVar2 != null) {
                Iterator<i> it2 = bVar2.f44083k.iterator();
                while (it2.hasNext()) {
                    it2.next().a(pVar);
                }
            }
        }
    }

    public final float g() {
        B b12;
        b bVar = this.f44055c;
        if (bVar == null || (b12 = bVar.f44084l) == null) {
            return 0.0f;
        }
        return b12.f43735t;
    }

    public final int h() {
        b bVar = this.f44055c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f44076d;
    }

    public final ArrayList i(int i12) {
        int iB2;
        androidx.constraintlayout.widget.k kVar = this.f44054b;
        if (kVar != null && (iB2 = kVar.b(i12)) != -1) {
            i12 = iB2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.f44056d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f44076d == i12 || next.f44075c == i12) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(android.content.Context r18, android.content.res.XmlResourceParser r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.w.j(android.content.Context, android.content.res.XmlResourceParser):int");
    }

    public final int k(int i12, Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i12);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return j(context, xml);
                }
            }
            return -1;
        } catch (IOException e12) {
            e12.printStackTrace();
            return -1;
        } catch (XmlPullParserException e13) {
            e13.printStackTrace();
            return -1;
        }
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h.m.f44428y);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            if (index == 0) {
                k(typedArrayObtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h.m.f44418o);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            if (index == 0) {
                int i13 = typedArrayObtainStyledAttributes.getInt(index, this.f44062j);
                this.f44062j = i13;
                if (i13 < 8) {
                    this.f44062j = 8;
                }
            } else if (index == 1) {
                this.f44063k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void n(int i12, MotionLayout motionLayout) {
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f44059g;
        androidx.constraintlayout.widget.d dVar = sparseArray.get(i12);
        dVar.f44260b = dVar.f44259a;
        int i13 = this.f44061i.get(i12);
        HashMap<Integer, d.a> map = dVar.f44264f;
        if (i13 > 0) {
            n(i13, motionLayout);
            androidx.constraintlayout.widget.d dVar2 = sparseArray.get(i13);
            if (dVar2 == null) {
                C22737c.c(i13, this.f44053a.getContext());
                return;
            }
            dVar.f44260b += "/" + dVar2.f44260b;
            HashMap<Integer, d.a> map2 = dVar2.f44264f;
            for (Integer num : map2.keySet()) {
                num.getClass();
                d.a aVar = map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new d.a());
                }
                d.a aVar2 = map.get(num);
                if (aVar2 != null) {
                    d.b bVar = aVar2.f44269e;
                    if (!bVar.f44314b) {
                        bVar.a(aVar.f44269e);
                    }
                    d.C1714d c1714d = aVar2.f44267c;
                    if (!c1714d.f44368a) {
                        d.C1714d c1714d2 = aVar.f44267c;
                        c1714d.f44368a = c1714d2.f44368a;
                        c1714d.f44369b = c1714d2.f44369b;
                        c1714d.f44371d = c1714d2.f44371d;
                        c1714d.f44372e = c1714d2.f44372e;
                        c1714d.f44370c = c1714d2.f44370c;
                    }
                    d.e eVar = aVar2.f44270f;
                    if (!eVar.f44374a) {
                        eVar.a(aVar.f44270f);
                    }
                    d.c cVar = aVar2.f44268d;
                    if (!cVar.f44355a) {
                        cVar.a(aVar.f44268d);
                    }
                    for (String str : aVar.f44271g.keySet()) {
                        if (!aVar2.f44271g.containsKey(str)) {
                            aVar2.f44271g.put(str, aVar.f44271g.get(str));
                        }
                    }
                }
            }
        } else {
            dVar.f44260b = AK.c.s(new StringBuilder(), dVar.f44260b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = motionLayout.getChildAt(i14);
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                int id2 = childAt.getId();
                if (dVar.f44263e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id2))) {
                    map.put(Integer.valueOf(id2), new d.a());
                }
                d.a aVar3 = map.get(Integer.valueOf(id2));
                if (aVar3 != null) {
                    d.b bVar3 = aVar3.f44269e;
                    if (!bVar3.f44314b) {
                        aVar3.d(id2, bVar2);
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            bVar3.f44331j0 = ((androidx.constraintlayout.widget.a) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                bVar3.f44341o0 = barrier.getAllowsGoneWidget();
                                bVar3.f44325g0 = barrier.getType();
                                bVar3.f44327h0 = barrier.getMargin();
                            }
                        }
                        bVar3.f44314b = true;
                    }
                    d.C1714d c1714d3 = aVar3.f44267c;
                    if (!c1714d3.f44368a) {
                        c1714d3.f44369b = childAt.getVisibility();
                        c1714d3.f44371d = childAt.getAlpha();
                        c1714d3.f44368a = true;
                    }
                    d.e eVar2 = aVar3.f44270f;
                    if (!eVar2.f44374a) {
                        eVar2.f44374a = true;
                        eVar2.f44375b = childAt.getRotation();
                        eVar2.f44376c = childAt.getRotationX();
                        eVar2.f44377d = childAt.getRotationY();
                        eVar2.f44378e = childAt.getScaleX();
                        eVar2.f44379f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            eVar2.f44380g = pivotX;
                            eVar2.f44381h = pivotY;
                        }
                        eVar2.f44383j = childAt.getTranslationX();
                        eVar2.f44384k = childAt.getTranslationY();
                        eVar2.f44385l = childAt.getTranslationZ();
                        if (eVar2.f44386m) {
                            eVar2.f44387n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        dVar.b(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r9, int r10) {
        /*
            r8 = this;
            androidx.constraintlayout.widget.k r0 = r8.f44054b
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.b(r9)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r9
        Ld:
            androidx.constraintlayout.widget.k r2 = r8.f44054b
            int r2 = r2.b(r10)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r10
            goto L1a
        L18:
            r0 = r9
            goto L16
        L1a:
            androidx.constraintlayout.motion.widget.w$b r3 = r8.f44055c
            if (r3 == 0) goto L27
            int r4 = r3.f44075c
            if (r4 != r10) goto L27
            int r3 = r3.f44076d
            if (r3 != r9) goto L27
            return
        L27:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.w$b> r3 = r8.f44056d
            java.util.Iterator r4 = r3.iterator()
        L2d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.w$b r5 = (androidx.constraintlayout.motion.widget.w.b) r5
            int r6 = r5.f44075c
            if (r6 != r2) goto L41
            int r7 = r5.f44076d
            if (r7 == r0) goto L47
        L41:
            if (r6 != r10) goto L2d
            int r6 = r5.f44076d
            if (r6 != r9) goto L2d
        L47:
            r8.f44055c = r5
            androidx.constraintlayout.motion.widget.B r9 = r5.f44084l
            if (r9 == 0) goto L52
            boolean r10 = r8.f44068p
            r9.c(r10)
        L52:
            return
        L53:
            androidx.constraintlayout.motion.widget.w$b r9 = r8.f44057e
            java.util.ArrayList<androidx.constraintlayout.motion.widget.w$b> r4 = r8.f44058f
            java.util.Iterator r4 = r4.iterator()
        L5b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.w$b r5 = (androidx.constraintlayout.motion.widget.w.b) r5
            int r6 = r5.f44075c
            if (r6 != r10) goto L5b
            r9 = r5
            goto L5b
        L6d:
            androidx.constraintlayout.motion.widget.w$b r10 = new androidx.constraintlayout.motion.widget.w$b
            r10.<init>(r8, r9)
            r10.f44076d = r0
            r10.f44075c = r2
            if (r0 == r1) goto L7b
            r3.add(r10)
        L7b:
            r8.f44055c = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.w.o(int, int):void");
    }

    public final boolean p() {
        Iterator<b> it = this.f44056d.iterator();
        while (it.hasNext()) {
            if (it.next().f44084l != null) {
                return true;
            }
        }
        b bVar = this.f44055c;
        return (bVar == null || bVar.f44084l == null) ? false : true;
    }

    /* compiled from: MotionScene.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f44073a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44074b;

        /* renamed from: c, reason: collision with root package name */
        public int f44075c;

        /* renamed from: d, reason: collision with root package name */
        public int f44076d;

        /* renamed from: e, reason: collision with root package name */
        public int f44077e;

        /* renamed from: f, reason: collision with root package name */
        public String f44078f;

        /* renamed from: g, reason: collision with root package name */
        public int f44079g;

        /* renamed from: h, reason: collision with root package name */
        public int f44080h;

        /* renamed from: i, reason: collision with root package name */
        public final float f44081i;

        /* renamed from: j, reason: collision with root package name */
        public final w f44082j;

        /* renamed from: k, reason: collision with root package name */
        public final ArrayList<i> f44083k;

        /* renamed from: l, reason: collision with root package name */
        public B f44084l;

        /* renamed from: m, reason: collision with root package name */
        public final ArrayList<a> f44085m;

        /* renamed from: n, reason: collision with root package name */
        public final int f44086n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f44087o;

        /* renamed from: p, reason: collision with root package name */
        public int f44088p;

        /* renamed from: q, reason: collision with root package name */
        public final int f44089q;

        /* renamed from: r, reason: collision with root package name */
        public final int f44090r;

        /* compiled from: MotionScene.java */
        public static class a implements View.OnClickListener {

            /* renamed from: b, reason: collision with root package name */
            public final b f44091b;

            /* renamed from: c, reason: collision with root package name */
            public final int f44092c;

            /* renamed from: d, reason: collision with root package name */
            public final int f44093d;

            public a(Context context, b bVar, XmlResourceParser xmlResourceParser) {
                this.f44092c = -1;
                this.f44093d = 17;
                this.f44091b = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h.m.f44419p);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i12 = 0; i12 < indexCount; i12++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i12);
                    if (index == 1) {
                        this.f44092c = typedArrayObtainStyledAttributes.getResourceId(index, this.f44092c);
                    } else if (index == 0) {
                        this.f44093d = typedArrayObtainStyledAttributes.getInt(index, this.f44093d);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View] */
            public final void a(MotionLayout motionLayout, int i12, b bVar) {
                int i13 = this.f44092c;
                MotionLayout motionLayoutFindViewById = motionLayout;
                if (i13 != -1) {
                    motionLayoutFindViewById = motionLayout.findViewById(i13);
                }
                if (motionLayoutFindViewById == null) {
                    return;
                }
                int i14 = bVar.f44076d;
                int i15 = bVar.f44075c;
                if (i14 == -1) {
                    motionLayoutFindViewById.setOnClickListener(this);
                    return;
                }
                int i16 = this.f44093d;
                int i17 = i16 & 1;
                if (((i17 != 0 && i12 == i14) | (i17 != 0 && i12 == i14) | ((i16 & 256) != 0 && i12 == i14) | ((i16 & 16) != 0 && i12 == i15)) || ((i16 & 4096) != 0 && i12 == i15)) {
                    motionLayoutFindViewById.setOnClickListener(this);
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = this.f44091b;
                w wVar = bVar.f44082j;
                MotionLayout motionLayout = wVar.f44053a;
                if (motionLayout.f43825k) {
                    if (bVar.f44076d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.F(bVar.f44075c);
                            return;
                        }
                        b bVar2 = new b(wVar, bVar);
                        bVar2.f44076d = currentState;
                        bVar2.f44075c = bVar.f44075c;
                        motionLayout.setTransition(bVar2);
                        motionLayout.E();
                        return;
                    }
                    b bVar3 = wVar.f44055c;
                    int i12 = this.f44093d;
                    int i13 = i12 & 1;
                    boolean z12 = true;
                    boolean z13 = false;
                    boolean z14 = (i13 == 0 && (i12 & 256) == 0) ? false : true;
                    int i14 = i12 & 16;
                    if (i14 == 0 && (i12 & 4096) == 0) {
                        z12 = false;
                    }
                    if (z14 && z12) {
                        if (bVar3 != bVar) {
                            motionLayout.setTransition(bVar);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z12 = false;
                            z13 = z14;
                        }
                    } else {
                        z13 = z14;
                    }
                    if (bVar != bVar3) {
                        int i15 = bVar.f44075c;
                        int i16 = bVar.f44076d;
                        if (i16 != -1) {
                            int i17 = motionLayout.f43817g;
                            if (i17 != i16 && i17 != i15) {
                                return;
                            }
                        } else if (motionLayout.f43817g == i15) {
                            return;
                        }
                    }
                    if (z13 && i13 != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.E();
                        return;
                    }
                    if (z12 && i14 != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.l(0.0f);
                    } else if (z13 && (i12 & 256) != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.setProgress(1.0f);
                    } else {
                        if (!z12 || (i12 & 4096) == 0) {
                            return;
                        }
                        motionLayout.setTransition(bVar);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        public b(w wVar, b bVar) {
            this.f44073a = -1;
            this.f44074b = false;
            this.f44075c = -1;
            this.f44076d = -1;
            this.f44077e = 0;
            this.f44078f = null;
            this.f44079g = -1;
            this.f44080h = Constants.MINIMAL_ERROR_STATUS_CODE;
            this.f44081i = 0.0f;
            this.f44083k = new ArrayList<>();
            this.f44084l = null;
            this.f44085m = new ArrayList<>();
            this.f44086n = 0;
            this.f44087o = false;
            this.f44088p = -1;
            this.f44089q = 0;
            this.f44090r = 0;
            this.f44082j = wVar;
            this.f44080h = wVar.f44062j;
            if (bVar != null) {
                this.f44088p = bVar.f44088p;
                this.f44077e = bVar.f44077e;
                this.f44078f = bVar.f44078f;
                this.f44079g = bVar.f44079g;
                this.f44080h = bVar.f44080h;
                this.f44083k = bVar.f44083k;
                this.f44081i = bVar.f44081i;
                this.f44089q = bVar.f44089q;
            }
        }

        public b(w wVar, int i12) {
            this.f44073a = -1;
            this.f44074b = false;
            this.f44075c = -1;
            this.f44076d = -1;
            this.f44077e = 0;
            this.f44078f = null;
            this.f44079g = -1;
            this.f44080h = Constants.MINIMAL_ERROR_STATUS_CODE;
            this.f44081i = 0.0f;
            this.f44083k = new ArrayList<>();
            this.f44084l = null;
            this.f44085m = new ArrayList<>();
            this.f44086n = 0;
            this.f44087o = false;
            this.f44088p = -1;
            this.f44089q = 0;
            this.f44090r = 0;
            this.f44073a = -1;
            this.f44082j = wVar;
            this.f44076d = R.id.view_transition;
            this.f44075c = i12;
            this.f44080h = wVar.f44062j;
            this.f44089q = wVar.f44063k;
        }

        public b(w wVar, Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f44073a = -1;
            this.f44074b = false;
            this.f44075c = -1;
            this.f44076d = -1;
            this.f44077e = 0;
            this.f44078f = null;
            this.f44079g = -1;
            this.f44080h = Constants.MINIMAL_ERROR_STATUS_CODE;
            this.f44081i = 0.0f;
            this.f44083k = new ArrayList<>();
            this.f44084l = null;
            this.f44085m = new ArrayList<>();
            this.f44086n = 0;
            this.f44087o = false;
            this.f44088p = -1;
            this.f44089q = 0;
            this.f44090r = 0;
            this.f44080h = wVar.f44062j;
            this.f44089q = wVar.f44063k;
            this.f44082j = wVar;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h.m.f44425v);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                SparseArray<androidx.constraintlayout.widget.d> sparseArray = wVar.f44059g;
                if (index == 2) {
                    this.f44075c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44075c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.r(this.f44075c, context);
                        sparseArray.append(this.f44075c, dVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f44075c = wVar.k(this.f44075c, context);
                    }
                } else if (index == 3) {
                    this.f44076d = typedArrayObtainStyledAttributes.getResourceId(index, this.f44076d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f44076d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.r(this.f44076d, context);
                        sparseArray.append(this.f44076d, dVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f44076d = wVar.k(this.f44076d, context);
                    }
                } else if (index == 6) {
                    int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i13 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f44079g = resourceId;
                        if (resourceId != -1) {
                            this.f44077e = -2;
                        }
                    } else if (i13 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f44078f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f44079g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f44077e = -2;
                            } else {
                                this.f44077e = -1;
                            }
                        }
                    } else {
                        this.f44077e = typedArrayObtainStyledAttributes.getInteger(index, this.f44077e);
                    }
                } else if (index == 4) {
                    int i14 = typedArrayObtainStyledAttributes.getInt(index, this.f44080h);
                    this.f44080h = i14;
                    if (i14 < 8) {
                        this.f44080h = 8;
                    }
                } else if (index == 8) {
                    this.f44081i = typedArrayObtainStyledAttributes.getFloat(index, this.f44081i);
                } else if (index == 1) {
                    this.f44086n = typedArrayObtainStyledAttributes.getInteger(index, this.f44086n);
                } else if (index == 0) {
                    this.f44073a = typedArrayObtainStyledAttributes.getResourceId(index, this.f44073a);
                } else if (index == 9) {
                    this.f44087o = typedArrayObtainStyledAttributes.getBoolean(index, this.f44087o);
                } else if (index == 7) {
                    this.f44088p = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f44089q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f44090r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f44076d == -1) {
                this.f44074b = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
