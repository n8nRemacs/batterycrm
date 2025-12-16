package com.avito.avcalls.android.video;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VideoProvider.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/android/video/x;", "invoke", "()Lcom/avito/avcalls/android/video/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class t extends N implements Y41.a<x> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.android.rtc.e f332508l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.avito.avcalls.android.rtc.e eVar) {
        super(0);
        this.f332508l = eVar;
    }

    @Override // Y41.a
    public final x invoke() {
        return new x(((com.avito.avcalls.android.rtc.w) this.f332508l.f331902a.getValue()).f331980b.createVideoSource(false));
    }
}
