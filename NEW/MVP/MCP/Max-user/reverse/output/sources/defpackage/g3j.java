package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g3j implements i0j {
    public static final cji Z;
    public final fcj X;
    public adj Y;
    public boolean a;
    public boolean b;
    public boolean c;
    public final Context d;
    public final oi0 o;

    static {
        vhi vhiVar = zhi.b;
        Object[] objArr = {"com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite"};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(ho7.f(i, "at index "));
            }
        }
        Z = new cji(2, objArr);
    }

    public g3j(Context context, oi0 oi0Var, fcj fcjVar) {
        this.d = context;
        this.o = oi0Var;
        this.X = fcjVar;
    }

    @Override // defpackage.i0j
    public final ArrayList a(nm7 nm7Var) throws Throwable {
        tqa tqaVar;
        if (this.Y == null) {
            h();
        }
        adj adjVar = this.Y;
        s5j.g(adjVar);
        if (!this.a) {
            try {
                adjVar.V(adjVar.T(), 1);
                this.a = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init barcode scanner.", e);
            }
        }
        int rowStride = nm7Var.c;
        if (nm7Var.f == 35) {
            Image.Plane[] planeArrA = nm7Var.a();
            s5j.g(planeArrA);
            rowStride = planeArrA[0].getRowStride();
        }
        int i = nm7Var.f;
        int i2 = nm7Var.d;
        int iA = y4j.a(nm7Var.e);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        vf7.b.getClass();
        int i3 = nm7Var.f;
        if (i3 != -1) {
            if (i3 != 17) {
                if (i3 == 35) {
                    tqaVar = new tqa(nm7Var.b != null ? (Image) nm7Var.b.b : null);
                } else if (i3 != 842094169) {
                    throw new MlKitException(ho7.f(nm7Var.f, "Unsupported image format: "), 3);
                }
            }
            s5j.g(null);
            throw null;
        }
        Bitmap bitmap = nm7Var.a;
        s5j.g(bitmap);
        tqaVar = new tqa(bitmap);
        try {
            Parcel parcelT = adjVar.T();
            int i4 = ngi.a;
            parcelT.writeStrongBinder(tqaVar);
            parcelT.writeInt(1);
            int iK = a9j.k(parcelT, 20293);
            a9j.m(parcelT, 1, 4);
            parcelT.writeInt(i);
            a9j.m(parcelT, 2, 4);
            parcelT.writeInt(rowStride);
            a9j.m(parcelT, 3, 4);
            parcelT.writeInt(i2);
            a9j.m(parcelT, 4, 4);
            parcelT.writeInt(iA);
            a9j.m(parcelT, 5, 8);
            parcelT.writeLong(jElapsedRealtime);
            a9j.l(parcelT, iK);
            Parcel parcelU = adjVar.U(parcelT, 3);
            ArrayList arrayListCreateTypedArrayList = parcelU.createTypedArrayList(zcj.CREATOR);
            parcelU.recycle();
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListCreateTypedArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(new mi0(new vgd(14, (zcj) it.next()), nm7Var.g));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run barcode scanner.", e2);
        }
    }

    public final adj b(c85 c85Var, String str, String str2) throws DynamiteModule$LoadingException {
        IInterface bdjVar;
        Context context = this.d;
        IBinder iBinderB = d85.c(context, c85Var, str).b(str2);
        int i = cdj.d;
        adj adjVar = null;
        if (iBinderB == null) {
            bdjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
            bdjVar = iInterfaceQueryLocalInterface instanceof ddj ? (ddj) iInterfaceQueryLocalInterface : new bdj(iBinderB, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator", 1);
        }
        tqa tqaVar = new tqa(context);
        int i2 = this.o.a;
        bdj bdjVar2 = (bdj) bdjVar;
        Parcel parcelT = bdjVar2.T();
        int i3 = ngi.a;
        parcelT.writeStrongBinder(tqaVar);
        parcelT.writeInt(1);
        int iK = a9j.k(parcelT, 20293);
        a9j.m(parcelT, 1, 4);
        parcelT.writeInt(i2);
        a9j.m(parcelT, 2, 4);
        parcelT.writeInt(0);
        a9j.l(parcelT, iK);
        Parcel parcelU = bdjVar2.U(parcelT, 1);
        IBinder strongBinder = parcelU.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            adjVar = iInterfaceQueryLocalInterface2 instanceof adj ? (adj) iInterfaceQueryLocalInterface2 : new adj(strongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner", 1);
        }
        parcelU.recycle();
        return adjVar;
    }

    @Override // defpackage.i0j
    public final void c() {
        adj adjVar = this.Y;
        if (adjVar != null) {
            try {
                adjVar.V(adjVar.T(), 2);
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.Y = null;
            this.a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.i0j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g3j.h():boolean");
    }
}
