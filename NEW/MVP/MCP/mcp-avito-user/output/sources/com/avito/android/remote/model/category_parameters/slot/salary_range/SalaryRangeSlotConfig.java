package com.avito.android.remote.model.category_parameters.slot.salary_range;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: SalaryRangeSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/salary_range/SalaryRangeSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "hint", "placeholderFrom", "placeholderTo", "prefixFrom", "prefixTo", "range", "period", "vacancyTitle", AddressParameter.TYPE, "", "hideTitle", "", "length", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHint", "()Ljava/lang/String;", "getPlaceholderFrom", "getPlaceholderTo", "getPrefixFrom", "getPrefixTo", "getRange", "getPeriod", "getVacancyTitle", "getAddress", "Ljava/lang/Boolean;", "getHideTitle", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getLength", "()Ljava/lang/Integer;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SalaryRangeSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<SalaryRangeSlotConfig> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c("hideTitle")
    @l
    private final Boolean hideTitle;

    @c("hint")
    @l
    private final String hint;

    @c("maxLength")
    @l
    private final Integer length;

    @c("period")
    @k
    private final String period;

    @c("placeholder_from")
    @l
    private final String placeholderFrom;

    @c("placeholder_to")
    @l
    private final String placeholderTo;

    @c("prefix_from")
    @l
    private final String prefixFrom;

    @c("prefix_to")
    @l
    private final String prefixTo;

    @c("salary_range")
    @k
    private final String range;

    @c("vacancy_title")
    @k
    private final String vacancyTitle;

    /* compiled from: SalaryRangeSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SalaryRangeSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SalaryRangeSlotConfig createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SalaryRangeSlotConfig(string, string2, string3, string4, string5, string6, string7, string8, string9, boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SalaryRangeSlotConfig[] newArray(int i12) {
            return new SalaryRangeSlotConfig[i12];
        }
    }

    public SalaryRangeSlotConfig(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @k String str6, @k String str7, @k String str8, @k String str9, @l Boolean bool, @l Integer num) {
        this.hint = str;
        this.placeholderFrom = str2;
        this.placeholderTo = str3;
        this.prefixFrom = str4;
        this.prefixTo = str5;
        this.range = str6;
        this.period = str7;
        this.vacancyTitle = str8;
        this.address = str9;
        this.hideTitle = bool;
        this.length = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final String getAddress() {
        return this.address;
    }

    @l
    public final Boolean getHideTitle() {
        return this.hideTitle;
    }

    @l
    public final String getHint() {
        return this.hint;
    }

    @l
    public final Integer getLength() {
        return this.length;
    }

    @k
    public final String getPeriod() {
        return this.period;
    }

    @l
    public final String getPlaceholderFrom() {
        return this.placeholderFrom;
    }

    @l
    public final String getPlaceholderTo() {
        return this.placeholderTo;
    }

    @l
    public final String getPrefixFrom() {
        return this.prefixFrom;
    }

    @l
    public final String getPrefixTo() {
        return this.prefixTo;
    }

    @k
    public final String getRange() {
        return this.range;
    }

    @k
    public final String getVacancyTitle() {
        return this.vacancyTitle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.hint);
        parcel.writeString(this.placeholderFrom);
        parcel.writeString(this.placeholderTo);
        parcel.writeString(this.prefixFrom);
        parcel.writeString(this.prefixTo);
        parcel.writeString(this.range);
        parcel.writeString(this.period);
        parcel.writeString(this.vacancyTitle);
        parcel.writeString(this.address);
        Boolean bool = this.hideTitle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Integer num = this.length;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
    }
}
