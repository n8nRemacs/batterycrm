package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.h;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f44241a;

    /* renamed from: b, reason: collision with root package name */
    public int f44242b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f44243c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<a> f44244d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray<d> f44245e = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f44246a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<C1712b> f44247b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public final int f44248c;

        /* renamed from: d, reason: collision with root package name */
        public final d f44249d;

        public a(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f44248c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h.m.f44422s);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 0) {
                    this.f44246a = typedArrayObtainStyledAttributes.getResourceId(index, this.f44246a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f44248c);
                    this.f44248c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f44249d = dVar;
                        dVar.g((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    public static class C1712b {

        /* renamed from: a, reason: collision with root package name */
        public final float f44250a;

        /* renamed from: b, reason: collision with root package name */
        public final float f44251b;

        /* renamed from: c, reason: collision with root package name */
        public final float f44252c;

        /* renamed from: d, reason: collision with root package name */
        public final float f44253d;

        /* renamed from: e, reason: collision with root package name */
        public final int f44254e;

        /* renamed from: f, reason: collision with root package name */
        public final d f44255f;

        public C1712b(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f44250a = Float.NaN;
            this.f44251b = Float.NaN;
            this.f44252c = Float.NaN;
            this.f44253d = Float.NaN;
            this.f44254e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h.m.f44426w);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f44254e);
                    this.f44254e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f44255f = dVar;
                        dVar.g((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f44253d = typedArrayObtainStyledAttributes.getDimension(index, this.f44253d);
                } else if (index == 2) {
                    this.f44251b = typedArrayObtainStyledAttributes.getDimension(index, this.f44251b);
                } else if (index == 3) {
                    this.f44252c = typedArrayObtainStyledAttributes.getDimension(index, this.f44252c);
                } else if (index == 4) {
                    this.f44250a = typedArrayObtainStyledAttributes.getDimension(index, this.f44250a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f12, float f13) {
            float f14 = this.f44250a;
            if (!Float.isNaN(f14) && f12 < f14) {
                return false;
            }
            float f15 = this.f44251b;
            if (!Float.isNaN(f15) && f13 < f15) {
                return false;
            }
            float f16 = this.f44252c;
            if (!Float.isNaN(f16) && f12 > f16) {
                return false;
            }
            float f17 = this.f44253d;
            return Float.isNaN(f17) || f13 <= f17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r8, androidx.constraintlayout.widget.ConstraintLayout r9, int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f44242b = r0
            r7.f44243c = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f44244d = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f44245e = r1
            r1 = 0
            r7.f44241a = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r9.getXml(r10)
            int r10 = r9.getEventType()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
        L25:
            r2 = 1
            if (r10 == r2) goto La7
            if (r10 == 0) goto L98
            r3 = 2
            if (r10 == r3) goto L2f
            goto L9b
        L2f:
            java.lang.String r10 = r9.getName()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            int r4 = r10.hashCode()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L68;
                case 80204913: goto L5e;
                case 1382829617: goto L55;
                case 1657696882: goto L4b;
                case 1901439077: goto L3d;
                default: goto L3c;
            }     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
        L3c:
            goto L72
        L3d:
            java.lang.String r2 = "Variant"
            boolean r10 = r10.equals(r2)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r10 == 0) goto L72
            r2 = r6
            goto L73
        L47:
            r8 = move-exception
            goto La0
        L49:
            r8 = move-exception
            goto La4
        L4b:
            java.lang.String r2 = "layoutDescription"
            boolean r10 = r10.equals(r2)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r10 == 0) goto L72
            r2 = 0
            goto L73
        L55:
            java.lang.String r4 = "StateSet"
            boolean r10 = r10.equals(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r10 == 0) goto L72
            goto L73
        L5e:
            java.lang.String r2 = "State"
            boolean r10 = r10.equals(r2)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r10 == 0) goto L72
            r2 = r3
            goto L73
        L68:
            java.lang.String r2 = "ConstraintSet"
            boolean r10 = r10.equals(r2)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r10 == 0) goto L72
            r2 = r5
            goto L73
        L72:
            r2 = r0
        L73:
            if (r2 == r3) goto L8b
            if (r2 == r6) goto L7e
            if (r2 == r5) goto L7a
            goto L9b
        L7a:
            r7.a(r8, r9)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            goto L9b
        L7e:
            androidx.constraintlayout.widget.b$b r10 = new androidx.constraintlayout.widget.b$b     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r10.<init>(r8, r9)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r1 == 0) goto L9b
            java.util.ArrayList<androidx.constraintlayout.widget.b$b> r2 = r1.f44247b     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r2.add(r10)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            goto L9b
        L8b:
            androidx.constraintlayout.widget.b$a r1 = new androidx.constraintlayout.widget.b$a     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            android.util.SparseArray<androidx.constraintlayout.widget.b$a> r10 = r7.f44244d     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            int r2 = r1.f44246a     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r10.put(r2, r1)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            goto L9b
        L98:
            r9.getName()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
        L9b:
            int r10 = r9.next()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            goto L25
        La0:
            r8.printStackTrace()
            goto La7
        La4:
            r8.printStackTrace()
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) throws XmlPullParserException, NumberFormatException, IOException {
        d dVar = new d();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i12 = 0; i12 < attributeCount; i12++) {
            String attributeName = xmlResourceParser.getAttributeName(i12);
            String attributeValue = xmlResourceParser.getAttributeValue(i12);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                dVar.s(context, xmlResourceParser);
                this.f44245e.put(identifier, dVar);
                return;
            }
        }
    }

    public final void b(float f12, float f13, int i12) {
        int i13 = this.f44242b;
        SparseArray<a> sparseArray = this.f44244d;
        int i14 = 0;
        ConstraintLayout constraintLayout = this.f44241a;
        if (i13 != i12) {
            this.f44242b = i12;
            a aVar = sparseArray.get(i12);
            while (true) {
                ArrayList<C1712b> arrayList = aVar.f44247b;
                if (i14 >= arrayList.size()) {
                    i14 = -1;
                    break;
                } else if (arrayList.get(i14).a(f12, f13)) {
                    break;
                } else {
                    i14++;
                }
            }
            ArrayList<C1712b> arrayList2 = aVar.f44247b;
            d dVar = i14 == -1 ? aVar.f44249d : arrayList2.get(i14).f44255f;
            if (i14 != -1) {
                int i15 = arrayList2.get(i14).f44254e;
            }
            if (dVar == null) {
                return;
            }
            this.f44243c = i14;
            dVar.c(constraintLayout);
            return;
        }
        a aVarValueAt = i12 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i13);
        int i16 = this.f44243c;
        if (i16 == -1 || !aVarValueAt.f44247b.get(i16).a(f12, f13)) {
            while (true) {
                ArrayList<C1712b> arrayList3 = aVarValueAt.f44247b;
                if (i14 >= arrayList3.size()) {
                    i14 = -1;
                    break;
                } else if (arrayList3.get(i14).a(f12, f13)) {
                    break;
                } else {
                    i14++;
                }
            }
            if (this.f44243c == i14) {
                return;
            }
            ArrayList<C1712b> arrayList4 = aVarValueAt.f44247b;
            d dVar2 = i14 == -1 ? null : arrayList4.get(i14).f44255f;
            if (i14 != -1) {
                int i17 = arrayList4.get(i14).f44254e;
            }
            if (dVar2 == null) {
                return;
            }
            this.f44243c = i14;
            dVar2.c(constraintLayout);
        }
    }
}
