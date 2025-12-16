package com.avito.android.mortgage_invite.model.participant;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParticipantArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/model/participant/ParticipantArguments;", "Landroid/os/Parcelable;", "_avito_mortgage-invite_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ParticipantArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ParticipantArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f205965b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f205966c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, String> f205967d;

    /* compiled from: ParticipantArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParticipantArguments> {
        @Override // android.os.Parcelable.Creator
        public final ParticipantArguments createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new ParticipantArguments(string, string2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ParticipantArguments[] newArray(int i12) {
            return new ParticipantArguments[i12];
        }
    }

    public ParticipantArguments(@l String str, @l String str2, @k Map<String, String> map) {
        this.f205965b = str;
        this.f205966c = str2;
        this.f205967d = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantArguments)) {
            return false;
        }
        ParticipantArguments participantArguments = (ParticipantArguments) obj;
        return L.f(this.f205965b, participantArguments.f205965b) && L.f(this.f205966c, participantArguments.f205966c) && L.f(this.f205967d, participantArguments.f205967d);
    }

    public final int hashCode() {
        String str = this.f205965b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f205966c;
        return this.f205967d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParticipantArguments(flowType=");
        sb2.append(this.f205965b);
        sb2.append(", sourceType=");
        sb2.append(this.f205966c);
        sb2.append(", data=");
        return r.w(sb2, this.f205967d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f205965b);
        parcel.writeString(this.f205966c);
        Iterator itI = C0.i(parcel, this.f205967d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
