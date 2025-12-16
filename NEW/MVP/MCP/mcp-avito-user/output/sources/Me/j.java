package Me;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CompositeBrokerAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMe/j;", "LMe/i;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f10948a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f10949b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10950c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10951d;

    @Inject
    public j(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k @InterfaceC30174s String str) {
        this.f10948a = interfaceC28373a;
        this.f10949b = str;
    }

    @Override // Me.i
    public final void a(@Y61.l String str) {
        this.f10948a.c(new f(this.f10949b, str));
    }

    @Override // Me.i
    public final void b(@Y61.l String str) {
        if (this.f10950c) {
            return;
        }
        if (str == null) {
            str = "c2c_item_card";
        }
        this.f10948a.c(new h(this.f10949b, str));
        this.f10950c = true;
    }

    @Override // Me.i
    public final void c() {
        this.f10948a.c(new g(this.f10949b));
    }

    @Override // Me.i
    public final void d(@Y61.l String str) {
        if (str == null) {
            str = "c2c_item_card";
        }
        this.f10948a.c(new e(this.f10949b, str));
    }

    @Override // Me.i
    public final void e(@Y61.l String str) {
        if (this.f10951d) {
            return;
        }
        this.f10948a.c(new c(this.f10949b, str));
        this.f10951d = true;
    }

    @Override // Me.i
    public final void f(@Y61.l String str) {
        this.f10948a.c(new d(this.f10949b, str));
    }

    @Override // Me.i
    public final void g(@Y61.l String str, @Y61.l Map<String, String> map) {
        this.f10948a.c(new C14475b(this.f10949b, str, map));
    }
}
