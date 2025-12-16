package com.avito.android.auto_select.confirmation_dialog.ui.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectConfirmationDialogContent.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/ui/models/AutoSelectConfirmationDialogContent;", "Landroid/os/Parcelable;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoSelectConfirmationDialogContent implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectConfirmationDialogContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f95920b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CharSequence f95921c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<AutoSelectTypedButton> f95922d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f95923e;

    /* compiled from: AutoSelectConfirmationDialogContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectConfirmationDialogContent> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectConfirmationDialogContent createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(AutoSelectTypedButton.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AutoSelectConfirmationDialogContent(string, charSequence, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectConfirmationDialogContent[] newArray(int i12) {
            return new AutoSelectConfirmationDialogContent[i12];
        }
    }

    public AutoSelectConfirmationDialogContent(@l String str, @l CharSequence charSequence, @k List<AutoSelectTypedButton> list, boolean z12) {
        this.f95920b = str;
        this.f95921c = charSequence;
        this.f95922d = list;
        this.f95923e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectConfirmationDialogContent)) {
            return false;
        }
        AutoSelectConfirmationDialogContent autoSelectConfirmationDialogContent = (AutoSelectConfirmationDialogContent) obj;
        return L.f(this.f95920b, autoSelectConfirmationDialogContent.f95920b) && L.f(this.f95921c, autoSelectConfirmationDialogContent.f95921c) && L.f(this.f95922d, autoSelectConfirmationDialogContent.f95922d) && this.f95923e == autoSelectConfirmationDialogContent.f95923e;
    }

    public final int hashCode() {
        String str = this.f95920b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.f95921c;
        return Boolean.hashCode(this.f95923e) + H.e((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.f95922d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectConfirmationDialogContent(title=");
        sb2.append(this.f95920b);
        sb2.append(", description=");
        sb2.append((Object) this.f95921c);
        sb2.append(", buttons=");
        sb2.append(this.f95922d);
        sb2.append(", isReloadOnClose=");
        return r.x(sb2, this.f95923e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f95920b);
        TextUtils.writeToParcel(this.f95921c, parcel, i12);
        Iterator itJ = C0.j(this.f95922d, parcel);
        while (itJ.hasNext()) {
            ((AutoSelectTypedButton) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f95923e ? 1 : 0);
    }

    public /* synthetic */ AutoSelectConfirmationDialogContent(String str, CharSequence charSequence, List list, boolean z12, int i12, C42822w c42822w) {
        this(str, charSequence, list, (i12 & 8) != 0 ? false : z12);
    }
}
