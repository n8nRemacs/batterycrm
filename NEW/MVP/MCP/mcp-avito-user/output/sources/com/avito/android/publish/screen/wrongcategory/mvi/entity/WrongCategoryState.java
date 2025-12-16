package com.avito.android.publish.screen.wrongcategory.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.screen.wrongcategory.ui.SelectListWidget;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WrongCategoryState.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/mvi/entity/WrongCategoryState;", "Landroid/os/Parcelable;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class WrongCategoryState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<SelectListWidget.Data> f242599b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final SelectListWidget.Data f242600c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f242601d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f242602e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f242597f = new a(null);

    @k
    public static final Parcelable.Creator<WrongCategoryState> CREATOR = new b();

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final WrongCategoryState f242598g = new WrongCategoryState(C42784z0.f406748b, null, false, com.avito.android.printable_text.b.c(R.string.wrong_category_caption, new Serializable[0]));

    /* compiled from: WrongCategoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/mvi/entity/WrongCategoryState$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WrongCategoryState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<WrongCategoryState> {
        @Override // android.os.Parcelable.Creator
        public final WrongCategoryState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(SelectListWidget.Data.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new WrongCategoryState(arrayList, parcel.readInt() == 0 ? null : SelectListWidget.Data.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PrintableText) parcel.readParcelable(WrongCategoryState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WrongCategoryState[] newArray(int i12) {
            return new WrongCategoryState[i12];
        }
    }

    public WrongCategoryState(@k List<SelectListWidget.Data> list, @l SelectListWidget.Data data, boolean z12, @k PrintableText printableText) {
        this.f242599b = list;
        this.f242600c = data;
        this.f242601d = z12;
        this.f242602e = printableText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrongCategoryState)) {
            return false;
        }
        WrongCategoryState wrongCategoryState = (WrongCategoryState) obj;
        return L.f(this.f242599b, wrongCategoryState.f242599b) && L.f(this.f242600c, wrongCategoryState.f242600c) && this.f242601d == wrongCategoryState.f242601d && L.f(this.f242602e, wrongCategoryState.f242602e);
    }

    public final int hashCode() {
        int iHashCode = this.f242599b.hashCode() * 31;
        SelectListWidget.Data data = this.f242600c;
        return this.f242602e.hashCode() + r.i((iHashCode + (data == null ? 0 : data.hashCode())) * 31, 31, this.f242601d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WrongCategoryState(categories=");
        sb2.append(this.f242599b);
        sb2.append(", selectedCategory=");
        sb2.append(this.f242600c);
        sb2.append(", isMainButtonEnabled=");
        sb2.append(this.f242601d);
        sb2.append(", subtitle=");
        return c.m(sb2, this.f242602e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f242599b, parcel);
        while (itJ.hasNext()) {
            ((SelectListWidget.Data) itJ.next()).writeToParcel(parcel, i12);
        }
        SelectListWidget.Data data = this.f242600c;
        if (data == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            data.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f242601d ? 1 : 0);
        parcel.writeParcelable(this.f242602e, i12);
    }
}
