package KN;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.C23424o;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.architecture_components.D;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: BaseCalendarViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LKN/b;", "Landroidx/lifecycle/M0;", "LKN/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class b extends M0 implements a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC28373a f9427E;

    /* renamed from: P, reason: collision with root package name */
    @l
    public com.avito.konveyor.adapter.a f9434P;

    /* renamed from: R, reason: collision with root package name */
    @l
    public HN.h f9436R;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final C23038g0<C23424o.e> f9428J = new C23038g0<>();

    /* renamed from: K, reason: collision with root package name */
    @k
    public final C23038g0<FlexDatesState> f9429K = new C23038g0<>();

    /* renamed from: L, reason: collision with root package name */
    @k
    public final C23038g0<G0> f9430L = new C23038g0<>();

    /* renamed from: M, reason: collision with root package name */
    @k
    public final C23038g0<G0> f9431M = new C23038g0<>();

    /* renamed from: N, reason: collision with root package name */
    @k
    public final C23038g0<Runnable> f9432N = new C23038g0<>();

    /* renamed from: O, reason: collision with root package name */
    @k
    public final D<PrintableText> f9433O = new D<>();

    /* renamed from: Q, reason: collision with root package name */
    @k
    public List<? extends TV0.a> f9435Q = C42784z0.f406748b;

    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f9427E = interfaceC28373a;
    }

    @Override // KN.a
    /* renamed from: H0, reason: from getter */
    public final C23038g0 getF9430L() {
        return this.f9430L;
    }

    @Override // KN.a
    public final void K1(@l com.avito.konveyor.adapter.a aVar) {
        this.f9434P = aVar;
        if (aVar != null) {
            aVar.c(new UV0.c(this.f9435Q));
        }
    }

    @Override // KN.a
    /* renamed from: Q6, reason: from getter */
    public final C23038g0 getF9429K() {
        return this.f9429K;
    }

    @Override // KN.a
    /* renamed from: R0, reason: from getter */
    public final C23038g0 getF9428J() {
        return this.f9428J;
    }

    @Override // KN.a
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF9431M() {
        return this.f9431M;
    }

    @Override // KN.a
    /* renamed from: j0, reason: from getter */
    public final C23038g0 getF9432N() {
        return this.f9432N;
    }

    @Override // KN.a
    /* renamed from: j1, reason: from getter */
    public final D getF9433O() {
        return this.f9433O;
    }

    public final void ke(@k Runnable runnable, @l Throwable th2) {
        this.f9428J.setValue(null);
        this.f9429K.setValue(null);
        this.f9430L.setValue(null);
        this.f9432N.setValue(runnable);
        this.f9431M.setValue(null);
        this.f9427E.c(new NonFatalErrorEvent("SellerCalendar: Something went wrong", th2, null, null, 12, null));
    }
}
