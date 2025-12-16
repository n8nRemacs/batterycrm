package com.avito.android.snippet.video;

import com.avito.android.snippet.video.p;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SnippetVideoStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/snippet/video/p;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/snippet/video/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends N implements Y41.l<G, p> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f284036l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(1);
        this.f284036l = sVar;
    }

    @Override // Y41.l
    public final p invoke(G g12) {
        G g13 = g12;
        Long lE2 = g13.e();
        return new p(lE2 != null ? lE2.longValue() : this.f284036l.f284037c.a(), (p.a) g13.f(q.f284035l, "video", "video"));
    }
}
