package op;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContractSignAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lop/c;", "Lop/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: op.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44837c implements InterfaceC44835a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f420186a;

    @Inject
    public C44837c(@k InterfaceC28373a interfaceC28373a) {
        this.f420186a = interfaceC28373a;
    }

    @Override // op.InterfaceC44835a
    public final void a(@k String str) {
        this.f420186a.c(new C44836b(10618, str));
    }

    @Override // op.InterfaceC44835a
    public final void b(@k String str) {
        this.f420186a.c(new C44836b(10617, str));
    }

    @Override // op.InterfaceC44835a
    public final void c(@k String str) {
        this.f420186a.c(new C44836b(10619, str));
    }
}
