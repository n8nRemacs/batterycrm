package com.avito.android.beduin.common.component.load_more;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.action.BeduinExecuteRequestAction;
import com.avito.android.beduin_shared.model.form.ParamsSource;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: BeduinLoadMoreModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BZ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0019\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t\u0012&\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0018\u00010\u0007j\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0018\u00010\u0007j\u0004\u0018\u0001`\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018Jk\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t2(\b\u0002\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0018\u00010\u0007j\u0004\u0018\u0001`\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0016R*\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0018R7\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0018\u00010\u0007j\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b1\u0010\u0018¨\u00062"}, d2 = {"Lcom/avito/android/beduin/common/component/load_more/NextPageRequest;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin_shared/model/form/ParamsSource;", "Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$HttpMethod;", "method", "", "path", "", "", "LK51/e;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/beduin_shared/model/form/FormParametersDictionary;", "formParamsMap", "<init>", "(Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$HttpMethod;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Llj/c;", "componentsFormParamsFetcher", "extractParams", "(Llj/c;)Ljava/util/Map;", "component1", "()Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$HttpMethod;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "component4", "copy", "(Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$HttpMethod;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/avito/android/beduin/common/component/load_more/NextPageRequest;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction$HttpMethod;", "getMethod", "Ljava/lang/String;", "getPath", "Ljava/util/Map;", "getParameters", "getFormParamsMap", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class NextPageRequest implements Parcelable, ParamsSource {

    @k
    public static final Parcelable.Creator<NextPageRequest> CREATOR = new a();

    @l
    private final Map<String, Map<String, String>> formParamsMap;

    @k
    private final BeduinExecuteRequestAction.HttpMethod method;

    @l
    private final Map<String, Object> parameters;

    @k
    private final String path;

    /* compiled from: BeduinLoadMoreModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NextPageRequest> {
        @Override // android.os.Parcelable.Creator
        public final NextPageRequest createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            BeduinExecuteRequestAction.HttpMethod httpMethodValueOf = BeduinExecuteRequestAction.HttpMethod.valueOf(parcel.readString());
            String string = parcel.readString();
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(NextPageRequest.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    String string2 = parcel.readString();
                    int i15 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i15);
                    int iA2 = 0;
                    while (iA2 != i15) {
                        iA2 = C0.a(parcel, linkedHashMap3, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap2.put(string2, linkedHashMap3);
                }
            }
            return new NextPageRequest(httpMethodValueOf, string, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final NextPageRequest[] newArray(int i12) {
            return new NextPageRequest[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NextPageRequest(@k BeduinExecuteRequestAction.HttpMethod httpMethod, @k String str, @l Map<String, ? extends Object> map, @l Map<String, ? extends Map<String, String>> map2) {
        this.method = httpMethod;
        this.path = str;
        this.parameters = map;
        this.formParamsMap = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NextPageRequest copy$default(NextPageRequest nextPageRequest, BeduinExecuteRequestAction.HttpMethod httpMethod, String str, Map map, Map map2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            httpMethod = nextPageRequest.method;
        }
        if ((i12 & 2) != 0) {
            str = nextPageRequest.path;
        }
        if ((i12 & 4) != 0) {
            map = nextPageRequest.parameters;
        }
        if ((i12 & 8) != 0) {
            map2 = nextPageRequest.formParamsMap;
        }
        return nextPageRequest.copy(httpMethod, str, map, map2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final BeduinExecuteRequestAction.HttpMethod getMethod() {
        return this.method;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @l
    public final Map<String, Object> component3() {
        return this.parameters;
    }

    @l
    public final Map<String, Map<String, String>> component4() {
        return this.formParamsMap;
    }

    @k
    public final NextPageRequest copy(@k BeduinExecuteRequestAction.HttpMethod method, @k String path, @l Map<String, ? extends Object> parameters, @l Map<String, ? extends Map<String, String>> formParamsMap) {
        return new NextPageRequest(method, path, parameters, formParamsMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NextPageRequest)) {
            return false;
        }
        NextPageRequest nextPageRequest = (NextPageRequest) other;
        return this.method == nextPageRequest.method && L.f(this.path, nextPageRequest.path) && L.f(this.parameters, nextPageRequest.parameters) && L.f(this.formParamsMap, nextPageRequest.formParamsMap);
    }

    @Override // com.avito.android.beduin_shared.model.form.ParamsSource
    @k
    public Map<String, Object> extractParams(@k lj.c componentsFormParamsFetcher) {
        Map<String, Map<String, String>> map = this.formParamsMap;
        if (map == null || map.isEmpty()) {
            Map<String, Object> map2 = this.parameters;
            return map2 == null ? P0.c() : map2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map3 = this.parameters;
        if (map3 != null) {
            for (Map.Entry<String, Object> entry : map3.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : componentsFormParamsFetcher.a(this.formParamsMap).entrySet()) {
            linkedHashMap.put(entry2.getKey(), entry2.getValue());
        }
        return linkedHashMap;
    }

    @l
    public final Map<String, Map<String, String>> getFormParamsMap() {
        return this.formParamsMap;
    }

    @k
    public final BeduinExecuteRequestAction.HttpMethod getMethod() {
        return this.method;
    }

    @l
    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    @k
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        int iD2 = H.d(this.method.hashCode() * 31, 31, this.path);
        Map<String, Object> map = this.parameters;
        int iHashCode = (iD2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Map<String, String>> map2 = this.formParamsMap;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NextPageRequest(method=");
        sb2.append(this.method);
        sb2.append(", path=");
        sb2.append(this.path);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", formParamsMap=");
        return r.w(sb2, this.formParamsMap, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.method.name());
        parcel.writeString(this.path);
        Map<String, Object> map = this.parameters;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        Map<String, Map<String, String>> map2 = this.formParamsMap;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH2 = C0.h(parcel, 1, map2);
        while (itH2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itH2.next();
            parcel.writeString((String) entry2.getKey());
            Iterator itI = C0.i(parcel, (Map) entry2.getValue());
            while (itI.hasNext()) {
                Map.Entry entry3 = (Map.Entry) itI.next();
                parcel.writeString((String) entry3.getKey());
                parcel.writeString((String) entry3.getValue());
            }
        }
    }
}
