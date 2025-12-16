package ru.avito.component.appbar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ActionMenu.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/appbar/ActionMenu;", "Landroid/os/Parcelable;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionMenu implements Parcelable {

    @k
    public static final Parcelable.Creator<ActionMenu> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430340b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430341c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f430342d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f430343e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f430344f;

    /* compiled from: ActionMenu.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionMenu> {
        @Override // android.os.Parcelable.Creator
        public final ActionMenu createFromParcel(Parcel parcel) {
            return new ActionMenu(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionMenu[] newArray(int i12) {
            return new ActionMenu[i12];
        }
    }

    public ActionMenu(@k String str, int i12, @InterfaceC42165v @l Integer num, @InterfaceC42150f @l Integer num2, @l @e0 Integer num3) {
        this.f430340b = str;
        this.f430341c = i12;
        this.f430342d = num;
        this.f430343e = num2;
        this.f430344f = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f430340b);
        parcel.writeInt(this.f430341c);
        Integer num = this.f430342d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f430343e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f430344f;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
    }

    public /* synthetic */ ActionMenu(String str, int i12, Integer num, Integer num2, Integer num3, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : num2, (i13 & 16) != 0 ? null : num3);
    }
}
