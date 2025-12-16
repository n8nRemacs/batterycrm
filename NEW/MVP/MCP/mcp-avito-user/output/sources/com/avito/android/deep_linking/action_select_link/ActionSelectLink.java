package com.avito.android.deep_linking.action_select_link;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ActionSelectLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/action_select_link/ActionSelectLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ActionSelectLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ActionSelectLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ActionSelectMenu f132881b;

    /* compiled from: ActionSelectLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionSelectLink> {
        @Override // android.os.Parcelable.Creator
        public final ActionSelectLink createFromParcel(Parcel parcel) {
            return new ActionSelectLink(ActionSelectMenu.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionSelectLink[] newArray(int i12) {
            return new ActionSelectLink[i12];
        }
    }

    public ActionSelectLink(@k ActionSelectMenu actionSelectMenu) {
        this.f132881b = actionSelectMenu;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f132881b.writeToParcel(parcel, i12);
    }
}
