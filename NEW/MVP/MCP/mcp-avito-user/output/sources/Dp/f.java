package dp;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Comment.kt */
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Ldp/f;", "", "", "id", "Ldp/d;", "author", "publishedAt", "editedAt", "", "Ldp/g;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "comment", "", "canEdit", "canDelete", "<init>", "(Ljava/lang/String;Ldp/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ldp/d;", "a", "()Ldp/d;", "f", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Ljava/lang/Boolean;", "getCanEdit", "()Ljava/lang/Boolean;", "getCanDelete", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class f {

    @com.google.gson.annotations.c("author")
    @Y61.k
    private final C39775d author;

    @com.google.gson.annotations.c("canDelete")
    @Y61.l
    private final Boolean canDelete;

    @com.google.gson.annotations.c("canEdit")
    @Y61.l
    private final Boolean canEdit;

    @com.google.gson.annotations.c("comment")
    @Y61.k
    private final String comment;

    @com.google.gson.annotations.c("editedAt")
    @Y61.l
    private final String editedAt;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("additionalParameters")
    @Y61.l
    private final List<g> parameters;

    @com.google.gson.annotations.c("createdAt")
    @Y61.k
    private final String publishedAt;

    public f(@Y61.k String str, @Y61.k C39775d c39775d, @Y61.k String str2, @Y61.l String str3, @Y61.l List<g> list, @Y61.k String str4, @Y61.l Boolean bool, @Y61.l Boolean bool2) {
        this.id = str;
        this.author = c39775d;
        this.publishedAt = str2;
        this.editedAt = str3;
        this.parameters = list;
        this.comment = str4;
        this.canEdit = bool;
        this.canDelete = bool2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C39775d getAuthor() {
        return this.author;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getEditedAt() {
        return this.editedAt;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    public final List<g> e() {
        return this.parameters;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.id, fVar.id) && L.f(this.author, fVar.author) && L.f(this.publishedAt, fVar.publishedAt) && L.f(this.editedAt, fVar.editedAt) && L.f(this.parameters, fVar.parameters) && L.f(this.comment, fVar.comment) && L.f(this.canEdit, fVar.canEdit) && L.f(this.canDelete, fVar.canDelete);
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getPublishedAt() {
        return this.publishedAt;
    }

    public final int hashCode() {
        int iD2 = H.d((this.author.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.publishedAt);
        String str = this.editedAt;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        List<g> list = this.parameters;
        int iD3 = H.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.comment);
        Boolean bool = this.canEdit;
        int iHashCode2 = (iD3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canDelete;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Comment(id=");
        sb2.append(this.id);
        sb2.append(", author=");
        sb2.append(this.author);
        sb2.append(", publishedAt=");
        sb2.append(this.publishedAt);
        sb2.append(", editedAt=");
        sb2.append(this.editedAt);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", comment=");
        sb2.append(this.comment);
        sb2.append(", canEdit=");
        sb2.append(this.canEdit);
        sb2.append(", canDelete=");
        return C0.g(sb2, this.canDelete, ')');
    }
}
