package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.Range;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.media3.database.DatabaseIOException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EncodedImage;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFallback;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* loaded from: classes.dex */
public final class py0 implements iw8, grf, rn6, xmb, bs8, qp5, VideoDecoder {
    public static final String[] d = {SdkMetricStatEvent.NAME_KEY, "length", "last_touch_timestamp"};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ py0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static boolean H(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            op5.n("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        op5.n("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    public HashMap A() throws DatabaseIOException {
        try {
            ((String) this.c).getClass();
            Cursor cursorQuery = ((df4) this.b).getReadableDatabase().query((String) this.c, d, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new oy0(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public LinkedHashSet B() {
        LinkedHashSet linkedHashSet;
        synchronized (this.b) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.c).values());
        }
        return linkedHashSet;
    }

    public Integer C(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2 != null && bigInteger != null) {
            BigInteger bigInteger3 = (BigInteger) this.b;
            BigInteger bigInteger4 = (BigInteger) this.c;
            this.b = bigInteger;
            this.c = bigInteger2;
            if (bigInteger3 != null && bigInteger4 != null) {
                if (bigInteger3.compareTo(bigInteger) > 0 || bigInteger4.compareTo(bigInteger2) > 0) {
                    this.b = null;
                    this.c = null;
                } else {
                    BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger3);
                    BigInteger bigIntegerSubtract2 = bigInteger2.subtract(bigInteger4);
                    if (bigIntegerSubtract.compareTo(BigInteger.ZERO) > 0) {
                        return Integer.valueOf(n7j.d((int) ((bigIntegerSubtract2.floatValue() * 100) / bigIntegerSubtract.floatValue()), new to7(0, 100, 1)));
                    }
                }
            }
        }
        return null;
    }

    public synchronized Map D() {
        try {
            if (((Map) this.c) == null) {
                this.c = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.c;
    }

    public void E(JSONObject jSONObject) {
        fj7 fj7Var;
        lt2 lt2Var = (lt2) this.c;
        try {
            fj7Var = new fj7(paj.v(jSONObject), jSONObject.getString("message"), jSONObject.getBoolean("direct"));
        } catch (JSONException e) {
            lt2Var.a.logException("ChatParser", "Can't parse chat message", e);
            fj7Var = null;
        }
        if (fj7Var == null) {
            return;
        }
        ((jj2) this.b).onNewMessage(fj7Var);
    }

    public void F(wm2 wm2Var) {
        synchronized (this.b) {
            try {
                wm2Var.getClass();
                for (String str : new LinkedHashSet((ArrayList) wm2Var.g)) {
                    gri.a("CameraRepository", "Added camera: " + str);
                    ((LinkedHashMap) this.c).put(str, wm2Var.g(str));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }

    public void G(long j) throws DatabaseIOException {
        df4 df4Var = (df4) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.c = "ExoPlayerCacheFileMetadata" + hexString;
            if (c0h.a(df4Var.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = df4Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    c0h.b(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.c));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public g0f I(JSONObject jSONObject, fje fjeVar) {
        xo8 xo8Var;
        try {
            jSONObject.optBoolean("markerFound");
            jSONObject.optInt("countBefore");
            jSONObject.optInt("countAfter");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("participants");
            if (jSONArrayOptJSONArray != null) {
                xo8Var = ((ywf) this.c).r(jSONArrayOptJSONArray, fjeVar);
            } else {
                hd5 hd5Var = hd5.a;
                xo8Var = new xo8(hd5Var, 29, hd5Var);
            }
            return new g0f(xo8Var);
        } catch (JSONException e) {
            ((y6d) this.b).logException("ParticipantListChunkParser", "Can't parse participant chunk", e);
            return null;
        }
    }

    public Object J() {
        Object obj;
        u5i u5iVar = (u5i) this.c;
        synchronized (u5iVar) {
            gu0 gu0Var = (gu0) u5iVar.c;
            if (gu0Var == null) {
                obj = null;
            } else {
                Object objPollLast = gu0Var.c.pollLast();
                if (gu0Var.c.isEmpty()) {
                    u5iVar.q(gu0Var);
                    ((SparseArray) u5iVar.a).remove(gu0Var.b);
                }
                obj = objPollLast;
            }
        }
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            ((HashSet) this.b).remove(obj);
        }
        return obj;
    }

    public void K(Set set) throws DatabaseIOException {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((df4) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.c, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void L(long j, long j2, String str) throws DatabaseIOException, SQLException {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((df4) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(SdkMetricStatEvent.NAME_KEY, str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.c, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        switch (this.a) {
            case 7:
                ez1 ez1Var = (ez1) this.c;
                if (ez1Var.z0.b == 2 && ez1Var.R0 == 9) {
                    ((ez1) this.c).F(10);
                    break;
                }
                break;
            default:
                ((bs8) this.b).a(obj);
                break;
        }
    }

    @Override // defpackage.bs8
    public void b() {
        ((bs8) this.b).b();
    }

    @Override // defpackage.bs8
    public void c(py4 py4Var) {
        ty4.h((qu1) this.c, py4Var);
    }

    @Override // org.webrtc.VideoDecoder
    public long createNative(long j) {
        try {
            return ((VideoDecoder) this.b).createNative(j);
        } catch (Throwable th) {
            ((y6d) this.c).reportException("VideoDecoderLifecycleLogger", "Decoder createNative failed", new IllegalStateException("Error on decoder createNative", th));
            return 0L;
        }
    }

    public mc0 d(CharSequence charSequence, Long l) {
        if (charSequence == null) {
            charSequence = "";
        }
        return fui.a(String.valueOf(new r5g(charSequence).b((Context) this.b)), l);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, long j) {
        try {
            return ((VideoDecoder) this.b).decode(encodedImage, decodeInfo, j);
        } catch (Throwable unused) {
            return VideoCodecStatus.ERROR;
        }
    }

    public r5g f(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dqi.u(charSequence.toString()));
        spannableStringBuilder.setSpan(new l7g(a93.s0.x((Context) this.b).k(), new k(19, this)), 0, spannableStringBuilder.length(), 17);
        return new r5g(spannableStringBuilder);
    }

    @Override // defpackage.iw8
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public dy e(lz9 lz9Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ((pw8) lz9Var.a).a;
        dy dyVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                dy dyVar2 = new dy(mediaCodecCreateByCodecName, (HandlerThread) ((ay) this.b).get(), new iy(mediaCodecCreateByCodecName, (HandlerThread) ((ay) this.c).get()), (sa9) lz9Var.X);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) lz9Var.d;
                    dy.a(dyVar2, (MediaFormat) lz9Var.b, surface, (MediaCrypto) lz9Var.o, (surface == null && ((pw8) lz9Var.a).k && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    return dyVar2;
                } catch (Exception e) {
                    e = e;
                    dyVar = dyVar2;
                    if (dyVar != null) {
                        dyVar.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // defpackage.grf
    public Object get() {
        switch (this.a) {
            case 3:
                g90 g90Var = (g90) this.b;
                int iA = usi.a(g90Var);
                int iB = usi.b(g90Var);
                int i = g90Var.e;
                Range range = g90Var.d;
                x90 x90Var = (x90) this.c;
                int i2 = x90Var.e;
                if (i == -1) {
                    gri.a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + i2);
                    i = i2;
                } else {
                    gri.a("AudioSrcAdPrflRslvr", wy1.g("Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: ", i2, ", Resolved Channel Count: ", i, "]"));
                }
                int i3 = x90Var.d;
                int iD = usi.d(range, i, iB, i3);
                gri.a("AudioSrcAdPrflRslvr", wy1.g("Using resolved AUDIO sample rate or nearest supported from AudioProfile: ", iD, "Hz. [AudioProfile sample rate: ", i3, "Hz]"));
                List list = f90.e;
                fde fdeVar = new fde();
                fdeVar.a = -1;
                fdeVar.b = -1;
                fdeVar.c = -1;
                fdeVar.d = -1;
                fdeVar.a = Integer.valueOf(iA);
                fdeVar.d = Integer.valueOf(iB);
                fdeVar.c = Integer.valueOf(i);
                fdeVar.b = Integer.valueOf(iD);
                return fdeVar.c();
            default:
                return new uy9((Context) ((tl4) this.b).a, (x94) ((y6i) this.c).get());
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        try {
            VideoDecoder videoDecoder = (VideoDecoder) this.b;
            return videoDecoder instanceof VideoDecoderFallback ? "VideoDecoderFallVideoDecoderFallbackback" : videoDecoder.getImplementationName();
        } catch (Throwable unused) {
            return "VideoDecoderLifecycleLogger";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList h() throws PackageManager.NameNotFoundException {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        ukd ukdVar = (ukd) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) ukdVar.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ql3(0, (String) it.next()));
        }
        return arrayList2;
    }

    public void i(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.i(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        y6d y6dVar = (y6d) this.c;
        y6dVar.log("VideoDecoderLifecycleLogger", "initDecode(cores=" + (settings != null ? Integer.valueOf(settings.numberOfCores) : null) + ", size=" + (settings != null ? Integer.valueOf(settings.width) : null) + "x" + (settings != null ? Integer.valueOf(settings.height) : null) + ")");
        try {
            return ((VideoDecoder) this.b).initDecode(settings, callback);
        } catch (Throwable th) {
            y6dVar.reportException("VideoDecoderLifecycleLogger", "Decoder init failed", new IllegalStateException("Error on init decoder", th));
            return VideoCodecStatus.ERROR;
        }
    }

    public void j(a aVar, boolean z) {
        c cVar = (c) this.b;
        b bVar = cVar.w.d;
        a aVar2 = cVar.y;
        if (aVar2 != null) {
            aVar2.x().o.j(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    public void k(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.k(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    public void l(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.l(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    @Override // defpackage.xmb
    public Object m(Uri uri, ve4 ve4Var) {
        mz5 mz5Var = (mz5) ((xmb) this.b).m(uri, ve4Var);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? mz5Var : (mz5) mz5Var.a(list);
    }

    public void n(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.n(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    public void o(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.o(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    @Override // defpackage.bs8
    public void onError(Throwable th) {
        ((bs8) this.b).onError(th);
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        hie hieVar = null;
        if (!(th instanceof DeferrableSurface$SurfaceClosedException)) {
            if (th instanceof CancellationException) {
                ((ez1) this.c).t("Unable to configure camera cancelled", null);
                return;
            }
            if (((ez1) this.c).R0 == 9) {
                ((ez1) this.c).E(9, new n90(4, th), true);
            }
            gri.c("Camera2CameraImpl", "Unable to configure camera " + ((ez1) this.c), th);
            ez1 ez1Var = (ez1) this.c;
            if (ez1Var.v0 == ((p52) this.b)) {
                ez1Var.D();
                return;
            }
            return;
        }
        ez1 ez1Var2 = (ez1) this.c;
        zr4 zr4Var = ((DeferrableSurface$SurfaceClosedException) th).a;
        Iterator it = ez1Var2.a.o().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            hie hieVar2 = (hie) it.next();
            if (hieVar2.b().contains(zr4Var)) {
                hieVar = hieVar2;
                break;
            }
        }
        if (hieVar != null) {
            ez1 ez1Var3 = (ez1) this.c;
            a07 a07VarD = ayi.d();
            fie fieVar = hieVar.f;
            if (fieVar != null) {
                ez1Var3.t("Posting surface closed", new Throwable());
                a07VarD.execute(new my1(fieVar, 2, hieVar));
            }
        }
    }

    public void p(a aVar, boolean z) {
        c cVar = (c) this.b;
        b bVar = cVar.w.d;
        a aVar2 = cVar.y;
        if (aVar2 != null) {
            aVar2.x().o.p(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    public void q(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.q(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    public void r(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.r(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        y6d y6dVar = (y6d) this.c;
        y6dVar.log("VideoDecoderLifecycleLogger", "release()");
        try {
            return ((VideoDecoder) this.b).release();
        } catch (Throwable th) {
            y6dVar.reportException("VideoDecoderLifecycleLogger", "Decoder release failed", new IllegalStateException("Error on release decoder", th));
            return VideoCodecStatus.ERROR;
        }
    }

    public void s(a aVar, Bundle bundle, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.s(aVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    public void t(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.t(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    public void u(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.u(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    public void v(a aVar, View view, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.v(aVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
                c cVar = (c) this.b;
                if (aVar == ((a) h79Var.b)) {
                    py0 py0Var = cVar.o;
                    synchronized (((CopyOnWriteArrayList) py0Var.c)) {
                        int size = ((CopyOnWriteArrayList) py0Var.c).size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (((hi6) ((CopyOnWriteArrayList) py0Var.c).get(i)).a == h79Var) {
                                ((CopyOnWriteArrayList) py0Var.c).remove(i);
                                break;
                            }
                            i++;
                        }
                    }
                    l29.C(view, (FrameLayout) h79Var.c);
                } else {
                    continue;
                }
            }
        }
    }

    public void w(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.x().o.w(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            hi6 hi6Var = (hi6) it.next();
            if (z) {
                hi6Var.getClass();
            } else {
                h79 h79Var = hi6Var.a;
            }
        }
    }

    public bj x() {
        cwf cwfVar = new cwf();
        Context context = (Context) this.b;
        bj bjVar = (bj) this.c;
        int i = 28;
        return new bj(4, new mhd[]{cwfVar, new lk6(context, bjVar), new v17(i, (byte) 0), new v1a(i), new cwf(), new s7c(context, bjVar)});
    }

    public Bitmap y(int i) {
        Object objPollFirst;
        u5i u5iVar = (u5i) this.c;
        synchronized (u5iVar) {
            gu0 gu0Var = (gu0) ((SparseArray) u5iVar.a).get(i);
            if (gu0Var == null) {
                objPollFirst = null;
            } else {
                objPollFirst = gu0Var.c.pollFirst();
                if (((gu0) u5iVar.b) != gu0Var) {
                    u5iVar.q(gu0Var);
                    gu0 gu0Var2 = (gu0) u5iVar.b;
                    if (gu0Var2 == null) {
                        u5iVar.b = gu0Var;
                        u5iVar.c = gu0Var;
                    } else {
                        gu0Var.d = gu0Var2;
                        gu0Var2.a = gu0Var;
                        u5iVar.b = gu0Var;
                    }
                }
            }
        }
        if (objPollFirst != null) {
            synchronized (this) {
                ((HashSet) this.b).remove(objPollFirst);
            }
        }
        Bitmap bitmap = (Bitmap) objPollFirst;
        if (bitmap == null || !H(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    public b z() {
        ln lnVar = (ln) ((WeakReference) this.c).get();
        a aVar = (a) ((WeakReference) this.b).get();
        return (lnVar != null || aVar == null) ? lnVar : aVar.t();
    }

    public /* synthetic */ py0(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ py0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public py0(VideoDecoder videoDecoder, VideoCodecInfo videoCodecInfo, y6d y6dVar) {
        this.a = 25;
        this.b = videoDecoder;
        this.c = y6dVar;
        y6dVar.log("VideoDecoderLifecycleLogger", "createDecoder(" + getImplementationName() + "), codec: " + videoCodecInfo);
    }

    public py0(int i, int i2, ColorSpace colorSpace) {
        this.a = 19;
        this.b = colorSpace;
        this.c = (i == -1 || i2 == -1) ? null : new imb(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public py0(Context context, int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = context;
                bj bjVar = new bj(1);
                this.c = bjVar;
                bjVar.n(context.getApplicationInfo().sourceDir);
                break;
            default:
                this.b = context;
                this.c = ipi.b(3, new i6(26, this));
                break;
        }
    }

    public py0(FrgTrimVideo frgTrimVideo) {
        this.a = 11;
        this.b = new WeakReference(frgTrimVideo);
        this.c = new WeakReference(null);
    }

    public py0(c cVar) {
        this.a = 17;
        this.b = cVar;
        this.c = new CopyOnWriteArrayList();
    }

    public py0(ActLocalMedias actLocalMedias) {
        this.a = 11;
        this.c = new WeakReference(actLocalMedias);
        this.b = new WeakReference(null);
    }

    public py0(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = 12;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public py0(EditText editText, boolean z) {
        this.a = 14;
        this.b = editText;
        kc5 kc5Var = new kc5(editText, z);
        this.c = kc5Var;
        editText.addTextChangedListener(kc5Var);
        if (bb5.b == null) {
            synchronized (bb5.a) {
                try {
                    if (bb5.b == null) {
                        bb5 bb5Var = new bb5();
                        try {
                            bb5.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, bb5.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        bb5.b = bb5Var;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(bb5.b);
    }

    public py0(zjd zjdVar, int[] iArr) {
        this.a = 24;
        this.b = wg7.j(zjdVar);
        this.c = iArr;
    }

    public py0(ez1 ez1Var, p52 p52Var) {
        this.a = 7;
        this.c = ez1Var;
        this.b = p52Var;
    }

    public py0(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = new HashSet();
                u5i u5iVar = new u5i();
                u5iVar.a = new SparseArray();
                this.c = u5iVar;
                break;
            case 8:
                this.b = new Object();
                this.c = new LinkedHashMap();
                new HashSet();
                break;
            case 18:
                this.b = new HashMap();
                break;
            case 28:
                this.b = new char[256];
                this.c = new byte[256];
                break;
            default:
                this.b = new Rect();
                this.c = new Rect();
                break;
        }
    }
}
