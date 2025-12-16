package com.avito.android.remote.model;

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

/* compiled from: ConsultationFormData.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\n\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/FormInput;", "Landroid/os/Parcelable;", "", "title", "hint", "data", "errorText", "", "isRequired", "isHidden", "isPhoneField", "", "maxLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getHint", "getData", "getErrorText", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Z", "()Z", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FormInput implements Parcelable {

    @k
    public static final Parcelable.Creator<FormInput> CREATOR = new Creator();

    @c("data")
    @l
    private final String data;

    @c("errorText")
    @l
    private final String errorText;

    @c("hint")
    @l
    private final String hint;

    @c("isHidden")
    @l
    private final Boolean isHidden;

    @c("isPhoneField")
    private final boolean isPhoneField;

    @c("isRequired")
    @l
    private final Boolean isRequired;

    @c("maxLength")
    @l
    private final Integer maxLength;

    @c("title")
    @l
    private final String title;

    /* compiled from: ConsultationFormData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FormInput> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FormInput createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FormInput(string, string2, string3, string4, boolValueOf, boolValueOf2, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FormInput[] newArray(int i12) {
            return new FormInput[i12];
        }
    }

    public FormInput() {
        this(null, null, null, null, null, null, false, null, 255, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getData() {
        return this.data;
    }

    @l
    public final String getErrorText() {
        return this.errorText;
    }

    @l
    public final String getHint() {
        return this.hint;
    }

    @l
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: isHidden, reason: from getter */
    public final Boolean getIsHidden() {
        return this.isHidden;
    }

    /* renamed from: isPhoneField, reason: from getter */
    public final boolean getIsPhoneField() {
        return this.isPhoneField;
    }

    @l
    /* renamed from: isRequired, reason: from getter */
    public final Boolean getIsRequired() {
        return this.isRequired;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.hint);
        parcel.writeString(this.data);
        parcel.writeString(this.errorText);
        Boolean bool = this.isRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeInt(this.isPhoneField ? 1 : 0);
        Integer num = this.maxLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
    }

    public FormInput(@l String str, @l String str2, @l String str3, @l String str4, @l Boolean bool, @l Boolean bool2, boolean z12, @l Integer num) {
        this.title = str;
        this.hint = str2;
        this.data = str3;
        this.errorText = str4;
        this.isRequired = bool;
        this.isHidden = bool2;
        this.isPhoneField = z12;
        this.maxLength = num;
    }

    public /* synthetic */ FormInput(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, boolean z12, Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? Boolean.FALSE : bool2, (i12 & 64) != 0 ? false : z12, (i12 & 128) == 0 ? num : null);
    }
}
