package com.otaliastudios.transcoder.strategy;

import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackStatus;
import j.N;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultAudioStrategy.java */
/* loaded from: classes7.dex */
public class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public c f366262a;

    /* compiled from: DefaultAudioStrategy.java */
    public static class b {
    }

    /* compiled from: DefaultAudioStrategy.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f366263a;

        /* renamed from: b, reason: collision with root package name */
        public int f366264b;

        /* renamed from: c, reason: collision with root package name */
        public long f366265c;

        /* renamed from: d, reason: collision with root package name */
        public String f366266d;

        public c() {
        }
    }

    @Override // com.otaliastudios.transcoder.strategy.f
    @N
    public final TrackStatus a(@N ArrayList arrayList, @N MediaFormat mediaFormat) {
        long integer;
        c cVar = this.f366262a;
        int i12 = cVar.f366263a;
        if (i12 == -1) {
            Iterator it = arrayList.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, ((MediaFormat) it.next()).getInteger("channel-count"));
            }
            i12 = iMax;
        }
        int i13 = cVar.f366264b;
        if (i13 == -1) {
            Iterator it2 = arrayList.iterator();
            int iMin = Integer.MAX_VALUE;
            while (it2.hasNext()) {
                iMin = Math.min(iMin, ((MediaFormat) it2.next()).getInteger("sample-rate"));
            }
            i13 = iMin;
        }
        if (arrayList.size() == 1 && cVar.f366263a == -1 && cVar.f366264b == -1 && cVar.f366265c == Long.MIN_VALUE && ((MediaFormat) arrayList.get(0)).containsKey("bitrate")) {
            integer = ((MediaFormat) arrayList.get(0)).getInteger("bitrate");
        } else {
            integer = cVar.f366265c;
            if (integer == Long.MIN_VALUE) {
                integer = (long) (16 * i13 * i12 * 0.75d);
            }
        }
        mediaFormat.setString("mime", cVar.f366266d);
        mediaFormat.setInteger("sample-rate", i13);
        mediaFormat.setInteger("channel-count", i12);
        mediaFormat.setInteger("bitrate", (int) integer);
        if ("audio/mp4a-latm".equalsIgnoreCase(cVar.f366266d)) {
            mediaFormat.setInteger("aac-profile", 2);
        }
        return TrackStatus.f365971e;
    }
}
