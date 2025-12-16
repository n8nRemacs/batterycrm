package com.avito.android.wallet.page.topup.form.remote.dto;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TopUpForm.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/remote/dto/TopUpForm;", "Landroid/os/Parcelable;", "", "title", "submitText", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", LocalPublishState.FIELDS, "Lcom/avito/android/wallet/page/topup/form/remote/dto/TopUpHint;", "hints", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TopUpForm implements Parcelable {

    @k
    public static final Parcelable.Creator<TopUpForm> CREATOR = new a();

    @c(LocalPublishState.FIELDS)
    @k
    private final List<ParameterSlot> fields;

    @c("hints")
    @k
    private final List<TopUpHint> hints;

    @c("submitText")
    @k
    private final String submitText;

    @c("title")
    @k
    private final String title;

    /* compiled from: TopUpForm.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TopUpForm> {
        @Override // android.os.Parcelable.Creator
        public final TopUpForm createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(TopUpForm.class, parcel, arrayList, iL2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(TopUpHint.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new TopUpForm(string, string2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final TopUpForm[] newArray(int i12) {
            return new TopUpForm[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TopUpForm(@k String str, @k String str2, @k List<? extends ParameterSlot> list, @k List<TopUpHint> list2) {
        this.title = str;
        this.submitText = str2;
        this.fields = list;
        this.hints = list2;
    }

    @k
    public final List<ParameterSlot> c() {
        return this.fields;
    }

    @k
    public final List<TopUpHint> d() {
        return this.hints;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getSubmitText() {
        return this.submitText;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.submitText);
        Iterator itJ = C0.j(this.fields, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Iterator itJ2 = C0.j(this.hints, parcel);
        while (itJ2.hasNext()) {
            ((TopUpHint) itJ2.next()).writeToParcel(parcel, i12);
        }
    }
}
