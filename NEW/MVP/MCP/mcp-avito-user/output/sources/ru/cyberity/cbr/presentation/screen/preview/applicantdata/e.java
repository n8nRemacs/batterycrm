package ru.cyberity.cbr.presentation.screen.preview.applicantdata;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.g;

/* compiled from: CBRApplicantDataDocumentViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/model/g;", "Lru/cyberity/cbr/core/data/model/DocumentType;", "type", "Lru/cyberity/cbr/core/data/model/g$c$a;", "b", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final g.c.a b(g gVar, DocumentType documentType) {
        Object next;
        Iterator<T> it = gVar.getRequiredIdDocs().g().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((g.c.a) next).getIdDocSetType(), documentType)) {
                break;
            }
        }
        return (g.c.a) next;
    }
}
