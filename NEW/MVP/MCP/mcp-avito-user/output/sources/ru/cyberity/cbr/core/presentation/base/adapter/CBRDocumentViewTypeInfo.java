package ru.cyberity.cbr.core.presentation.base.adapter;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.Document;

/* compiled from: CBRDocumentItems.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewTypeInfo;", "", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewTypeInfo$Type;", "type", "Lru/cyberity/cbr/core/data/model/Document;", "document", "<init>", "(Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewTypeInfo$Type;Lru/cyberity/cbr/core/data/model/Document;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewTypeInfo$Type;", "getType", "()Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewTypeInfo$Type;", "Lru/cyberity/cbr/core/data/model/Document;", "getDocument", "()Lru/cyberity/cbr/core/data/model/Document;", "Type", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CBRDocumentViewTypeInfo {

    @k
    private final Document document;

    @k
    private final Type type;

    /* compiled from: CBRDocumentItems.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewTypeInfo$Type;", "", "(Ljava/lang/String;I)V", "DOCUMENT", "VIDEO_IDENTIFICATION", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Type {
        DOCUMENT,
        VIDEO_IDENTIFICATION
    }

    public CBRDocumentViewTypeInfo(@k Type type, @k Document document) {
        this.type = type;
        this.document = document;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRDocumentViewTypeInfo)) {
            return false;
        }
        CBRDocumentViewTypeInfo cBRDocumentViewTypeInfo = (CBRDocumentViewTypeInfo) other;
        return this.type == cBRDocumentViewTypeInfo.type && L.f(this.document, cBRDocumentViewTypeInfo.document);
    }

    @k
    public final Document getDocument() {
        return this.document;
    }

    @k
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return this.document.hashCode() + (this.type.hashCode() * 31);
    }

    @k
    public String toString() {
        return "CBRDocumentViewTypeInfo(type=" + this.type + ", document=" + this.document + ')';
    }
}
