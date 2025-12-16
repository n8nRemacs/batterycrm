package com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.rendering.view_api;

import Y61.k;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VideoRendererStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/rendering/view_api/d;", "LMJ/b;", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements MJ.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f164436a = new d();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final LinkedHashMap f164437b = new LinkedHashMap();

    @Override // MJ.b
    @k
    public final synchronized MJ.a a(@k String str, boolean z12) {
        c cVar;
        ProxyKey proxyKey = new ProxyKey(str, z12);
        LinkedHashMap linkedHashMap = f164437b;
        cVar = (c) linkedHashMap.get(proxyKey);
        if (cVar == null) {
            cVar = new c(proxyKey);
            linkedHashMap.put(proxyKey, cVar);
        }
        return cVar.f164433d;
    }

    @Override // MJ.b
    public final synchronized void b(@k String str, boolean z12) {
        c cVar = (c) f164437b.remove(new ProxyKey(str, z12));
        if (cVar != null) {
            synchronized (cVar) {
                cVar.f164430a.clear();
            }
        }
    }
}
