package com.avito.android.evidence_request.repository.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProofTypesContent.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/repository/model/ProofTypesContent;", "Landroid/os/Parcelable;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProofTypesContent implements Parcelable {

    @k
    public static final Parcelable.Creator<ProofTypesContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f149208b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f149209c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<ProofType> f149210d;

    /* compiled from: ProofTypesContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProofTypesContent> {
        @Override // android.os.Parcelable.Creator
        public final ProofTypesContent createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ProofType.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ProofTypesContent(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ProofTypesContent[] newArray(int i12) {
            return new ProofTypesContent[i12];
        }
    }

    public ProofTypesContent(@k String str, @k String str2, @k List<ProofType> list) {
        this.f149208b = str;
        this.f149209c = str2;
        this.f149210d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f149208b);
        parcel.writeString(this.f149209c);
        Iterator itJ = C0.j(this.f149210d, parcel);
        while (itJ.hasNext()) {
            ((ProofType) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
