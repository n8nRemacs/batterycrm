package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.iac_analytics.public_module.analytics_models.CallEnablingScenario;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario;
import com.avito.android.iac_analytics.public_module.analytics_models.MicAccessScenario;
import com.avito.android.publish.details.iac.IacPermissionRequestSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import nJ.C44266a;
import nJ.C44276k;
import yc.C50213a;

/* compiled from: PublishCallsEventTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/i;", "Lcom/avito/android/publish/analytics/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.analytics.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33523i implements InterfaceC33522h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232246a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232247b;

    /* compiled from: PublishCallsEventTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.analytics.i$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[IacPermissionRequestSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IacPermissionRequestSource iacPermissionRequestSource = IacPermissionRequestSource.f234701b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IacPermissionRequestSource iacPermissionRequestSource2 = IacPermissionRequestSource.f234701b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IacPermissionRequestSource iacPermissionRequestSource3 = IacPermissionRequestSource.f234701b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public C33523i(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f232246a = interfaceC28373a;
        this.f232247b = c50213a;
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33522h
    public final void H0(int i12, boolean z12) {
        this.f232246a.c(new nJ.u(this.f232247b.f443213e, i12, z12));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33522h
    public final void T() {
        this.f232246a.c(new nJ.O(CallsPopupType.f164278c, IacEnablingScenario.f164283d, null, 4, null));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33522h
    public final void W(boolean z12, boolean z13) {
        this.f232246a.c(new C44266a(this.f232247b.b(), z12 ? CallsPopupType.f164278c : CallsPopupType.f164277b, this.f232247b.f443213e, z13 ? CallEnablingScenario.f164273b : CallEnablingScenario.f164274c));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33522h
    public final void Y(boolean z12, @Y61.k IacPermissionRequestSource iacPermissionRequestSource) {
        MicAccessScenario micAccessScenario;
        String strB = this.f232247b.b();
        int iOrdinal = iacPermissionRequestSource.ordinal();
        if (iOrdinal == 0) {
            micAccessScenario = MicAccessScenario.f164290c;
        } else if (iOrdinal == 1) {
            micAccessScenario = MicAccessScenario.f164292e;
        } else if (iOrdinal == 2) {
            micAccessScenario = MicAccessScenario.f164291d;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            micAccessScenario = MicAccessScenario.f164298k;
        }
        this.f232246a.c(new nJ.J(z12, micAccessScenario, null, null, strB, null, 44, null));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33522h
    public final void f0() {
        this.f232246a.c(new C44276k(CallsPopupType.f164278c, IacEnablingScenario.f164283d, null, 4, null));
    }
}
