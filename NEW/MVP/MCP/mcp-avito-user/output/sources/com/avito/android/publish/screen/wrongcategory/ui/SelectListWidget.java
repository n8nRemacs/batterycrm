package com.avito.android.publish.screen.wrongcategory.ui;

import K51.d;
import X41.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.radio_button.b;
import j.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectListWidget.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/ui/SelectListWidget;", "Landroid/widget/LinearLayout;", "Data", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SelectListWidget extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f242614b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public b f242615c;

    /* compiled from: SelectListWidget.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/wrongcategory/ui/SelectListWidget$Data;", "Landroid/os/Parcelable;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Data implements Parcelable {

        @k
        public static final Parcelable.Creator<Data> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f242616b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f242617c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f242618d;

        /* compiled from: SelectListWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                return new Data(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i12) {
                return new Data[i12];
            }
        }

        public Data(@k String str, @l @e0 Integer num, @k String str2) {
            this.f242616b = str;
            this.f242617c = num;
            this.f242618d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f242616b);
            Integer num = this.f242617c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.f242618d);
        }
    }

    @j
    @SuppressLint({"NewApi"})
    public SelectListWidget(@l Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@k List<Data> list, @l Data data, @k p<? super Data, ? super Boolean, G0> pVar) {
        ArrayList arrayList = this.f242614b;
        if (arrayList.size() != list.size()) {
            arrayList.clear();
            removeAllViews();
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.wrong_category_item, (ViewGroup) null);
                View viewFindViewById = viewInflate.findViewById(R.id.radio_button);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.RadioButton");
                }
                ((RadioButton) viewFindViewById).setSaveEnabled(false);
                com.avito.android.lib.deprecated_design.radio_button.d dVar = new com.avito.android.lib.deprecated_design.radio_button.d(viewInflate);
                addView(viewInflate);
                arrayList.add(dVar);
            }
        }
        Iterator it = C42745f0.T0(list, arrayList).iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            Data data2 = (Data) q12.f406619b;
            b bVar = (b) q12.f406620c;
            boolean zF2 = L.f(data != null ? data.f242618d : null, data2.f242618d);
            bVar.setTitle(data2.f242616b);
            Integer num = data2.f242617c;
            bVar.f(num != null ? getContext().getString(num.intValue()) : null);
            if (zF2) {
                bVar.setChecked(zF2);
                this.f242615c = bVar;
            }
            bVar.a(new a(this, bVar, pVar, data2));
        }
        if (data != null) {
            pVar.invoke(data, Boolean.TRUE);
        }
    }

    public SelectListWidget(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f242614b = new ArrayList();
        setOrientation(1);
    }
}
