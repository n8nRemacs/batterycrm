package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ToolbarShareButton.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/ToolbarShareButton;", "", "sharingButtonUrl", "", "sharingButtonTitle", "(Ljava/lang/String;Ljava/lang/String;)V", "getSharingButtonTitle", "()Ljava/lang/String;", "getSharingButtonUrl", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ToolbarShareButton {

    @k
    private final String sharingButtonTitle;

    @k
    private final String sharingButtonUrl;

    public ToolbarShareButton(@k String str, @k String str2) {
        this.sharingButtonUrl = str;
        this.sharingButtonTitle = str2;
    }

    public static /* synthetic */ ToolbarShareButton copy$default(ToolbarShareButton toolbarShareButton, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = toolbarShareButton.sharingButtonUrl;
        }
        if ((i12 & 2) != 0) {
            str2 = toolbarShareButton.sharingButtonTitle;
        }
        return toolbarShareButton.copy(str, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getSharingButtonUrl() {
        return this.sharingButtonUrl;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getSharingButtonTitle() {
        return this.sharingButtonTitle;
    }

    @k
    public final ToolbarShareButton copy(@k String sharingButtonUrl, @k String sharingButtonTitle) {
        return new ToolbarShareButton(sharingButtonUrl, sharingButtonTitle);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolbarShareButton)) {
            return false;
        }
        ToolbarShareButton toolbarShareButton = (ToolbarShareButton) other;
        return L.f(this.sharingButtonUrl, toolbarShareButton.sharingButtonUrl) && L.f(this.sharingButtonTitle, toolbarShareButton.sharingButtonTitle);
    }

    @k
    public final String getSharingButtonTitle() {
        return this.sharingButtonTitle;
    }

    @k
    public final String getSharingButtonUrl() {
        return this.sharingButtonUrl;
    }

    public int hashCode() {
        return this.sharingButtonTitle.hashCode() + (this.sharingButtonUrl.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ToolbarShareButton(sharingButtonUrl=");
        sb2.append(this.sharingButtonUrl);
        sb2.append(", sharingButtonTitle=");
        return C22026a.c(sb2, this.sharingButtonTitle, ')');
    }
}
