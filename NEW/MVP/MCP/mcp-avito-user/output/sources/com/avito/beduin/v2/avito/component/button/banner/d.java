package com.avito.beduin.v2.avito.component.button.banner;

import Y41.q;
import com.avito.beduin.v2.avito.component.button.banner.a;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoBannerStateFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/engine/component/i;", "component", "", "<anonymous parameter 1>", "Lcom/avito/beduin/v2/avito/component/button/banner/a$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Lcom/avito/beduin/v2/engine/component/i;Ljava/lang/String;)Lcom/avito/beduin/v2/avito/component/button/banner/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements q<G, InterfaceC36249i, String, a.C10369a> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f333920l = new d();

    public d() {
        super(3);
    }

    @Override // Y41.q
    public final a.C10369a invoke(G g12, InterfaceC36249i interfaceC36249i, String str) {
        G g13 = g12;
        InterfaceC36249i interfaceC36249i2 = interfaceC36249i;
        ET0.b bVar = (ET0.b) g13.f(b.f333918l, "layout_margin", "layout_margin");
        if (bVar == null) {
            bVar = (ET0.b) g13.f(c.f333919l, "layout_padding", "layout_padding");
        }
        return new a.C10369a(interfaceC36249i2, new a.C10369a.C10370a(bVar));
    }
}
