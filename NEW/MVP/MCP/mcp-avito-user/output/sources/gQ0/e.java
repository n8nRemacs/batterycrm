package gq0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import mq0.C44121a;
import mq0.C44122b;
import mq0.f;
import mq0.g;

/* compiled from: SelectMetroAnalytics.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgq0/e;", "Lgq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements InterfaceC40721a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f396878a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396879b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f396880c = MetroParameter.TYPE;

    public e(@k InterfaceC28373a interfaceC28373a) {
        this.f396878a = interfaceC28373a;
    }

    @Override // gq0.InterfaceC40721a
    public final void a(@l String str, @k String str2) {
        this.f396878a.c(new mq0.e(str, this.f396880c, str2));
    }

    @Override // gq0.InterfaceC40721a
    public final void b(@l String str) {
        this.f396878a.c(new mq0.c(str, this.f396880c));
    }

    @Override // gq0.InterfaceC40721a
    public final void c(int i12, @l Integer num) {
        this.f396878a.c(new c(i12, num));
    }

    @Override // gq0.InterfaceC40721a
    public final void d(int i12, @l Integer num, @k ArrayList arrayList) {
        this.f396878a.c(new d(i12, num, arrayList, this.f396879b));
    }

    @Override // gq0.InterfaceC40721a
    public final void e(int i12, @l Integer num, boolean z12, @k ArrayList arrayList) {
        this.f396878a.c(new b(i12, num, z12, arrayList, this.f396879b));
    }

    @Override // gq0.InterfaceC40721a
    public final void f(@l String str) {
        this.f396878a.c(new C44121a(str, this.f396880c));
    }

    @Override // gq0.InterfaceC40721a
    public final void g(@l String str) {
        this.f396878a.c(new C44122b(str, this.f396880c));
    }

    @Override // gq0.InterfaceC40721a
    public final void h(@l String str) {
        this.f396878a.c(new mq0.d(str, this.f396880c));
    }

    @Override // gq0.InterfaceC40721a
    public final void i(@l String str) {
        this.f396878a.c(new f(str, this.f396880c));
    }

    @Override // gq0.InterfaceC40721a
    public final void j(@l String str, @k String str2) {
        this.f396878a.c(new g(str, this.f396880c, str2));
    }
}
