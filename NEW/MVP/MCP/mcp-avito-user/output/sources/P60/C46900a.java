package p60;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ProfilesListApiV2Response.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lp60/a;", "", "Lcom/avito/android/remote/model/Image;", "avatar", "", "description", "", "isCurrent", "name", "", "profileId", "status", "title", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "g", "()Z", "c", "J", "d", "()J", "e", "f", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: p60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C46900a {

    @c("avatar")
    @l
    private final Image avatar;

    @c("description")
    @l
    private final String description;

    @c("isCurrent")
    private final boolean isCurrent;

    @c("name")
    @k
    private final String name;

    @c("profileId")
    private final long profileId;

    @c("status")
    @l
    private final String status;

    @c("title")
    @k
    private final String title;

    public C46900a(@l Image image, @l String str, boolean z12, @k String str2, long j12, @l String str3, @k String str4) {
        this.avatar = image;
        this.description = str;
        this.isCurrent = z12;
        this.name = str2;
        this.profileId = j12;
        this.status = str3;
        this.title = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: d, reason: from getter */
    public final long getProfileId() {
        return this.profileId;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }
}
