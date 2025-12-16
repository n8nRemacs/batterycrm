package com.avito.beduin.v2.avito.component.text.state;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.G;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.N;

/* compiled from: AvitoWebViewStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/text/state/o;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/text/state/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class z extends N implements Y41.l<G, o> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f335391l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AbstractC36250j.b bVar) {
        super(1);
        this.f335391l = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final o invoke(G g12) {
        G g13 = g12;
        AbstractC36250j.b bVar = this.f335391l;
        com.avito.beduin.v2.component.common.utils.a aVarA = com.avito.beduin.v2.component.common.utils.h.a(bVar);
        String string = g13.getString(ContextActionHandler.Link.URL);
        if (string == null) {
            string = "";
        }
        String str = string;
        Boolean boolC = g13.c("enabled");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : true;
        B b12 = (B) g13.f(p.f335378l, "errorPlaceholder", "errorPlaceholder");
        F f12 = (F) g13.f(q.f335379l, "loadingPlaceholder", "loadingPlaceholder");
        String string2 = g13.getString("websiteDataStore");
        WebsiteDataStore websiteDataStore = null;
        if (string2 != null) {
            WebsiteDataStore.f335327c.getClass();
            Iterator it = ((AbstractC42738c) WebsiteDataStore.f335330f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((WebsiteDataStore) next).f335331b.equals(string2)) {
                    websiteDataStore = next;
                    break;
                }
            }
            websiteDataStore = websiteDataStore;
            if (websiteDataStore == null) {
                websiteDataStore = WebsiteDataStore.f335328d;
            }
        }
        Boolean boolC2 = g13.c("allowsContentJavaScript");
        return new o(str, zBooleanValue, b12, f12, websiteDataStore, boolC2 != null ? boolC2.booleanValue() : true, (Y41.a) g13.d(s.f335381l, "onSuccess", "onSuccess"), (Y41.l) g13.d(new u(bVar), "onError", "onError"), (Y41.l) g13.d(new w(bVar), "onPostMessage", "onPostMessage"), (Y41.l) g13.d(new y(bVar), "onDeeplinkRedirect", "onDeeplinkRedirect"), aVarA.f335704b, aVarA.f335705c, aVarA.f335706d, aVarA.f335707e, aVarA.f335703a);
    }
}
