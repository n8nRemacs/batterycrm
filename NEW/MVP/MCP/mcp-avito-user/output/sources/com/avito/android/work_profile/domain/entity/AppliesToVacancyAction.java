package com.avito.android.work_profile.domain.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliesToVacancy.kt */
@d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/work_profile/domain/entity/AppliesToVacancyAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/work_profile/domain/entity/AppliesToVacancyAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AppliesToVacancyAction implements Parcelable {

    @k
    public static final Parcelable.Creator<AppliesToVacancyAction> CREATOR = new a();

    @k
    private final String title;

    @k
    private final DeepLink uri;

    /* compiled from: AppliesToVacancy.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppliesToVacancyAction> {
        @Override // android.os.Parcelable.Creator
        public final AppliesToVacancyAction createFromParcel(Parcel parcel) {
            return new AppliesToVacancyAction(parcel.readString(), (DeepLink) parcel.readParcelable(AppliesToVacancyAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppliesToVacancyAction[] newArray(int i12) {
            return new AppliesToVacancyAction[i12];
        }
    }

    public AppliesToVacancyAction(@k String str, @k DeepLink deepLink) {
        this.title = str;
        this.uri = deepLink;
    }

    public static /* synthetic */ AppliesToVacancyAction copy$default(AppliesToVacancyAction appliesToVacancyAction, String str, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = appliesToVacancyAction.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = appliesToVacancyAction.uri;
        }
        return appliesToVacancyAction.copy(str, deepLink);
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
    public final AppliesToVacancyAction copy(@k String title, @k DeepLink uri) {
        return new AppliesToVacancyAction(title, uri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppliesToVacancyAction)) {
            return false;
        }
        AppliesToVacancyAction appliesToVacancyAction = (AppliesToVacancyAction) other;
        return L.f(this.title, appliesToVacancyAction.title) && L.f(this.uri, appliesToVacancyAction.uri);
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
        StringBuilder sb2 = new StringBuilder("AppliesToVacancyAction(title=");
        sb2.append(this.title);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.uri, flags);
    }
}
