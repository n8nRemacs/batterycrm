package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import androidx.collection.C20199a;
import androidx.core.graphics.C22767g;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.InterfaceC42156l;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Palette.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final c f53263e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f53264a;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final e f53267d;

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f53266c = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    public final C20199a f53265b = new C20199a();

    /* compiled from: Palette.java */
    public static class a implements c {
        @Override // androidx.palette.graphics.b.c
        public final boolean a(float[] fArr) {
            float f12 = fArr[2];
            if (f12 >= 0.95f || f12 <= 0.05f) {
                return false;
            }
            float f13 = fArr[0];
            return f13 < 10.0f || f13 > 37.0f || fArr[1] > 0.82f;
        }
    }

    /* compiled from: Palette.java */
    /* renamed from: androidx.palette.graphics.b$b, reason: collision with other inner class name */
    public static final class C1877b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final Bitmap f53268a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f53269b;

        /* renamed from: c, reason: collision with root package name */
        public final int f53270c;

        /* renamed from: d, reason: collision with root package name */
        public final int f53271d;

        /* renamed from: e, reason: collision with root package name */
        public final int f53272e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f53273f;

        public C1877b(@N Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f53269b = arrayList;
            this.f53270c = 16;
            this.f53271d = 12544;
            this.f53272e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f53273f = arrayList2;
            if (bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(b.f53263e);
            this.f53268a = bitmap;
            arrayList.add(androidx.palette.graphics.d.f53283d);
            arrayList.add(androidx.palette.graphics.d.f53284e);
            arrayList.add(androidx.palette.graphics.d.f53285f);
            arrayList.add(androidx.palette.graphics.d.f53286g);
            arrayList.add(androidx.palette.graphics.d.f53287h);
            arrayList.add(androidx.palette.graphics.d.f53288i);
        }

        /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
        @j.N
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.palette.graphics.b a() {
            /*
                Method dump skipped, instructions count: 444
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.palette.graphics.b.C1877b.a():androidx.palette.graphics.b");
        }
    }

    /* compiled from: Palette.java */
    public interface c {
        boolean a(@N float[] fArr);
    }

    /* compiled from: Palette.java */
    public interface d {
    }

    /* compiled from: Palette.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f53274a;

        /* renamed from: b, reason: collision with root package name */
        public final int f53275b;

        /* renamed from: c, reason: collision with root package name */
        public final int f53276c;

        /* renamed from: d, reason: collision with root package name */
        public final int f53277d;

        /* renamed from: e, reason: collision with root package name */
        public final int f53278e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f53279f;

        /* renamed from: g, reason: collision with root package name */
        public int f53280g;

        /* renamed from: h, reason: collision with root package name */
        public int f53281h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public float[] f53282i;

        public e(@InterfaceC42156l int i12, int i13) {
            this.f53274a = Color.red(i12);
            this.f53275b = Color.green(i12);
            this.f53276c = Color.blue(i12);
            this.f53277d = i12;
            this.f53278e = i13;
        }

        public final void a() {
            if (this.f53279f) {
                return;
            }
            int i12 = this.f53277d;
            int iF2 = C22767g.f(4.5f, -1, i12);
            int iF3 = C22767g.f(3.0f, -1, i12);
            if (iF2 != -1 && iF3 != -1) {
                this.f53281h = C22767g.i(-1, iF2);
                this.f53280g = C22767g.i(-1, iF3);
                this.f53279f = true;
                return;
            }
            int iF4 = C22767g.f(4.5f, -16777216, i12);
            int iF5 = C22767g.f(3.0f, -16777216, i12);
            if (iF4 == -1 || iF5 == -1) {
                this.f53281h = iF2 != -1 ? C22767g.i(-1, iF2) : C22767g.i(-16777216, iF4);
                this.f53280g = iF3 != -1 ? C22767g.i(-1, iF3) : C22767g.i(-16777216, iF5);
                this.f53279f = true;
            } else {
                this.f53281h = C22767g.i(-16777216, iF4);
                this.f53280g = C22767g.i(-16777216, iF5);
                this.f53279f = true;
            }
        }

        @N
        public final float[] b() {
            if (this.f53282i == null) {
                this.f53282i = new float[3];
            }
            C22767g.a(this.f53274a, this.f53275b, this.f53276c, this.f53282i);
            return this.f53282i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f53278e == eVar.f53278e && this.f53277d == eVar.f53277d;
        }

        public final int hashCode() {
            return (this.f53277d * 31) + this.f53278e;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(e.class.getSimpleName());
            sb2.append(" [RGB: #");
            sb2.append(Integer.toHexString(this.f53277d));
            sb2.append("] [HSL: ");
            sb2.append(Arrays.toString(b()));
            sb2.append("] [Population: ");
            sb2.append(this.f53278e);
            sb2.append("] [Title Text: #");
            a();
            sb2.append(Integer.toHexString(this.f53280g));
            sb2.append("] [Body Text: #");
            a();
            sb2.append(Integer.toHexString(this.f53281h));
            sb2.append(']');
            return sb2.toString();
        }
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f53264a = arrayList;
        int size = arrayList.size();
        int i12 = BeduinInputModel.MIN_TEXT_VERSION;
        e eVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            e eVar2 = (e) arrayList.get(i13);
            int i14 = eVar2.f53278e;
            if (i14 > i12) {
                eVar = eVar2;
                i12 = i14;
            }
        }
        this.f53267d = eVar;
    }
}
