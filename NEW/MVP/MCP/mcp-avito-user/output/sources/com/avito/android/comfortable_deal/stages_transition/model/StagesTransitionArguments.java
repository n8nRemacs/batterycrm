package com.avito.android.comfortable_deal.stages_transition.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StagesTransitionArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/model/StagesTransitionArguments;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StagesTransitionArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<StagesTransitionArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f122952b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f122953c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ActionTransition f122954d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<String, StageTransitionField> f122955e;

    /* compiled from: StagesTransitionArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StagesTransitionArguments> {
        @Override // android.os.Parcelable.Creator
        public final StagesTransitionArguments createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            ActionTransition actionTransitionCreateFromParcel = ActionTransition.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = f.c(StagesTransitionArguments.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new StagesTransitionArguments(string, string2, actionTransitionCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final StagesTransitionArguments[] newArray(int i12) {
            return new StagesTransitionArguments[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StagesTransitionArguments(@k String str, @k String str2, @k ActionTransition actionTransition, @k Map<String, ? extends StageTransitionField> map) {
        this.f122952b = str;
        this.f122953c = str2;
        this.f122954d = actionTransition;
        this.f122955e = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StagesTransitionArguments)) {
            return false;
        }
        StagesTransitionArguments stagesTransitionArguments = (StagesTransitionArguments) obj;
        return L.f(this.f122952b, stagesTransitionArguments.f122952b) && L.f(this.f122953c, stagesTransitionArguments.f122953c) && this.f122954d == stagesTransitionArguments.f122954d && L.f(this.f122955e, stagesTransitionArguments.f122955e);
    }

    public final int hashCode() {
        return this.f122955e.hashCode() + ((this.f122954d.hashCode() + H.d(this.f122952b.hashCode() * 31, 31, this.f122953c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StagesTransitionArguments(requestKey=");
        sb2.append(this.f122952b);
        sb2.append(", dealId=");
        sb2.append(this.f122953c);
        sb2.append(", transition=");
        sb2.append(this.f122954d);
        sb2.append(", fields=");
        return r.w(sb2, this.f122955e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f122952b);
        parcel.writeString(this.f122953c);
        this.f122954d.writeToParcel(parcel, i12);
        Iterator itI = C0.i(parcel, this.f122955e);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i12);
        }
    }
}
