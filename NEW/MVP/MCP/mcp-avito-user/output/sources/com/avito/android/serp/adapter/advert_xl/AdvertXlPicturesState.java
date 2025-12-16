package com.avito.android.serp.adapter.advert_xl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C20199a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.J3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertXlPicturesState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/advert_xl/AdvertXlPicturesState;", "Landroid/os/Parcelable;", "CREATOR", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes3.dex */
public final class AdvertXlPicturesState implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f268817b;

    /* compiled from: AdvertXlPicturesState.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/advert_xl/AdvertXlPicturesState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/serp/adapter/advert_xl/AdvertXlPicturesState;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.advert_xl.AdvertXlPicturesState$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AdvertXlPicturesState> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertXlPicturesState createFromParcel(Parcel parcel) {
            C20199a c20199a;
            int i12 = parcel.readInt();
            if (i12 < 0) {
                c20199a = null;
            } else {
                C20199a c20199a2 = new C20199a(i12);
                while (i12 > 0) {
                    Object value = parcel.readValue(String.class.getClassLoader());
                    if (value == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str = (String) value;
                    Object value2 = parcel.readValue(Integer.class.getClassLoader());
                    if (value2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    c20199a2.put(str, (Integer) value2);
                    i12--;
                }
                c20199a = c20199a2;
            }
            return new AdvertXlPicturesState(c20199a);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertXlPicturesState[] newArray(int i12) {
            return new AdvertXlPicturesState[i12];
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertXlPicturesState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        J3.f(parcel, this.f268817b);
    }

    public AdvertXlPicturesState(@Y61.l Map<String, Integer> map) {
        this.f268817b = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
    }

    public /* synthetic */ AdvertXlPicturesState(Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : map);
    }
}
