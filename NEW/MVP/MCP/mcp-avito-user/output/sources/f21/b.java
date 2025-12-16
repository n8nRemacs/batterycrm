package F21;

import Y61.k;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.c0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ExpressionSubscriber.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"LF21/b;", "Lcom/yandex/div/core/view2/c0;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface b extends c0 {
    default void e(@k InterfaceC37911f interfaceC37911f) {
        if (interfaceC37911f != InterfaceC37911f.f367528l2) {
            getSubscriptions().add(interfaceC37911f);
        }
    }

    default void g() {
        Iterator<T> it = getSubscriptions().iterator();
        while (it.hasNext()) {
            ((InterfaceC37911f) it.next()).close();
        }
        getSubscriptions().clear();
    }

    @k
    List<InterfaceC37911f> getSubscriptions();

    @Override // com.yandex.div.core.view2.c0
    default void release() {
        g();
    }
}
