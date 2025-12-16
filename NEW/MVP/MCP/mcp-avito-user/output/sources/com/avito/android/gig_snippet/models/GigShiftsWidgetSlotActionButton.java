package com.avito.android.gig_snippet.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GigShiftsWidgetItem.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlotActionButton;", "Landroid/os/Parcelable;", "", "label", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "c", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftsWidgetSlotActionButton implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShiftsWidgetSlotActionButton> CREATOR = new a();

    @c("label")
    @k
    private final String label;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final String uri;

    /* compiled from: GigShiftsWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftsWidgetSlotActionButton> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlotActionButton createFromParcel(Parcel parcel) {
            return new GigShiftsWidgetSlotActionButton(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetSlotActionButton[] newArray(int i12) {
            return new GigShiftsWidgetSlotActionButton[i12];
        }
    }

    public GigShiftsWidgetSlotActionButton(@k String str, @l String str2) {
        this.label = str;
        this.uri = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.label);
        parcel.writeString(this.uri);
    }
}
