package dp;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomDealResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ldp/h;", "", "", "id", "name", "Lcom/avito/android/remote/model/Image;", "image", "Ldp/i;", "agent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ldp/i;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "Lcom/avito/android/remote/model/Image;", "c", "()Lcom/avito/android/remote/model/Image;", "Ldp/i;", "a", "()Ldp/i;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class h {

    @com.google.gson.annotations.c("responsibleAgent")
    @Y61.l
    private final i agent;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final Image image;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    public h(@Y61.k String str, @Y61.k String str2, @Y61.l Image image, @Y61.l i iVar) {
        this.id = str;
        this.name = str2;
        this.image = image;
        this.agent = iVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final i getAgent() {
        return this.agent;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.id, hVar.id) && L.f(this.name, hVar.name) && L.f(this.image, hVar.image) && L.f(this.agent, hVar.agent);
    }

    public final int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.name);
        Image image = this.image;
        int iHashCode = (iD2 + (image == null ? 0 : image.hashCode())) * 31;
        i iVar = this.agent;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "Company(id=" + this.id + ", name=" + this.name + ", image=" + this.image + ", agent=" + this.agent + ')';
    }
}
