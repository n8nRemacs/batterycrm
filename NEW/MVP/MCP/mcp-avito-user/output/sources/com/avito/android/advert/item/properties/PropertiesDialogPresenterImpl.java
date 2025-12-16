package com.avito.android.advert.item.properties;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert.item.modelSpecs.link.ModelSpecsLinkItem;
import com.avito.android.util.Kundle;
import com.avito.android.util.y6;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import u6.InterfaceC48807a;

/* compiled from: PropertiesDialogPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/properties/PropertiesDialogPresenterImpl;", "Lcom/avito/android/advert/item/properties/f;", "PropertiesDialogState", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PropertiesDialogPresenterImpl implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<b> f78268a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f78269b = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: c, reason: collision with root package name */
    @k
    public PropertiesDialogState f78270c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public a f78271d;

    /* compiled from: PropertiesDialogPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/properties/PropertiesDialogPresenterImpl$PropertiesDialogState;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class PropertiesDialogState implements Parcelable {

        @k
        public static final Parcelable.Creator<PropertiesDialogState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f78272b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f78273c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<ParcelableItem> f78274d;

        /* compiled from: PropertiesDialogPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PropertiesDialogState> {
            @Override // android.os.Parcelable.Creator
            public final PropertiesDialogState createFromParcel(Parcel parcel) {
                int iL2 = 0;
                boolean z12 = parcel.readInt() != 0;
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(PropertiesDialogState.class, parcel, arrayList, iL2, 1);
                }
                return new PropertiesDialogState(string, arrayList, z12);
            }

            @Override // android.os.Parcelable.Creator
            public final PropertiesDialogState[] newArray(int i12) {
                return new PropertiesDialogState[i12];
            }
        }

        public PropertiesDialogState() {
            this(false, null, null, 7, null);
        }

        public static PropertiesDialogState a(PropertiesDialogState propertiesDialogState) {
            String str = propertiesDialogState.f78273c;
            List<ParcelableItem> list = propertiesDialogState.f78274d;
            propertiesDialogState.getClass();
            return new PropertiesDialogState(str, list, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PropertiesDialogState)) {
                return false;
            }
            PropertiesDialogState propertiesDialogState = (PropertiesDialogState) obj;
            return this.f78272b == propertiesDialogState.f78272b && L.f(this.f78273c, propertiesDialogState.f78273c) && L.f(this.f78274d, propertiesDialogState.f78274d);
        }

        public final int hashCode() {
            return this.f78274d.hashCode() + H.d(Boolean.hashCode(this.f78272b) * 31, 31, this.f78273c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PropertiesDialogState(isVisible=");
            sb2.append(this.f78272b);
            sb2.append(", title=");
            sb2.append(this.f78273c);
            sb2.append(", propertiesItems=");
            return H.p(sb2, this.f78274d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f78272b ? 1 : 0);
            parcel.writeString(this.f78273c);
            Iterator itJ = C0.j(this.f78274d, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
        }

        public PropertiesDialogState(@k String str, @k List list, boolean z12) {
            this.f78272b = z12;
            this.f78273c = str;
            this.f78274d = list;
        }

        public PropertiesDialogState(boolean z12, String str, List list, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? C42784z0.f406748b : list, (i12 & 1) != 0 ? false : z12);
        }
    }

    @Inject
    public PropertiesDialogPresenterImpl(@k h31.e<b> eVar, @l @InterfaceC48807a Kundle kundle) {
        PropertiesDialogState propertiesDialogState;
        this.f78268a = eVar;
        this.f78270c = (kundle == null || (propertiesDialogState = (PropertiesDialogState) kundle.d("properties_dialog_state")) == null) ? new PropertiesDialogState(false, null, null, 7, null) : propertiesDialogState;
    }

    @Override // com.avito.android.advert.item.properties.f
    public final void a() {
        this.f78270c = PropertiesDialogState.a(this.f78270c);
        a aVar = this.f78271d;
        if (aVar != null) {
            aVar.setOnDismissListener(null);
            aVar.r();
        }
        this.f78269b.e();
    }

    @Override // com.avito.android.advert.item.properties.f
    public final void b(@k Context context) {
        if (this.f78270c.f78272b) {
            b bVar = this.f78268a.get();
            String str = this.f78270c.f78273c;
            bVar.getClass();
            a aVar = new a(bVar.f78279a, bVar.f78280b, str, context);
            this.f78271d = aVar;
            d(aVar, this.f78270c);
        }
    }

    @Override // com.avito.android.advert.item.properties.f
    public final void c(@k Context context, @k String str, @k kotlin.collections.builders.b bVar) {
        this.f78270c = new PropertiesDialogState(str, bVar, true);
        b bVar2 = this.f78268a.get();
        bVar2.getClass();
        a aVar = new a(bVar2.f78279a, bVar2.f78280b, str, context);
        this.f78271d = aVar;
        d(aVar, this.f78270c);
    }

    public final void d(a aVar, PropertiesDialogState propertiesDialogState) {
        aVar.setOnDismissListener(new g(0, this, propertiesDialogState));
        List<ParcelableItem> list = propertiesDialogState.f78274d;
        RecyclerView recyclerView = aVar.f78277G;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), y6.b(36));
        UV0.c cVar = new UV0.c(list);
        com.avito.konveyor.adapter.a aVar2 = aVar.f78276F;
        aVar2.c(cVar);
        aVar.f78275E.notifyDataSetChanged();
        if (C42745f0.Q(list) instanceof ModelSpecsLinkItem) {
            int iB2 = aVar2.b(list.size() - 1);
            RecyclerView recyclerView2 = aVar.f78277G;
            RecyclerView recyclerView3 = recyclerView2 != null ? recyclerView2 : null;
            if (recyclerView3.getItemDecorationCount() > 0 && (recyclerView3.a0(0) instanceof e)) {
                recyclerView3.s0(0);
            }
            recyclerView3.l(new e(iB2), 0);
        }
        com.avito.android.lib.util.g.a(aVar);
    }

    @Override // com.avito.android.advert.item.properties.f
    @k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f78270c, "properties_dialog_state");
        return kundle;
    }

    @Override // com.avito.android.advert.item.properties.f
    public final void onPause() {
        a aVar = this.f78271d;
        if (aVar != null) {
            aVar.setOnDismissListener(null);
            aVar.r();
        }
        this.f78269b.e();
    }
}
