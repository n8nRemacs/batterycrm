package zp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.comfortable_deal.api.model.CurrentStage;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageBannerAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzp/b;", "Lzp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50603b implements InterfaceC50602a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f444244a;

    @Inject
    public C50603b(@k InterfaceC28373a interfaceC28373a) {
        this.f444244a = interfaceC28373a;
    }

    @Override // zp.InterfaceC50602a
    public final void a(@l CurrentStage currentStage) {
        String strA;
        if (currentStage == null || (strA = C50605d.a(currentStage)) == null) {
            return;
        }
        this.f444244a.c(new e(strA));
    }

    @Override // zp.InterfaceC50602a
    public final void b(@l CurrentStage currentStage) {
        String strA;
        if (currentStage == null || (strA = C50605d.a(currentStage)) == null) {
            return;
        }
        j jVar = new j(strA);
        InterfaceC28373a interfaceC28373a = this.f444244a;
        interfaceC28373a.c(jVar);
        interfaceC28373a.c(new f(strA));
    }

    @Override // zp.InterfaceC50602a
    public final void c(@l CurrentStage currentStage) {
        String strA;
        if (currentStage == null || (strA = C50605d.a(currentStage)) == null) {
            return;
        }
        this.f444244a.c(new i(strA));
    }
}
