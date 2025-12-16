package com.avito.android.service_booking;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/service_booking/SbCommentBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "Lcom/avito/android/service_booking/SerializableServiceBookingBlock;", "", "id", "value", ChannelContext.Item.PLACEHOLDER, "", "isOptional", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "setValue", "(Ljava/lang/String;)V", "getPlaceholder", "setPlaceholder", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbCommentBlock implements ServiceBookingBlock, SerializableServiceBookingBlock<String> {

    @k
    public static final Parcelable.Creator<SbCommentBlock> CREATOR = new a();

    @c("id")
    @k
    private final String id;

    @c("optional")
    @l
    private final Boolean isOptional;

    @c(ChannelContext.Item.PLACEHOLDER)
    @k
    private String placeholder;

    @c("value")
    @l
    private String value;

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbCommentBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbCommentBlock createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SbCommentBlock(string, string2, string3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SbCommentBlock[] newArray(int i12) {
            return new SbCommentBlock[i12];
        }
    }

    public SbCommentBlock(@k String str, @l String str2, @k String str3, @l Boolean bool) {
        this.id = str;
        this.value = str2;
        this.placeholder = str3;
        this.isOptional = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SbCommentBlock.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        SbCommentBlock sbCommentBlock = (SbCommentBlock) obj;
        return L.f(this.id, sbCommentBlock.id) && L.f(this.value, sbCommentBlock.value) && L.f(this.placeholder, sbCommentBlock.placeholder) && L.f(this.isOptional, sbCommentBlock.isOptional);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iHashCode = this.placeholder.hashCode() + (this.id.hashCode() * 31);
        int i12 = iHashCode * 31;
        Boolean bool = this.isOptional;
        return i12 + (bool != null ? bool.hashCode() : 0) + iHashCode;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbCommentBlock(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", isOptional=");
        return C0.g(sb2, this.isOptional, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.value);
        parcel.writeString(this.placeholder);
        Boolean bool = this.isOptional;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
