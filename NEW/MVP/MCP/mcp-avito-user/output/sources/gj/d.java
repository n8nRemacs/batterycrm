package gj;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.SearchParams;
import java.util.Set;
import kj.C42699b;
import kotlin.Metadata;
import kotlin.collections.B0;
import pj.InterfaceC47100c;

/* compiled from: BeduinContextFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgj/d;", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface d {

    /* compiled from: BeduinContextFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static InterfaceC40691b a(d dVar, com.avito.android.deeplink_handler.handler.composite.a aVar, a.b bVar, InterfaceC47100c interfaceC47100c, Set set, C40692c c40692c, SearchParams searchParams, C42699b c42699b, int i12) {
            return dVar.a(aVar, bVar, interfaceC47100c, (i12 & 8) != 0 ? B0.f406639b : set, (i12 & 16) != 0 ? new C40692c(false, false, 3, null) : c40692c, (i12 & 32) != 0 ? null : searchParams, c42699b);
        }
    }

    @Y61.k
    com.avito.android.beduin.context.c a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.b bVar, @Y61.k InterfaceC47100c interfaceC47100c, @Y61.k Set set, @Y61.k C40692c c40692c, @Y61.l SearchParams searchParams, @Y61.k C42699b c42699b);
}
