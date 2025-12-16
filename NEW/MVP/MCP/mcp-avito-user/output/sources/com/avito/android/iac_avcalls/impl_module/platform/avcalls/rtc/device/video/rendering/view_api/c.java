package com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.rendering.view_api;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.rendering.view_api.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import xJ.C49847b;

/* compiled from: VideoRendererStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/rendering/view_api/c;", "", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f164430a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.avcalls.utils.logs.a f164431b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f164432c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C49847b f164433d;

    /* compiled from: VideoRendererStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/rendering/view_api/c$a;", "", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final VideoSink f164434a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f164435b;

        public a(@k VideoSink videoSink, @k String str) {
            this.f164434a = videoSink;
            this.f164435b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f164434a, aVar.f164434a) && L.f(this.f164435b, aVar.f164435b);
        }

        public final int hashCode() {
            return this.f164435b.hashCode() + (this.f164434a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ConnectedSink(sink=");
            sb2.append(this.f164434a);
            sb2.append(", sinkPlacementTag=");
            return C22026a.c(sb2, this.f164435b, ')');
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.rendering.view_api.b] */
    public c(@k ProxyKey proxyKey) {
        String str = "VideoRendererProxy(isLocal=" + proxyKey.isLocal() + ", " + proxyKey.getCallId() + ')';
        this.f164431b = new com.avito.avcalls.utils.logs.a("VideoRendererProxy(isLocal=" + proxyKey.isLocal() + ')');
        this.f164433d = new C49847b(str, new VideoSink() { // from class: com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.rendering.view_api.b
            @Override // org.webrtc.VideoSink
            public final void onFrame(VideoFrame videoFrame) {
                c cVar = this.f164429b;
                synchronized (cVar) {
                    try {
                        if (!cVar.f164432c) {
                            cVar.f164432c = true;
                            cVar.f164431b.c("start receiving frames", "onFrame", new Object[0]);
                        }
                        Iterator it = cVar.f164430a.iterator();
                        while (it.hasNext()) {
                            ((c.a) it.next()).f164434a.onFrame(videoFrame);
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
        this.f164431b.b("connectToProxy", str);
        Iterator it = this.f164430a.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f164434a == videoSink) {
                return;
            }
        }
        this.f164430a.add(new a(videoSink, str));
        this.f164431b.c(str + " is now connected", "connectToProxy", new Object[0]);
    }

    public final synchronized void b(@k VideoSink videoSink) {
        try {
            this.f164431b.b("disconnectFromProxy", new Object[0]);
            Iterator it = this.f164430a.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (((a) it.next()).f164434a != videoSink) {
                    i12++;
                }
            }
            if (i12 >= 0 && i12 < this.f164430a.size()) {
                this.f164431b.c('$' + ((a) this.f164430a.get(i12)).f164435b + " is now disconnected", "disconnectFromProxy", new Object[0]);
                this.f164430a.remove(i12);
            }
        } finally {
        }
    }
}
