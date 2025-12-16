package JZ;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationBannerModel.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"LJZ/u;", "", "", "imageUrl", "title", "description", "LJZ/t;", "action", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJZ/t;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "f", "c", "LJZ/t;", "b", "()LJZ/t;", "e", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class u {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final t action;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final String imageUrl;

    @com.google.gson.annotations.c("status")
    @Y61.k
    private final String status;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public u(@Y61.l String str, @Y61.k String str2, @Y61.l String str3, @Y61.l t tVar, @Y61.k String str4) {
        this.imageUrl = str;
        this.title = str2;
        this.description = str3;
        this.action = tVar;
        this.status = str4;
    }

    public static u a(u uVar, t tVar) {
        String str = uVar.imageUrl;
        String str2 = uVar.title;
        String str3 = uVar.description;
        String str4 = uVar.status;
        uVar.getClass();
        return new u(str, str2, str3, tVar, str4);
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final t getAction() {
        return this.action;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.imageUrl, uVar.imageUrl) && L.f(this.title, uVar.title) && L.f(this.description, uVar.description) && L.f(this.action, uVar.action) && L.f(this.status, uVar.status);
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.imageUrl;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        String str2 = this.description;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        t tVar = this.action;
        return this.status.hashCode() + ((iHashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationBannerModel(imageUrl=");
        sb2.append(this.imageUrl);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", status=");
        return C22026a.c(sb2, this.status, ')');
    }
}
