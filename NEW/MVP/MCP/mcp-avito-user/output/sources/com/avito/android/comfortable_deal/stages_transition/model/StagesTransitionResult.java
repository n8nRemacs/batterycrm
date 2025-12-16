package com.avito.android.comfortable_deal.stages_transition.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StagesTransitionResult.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/model/StagesTransitionResult;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StagesTransitionResult implements Parcelable {

    @k
    public static final Parcelable.Creator<StagesTransitionResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final StagesTransitionResultStrategy f122956b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ActionTransition f122957c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, StageTransitionField> f122958d;

    /* compiled from: StagesTransitionResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StagesTransitionResult> {
        @Override // android.os.Parcelable.Creator
        public final StagesTransitionResult createFromParcel(Parcel parcel) {
            StagesTransitionResultStrategy stagesTransitionResultStrategyCreateFromParcel = StagesTransitionResultStrategy.CREATOR.createFromParcel(parcel);
            ActionTransition actionTransitionCreateFromParcel = parcel.readInt() == 0 ? null : ActionTransition.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = f.c(StagesTransitionResult.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new StagesTransitionResult(stagesTransitionResultStrategyCreateFromParcel, actionTransitionCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final StagesTransitionResult[] newArray(int i12) {
            return new StagesTransitionResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StagesTransitionResult(@k StagesTransitionResultStrategy stagesTransitionResultStrategy, @l ActionTransition actionTransition, @k Map<String, ? extends StageTransitionField> map) {
        this.f122956b = stagesTransitionResultStrategy;
        this.f122957c = actionTransition;
        this.f122958d = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StagesTransitionResult)) {
            return false;
        }
        StagesTransitionResult stagesTransitionResult = (StagesTransitionResult) obj;
        return this.f122956b == stagesTransitionResult.f122956b && this.f122957c == stagesTransitionResult.f122957c && L.f(this.f122958d, stagesTransitionResult.f122958d);
    }

    public final int hashCode() {
        int iHashCode = this.f122956b.hashCode() * 31;
        ActionTransition actionTransition = this.f122957c;
        return this.f122958d.hashCode() + ((iHashCode + (actionTransition == null ? 0 : actionTransition.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StagesTransitionResult(strategy=");
        sb2.append(this.f122956b);
        sb2.append(", transition=");
        sb2.append(this.f122957c);
        sb2.append(", fields=");
        return r.w(sb2, this.f122958d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f122956b.writeToParcel(parcel, i12);
        ActionTransition actionTransition = this.f122957c;
        if (actionTransition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionTransition.writeToParcel(parcel, i12);
        }
        Iterator itI = C0.i(parcel, this.f122958d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i12);
        }
    }
}
