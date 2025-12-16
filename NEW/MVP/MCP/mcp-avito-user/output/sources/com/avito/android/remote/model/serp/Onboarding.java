package com.avito.android.remote.model.serp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Onboarding.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/serp/Onboarding;", "Landroid/os/Parcelable;", "", "onceShowId", "title", "description", "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/serp/Onboarding;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOnceShowId", "getTitle", "getDescription", "getButtonTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Onboarding implements Parcelable {

    @k
    public static final Parcelable.Creator<Onboarding> CREATOR = new Creator();

    @c("buttonTitle")
    @k
    private final String buttonTitle;

    @c("description")
    @k
    private final String description;

    @c("onceShowId")
    @k
    private final String onceShowId;

    @c("title")
    @k
    private final String title;

    /* compiled from: Onboarding.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Onboarding> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Onboarding createFromParcel(@k Parcel parcel) {
            return new Onboarding(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Onboarding[] newArray(int i12) {
            return new Onboarding[i12];
        }
    }

    public Onboarding(@k String str, @k String str2, @k String str3, @k String str4) {
        this.onceShowId = str;
        this.title = str2;
        this.description = str3;
        this.buttonTitle = str4;
    }

    public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, String str, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = onboarding.onceShowId;
        }
        if ((i12 & 2) != 0) {
            str2 = onboarding.title;
        }
        if ((i12 & 4) != 0) {
            str3 = onboarding.description;
        }
        if ((i12 & 8) != 0) {
            str4 = onboarding.buttonTitle;
        }
        return onboarding.copy(str, str2, str3, str4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getOnceShowId() {
        return this.onceShowId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    public final Onboarding copy(@k String onceShowId, @k String title, @k String description, @k String buttonTitle) {
        return new Onboarding(onceShowId, title, description, buttonTitle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Onboarding)) {
            return false;
        }
        Onboarding onboarding = (Onboarding) other;
        return L.f(this.onceShowId, onboarding.onceShowId) && L.f(this.title, onboarding.title) && L.f(this.description, onboarding.description) && L.f(this.buttonTitle, onboarding.buttonTitle);
    }

    @k
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getOnceShowId() {
        return this.onceShowId;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttonTitle.hashCode() + H.d(H.d(this.onceShowId.hashCode() * 31, 31, this.title), 31, this.description);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Onboarding(onceShowId=");
        sb2.append(this.onceShowId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", buttonTitle=");
        return C22026a.c(sb2, this.buttonTitle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.onceShowId);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.buttonTitle);
    }
}
