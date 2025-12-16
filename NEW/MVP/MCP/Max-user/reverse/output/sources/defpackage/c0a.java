package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c0a extends ds4 {
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final bwf j;

    public c0a(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        super(k18Var);
        this.e = k18Var2;
        this.f = k18Var3;
        this.g = k18Var5;
        this.h = k18Var6;
        this.i = k18Var4;
        this.j = new bwf(new nz(k18Var2, 22));
    }

    @Override // defpackage.ds4
    public final fl9 k() {
        List list = (List) ((AtomicReference) this.b).get();
        il7 il7Var = new il7();
        int size = list.size();
        hl7[] hl7VarArr = new hl7[size];
        for (int i = 0; i < size; i++) {
            b0a b0aVar = (b0a) list.get(i);
            hl7 hl7Var = new hl7();
            try {
                hl7Var.a = b0aVar.a;
                hl7Var.b = b0aVar.b.toString();
                CharSequence charSequence = b0aVar.c;
                String string = charSequence != null ? charSequence.toString() : null;
                String str = "";
                if (string == null) {
                    string = "";
                }
                hl7Var.c = string;
                hl7Var.d = b0aVar.d;
                Object[] objArr = b0aVar.e;
                if (objArr != null) {
                    hl7Var.q = (ll7[]) objArr;
                }
                String str2 = b0aVar.g;
                if (str2 == null) {
                    str2 = "";
                }
                hl7Var.e = str2;
                hl7Var.f = b0aVar.h;
                hl7Var.g = b0aVar.i;
                hl7Var.h = b0aVar.j;
                hl7Var.i = b0aVar.k;
                hl7Var.j = b0aVar.l;
                hl7Var.k = b0aVar.m;
                hl7Var.l = b0aVar.n;
                Long l = b0aVar.o;
                hl7Var.m = l != null ? l.longValue() : -1L;
                String str3 = b0aVar.r;
                if (str3 == null) {
                    str3 = "";
                }
                hl7Var.n = str3;
                byte[] bArr = b0aVar.s;
                if (bArr == null) {
                    bArr = coi.e;
                }
                hl7Var.o = bArr;
                CharSequence charSequence2 = b0aVar.f;
                String string2 = charSequence2 != null ? charSequence2.toString() : null;
                if (string2 != null) {
                    str = string2;
                }
                hl7Var.p = str;
                hl7Var.r = b0aVar.p;
                hl7Var.s = b0aVar.q.toString();
                hl7Var.t = b0aVar.u;
            } catch (Throwable th) {
                wqi.e(b0a.class.getName(), "toProto error", th);
            }
            hl7VarArr[i] = hl7Var;
        }
        il7Var.a = hl7VarArr;
        return il7Var;
    }

    @Override // defpackage.ds4
    public final vy n() {
        return (vy) this.j.getValue();
    }

    @Override // defpackage.ds4
    public final boolean r(byte[] bArr) {
        Object ipdVar;
        Object ipdVar2;
        vc3 vc3VarC;
        lg8 lg8Var = lg8.o;
        File file = new File(iz5.c(((iz5) ((qx5) this.e.getValue())).c), "chats_v1");
        try {
            ipdVar = Boolean.valueOf(file.exists() ? file.delete() : false);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Object obj = Boolean.FALSE;
        if (ipdVar instanceof ipd) {
            ipdVar = obj;
        }
        if (((Boolean) ipdVar).booleanValue()) {
            String strP = p();
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, strP, "prev file " + file + " deleted!", null);
            }
        }
        long jNanoTime = System.nanoTime();
        String strP2 = p();
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, strP2, "loadData start", null);
        }
        jf9 jf9Var = ((df7) this.f.getValue()).f;
        try {
            il7 il7Var = (il7) fl9.mergeFrom(new il7(), bArr);
            int length = il7Var.a.length;
            ArrayList arrayList = new ArrayList(length);
            Object[] objArrCopyOf = length == 0 ? rqa.a : new Object[length];
            hl7[] hl7VarArr = il7Var.a;
            int i = 0;
            int i2 = 0;
            while (i2 < hl7VarArr.length) {
                int i3 = i2 + 1;
                try {
                    b0a b0aVarA = j4j.a(hl7VarArr[i2], new wu7(19, this));
                    arrayList.add(b0aVarA);
                    String str = b0aVarA.r;
                    if (str == null) {
                        i2 = i3;
                    } else {
                        nc0 nc0Var = hxa.a;
                        rf7 rf7VarB = hxa.b(str, kxa.a);
                        int i4 = i + 1;
                        if (objArrCopyOf.length < i4) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i4, (objArrCopyOf.length * 3) / 2));
                        }
                        objArrCopyOf[i] = rf7VarB;
                        kk4 kk4Var = ((df7) this.f.getValue()).h;
                        ml6.i();
                        jp0 jp0VarV = rf7VarB.o != null ? kk4Var.v(rf7VarB, this) : kk4Var.p(rf7VarB, this);
                        byte[] bArr2 = b0aVarA.s;
                        if (bArr2 != null) {
                            ((pp0) this.h.getValue()).getClass();
                            Bitmap bitmapA = pp0.a(bArr2);
                            if (bitmapA != null && xp0.d(bitmapA) != 0 && (vc3VarC = jf9Var.c(jp0VarV, vc3.j0(CloseableStaticBitmap.of(bitmapA, (np0) this.i.getValue(), fh7.d, 0)))) != null) {
                                vc3VarC.close();
                            }
                        }
                        i2 = i3;
                        i = i4;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
            ((AtomicReference) this.b).set(arrayList);
            for (int i5 = 0; i5 < i; i5++) {
                ((df7) this.f.getValue()).e((rf7) objArrCopyOf[i5], this);
            }
            ipdVar2 = Boolean.TRUE;
        } catch (Throwable th2) {
            ipdVar2 = new ipd(th2);
        }
        Throwable thA = kpd.a(ipdVar2);
        if (thA != null) {
            wqi.e(p(), "fail to parse", thA);
        }
        String strP3 = p();
        l6b l6bVar3 = wqi.a;
        if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
            int i6 = s65.d;
            l6bVar3.c(lg8Var, strP3, "loadData finish ".concat(s65.n(v9j.i(System.nanoTime() - jNanoTime, y65.NANOSECONDS))), null);
        }
        Boolean bool = Boolean.FALSE;
        if (ipdVar2 instanceof ipd) {
            ipdVar2 = bool;
        }
        return ((Boolean) ipdVar2).booleanValue();
    }
}
