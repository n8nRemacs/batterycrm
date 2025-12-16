package BU;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.Metadata;

/* compiled from: ScreenLifecycleModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBU/c;", "Lcom/avito/beduin/v2/repository/screen_lifecycle/h;", "_design-modules_beduin-v2_interactions_repository_common_screen-lifecycle_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.beduin.v2.repository.screen_lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28373a f1399a;

    public c(InterfaceC28373a interfaceC28373a) {
        this.f1399a = interfaceC28373a;
    }

    @Override // com.avito.beduin.v2.repository.screen_lifecycle.h
    public final void log(@k String str) {
        this.f1399a.c(new NonFatalErrorEvent(str, null, null, null, 12, null));
    }
}
