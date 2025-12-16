package c70;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.BeduinV2;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Api1SxBannersGetGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lc70/b;", "", "", "bannerId", "Lcom/avito/android/remote/model/BeduinV2;", "content", "Lcom/avito/android/deep_linking/links/DeepLink;", "onShowDeeplink", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/BeduinV2;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/BeduinV2;", "b", "()Lcom/avito/android/remote/model/BeduinV2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c70.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C26953b {

    @c("bannerId")
    @k
    private final String bannerId;

    @c("content")
    @k
    private final BeduinV2 content;

    @c("onShowDeeplink")
    @l
    private final DeepLink onShowDeeplink;

    public C26953b(@k String str, @k BeduinV2 beduinV2, @l DeepLink deepLink) {
        this.bannerId = str;
        this.content = beduinV2;
        this.onShowDeeplink = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getBannerId() {
        return this.bannerId;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final BeduinV2 getContent() {
        return this.content;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DeepLink getOnShowDeeplink() {
        return this.onShowDeeplink;
    }
}
