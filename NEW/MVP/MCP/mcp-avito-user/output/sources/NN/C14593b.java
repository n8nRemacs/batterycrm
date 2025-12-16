package Nn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.provider.e;
import kotlin.Metadata;

/* compiled from: CategoryAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNn/b;", "LNn/a;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nn.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14593b implements InterfaceC14592a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f11744a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f11745b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TreeClickStreamParent f11746c;

    /* renamed from: d, reason: collision with root package name */
    public long f11747d;

    public C14593b(@k InterfaceC28373a interfaceC28373a, @k e eVar, @l TreeClickStreamParent treeClickStreamParent) {
        this.f11744a = interfaceC28373a;
        this.f11745b = eVar;
        this.f11746c = treeClickStreamParent;
        this.f11747d = eVar.a();
    }

    @Override // Nn.InterfaceC14592a
    public final void a(@k String str, @l String str2) {
        this.f11744a.c(new C14594c(str, str2));
    }

    @Override // Nn.InterfaceC14592a
    public final void b() {
        long jA2 = this.f11745b.a();
        this.f11747d = jA2;
        this.f11744a.c(new d(jA2, this.f11746c, 3244, 0));
    }

    @Override // Nn.InterfaceC14592a
    @k
    public final TreeClickStreamParent getParent() {
        return new TreeClickStreamParent(this.f11747d, "CATEGORY", null, null);
    }
}
