package com.avito.android.developments_agency_search.screen.help_center.mvi;

import Ew.InterfaceC13538c;
import Gw.InterfaceC13923a;
import Gw.b;
import Qw.InterfaceC14939a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.developments_agency_search.screen.help_center.model.HelpCenterArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: HelpCenterActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/help_center/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LGw/a;", "LGw/b;", "LGw/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC13923a, Gw.b, Gw.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final HelpCenterArguments f138009a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14939a f138010b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13538c f138011c;

    @Inject
    public e(@Y61.k HelpCenterArguments helpCenterArguments, @Y61.k InterfaceC14939a interfaceC14939a, @Y61.k InterfaceC13538c interfaceC13538c) {
        this.f138009a = helpCenterArguments;
        this.f138010b = interfaceC14939a;
        this.f138011c = interfaceC13538c;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Gw.b> b(InterfaceC13923a interfaceC13923a, Gw.d dVar) {
        C43210w c43210w;
        InterfaceC13923a interfaceC13923a2 = interfaceC13923a;
        if (interfaceC13923a2 instanceof InterfaceC13923a.g) {
            return C43175k.G(new a(this, null));
        }
        if (interfaceC13923a2 instanceof InterfaceC13923a.C0382a) {
            return C43175k.G(new b(this, null));
        }
        if (interfaceC13923a2 instanceof InterfaceC13923a.b) {
            return C43175k.G(new c(this, interfaceC13923a2, null));
        }
        if (interfaceC13923a2 instanceof InterfaceC13923a.e) {
            return C43175k.G(new d(this, null));
        }
        if (interfaceC13923a2 instanceof InterfaceC13923a.c) {
            ((InterfaceC13923a.c) interfaceC13923a2).getClass();
            return new C43210w(new b.a("8 804 700-05-57"));
        }
        if (interfaceC13923a2 instanceof InterfaceC13923a.f) {
            c43210w = new C43210w(new b.e());
        } else {
            if (!(interfaceC13923a2 instanceof InterfaceC13923a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(b.g.f6790a);
        }
        return c43210w;
    }
}
