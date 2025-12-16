package ru.cyberity.cbr.core.data.model;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.AvatarStatus;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RequiredIdDocStatus.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/cyberity/cbr/core/data/model/t;", "", "Lru/cyberity/cbr/core/data/model/remote/response/c;", AvatarStatus.REVIEW, "", "Lru/cyberity/cbr/core/data/model/Document;", "documents", "Lru/cyberity/cbr/core/data/model/remote/response/h;", "workflowStatus", "<init>", "(Lru/cyberity/cbr/core/data/model/remote/response/c;Ljava/util/List;Lru/cyberity/cbr/core/data/model/remote/response/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/model/remote/response/c;", "e", "()Lru/cyberity/cbr/core/data/model/remote/response/c;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Lru/cyberity/cbr/core/data/model/remote/response/h;", "f", "()Lru/cyberity/cbr/core/data/model/remote/response/h;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ru.cyberity.cbr.core.data.model.remote.response.c review;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final List<Document> documents;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ru.cyberity.cbr.core.data.model.remote.response.h workflowStatus;

    public t(@Y61.l ru.cyberity.cbr.core.data.model.remote.response.c cVar, @Y61.k List<Document> list, @Y61.l ru.cyberity.cbr.core.data.model.remote.response.h hVar) {
        this.review = cVar;
        this.documents = list;
        this.workflowStatus = hVar;
    }

    @Y61.k
    public final List<Document> d() {
        return this.documents;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final ru.cyberity.cbr.core.data.model.remote.response.c getReview() {
        return this.review;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return L.f(this.review, tVar.review) && L.f(this.documents, tVar.documents) && L.f(this.workflowStatus, tVar.workflowStatus);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final ru.cyberity.cbr.core.data.model.remote.response.h getWorkflowStatus() {
        return this.workflowStatus;
    }

    public int hashCode() {
        ru.cyberity.cbr.core.data.model.remote.response.c cVar = this.review;
        int iE2 = H.e((cVar == null ? 0 : cVar.hashCode()) * 31, 31, this.documents);
        ru.cyberity.cbr.core.data.model.remote.response.h hVar = this.workflowStatus;
        return iE2 + (hVar != null ? hVar.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        return "RequiredIdDocStatus(review=" + this.review + ", documents=" + this.documents + ", workflowStatus=" + this.workflowStatus + ')';
    }
}
