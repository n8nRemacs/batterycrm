package com.avito.android.re_agent_landing.landing.items.action_block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionBlockItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/action_block/CreationFlow;", "Landroid/os/Parcelable;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CreationFlow implements Parcelable {

    @k
    public static final Parcelable.Creator<CreationFlow> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250719b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalImage f250720c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalImage f250721d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final CreationButton f250722e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f250723f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f250724g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f250725h;

    /* compiled from: ActionBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreationFlow> {
        @Override // android.os.Parcelable.Creator
        public final CreationFlow createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(CreationFlow.class.getClassLoader());
            UniversalImage universalImage2 = (UniversalImage) parcel.readParcelable(CreationFlow.class.getClassLoader());
            CreationButton creationButtonCreateFromParcel = parcel.readInt() == 0 ? null : CreationButton.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(CreationInfoBlock.CREATOR, parcel, arrayList, iC2, 1);
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(CreationFlow.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CreationFlow(string, universalImage, universalImage2, creationButtonCreateFromParcel, arrayList, attributedText, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CreationFlow[] newArray(int i12) {
            return new CreationFlow[i12];
        }
    }

    public CreationFlow(@k String str, @k UniversalImage universalImage, @k UniversalImage universalImage2, @l CreationButton creationButton, @k ArrayList arrayList, @l AttributedText attributedText, @l Boolean bool) {
        this.f250719b = str;
        this.f250720c = universalImage;
        this.f250721d = universalImage2;
        this.f250722e = creationButton;
        this.f250723f = arrayList;
        this.f250724g = attributedText;
        this.f250725h = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationFlow)) {
            return false;
        }
        CreationFlow creationFlow = (CreationFlow) obj;
        return L.f(this.f250719b, creationFlow.f250719b) && L.f(this.f250720c, creationFlow.f250720c) && L.f(this.f250721d, creationFlow.f250721d) && L.f(this.f250722e, creationFlow.f250722e) && this.f250723f.equals(creationFlow.f250723f) && L.f(this.f250724g, creationFlow.f250724g) && L.f(this.f250725h, creationFlow.f250725h);
    }

    public final int hashCode() {
        int iA2 = com.avito.android.actions_sheet.a.a(com.avito.android.actions_sheet.a.a(this.f250719b.hashCode() * 31, 31, this.f250720c), 31, this.f250721d);
        CreationButton creationButton = this.f250722e;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f250723f, (iA2 + (creationButton == null ? 0 : creationButton.hashCode())) * 31, 31);
        AttributedText attributedText = this.f250724g;
        int iHashCode = (iG2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.f250725h;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationFlow(title=");
        sb2.append(this.f250719b);
        sb2.append(", image=");
        sb2.append(this.f250720c);
        sb2.append(", imageActive=");
        sb2.append(this.f250721d);
        sb2.append(", button=");
        sb2.append(this.f250722e);
        sb2.append(", infoBlocks=");
        sb2.append(this.f250723f);
        sb2.append(", disclaimer=");
        sb2.append(this.f250724g);
        sb2.append(", lockedByProfileLimit=");
        return C0.g(sb2, this.f250725h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f250719b);
        parcel.writeParcelable(this.f250720c, i12);
        parcel.writeParcelable(this.f250721d, i12);
        CreationButton creationButton = this.f250722e;
        if (creationButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            creationButton.writeToParcel(parcel, i12);
        }
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f250723f, parcel);
        while (itZ.hasNext()) {
            ((CreationInfoBlock) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f250724g, i12);
        Boolean bool = this.f250725h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
