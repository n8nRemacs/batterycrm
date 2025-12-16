package ru.cyberity.cbr.core.presentation.helper;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.ApplicantStatus;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.g;

/* compiled from: DocumentItemsHelper.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/cyberity/cbr/core/presentation/helper/DocumentItemsParams;", "", "Lru/cyberity/cbr/core/data/model/ApplicantStatus;", "status", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "", "Lru/cyberity/cbr/core/data/model/Document;", "documents", "<init>", "(Lru/cyberity/cbr/core/data/model/ApplicantStatus;Lru/cyberity/cbr/core/data/model/g;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/ApplicantStatus;", "getStatus", "()Lru/cyberity/cbr/core/data/model/ApplicantStatus;", "Lru/cyberity/cbr/core/data/model/g;", "getApplicant", "()Lru/cyberity/cbr/core/data/model/g;", "Ljava/util/List;", "getDocuments", "()Ljava/util/List;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class DocumentItemsParams {

    @k
    private final g applicant;

    @k
    private final List<Document> documents;

    @k
    private final ApplicantStatus status;

    public DocumentItemsParams(@k ApplicantStatus applicantStatus, @k g gVar, @k List<Document> list) {
        this.status = applicantStatus;
        this.applicant = gVar;
        this.documents = list;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentItemsParams)) {
            return false;
        }
        DocumentItemsParams documentItemsParams = (DocumentItemsParams) other;
        return this.status == documentItemsParams.status && L.f(this.applicant, documentItemsParams.applicant) && L.f(this.documents, documentItemsParams.documents);
    }

    @k
    public final g getApplicant() {
        return this.applicant;
    }

    @k
    public final List<Document> getDocuments() {
        return this.documents;
    }

    @k
    public final ApplicantStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.documents.hashCode() + ((this.applicant.hashCode() + (this.status.hashCode() * 31)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentItemsParams(status=");
        sb2.append(this.status);
        sb2.append(", applicant=");
        sb2.append(this.applicant);
        sb2.append(", documents=");
        return H.p(sb2, this.documents, ')');
    }
}
