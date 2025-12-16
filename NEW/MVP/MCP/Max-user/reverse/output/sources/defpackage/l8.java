package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class l8 extends u08 implements cm6 {
    public static final l8 X;
    public static final l8 Y;
    public static final l8 Z;
    public static final l8 b;
    public static final l8 c;
    public static final l8 d;
    public static final l8 o;
    public static final l8 s0;
    public static final l8 t0;
    public static final l8 u0;
    public static final l8 v0;
    public static final l8 w0;
    public final /* synthetic */ int a;

    static {
        int i = 0;
        b = new l8(i, 0);
        c = new l8(i, 1);
        d = new l8(i, 2);
        o = new l8(i, 3);
        X = new l8(i, 4);
        Y = new l8(i, 5);
        Z = new l8(i, 6);
        s0 = new l8(i, 7);
        t0 = new l8(i, 8);
        u0 = new l8(i, 9);
        v0 = new l8(i, 10);
        w0 = new l8(i, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8(int i, int i2) {
        super(i);
        this.a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        nme nmeVar = nca.b;
        int maxSupportedInstances = 0;
        maxSupportedInstances = 0;
        switch (i) {
            case 0:
                return Integer.valueOf(k7d.b.c(2147418112) + 65536);
            case 1:
                return new dd3();
            case 2:
                u1j u1jVar = h9j.a;
                if (u1jVar != null) {
                    return new ej3(u1jVar);
                }
                return null;
            case 3:
                feg fegVar = feg.a;
                Object obj = feg.c().get(jib.a);
                xx4 xx4Var = obj instanceof xx4 ? (xx4) obj : null;
                return xx4Var == null ? new xx4(new h08(14, (boolean) maxSupportedInstances)) : xx4Var;
            case 4:
                return Long.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
            case 5:
                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
            case 6:
                Context context = feg.d;
                Context context2 = context != null ? context : null;
                String strB = d6j.b();
                return new w55(jz5.g(new File(context2.getCacheDir(), strB.equals(context2.getPackageName()) ? "tracer" : "tracer-" + Uri.encode(dnf.p(strB, ':', '-', false))), "drops.json"));
            case 7:
                Context context3 = feg.d;
                if (context3 == null) {
                    context3 = null;
                }
                feg fegVar2 = feg.a;
                Object obj2 = feg.c().get(nmeVar);
                s74 s74Var = obj2 instanceof s74 ? (s74) obj2 : null;
                if (s74Var == null) {
                    s74Var = new s74(new s7c(13));
                }
                int i2 = s74Var.b;
                StringBuilder sbN = az1.n("TracerSDK/1.1.7 App/", context3.getPackageName(), " ");
                String property = System.getProperty("http.agent");
                if (property == null) {
                    property = "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)";
                }
                sbN.append(property);
                return new ha7(context3, sbN.toString(), i2);
            case 8:
                feg fegVar3 = feg.a;
                Object obj3 = feg.c().get(nmeVar);
                if ((obj3 instanceof s74 ? (s74) obj3 : null) == null) {
                    new s7c(13).d();
                }
                return Executors.newSingleThreadExecutor(new mg(1));
            case 9:
                feg fegVar4 = feg.a;
                Object obj4 = feg.c().get(nmeVar);
                if ((obj4 instanceof s74 ? (s74) obj4 : null) == null) {
                    new s7c(13).d();
                }
                return Executors.newCachedThreadPool(new nn3(4, new AtomicInteger(0)));
            case 10:
                return Long.valueOf(Os.sysconf(OsConstants._SC_PAGESIZE) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            case 11:
                return Long.valueOf(Os.sysconf(OsConstants._SC_NPROCESSORS_CONF));
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                    MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                    ArrayList arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                        if (ys.i(mediaCodecInfo.getSupportedTypes(), "video/avc") && !mediaCodecInfo.isEncoder() && mediaCodecInfo.isHardwareAccelerated()) {
                            arrayList.add(mediaCodecInfo);
                        }
                    }
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            Object obj5 = arrayList.get(i3);
                            i3++;
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = ((MediaCodecInfo) obj5).getCapabilitiesForType("video/avc");
                            if (capabilitiesForType.getMaxSupportedInstances() > 0) {
                                maxSupportedInstances = capabilitiesForType.getMaxSupportedInstances();
                            }
                        }
                    }
                }
                return Integer.valueOf(n7j.c(maxSupportedInstances - 5, 4, 10));
        }
    }
}
