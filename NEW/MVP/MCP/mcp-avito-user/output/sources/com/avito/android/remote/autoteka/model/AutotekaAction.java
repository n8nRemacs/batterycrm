package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPurchaseResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/autoteka/model/AutotekaAction;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaAction implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaAction> CREATOR = new a();

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @c("text")
    @k
    private final String text;

    /* compiled from: AutotekaPurchaseResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaAction> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaAction createFromParcel(Parcel parcel) {
            return new AutotekaAction(parcel.readString(), (DeepLink) parcel.readParcelable(AutotekaAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaAction[] newArray(int i12) {
            return new AutotekaAction[i12];
        }
    }

    public AutotekaAction(@k String str, @l DeepLink deepLink) {
        this.text = str;
        this.deepLink = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutotekaAction)) {
            return false;
        }
        AutotekaAction autotekaAction = (AutotekaAction) obj;
        return L.f(this.text, autotekaAction.text) && L.f(this.deepLink, autotekaAction.deepLink);
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        DeepLink deepLink = this.deepLink;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaAction(text=");
        sb2.append(this.text);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.deepLink, i12);
    }
}
