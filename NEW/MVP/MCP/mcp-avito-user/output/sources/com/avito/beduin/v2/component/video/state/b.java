package com.avito.beduin.v2.component.video.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/video/state/b;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/component/video/state/a;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.beduin.v2.theme.d<a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f336356a = new b();

    @Override // com.avito.beduin.v2.theme.d
    public final a a(G g12) {
        if (!L.f(g12.getString("mode"), "remoteUrl")) {
            return null;
        }
        d.f336359a.getClass();
        return d.b(g12);
    }
}
