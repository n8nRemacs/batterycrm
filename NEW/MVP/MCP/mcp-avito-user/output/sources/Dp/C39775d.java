package dp;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Comment.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Ldp/d;", "", "", "id", "Lcom/avito/android/remote/model/Image;", "avatar", "name", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "c", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dp.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C39775d {

    @com.google.gson.annotations.c("avatar")
    @Y61.l
    private final Image avatar;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("name")
    @Y61.l
    private final String name;

    public C39775d(@Y61.k String str, @Y61.l Image image, @Y61.l String str2) {
        this.id = str;
        this.avatar = image;
        this.name = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39775d)) {
            return false;
        }
        C39775d c39775d = (C39775d) obj;
        return L.f(this.id, c39775d.id) && L.f(this.avatar, c39775d.avatar) && L.f(this.name, c39775d.name);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Image image = this.avatar;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.name;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Author(id=");
        sb2.append(this.id);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", name=");
        return C22026a.c(sb2, this.name, ')');
    }
}
