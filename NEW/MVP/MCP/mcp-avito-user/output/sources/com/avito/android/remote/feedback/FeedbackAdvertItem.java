package com.avito.android.remote.feedback;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ok0.InterfaceC44788a;

/* compiled from: FeedbackAdvertItem.kt */
@d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/feedback/FeedbackAdvertItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "Lok0/a;", "_avito_feedback-adverts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FeedbackAdvertItem implements com.avito.conveyor_item.a, Parcelable, InterfaceC44788a {

    @k
    public static final Parcelable.Creator<FeedbackAdvertItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f253445b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f253446c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f253447d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f253448e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<Image> f253449f;

    /* compiled from: FeedbackAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeedbackAdvertItem> {
        @Override // android.os.Parcelable.Creator
        public final FeedbackAdvertItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(FeedbackAdvertItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new FeedbackAdvertItem(string, string2, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FeedbackAdvertItem[] newArray(int i12) {
            return new FeedbackAdvertItem[i12];
        }
    }

    public FeedbackAdvertItem(@k String str, @k String str2, @l String str3, @l String str4, @l List<Image> list) {
        this.f253445b = str;
        this.f253446c = str2;
        this.f253447d = str3;
        this.f253448e = str4;
        this.f253449f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124056b() {
        return getF253445b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF253445b() {
        return this.f253445b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f253445b);
        parcel.writeString(this.f253446c);
        parcel.writeString(this.f253447d);
        parcel.writeString(this.f253448e);
        List<Image> list = this.f253449f;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
