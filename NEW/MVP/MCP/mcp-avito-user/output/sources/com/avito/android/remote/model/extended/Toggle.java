package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Toggle.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/extended/Toggle;", "", "title", "", "subtitle", "isEnabled", "", "isHidden", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)V", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)Lcom/avito/android/remote/model/extended/Toggle;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Toggle {

    @c("isEnabled")
    private final boolean isEnabled;

    @c("isHidden")
    @l
    private final Boolean isHidden;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    public Toggle(@k String str, @l String str2, boolean z12, @l Boolean bool) {
        this.title = str;
        this.subtitle = str2;
        this.isEnabled = z12;
        this.isHidden = bool;
    }

    public static /* synthetic */ Toggle copy$default(Toggle toggle, String str, String str2, boolean z12, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = toggle.title;
        }
        if ((i12 & 2) != 0) {
            str2 = toggle.subtitle;
        }
        if ((i12 & 4) != 0) {
            z12 = toggle.isEnabled;
        }
        if ((i12 & 8) != 0) {
            bool = toggle.isHidden;
        }
        return toggle.copy(str, str2, z12, bool);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsHidden() {
        return this.isHidden;
    }

    @k
    public final Toggle copy(@k String title, @l String subtitle, boolean isEnabled, @l Boolean isHidden) {
        return new Toggle(title, subtitle, isEnabled, isHidden);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) other;
        return L.f(this.title, toggle.title) && L.f(this.subtitle, toggle.subtitle) && this.isEnabled == toggle.isEnabled && L.f(this.isHidden, toggle.isHidden);
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int i12 = r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isEnabled);
        Boolean bool = this.isHidden;
        return i12 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @l
    public final Boolean isHidden() {
        return this.isHidden;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Toggle(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", isHidden=");
        return C0.g(sb2, this.isHidden, ')');
    }
}
