package com.avito.android.remote.model.urgency;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiUrgencyBlockResponse.kt */
@d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJR\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020 HÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020 HÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b\t\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001a¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/urgency/MultiUrgencyBlockResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "", "Lcom/avito/android/remote/model/urgency/MultiUrgencyType;", "types", "", "isSwitchOn", "", "urgencyId", "Lcom/avito/android/remote/model/urgency/MultiUrgencyEvent;", "event", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;ZJLcom/avito/android/remote/model/urgency/MultiUrgencyEvent;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Ljava/util/List;", "component4", "()Z", "component5", "()J", "component6", "()Lcom/avito/android/remote/model/urgency/MultiUrgencyEvent;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;ZJLcom/avito/android/remote/model/urgency/MultiUrgencyEvent;)Lcom/avito/android/remote/model/urgency/MultiUrgencyBlockResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "Ljava/util/List;", "getTypes", "Z", "J", "getUrgencyId", "Lcom/avito/android/remote/model/urgency/MultiUrgencyEvent;", "getEvent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MultiUrgencyBlockResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<MultiUrgencyBlockResponse> CREATOR = new Creator();

    @c("event")
    @k
    private final MultiUrgencyEvent event;

    @c("isSwitchOn")
    private final boolean isSwitchOn;

    @c("subtitle")
    @k
    private final AttributedText subtitle;

    @c("title")
    @k
    private final AttributedText title;

    @c("urgencyItems")
    @k
    private final List<MultiUrgencyType> types;

    @c("urgencyId")
    private final long urgencyId;

    /* compiled from: MultiUrgencyBlockResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MultiUrgencyBlockResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiUrgencyBlockResponse createFromParcel(@k Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(MultiUrgencyBlockResponse.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(MultiUrgencyBlockResponse.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(MultiUrgencyType.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new MultiUrgencyBlockResponse(attributedText, attributedText2, arrayList, parcel.readInt() != 0, parcel.readLong(), MultiUrgencyEvent.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiUrgencyBlockResponse[] newArray(int i12) {
            return new MultiUrgencyBlockResponse[i12];
        }
    }

    public MultiUrgencyBlockResponse(@k AttributedText attributedText, @k AttributedText attributedText2, @k List<MultiUrgencyType> list, boolean z12, long j12, @k MultiUrgencyEvent multiUrgencyEvent) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.types = list;
        this.isSwitchOn = z12;
        this.urgencyId = j12;
        this.event = multiUrgencyEvent;
    }

    public static /* synthetic */ MultiUrgencyBlockResponse copy$default(MultiUrgencyBlockResponse multiUrgencyBlockResponse, AttributedText attributedText, AttributedText attributedText2, List list, boolean z12, long j12, MultiUrgencyEvent multiUrgencyEvent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = multiUrgencyBlockResponse.title;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = multiUrgencyBlockResponse.subtitle;
        }
        AttributedText attributedText3 = attributedText2;
        if ((i12 & 4) != 0) {
            list = multiUrgencyBlockResponse.types;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            z12 = multiUrgencyBlockResponse.isSwitchOn;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            j12 = multiUrgencyBlockResponse.urgencyId;
        }
        long j13 = j12;
        if ((i12 & 32) != 0) {
            multiUrgencyEvent = multiUrgencyBlockResponse.event;
        }
        return multiUrgencyBlockResponse.copy(attributedText, attributedText3, list2, z13, j13, multiUrgencyEvent);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final List<MultiUrgencyType> component3() {
        return this.types;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSwitchOn() {
        return this.isSwitchOn;
    }

    /* renamed from: component5, reason: from getter */
    public final long getUrgencyId() {
        return this.urgencyId;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final MultiUrgencyEvent getEvent() {
        return this.event;
    }

    @k
    public final MultiUrgencyBlockResponse copy(@k AttributedText title, @k AttributedText subtitle, @k List<MultiUrgencyType> types, boolean isSwitchOn, long urgencyId, @k MultiUrgencyEvent event) {
        return new MultiUrgencyBlockResponse(title, subtitle, types, isSwitchOn, urgencyId, event);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiUrgencyBlockResponse)) {
            return false;
        }
        MultiUrgencyBlockResponse multiUrgencyBlockResponse = (MultiUrgencyBlockResponse) other;
        return L.f(this.title, multiUrgencyBlockResponse.title) && L.f(this.subtitle, multiUrgencyBlockResponse.subtitle) && L.f(this.types, multiUrgencyBlockResponse.types) && this.isSwitchOn == multiUrgencyBlockResponse.isSwitchOn && this.urgencyId == multiUrgencyBlockResponse.urgencyId && L.f(this.event, multiUrgencyBlockResponse.event);
    }

    @k
    public final MultiUrgencyEvent getEvent() {
        return this.event;
    }

    @k
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    public final List<MultiUrgencyType> getTypes() {
        return this.types;
    }

    public final long getUrgencyId() {
        return this.urgencyId;
    }

    public int hashCode() {
        return this.event.hashCode() + r.g(r.i(H.e(a.b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.types), 31, this.isSwitchOn), 31, this.urgencyId);
    }

    public final boolean isSwitchOn() {
        return this.isSwitchOn;
    }

    @k
    public String toString() {
        return "MultiUrgencyBlockResponse(title=" + this.title + ", subtitle=" + this.subtitle + ", types=" + this.types + ", isSwitchOn=" + this.isSwitchOn + ", urgencyId=" + this.urgencyId + ", event=" + this.event + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        Iterator itJ = C0.j(this.types, parcel);
        while (itJ.hasNext()) {
            ((MultiUrgencyType) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isSwitchOn ? 1 : 0);
        parcel.writeLong(this.urgencyId);
        this.event.writeToParcel(parcel, flags);
    }
}
