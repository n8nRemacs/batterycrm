package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Property;
import android.view.Surface;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.startup.StartupException;
import com.facebook.common.file.FileUtils$RenameException;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class hc8 implements ic8, qu6, ru6, gu3, o8e, jw8 {
    public static final y21 X;
    public static final y21 Y;
    public static volatile hc8 Z;
    public static final y21 o;
    public static final Object s0 = new Object();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    static {
        long j = -9223372036854775807L;
        o = new y21(j, 0, 4, false);
        int i = 4;
        boolean z = false;
        X = new y21(j, 2, i, z);
        Y = new y21(j, 3, i, z);
    }

    public /* synthetic */ hc8(int i, boolean z) {
        this.a = i;
    }

    public static hc8 C(aod aodVar) {
        hc8 hc8Var = new hc8(15, false);
        hc8Var.b = aodVar.a;
        hc8Var.c = aodVar.b;
        hc8Var.d = aodVar.c;
        return hc8Var;
    }

    public static hc8 D(Context context) {
        if (Z == null) {
            synchronized (s0) {
                try {
                    if (Z == null) {
                        Z = new hc8(context);
                    }
                } finally {
                }
            }
        }
        return Z;
    }

    public static long J(int i, PushbackInputStream pushbackInputStream) throws IOException {
        int iPow = (int) (Math.pow(2.0d, i) - 1.0d);
        int iL = L(pushbackInputStream) & iPow;
        if (iL < iPow) {
            return iL;
        }
        long j = iL;
        int i2 = 0;
        do {
            j += (r2 & 127) << i2;
            i2 += 7;
        } while ((L(pushbackInputStream) & 128) == 128);
        return j;
    }

    public static byte L(PushbackInputStream pushbackInputStream) throws IOException {
        int i = pushbackInputStream.read();
        if (i != -1) {
            return (byte) i;
        }
        throw new EOFException();
    }

    public static void M(PushbackInputStream pushbackInputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        if (length < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        while (i < length) {
            int i2 = pushbackInputStream.read(bArr, i, length - i);
            if (i2 < 0) {
                break;
            } else {
                i += i2;
            }
        }
        if (i != bArr.length) {
            throw new EOFException();
        }
    }

    public void A(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(e5d.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (ul7.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    B((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    public Object B(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.b;
        if (kfi.f()) {
            try {
                Trace.beginSection(kfi.h(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                ul7 ul7Var = (ul7) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = ul7Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            B(cls2, hashSet);
                        }
                    }
                }
                objB = ul7Var.b((Context) this.d);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public String E(int i) {
        wqi.c("hc8", "getVcfByPhoneContactId: phoneContactId %d", Integer.valueOf(i));
        try {
            String str = (String) nfi.d((Context) this.b, Collections.singletonList(Integer.valueOf(i)), (yi5) this.d).get(i);
            if (!l8g.c(str)) {
                return str;
            }
            wqi.f("hc8", "getVcfByPhoneContactId: vCard is empty for phoneContactId %d", Integer.valueOf(i));
            return null;
        } catch (Exception e) {
            Locale locale = Locale.ENGLISH;
            wqi.e("hc8", "getVcfByPhoneContactId: exception for phoneContactId " + i, e);
            return null;
        }
    }

    public String F(long j, csd csdVar) {
        try {
            if (!((qsb) ((iya) this.c).a.getValue()).c(qsb.f)) {
                wqi.e("hc8", "getVcfByServerPhone: no permissions for contacts", null);
                return null;
            }
            csdVar.getClass();
            ytb ytbVar = (ytb) ue3.I(csdVar.f(Collections.singletonList(Long.valueOf(j))));
            if (ytbVar != null) {
                return E(ytbVar.c);
            }
            Locale locale = Locale.ENGLISH;
            wqi.e("hc8", "getVcfByServerPhone: no phoneDb found with server phone " + j, null);
            return null;
        } catch (Exception e) {
            Locale locale2 = Locale.ENGLISH;
            wqi.e("hc8", "getVcfByServerPhone: exception for server phone " + j, e);
            return null;
        }
    }

    public boolean G() {
        return ((IOException) this.d) != null;
    }

    public void H(qe4 qe4Var, Uri uri, Map map, long j, long j2, foc focVar) throws UnrecognizedInputFormatException {
        fp5[] fp5VarArr;
        mm4 mm4Var = new mm4(qe4Var, j, j2);
        this.d = mm4Var;
        if (((fp5) this.c) != null) {
            return;
        }
        synchronized (((om4) this.b)) {
            try {
                ArrayList arrayList = new ArrayList(14);
                List list = (List) map.get(HTTP.CONTENT_TYPE);
                int iB = jbj.b((list == null || list.isEmpty()) ? null : (String) list.get(0));
                if (iB != -1) {
                    om4.a(arrayList, iB);
                }
                int iC = jbj.c(uri);
                if (iC != -1 && iC != iB) {
                    om4.a(arrayList, iC);
                }
                int[] iArr = om4.a;
                for (int i = 0; i < 14; i++) {
                    int i2 = iArr[i];
                    if (i2 != iB && i2 != iC) {
                        om4.a(arrayList, i2);
                    }
                }
                fp5VarArr = (fp5[]) arrayList.toArray(new fp5[arrayList.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z = true;
        if (fp5VarArr.length == 1) {
            this.c = fp5VarArr[0];
        } else {
            int length = fp5VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                fp5 fp5Var = fp5VarArr[i3];
                try {
                } catch (EOFException unused) {
                    if (((fp5) this.c) != null || mm4Var.d == j) {
                    }
                } catch (Throwable th2) {
                    if (((fp5) this.c) == null && mm4Var.d != j) {
                        z = false;
                    }
                    fsi.d(z);
                    mm4Var.X = 0;
                    throw th2;
                }
                if (fp5Var.h(mm4Var)) {
                    this.c = fp5Var;
                    mm4Var.X = 0;
                    break;
                } else {
                    boolean z2 = ((fp5) this.c) != null || mm4Var.d == j;
                    fsi.d(z2);
                    mm4Var.X = 0;
                    i3++;
                }
            }
            if (((fp5) this.c) == null) {
                int i4 = xxg.a;
                StringBuilder sb = new StringBuilder();
                for (int i5 = 0; i5 < fp5VarArr.length; i5++) {
                    sb.append(fp5VarArr[i5].getClass().getSimpleName());
                    if (i5 < fp5VarArr.length - 1) {
                        sb.append(", ");
                    }
                }
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder(u45.f(58, string));
                sb2.append("None of the available extractors (");
                sb2.append(string);
                sb2.append(") could read the stream.");
                throw new UnrecognizedInputFormatException(sb2.toString(), null, false, 1);
            }
        }
        ((fp5) this.c).g(focVar);
    }

    public boolean I() {
        return ((cc8) this.c) != null;
    }

    public String K(PushbackInputStream pushbackInputStream) throws IOException {
        byte bL = L(pushbackInputStream);
        pushbackInputStream.unread(bL);
        boolean z = (bL & 128) == 128;
        byte[] bArr = new byte[(int) J(7, pushbackInputStream)];
        M(pushbackInputStream, bArr);
        if (!z) {
            return new String(bArr, StandardCharsets.ISO_8859_1);
        }
        ((qa7) this.b).getClass();
        return qa7.b(bArr);
    }

    public void N(fc8 fc8Var) {
        ExecutorService executorService = (ExecutorService) this.b;
        cc8 cc8Var = (cc8) this.c;
        if (cc8Var != null) {
            cc8Var.a(true);
        }
        if (fc8Var != null) {
            executorService.execute(new r98(2, fc8Var));
        }
        executorService.shutdown();
    }

    public long O(dc8 dc8Var, ac8 ac8Var, int i) {
        Looper looperMyLooper = Looper.myLooper();
        fsi.e(looperMyLooper);
        this.d = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        cc8 cc8Var = new cc8(this, looperMyLooper, dc8Var, ac8Var, i, jElapsedRealtime, 0);
        fsi.d(((cc8) this.c) == null);
        this.c = cc8Var;
        cc8Var.d = null;
        ((ExecutorService) this.b).execute(cc8Var);
        return jElapsedRealtime;
    }

    public void P(i00 i00Var) throws IOException {
        File file = (File) this.c;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                x84 x84Var = new x84(fileOutputStream);
                x84Var.a = 0L;
                ce5 ce5Var = (ce5) i00Var.b;
                uv0 uv0Var = (uv0) i00Var.c;
                InputStream inputStreamW = ce5Var.w();
                if (inputStreamW == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                uv0Var.c.a(inputStreamW, x84Var);
                x84Var.flush();
                long j = x84Var.a;
                fileOutputStream.close();
                if (file.length() == j) {
                    return;
                }
                long length = file.length();
                StringBuilder sbL = az1.l(j, "File was not written completely. Expected: ", ", found: ");
                sbL.append(length);
                throw new il4(sbL.toString());
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            qha qhaVar = ((jl4) this.d).d;
            int i = jl4.g;
            qhaVar.getClass();
            throw e;
        }
    }

    @Override // defpackage.ru6
    public synchronized void a() {
        ((ggg) this.c).c0();
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        wqi.e(q05.i, "MsgGetCmd failed", (Throwable) obj);
        ((q05) this.b).c((pb2) this.c, (kfe) this.d);
    }

    @Override // defpackage.ic8
    public void b() throws IOException {
        IOException iOException = (IOException) this.d;
        if (iOException != null) {
            throw iOException;
        }
        cc8 cc8Var = (cc8) this.c;
        if (cc8Var != null) {
            int i = cc8Var.b;
            IOException iOException2 = cc8Var.d;
            if (iOException2 != null && cc8Var.o > i) {
                throw iOException2;
            }
        }
    }

    public void c(int i, String str) {
        r(String.valueOf(i), str);
    }

    @Override // defpackage.jw8
    public void d(long j, int i, int i2, int i3) throws MediaCodec.CryptoException {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.o8e
    public void e(z9g z9gVar, kp5 kp5Var, mjg mjgVar) {
        this.c = z9gVar;
        mjgVar.a();
        mjgVar.b();
        sfg sfgVarMo163B = kp5Var.mo163B(mjgVar.e, 5);
        this.d = sfgVarMo163B;
        sfgVarMo163B.d((hf6) this.b);
    }

    @Override // defpackage.o8e
    public void f(umb umbVar) {
        long jD;
        long j;
        hsi.h((z9g) this.c);
        String str = zxg.a;
        z9g z9gVar = (z9g) this.c;
        synchronized (z9gVar) {
            try {
                long j2 = z9gVar.c;
                jD = j2 != -9223372036854775807L ? j2 + z9gVar.b : z9gVar.d();
            } finally {
            }
        }
        z9g z9gVar2 = (z9g) this.c;
        synchronized (z9gVar2) {
            j = z9gVar2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        hf6 hf6Var = (hf6) this.b;
        if (j != hf6Var.s) {
            ff6 ff6VarA = hf6Var.a();
            ff6VarA.r = j;
            hf6 hf6Var2 = new hf6(ff6VarA);
            this.b = hf6Var2;
            ((sfg) this.d).d(hf6Var2);
        }
        int iA = umbVar.a();
        ((sfg) this.d).b(umbVar, iA, 0);
        ((sfg) this.d).a(jD, 1, iA, 0, null);
    }

    @Override // defpackage.jw8
    public void flush() {
        ((MediaCodec) this.b).flush();
    }

    @Override // defpackage.jw8
    public void g(int i, long j) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.jw8
    public ByteBuffer getInputBuffer(int i) {
        return xxg.a >= 21 ? ((MediaCodec) this.b).getInputBuffer(i) : ((ByteBuffer[]) this.c)[i];
    }

    @Override // defpackage.jw8
    public ByteBuffer getOutputBuffer(int i) {
        return xxg.a >= 21 ? ((MediaCodec) this.b).getOutputBuffer(i) : ((ByteBuffer[]) this.d)[i];
    }

    @Override // defpackage.jw8
    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.b).getOutputFormat();
    }

    @Override // defpackage.jw8
    public int h() {
        return ((MediaCodec) this.b).dequeueInputBuffer(0L);
    }

    @Override // defpackage.jw8
    public int i(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        MediaCodec mediaCodec = (MediaCodec) this.b;
        do {
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && xxg.a < 21) {
                this.d = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.jw8
    public void j(int i) {
        ((MediaCodec) this.b).setVideoScalingMode(i);
    }

    @Override // defpackage.jw8
    public void k(Surface surface) {
        ((MediaCodec) this.b).setOutputSurface(surface);
    }

    @Override // defpackage.jw8
    public void l(int i, za4 za4Var, long j) throws MediaCodec.CryptoException {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) za4Var.i, j, 0);
    }

    @Override // defpackage.qu6
    public synchronized void m() {
        ((ggg) this.c).m();
    }

    @Override // defpackage.jw8
    public void n(hx8 hx8Var, Handler handler) {
        ((MediaCodec) this.b).setOnFrameRenderedListener(new yx(this, hx8Var, 1), handler);
    }

    @Override // defpackage.qu6
    public void o(tu6 tu6Var) {
        ((iy1) this.d).g(new o72(this, 0, tu6Var), true);
    }

    public void p(String str, boolean z) {
        r(String.valueOf(z), str);
    }

    public void q(List list) {
        if (list == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                if (((ArrayList) this.d) == null) {
                    this.d = new ArrayList();
                }
                if (!((ArrayList) this.d).contains(intentFilter)) {
                    ((ArrayList) this.d).add(intentFilter);
                }
            }
        }
    }

    public void r(Object obj, String str) {
        u5i u5iVar = new u5i();
        ((u5i) this.d).c = u5iVar;
        this.d = u5iVar;
        u5iVar.b = obj;
        u5iVar.a = str;
    }

    @Override // defpackage.jw8
    public void release() {
        this.c = null;
        this.d = null;
        ((MediaCodec) this.b).release();
    }

    @Override // defpackage.jw8
    public void releaseOutputBuffer(int i, boolean z) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, z);
    }

    public void s() {
        odh odhVar = (odh) this.b;
        ObjectAnimator objectAnimator = (ObjectAnimator) this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (odhVar.getAlpha() < 1.0f) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(odhVar, (Property<odh, Float>) View.ALPHA, odhVar.getAlpha(), 1.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator((AccelerateDecelerateInterpolator) this.d);
            objectAnimatorOfFloat.start();
            this.c = objectAnimatorOfFloat;
        }
    }

    @Override // defpackage.jw8
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    public sa0 t() {
        String strI = ((fc0) this.b) == null ? " videoSpec" : "";
        if (((g90) this.c) == null) {
            strI = strI.concat(" audioSpec");
        }
        if (((Integer) this.d) == null) {
            strI = az1.i(strI, " outputFormat");
        }
        if (strI.isEmpty()) {
            return new sa0((fc0) this.b, (g90) this.c, ((Integer) this.d).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public String toString() {
        switch (this.a) {
            case 13:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                u5i u5iVar = (u5i) ((u5i) this.c).c;
                String str = "";
                while (u5iVar != null) {
                    Object obj = u5iVar.b;
                    sb.append(str);
                    String str2 = (String) u5iVar.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    u5iVar = (u5i) u5iVar.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public nt1 u() {
        Objects.requireNonNull((ti1) this.b);
        Objects.requireNonNull((cdh) this.c);
        return new nt1(this);
    }

    public h59 v() {
        Bundle bundle = (Bundle) this.b;
        ArrayList<? extends Parcelable> arrayList = (ArrayList) this.d;
        if (arrayList != null) {
            bundle.putParcelableArrayList("controlFilters", arrayList);
        }
        ArrayList<String> arrayList2 = (ArrayList) this.c;
        if (arrayList2 != null) {
            bundle.putStringArrayList("groupMemberIds", arrayList2);
        }
        return new h59(bundle);
    }

    @Override // defpackage.ru6
    public synchronized void w(tu6 tu6Var, long j) {
        ((ggg) this.c).a0(tu6Var, j);
    }

    public void x() {
        cc8 cc8Var = (cc8) this.c;
        fsi.e(cc8Var);
        cc8Var.a(false);
    }

    @Override // defpackage.qu6
    public synchronized void y() {
        ((ggg) this.c).y();
        iy1 iy1Var = (iy1) this.d;
        su6 su6Var = (su6) this.b;
        Objects.requireNonNull(su6Var);
        iy1Var.g(new p72(su6Var, 0), true);
    }

    public mv5 z() throws FileUtils$RenameException {
        jl4 jl4Var = (jl4) this.d;
        jl4Var.e.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File fileH = jl4Var.h((String) this.b);
        try {
            obj.b((File) this.c, fileH);
            if (fileH.exists()) {
                fileH.setLastModified(jCurrentTimeMillis);
            }
            return new mv5(fileH);
        } catch (FileUtils$RenameException e) {
            e.getCause();
            qha qhaVar = jl4Var.d;
            int i = jl4.g;
            qhaVar.getClass();
            throw e;
        }
    }

    public /* synthetic */ hc8(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public hc8(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.c = new aqc(7);
                this.b = new qa7();
                this.d = new ArrayList();
                break;
            case 19:
                List list = Collections.EMPTY_LIST;
                this.b = list;
                this.c = list;
                break;
            default:
                this.c = cdh.a;
                break;
        }
    }

    public hc8(odh odhVar) {
        this.a = 10;
        this.b = odhVar;
        this.d = new AccelerateDecelerateInterpolator();
    }

    public hc8(String str, aa7 aa7Var) {
        this.a = 11;
        this.b = HttpPost.METHOD_NAME;
        this.c = str;
        this.d = aa7Var;
    }

    public hc8(Context context, String str) {
        this.a = 18;
        this.b = context;
        this.c = str;
        this.d = new bwf(new m2(15, this));
    }

    public hc8(om4 om4Var) {
        this.a = 4;
        this.b = om4Var;
    }

    public hc8(xo8 xo8Var, su6 su6Var, su6 su6Var2, iy1 iy1Var) {
        this.a = 6;
        hsi.a("Creating a self loop in the chain: " + su6Var, su6Var != su6Var2);
        this.b = su6Var;
        this.c = new ggg(xo8Var, su6Var2, iy1Var);
        this.d = iy1Var;
    }

    public hc8(Context context) {
        this.a = 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public hc8(MediaCodec mediaCodec) {
        this.a = 17;
        this.b = mediaCodec;
        if (xxg.a < 21) {
            this.c = mediaCodec.getInputBuffers();
            this.d = mediaCodec.getOutputBuffers();
        }
    }

    public hc8(String str, int i) {
        this.a = i;
        switch (i) {
            case 13:
                u5i u5iVar = new u5i();
                this.c = u5iVar;
                this.d = u5iVar;
                this.b = str;
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ff6 ff6Var = new ff6();
                ff6Var.l = xz9.n("video/mp2t");
                ff6Var.m = xz9.n(str);
                this.b = new hf6(ff6Var);
                break;
            default:
                String strConcat = str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:");
                int i2 = xxg.a;
                this.b = Executors.newSingleThreadExecutor(new nn3(1, strConcat));
                break;
        }
    }

    public hc8(String str, String str2) {
        this.a = 12;
        Bundle bundle = new Bundle();
        this.b = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString(SdkMetricStatEvent.NAME_KEY, str2);
                return;
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("id must not be null");
    }

    public hc8(jl4 jl4Var, String str, File file) {
        this.a = 8;
        this.d = jl4Var;
        this.b = str;
        this.c = file;
    }
}
