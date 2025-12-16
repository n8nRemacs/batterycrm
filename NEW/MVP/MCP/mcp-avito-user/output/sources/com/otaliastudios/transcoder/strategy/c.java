package com.otaliastudios.transcoder.strategy;

import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackStatus;
import j.N;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultVideoStrategy.java */
/* loaded from: classes7.dex */
public class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final C10806c f366267a;

    /* compiled from: DefaultVideoStrategy.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f366268a;

        /* renamed from: b, reason: collision with root package name */
        public long f366269b;

        /* renamed from: c, reason: collision with root package name */
        public float f366270c;

        public b() {
            new w11.e();
            this.f366268a = 30;
            this.f366269b = Long.MIN_VALUE;
            this.f366270c = 3.0f;
        }
    }

    /* compiled from: DefaultVideoStrategy.java */
    /* renamed from: com.otaliastudios.transcoder.strategy.c$c, reason: collision with other inner class name */
    public static class C10806c {

        /* renamed from: a, reason: collision with root package name */
        public w11.e f366271a;

        /* renamed from: b, reason: collision with root package name */
        public long f366272b;

        /* renamed from: c, reason: collision with root package name */
        public int f366273c;

        /* renamed from: d, reason: collision with root package name */
        public float f366274d;

        /* renamed from: e, reason: collision with root package name */
        public String f366275e;

        public C10806c() {
        }
    }

    public c(@N C10806c c10806c) {
        this.f366267a = c10806c;
    }

    @Override // com.otaliastudios.transcoder.strategy.f
    @N
    public final TrackStatus a(@N ArrayList arrayList, @N MediaFormat mediaFormat) {
        C10806c c10806c;
        boolean z12;
        int i12;
        int i13;
        String str;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c10806c = this.f366267a;
            if (!zHasNext) {
                z12 = true;
                break;
            }
            if (!((MediaFormat) it.next()).getString("mime").equalsIgnoreCase(c10806c.f366275e)) {
                z12 = false;
                break;
            }
        }
        int size = arrayList.size();
        float[] fArr = new float[size];
        boolean[] zArr = new boolean[size];
        float f12 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            MediaFormat mediaFormat2 = (MediaFormat) arrayList.get(i14);
            float integer = mediaFormat2.getInteger("width");
            float integer2 = mediaFormat2.getInteger("height");
            boolean z13 = (mediaFormat2.containsKey("rotation-degrees") ? mediaFormat2.getInteger("rotation-degrees") : 0) % 180 != 0;
            zArr[i14] = z13;
            float f13 = z13 ? integer2 / integer : integer / integer2;
            fArr[i14] = f13;
            f12 += f13;
        }
        float f14 = f12 / size;
        float f15 = Float.MAX_VALUE;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            float fAbs = Math.abs(fArr[i16] - f14);
            if (fAbs < f15) {
                i15 = i16;
                f15 = fAbs;
            }
        }
        MediaFormat mediaFormat3 = (MediaFormat) arrayList.get(i15);
        int integer3 = mediaFormat3.getInteger("width");
        int integer4 = mediaFormat3.getInteger("height");
        boolean z14 = zArr[i15];
        int i17 = z14 ? integer4 : integer3;
        if (!z14) {
            integer3 = integer4;
        }
        com.otaliastudios.transcoder.common.a aVar = new com.otaliastudios.transcoder.common.a(i17, integer3);
        try {
            com.otaliastudios.transcoder.common.b bVarA = c10806c.f366271a.a(aVar);
            if (bVarA instanceof com.otaliastudios.transcoder.common.a) {
                com.otaliastudios.transcoder.common.a aVar2 = (com.otaliastudios.transcoder.common.a) bVarA;
                i12 = aVar2.f365977c;
                i13 = aVar2.f365978d;
            } else if (aVar.f365977c >= aVar.f365978d) {
                i12 = bVarA.f365979a;
                i13 = bVarA.f365980b;
            } else {
                i12 = bVarA.f365980b;
                i13 = bVarA.f365979a;
            }
            boolean z15 = aVar.f365980b <= bVarA.f365980b;
            Iterator it2 = arrayList.iterator();
            int iMin = Integer.MAX_VALUE;
            while (true) {
                str = "frame-rate";
                if (!it2.hasNext()) {
                    break;
                }
                MediaFormat mediaFormat4 = (MediaFormat) it2.next();
                if (mediaFormat4.containsKey("frame-rate")) {
                    iMin = Math.min(iMin, mediaFormat4.getInteger("frame-rate"));
                }
            }
            if (iMin == Integer.MAX_VALUE) {
                iMin = -1;
            }
            int iMin2 = iMin > 0 ? Math.min(iMin, c10806c.f366273c) : c10806c.f366273c;
            boolean z16 = iMin <= iMin2;
            Iterator it3 = arrayList.iterator();
            int integer5 = 0;
            int i18 = 0;
            while (it3.hasNext()) {
                String str2 = str;
                MediaFormat mediaFormat5 = (MediaFormat) it3.next();
                if (mediaFormat5.containsKey("i-frame-interval")) {
                    i18++;
                    integer5 += mediaFormat5.getInteger("i-frame-interval");
                }
                str = str2;
            }
            String str3 = str;
            boolean z17 = ((float) (i18 > 0 ? Math.round(((float) integer5) / ((float) i18)) : -1)) >= c10806c.f366274d;
            if (arrayList.size() == 1 && z12 && z15 && z16 && z17) {
                return TrackStatus.f365970d;
            }
            mediaFormat.setString("mime", c10806c.f366275e);
            mediaFormat.setInteger("width", i12);
            mediaFormat.setInteger("height", i13);
            mediaFormat.setInteger("rotation-degrees", 0);
            mediaFormat.setInteger(str3, iMin2);
            mediaFormat.setFloat("i-frame-interval", c10806c.f366274d);
            mediaFormat.setInteger("color-format", 2130708361);
            long j12 = c10806c.f366272b;
            if (j12 == Long.MIN_VALUE) {
                j12 = (long) (i12 * 0.14f * i13 * iMin2);
            }
            mediaFormat.setInteger("bitrate", (int) j12);
            return TrackStatus.f365971e;
        } catch (Exception e12) {
            throw new RuntimeException("Resizer error:", e12);
        }
    }
}
