package KZ;

import com.avito.android.remote.model.Image;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ApplicationTeamItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKZ/I;", "", "", "name", "role", "Lcom/avito/android/remote/model/Image;", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class I {

    @com.google.gson.annotations.c("avatar")
    @Y61.l
    private final Image avatar;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    @com.google.gson.annotations.c("role")
    @Y61.k
    private final String role;

    public I(@Y61.k String str, @Y61.k String str2, @Y61.l Image image) {
        this.name = str;
        this.role = str2;
        this.avatar = image;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @Y61.k
    public final String b() {
        Character chE = C43066x.E(this.name);
        String string = chE != null ? chE.toString() : null;
        if (string == null) {
            string = "";
        }
        return string.toUpperCase(Locale.ROOT);
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i12 = (I) obj;
        return kotlin.jvm.internal.L.f(this.name, i12.name) && kotlin.jvm.internal.L.f(this.role, i12.role) && kotlin.jvm.internal.L.f(this.avatar, i12.avatar);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.name.hashCode() * 31, 31, this.role);
        Image image = this.avatar;
        return iD2 + (image == null ? 0 : image.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationTeamMember(name=");
        sb2.append(this.name);
        sb2.append(", role=");
        sb2.append(this.role);
        sb2.append(", avatar=");
        return AK.c.o(sb2, this.avatar, ')');
    }
}
