package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.net.ProtocolException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import org.apache.http.HttpStatus;
import ru.ok.android.onelog.impl.BuildConfig;
import tech.kwik.flupke.core.HttpError;
import tech.kwik.flupke.impl.NotYetImplementedException;
import tech.kwik.qpack.impl.HttpQPackDecompressionFailedException;

/* loaded from: classes3.dex */
public final class y87 implements w87, z87 {
    public final /* synthetic */ int b;
    public final Object c;
    public final Object d;
    public boolean e;
    public final Object f;
    public Object g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public Object m;
    public Object n;

    public y87(y6d y6dVar, enb enbVar, em6 em6Var, em6 em6Var2, pz0 pz0Var, y8g y8gVar) {
        this.b = 4;
        this.f = y6dVar;
        this.g = enbVar;
        this.h = em6Var;
        this.d = em6Var2;
        this.i = pz0Var;
        this.j = y8gVar;
        this.k = new Handler(Looper.getMainLooper());
        this.l = new LinkedHashSet();
        this.c = new HashMap();
        this.n = new lcf(this);
    }

    public static byte[] o(InputStream inputStream, int i) throws EOFException {
        byte[] bArr = new byte[i];
        int iE = mw0.e(inputStream, bArr, i);
        if (iE < i) {
            byte[] bArr2 = new byte[iE];
            System.arraycopy(bArr, 0, bArr2, 0, iE);
            bArr = bArr2;
        }
        if (bArr.length == i) {
            return bArr;
        }
        throw new EOFException("Stream closed by peer");
    }

    public r9g a(int i, ArrayList arrayList, gze gzeVar) {
        ArrayList arrayList2 = (ArrayList) this.g;
        if (!arrayList.isEmpty()) {
            this.m = gzeVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                y99 y99Var = (y99) arrayList.get(i2 - i);
                if (i2 > 0) {
                    y99 y99Var2 = (y99) arrayList2.get(i2 - 1);
                    y99Var.d = y99Var2.a.o.b.o() + y99Var2.d;
                    y99Var.e = false;
                    y99Var.c.clear();
                } else {
                    y99Var.d = 0;
                    y99Var.e = false;
                    y99Var.c.clear();
                }
                int iO = y99Var.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((y99) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, y99Var);
                ((HashMap) this.c).put(y99Var.b, y99Var);
                if (this.e) {
                    m(y99Var);
                    if (((IdentityHashMap) this.h).isEmpty()) {
                        ((HashSet) this.l).add(y99Var);
                    } else {
                        w99 w99Var = (w99) ((HashMap) this.d).get(y99Var);
                        if (w99Var != null) {
                            w99Var.a.b(w99Var.b);
                        }
                    }
                }
            }
        }
        return f();
    }

    public s9g b(int i, ArrayList arrayList, hze hzeVar) {
        ArrayList arrayList2 = (ArrayList) this.g;
        if (!arrayList.isEmpty()) {
            this.m = hzeVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                z99 z99Var = (z99) arrayList.get(i2 - i);
                if (i2 > 0) {
                    z99 z99Var2 = (z99) arrayList2.get(i2 - 1);
                    z99Var.d = z99Var2.a.o.e.o() + z99Var2.d;
                    z99Var.e = false;
                    z99Var.c.clear();
                } else {
                    z99Var.d = 0;
                    z99Var.e = false;
                    z99Var.c.clear();
                }
                int iO = z99Var.a.o.e.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((z99) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, z99Var);
                ((HashMap) this.c).put(z99Var.b, z99Var);
                if (this.e) {
                    n(z99Var);
                    if (((IdentityHashMap) this.h).isEmpty()) {
                        ((HashSet) this.j).add(z99Var);
                    } else {
                        x99 x99Var = (x99) ((HashMap) this.d).get(z99Var);
                        if (x99Var != null) {
                            x99Var.a.d(x99Var.b);
                        }
                    }
                }
            }
        }
        return g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public void c(xse xseVar, float f, RectF rectF, mc5 mc5Var, Path path) {
        boolean z;
        int i;
        Path path2;
        mc5 mc5Var2;
        boolean z2;
        int i2;
        mc5 mc5Var3 = mc5Var;
        Path path3 = path;
        Matrix[] matrixArr = (Matrix[]) this.h;
        float[] fArr = (float[]) this.k;
        gte[] gteVarArr = (gte[]) this.f;
        Matrix[] matrixArr2 = (Matrix[]) this.g;
        path3.rewind();
        Path path4 = (Path) this.d;
        path4.rewind();
        Path path5 = (Path) this.i;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            z = 0;
            if (i3 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.c;
            t74 t74Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? xseVar.f : xseVar.e : xseVar.h : xseVar.g;
            l6j l6jVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? xseVar.b : xseVar.a : xseVar.d : xseVar.c;
            Matrix[] matrixArr3 = matrixArr;
            gte gteVar = gteVarArr[i3];
            l6jVar.getClass();
            l6jVar.a(gteVar, f, t74Var.a(rectF));
            int i4 = i3 + 1;
            float f2 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            if (i3 == 1) {
                i2 = i4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i4;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f2);
            gte gteVar2 = gteVarArr[i3];
            fArr[0] = gteVar2.c;
            fArr[1] = gteVar2.d;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr3[i3].reset();
            matrixArr3[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i3].preRotate(f2);
            i3 = i2;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        char c = 1;
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            gte gteVar3 = gteVarArr[i5];
            fArr[z] = gteVar3.a;
            fArr[c] = gteVar3.b;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path3.moveTo(fArr[z], fArr[c]);
            } else {
                path3.lineTo(fArr[z], fArr[c]);
            }
            gteVarArr[i5].b(matrixArr2[i5], path3);
            if (mc5Var3 != null) {
                gte gteVar4 = gteVarArr[i5];
                Matrix matrix = matrixArr2[i5];
                wq8 wq8Var = (wq8) mc5Var3.b;
                BitSet bitSet = wq8Var.d;
                gteVar4.getClass();
                bitSet.set(i5, z);
                fte[] fteVarArr = wq8Var.b;
                gteVar4.a(gteVar4.f);
                fteVarArr[i5] = new zse(new ArrayList(gteVar4.h), new Matrix(matrix));
            }
            Path path6 = (Path) this.m;
            gte gteVar5 = (gte) this.j;
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            gte gteVar6 = gteVarArr[i5];
            gte[] gteVarArr2 = gteVarArr;
            fArr[0] = gteVar6.c;
            fArr[1] = gteVar6.d;
            matrixArr2[i5].mapPoints(fArr);
            float[] fArr2 = (float[]) this.l;
            gte gteVar7 = gteVarArr2[i7];
            Matrix[] matrixArr5 = matrixArr2;
            fArr2[0] = gteVar7.a;
            fArr2[1] = gteVar7.b;
            matrixArr5[i7].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            gte gteVar8 = gteVarArr2[i5];
            fArr[0] = gteVar8.c;
            fArr[1] = gteVar8.d;
            matrixArr5[i5].mapPoints(fArr);
            float fAbs = (i5 == 1 || i5 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            gteVar5.d(0.0f, 0.0f, 270.0f, 0.0f);
            q85 q85Var = i5 != 1 ? i5 != 2 ? i5 != 3 ? xseVar.j : xseVar.i : xseVar.l : xseVar.k;
            q85Var.p(fMax, fAbs, f, gteVar5);
            path6.reset();
            gteVar5.b(matrixArr4[i5], path6);
            if (this.e && (q85Var.o() || l(path6, i5) || l(path6, i7))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr[0] = gteVar5.a;
                c = 1;
                fArr[1] = gteVar5.b;
                matrixArr4[i5].mapPoints(fArr);
                path4.moveTo(fArr[0], fArr[1]);
                gteVar5.b(matrixArr4[i5], path4);
                path2 = path;
            } else {
                c = 1;
                path2 = path;
                gteVar5.b(matrixArr4[i5], path2);
            }
            if (mc5Var != null) {
                Matrix matrix2 = matrixArr4[i5];
                mc5Var2 = mc5Var;
                wq8 wq8Var2 = (wq8) mc5Var2.b;
                z2 = false;
                wq8Var2.d.set(i5 + 4, false);
                fte[] fteVarArr2 = wq8Var2.c;
                gteVar5.a(gteVar5.f);
                fteVarArr2[i5] = new zse(new ArrayList(gteVar5.h), new Matrix(matrix2));
            } else {
                mc5Var2 = mc5Var;
                z2 = false;
            }
            path3 = path2;
            mc5Var3 = mc5Var2;
            i5 = i6;
            z = z2;
            gteVarArr = gteVarArr2;
            matrixArr2 = matrixArr5;
        }
        Path path7 = path3;
        path7.close();
        path4.close();
        if (path4.isEmpty()) {
            return;
        }
        path7.op(path4, Path.Op.UNION);
    }

    public void d() {
        synchronized (this) {
            try {
                if (((ysc) this.f).A0 != 3) {
                    ((ysc) this.f).b();
                }
                if (!this.e) {
                    try {
                        nlf nlfVar = ((ysc) this.f).c(false).f;
                        nlfVar.write(0);
                        sne sneVar = new sne();
                        sneVar.b.putAll((HashMap) this.d);
                        ByteBuffer byteBufferI = sneVar.i();
                        nlfVar.write(byteBufferI.array(), 0, byteBufferI.limit());
                    } catch (IOException unused) {
                        e(260L);
                    }
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(long j) {
        ysc yscVar = (ysc) this.f;
        yscVar.f(j, null, 2);
        yscVar.L0.k();
    }

    public r9g f() {
        ArrayList arrayList = (ArrayList) this.g;
        if (arrayList.isEmpty()) {
            return r9g.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            y99 y99Var = (y99) arrayList.get(i);
            y99Var.d = iO;
            iO += y99Var.a.o.b.o();
        }
        return new g5c(arrayList, (gze) this.m);
    }

    public s9g g() {
        ArrayList arrayList = (ArrayList) this.g;
        if (arrayList.isEmpty()) {
            return s9g.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            z99 z99Var = (z99) arrayList.get(i);
            z99Var.d = iO;
            iO += z99Var.a.o.e.o();
        }
        return new h5c(arrayList, (hze) this.m);
    }

    public void h() {
        switch (this.b) {
            case 1:
                Iterator it = ((HashSet) this.l).iterator();
                while (it.hasNext()) {
                    y99 y99Var = (y99) it.next();
                    if (y99Var.c.isEmpty()) {
                        w99 w99Var = (w99) ((HashMap) this.d).get(y99Var);
                        if (w99Var != null) {
                            w99Var.a.b(w99Var.b);
                        }
                        it.remove();
                    }
                }
                break;
            default:
                Iterator it2 = ((HashSet) this.j).iterator();
                while (it2.hasNext()) {
                    z99 z99Var = (z99) it2.next();
                    if (z99Var.c.isEmpty()) {
                        x99 x99Var = (x99) ((HashMap) this.d).get(z99Var);
                        if (x99Var != null) {
                            x99Var.a.d(x99Var.b);
                        }
                        it2.remove();
                    }
                }
                break;
        }
    }

    public Optional i(long j) throws InterruptedException {
        try {
            ((CountDownLatch) this.k).await(10L, TimeUnit.SECONDS);
            return Optional.ofNullable((Long) ((HashMap) this.i).get(Long.valueOf(j)));
        } catch (InterruptedException unused) {
            return Optional.empty();
        }
    }

    public void j(y99 y99Var) {
        if (y99Var.e && y99Var.c.isEmpty()) {
            w99 w99Var = (w99) ((HashMap) this.d).remove(y99Var);
            w99Var.getClass();
            k5i k5iVar = w99Var.c;
            bk0 bk0Var = w99Var.a;
            bk0Var.l(w99Var.b);
            bk0Var.o(k5iVar);
            bk0Var.n(k5iVar);
            ((HashSet) this.l).remove(y99Var);
        }
    }

    public void k(z99 z99Var) {
        if (z99Var.e && z99Var.c.isEmpty()) {
            x99 x99Var = (x99) ((HashMap) this.d).remove(z99Var);
            x99Var.getClass();
            v99 v99Var = x99Var.c;
            ck0 ck0Var = x99Var.a;
            ck0Var.p(x99Var.b);
            ck0Var.s(v99Var);
            ck0Var.r(v99Var);
            ((HashSet) this.j).remove(z99Var);
        }
    }

    public boolean l(Path path, int i) {
        Path path2 = (Path) this.n;
        path2.reset();
        ((gte[]) this.f)[i].b(((Matrix[]) this.g)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [e99, q99] */
    public void m(y99 y99Var) {
        up8 up8Var = y99Var.a;
        ?? r1 = new e99() { // from class: q99
            @Override // defpackage.e99
            public final void a(bk0 bk0Var, r9g r9gVar) {
                ((rm5) this.a.i).Z.c(22);
            }
        };
        k5i k5iVar = new k5i(this, y99Var);
        ((HashMap) this.d).put(y99Var, new w99(up8Var, r1, k5iVar));
        int i = xxg.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        up8Var.getClass();
        qr4 qr4Var = up8Var.c;
        qr4Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) qr4Var.d;
        k99 k99Var = new k99();
        k99Var.a = handler;
        k99Var.b = k5iVar;
        copyOnWriteArrayList.add(k99Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        lk6 lk6Var = up8Var.d;
        lk6Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) lk6Var.d;
        b55 b55Var = new b55();
        b55Var.a = k5iVar;
        copyOnWriteArrayList2.add(b55Var);
        up8Var.h(r1, (vgg) this.n, (m4c) this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [f99, r99] */
    public void n(z99 z99Var) {
        vp8 vp8Var = z99Var.a;
        ?? r1 = new f99() { // from class: r99
            @Override // defpackage.f99
            public final void a(ck0 ck0Var, s9g s9gVar) {
                wwf wwfVar = ((sm5) this.a.i).Z;
                wwfVar.e(2);
                wwfVar.f(22);
            }
        };
        v99 v99Var = new v99(this, z99Var);
        ((HashMap) this.d).put(z99Var, new x99(vp8Var, r1, v99Var));
        Handler handlerO = zxg.o(null);
        vp8Var.getClass();
        lk6 lk6Var = vp8Var.c;
        lk6Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) lk6Var.d;
        l99 l99Var = new l99();
        l99Var.a = handlerO;
        l99Var.b = v99Var;
        copyOnWriteArrayList.add(l99Var);
        Handler handlerO2 = zxg.o(null);
        d55 d55Var = vp8Var.d;
        d55Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = d55Var.c;
        c55 c55Var = new c55();
        c55Var.a = handlerO2;
        c55Var.b = v99Var;
        copyOnWriteArrayList2.add(c55Var);
        vp8Var.l(r1, (wgg) this.n, (n4c) this.f);
    }

    public tei p(elf elfVar) throws IOException, HttpError {
        String str;
        Map.Entry simpleEntry;
        String str2;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(elfVar, 1);
        int i = pushbackInputStream.read();
        if (i == -1) {
            return null;
        }
        pushbackInputStream.unread(i);
        long jH = epi.h(pushbackInputStream);
        int iE = epi.e(pushbackInputStream);
        int i2 = (int) jH;
        if (i2 == 0) {
            if (iE > BuildConfig.MAX_TIME_TO_UPLOAD) {
                throw new HttpError("max data size exceeded", HttpStatus.SC_BAD_REQUEST);
            }
            ge4 ge4Var = new ge4();
            ge4Var.b = ByteBuffer.allocate(0);
            ge4Var.b = ByteBuffer.wrap(o(pushbackInputStream, iE));
            return ge4Var;
        }
        if (i2 != 1) {
            if (i2 != 3) {
                if (i2 == 4) {
                    sne sneVar = new sne();
                    sneVar.j(ByteBuffer.wrap(o(pushbackInputStream, iE)));
                    return sneVar;
                }
                if (i2 != 5 && i2 != 7 && i2 != 13) {
                    pushbackInputStream.skip(iE);
                    return new prg();
                }
            }
            throw new NotYetImplementedException(a9h.d(jH, "Frame type ", " not yet implemented"));
        }
        if (iE > BuildConfig.MAX_TIME_TO_UPLOAD) {
            throw new HttpError("max header size exceeded", HttpStatus.SC_REQUEST_URI_TOO_LONG);
        }
        final n17 n17Var = new n17();
        n17Var.b = new HashMap();
        wha.q(Collections.EMPTY_MAP, new l17(1));
        byte[] bArrO = o(pushbackInputStream, iE);
        hc8 hc8Var = (hc8) this.j;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrO);
        aqc aqcVar = (aqc) hc8Var.c;
        PushbackInputStream pushbackInputStream2 = new PushbackInputStream(byteArrayInputStream, 16);
        ArrayList arrayList = new ArrayList();
        hc8.J(8, pushbackInputStream2);
        hc8.J(7, pushbackInputStream2);
        int i3 = pushbackInputStream2.read();
        pushbackInputStream2.unread(i3);
        while (i3 >= 0) {
            if ((i3 & 128) == 128) {
                byte bL = hc8.L(pushbackInputStream2);
                pushbackInputStream2.unread(bL);
                boolean z = (bL & 64) == 64;
                int iJ = (int) hc8.J(6, pushbackInputStream2);
                if (z) {
                    String[] strArr = (String[]) aqcVar.b;
                    if (strArr[iJ] == null) {
                        throw new HttpQPackDecompressionFailedException();
                    }
                    simpleEntry = new AbstractMap.SimpleImmutableEntry(strArr[iJ], ((String[]) aqcVar.c)[iJ]);
                } else {
                    ArrayList arrayList2 = (ArrayList) hc8Var.d;
                    simpleEntry = iJ < arrayList2.size() ? (Map.Entry) arrayList2.get(iJ) : null;
                }
            } else if ((i3 & 192) == 64) {
                byte bL2 = hc8.L(pushbackInputStream2);
                pushbackInputStream2.unread(bL2);
                boolean z2 = (bL2 & 16) == 16;
                int iJ2 = (int) hc8.J(4, pushbackInputStream2);
                if (!z2) {
                    throw new tech.kwik.qpack.impl.NotYetImplementedException("non static ref in parseLiteralHeaderFieldWithNameReference");
                }
                if (z2) {
                    str2 = ((String[]) aqcVar.b)[iJ2];
                    if (str2 == null) {
                        throw new HttpQPackDecompressionFailedException();
                    }
                } else {
                    str2 = "<tbd>";
                }
                simpleEntry = new AbstractMap.SimpleEntry(str2, hc8Var.K(pushbackInputStream2));
            } else {
                if ((i3 & 224) != 32) {
                    throw new tech.kwik.qpack.impl.NotYetImplementedException(ho7.f(i3, "Error: unknown instruction: "));
                }
                byte bL3 = hc8.L(pushbackInputStream2);
                pushbackInputStream2.unread(bL3);
                boolean z3 = (bL3 & 8) == 8;
                byte[] bArr = new byte[(int) hc8.J(3, pushbackInputStream2)];
                hc8.M(pushbackInputStream2, bArr);
                if (z3) {
                    ((qa7) hc8Var.b).getClass();
                    str = qa7.b(bArr);
                } else {
                    str = new String(bArr, StandardCharsets.ISO_8859_1);
                }
                simpleEntry = new AbstractMap.SimpleEntry(str, hc8Var.K(pushbackInputStream2));
            }
            if (simpleEntry != null) {
                arrayList.add(simpleEntry);
            }
            i3 = pushbackInputStream2.read();
            pushbackInputStream2.unread(i3);
        }
        Map map = (Map) arrayList.stream().collect(Collectors.toMap(new m0(23), new ni(15, n17Var), new BinaryOperator() { // from class: k17
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                n17Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll((List) obj);
                arrayList3.addAll((List) obj2);
                return arrayList3;
            }
        }));
        map.entrySet().stream().filter(new gb3(19)).forEach(new m4(9, n17Var));
        wha.q(map, new l17(0));
        return n17Var;
    }

    public void q(o9i o9iVar) {
        Handler handler = (Handler) this.k;
        if (!fni.a(handler.getLooper().getThread(), Thread.currentThread())) {
            handler.post(new icf(this, o9iVar, 0));
        } else {
            if (this.e) {
                return;
            }
            ((LinkedHashSet) this.l).add(o9iVar);
        }
    }

    public void r(o29 o29Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.h;
        y99 y99Var = (y99) identityHashMap.remove(o29Var);
        y99Var.getClass();
        y99Var.a.k(o29Var);
        y99Var.c.remove(((op8) o29Var).a);
        if (!identityHashMap.isEmpty()) {
            h();
        }
        j(y99Var);
    }

    public void s(p29 p29Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.h;
        z99 z99Var = (z99) identityHashMap.remove(p29Var);
        z99Var.getClass();
        z99Var.a.o(p29Var);
        z99Var.c.remove(((pp8) p29Var).a);
        if (!identityHashMap.isEmpty()) {
            h();
        }
        k(z99Var);
    }

    public void t(int i, int i2) {
        switch (this.b) {
            case 1:
                ArrayList arrayList = (ArrayList) this.g;
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    y99 y99Var = (y99) arrayList.remove(i3);
                    ((HashMap) this.c).remove(y99Var.b);
                    int i4 = -y99Var.a.o.b.o();
                    for (int i5 = i3; i5 < arrayList.size(); i5++) {
                        ((y99) arrayList.get(i5)).d += i4;
                    }
                    y99Var.e = true;
                    if (this.e) {
                        j(y99Var);
                    }
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) this.g;
                for (int i6 = i2 - 1; i6 >= i; i6--) {
                    z99 z99Var = (z99) arrayList2.remove(i6);
                    ((HashMap) this.c).remove(z99Var.b);
                    int i7 = -z99Var.a.o.e.o();
                    for (int i8 = i6; i8 < arrayList2.size(); i8++) {
                        ((z99) arrayList2.get(i8)).d += i7;
                    }
                    z99Var.e = true;
                    if (this.e) {
                        k(z99Var);
                    }
                }
                break;
        }
    }

    public d97 u(kce kceVar, Duration duration) throws gn8, IOException, NumberFormatException, HttpError {
        if (!((CountDownLatch) this.k).await(duration.toMillis(), TimeUnit.MILLISECONDS)) {
            throw new HttpError("No SETTINGS frame received in time.");
        }
        if (((Long) i(8L).orElse(0L)).longValue() != 1) {
            throw new HttpError("Server does not support Extended Connect (RFC 9220).");
        }
        URI uri = (URI) kceVar.b;
        HashMap map = new HashMap();
        int port = uri.getPort();
        if (port <= 0) {
            port = 443;
        }
        String strE = xc0.e(port, uri.getHost(), ":");
        String path = uri.getPath();
        int length = path.length();
        int i = 0;
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                path = "/";
                break;
            }
            int iCodePointAt = path.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        if (uri.getQuery() != null && !uri.getQuery().isEmpty()) {
            path = u45.k(path, "?", uri.getQuery());
        }
        int i2 = 1;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(":authority", strE), new AbstractMap.SimpleEntry(":method", "CONNECT"), new AbstractMap.SimpleEntry(":protocol", "webtransport"), new AbstractMap.SimpleEntry(":scheme", "https"), new AbstractMap.SimpleEntry(":path", path)};
        HashMap map2 = new HashMap(5);
        for (int i3 = 0; i3 < 5; i3++) {
            Map.Entry entry = entryArr[i3];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map2.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map2);
        if (mapUnmodifiableMap.keySet().stream().anyMatch(new gb3(18))) {
            throw new IllegalArgumentException("Pseudo headers must start with ':'");
        }
        ctc ctcVarC = ((ysc) this.f).c(true);
        nlf nlfVar = ctcVarC.f;
        af5 af5Var = (af5) this.m;
        ArrayList arrayList = new ArrayList();
        mapUnmodifiableMap.entrySet().forEach(new m17(arrayList, i2));
        map.entrySet().forEach(new m17(arrayList, i));
        af5Var.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(arrayList.stream().mapToInt(new n0(10)).sum() + 10);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 0);
        arrayList.forEach(new oe5(af5Var, i, byteBufferAllocate));
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
        epi.b(byteBufferAllocate.limit(), byteBufferAllocate2);
        byte[] bArr = new byte[byteBufferAllocate.limit() + byteBufferAllocate2.limit() + 1];
        bArr[0] = 1;
        byteBufferAllocate2.get(bArr, 1, byteBufferAllocate2.limit());
        byteBufferAllocate.get(bArr, byteBufferAllocate2.limit() + 1, byteBufferAllocate.limit());
        nlfVar.write(bArr);
        tei teiVarP = p(ctcVarC.e);
        if (!(teiVarP instanceof n17)) {
            if (teiVarP != null) {
                throw new ProtocolException("Expected headers frame, got ".concat(teiVarP.getClass().getSimpleName()));
            }
            throw new ProtocolException("Got empty response from server");
        }
        try {
            n17 n17Var = (n17) teiVarP;
            n17Var.getClass();
            String str = (String) n17Var.b.get(":status");
            if (str != null) {
                try {
                    Integer.parseInt(str);
                    int i4 = Integer.parseInt(str);
                    if (i4 < 200 || i4 >= 300) {
                        throw new HttpError("CONNECT request failed", i4);
                    }
                    return new d97(this, ctcVarC);
                } catch (NumberFormatException unused) {
                }
            }
            throw new gn8();
        } catch (gn8 unused2) {
            throw new ProtocolException("Malformed response from server: missing status code");
        }
    }

    public y87() {
        this.b = 3;
        this.f = new gte[4];
        this.g = new Matrix[4];
        this.h = new Matrix[4];
        this.c = new PointF();
        this.d = new Path();
        this.i = new Path();
        this.j = new gte();
        this.k = new float[2];
        this.l = new float[2];
        this.m = new Path();
        this.n = new Path();
        this.e = true;
        for (int i = 0; i < 4; i++) {
            ((gte[]) this.f)[i] = new gte();
            ((Matrix[]) this.g)[i] = new Matrix();
            ((Matrix[]) this.h)[i] = new Matrix();
        }
    }

    public y87(rm5 rm5Var, mj4 mj4Var, Handler handler, m4c m4cVar) {
        this.b = 1;
        this.f = m4cVar;
        this.i = rm5Var;
        this.m = new gze();
        this.h = new IdentityHashMap();
        this.c = new HashMap();
        this.g = new ArrayList();
        qr4 qr4Var = new qr4(1);
        this.j = qr4Var;
        lk6 lk6Var = new lk6(10, (byte) 0);
        this.k = lk6Var;
        this.d = new HashMap();
        this.l = new HashSet();
        mj4Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) qr4Var.d;
        k99 k99Var = new k99();
        k99Var.a = handler;
        k99Var.b = mj4Var;
        copyOnWriteArrayList.add(k99Var);
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) lk6Var.d;
        b55 b55Var = new b55();
        b55Var.a = mj4Var;
        copyOnWriteArrayList2.add(b55Var);
    }

    public y87(sm5 sm5Var, nj4 nj4Var, wwf wwfVar, n4c n4cVar) {
        this.b = 2;
        this.f = n4cVar;
        this.i = sm5Var;
        this.m = new hze();
        this.h = new IdentityHashMap();
        this.c = new HashMap();
        this.g = new ArrayList();
        this.k = nj4Var;
        this.l = wwfVar;
        this.d = new HashMap();
        this.j = new HashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y87(java.lang.String r18, int r19, java.time.Duration r20, defpackage.v87 r21, defpackage.kk4 r22, ru.ok.android.externcalls.sdk.wt.WTSignaling$Builder$build$logger$1 r23) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y87.<init>(java.lang.String, int, java.time.Duration, v87, kk4, ru.ok.android.externcalls.sdk.wt.WTSignaling$Builder$build$logger$1):void");
    }
}
