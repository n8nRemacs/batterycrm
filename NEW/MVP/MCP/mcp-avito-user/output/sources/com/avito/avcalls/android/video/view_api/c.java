package com.avito.avcalls.android.video.view_api;

import Y61.k;
import Y61.l;
import com.avito.avcalls.android.video.w;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: VideoRendererStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/video/view_api/c;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f332530a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final LinkedHashMap f332531b = new LinkedHashMap();

    @k
    public final synchronized w a(@k String str, boolean z12) {
        b bVar;
        Q q12 = new Q(str, Boolean.valueOf(z12));
        LinkedHashMap linkedHashMap = f332531b;
        bVar = (b) linkedHashMap.get(q12);
        if (bVar == null) {
            bVar = new b(q12);
            linkedHashMap.put(q12, bVar);
        }
        return bVar.f332527d;
    }

    public final synchronized void b(@k String str, boolean z12) {
        b bVar = (b) f332531b.remove(new Q(str, Boolean.valueOf(z12)));
        if (bVar != null) {
            synchronized (bVar) {
                bVar.f332524a.clear();
            }
        }
    }

    public final boolean equals(@l Object obj) {
        return this == obj || (obj instanceof c);
    }

    public final int hashCode() {
        return 370218847;
    }

    @k
    public final String toString() {
        return "VideoRendererStorage";
    }
}
