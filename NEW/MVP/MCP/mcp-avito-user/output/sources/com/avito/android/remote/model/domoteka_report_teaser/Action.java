package com.avito.android.remote.model.domoteka_report_teaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DomotekaReportTeaser.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/domoteka_report_teaser/Action;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)Lcom/avito/android/remote/model/domoteka_report_teaser/Action;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Action implements Parcelable {

    @k
    public static final Parcelable.Creator<Action> CREATOR = new Creator();

    @c(ContextActionHandler.Link.DEEPLINK)
    @k
    private final DeepLink deepLink;

    @c("name")
    @k
    private final String name;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final String style;

    /* compiled from: DomotekaReportTeaser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Action> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Action createFromParcel(@k Parcel parcel) {
            return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Action[] newArray(int i12) {
            return new Action[i12];
        }
    }

    public Action(@k String str, @k DeepLink deepLink, @k String str2) {
        this.name = str;
        this.deepLink = deepLink;
        this.style = str2;
    }

    public static /* synthetic */ Action copy$default(Action action, String str, DeepLink deepLink, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = action.name;
        }
        if ((i12 & 2) != 0) {
            deepLink = action.deepLink;
        }
        if ((i12 & 4) != 0) {
            str2 = action.style;
        }
        return action.copy(str, deepLink, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @k
    public final Action copy(@k String name, @k DeepLink deepLink, @k String style) {
        return new Action(name, deepLink, style);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Action)) {
            return false;
        }
        Action action = (Action) other;
        return L.f(this.name, action.name) && L.f(this.deepLink, action.deepLink) && L.f(this.style, action.style);
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.style.hashCode() + a.e(this.deepLink, this.name.hashCode() * 31, 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Action(name=");
        sb2.append(this.name);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", style=");
        return C22026a.c(sb2, this.style, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeParcelable(this.deepLink, flags);
        parcel.writeString(this.style);
    }
}
