package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TooltipInfo.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b\t\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/search/TooltipInfo;", "Landroid/os/Parcelable;", "", "priority", "", "text", "showLimit", "onceShowId", "", "isShowed", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getPriority", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getShowLimit", "getOnceShowId", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setShowed", "(Ljava/lang/Boolean;)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TooltipInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<TooltipInfo> CREATOR = new Creator();

    @l
    private transient Boolean isShowed;

    @c("onceShowId")
    @l
    private final String onceShowId;

    @c("priority")
    @l
    private final Integer priority;

    @c("showLimit")
    @l
    private final Integer showLimit;

    @c("text")
    @k
    private final String text;

    /* compiled from: TooltipInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TooltipInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TooltipInfo createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TooltipInfo(numValueOf, string, numValueOf2, string2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TooltipInfo[] newArray(int i12) {
            return new TooltipInfo[i12];
        }
    }

    public TooltipInfo(@l Integer num, @k String str, @l Integer num2, @l String str2, @l Boolean bool) {
        this.priority = num;
        this.text = str;
        this.showLimit = num2;
        this.onceShowId = str2;
        this.isShowed = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getOnceShowId() {
        return this.onceShowId;
    }

    @l
    public final Integer getPriority() {
        return this.priority;
    }

    @l
    public final Integer getShowLimit() {
        return this.showLimit;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: isShowed, reason: from getter */
    public final Boolean getIsShowed() {
        return this.isShowed;
    }

    public final void setShowed(@l Boolean bool) {
        this.isShowed = bool;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.priority;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.text);
        Integer num2 = this.showLimit;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        parcel.writeString(this.onceShowId);
        Boolean bool = this.isShowed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ TooltipInfo(Integer num, String str, Integer num2, String str2, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, str, (i12 & 4) != 0 ? null : num2, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : bool);
    }
}
