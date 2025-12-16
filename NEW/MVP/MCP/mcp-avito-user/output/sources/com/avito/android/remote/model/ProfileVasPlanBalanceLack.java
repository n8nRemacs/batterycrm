package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileVasPlanBalanceLack.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/ProfileVasPlanBalanceLack;", "", "title", "", "subtitle", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ProfileVasPlanBalanceLack {

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    public ProfileVasPlanBalanceLack(@k String str, @l String str2) {
        this.title = str;
        this.subtitle = str2;
    }

    public static /* synthetic */ ProfileVasPlanBalanceLack copy$default(ProfileVasPlanBalanceLack profileVasPlanBalanceLack, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = profileVasPlanBalanceLack.title;
        }
        if ((i12 & 2) != 0) {
            str2 = profileVasPlanBalanceLack.subtitle;
        }
        return profileVasPlanBalanceLack.copy(str, str2);
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

    @k
    public final ProfileVasPlanBalanceLack copy(@k String title, @l String subtitle) {
        return new ProfileVasPlanBalanceLack(title, subtitle);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileVasPlanBalanceLack)) {
            return false;
        }
        ProfileVasPlanBalanceLack profileVasPlanBalanceLack = (ProfileVasPlanBalanceLack) other;
        return L.f(this.title, profileVasPlanBalanceLack.title) && L.f(this.subtitle, profileVasPlanBalanceLack.subtitle);
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
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileVasPlanBalanceLack(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.subtitle, ')');
    }
}
