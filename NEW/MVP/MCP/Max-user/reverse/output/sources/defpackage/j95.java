package defpackage;

import android.hardware.DataSpace;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.media.metrics.MediaItemInfo;
import android.os.SystemClock;
import android.util.Size;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j95 {
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public static final SparseIntArray g;
    public final long a = SystemClock.elapsedRealtime();
    public final String b;
    public final i95 c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f = sparseIntArray3;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        g = sparseIntArray4;
        sparseIntArray.put(1000, 1);
        sparseIntArray.put(1001, 2);
        sparseIntArray.put(2000, 3);
        sparseIntArray.put(2001, 4);
        sparseIntArray.put(2002, 5);
        sparseIntArray.put(2003, 3);
        sparseIntArray.put(2004, 6);
        sparseIntArray.put(2005, 7);
        sparseIntArray.put(2006, 8);
        sparseIntArray.put(2007, 9);
        sparseIntArray.put(2008, 10);
        sparseIntArray.put(3001, 11);
        sparseIntArray.put(3002, 12);
        sparseIntArray.put(3003, 13);
        sparseIntArray.put(4001, 14);
        sparseIntArray.put(4002, 15);
        sparseIntArray.put(4003, 16);
        sparseIntArray.put(5001, 17);
        sparseIntArray.put(6001, 18);
        sparseIntArray.put(7001, 19);
        sparseIntArray.put(7002, 2);
        sparseIntArray2.put(-1, 0);
        sparseIntArray2.put(2, 131072);
        sparseIntArray2.put(1, 65536);
        sparseIntArray2.put(6, 393216);
        sparseIntArray3.put(-1, 0);
        sparseIntArray3.put(2, 268435456);
        sparseIntArray3.put(1, 134217728);
        sparseIntArray4.put(-1, 0);
        sparseIntArray4.put(1, 4194304);
        sparseIntArray4.put(3, 12582912);
        sparseIntArray4.put(2, 8388608);
        sparseIntArray4.put(10, 16777216);
        sparseIntArray4.put(6, 29360128);
        sparseIntArray4.put(7, 33554432);
    }

    public j95(i95 i95Var, String str) {
        this.c = i95Var;
        this.b = str;
    }

    public static long b(String str) {
        long j = xz9.i(str) ? 4L : 0L;
        if (xz9.m(str)) {
            j |= 2;
        }
        return xz9.k(str) ? j | 1 : j;
    }

    public static ArrayList c(wg7 wg7Var) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < wg7Var.size(); i++) {
            mn5 mn5Var = (mn5) wg7Var.get(i);
            MediaItemInfo.Builder builderF = xx.f();
            builderF.setClipDurationMillis(zxg.m0(mn5Var.a));
            String str = mn5Var.e;
            if (str != null) {
                builderF.addCodecName(str);
            }
            String str2 = mn5Var.d;
            if (str2 != null) {
                builderF.addCodecName(str2);
            }
            hf6 hf6Var = mn5Var.c;
            if (hf6Var != null) {
                String str3 = hf6Var.n;
                String str4 = hf6Var.m;
                if (str4 != null) {
                    builderF.setContainerMimeType(str4);
                }
                if (str3 != null) {
                    builderF.addSampleMimeType(str3);
                    builderF.addDataType(b(str3));
                }
                float f2 = hf6Var.y;
                if (f2 != -1.0f) {
                    builderF.setVideoFrameRate(f2);
                }
                int i2 = hf6Var.u;
                if (i2 == -1) {
                    i2 = -1;
                }
                int i3 = hf6Var.v;
                if (i3 == -1) {
                    i3 = -1;
                }
                builderF.setVideoSize(new Size(i2, i3));
                gf3 gf3Var = hf6Var.D;
                if (gf3Var != null) {
                    builderF.setVideoDataSpace(DataSpace.pack(e.get(gf3Var.a, 0), g.get(gf3Var.c, 0), f.get(gf3Var.b, 0)));
                }
            }
            hf6 hf6Var2 = mn5Var.b;
            if (hf6Var2 != null) {
                String str5 = hf6Var2.n;
                if (str5 != null) {
                    builderF.addSampleMimeType(str5);
                    builderF.addDataType(b(str5));
                }
                int i4 = hf6Var2.F;
                if (i4 != -1) {
                    builderF.setAudioChannelCount(i4);
                }
                int i5 = hf6Var2.G;
                if (i5 != -1) {
                    builderF.setAudioSampleRateHz(i5);
                }
            }
            arrayList.add(builderF.build());
        }
        return arrayList;
    }

    public static MediaItemInfo d(nn5 nn5Var) {
        MediaItemInfo.Builder builderF = xx.f();
        long j = nn5Var.a;
        String str = nn5Var.n;
        String str2 = nn5Var.g;
        if (j != -9223372036854775807L) {
            builderF.setDurationMillis(j);
        }
        if (str2 != null) {
            builderF.addSampleMimeType(str2);
            builderF.addDataType(b(str2));
        }
        if (str != null) {
            builderF.addSampleMimeType(str);
            builderF.addDataType(b(str));
        }
        int i = nn5Var.d;
        if (i != -1) {
            builderF.setAudioChannelCount(i);
        }
        int i2 = nn5Var.e;
        if (i2 != -2147483647) {
            builderF.setAudioSampleRateHz(i2);
        }
        String str3 = nn5Var.f;
        if (str3 != null) {
            builderF.addCodecName(str3);
        }
        String str4 = nn5Var.m;
        if (str4 != null) {
            builderF.addCodecName(str4);
        }
        builderF.setVideoSampleCount(nn5Var.l);
        int i3 = nn5Var.k;
        if (i3 == -1) {
            i3 = -1;
        }
        int i4 = nn5Var.j;
        builderF.setVideoSize(new Size(i3, i4 != -1 ? i4 : -1));
        gf3 gf3Var = nn5Var.i;
        if (gf3Var != null) {
            builderF.setVideoDataSpace(DataSpace.pack(e.get(gf3Var.a, 0), g.get(gf3Var.c, 0), f.get(gf3Var.b, 0)));
        }
        return builderF.build();
    }

    public final EditingEndedEvent.Builder a(int i) {
        EditingEndedEvent.Builder exporterName = xx.a(i).setTimeSinceCreatedMillis(SystemClock.elapsedRealtime() - this.a).setExporterName("androidx.media3:media3-transformer:1.8.0");
        String str = this.b;
        if (str != null) {
            exporterName.setMuxerName(str);
        }
        return exporterName;
    }

    public final void e(int i) {
        EditingSession editingSession;
        EditingEndedEvent.Builder builderA = a(2);
        if (i != -1) {
            builderA.setFinalProgressPercent(i);
        }
        EditingEndedEvent editingEndedEventBuild = builderA.build();
        i95 i95Var = this.c;
        if (!i95Var.b && (editingSession = i95Var.a) != null) {
            editingSession.reportEditingEndedEvent(editingEndedEventBuild);
            i95Var.b = true;
        }
        try {
            u45.p(i95Var);
        } catch (Exception e2) {
            a8i.h("EditingMetricsCollector", "error while closing the metrics reporter", e2);
        }
    }
}
