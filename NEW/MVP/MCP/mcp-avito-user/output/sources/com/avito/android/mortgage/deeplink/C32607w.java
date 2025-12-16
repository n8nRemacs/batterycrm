package com.avito.android.mortgage.deeplink;

import a00.C19661a;
import androidx.fragment.app.DialogFragment;
import com.avito.android.mortgage.document_requirements.DocumentRequirementsDialog;
import com.avito.android.mortgage.document_requirements.model.Document;
import com.avito.android.mortgage.document_requirements.model.DocumentRequirementsArguments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MortgageDocumentRequirementsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.deeplink.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32607w extends kotlin.jvm.internal.N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageDocumentRequirementsLink f198900l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32607w(C32608x c32608x, MortgageDocumentRequirementsLink mortgageDocumentRequirementsLink) {
        super(0);
        this.f198900l = mortgageDocumentRequirementsLink;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        DocumentRequirementsDialog.a aVar = DocumentRequirementsDialog.f198920l0;
        MortgageDocumentRequirementsLink mortgageDocumentRequirementsLink = this.f198900l;
        Document documentA = C19661a.a(mortgageDocumentRequirementsLink.f198699b);
        List<String> list = mortgageDocumentRequirementsLink.f198700c;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Document documentA2 = C19661a.a((String) it.next());
            if (documentA2 != null) {
                arrayList.add(documentA2);
            }
        }
        DocumentRequirementsArguments documentRequirementsArguments = new DocumentRequirementsArguments(documentA, arrayList, mortgageDocumentRequirementsLink.f198701d);
        aVar.getClass();
        return DocumentRequirementsDialog.a.a(documentRequirementsArguments);
    }
}
