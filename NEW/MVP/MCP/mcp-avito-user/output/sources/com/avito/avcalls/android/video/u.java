package com.avito.avcalls.android.video;

import com.avito.avcalls.android.config.Config;
import com.avito.avcalls.android.video.m;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.S;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: VideoProvider.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/android/video/o;", "invoke", "()Lcom/avito/avcalls/android/video/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class u extends N implements Y41.a<o> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.android.utils.coroutines.c f332509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f332510m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.android.config.f f332511n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m.a f332512o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.android.rtc.y f332513p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.android.utils.coroutines.h<CameraPosition> f332514q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.avito.avcalls.android.utils.coroutines.c cVar, v vVar, com.avito.avcalls.android.config.f fVar, m.a aVar, com.avito.avcalls.android.rtc.y yVar, com.avito.avcalls.android.utils.coroutines.h hVar) {
        super(0);
        this.f332509l = cVar;
        this.f332510m = vVar;
        this.f332511n = fVar;
        this.f332512o = aVar;
        this.f332513p = yVar;
        this.f332514q = hVar;
    }

    @Override // Y41.a
    public final o invoke() {
        com.avito.avcalls.android.utils.coroutines.c cVar = this.f332509l;
        C43238h c43238hA = U.a(cVar.f332438d.plus(t1.b()).plus(new S("capturer_coroutine")));
        x xVar = (x) this.f332510m.f332515a.getValue();
        Config f331673b = this.f332511n.getF331673b();
        com.avito.avcalls.android.utils.coroutines.h<CameraPosition> hVar = this.f332514q;
        return new o(xVar, f331673b, this.f332512o, c43238hA, this.f332513p, hVar);
    }
}
