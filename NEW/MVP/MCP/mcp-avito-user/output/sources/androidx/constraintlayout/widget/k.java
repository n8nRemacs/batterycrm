package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.h;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: StateSet.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f44432a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f44433b = new SparseArray<>();

    /* compiled from: StateSet.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f44434a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f44435b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public final int f44436c;

        public a(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f44436c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h.m.f44422s);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 0) {
                    this.f44434a = typedArrayObtainStyledAttributes.getResourceId(index, this.f44434a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f44436c);
                    this.f44436c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: StateSet.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f44437a;

        /* renamed from: b, reason: collision with root package name */
        public final float f44438b;

        /* renamed from: c, reason: collision with root package name */
        public final float f44439c;

        /* renamed from: d, reason: collision with root package name */
        public final float f44440d;

        /* renamed from: e, reason: collision with root package name */
        public final int f44441e;

        public b(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f44437a = Float.NaN;
            this.f44438b = Float.NaN;
            this.f44439c = Float.NaN;
            this.f44440d = Float.NaN;
            this.f44441e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h.m.f44426w);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f44441e);
                    this.f44441e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.f44440d = typedArrayObtainStyledAttributes.getDimension(index, this.f44440d);
                } else if (index == 2) {
                    this.f44438b = typedArrayObtainStyledAttributes.getDimension(index, this.f44438b);
                } else if (index == 3) {
                    this.f44439c = typedArrayObtainStyledAttributes.getDimension(index, this.f44439c);
                } else if (index == 4) {
                    this.f44437a = typedArrayObtainStyledAttributes.getDimension(index, this.f44437a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f12, float f13) {
            float f14 = this.f44437a;
            if (!Float.isNaN(f14) && f12 < f14) {
                return false;
            }
            float f15 = this.f44438b;
            if (!Float.isNaN(f15) && f13 < f15) {
                return false;
            }
            float f16 = this.f44439c;
            if (!Float.isNaN(f16) && f12 > f16) {
                return false;
            }
            float f17 = this.f44440d;
            return Float.isNaN(f17) || f13 <= f17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(android.content.Context r10, android.content.res.XmlResourceParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f44432a = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r9.f44433b = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r11)
            int[] r2 = androidx.constraintlayout.widget.h.m.f44423t
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r2)
            int r2 = r1.getIndexCount()
            r3 = 0
            r4 = r3
        L22:
            if (r4 >= r2) goto L35
            int r5 = r1.getIndex(r4)
            if (r5 != 0) goto L32
            int r6 = r9.f44432a
            int r5 = r1.getResourceId(r5, r6)
            r9.f44432a = r5
        L32:
            int r4 = r4 + 1
            goto L22
        L35:
            r1.recycle()
            int r1 = r11.getEventType()     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            r2 = 0
        L3d:
            r4 = 1
            if (r1 == r4) goto Lbe
            if (r1 == 0) goto Laf
            java.lang.String r5 = "StateSet"
            r6 = 3
            r7 = 2
            if (r1 == r7) goto L5e
            if (r1 == r6) goto L4c
            goto Lb2
        L4c:
            java.lang.String r1 = r11.getName()     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            boolean r1 = r5.equals(r1)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            if (r1 == 0) goto Lb2
            goto Lbe
        L58:
            r10 = move-exception
            goto Lb7
        L5b:
            r10 = move-exception
            goto Lbb
        L5e:
            java.lang.String r1 = r11.getName()     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            int r8 = r1.hashCode()     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            switch(r8) {
                case 80204913: goto L85;
                case 1301459538: goto L7b;
                case 1382829617: goto L74;
                case 1901439077: goto L6a;
                default: goto L69;
            }     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
        L69:
            goto L8f
        L6a:
            java.lang.String r4 = "Variant"
            boolean r1 = r1.equals(r4)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            if (r1 == 0) goto L8f
            r4 = r6
            goto L90
        L74:
            boolean r1 = r1.equals(r5)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            if (r1 == 0) goto L8f
            goto L90
        L7b:
            java.lang.String r4 = "LayoutDescription"
            boolean r1 = r1.equals(r4)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            if (r1 == 0) goto L8f
            r4 = r3
            goto L90
        L85:
            java.lang.String r4 = "State"
            boolean r1 = r1.equals(r4)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            if (r1 == 0) goto L8f
            r4 = r7
            goto L90
        L8f:
            r4 = r0
        L90:
            if (r4 == r7) goto La2
            if (r4 == r6) goto L95
            goto Lb2
        L95:
            androidx.constraintlayout.widget.k$b r1 = new androidx.constraintlayout.widget.k$b     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            r1.<init>(r10, r11)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            if (r2 == 0) goto Lb2
            java.util.ArrayList<androidx.constraintlayout.widget.k$b> r4 = r2.f44435b     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            r4.add(r1)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            goto Lb2
        La2:
            androidx.constraintlayout.widget.k$a r2 = new androidx.constraintlayout.widget.k$a     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            r2.<init>(r10, r11)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            android.util.SparseArray<androidx.constraintlayout.widget.k$a> r1 = r9.f44433b     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            int r4 = r2.f44434a     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            r1.put(r4, r2)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            goto Lb2
        Laf:
            r11.getName()     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
        Lb2:
            int r1 = r11.next()     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            goto L3d
        Lb7:
            r10.printStackTrace()
            goto Lbe
        Lbb:
            r10.printStackTrace()
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.k.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public final int a(float f12, float f13, int i12, int i13) {
        a aVar = this.f44433b.get(i13);
        if (aVar == null) {
            return i13;
        }
        ArrayList<b> arrayList = aVar.f44435b;
        int i14 = aVar.f44436c;
        if (f12 == -1.0f || f13 == -1.0f) {
            if (i14 == i12) {
                return i12;
            }
            Iterator<b> it = arrayList.iterator();
            while (it.hasNext()) {
                if (i12 == it.next().f44441e) {
                    return i12;
                }
            }
            return i14;
        }
        Iterator<b> it2 = arrayList.iterator();
        b bVar = null;
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.a(f12, f13)) {
                if (i12 == next.f44441e) {
                    return i12;
                }
                bVar = next;
            }
        }
        return bVar != null ? bVar.f44441e : i14;
    }

    public final int b(int i12) {
        int i13;
        float f12 = -1;
        SparseArray<a> sparseArray = this.f44433b;
        int i14 = 0;
        if (-1 == i12) {
            a aVarValueAt = i12 == -1 ? sparseArray.valueAt(0) : sparseArray.get(-1);
            if (aVarValueAt == null) {
                return -1;
            }
            while (true) {
                ArrayList<b> arrayList = aVarValueAt.f44435b;
                if (i14 >= arrayList.size()) {
                    i14 = -1;
                    break;
                }
                if (arrayList.get(i14).a(f12, f12)) {
                    break;
                }
                i14++;
            }
            if (-1 == i14) {
                return -1;
            }
            i13 = i14 == -1 ? aVarValueAt.f44436c : aVarValueAt.f44435b.get(i14).f44441e;
        } else {
            a aVar = sparseArray.get(i12);
            if (aVar == null) {
                return -1;
            }
            while (true) {
                ArrayList<b> arrayList2 = aVar.f44435b;
                if (i14 >= arrayList2.size()) {
                    i14 = -1;
                    break;
                }
                if (arrayList2.get(i14).a(f12, f12)) {
                    break;
                }
                i14++;
            }
            i13 = i14 == -1 ? aVar.f44436c : aVar.f44435b.get(i14).f44441e;
        }
        return i13;
    }
}
