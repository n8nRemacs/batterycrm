package defpackage;

import android.net.Uri;
import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zk6 {
    public static cf7 a = null;
    public static volatile boolean b = false;
    public static final int[] c = new int[0];
    public static final long[] d = new long[0];
    public static final Object[] e = new Object[0];

    public static arf a() {
        return new arf(null);
    }

    public static final int b(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int c(int i, long j, long[] jArr) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static String d(long j, long j2) {
        return "[" + ((Object) DateFormat.format("yyyy-MM-dd kk:mm:ss", j)) + ", " + ((Object) DateFormat.format("yyyy-MM-dd kk:mm:ss", j2)) + "]";
    }

    public static df7 e() {
        return gf7.g().f();
    }

    public static String f(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fz8 fz8Var = (fz8) list.get(i);
            sb.append("\n                  MediaInfo(\n                      uri=");
            Uri uri = fz8Var.a;
            long j = fz8Var.c;
            sb.append(uri);
            sb.append("\n                      took=");
            sb.append(fz8Var.h);
            sb.append(" ms\n                      duration=");
            sb.append((fz8Var.b != -9223372036854775807L ? fz8Var : null) != null ? Float.valueOf(r4.b / 1000000.0f) : "?");
            if (j > 0) {
                az1.r(j, "\n                      file_size=", " bytes", sb);
            }
            sb.append("\n                      hdr=");
            sb.append(fz8Var.d);
            sb.append("\n                      video_tracks=");
            sb.append(fz8Var.e.length);
            sb.append("\n                      audio_tracks=");
            sb.append(fz8Var.f.length);
            sb.append("\n                      other_tracks=");
            sb.append(fz8Var.g.length);
            sb.append("\n                  )");
        }
        return sb.toString();
    }

    public static String g(ha9 ha9Var) {
        StringBuilder sb = new StringBuilder("\n                  mute=");
        sb.append(ha9Var.k);
        sb.append("\n                  video_size=");
        sb.append(ha9Var.d);
        sb.append('x');
        sb.append(ha9Var.e);
        sb.append("\n                  video_bitrate=");
        int i = ha9Var.f;
        if (i > 0) {
            sb.append(i / 1000000.0f);
            sb.append(" Mbps");
        } else {
            sb.append("?");
        }
        sb.append("\n                  position_range=[");
        sb.append(ha9Var.g);
        sb.append(", ");
        sb.append(ha9Var.h);
        sb.append(']');
        return sb.toString();
    }

    public static String h(ha9 ha9Var, String str) {
        StringBuilder sbN = az1.n("\n", str, "    keep_original_settings=");
        sbN.append(ha9Var.i);
        sbN.append('\n');
        sbN.append(str);
        sbN.append("    fast_transform_enabled=");
        sbN.append(ha9Var.j);
        sbN.append('\n');
        sbN.append(str);
        sbN.append("    hdr_allowed=");
        sbN.append(ha9Var.l);
        sbN.append('\n');
        sbN.append(str);
        sbN.append("    hevc_allowed=");
        sbN.append(ha9Var.m);
        sbN.append('\n');
        sbN.append(str);
        sbN.append("    max_encoder_frames=");
        sbN.append(ha9Var.n);
        sbN.append('\n');
        sbN.append(str);
        sbN.append("    ping_delay=");
        hf3.e(ha9Var.p, " ms\n", str, sbN);
        sbN.append("    stuck_delay=");
        return ho7.k(sbN, ha9Var.q, " ms");
    }

    public static String i(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\n                  ");
            sb.append(arrayList.get(i));
        }
        return sb.toString();
    }
}
