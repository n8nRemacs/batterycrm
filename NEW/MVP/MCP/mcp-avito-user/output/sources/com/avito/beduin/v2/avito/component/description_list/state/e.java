package com.avito.beduin.v2.avito.component.description_list.state;

import com.avito.beduin.v2.avito.component.description_list.state.a;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoDescriptionListStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/description_list/state/a$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/description_list/state/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.l<G, a.C10373a> {

    /* renamed from: l, reason: collision with root package name */
    public static final e f334243l = new e();

    public e() {
        super(1);
    }

    @Override // Y41.l
    public final a.C10373a invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("title");
        if (string == null) {
            string = "";
        }
        String string2 = g13.getString("description");
        return new a.C10373a(string, string2 != null ? string2 : "", (a.b) g13.f(b.f334240l, "icon", "icon"), (Y41.a) g13.d(d.f334242l, "onIconClick", "onIconClick"));
    }
}
