package com.avito.android.beduin.common.navigation_bar.spacing;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.spacing.BeduinSpacingModel;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: NavigationBarSpacing.kt */
@d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fJ \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/spacing/NavigationBarSpacing;", "Lcom/avito/android/beduin/common/navigation_bar/NavigationBarItem;", "", "width", "<init>", "(I)V", "Lcom/avito/android/remote/model/UniversalColor;", "tint", "Lcom/avito/android/beduin_models/BeduinModel;", "toBeduinModel", "(Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()I", "copy", "(I)Lcom/avito/android/beduin/common/navigation_bar/spacing/NavigationBarSpacing;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getWidth", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NavigationBarSpacing implements NavigationBarItem {

    @k
    public static final Parcelable.Creator<NavigationBarSpacing> CREATOR = new a();
    private final int width;

    /* compiled from: NavigationBarSpacing.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NavigationBarSpacing> {
        @Override // android.os.Parcelable.Creator
        public final NavigationBarSpacing createFromParcel(Parcel parcel) {
            return new NavigationBarSpacing(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final NavigationBarSpacing[] newArray(int i12) {
            return new NavigationBarSpacing[i12];
        }
    }

    /* compiled from: NavigationBarSpacing.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/spacing/NavigationBarSpacing$b;", "Lcom/avito/android/beduin/common/navigation_bar/d;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.navigation_bar.d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f103446a = new b();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Class<NavigationBarSpacing> f103447b = NavigationBarSpacing.class;

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f103448c = "spacing";

        @Override // com.avito.android.beduin.common.navigation_bar.d
        @k
        public final String getType() {
            return f103448c;
        }

        @Override // com.avito.android.beduin.common.navigation_bar.d
        @k
        public final Class<NavigationBarSpacing> getValue() {
            return f103447b;
        }
    }

    public NavigationBarSpacing(int i12) {
        this.width = i12;
    }

    public static /* synthetic */ NavigationBarSpacing copy$default(NavigationBarSpacing navigationBarSpacing, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = navigationBarSpacing.width;
        }
        return navigationBarSpacing.copy(i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    @k
    public final NavigationBarSpacing copy(int width) {
        return new NavigationBarSpacing(width);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NavigationBarSpacing) && this.width == ((NavigationBarSpacing) other).width;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.width);
    }

    @Override // com.avito.android.beduin.common.navigation_bar.NavigationBarItem
    @k
    public BeduinModel toBeduinModel(@l UniversalColor tint) {
        return new BeduinSpacingModel(UUID.randomUUID().toString(), Integer.valueOf(this.width), null, null, 12, null);
    }

    @k
    public String toString() {
        return r.t(new StringBuilder("NavigationBarSpacing(width="), this.width, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.width);
    }
}
