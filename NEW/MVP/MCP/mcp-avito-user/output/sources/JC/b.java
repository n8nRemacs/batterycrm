package jC;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.Map;
import javax.inject.Inject;
import kC.C42566a;
import kC.C42567b;
import kotlin.Metadata;

/* compiled from: FakeDoorDialogAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjC/b;", "LjC/a;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements InterfaceC42231a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f405512a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f405512a = interfaceC28373a;
    }

    @Override // jC.InterfaceC42231a
    public final void a(@k String str, @k String str2, @l Map<String, String> map) {
        this.f405512a.c(new C42566a(str, str2, map));
    }

    @Override // jC.InterfaceC42231a
    public final void b(@k String str, @l Map<String, String> map) {
        this.f405512a.c(new C42567b(str, map));
    }

    @Override // jC.InterfaceC42231a
    public final void c(@k String str, @l Map<String, String> map) {
        this.f405512a.c(new kC.c(str, map));
    }
}
