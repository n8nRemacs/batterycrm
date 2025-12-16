package com.avito.android.bbl.screens.configure.ui.items.configs;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BblConfigureConfigsItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/ui/items/configs/BblConfigureConfigsItem;", "Lcom/avito/conveyor_item/a;", "Config", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BblConfigureConfigsItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f99239b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Config f99240c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Config> f99241d;

    /* compiled from: BblConfigureConfigsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/ui/items/configs/BblConfigureConfigsItem$Config;", "Lcom/avito/android/lib/design/selector_card/r;", "Landroid/os/Parcelable;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Config implements r, Parcelable {

        @k
        public static final Parcelable.Creator<Config> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f99242b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f99243c;

        /* renamed from: d, reason: collision with root package name */
        public final int f99244d;

        /* renamed from: e, reason: collision with root package name */
        public final float f99245e;

        /* compiled from: BblConfigureConfigsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Config> {
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                return new Config(parcel.readLong(), (AttributedText) parcel.readParcelable(Config.class.getClassLoader()), parcel.readInt(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i12) {
                return new Config[i12];
            }
        }

        public Config(long j12, @k AttributedText attributedText, int i12, float f12) {
            this.f99242b = j12;
            this.f99243c = attributedText;
            this.f99244d = i12;
            this.f99245e = f12;
        }

        @Override // com.avito.android.lib.design.selector_card.r
        public final boolean a(@k r rVar) {
            return (rVar instanceof Config) && equals(rVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.f99242b == config.f99242b && L.f(this.f99243c, config.f99243c) && this.f99244d == config.f99244d && Float.compare(this.f99245e, config.f99245e) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f99245e) + androidx.appcompat.app.r.e(this.f99244d, com.avito.android.actions_sheet.a.b(Long.hashCode(this.f99242b) * 31, 31, this.f99243c), 31);
        }

        @Override // com.avito.android.lib.design.selector_card.r
        /* renamed from: isEnabled */
        public final boolean getF309669f() {
            return true;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Config(id=");
            sb2.append(this.f99242b);
            sb2.append(", text=");
            sb2.append(this.f99243c);
            sb2.append(", count=");
            sb2.append(this.f99244d);
            sb2.append(", progress=");
            return androidx.appcompat.app.r.k(')', this.f99245e, sb2);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f99242b);
            parcel.writeParcelable(this.f99243c, i12);
            parcel.writeInt(this.f99244d);
            parcel.writeFloat(this.f99245e);
        }
    }

    public BblConfigureConfigsItem(@k String str, @l Config config, @k List<Config> list) {
        this.f99239b = str;
        this.f99240c = config;
        this.f99241d = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BblConfigureConfigsItem)) {
            return false;
        }
        BblConfigureConfigsItem bblConfigureConfigsItem = (BblConfigureConfigsItem) obj;
        return L.f(this.f99239b, bblConfigureConfigsItem.f99239b) && L.f(this.f99240c, bblConfigureConfigsItem.f99240c) && L.f(this.f99241d, bblConfigureConfigsItem.f99241d);
    }

    @Override // TV0.a
    public final long getId() {
        return getF96889b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96889b() {
        return this.f99239b;
    }

    public final int hashCode() {
        int iHashCode = this.f99239b.hashCode() * 31;
        Config config = this.f99240c;
        return this.f99241d.hashCode() + ((iHashCode + (config == null ? 0 : config.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BblConfigureConfigsItem(stringId=");
        sb2.append(this.f99239b);
        sb2.append(", selectedConfig=");
        sb2.append(this.f99240c);
        sb2.append(", configs=");
        return H.p(sb2, this.f99241d, ')');
    }
}
