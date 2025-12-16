package CL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: CompetitiveVas.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"LCL0/a;", "", "", "id", "title", "description", "subtitle", "oldPrice", "", "selected", "Lcom/avito/android/remote/model/Image;", "icon", "lightningIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "contact", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "j", "c", "i", "g", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/Image;", "d", "()Lcom/avito/android/remote/model/Image;", "f", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "a", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    @com.google.gson.annotations.c("bblContacts")
    @l
    private final MnzFloatingFooterContact contact;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("icon")
    @l
    private final Image icon;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("lightningIcon")
    @l
    private final Image lightningIcon;

    @com.google.gson.annotations.c("oldPrice")
    @l
    private final String oldPrice;

    @com.google.gson.annotations.c("selected")
    @l
    private final Boolean selected;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public a(@k String str, @k String str2, @l String str3, @l String str4, @l String str5, @l Boolean bool, @l Image image, @l Image image2, @l DeepLink deepLink, @l MnzFloatingFooterContact mnzFloatingFooterContact) {
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.subtitle = str4;
        this.oldPrice = str5;
        this.selected = bool;
        this.icon = image;
        this.lightningIcon = image2;
        this.deepLink = deepLink;
        this.contact = mnzFloatingFooterContact;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final MnzFloatingFooterContact getContact() {
        return this.contact;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Image getLightningIcon() {
        return this.lightningIcon;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getOldPrice() {
        return this.oldPrice;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
