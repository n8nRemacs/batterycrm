package b91;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.generated.api.get_channel_by_id.MenuElement;

/* compiled from: GetChannelByIdResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BE\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lb91/p0;", "", "", "Lb91/v;", "actions", "Lb91/h;", ChannelContext.ATTACH_MENU, "Lru/avito/messenger/generated/api/get_channel_by_id/MenuElement;", ChannelContext.MENU, "Lb91/i0;", ChannelContext.Item.REPLY_TIME, "Lb91/k0;", ChannelContext.SHARED_LOCATION, "<init>", "(Ljava/util/List;Lb91/h;Ljava/util/List;Lb91/i0;Lb91/k0;)V", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Lb91/h;", "a", "()Lb91/h;", "b", "Lb91/i0;", "getReplyTime", "()Lb91/i0;", "Lb91/k0;", "c", "()Lb91/k0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class p0 {

    @com.google.gson.annotations.c("actions")
    @Y61.l
    private final List<C25480v> actions;

    @com.google.gson.annotations.c(ChannelContext.ATTACH_MENU)
    @Y61.l
    private final C25466h attachMenu;

    @com.google.gson.annotations.c(ChannelContext.MENU)
    @Y61.l
    private final List<MenuElement> menu;

    @com.google.gson.annotations.c(ChannelContext.Item.REPLY_TIME)
    @Y61.l
    private final i0 replyTime;

    @com.google.gson.annotations.c(ChannelContext.SHARED_LOCATION)
    @Y61.l
    private final k0 sharedLocation;

    public p0(@Y61.l List<C25480v> list, @Y61.l C25466h c25466h, @Y61.l List<MenuElement> list2, @Y61.l i0 i0Var, @Y61.l k0 k0Var) {
        this.actions = list;
        this.attachMenu = c25466h;
        this.menu = list2;
        this.replyTime = i0Var;
        this.sharedLocation = k0Var;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C25466h getAttachMenu() {
        return this.attachMenu;
    }

    @Y61.l
    public final List<MenuElement> b() {
        return this.menu;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final k0 getSharedLocation() {
        return this.sharedLocation;
    }
}
