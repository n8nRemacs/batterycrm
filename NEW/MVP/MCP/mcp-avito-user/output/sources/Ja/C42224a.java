package jA;

import Y61.l;
import com.avito.android.extended_profile.remote.generated.api.bx_tabs_by_user_hash_api.TabsResponseOkSuccessTabsItem;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BxTabsByUserHashApiResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LjA/a;", "", "LjA/b;", "avatar", "", "Lcom/avito/android/extended_profile/remote/generated/api/bx_tabs_by_user_hash_api/TabsResponseOkSuccessTabsItem;", "tabs", "<init>", "(LjA/b;Ljava/util/List;)V", "LjA/b;", "a", "()LjA/b;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jA.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C42224a {

    @c("avatar")
    @l
    private final C42225b avatar;

    @c("tabs")
    @l
    private final List<TabsResponseOkSuccessTabsItem> tabs;

    public C42224a(@l C42225b c42225b, @l List<TabsResponseOkSuccessTabsItem> list) {
        this.avatar = c42225b;
        this.tabs = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C42225b getAvatar() {
        return this.avatar;
    }

    @l
    public final List<TabsResponseOkSuccessTabsItem> b() {
        return this.tabs;
    }
}
