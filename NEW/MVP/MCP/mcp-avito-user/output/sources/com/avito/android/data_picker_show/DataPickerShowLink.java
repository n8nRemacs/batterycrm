package com.avito.android.data_picker_show;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: DataPickerShowLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/data_picker_show/DataPickerShowLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_data-picker-show_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DataPickerShowLink extends DeepLink {

    @k
    public static final Parcelable.Creator<DataPickerShowLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DataPickerBody f132468b;

    /* compiled from: DataPickerShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DataPickerShowLink> {
        @Override // android.os.Parcelable.Creator
        public final DataPickerShowLink createFromParcel(Parcel parcel) {
            return new DataPickerShowLink(DataPickerBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DataPickerShowLink[] newArray(int i12) {
            return new DataPickerShowLink[i12];
        }
    }

    /* compiled from: DataPickerShowLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/data_picker_show/DataPickerShowLink$b;", "", "a", "b", "Lcom/avito/android/data_picker_show/DataPickerShowLink$b$a;", "Lcom/avito/android/data_picker_show/DataPickerShowLink$b$b;", "_avito_data-picker-show_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: DataPickerShowLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/data_picker_show/DataPickerShowLink$b$a;", "LJu/c$b;", "Lcom/avito/android/data_picker_show/DataPickerShowLink$b;", "<init>", "()V", "_avito_data-picker-show_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f132469b = new a();
        }

        /* compiled from: DataPickerShowLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/data_picker_show/DataPickerShowLink$b$b;", "LJu/c$b;", "Lcom/avito/android/data_picker_show/DataPickerShowLink$b;", "_avito_data-picker-show_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.data_picker_show.DataPickerShowLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3965b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final List<String> f132470b;

            public C3965b(@l List<String> list) {
                this.f132470b = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3965b) && L.f(this.f132470b, ((C3965b) obj).f132470b);
            }

            public final int hashCode() {
                List<String> list = this.f132470b;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Success(preselected="), this.f132470b, ')');
            }
        }
    }

    public DataPickerShowLink(@k DataPickerBody dataPickerBody) {
        this.f132468b = dataPickerBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f132468b.writeToParcel(parcel, i12);
    }
}
