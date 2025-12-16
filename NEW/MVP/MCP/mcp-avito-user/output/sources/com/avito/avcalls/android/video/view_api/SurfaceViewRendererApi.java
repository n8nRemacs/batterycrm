package com.avito.avcalls.android.video.view_api;

import Y61.k;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: SurfaceViewRendererApi.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/android/video/view_api/SurfaceViewRendererApi;", "", "<init>", "()V", "ScalingType", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SurfaceViewRendererApi {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final SurfaceViewRendererApi f332517a = new SurfaceViewRendererApi();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SurfaceViewRendererApi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/video/view_api/SurfaceViewRendererApi$ScalingType;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScalingType {

        /* renamed from: b, reason: collision with root package name */
        public static final ScalingType f332518b;

        /* renamed from: c, reason: collision with root package name */
        public static final ScalingType f332519c;

        /* renamed from: d, reason: collision with root package name */
        public static final ScalingType f332520d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ScalingType[] f332521e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f332522f;

        static {
            ScalingType scalingType = new ScalingType("SCALE_ASPECT_FIT", 0);
            f332518b = scalingType;
            ScalingType scalingType2 = new ScalingType("SCALE_ASPECT_FILL", 1);
            f332519c = scalingType2;
            ScalingType scalingType3 = new ScalingType("SCALE_ASPECT_BALANCED", 2);
            f332520d = scalingType3;
            ScalingType[] scalingTypeArr = {scalingType, scalingType2, scalingType3};
            f332521e = scalingTypeArr;
            f332522f = kotlin.enums.c.a(scalingTypeArr);
        }

        public ScalingType() {
            throw null;
        }

        public static ScalingType valueOf(String str) {
            return (ScalingType) Enum.valueOf(ScalingType.class, str);
        }

        public static ScalingType[] values() {
            return (ScalingType[]) f332521e.clone();
        }
    }

    /* compiled from: SurfaceViewRendererApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ScalingType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ScalingType scalingType = ScalingType.f332518b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ScalingType scalingType2 = ScalingType.f332518b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@k View view, @k String str, boolean z12, @k String str2) {
        if (view instanceof SurfaceViewRenderer) {
            VideoSink videoSink = (VideoSink) view;
            synchronized (c.f332530a) {
                try {
                    Q q12 = new Q(str, Boolean.valueOf(z12));
                    boolean z13 = false;
                    for (Map.Entry entry : c.f332531b.entrySet()) {
                        if (L.f(entry.getKey(), q12)) {
                            ((b) entry.getValue()).a(videoSink, str2);
                            z13 = true;
                        } else {
                            ((b) entry.getValue()).b(videoSink);
                        }
                    }
                    if (!z13) {
                        LinkedHashMap linkedHashMap = c.f332531b;
                        b bVar = (b) linkedHashMap.get(q12);
                        if (bVar == null) {
                            bVar = new b(q12);
                            linkedHashMap.put(q12, bVar);
                        }
                        bVar.a(videoSink, str2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(@k View view) {
        if (view instanceof SurfaceViewRenderer) {
            VideoSink videoSink = (VideoSink) view;
            synchronized (c.f332530a) {
                Iterator it = c.f332531b.entrySet().iterator();
                while (it.hasNext()) {
                    ((b) ((Map.Entry) it.next()).getValue()).b(videoSink);
                }
            }
            ((SurfaceViewRenderer) view).release();
        }
    }
}
