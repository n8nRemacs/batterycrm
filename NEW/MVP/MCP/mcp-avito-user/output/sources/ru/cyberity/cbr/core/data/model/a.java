package ru.cyberity.cbr.core.data.model;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.AvatarStatus;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Action.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001cBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u0011R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/cyberity/cbr/core/data/model/a;", "", "", "id", "applicantId", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "type", "createdAt", "externalActionId", "", "Lru/cyberity/cbr/core/data/model/a$a;", "docSets", "Lru/cyberity/cbr/core/data/model/a$b;", AvatarStatus.REVIEW, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowActionType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/cyberity/cbr/core/data/model/a$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "l", "b", "h", "c", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "n", "()Lru/cyberity/cbr/core/data/model/FlowActionType;", "d", "i", "e", "k", "f", "Ljava/util/List;", "j", "()Ljava/util/List;", "g", "Lru/cyberity/cbr/core/data/model/a$b;", "m", "()Lru/cyberity/cbr/core/data/model/a$b;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String applicantId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final FlowActionType type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String createdAt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String externalActionId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final List<C12447a> docSets;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final b review;

    /* compiled from: Action.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/cyberity/cbr/core/data/model/a$a;", "", "Lru/cyberity/cbr/core/data/model/DocumentType;", "idDocSetType", "", "", "types", "Lru/cyberity/cbr/core/data/model/VideoRequiredType;", "videoRequired", "<init>", "(Lru/cyberity/cbr/core/data/model/DocumentType;Ljava/util/List;Lru/cyberity/cbr/core/data/model/VideoRequiredType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/model/DocumentType;", "d", "()Lru/cyberity/cbr/core/data/model/DocumentType;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Lru/cyberity/cbr/core/data/model/VideoRequiredType;", "f", "()Lru/cyberity/cbr/core/data/model/VideoRequiredType;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12447a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final DocumentType idDocSetType;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<String> types;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final VideoRequiredType videoRequired;

        public C12447a(@Y61.k DocumentType documentType, @Y61.k List<String> list, @Y61.k VideoRequiredType videoRequiredType) {
            this.idDocSetType = documentType;
            this.types = list;
            this.videoRequired = videoRequiredType;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C12447a)) {
                return false;
            }
            C12447a c12447a = (C12447a) other;
            return L.f(this.idDocSetType, c12447a.idDocSetType) && L.f(this.types, c12447a.types) && this.videoRequired == c12447a.videoRequired;
        }

        public int hashCode() {
            return this.videoRequired.hashCode() + H.e(this.idDocSetType.hashCode() * 31, 31, this.types);
        }

        @Y61.k
        public String toString() {
            return "DocSetsItem(idDocSetType=" + this.idDocSetType + ", types=" + this.types + ", videoRequired=" + this.videoRequired + ')';
        }
    }

    /* compiled from: Action.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\r¨\u0006\""}, d2 = {"Lru/cyberity/cbr/core/data/model/a$b;", "", "", "reprocessing", "", "notificationFailureCnt", "", "reviewStatus", "autoChecked", "createDate", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "j", "d", "f", "e", "g", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Boolean reprocessing;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Integer notificationFailureCnt;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String reviewStatus;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Boolean autoChecked;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String createDate;

        public b(@Y61.l Boolean bool, @Y61.l Integer num, @Y61.l String str, @Y61.l Boolean bool2, @Y61.l String str2) {
            this.reprocessing = bool;
            this.notificationFailureCnt = num;
            this.reviewStatus = str;
            this.autoChecked = bool2;
            this.createDate = str2;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return L.f(this.reprocessing, bVar.reprocessing) && L.f(this.notificationFailureCnt, bVar.notificationFailureCnt) && L.f(this.reviewStatus, bVar.reviewStatus) && L.f(this.autoChecked, bVar.autoChecked) && L.f(this.createDate, bVar.createDate);
        }

        public int hashCode() {
            Boolean bool = this.reprocessing;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Integer num = this.notificationFailureCnt;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.reviewStatus;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.autoChecked;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.createDate;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Review(reprocessing=");
            sb2.append(this.reprocessing);
            sb2.append(", notificationFailureCnt=");
            sb2.append(this.notificationFailureCnt);
            sb2.append(", reviewStatus=");
            sb2.append(this.reviewStatus);
            sb2.append(", autoChecked=");
            sb2.append(this.autoChecked);
            sb2.append(", createDate=");
            return C22026a.c(sb2, this.createDate, ')');
        }
    }

    public a(@Y61.k String str, @Y61.k String str2, @Y61.k FlowActionType flowActionType, @Y61.k String str3, @Y61.k String str4, @Y61.k List<C12447a> list, @Y61.k b bVar) {
        this.id = str;
        this.applicantId = str2;
        this.type = flowActionType;
        this.createdAt = str3;
        this.externalActionId = str4;
        this.docSets = list;
        this.review = bVar;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return L.f(this.id, aVar.id) && L.f(this.applicantId, aVar.applicantId) && L.f(this.type, aVar.type) && L.f(this.createdAt, aVar.createdAt) && L.f(this.externalActionId, aVar.externalActionId) && L.f(this.docSets, aVar.docSets) && L.f(this.review, aVar.review);
    }

    public int hashCode() {
        return this.review.hashCode() + H.e(H.d(H.d((this.type.hashCode() + H.d(this.id.hashCode() * 31, 31, this.applicantId)) * 31, 31, this.createdAt), 31, this.externalActionId), 31, this.docSets);
    }

    @Y61.k
    public String toString() {
        return "Action(id=" + this.id + ", applicantId=" + this.applicantId + ", type=" + this.type + ", createdAt=" + this.createdAt + ", externalActionId=" + this.externalActionId + ", docSets=" + this.docSets + ", review=" + this.review + ')';
    }
}
