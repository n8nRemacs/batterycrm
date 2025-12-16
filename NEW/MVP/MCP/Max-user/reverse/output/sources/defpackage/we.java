package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.mlkit.common.MlKitException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class we implements hz0, gu3, i0j {
    public static final n7 X = new n7();
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;
    public Object o;

    public /* synthetic */ we(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.o = obj4;
        this.a = z;
    }

    public static int i(gz0 gz0Var, int i) {
        int iHashCode = gz0Var.b.hashCode() + (gz0Var.a * 31);
        if (i < 2) {
            long jA = i34.a(gz0Var.e);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return gz0Var.e.hashCode() + (iHashCode * 31);
    }

    public static gz0 k(int i, DataInputStream dataInputStream) throws IOException {
        vk4 vk4VarA;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            k34 k34Var = new k34();
            k34Var.a(Long.valueOf(j), "exo_len");
            vk4VarA = vk4.c.b(k34Var);
        } else {
            vk4VarA = ra3.a(dataInputStream);
        }
        return new gz0(i2, utf, vk4VarA);
    }

    @Override // defpackage.i0j
    public ArrayList a(nm7 nm7Var) throws MlKitException {
        z9j[] z9jVarArrW;
        if (((ndi) this.o) == null) {
            h();
        }
        ndi ndiVar = (ndi) this.o;
        if (ndiVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        vdi vdiVar = new vdi(nm7Var.c, nm7Var.d, 0, 0L, y4j.a(nm7Var.e));
        try {
            int i = nm7Var.f;
            int i2 = 17;
            if (i == -1) {
                tqa tqaVar = new tqa(nm7Var.a);
                Parcel parcelT = ndiVar.T();
                int i3 = ngi.a;
                parcelT.writeStrongBinder(tqaVar);
                parcelT.writeInt(1);
                vdiVar.writeToParcel(parcelT, 0);
                Parcel parcelU = ndiVar.U(parcelT, 2);
                z9j[] z9jVarArr = (z9j[]) parcelU.createTypedArray(z9j.CREATOR);
                parcelU.recycle();
                z9jVarArrW = z9jVarArr;
            } else if (i == 17) {
                z9jVarArrW = ndiVar.W(new tqa(null), vdiVar);
            } else if (i == 35) {
                Image.Plane[] planeArrA = nm7Var.a();
                s5j.g(planeArrA);
                vdiVar.a = planeArrA[0].getRowStride();
                z9jVarArrW = ndiVar.W(new tqa(planeArrA[0].getBuffer()), vdiVar);
            } else {
                if (i != 842094169) {
                    throw new MlKitException("Unsupported image format: " + nm7Var.f, 3);
                }
                z9jVarArrW = ndiVar.W(new tqa(ifi.a(nm7Var)), vdiVar);
            }
            ArrayList arrayList = new ArrayList();
            for (z9j z9jVar : z9jVarArrW) {
                arrayList.add(new mi0(new zkb(i2, z9jVar), nm7Var.g));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to detect with legacy barcode detector", e);
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence.length() == 0 || charSequence.equals((CharSequence) this.b)) {
            return;
        }
        ((gr9) this.c).a((pb2) this.d, (eh9) this.o, charSequence, this.a);
    }

    @Override // defpackage.hz0
    public void b(HashMap map) throws Throwable {
        DataOutputStream dataOutputStream;
        i5i i5iVar = (i5i) this.d;
        DataOutputStream dataOutputStream2 = null;
        try {
            ty tyVarR = i5iVar.r();
            xpd xpdVar = (xpd) this.o;
            if (xpdVar == null) {
                this.o = new xpd(tyVarR, 1);
            } else {
                xpdVar.c(tyVarR);
            }
            dataOutputStream = new DataOutputStream((xpd) this.o);
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(map.size());
            int i = 0;
            for (gz0 gz0Var : map.values()) {
                dataOutputStream.writeInt(gz0Var.a);
                dataOutputStream.writeUTF(gz0Var.b);
                ra3.b(gz0Var.e, dataOutputStream);
                i += i(gz0Var, 2);
            }
            dataOutputStream.writeInt(i);
            dataOutputStream.close();
            ((File) i5iVar.b).delete();
            String str = zxg.a;
            this.a = false;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            zxg.g(dataOutputStream2);
            throw th;
        }
    }

    @Override // defpackage.i0j
    public void c() {
        ndi ndiVar = (ndi) this.o;
        if (ndiVar != null) {
            try {
                ndiVar.V(ndiVar.T(), 3);
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.o = null;
        }
    }

    @Override // defpackage.hz0
    public void d(gz0 gz0Var, boolean z) {
        this.a = true;
    }

    @Override // defpackage.hz0
    public void e(gz0 gz0Var) {
        this.a = true;
    }

    @Override // defpackage.hz0
    public boolean f() {
        i5i i5iVar = (i5i) this.d;
        return ((File) i5iVar.a).exists() || ((File) i5iVar.b).exists();
    }

    @Override // defpackage.hz0
    public void g(HashMap map) throws Throwable {
        if (this.a) {
            b(map);
        }
    }

    @Override // defpackage.i0j
    public boolean h() throws MlKitException {
        tdi pdiVar;
        fcj fcjVar = (fcj) this.d;
        Context context = (Context) this.b;
        if (((ndi) this.o) != null) {
            return false;
        }
        try {
            IBinder iBinderB = d85.c(context, d85.b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
            int i = rdi.d;
            if (iBinderB == null) {
                pdiVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                pdiVar = iInterfaceQueryLocalInterface instanceof tdi ? (tdi) iInterfaceQueryLocalInterface : new pdi(iBinderB, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 1);
            }
            ndi ndiVarW = ((pdi) pdiVar).W(new tqa(context), (edi) this.c);
            this.o = ndiVarW;
            if (ndiVarW == null && !this.a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                qt5[] qt5VarArr = cjb.a;
                sci sciVar = zci.b;
                Object[] objArr = {"barcode"};
                lui.c(1, objArr);
                cjb.a(context, new sdi(1, objArr));
                this.a = true;
                zei.b(fcjVar, u6j.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            zei.b(fcjVar, u6j.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy barcode detector.", e);
        } catch (DynamiteModule$LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", e2);
        }
    }

    @Override // defpackage.hz0
    public void j(long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: all -> 0x007e, IOException -> 0x0081, LOOP:0: B:36:0x0093->B:37:0x0095, LOOP_END, TryCatch #4 {IOException -> 0x0081, all -> 0x007e, blocks: (B:13:0x0045, B:18:0x004f, B:24:0x005f, B:25:0x0069, B:26:0x0072, B:33:0x0086, B:34:0x008b, B:35:0x008c, B:37:0x0095, B:38:0x00ab), top: B:61:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    @Override // defpackage.hz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(java.util.HashMap r13, android.util.SparseArray r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we.l(java.util.HashMap, android.util.SparseArray):void");
    }

    @Override // defpackage.hz0
    public void m() {
        i5i i5iVar = (i5i) this.d;
        ((File) i5iVar.a).delete();
        ((File) i5iVar.b).delete();
    }

    public boolean n(Bitmap bitmap, int i) {
        try {
            ((dl6) this.d).r(bitmap, i);
            return true;
        } catch (IllegalStateException e) {
            if (!op5.a.h(6)) {
                return false;
            }
            op5.a.e(we.class.getSimpleName(), "Rendering of frame unsuccessful. Frame number: " + i, e);
            return false;
        }
    }

    public we(Context context, oi0 oi0Var, fcj fcjVar) {
        edi ediVar = new edi();
        this.c = ediVar;
        this.b = context;
        ediVar.a = oi0Var.a;
        this.d = fcjVar;
    }

    public we(bp0 bp0Var, fs3 fs3Var, boolean z) {
        this.b = bp0Var;
        this.c = fs3Var;
        this.a = z;
        ukd ukdVar = new ukd(2, this);
        this.o = ukdVar;
        this.d = new dl6(fs3Var, z, ukdVar);
    }

    public we(File file) {
        this.b = null;
        this.c = null;
        i5i i5iVar = new i5i();
        i5iVar.a = file;
        i5iVar.b = new File(file.getPath() + ".bak");
        this.d = i5iVar;
    }
}
