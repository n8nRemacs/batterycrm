package bb0;

import Y61.l;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ProfileDeleteAvatarV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbb0/a;", "", "", "defaultUrl", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "Ljava/lang/String;", "getDefaultUrl", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bb0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C25620a {

    @c("defaultUrl")
    @l
    private final String defaultUrl;

    @c("image")
    @l
    private final Image image;

    public C25620a(@l String str, @l Image image) {
        this.defaultUrl = str;
        this.image = image;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Image getImage() {
        return this.image;
    }
}
