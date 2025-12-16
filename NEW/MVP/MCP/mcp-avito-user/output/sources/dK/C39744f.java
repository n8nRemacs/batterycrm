package dk;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.brand_global_rubricator.l;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BrandGlobalRubricatorPresenterFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldk/f;", "Ldk/e;", "_avito_bx-content_widget_brand-global-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dk.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C39744f implements InterfaceC39743e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f394031a;

    @Inject
    public C39744f(@k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f394031a = gVar;
    }

    @Override // dk.InterfaceC39743e
    @k
    public final l a(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        return new l(this.f394031a, aVar, interfaceC28373a);
    }
}
