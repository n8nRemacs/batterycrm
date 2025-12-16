package uF0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: Api1TravelSearchFavoritesItemsPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"LuF0/h;", "", "", "displayName", "Lcom/avito/android/remote/model/Image;", "logo", "name", "userKey", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "getName", "c", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    @com.google.gson.annotations.c("displayName")
    @k
    private final String displayName;

    @com.google.gson.annotations.c("logo")
    @l
    private final Image logo;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("userKey")
    @k
    private final String userKey;

    public h(@k String str, @l Image image, @k String str2, @k String str3) {
        this.displayName = str;
        this.logo = image;
        this.name = str2;
        this.userKey = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Image getLogo() {
        return this.logo;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getUserKey() {
        return this.userKey;
    }
}
