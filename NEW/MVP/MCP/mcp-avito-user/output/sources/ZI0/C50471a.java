package zI0;

import Y61.k;
import com.avito.android.deep_linking.links.MyAdvertDetailsResult;
import com.avito.android.user_adverts.tab_screens.adverts.n;
import javax.inject.Inject;
import kotlin.Metadata;
import zI0.InterfaceC50474d;

/* compiled from: ProfileHeaderListListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzI0/a;", "Lcom/avito/android/user_adverts/tab_screens/adverts/n;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zI0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50471a implements n {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC50474d f444011a;

    @Inject
    public C50471a(@k InterfaceC50474d interfaceC50474d) {
        this.f444011a = interfaceC50474d;
    }

    @Override // com.avito.android.user_adverts.tab_screens.adverts.n
    public final void a(@k n.a aVar) {
        if (!(aVar instanceof n.a.C9775a)) {
            boolean z12 = aVar instanceof n.a.b;
            return;
        }
        MyAdvertDetailsResult myAdvertDetailsResult = ((n.a.C9775a) aVar).f315528a;
        boolean z13 = myAdvertDetailsResult instanceof MyAdvertDetailsResult.Activated;
        InterfaceC50474d interfaceC50474d = this.f444011a;
        if (z13) {
            InterfaceC50474d.a.a(interfaceC50474d, false, true, ((MyAdvertDetailsResult.Activated) myAdvertDetailsResult).f133454c, null, false, null, 2029);
            return;
        }
        if ((myAdvertDetailsResult instanceof MyAdvertDetailsResult.Default) || (myAdvertDetailsResult instanceof MyAdvertDetailsResult.StatusChanged) || !(myAdvertDetailsResult instanceof MyAdvertDetailsResult.Stopped)) {
            return;
        }
        MyAdvertDetailsResult.Stopped stopped = (MyAdvertDetailsResult.Stopped) myAdvertDetailsResult;
        interfaceC50474d.h6(stopped.f133460e);
        String str = stopped.f133460e;
        boolean z14 = false;
        if (str != null && str.length() > 0) {
            z14 = true;
        }
        InterfaceC50474d.a.a(interfaceC50474d, stopped.f133459d, false, null, stopped.f133458c, z14, stopped.f133461f, 926);
    }
}
