package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class rs0 implements iof {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public Object d;
    public Object e;

    public /* synthetic */ rs0(int i, byte b) {
        this.a = i;
    }

    @Override // defpackage.iof
    public void a(long j) {
    }

    @Override // defpackage.kh4
    public z62 b() {
        ArrayDeque arrayDeque = (ArrayDeque) this.e;
        nof nofVar = (nof) this.d;
        fsi.d(!this.c);
        if (this.b != 2 || arrayDeque.isEmpty()) {
            return null;
        }
        z62 z62Var = (z62) arrayDeque.removeFirst();
        if (nofVar.j(4)) {
            z62Var.a(4);
        } else {
            long j = nofVar.X;
            ByteBuffer byteBuffer = nofVar.d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            z62Var.x(nofVar.X, new v32(j, mw0.b(gb4.C0, parcelableArrayList), 8), 0L);
        }
        nofVar.w();
        this.b = 0;
        return z62Var;
    }

    @Override // defpackage.kh4
    public Object c() {
        fsi.d(!this.c);
        if (this.b != 0) {
            return null;
        }
        this.b = 1;
        return (nof) this.d;
    }

    @Override // defpackage.kh4
    public void d(nof nofVar) {
        fsi.d(!this.c);
        fsi.d(this.b == 1);
        fsi.b(((nof) this.d) == nofVar);
        this.b = 2;
    }

    public ibi e() {
        s5j.a("execute parameter required", ((ikd) this.d) != null);
        return new ibi(this, (qt5[]) this.e, this.c, this.b);
    }

    public void f(int i) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        View view = (View) bottomSheetBehavior.U.get();
                        ue ueVar = (ue) this.d;
                        WeakHashMap weakHashMap = hfh.a;
                        view.postOnAnimation(ueVar);
                        this.c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        View view2 = (View) sideSheetBehavior.p.get();
                        bee beeVar = (bee) this.d;
                        WeakHashMap weakHashMap2 = hfh.a;
                        view2.postOnAnimation(beeVar);
                        this.c = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.kh4
    public void flush() {
        fsi.d(!this.c);
        ((nof) this.d).w();
        this.b = 0;
    }

    public void g(xo8 xo8Var, int i, int i2) throws GlUtil$GlException {
        int i3;
        xo8 xo8Var2;
        int i4;
        int i5;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        hsi.g(arrayDeque.isEmpty());
        hsi.g(((ArrayDeque) this.e).isEmpty());
        for (int i6 = 0; i6 < this.b; i6++) {
            if (this.c) {
                guf.a(i, i2);
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                guf.d();
                i3 = iArr[0];
                guf.b(3553, i3, 9729);
                i4 = i;
                i5 = i2;
                GLES20.glTexImage2D(3553, 0, 34842, i4, i5, 0, 6408, 5131, null);
                guf.d();
                xo8Var2 = xo8Var;
            } else {
                guf.a(i, i2);
                int[] iArr2 = new int[1];
                GLES20.glGenTextures(1, iArr2, 0);
                guf.d();
                i3 = iArr2[0];
                guf.b(3553, i3, 9729);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                guf.d();
                xo8Var2 = xo8Var;
                i4 = i;
                i5 = i2;
            }
            arrayDeque.add(xo8Var2.t(i3, i4, i5));
        }
    }

    public void h() {
        Iterator itK = k();
        while (true) {
            gt7 gt7Var = (gt7) itK;
            if (!gt7Var.hasNext()) {
                ((ArrayDeque) this.d).clear();
                ((ArrayDeque) this.e).clear();
                return;
            }
            ((tu6) gt7Var.next()).a();
        }
    }

    public void i(xo8 xo8Var, int i, int i2) throws GlUtil$GlException {
        if (!((gt7) k()).hasNext()) {
            g(xo8Var, i, i2);
            return;
        }
        tu6 tu6Var = (tu6) ((gt7) k()).next();
        if (tu6Var.c == i && tu6Var.d == i2) {
            return;
        }
        h();
        g(xo8Var, i, i2);
    }

    public int j() {
        return !((gt7) k()).hasNext() ? this.b : ((ArrayDeque) this.d).size();
    }

    public Iterator k() {
        Iterable[] iterableArr = {(ArrayDeque) this.d, (ArrayDeque) this.e};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new u76(iterableArr).iterator();
    }

    public tu6 l() {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (arrayDeque.isEmpty()) {
            throw new IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
        }
        tu6 tu6Var = (tu6) arrayDeque.remove();
        ((ArrayDeque) this.e).add(tu6Var);
        return tu6Var;
    }

    @Override // defpackage.kh4
    public void release() {
        this.c = true;
    }

    public rs0(boolean z, int i) {
        this.a = 7;
        this.b = i;
        this.c = z;
        this.d = new ArrayDeque(i);
        this.e = new ArrayDeque(i);
    }

    public rs0(int i, boolean z, Long l, Long l2) {
        this.a = 1;
        this.b = i;
        this.c = z;
        this.d = (l == null || l.longValue() == ((long) 0)) ? null : l;
        this.e = l2;
    }

    public rs0(int i) {
        this.a = 1;
        this.b = i;
        this.c = false;
        this.d = null;
        this.e = null;
    }

    public rs0() {
        this.a = 3;
        this.d = new nof(1);
        this.e = new ArrayDeque();
        for (int i = 0; i < 2; i++) {
            ((ArrayDeque) this.e).addFirst(new z62(this, 1));
        }
        this.b = 0;
    }

    public rs0(Context context) {
        this.a = 2;
        this.d = context;
        this.e = new dm4(6);
        this.b = co4.f;
    }

    public rs0(SideSheetBehavior sideSheetBehavior) {
        this.a = 5;
        this.e = sideSheetBehavior;
        this.d = new bee(6, this);
    }

    public rs0(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new ue(5, this);
    }
}
