package com.avito.android.short_term_rent.bookingform.items.toggle_v2;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import tw0.InterfaceC48733a;

/* compiled from: ToggleV2Item.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/ToggleV2Options;", "Ltw0/a;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToggleV2Options implements InterfaceC48733a, Parcelable {

    @k
    public static final Parcelable.Creator<ToggleV2Options> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281725b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f281726c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f281727d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Long f281728e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f281729f;

    /* compiled from: ToggleV2Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ToggleV2Options> {
        @Override // android.os.Parcelable.Creator
        public final ToggleV2Options createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ToggleV2Options.class.getClassLoader());
            return new ToggleV2Options(string, parcel.readInt() != 0, parcel.readInt() != 0, attributedText, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final ToggleV2Options[] newArray(int i12) {
            return new ToggleV2Options[i12];
        }
    }

    public ToggleV2Options(@k String str, boolean z12, boolean z13, @k AttributedText attributedText, @l Long l12) {
        this.f281725b = str;
        this.f281726c = attributedText;
        this.f281727d = z12;
        this.f281728e = l12;
        this.f281729f = z13;
    }

    @Override // tw0.InterfaceC48733a
    public final boolean a(@k Object obj) {
        if (obj instanceof ToggleV2Options) {
            if (L.f(this.f281725b, ((ToggleV2Options) obj).f281725b)) {
                return true;
            }
        }
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
        if (!(obj instanceof ToggleV2Options)) {
            return false;
        }
        ToggleV2Options toggleV2Options = (ToggleV2Options) obj;
        return L.f(this.f281725b, toggleV2Options.f281725b) && L.f(this.f281726c, toggleV2Options.f281726c) && this.f281727d == toggleV2Options.f281727d && L.f(this.f281728e, toggleV2Options.f281728e) && this.f281729f == toggleV2Options.f281729f;
    }

    @Override // tw0.InterfaceC48733a
    @k
    /* renamed from: getText, reason: from getter */
    public final AttributedText getF281726c() {
        return this.f281726c;
    }

    public final int hashCode() {
        int i12 = r.i(com.avito.android.actions_sheet.a.b(this.f281725b.hashCode() * 31, 31, this.f281726c), 31, this.f281727d);
        Long l12 = this.f281728e;
        return Boolean.hashCode(this.f281729f) + ((i12 + (l12 == null ? 0 : l12.hashCode())) * 31);
    }

    @Override // tw0.InterfaceC48733a
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF281727d() {
        return this.f281727d;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToggleV2Options(id=");
        sb2.append(this.f281725b);
        sb2.append(", text=");
        sb2.append(this.f281726c);
        sb2.append(", isEnabled=");
        sb2.append(this.f281727d);
        sb2.append(", value=");
        sb2.append(this.f281728e);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f281729f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f281725b);
        parcel.writeParcelable(this.f281726c, i12);
        parcel.writeInt(this.f281727d ? 1 : 0);
        Long l12 = this.f281728e;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeInt(this.f281729f ? 1 : 0);
    }
}
