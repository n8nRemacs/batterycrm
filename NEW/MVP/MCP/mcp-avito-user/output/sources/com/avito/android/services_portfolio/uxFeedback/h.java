package com.avito.android.services_portfolio.uxFeedback;

import AK0.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import ov0.InterfaceC44945a;

/* compiled from: ServicesPortfolioStorageImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_portfolio/uxFeedback/h;", "Lov0/a;", "a", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements InterfaceC44945a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f280405a;

    /* compiled from: ServicesPortfolioStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/services_portfolio/uxFeedback/h$a;", "", "<init>", "()V", "", "SERVICES_PORTFOLIO_WIDGET_SHOWN", "Ljava/lang/String;", "SERVICES_REALTY_SHEET_UX_FEEDBACK_SHOWN_KEY", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public h(@k l lVar) {
        this.f280405a = lVar;
    }

    @Override // ov0.InterfaceC44945a
    public final void a(long j12) {
        l lVar = this.f280405a;
        Set<String> setF = lVar.f("services_portfolio_widget_shown_key");
        if (setF == null) {
            setF = B0.f406639b;
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(setF);
        if (linkedHashSetO0.size() == 2) {
            return;
        }
        linkedHashSetO0.add(String.valueOf(j12));
        lVar.putStringSet("services_portfolio_widget_shown_key", linkedHashSetO0);
    }
}
