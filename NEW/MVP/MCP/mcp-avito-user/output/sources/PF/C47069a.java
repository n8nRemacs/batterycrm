package pf;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.analytics.event.report.ReportButtons;
import javax.inject.Inject;
import kotlin.Metadata;
import qf.C47392a;
import rf.C47650a;
import sf.C48166a;
import tf.C48659a;
import uf.C49046a;
import uf.C49047b;
import uf.C49048c;
import uf.C49050e;
import uf.C49051f;
import uf.C49052g;
import uf.C49053h;

/* compiled from: AutotekaAnalyticsInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpf/a;", "Lcom/avito/android/autoteka/data/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47069a implements com.avito.android.autoteka.data.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f428707a;

    @Inject
    public C47069a(@k InterfaceC28373a interfaceC28373a) {
        this.f428707a = interfaceC28373a;
    }

    @Override // com.avito.android.autoteka.data.a
    public final void a(@l String str, int i12, @l Long l12, @l String str2, @l String str3, @l String str4) {
        this.f428707a.c(new C49047b(str, i12, l12, str2, str3, str4));
    }

    @Override // com.avito.android.autoteka.data.a
    public final void b(@k String str, @k String str2, @k FromBlock fromBlock, int i12) {
        this.f428707a.c(new C49048c(str, str2, fromBlock, i12));
    }

    @Override // com.avito.android.autoteka.data.a
    public final void c(long j12, @k String str) {
        this.f428707a.c(new C47650a(str, j12));
    }

    @Override // com.avito.android.autoteka.data.a
    public final void d(@k String str) {
        this.f428707a.c(new C49046a(str));
    }

    @Override // com.avito.android.autoteka.data.a
    public final void e(@l String str, @l Long l12, @l Long l13, @l Long l14) {
        this.f428707a.c(new C47392a(str, l12, l13, l14));
    }

    @Override // com.avito.android.autoteka.data.a
    public final void f() {
        this.f428707a.c(new C48166a());
    }

    @Override // com.avito.android.autoteka.data.a
    public final void g() {
        FromBlock fromBlock = FromBlock.f96083c;
        this.f428707a.c(new C49050e());
    }

    @Override // com.avito.android.autoteka.data.a
    public final void h(@k String str) {
        FromBlock fromBlock = FromBlock.f96083c;
        this.f428707a.c(new C49051f(str));
    }

    @Override // com.avito.android.autoteka.data.a
    public final void i(@k String str) {
        this.f428707a.c(new C49052g(str));
    }

    @Override // com.avito.android.autoteka.data.a
    public final void j(@k String str) {
        this.f428707a.c(new C49053h(str));
    }

    @Override // com.avito.android.autoteka.data.a
    public final void k(@l String str, @k ReportButtons reportButtons, @k String str2) {
        this.f428707a.c(new C48659a(str, reportButtons, str2));
    }

    @Override // com.avito.android.autoteka.data.a
    public final void l(@k String str, @k String str2, @k FromBlock fromBlock) {
        this.f428707a.c(new C49048c(str, str2, fromBlock, 0, 8, null));
    }
}
