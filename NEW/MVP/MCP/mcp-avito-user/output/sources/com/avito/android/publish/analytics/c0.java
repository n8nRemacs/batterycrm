package com.avito.android.publish.analytics;

import Fd0.C13794a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaButtonAction;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishRealtyEventTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/c0;", "Lcom/avito/android/publish/analytics/b0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232200a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232201b;

    /* compiled from: PublishRealtyEventTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f232202a;

        static {
            int[] iArr = new int[CpaButtonAction.values().length];
            try {
                iArr[CpaButtonAction.SHOW_CPA_TARIFF_FORM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CpaButtonAction.SWITCH_TO_DEVELOPMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CpaButtonAction.START_NEW_PUBLISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f232202a = iArr;
        }
    }

    @Inject
    public c0(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f232200a = interfaceC28373a;
        this.f232201b = c50213a;
    }

    @Override // com.avito.android.publish.analytics.b0
    public final void b(@Y61.l CpaButtonAction cpaButtonAction) {
        int i12 = cpaButtonAction == null ? -1 : a.f232202a[cpaButtonAction.ordinal()];
        if (i12 == 1) {
            this.f232200a.c(new Fd0.c(this.f232201b.f443213e));
        } else if (i12 == 2) {
            this.f232200a.c(new Fd0.e(this.f232201b.f443213e));
        } else {
            if (i12 != 3) {
                return;
            }
            this.f232200a.c(new Fd0.d(this.f232201b.f443213e));
        }
    }

    @Override // com.avito.android.publish.analytics.b0
    public final void e() {
        this.f232200a.c(new C13794a(this.f232201b.f443213e));
    }

    @Override // com.avito.android.publish.analytics.b0
    public final void s(@Y61.l CpaButtonAction cpaButtonAction) {
        if (cpaButtonAction == null) {
            return;
        }
        if (a.f232202a[cpaButtonAction.ordinal()] == 1) {
            this.f232200a.c(new Fd0.f(this.f232201b.f443213e));
        } else {
            this.f232200a.c(new Fd0.g(this.f232201b.f443213e));
        }
    }
}
