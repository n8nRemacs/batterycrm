package ru.cyberity.cbr.presentation.screen;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.log.c;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRAppViewModelUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"", "Lru/cyberity/cbr/core/data/model/Document;", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "filterVideoIdentUnSubmittedAndRejectedDocuments", "nextDocument", "cyberity-mobile-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRAppViewModelUtilsKt {
    @l
    public static final List<Document> filterVideoIdentUnSubmittedAndRejectedDocuments(@k List<Document> list, @k g gVar) {
        List<String> listJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Document document = (Document) obj;
            if (gVar.getRequiredIdDocs().getVideoIdent() && ((listJ = gVar.getRequiredIdDocs().j()) == null || !listJ.contains(document.getType().getValue()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Document document2 = (Document) next;
            if (!document2.isSubmitted() || document2.isRejected()) {
                arrayList2.add(next);
            }
        }
        Logger.v$default(ru.cyberity.log.a.f436064a, c.a(CBRAppViewModel.INSTANCE), "moveToNextStep: total docs " + list.size() + ", videoIdent docs left " + arrayList2.size(), null, 4, null);
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    @l
    public static final Document nextDocument(@k List<Document> list, @k g gVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z12 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Document document = (Document) next;
            if (gVar.getRequiredIdDocs().getVideoIdent()) {
                List<String> listJ = gVar.getRequiredIdDocs().j();
                if (!(listJ != null ? listJ.contains(document.getType().getValue()) : false)) {
                    z12 = false;
                }
            }
            if (z12) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Document document2 = (Document) next2;
            if (!document2.isSubmitted() || document2.isRejected()) {
                arrayList2.add(next2);
            }
        }
        Logger.v$default(ru.cyberity.log.a.f436064a, c.a(CBRAppViewModel.INSTANCE), "moveToNextStep: total docs " + list.size() + ", docs left " + arrayList2.size(), null, 4, null);
        return (Document) C42745f0.G(arrayList2);
    }
}
