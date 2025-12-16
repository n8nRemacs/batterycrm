package WN0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ProfilesGetListApiV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"LWN0/e;", "", "LWN0/d;", "avatar", "", "id", "name", "phone", "<init>", "(LWN0/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LWN0/d;", "a", "()LWN0/d;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    @com.google.gson.annotations.c("avatar")
    @l
    private final d avatar;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("phone")
    @l
    private final String phone;

    public e(@l d dVar, @k String str, @k String str2, @l String str3) {
        this.avatar = dVar;
        this.id = str;
        this.name = str2;
        this.phone = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final d getAvatar() {
        return this.avatar;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }
}
