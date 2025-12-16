package com.avito.avcalls.android.video;

import com.avito.avcalls.android.config.Config;
import com.avito.avcalls.android.video.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: VideoController.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/android/video/k;", "invoke", "()Lcom/avito/avcalls/android/video/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class n extends N implements Y41.a<k> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m.a f332493l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f332494m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f332495n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m.a aVar, x xVar, Config config, o oVar) {
        super(0);
        this.f332493l = aVar;
        this.f332494m = xVar;
        this.f332495n = oVar;
    }

    @Override // Y41.a
    public final k invoke() {
        if (!L.f(this.f332493l, m.a.f332492a)) {
            throw new NoWhenBranchMatchedException();
        }
        o oVar = this.f332495n;
        return new e(this.f332494m, oVar.f332497b, oVar.f332498c);
    }
}
