package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class t49 {
    public static dwi c;
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ t49(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    public static xo0 a() {
        try {
            dwi dwiVar = c;
            s5j.h(dwiVar, "IBitmapDescriptorFactory is not initialized");
            vri vriVar = (vri) dwiVar;
            Parcel parcelS = vriVar.S(vriVar.T(), 4);
            kb7 kb7VarW = tqa.W(parcelS.readStrongBinder());
            parcelS.recycle();
            return new xo0(kb7VarW);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static xo0 b(Bitmap bitmap) {
        s5j.h(bitmap, "image must not be null");
        try {
            dwi dwiVar = c;
            s5j.h(dwiVar, "IBitmapDescriptorFactory is not initialized");
            vri vriVar = (vri) dwiVar;
            Parcel parcelT = vriVar.T();
            mgi.c(parcelT, bitmap);
            Parcel parcelS = vriVar.S(parcelT, 6);
            kb7 kb7VarW = tqa.W(parcelS.readStrongBinder());
            parcelS.recycle();
            return new xo0(kb7VarW);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    private final void l() {
    }

    public static String n(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String strJ = ctd.j(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strJ), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb = new StringBuilder(name2.length() + strJ.length() + 8 + 1);
                    sb.append("<");
                    sb.append(strJ);
                    sb.append(" threw ");
                    sb.append(name2);
                    sb.append(">");
                    string = sb.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, iIndexOf);
            sb2.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public void h(k69 k69Var) {
        switch (this.a) {
            case 0:
                ((v49) this.b).b();
                break;
            case 1:
                ((x49) this.b).dismiss();
                break;
            case 3:
                ((o59) this.b).dismiss();
                break;
            case 4:
                x59 x59Var = (x59) this.b;
                x59Var.s0 = k69Var;
                x59Var.o();
                x59Var.m();
                break;
        }
    }

    public final void i(k69 k69Var) {
    }

    public final void j() {
    }

    public final void k(k69 k69Var) {
    }

    public final void m() {
    }
}
