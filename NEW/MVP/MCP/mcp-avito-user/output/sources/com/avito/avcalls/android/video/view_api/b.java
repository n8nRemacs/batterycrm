package com.avito.avcalls.android.video.view_api;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.avcalls.android.logger.a;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.video.view_api.b;
import com.avito.avcalls.android.video.w;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: VideoRendererStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/android/video/view_api/b;", "", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f332524a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f332525b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f332526c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final w f332527d;

    /* compiled from: VideoRendererStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/android/video/view_api/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.video.view_api.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: VideoRendererStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/video/view_api/b$b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.video.view_api.b$b, reason: collision with other inner class name */
    public static final /* data */ class C10328b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final VideoSink f332528a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f332529b;

        public C10328b(@k VideoSink videoSink, @k String str) {
            this.f332528a = videoSink;
            this.f332529b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10328b)) {
                return false;
            }
            C10328b c10328b = (C10328b) obj;
            return L.f(this.f332528a, c10328b.f332528a) && L.f(this.f332529b, c10328b.f332529b);
        }

        public final int hashCode() {
            return this.f332529b.hashCode() + (this.f332528a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ConnectedSink(sink=");
            sb2.append(this.f332528a);
            sb2.append(", sinkPlacementTag=");
            return C22026a.c(sb2, this.f332529b, ')');
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.avito.avcalls.android.video.view_api.a] */
    public b(@k Q<String, Boolean> q12) {
        StringBuilder sb2 = new StringBuilder("VideoRendererProxy(isLocal=");
        sb2.append(q12.f406620c.booleanValue());
        sb2.append(", ");
        String strC = C22026a.c(sb2, q12.f406619b, ')');
        this.f332525b = strC;
        this.f332527d = new w(strC, new VideoSink() { // from class: com.avito.avcalls.android.video.view_api.a
            @Override // org.webrtc.VideoSink
            public final void onFrame(VideoFrame videoFrame) {
                b bVar = this.f332523b;
                b.Companion aVar = b.INSTANCE;
                synchronized (bVar) {
                    try {
                        if (!bVar.f332526c) {
                            bVar.f332526c = true;
                            g.Companion aVar2 = g.INSTANCE;
                            String str = bVar.f332525b + ": start receiving frames";
                            aVar2.getClass();
                            com.avito.avcalls.android.logger.b bVar2 = g.f331754b;
                            if (bVar2 != null) {
                                bVar2.a("VideoRendering", a.AbstractC10309a.b.AbstractC10311a.C10312a.f331737a, str);
                            }
                        }
                        Iterator it = bVar.f332524a.iterator();
                        while (it.hasNext()) {
                            ((b.C10328b) it.next()).f332528a.onFrame(videoFrame);
                        }
                        G0 g02 = G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    public final synchronized void a(@k VideoSink videoSink, @k String str) {
        Iterator it = this.f332524a.iterator();
        while (it.hasNext()) {
            if (((C10328b) it.next()).f332528a == videoSink) {
                return;
            }
        }
        this.f332524a.add(new C10328b(videoSink, str));
        g.Companion companion = g.INSTANCE;
        String str2 = this.f332525b + ": sink " + str + " is now connected";
        companion.getClass();
        com.avito.avcalls.android.logger.b bVar = g.f331754b;
        if (bVar != null) {
            bVar.a("VideoRendering", a.AbstractC10309a.b.AbstractC10311a.C10312a.f331737a, str2);
        }
    }

    public final synchronized void b(@k VideoSink videoSink) {
        try {
            Iterator it = this.f332524a.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (((C10328b) it.next()).f332528a != videoSink) {
                    i12++;
                }
            }
            if (i12 >= 0 && i12 < this.f332524a.size()) {
                g.Companion companion = g.INSTANCE;
                String str = this.f332525b + ": sink " + ((C10328b) this.f332524a.get(i12)).f332529b + " is now disconnected";
                companion.getClass();
                com.avito.avcalls.android.logger.b bVar = g.f331754b;
                if (bVar != null) {
                    bVar.a("VideoRendering", a.AbstractC10309a.b.AbstractC10311a.C10312a.f331737a, str);
                }
                this.f332524a.remove(i12);
            }
        } finally {
        }
    }
}
