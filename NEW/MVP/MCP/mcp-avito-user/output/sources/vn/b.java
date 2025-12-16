package Vn;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: Api1PromoCategoryTreeItemsResponse.kt */
@P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LVn/b;", "", "LVn/a;", "additionalInfo", "Lcom/avito/android/deep_linking/links/DeepLink;", "editDeeplink", "", "id", "", "imageURL", "", "isEnabled", "name", "LVn/c;", "price", "<init>", "(LVn/a;Lcom/avito/android/deep_linking/links/DeepLink;JLjava/lang/String;ZLjava/lang/String;LVn/c;)V", "LVn/a;", "a", "()LVn/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "J", "c", "()J", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Z", "g", "()Z", "e", "LVn/c;", "f", "()LVn/c;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    @com.google.gson.annotations.c("additionalInfo")
    @k
    private final C15694a additionalInfo;

    @com.google.gson.annotations.c("editDeeplink")
    @k
    private final DeepLink editDeeplink;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("imageURL")
    @k
    private final String imageURL;

    @com.google.gson.annotations.c("isEnabled")
    private final boolean isEnabled;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("price")
    @k
    private final c price;

    public b(@k C15694a c15694a, @k DeepLink deepLink, long j12, @k String str, boolean z12, @k String str2, @k c cVar) {
        this.additionalInfo = c15694a;
        this.editDeeplink = deepLink;
        this.id = j12;
        this.imageURL = str;
        this.isEnabled = z12;
        this.name = str2;
        this.price = cVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C15694a getAdditionalInfo() {
        return this.additionalInfo;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getEditDeeplink() {
        return this.editDeeplink;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final c getPrice() {
        return this.price;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }
}
