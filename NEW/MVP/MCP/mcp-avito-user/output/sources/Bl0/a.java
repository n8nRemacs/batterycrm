package BL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AppliedService.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LBL0/a;", "", "", "id", "title", "description", "Lcom/avito/android/remote/model/Image;", "icon", "planId", "Lcom/avito/android/remote/model/Action;", "action", VoiceInfo.STATE, "itemAction", "", "LBL0/c;", "stickers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/Action;Ljava/lang/String;Lcom/avito/android/remote/model/Action;Ljava/util/List;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "i", "b", "Lcom/avito/android/remote/model/Image;", "c", "()Lcom/avito/android/remote/model/Image;", "f", "Lcom/avito/android/remote/model/Action;", "a", "()Lcom/avito/android/remote/model/Action;", "g", "e", "Ljava/util/List;", "h", "()Ljava/util/List;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    @com.google.gson.annotations.c("action")
    @l
    private final Action action;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("icon")
    @k
    private final Image icon;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("itemAction")
    @l
    private final Action itemAction;

    @com.google.gson.annotations.c("planId")
    @l
    private final String planId;

    @com.google.gson.annotations.c(VoiceInfo.STATE)
    @l
    private final String state;

    @com.google.gson.annotations.c("stickers")
    @l
    private final List<c> stickers;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public a(@k String str, @k String str2, @k String str3, @k Image image, @l String str4, @l Action action, @l String str5, @l Action action2, @l List<c> list) {
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.icon = image;
        this.planId = str4;
        this.action = action;
        this.state = str5;
        this.itemAction = action2;
        this.stickers = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Action getItemAction() {
        return this.itemAction;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @l
    public final List<c> h() {
        return this.stickers;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
