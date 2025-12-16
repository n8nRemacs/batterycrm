package cb0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ServicesSellerTypeOptionsListResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcb0/h;", "", "", "badgeTitle", "confirmButtonTitle", "", "Lcb0/a;", "groups", "Lcb0/b;", "options", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h {

    @com.google.gson.annotations.c("badgeTitle")
    @k
    private final String badgeTitle;

    @com.google.gson.annotations.c("confirmButtonTitle")
    @k
    private final String confirmButtonTitle;

    @com.google.gson.annotations.c("groups")
    @l
    private final List<C27157a> groups;

    @com.google.gson.annotations.c("options")
    @k
    private final List<C27158b> options;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public h(@k String str, @k String str2, @l List<C27157a> list, @k List<C27158b> list2, @k AttributedText attributedText, @k String str3) {
        this.badgeTitle = str;
        this.confirmButtonTitle = str2;
        this.groups = list;
        this.options = list2;
        this.subtitle = attributedText;
        this.title = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getBadgeTitle() {
        return this.badgeTitle;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }

    @l
    public final List<C27157a> c() {
        return this.groups;
    }

    @k
    public final List<C27158b> d() {
        return this.options;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
