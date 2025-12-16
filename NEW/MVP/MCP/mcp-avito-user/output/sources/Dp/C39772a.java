package dp;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentsResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Ldp/a;", "", "", "id", "Lcom/avito/android/remote/model/Image;", "avatar", "name", "phone", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "c", "d", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C39772a {

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final Image avatar;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    @com.google.gson.annotations.c("phone")
    @Y61.k
    private final String phone;

    public C39772a(@Y61.k String str, @Y61.l Image image, @Y61.k String str2, @Y61.k String str3) {
        this.id = str;
        this.avatar = image;
        this.name = str2;
        this.phone = str3;
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

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39772a)) {
            return false;
        }
        C39772a c39772a = (C39772a) obj;
        return L.f(this.id, c39772a.id) && L.f(this.avatar, c39772a.avatar) && L.f(this.name, c39772a.name) && L.f(this.phone, c39772a.phone);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Image image = this.avatar;
        return this.phone.hashCode() + H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.name);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Agent(id=");
        sb2.append(this.id);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", phone=");
        return C22026a.c(sb2, this.phone, ')');
    }
}
