package com.avito.beduin.v2.avito.component.circularCounter.state;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.r;
import com.avito.beduin.v2.theme.s;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Content.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/circularCounter/state/j;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/circularCounter/state/i;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class j implements com.avito.beduin.v2.theme.d<i> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final j f334106a = new j();

    /* compiled from: Content.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/theme/r;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/theme/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<G, r> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f334107l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final r invoke(G g12) {
            r.a aVar = r.f338365d;
            return s.a(g12);
        }
    }

    @Y61.l
    public static i b(@Y61.k G g12) {
        String string = g12.getString("name");
        if (string == null) {
            return null;
        }
        String string2 = g12.getString("themeName");
        r rVar = (r) g12.f(a.f334107l, "color", "color");
        if (rVar == null) {
            return null;
        }
        return new i(string, string2, rVar);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ i a(G g12) {
        return b(g12);
    }
}
