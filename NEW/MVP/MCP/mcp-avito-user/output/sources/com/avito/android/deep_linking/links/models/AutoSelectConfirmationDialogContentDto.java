package com.avito.android.deep_linking.links.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectConfirmationDialogContentDto.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/deep_linking/links/models/AutoSelectConfirmationDialogContentDto;", "Landroid/os/Parcelable;", "", "title", "description", "", "Lcom/avito/android/deep_linking/links/models/AutoSelectTypedButtonDto;", "buttons", "", "isReloadOnClose", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Ljava/util/List;", "c", "()Ljava/util/List;", "Z", "d", "()Z", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AutoSelectConfirmationDialogContentDto implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectConfirmationDialogContentDto> CREATOR = new a();

    @c("buttons")
    @k
    private final List<AutoSelectTypedButtonDto> buttons;

    @c("description")
    @l
    private final String description;

    @c("isReloadOnClose")
    private final boolean isReloadOnClose;

    @c("title")
    @l
    private final String title;

    /* compiled from: AutoSelectConfirmationDialogContentDto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectConfirmationDialogContentDto> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectConfirmationDialogContentDto createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(AutoSelectTypedButtonDto.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AutoSelectConfirmationDialogContentDto(string, string2, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectConfirmationDialogContentDto[] newArray(int i12) {
            return new AutoSelectConfirmationDialogContentDto[i12];
        }
    }

    public AutoSelectConfirmationDialogContentDto(@l String str, @l String str2, @k List<AutoSelectTypedButtonDto> list, boolean z12) {
        this.title = str;
        this.description = str2;
        this.buttons = list;
        this.isReloadOnClose = z12;
    }

    @k
    public final List<AutoSelectTypedButtonDto> c() {
        return this.buttons;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsReloadOnClose() {
        return this.isReloadOnClose;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectConfirmationDialogContentDto)) {
            return false;
        }
        AutoSelectConfirmationDialogContentDto autoSelectConfirmationDialogContentDto = (AutoSelectConfirmationDialogContentDto) obj;
        return L.f(this.title, autoSelectConfirmationDialogContentDto.title) && L.f(this.description, autoSelectConfirmationDialogContentDto.description) && L.f(this.buttons, autoSelectConfirmationDialogContentDto.buttons) && this.isReloadOnClose == autoSelectConfirmationDialogContentDto.isReloadOnClose;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        return Boolean.hashCode(this.isReloadOnClose) + H.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.buttons);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectConfirmationDialogContentDto(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", buttons=");
        sb2.append(this.buttons);
        sb2.append(", isReloadOnClose=");
        return r.x(sb2, this.isReloadOnClose, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator itJ = C0.j(this.buttons, parcel);
        while (itJ.hasNext()) {
            ((AutoSelectTypedButtonDto) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.isReloadOnClose ? 1 : 0);
    }

    public /* synthetic */ AutoSelectConfirmationDialogContentDto(String str, String str2, List list, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, list, (i12 & 8) != 0 ? false : z12);
    }
}
