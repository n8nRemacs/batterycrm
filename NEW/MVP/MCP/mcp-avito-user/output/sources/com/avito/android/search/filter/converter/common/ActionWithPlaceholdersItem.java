package com.avito.android.search.filter.converter.common;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.Action;
import com.avito.android.remote.model.category_parameters.Badge;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActionWithPlaceholdersItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ActionWithPlaceholdersItem;", "Landroid/os/Parcelable;", "Lcom/avito/conveyor_item/a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActionWithPlaceholdersItem implements Parcelable, com.avito.conveyor_item.a {

    @k
    public static final Parcelable.Creator<ActionWithPlaceholdersItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f262901b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f262902c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Action f262903d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<String> f262904e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Badge f262905f;

    /* compiled from: ActionWithPlaceholdersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionWithPlaceholdersItem> {
        @Override // android.os.Parcelable.Creator
        public final ActionWithPlaceholdersItem createFromParcel(Parcel parcel) {
            return new ActionWithPlaceholdersItem(parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(ActionWithPlaceholdersItem.class.getClassLoader()), parcel.createStringArrayList(), (Badge) parcel.readParcelable(ActionWithPlaceholdersItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionWithPlaceholdersItem[] newArray(int i12) {
            return new ActionWithPlaceholdersItem[i12];
        }
    }

    public ActionWithPlaceholdersItem(@k String str, @k String str2, @k Action action, @k List<String> list, @l Badge badge) {
        this.f262901b = str;
        this.f262902c = str2;
        this.f262903d = action;
        this.f262904e = list;
        this.f262905f = badge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionWithPlaceholdersItem)) {
            return false;
        }
        ActionWithPlaceholdersItem actionWithPlaceholdersItem = (ActionWithPlaceholdersItem) obj;
        return L.f(this.f262901b, actionWithPlaceholdersItem.f262901b) && L.f(this.f262902c, actionWithPlaceholdersItem.f262902c) && L.f(this.f262903d, actionWithPlaceholdersItem.f262903d) && L.f(this.f262904e, actionWithPlaceholdersItem.f262904e) && L.f(this.f262905f, actionWithPlaceholdersItem.f262905f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return getF243135b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243135b() {
        return this.f262901b;
    }

    public final int hashCode() {
        int iE2 = H.e((this.f262903d.hashCode() + H.d(this.f262901b.hashCode() * 31, 31, this.f262902c)) * 31, 31, this.f262904e);
        Badge badge = this.f262905f;
        return iE2 + (badge == null ? 0 : badge.hashCode());
    }

    @k
    public final String toString() {
        return "ActionWithPlaceholdersItem(stringId=" + this.f262901b + ", title=" + this.f262902c + ", action=" + this.f262903d + ", placeholders=" + this.f262904e + ", badge=" + this.f262905f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f262901b);
        parcel.writeString(this.f262902c);
        parcel.writeParcelable(this.f262903d, i12);
        parcel.writeStringList(this.f262904e);
        parcel.writeParcelable(this.f262905f, i12);
    }

    public /* synthetic */ ActionWithPlaceholdersItem(String str, String str2, Action action, List list, Badge badge, int i12, C42822w c42822w) {
        this(str, str2, action, list, (i12 & 16) != 0 ? null : badge);
    }
}
