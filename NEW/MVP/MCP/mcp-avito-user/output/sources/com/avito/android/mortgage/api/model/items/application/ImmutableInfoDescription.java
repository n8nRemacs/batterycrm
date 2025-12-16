package com.avito.android.mortgage.api.model.items.application;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationImmutableInfoItemValue.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/application/ImmutableInfoDescription;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/mortgage/api/model/items/application/ImmutableInfoDescriptionTab;", "tabs", "action", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ImmutableInfoDescription implements Parcelable {

    @k
    public static final Parcelable.Creator<ImmutableInfoDescription> CREATOR = new a();

    @c("action")
    @k
    private final String action;

    @c("tabs")
    @k
    private final List<ImmutableInfoDescriptionTab> tabs;

    @c("title")
    @k
    private final String title;

    /* compiled from: ApplicationImmutableInfoItemValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImmutableInfoDescription> {
        @Override // android.os.Parcelable.Creator
        public final ImmutableInfoDescription createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ImmutableInfoDescriptionTab.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ImmutableInfoDescription(string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImmutableInfoDescription[] newArray(int i12) {
            return new ImmutableInfoDescription[i12];
        }
    }

    public ImmutableInfoDescription(@k String str, @k List<ImmutableInfoDescriptionTab> list, @k String str2) {
        this.title = str;
        this.tabs = list;
        this.action = str2;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @k
    public final List<ImmutableInfoDescriptionTab> d() {
        return this.tabs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableInfoDescription)) {
            return false;
        }
        ImmutableInfoDescription immutableInfoDescription = (ImmutableInfoDescription) obj;
        return L.f(this.title, immutableInfoDescription.title) && L.f(this.tabs, immutableInfoDescription.tabs) && L.f(this.action, immutableInfoDescription.action);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.action.hashCode() + H.e(this.title.hashCode() * 31, 31, this.tabs);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableInfoDescription(title=");
        sb2.append(this.title);
        sb2.append(", tabs=");
        sb2.append(this.tabs);
        sb2.append(", action=");
        return C22026a.c(sb2, this.action, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.tabs, parcel);
        while (itJ.hasNext()) {
            ((ImmutableInfoDescriptionTab) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.action);
    }
}
