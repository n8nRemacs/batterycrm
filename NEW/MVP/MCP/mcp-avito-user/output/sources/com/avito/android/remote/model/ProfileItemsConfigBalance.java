package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileItemsConfigBalance.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/ProfileItemsConfigBalance;", "", "header", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getHeader", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ProfileItemsConfigBalance {

    @c("header")
    @k
    private final String header;

    @c("value")
    @k
    private final String value;

    public ProfileItemsConfigBalance(@k String str, @k String str2) {
        this.header = str;
        this.value = str2;
    }

    public static /* synthetic */ ProfileItemsConfigBalance copy$default(ProfileItemsConfigBalance profileItemsConfigBalance, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = profileItemsConfigBalance.header;
        }
        if ((i12 & 2) != 0) {
            str2 = profileItemsConfigBalance.value;
        }
        return profileItemsConfigBalance.copy(str, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @k
    public final ProfileItemsConfigBalance copy(@k String header, @k String value) {
        return new ProfileItemsConfigBalance(header, value);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileItemsConfigBalance)) {
            return false;
        }
        ProfileItemsConfigBalance profileItemsConfigBalance = (ProfileItemsConfigBalance) other;
        return L.f(this.header, profileItemsConfigBalance.header) && L.f(this.value, profileItemsConfigBalance.value);
    }

    @k
    public final String getHeader() {
        return this.header;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.header.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileItemsConfigBalance(header=");
        sb2.append(this.header);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }
}
