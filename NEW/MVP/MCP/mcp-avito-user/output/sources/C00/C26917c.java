package c00;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction;
import d00.d;
import f00.C40196c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DocumentUploadAnalyticsHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc00/c;", "Lc00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c00.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C26917c implements InterfaceC26916b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f57604a;

    @Inject
    public C26917c(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f57604a = interfaceC28373a;
    }

    @Override // c00.InterfaceC26916b
    public final void a(@Y61.k DocumentUploadInternalAction documentUploadInternalAction, @Y61.k C40196c c40196c) {
        String str;
        String str2 = c40196c.f395555o;
        if (str2 == null || (str = c40196c.f395556p) == null) {
            return;
        }
        boolean z12 = documentUploadInternalAction instanceof DocumentUploadInternalAction.Init;
        InterfaceC28373a interfaceC28373a = this.f57604a;
        String str3 = c40196c.f395554n;
        String str4 = c40196c.f395557q;
        if (z12) {
            interfaceC28373a.c(new m(str2, str, str3, str4));
            return;
        }
        boolean z13 = documentUploadInternalAction instanceof DocumentUploadInternalAction.AddFilesClick;
        String str5 = c40196c.f395552l;
        if (z13) {
            interfaceC28373a.c(new j(str5, str, str3, str4));
            interfaceC28373a.c(new e(((DocumentUploadInternalAction.AddFilesClick) documentUploadInternalAction).f199406b, str2, str, str4, str3));
            return;
        }
        if (documentUploadInternalAction instanceof DocumentUploadInternalAction.AddPhotoClick) {
            interfaceC28373a.c(new i(str5, str, str3, str4));
            interfaceC28373a.c(new e(((DocumentUploadInternalAction.AddPhotoClick) documentUploadInternalAction).f199407b, str2, str, str4, str3));
            return;
        }
        if (documentUploadInternalAction instanceof DocumentUploadInternalAction.NavigationStarted) {
            if (((DocumentUploadInternalAction.NavigationStarted) documentUploadInternalAction).f199418b) {
                interfaceC28373a.c(new k(str2, str, str3, str4));
                return;
            }
            return;
        }
        if (documentUploadInternalAction instanceof DocumentUploadInternalAction.FilesAdded) {
            interfaceC28373a.c(new l(str5, str, str3, str4));
            return;
        }
        if (!(documentUploadInternalAction instanceof DocumentUploadInternalAction.FileUpdated)) {
            if (documentUploadInternalAction instanceof DocumentUploadInternalAction.FileValidationError) {
                interfaceC28373a.c(new h(str5, str, str3, str4));
                return;
            } else {
                if (documentUploadInternalAction instanceof DocumentUploadInternalAction.RemoteFileDeleteStarted) {
                    interfaceC28373a.c(new f(str5, str, str3, str4));
                    return;
                }
                return;
            }
        }
        d00.d dVar = ((DocumentUploadInternalAction.FileUpdated) documentUploadInternalAction).f199409b.f393607d;
        if (dVar instanceof d.b) {
            interfaceC28373a.c(new g(str5, str, str3, str4));
        } else if (dVar instanceof d.a) {
            interfaceC28373a.c(new h(str5, str, str3, str4));
        }
    }
}
