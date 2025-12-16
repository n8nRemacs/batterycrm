package Sc0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileVkUnlinkV2Response.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"LSc0/f;", "", "LSc0/a;", "action", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedDescription", "", "LSc0/b;", "buttons", "", "description", "title", "type", "<init>", "(LSc0/a;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LSc0/a;", "getAction", "()LSc0/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "getTitle", "getType", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f {

    @com.google.gson.annotations.c("action")
    @l
    private final C15171a action;

    @com.google.gson.annotations.c("attributedDescription")
    @k
    private final AttributedText attributedDescription;

    @com.google.gson.annotations.c("buttons")
    @l
    private final List<b> buttons;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("type")
    @k
    private final String type;

    public f(@l C15171a c15171a, @k AttributedText attributedText, @l List<b> list, @k String str, @k String str2, @k String str3) {
        this.action = c15171a;
        this.attributedDescription = attributedText;
        this.buttons = list;
        this.description = str;
        this.title = str2;
        this.type = str3;
    }
}
