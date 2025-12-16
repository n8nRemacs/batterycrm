package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: InstallmentsFormShowLink.kt */
@K51.d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B2\u0012\u0019\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR-\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/deep_linking/links/UxFeedbackActions;", "Landroid/os/Parcelable;", "", "", "", "LK51/e;", "onCloseActionsMap", "", "Lcom/avito/android/deep_linking/links/PostMessageAction;", "onEventActions", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UxFeedbackActions implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UxFeedbackActions> CREATOR = new a();

    @com.google.gson.annotations.c("onClose")
    @Y61.l
    private final Map<String, Object> onCloseActionsMap;

    @com.google.gson.annotations.c("onEvent")
    @Y61.l
    private final List<PostMessageAction> onEventActions;

    /* compiled from: InstallmentsFormShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UxFeedbackActions> {
        @Override // android.os.Parcelable.Creator
        public final UxFeedbackActions createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int iC2 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = org.webrtc.h.c(UxFeedbackActions.class, parcel, linkedHashMap, parcel.readString(), iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(PostMessageAction.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new UxFeedbackActions(linkedHashMap, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UxFeedbackActions[] newArray(int i12) {
            return new UxFeedbackActions[i12];
        }
    }

    public UxFeedbackActions(@Y61.l Map<String, ? extends Object> map, @Y61.l List<PostMessageAction> list) {
        this.onCloseActionsMap = map;
        this.onEventActions = list;
    }

    @Y61.l
    public final Map<String, Object> c() {
        return this.onCloseActionsMap;
    }

    @Y61.l
    public final List<PostMessageAction> d() {
        return this.onEventActions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxFeedbackActions)) {
            return false;
        }
        UxFeedbackActions uxFeedbackActions = (UxFeedbackActions) obj;
        return kotlin.jvm.internal.L.f(this.onCloseActionsMap, uxFeedbackActions.onCloseActionsMap) && kotlin.jvm.internal.L.f(this.onEventActions, uxFeedbackActions.onEventActions);
    }

    public final int hashCode() {
        Map<String, Object> map = this.onCloseActionsMap;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<PostMessageAction> list = this.onEventActions;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UxFeedbackActions(onCloseActionsMap=");
        sb2.append(this.onCloseActionsMap);
        sb2.append(", onEventActions=");
        return androidx.compose.foundation.H.p(sb2, this.onEventActions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Map<String, Object> map = this.onCloseActionsMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        List<PostMessageAction> list = this.onEventActions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((PostMessageAction) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
