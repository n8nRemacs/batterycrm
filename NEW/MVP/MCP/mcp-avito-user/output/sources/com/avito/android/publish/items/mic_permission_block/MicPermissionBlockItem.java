package com.avito.android.publish.items.mic_permission_block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.Theme;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MicPermissionBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Action", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MicPermissionBlockItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<MicPermissionBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f237027b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Action f237028c;

    /* renamed from: d, reason: collision with root package name */
    public final int f237029d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Theme f237030e;

    /* compiled from: MicPermissionBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "OpenSettings", "ShowSystemMicPermission", "Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem$Action$OpenSettings;", "Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem$Action$ShowSystemMicPermission;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Action implements Parcelable {

        /* compiled from: MicPermissionBlockItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem$Action$OpenSettings;", "Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem$Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class OpenSettings extends Action {

            @k
            public static final Parcelable.Creator<OpenSettings> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final boolean f237031b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f237032c;

            /* compiled from: MicPermissionBlockItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<OpenSettings> {
                @Override // android.os.Parcelable.Creator
                public final OpenSettings createFromParcel(Parcel parcel) {
                    return new OpenSettings(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final OpenSettings[] newArray(int i12) {
                    return new OpenSettings[i12];
                }
            }

            public OpenSettings(boolean z12) {
                super(null);
                this.f237031b = z12;
                this.f237032c = true;
            }

            @Override // com.avito.android.publish.items.mic_permission_block.MicPermissionBlockItem.Action
            /* renamed from: c, reason: from getter */
            public final boolean getF237033b() {
                return this.f237031b;
            }

            @Override // com.avito.android.publish.items.mic_permission_block.MicPermissionBlockItem.Action
            /* renamed from: d, reason: from getter */
            public final boolean getF237032c() {
                return this.f237032c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenSettings) && this.f237031b == ((OpenSettings) obj).f237031b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f237031b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("OpenSettings(isEditing="), this.f237031b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f237031b ? 1 : 0);
            }
        }

        /* compiled from: MicPermissionBlockItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem$Action$ShowSystemMicPermission;", "Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem$Action;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class ShowSystemMicPermission extends Action {

            @k
            public static final Parcelable.Creator<ShowSystemMicPermission> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final boolean f237033b;

            /* compiled from: MicPermissionBlockItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowSystemMicPermission> {
                @Override // android.os.Parcelable.Creator
                public final ShowSystemMicPermission createFromParcel(Parcel parcel) {
                    return new ShowSystemMicPermission(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ShowSystemMicPermission[] newArray(int i12) {
                    return new ShowSystemMicPermission[i12];
                }
            }

            public ShowSystemMicPermission(boolean z12) {
                super(null);
                this.f237033b = z12;
            }

            @Override // com.avito.android.publish.items.mic_permission_block.MicPermissionBlockItem.Action
            /* renamed from: c, reason: from getter */
            public final boolean getF237033b() {
                return this.f237033b;
            }

            @Override // com.avito.android.publish.items.mic_permission_block.MicPermissionBlockItem.Action
            /* renamed from: d */
            public final boolean getF237032c() {
                return false;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSystemMicPermission) && this.f237033b == ((ShowSystemMicPermission) obj).f237033b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f237033b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("ShowSystemMicPermission(isEditing="), this.f237033b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f237033b ? 1 : 0);
            }
        }

        public /* synthetic */ Action(C42822w c42822w) {
            this();
        }

        /* renamed from: c */
        public abstract boolean getF237033b();

        /* renamed from: d */
        public abstract boolean getF237032c();

        public Action() {
        }
    }

    /* compiled from: MicPermissionBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MicPermissionBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final MicPermissionBlockItem createFromParcel(Parcel parcel) {
            return new MicPermissionBlockItem(parcel.readString(), (Action) parcel.readParcelable(MicPermissionBlockItem.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MicPermissionBlockItem[] newArray(int i12) {
            return new MicPermissionBlockItem[i12];
        }
    }

    public MicPermissionBlockItem(@k String str, @k Action action, int i12, @l Theme theme) {
        this.f237027b = str;
        this.f237028c = action;
        this.f237029d = i12;
        this.f237030e = theme;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicPermissionBlockItem)) {
            return false;
        }
        MicPermissionBlockItem micPermissionBlockItem = (MicPermissionBlockItem) obj;
        return L.f(this.f237027b, micPermissionBlockItem.f237027b) && L.f(this.f237028c, micPermissionBlockItem.f237028c) && this.f237029d == micPermissionBlockItem.f237029d && this.f237030e == micPermissionBlockItem.f237030e;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229281b() {
        return this.f237027b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f237029d, (this.f237028c.hashCode() + (this.f237027b.hashCode() * 31)) * 31, 31);
        Theme theme = this.f237030e;
        return iE2 + (theme == null ? 0 : theme.hashCode());
    }

    @k
    public final String toString() {
        return "MicPermissionBlockItem(stringId=" + this.f237027b + ", action=" + this.f237028c + ", actionTextRes=" + this.f237029d + ", theme=" + this.f237030e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f237027b);
        parcel.writeParcelable(this.f237028c, i12);
        parcel.writeInt(this.f237029d);
        Theme theme = this.f237030e;
        if (theme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(theme.name());
        }
    }

    public /* synthetic */ MicPermissionBlockItem(String str, Action action, int i12, Theme theme, int i13, C42822w c42822w) {
        this(str, action, i12, (i13 & 8) != 0 ? null : theme);
    }
}
