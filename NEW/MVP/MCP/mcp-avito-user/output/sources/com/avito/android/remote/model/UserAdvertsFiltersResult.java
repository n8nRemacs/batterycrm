package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsFiltersResult.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/UserAdvertsFiltersResult;", "Landroid/os/Parcelable;", "", "initialScreenId", "", "Lcom/avito/android/remote/model/UserAdvertsFilters;", "screens", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/avito/android/remote/model/UserAdvertsFiltersResult;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getInitialScreenId", "Ljava/util/Map;", "getScreens", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UserAdvertsFiltersResult implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsFiltersResult> CREATOR = new Creator();

    @c("initialScreenId")
    @k
    private final String initialScreenId;

    @c("screens")
    @k
    private final Map<String, UserAdvertsFilters> screens;

    /* compiled from: UserAdvertsFiltersResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserAdvertsFiltersResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserAdvertsFiltersResult createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readString(), UserAdvertsFilters.CREATOR.createFromParcel(parcel));
            }
            return new UserAdvertsFiltersResult(string, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserAdvertsFiltersResult[] newArray(int i12) {
            return new UserAdvertsFiltersResult[i12];
        }
    }

    public UserAdvertsFiltersResult(@k String str, @k Map<String, UserAdvertsFilters> map) {
        this.initialScreenId = str;
        this.screens = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserAdvertsFiltersResult copy$default(UserAdvertsFiltersResult userAdvertsFiltersResult, String str, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = userAdvertsFiltersResult.initialScreenId;
        }
        if ((i12 & 2) != 0) {
            map = userAdvertsFiltersResult.screens;
        }
        return userAdvertsFiltersResult.copy(str, map);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getInitialScreenId() {
        return this.initialScreenId;
    }

    @k
    public final Map<String, UserAdvertsFilters> component2() {
        return this.screens;
    }

    @k
    public final UserAdvertsFiltersResult copy(@k String initialScreenId, @k Map<String, UserAdvertsFilters> screens) {
        return new UserAdvertsFiltersResult(initialScreenId, screens);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAdvertsFiltersResult)) {
            return false;
        }
        UserAdvertsFiltersResult userAdvertsFiltersResult = (UserAdvertsFiltersResult) other;
        return L.f(this.initialScreenId, userAdvertsFiltersResult.initialScreenId) && L.f(this.screens, userAdvertsFiltersResult.screens);
    }

    @k
    public final String getInitialScreenId() {
        return this.initialScreenId;
    }

    @k
    public final Map<String, UserAdvertsFilters> getScreens() {
        return this.screens;
    }

    public int hashCode() {
        return this.screens.hashCode() + (this.initialScreenId.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsFiltersResult(initialScreenId=");
        sb2.append(this.initialScreenId);
        sb2.append(", screens=");
        return r.w(sb2, this.screens, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.initialScreenId);
        Iterator itI = C0.i(parcel, this.screens);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            ((UserAdvertsFilters) entry.getValue()).writeToParcel(parcel, flags);
        }
    }
}
