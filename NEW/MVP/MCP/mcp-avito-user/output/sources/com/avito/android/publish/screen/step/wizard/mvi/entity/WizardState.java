package com.avito.android.publish.screen.step.wizard.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.WizardParameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WizardState.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/mvi/entity/WizardState;", "Landroid/os/Parcelable;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class WizardState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f242531b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f242532c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final WizardParameter f242533d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<TV0.a> f242534e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f242529f = new a(null);

    @k
    public static final Parcelable.Creator<WizardState> CREATOR = new b();

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final WizardState f242530g = new WizardState(true, false, null, C42784z0.f406748b);

    /* compiled from: WizardState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/mvi/entity/WizardState$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WizardState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<WizardState> {
        @Override // android.os.Parcelable.Creator
        public final WizardState createFromParcel(Parcel parcel) {
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            WizardParameter wizardParameter = (WizardParameter) parcel.readParcelable(WizardState.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(parcel.readValue(WizardState.class.getClassLoader()));
            }
            return new WizardState(z12, z13, wizardParameter, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WizardState[] newArray(int i12) {
            return new WizardState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WizardState(boolean z12, boolean z13, @l WizardParameter wizardParameter, @k List<? extends TV0.a> list) {
        this.f242531b = z12;
        this.f242532c = z13;
        this.f242533d = wizardParameter;
        this.f242534e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WizardState a(WizardState wizardState, boolean z12, WizardParameter wizardParameter, ArrayList arrayList, int i12) {
        boolean z13 = (i12 & 1) != 0 ? wizardState.f242531b : false;
        if ((i12 & 2) != 0) {
            z12 = wizardState.f242532c;
        }
        if ((i12 & 4) != 0) {
            wizardParameter = wizardState.f242533d;
        }
        List list = arrayList;
        if ((i12 & 8) != 0) {
            list = wizardState.f242534e;
        }
        wizardState.getClass();
        return new WizardState(z13, z12, wizardParameter, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WizardState)) {
            return false;
        }
        WizardState wizardState = (WizardState) obj;
        return this.f242531b == wizardState.f242531b && this.f242532c == wizardState.f242532c && L.f(this.f242533d, wizardState.f242533d) && L.f(this.f242534e, wizardState.f242534e);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f242531b) * 31, 31, this.f242532c);
        WizardParameter wizardParameter = this.f242533d;
        return this.f242534e.hashCode() + ((i12 + (wizardParameter == null ? 0 : wizardParameter.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WizardState(isLoading=");
        sb2.append(this.f242531b);
        sb2.append(", isError=");
        sb2.append(this.f242532c);
        sb2.append(", parameter=");
        sb2.append(this.f242533d);
        sb2.append(", items=");
        return H.p(sb2, this.f242534e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f242531b ? 1 : 0);
        parcel.writeInt(this.f242532c ? 1 : 0);
        parcel.writeParcelable(this.f242533d, i12);
        Iterator itJ = C0.j(this.f242534e, parcel);
        while (itJ.hasNext()) {
            parcel.writeValue(itJ.next());
        }
    }
}
