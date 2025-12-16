package com.avito.beduin.v2.component.video.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: VideoState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/video/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/video/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f336372l = new f();

    public f() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        b.f336356a.getClass();
        if (!L.f(g13.getString("mode"), "remoteUrl")) {
            return null;
        }
        d.f336359a.getClass();
        return d.b(g13);
    }
}
