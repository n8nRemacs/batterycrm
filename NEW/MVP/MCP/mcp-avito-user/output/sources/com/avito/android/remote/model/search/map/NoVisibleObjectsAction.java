package com.avito.android.remote.model.search.map;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Counter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/search/map/NoVisibleObjectsAction;", "", "title", "", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getTitle", "()Ljava/lang/String;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NoVisibleObjectsAction {

    @c("title")
    @k
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink uri;

    public NoVisibleObjectsAction(@k String str, @k DeepLink deepLink) {
        this.title = str;
        this.uri = deepLink;
    }

    public static /* synthetic */ NoVisibleObjectsAction copy$default(NoVisibleObjectsAction noVisibleObjectsAction, String str, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = noVisibleObjectsAction.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = noVisibleObjectsAction.uri;
        }
        return noVisibleObjectsAction.copy(str, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @k
    public final NoVisibleObjectsAction copy(@k String title, @k DeepLink uri) {
        return new NoVisibleObjectsAction(title, uri);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoVisibleObjectsAction)) {
            return false;
        }
        NoVisibleObjectsAction noVisibleObjectsAction = (NoVisibleObjectsAction) other;
        return L.f(this.title, noVisibleObjectsAction.title) && L.f(this.uri, noVisibleObjectsAction.uri);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final DeepLink getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NoVisibleObjectsAction(title=");
        sb2.append(this.title);
        sb2.append(", uri=");
        return a.v(sb2, this.uri, ')');
    }
}
