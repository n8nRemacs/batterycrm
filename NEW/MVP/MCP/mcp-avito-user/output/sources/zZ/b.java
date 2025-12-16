package ZZ;

import Y61.k;
import androidx.compose.runtime.internal.P;
import b00.C25383b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.document_requirements.model.Document;
import com.avito.android.mortgage.document_requirements.mvi.entity.DocumentRequirementsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DocumentRequirementsAnalyticsHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZZ/b;", "LZZ/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f20204a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f20204a = interfaceC28373a;
    }

    @Override // ZZ.a
    public final void a(@k DocumentRequirementsInternalAction documentRequirementsInternalAction, @k C25383b c25383b) {
        Document document = c25383b.f56812c;
        if (document != null) {
            String str = document.f198969b;
            boolean z12 = documentRequirementsInternalAction instanceof DocumentRequirementsInternalAction.Init;
            InterfaceC28373a interfaceC28373a = this.f20204a;
            String str2 = c25383b.f56813d;
            if (z12) {
                interfaceC28373a.c(new e(str2, str));
            } else if (documentRequirementsInternalAction instanceof DocumentRequirementsInternalAction.DocumentClicked) {
                interfaceC28373a.c(new d(str2, ((DocumentRequirementsInternalAction.DocumentClicked) documentRequirementsInternalAction).f198988b.f198969b));
            }
        }
    }
}
