package X81;

import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.api.entity.InputState;
import ru.avito.messenger.api.entity.ReadOnlyState;

/* compiled from: ChannelUpdate.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u001cB\u009d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b¨\u0006\u001d"}, d2 = {"LX81/d;", "", "Lru/avito/messenger/api/entity/ReadOnlyState;", "readOnlyState", "", "isDeleted", "isRead", "isSpam", "isAnswered", "", "", "tags", "removedTags", "addedTags", "LX81/d$a;", "suspect", "Lru/avito/messenger/api/entity/InputState;", MessageBody.SystemMessageBody.Platform.INPUT_STATE, "LW81/a;", MessageBody.SystemMessageBody.Platform.CONTEXT_ACTIONS, "<init>", "(Lru/avito/messenger/api/entity/ReadOnlyState;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;LX81/d$a;Lru/avito/messenger/api/entity/InputState;LW81/a;)V", "Lru/avito/messenger/api/entity/ReadOnlyState;", "Ljava/lang/Boolean;", "Ljava/util/List;", "LX81/d$a;", "Lru/avito/messenger/api/entity/InputState;", "LW81/a;", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d {

    @X41.f
    @com.google.gson.annotations.c("addedTags")
    @Y61.l
    public final List<String> addedTags;

    @X41.f
    @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.CONTEXT_ACTIONS)
    @Y61.l
    public final W81.a contextActions;

    @X41.f
    @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.INPUT_STATE)
    @Y61.l
    public final InputState inputState;

    @X41.f
    @com.google.gson.annotations.c("isAnswered")
    @Y61.l
    public final Boolean isAnswered;

    @X41.f
    @com.google.gson.annotations.c("isDeleted")
    @Y61.l
    public final Boolean isDeleted;

    @X41.f
    @com.google.gson.annotations.c("isRead")
    @Y61.l
    public final Boolean isRead;

    @X41.f
    @com.google.gson.annotations.c("isSpam")
    @Y61.l
    public final Boolean isSpam;

    @X41.f
    @com.google.gson.annotations.c("readOnly")
    @Y61.l
    public final ReadOnlyState readOnlyState;

    @X41.f
    @com.google.gson.annotations.c("removedTags")
    @Y61.l
    public final List<String> removedTags;

    @X41.f
    @com.google.gson.annotations.c("suspect")
    @Y61.l
    public final a suspect;

    @X41.f
    @com.google.gson.annotations.c("tags")
    @Y61.l
    public final List<String> tags;

    /* compiled from: ChannelUpdate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"LX81/d$a;", "", "", PlatformActions.MESSAGE_ID, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @X41.f
        @com.google.gson.annotations.c(PlatformActions.MESSAGE_ID)
        @Y61.l
        public final String messageId;

        public a(@Y61.l String str) {
            this.messageId = str;
        }
    }

    public d() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public d(@Y61.l ReadOnlyState readOnlyState, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Boolean bool3, @Y61.l Boolean bool4, @Y61.l List<String> list, @Y61.l List<String> list2, @Y61.l List<String> list3, @Y61.l a aVar, @Y61.l InputState inputState, @Y61.l W81.a aVar2) {
        this.readOnlyState = readOnlyState;
        this.isDeleted = bool;
        this.isRead = bool2;
        this.isSpam = bool3;
        this.isAnswered = bool4;
        this.tags = list;
        this.removedTags = list2;
        this.addedTags = list3;
        this.suspect = aVar;
        this.inputState = inputState;
        this.contextActions = aVar2;
    }

    public /* synthetic */ d(ReadOnlyState readOnlyState, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list, List list2, List list3, a aVar, InputState inputState, W81.a aVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : readOnlyState, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? null : bool2, (i12 & 8) != 0 ? null : bool3, (i12 & 16) != 0 ? null : bool4, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : list2, (i12 & 128) != 0 ? null : list3, (i12 & 256) != 0 ? null : aVar, (i12 & 512) != 0 ? null : inputState, (i12 & 1024) == 0 ? aVar2 : null);
    }
}
