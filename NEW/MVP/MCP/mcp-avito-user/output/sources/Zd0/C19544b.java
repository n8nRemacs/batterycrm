package Zd0;

import Y61.k;
import ae0.C19876a;
import ae0.C19877b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.NavigationKt;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import yc.C50213a;

/* compiled from: PublishDraftEventTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZd0/b;", "LZd0/a;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zd0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C19544b implements InterfaceC19543a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f20317a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C50213a f20318b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Gson f20319c;

    public C19544b(@k InterfaceC28373a interfaceC28373a, @k C50213a c50213a, @k Gson gson) {
        this.f20317a = interfaceC28373a;
        this.f20318b = c50213a;
        this.f20319c = gson;
    }

    @Override // Zd0.InterfaceC19543a
    public final void a(@k Navigation navigation2, @k String str) {
        Integer categoryId = navigation2.getCategoryId();
        List<Map<String, String>> attributes = navigation2.getAttributes();
        this.f20317a.c(new C19877b(this.f20318b, categoryId, attributes != null ? NavigationKt.toAnalyticsFormat(attributes, this.f20319c) : null, str));
    }

    @Override // Zd0.InterfaceC19543a
    public final void b(int i12, @k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long lZ02 = C43066x.z0((String) it.next());
            if (lZ02 != null) {
                arrayList2.add(lZ02);
            }
        }
        this.f20317a.c(new C19876a(this.f20318b, i12, arrayList2));
    }
}
