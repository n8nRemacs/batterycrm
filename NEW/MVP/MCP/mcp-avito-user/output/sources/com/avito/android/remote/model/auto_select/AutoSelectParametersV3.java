package com.avito.android.remote.model.auto_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectParametersV3.kt */
@d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JJ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0016¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "", "Lcom/avito/android/remote/model/auto_select/AutoSelectAdvantageV3;", "advantages", "Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Badge;", "badge", "Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Analytics;", "analytics", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Badge;Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Analytics;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Badge;", "component5", "()Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Analytics;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Badge;Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Analytics;)Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getDescription", "Ljava/util/List;", "getAdvantages", "Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Badge;", "getBadge", "Lcom/avito/android/remote/model/auto_select/AutoSelectParametersV3Analytics;", "getAnalytics", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoSelectParametersV3 implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectParametersV3> CREATOR = new Creator();

    @c("advantages")
    @k
    private final List<AutoSelectAdvantageV3> advantages;

    @c("analytics")
    @k
    private final AutoSelectParametersV3Analytics analytics;

    @c("badge")
    @l
    private final AutoSelectParametersV3Badge badge;

    @c("description")
    @k
    private final AttributedText description;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: AutoSelectParametersV3.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoSelectParametersV3> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectParametersV3 createFromParcel(@k Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AutoSelectParametersV3.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AutoSelectParametersV3.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(AutoSelectAdvantageV3.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AutoSelectParametersV3(attributedText, attributedText2, arrayList, parcel.readInt() == 0 ? null : AutoSelectParametersV3Badge.CREATOR.createFromParcel(parcel), AutoSelectParametersV3Analytics.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectParametersV3[] newArray(int i12) {
            return new AutoSelectParametersV3[i12];
        }
    }

    public AutoSelectParametersV3(@k AttributedText attributedText, @k AttributedText attributedText2, @k List<AutoSelectAdvantageV3> list, @l AutoSelectParametersV3Badge autoSelectParametersV3Badge, @k AutoSelectParametersV3Analytics autoSelectParametersV3Analytics) {
        this.title = attributedText;
        this.description = attributedText2;
        this.advantages = list;
        this.badge = autoSelectParametersV3Badge;
        this.analytics = autoSelectParametersV3Analytics;
    }

    public static /* synthetic */ AutoSelectParametersV3 copy$default(AutoSelectParametersV3 autoSelectParametersV3, AttributedText attributedText, AttributedText attributedText2, List list, AutoSelectParametersV3Badge autoSelectParametersV3Badge, AutoSelectParametersV3Analytics autoSelectParametersV3Analytics, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = autoSelectParametersV3.title;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = autoSelectParametersV3.description;
        }
        AttributedText attributedText3 = attributedText2;
        if ((i12 & 4) != 0) {
            list = autoSelectParametersV3.advantages;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            autoSelectParametersV3Badge = autoSelectParametersV3.badge;
        }
        AutoSelectParametersV3Badge autoSelectParametersV3Badge2 = autoSelectParametersV3Badge;
        if ((i12 & 16) != 0) {
            autoSelectParametersV3Analytics = autoSelectParametersV3.analytics;
        }
        return autoSelectParametersV3.copy(attributedText, attributedText3, list2, autoSelectParametersV3Badge2, autoSelectParametersV3Analytics);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final List<AutoSelectAdvantageV3> component3() {
        return this.advantages;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AutoSelectParametersV3Badge getBadge() {
        return this.badge;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final AutoSelectParametersV3Analytics getAnalytics() {
        return this.analytics;
    }

    @k
    public final AutoSelectParametersV3 copy(@k AttributedText title, @k AttributedText description, @k List<AutoSelectAdvantageV3> advantages, @l AutoSelectParametersV3Badge badge, @k AutoSelectParametersV3Analytics analytics) {
        return new AutoSelectParametersV3(title, description, advantages, badge, analytics);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoSelectParametersV3)) {
            return false;
        }
        AutoSelectParametersV3 autoSelectParametersV3 = (AutoSelectParametersV3) other;
        return L.f(this.title, autoSelectParametersV3.title) && L.f(this.description, autoSelectParametersV3.description) && L.f(this.advantages, autoSelectParametersV3.advantages) && L.f(this.badge, autoSelectParametersV3.badge) && L.f(this.analytics, autoSelectParametersV3.analytics);
    }

    @k
    public final List<AutoSelectAdvantageV3> getAdvantages() {
        return this.advantages;
    }

    @k
    public final AutoSelectParametersV3Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final AutoSelectParametersV3Badge getBadge() {
        return this.badge;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE2 = H.e(a.b(this.title.hashCode() * 31, 31, this.description), 31, this.advantages);
        AutoSelectParametersV3Badge autoSelectParametersV3Badge = this.badge;
        return this.analytics.hashCode() + ((iE2 + (autoSelectParametersV3Badge == null ? 0 : autoSelectParametersV3Badge.hashCode())) * 31);
    }

    @k
    public String toString() {
        return "AutoSelectParametersV3(title=" + this.title + ", description=" + this.description + ", advantages=" + this.advantages + ", badge=" + this.badge + ", analytics=" + this.analytics + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.description, flags);
        Iterator itJ = C0.j(this.advantages, parcel);
        while (itJ.hasNext()) {
            ((AutoSelectAdvantageV3) itJ.next()).writeToParcel(parcel, flags);
        }
        AutoSelectParametersV3Badge autoSelectParametersV3Badge = this.badge;
        if (autoSelectParametersV3Badge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoSelectParametersV3Badge.writeToParcel(parcel, flags);
        }
        this.analytics.writeToParcel(parcel, flags);
    }

    public /* synthetic */ AutoSelectParametersV3(AttributedText attributedText, AttributedText attributedText2, List list, AutoSelectParametersV3Badge autoSelectParametersV3Badge, AutoSelectParametersV3Analytics autoSelectParametersV3Analytics, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, list, (i12 & 8) != 0 ? null : autoSelectParametersV3Badge, autoSelectParametersV3Analytics);
    }
}
