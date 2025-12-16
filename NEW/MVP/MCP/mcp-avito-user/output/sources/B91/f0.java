package b91;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.generated.api.get_channel_by_id.MenuElement;

/* compiled from: GetChannelByIdResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lb91/f0;", "", "Lb91/h;", ChannelContext.ATTACH_MENU, "", ChannelContext.AVATAR_USER_ID, "", "Lru/avito/messenger/generated/api/get_channel_by_id/MenuElement;", ChannelContext.MENU, "Lb91/k0;", ChannelContext.SHARED_LOCATION, "<init>", "(Lb91/h;Ljava/lang/String;Ljava/util/List;Lb91/k0;)V", "Lb91/h;", "a", "()Lb91/h;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lb91/k0;", "d", "()Lb91/k0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class f0 {

    @com.google.gson.annotations.c(ChannelContext.ATTACH_MENU)
    @Y61.l
    private final C25466h attachMenu;

    @com.google.gson.annotations.c(ChannelContext.AVATAR_USER_ID)
    @Y61.l
    private final String avatarUserId;

    @com.google.gson.annotations.c(ChannelContext.MENU)
    @Y61.l
    private final List<MenuElement> menu;

    @com.google.gson.annotations.c(ChannelContext.SHARED_LOCATION)
    @Y61.l
    private final k0 sharedLocation;

    public f0(@Y61.l C25466h c25466h, @Y61.l String str, @Y61.l List<MenuElement> list, @Y61.l k0 k0Var) {
        this.attachMenu = c25466h;
        this.avatarUserId = str;
        this.menu = list;
        this.sharedLocation = k0Var;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C25466h getAttachMenu() {
        return this.attachMenu;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getAvatarUserId() {
        return this.avatarUserId;
    }

    @Y61.l
    public final List<MenuElement> c() {
        return this.menu;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final k0 getSharedLocation() {
        return this.sharedLocation;
    }
}
