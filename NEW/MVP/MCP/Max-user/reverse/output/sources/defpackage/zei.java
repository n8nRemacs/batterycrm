package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class zei {
    public static final SparseArray a;
    public static final SparseArray b;
    public static final AtomicReference c;
    public static final HashMap d;

    static {
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        b = sparseArray2;
        c = new AtomicReference();
        sparseArray.put(-1, e7j.FORMAT_UNKNOWN);
        sparseArray.put(1, e7j.FORMAT_CODE_128);
        sparseArray.put(2, e7j.FORMAT_CODE_39);
        sparseArray.put(4, e7j.FORMAT_CODE_93);
        sparseArray.put(8, e7j.FORMAT_CODABAR);
        sparseArray.put(16, e7j.FORMAT_DATA_MATRIX);
        sparseArray.put(32, e7j.FORMAT_EAN_13);
        sparseArray.put(64, e7j.FORMAT_EAN_8);
        sparseArray.put(128, e7j.FORMAT_ITF);
        sparseArray.put(256, e7j.FORMAT_QR_CODE);
        sparseArray.put(512, e7j.FORMAT_UPC_A);
        sparseArray.put(1024, e7j.FORMAT_UPC_E);
        sparseArray.put(2048, e7j.FORMAT_PDF417);
        sparseArray.put(4096, e7j.FORMAT_AZTEC);
        sparseArray2.put(0, f7j.TYPE_UNKNOWN);
        sparseArray2.put(1, f7j.TYPE_CONTACT_INFO);
        sparseArray2.put(2, f7j.TYPE_EMAIL);
        sparseArray2.put(3, f7j.TYPE_ISBN);
        sparseArray2.put(4, f7j.TYPE_PHONE);
        sparseArray2.put(5, f7j.TYPE_PRODUCT);
        sparseArray2.put(6, f7j.TYPE_SMS);
        sparseArray2.put(7, f7j.TYPE_TEXT);
        sparseArray2.put(8, f7j.TYPE_URL);
        sparseArray2.put(9, f7j.TYPE_WIFI);
        sparseArray2.put(10, f7j.TYPE_GEO);
        sparseArray2.put(11, f7j.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, f7j.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        d = map;
        map.put(1, rbj.CODE_128);
        map.put(2, rbj.CODE_39);
        map.put(4, rbj.CODE_93);
        map.put(8, rbj.CODABAR);
        map.put(16, rbj.DATA_MATRIX);
        map.put(32, rbj.EAN_13);
        map.put(64, rbj.EAN_8);
        map.put(128, rbj.ITF);
        map.put(256, rbj.QR_CODE);
        map.put(512, rbj.UPC_A);
        map.put(1024, rbj.UPC_E);
        map.put(2048, rbj.PDF417);
        map.put(4096, rbj.AZTEC);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.sbj a(defpackage.oi0 r4) {
        /*
            int r4 = r4.a
            c0 r0 = new c0
            r0.<init>()
            java.util.HashMap r1 = defpackage.zei.d
            if (r4 != 0) goto L41
            java.util.Collection r4 = r1.values()
            if (r4 == 0) goto L2f
            int r1 = r0.a
            int r2 = r4.size()
            int r2 = r2 + r1
            r0.i(r2)
            boolean r1 = r4 instanceof defpackage.qhi
            if (r1 != 0) goto L20
            goto L2f
        L20:
            qhi r4 = (defpackage.qhi) r4
            java.lang.Object r1 = r0.c
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r0.a
            int r4 = r4.a(r2, r1)
            r0.a = r4
            goto L6c
        L2f:
            java.util.Iterator r4 = r4.iterator()
        L33:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r4.next()
            r0.h(r1)
            goto L33
        L41:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r3 = r3 & r4
            if (r3 == 0) goto L49
            java.lang.Object r2 = r2.getValue()
            rbj r2 = (defpackage.rbj) r2
            r0.h(r2)
            goto L49
        L6c:
            s6b r4 = new s6b
            r4.<init>()
            cji r0 = r0.j()
            r4.a = r0
            sbj r0 = new sbj
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zei.a(oi0):sbj");
    }

    public static void b(fcj fcjVar, u6j u6jVar) {
        fcjVar.b(new ulc(15, u6jVar), v6j.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean c() {
        AtomicReference atomicReference = c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context contextB = o1a.c().b();
        cji cjiVar = g3j.Z;
        boolean z = d85.a(contextB, "com.google.mlkit.dynamite.barcode") > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
