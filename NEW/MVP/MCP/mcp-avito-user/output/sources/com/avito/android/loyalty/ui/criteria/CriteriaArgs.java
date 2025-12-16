package com.avito.android.loyalty.ui.criteria;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaArgs.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/CriteriaArgs;", "Landroid/os/Parcelable;", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CriteriaArgs implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CriteriaArgs> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f183420b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f183421c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f183422d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f183423e;

    /* compiled from: CriteriaArgs.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/CriteriaArgs$a;", "", "<init>", "()V", "", "PARAM_FOCUS_ID", "Ljava/lang/String;", "PARAM_TAB", "PARAM_TAB_ADVICES", "PARAM_TAB_ALL", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CriteriaArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CriteriaArgs> {
        @Override // android.os.Parcelable.Creator
        public final CriteriaArgs createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new CriteriaArgs(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final CriteriaArgs[] newArray(int i12) {
            return new CriteriaArgs[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public CriteriaArgs(@Y61.k Map<String, String> map) {
        this.f183420b = map;
        String str = map.get(SearchParamsConverterKt.SOURCE);
        this.f183421c = str == null ? "" : str;
        this.f183422d = map.getOrDefault(NotificationOpenAtTab.TAB, ProfileTab.ALL);
        this.f183423e = map.get("focusId");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CriteriaArgs) && L.f(this.f183420b, ((CriteriaArgs) obj).f183420b);
    }

    public final int hashCode() {
        return this.f183420b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.n(new StringBuilder("CriteriaArgs(queryMap="), this.f183420b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f183420b, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
