package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuthSuggestItem.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/AuthSuggestItem;", "", "hashUserId", "", "name", "avatar", "Lcom/avito/android/remote/model/Image;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getHashUserId", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AuthSuggestItem {

    @c("avatar")
    @l
    private final Image avatar;

    @c("hashUserId")
    @k
    private final String hashUserId;

    @c("name")
    @k
    private final String name;

    public AuthSuggestItem(@k String str, @k String str2, @l Image image) {
        this.hashUserId = str;
        this.name = str2;
        this.avatar = image;
    }

    public static /* synthetic */ AuthSuggestItem copy$default(AuthSuggestItem authSuggestItem, String str, String str2, Image image, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = authSuggestItem.hashUserId;
        }
        if ((i12 & 2) != 0) {
            str2 = authSuggestItem.name;
        }
        if ((i12 & 4) != 0) {
            image = authSuggestItem.avatar;
        }
        return authSuggestItem.copy(str, str2, image);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getHashUserId() {
        return this.hashUserId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @k
    public final AuthSuggestItem copy(@k String hashUserId, @k String name, @l Image avatar) {
        return new AuthSuggestItem(hashUserId, name, avatar);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthSuggestItem)) {
            return false;
        }
        AuthSuggestItem authSuggestItem = (AuthSuggestItem) other;
        return L.f(this.hashUserId, authSuggestItem.hashUserId) && L.f(this.name, authSuggestItem.name) && L.f(this.avatar, authSuggestItem.avatar);
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @k
    public final String getHashUserId() {
        return this.hashUserId;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iD2 = H.d(this.hashUserId.hashCode() * 31, 31, this.name);
        Image image = this.avatar;
        return iD2 + (image == null ? 0 : image.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AuthSuggestItem(hashUserId=");
        sb2.append(this.hashUserId);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", avatar=");
        return AK.c.o(sb2, this.avatar, ')');
    }
}
