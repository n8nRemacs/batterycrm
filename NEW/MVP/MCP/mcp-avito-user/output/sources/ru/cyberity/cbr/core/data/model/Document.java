package ru.cyberity.cbr.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AvatarStatus;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Document.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000bR\u0013\u0010'\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0011\u0010*\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0011\u0010-\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u0010.\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b.\u0010+¨\u00060"}, d2 = {"Lru/cyberity/cbr/core/data/model/Document;", "Landroid/os/Parcelable;", "Lru/cyberity/cbr/core/data/model/DocumentType;", "type", "Lru/cyberity/cbr/core/data/model/Document$b;", "result", "<init>", "(Lru/cyberity/cbr/core/data/model/DocumentType;Lru/cyberity/cbr/core/data/model/Document$b;)V", "component1", "()Lru/cyberity/cbr/core/data/model/DocumentType;", "component2", "()Lru/cyberity/cbr/core/data/model/Document$b;", "copy", "(Lru/cyberity/cbr/core/data/model/DocumentType;Lru/cyberity/cbr/core/data/model/Document$b;)Lru/cyberity/cbr/core/data/model/Document;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/model/DocumentType;", "getType", "Lru/cyberity/cbr/core/data/model/Document$b;", "getResult", "Lru/cyberity/cbr/core/data/model/Document$b$b;", "getReview", "()Lru/cyberity/cbr/core/data/model/Document$b$b;", AvatarStatus.REVIEW, "getCountry", "country", "isRejected", "()Z", "isApproved", "isSubmitted", "isReviewing", "b", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class Document implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Document> CREATOR = new a();

    @Y61.l
    private final b result;

    @Y61.k
    private final DocumentType type;

    /* compiled from: Document.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<Document> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Document createFromParcel(@Y61.k Parcel parcel) {
            return new Document(DocumentType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Document[] newArray(int i12) {
            return new Document[i12];
        }
    }

    public Document(@Y61.k DocumentType documentType, @Y61.l b bVar) {
        this.type = documentType;
        this.result = bVar;
    }

    public static /* synthetic */ Document copy$default(Document document, DocumentType documentType, b bVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            documentType = document.type;
        }
        if ((i12 & 2) != 0) {
            bVar = document.result;
        }
        return document.copy(documentType, bVar);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final DocumentType getType() {
        return this.type;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final b getResult() {
        return this.result;
    }

    @Y61.k
    public final Document copy(@Y61.k DocumentType type, @Y61.l b result) {
        return new Document(type, result);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Document)) {
            return false;
        }
        Document document = (Document) other;
        return L.f(this.type, document.type) && L.f(this.result, document.result);
    }

    @Y61.l
    public final String getCountry() {
        b bVar = this.result;
        if (bVar != null) {
            return bVar.getCountry();
        }
        return null;
    }

    @Y61.l
    public final b getResult() {
        return this.result;
    }

    @Y61.l
    public final b.C12444b getReview() {
        Map<Integer, b.C12444b> mapI;
        Collection<b.C12444b> collectionValues;
        b.C12444b review;
        b bVar = this.result;
        Object obj = null;
        if (((bVar == null || (review = bVar.getReview()) == null) ? null : review.getAnswer()) != null) {
            return this.result.getReview();
        }
        b bVar2 = this.result;
        if (bVar2 == null || (mapI = bVar2.i()) == null || (collectionValues = mapI.values()) == null) {
            return null;
        }
        Iterator<T> it = collectionValues.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((b.C12444b) next).getAnswer() != null) {
                obj = next;
                break;
            }
        }
        return (b.C12444b) obj;
    }

    @Y61.k
    public final DocumentType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        b bVar = this.result;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final boolean isApproved() {
        b.C12444b review;
        Map<Integer, b.C12444b> mapI;
        Collection<b.C12444b> collectionValues;
        b bVar = this.result;
        if (bVar == null || (mapI = bVar.i()) == null || (collectionValues = mapI.values()) == null) {
            b bVar2 = this.result;
            return (bVar2 == null || (review = bVar2.getReview()) == null || review.getAnswer() != ReviewAnswerType.Green) ? false : true;
        }
        if (!collectionValues.isEmpty()) {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((b.C12444b) it.next()).getAnswer() == ReviewAnswerType.Green) {
                }
            }
        }
    }

    public final boolean isRejected() {
        b.C12444b review;
        Map<Integer, b.C12444b> mapI;
        Collection<b.C12444b> collectionValues;
        b bVar = this.result;
        if (bVar == null || (mapI = bVar.i()) == null || (collectionValues = mapI.values()) == null) {
            b bVar2 = this.result;
            return (bVar2 == null || (review = bVar2.getReview()) == null || review.getAnswer() != ReviewAnswerType.Red) ? false : true;
        }
        if (!collectionValues.isEmpty()) {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((b.C12444b) it.next()).getAnswer() == ReviewAnswerType.Red) {
                }
            }
        }
    }

    public final boolean isReviewing() {
        Map<Integer, b.C12444b> mapI;
        Collection<b.C12444b> collectionValues;
        b bVar = this.result;
        if (bVar != null && (mapI = bVar.i()) != null && (collectionValues = mapI.values()) != null && !collectionValues.isEmpty()) {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((b.C12444b) it.next()).getAnswer() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isSubmitted() {
        b bVar = this.result;
        return (bVar != null ? bVar.getReview() : null) != null;
    }

    @Y61.k
    public String toString() {
        return "Document(type=" + this.type + ", result=" + this.result + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        this.type.writeToParcel(parcel, flags);
        b bVar = this.result;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: Document.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/cyberity/cbr/core/data/model/Document$b;", "Landroid/os/Parcelable;", "Lru/cyberity/cbr/core/data/model/Document$b$b;", AvatarStatus.REVIEW, "", "country", "identity", "", "", "imageIds", "", "imageResult", "<init>", "(Lru/cyberity/cbr/core/data/model/Document$b$b;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lru/cyberity/cbr/core/data/model/Document$b$b;", "j", "()Lru/cyberity/cbr/core/data/model/Document$b$b;", "b", "Ljava/lang/String;", "f", "c", "g", "d", "Ljava/util/List;", "h", "()Ljava/util/List;", "e", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @K51.d
    public static final /* data */ class b implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final C12444b review;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String country;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String identity;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final List<Integer> imageIds;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Map<Integer, C12444b> imageResult;

        /* compiled from: Document.kt */
        @K51.d
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/cyberity/cbr/core/data/model/Document$b$b;", "Landroid/os/Parcelable;", "Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "answer", "", "moderationComment", "clientComment", "", "rejectLabels", "<init>", "(Lru/cyberity/cbr/core/data/model/ReviewAnswerType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "e", "()Lru/cyberity/cbr/core/data/model/ReviewAnswerType;", "b", "Ljava/lang/String;", "g", "c", "f", "d", "Ljava/util/List;", "h", "()Ljava/util/List;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.Document$b$b, reason: collision with other inner class name */
        public static final /* data */ class C12444b implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<C12444b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final ReviewAnswerType answer;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String moderationComment;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String clientComment;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final List<String> rejectLabels;

            /* compiled from: Document.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            /* renamed from: ru.cyberity.cbr.core.data.model.Document$b$b$a */
            public static final class a implements Parcelable.Creator<C12444b> {
                @Override // android.os.Parcelable.Creator
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C12444b createFromParcel(@Y61.k Parcel parcel) {
                    return new C12444b(parcel.readInt() == 0 ? null : ReviewAnswerType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                @Y61.k
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C12444b[] newArray(int i12) {
                    return new C12444b[i12];
                }
            }

            public C12444b(@Y61.l ReviewAnswerType reviewAnswerType, @Y61.l String str, @Y61.l String str2, @Y61.l List<String> list) {
                this.answer = reviewAnswerType;
                this.moderationComment = str;
                this.clientComment = str2;
                this.rejectLabels = list;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Y61.l
            /* renamed from: e, reason: from getter */
            public final ReviewAnswerType getAnswer() {
                return this.answer;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C12444b)) {
                    return false;
                }
                C12444b c12444b = (C12444b) other;
                return this.answer == c12444b.answer && L.f(this.moderationComment, c12444b.moderationComment) && L.f(this.clientComment, c12444b.clientComment) && L.f(this.rejectLabels, c12444b.rejectLabels);
            }

            @Y61.l
            /* renamed from: g, reason: from getter */
            public final String getModerationComment() {
                return this.moderationComment;
            }

            public int hashCode() {
                ReviewAnswerType reviewAnswerType = this.answer;
                int iHashCode = (reviewAnswerType == null ? 0 : reviewAnswerType.hashCode()) * 31;
                String str = this.moderationComment;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.clientComment;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                List<String> list = this.rejectLabels;
                return iHashCode3 + (list != null ? list.hashCode() : 0);
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Review(answer=");
                sb2.append(this.answer);
                sb2.append(", moderationComment=");
                sb2.append(this.moderationComment);
                sb2.append(", clientComment=");
                sb2.append(this.clientComment);
                sb2.append(", rejectLabels=");
                return H.p(sb2, this.rejectLabels, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@Y61.k Parcel parcel, int flags) {
                ReviewAnswerType reviewAnswerType = this.answer;
                if (reviewAnswerType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(reviewAnswerType.name());
                }
                parcel.writeString(this.moderationComment);
                parcel.writeString(this.clientComment);
                parcel.writeStringList(this.rejectLabels);
            }
        }

        public b(@Y61.l C12444b c12444b, @Y61.l String str, @Y61.l String str2, @Y61.l List<Integer> list, @Y61.l Map<Integer, C12444b> map) {
            this.review = c12444b;
            this.country = str;
            this.identity = str2;
            this.imageIds = list;
            this.imageResult = map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return L.f(this.review, bVar.review) && L.f(this.country, bVar.country) && L.f(this.identity, bVar.identity) && L.f(this.imageIds, bVar.imageIds) && L.f(this.imageResult, bVar.imageResult);
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        @Y61.l
        public final List<Integer> h() {
            return this.imageIds;
        }

        public int hashCode() {
            C12444b c12444b = this.review;
            int iHashCode = (c12444b == null ? 0 : c12444b.hashCode()) * 31;
            String str = this.country;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.identity;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<Integer> list = this.imageIds;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Map<Integer, C12444b> map = this.imageResult;
            return iHashCode4 + (map != null ? map.hashCode() : 0);
        }

        @Y61.l
        public final Map<Integer, C12444b> i() {
            return this.imageResult;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final C12444b getReview() {
            return this.review;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Result(review=");
            sb2.append(this.review);
            sb2.append(", country=");
            sb2.append(this.country);
            sb2.append(", identity=");
            sb2.append(this.identity);
            sb2.append(", imageIds=");
            sb2.append(this.imageIds);
            sb2.append(", imageResult=");
            return androidx.appcompat.app.r.w(sb2, this.imageResult, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            C12444b c12444b = this.review;
            if (c12444b == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                c12444b.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.country);
            parcel.writeString(this.identity);
            List<Integer> list = this.imageIds;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeInt(((Number) itA.next()).intValue());
                }
            }
            Map<Integer, C12444b> map = this.imageResult;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeInt(((Number) entry.getKey()).intValue());
                ((C12444b) entry.getValue()).writeToParcel(parcel, flags);
            }
        }

        /* compiled from: Document.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(@Y61.k Parcel parcel) {
                ArrayList arrayList;
                LinkedHashMap linkedHashMap = null;
                C12444b c12444bCreateFromParcel = parcel.readInt() == 0 ? null : C12444b.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iD2 = 0;
                    while (iD2 != i12) {
                        iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    int i13 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        linkedHashMap.put(Integer.valueOf(parcel.readInt()), C12444b.CREATOR.createFromParcel(parcel));
                    }
                }
                return new b(c12444bCreateFromParcel, string, string2, arrayList, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i12) {
                return new b[i12];
            }
        }
    }
}
