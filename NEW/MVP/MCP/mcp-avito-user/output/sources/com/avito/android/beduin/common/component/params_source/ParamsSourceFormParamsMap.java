package com.avito.android.beduin.common.component.params_source;

import K51.d;
import X41.g;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_shared.model.form.ParamsSource;
import com.google.gson.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ParamsSourceFormParamsMap.kt */
@d
@g
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0004j\u0002`\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/ParamsSourceFormParamsMap;", "Lcom/avito/android/beduin_shared/model/form/ParamsSource;", "a", "map", "", "", "Lcom/avito/android/beduin_shared/model/form/FormParametersDictionary;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParamsSourceFormParamsMap implements ParamsSource {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, Map<String, String>> f101795b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f101791c = new a(null);

    @k
    public static final Parcelable.Creator<ParamsSourceFormParamsMap> CREATOR = new b();

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Class<ParamsSourceFormParamsMap> f101792d = ParamsSourceFormParamsMap.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f101793e = "formParamsMap";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final ParamsSourceFormParamsMapJsonAdapter f101794f = new ParamsSourceFormParamsMapJsonAdapter();

    /* compiled from: ParamsSourceFormParamsMap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/ParamsSourceFormParamsMap$a;", "Lcom/avito/android/beduin/common/component/params_source/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.params_source.a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        public final h a() {
            return ParamsSourceFormParamsMap.f101794f;
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        @k
        public final String getType() {
            return ParamsSourceFormParamsMap.f101793e;
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        @k
        public final Class<ParamsSourceFormParamsMap> getValue() {
            return ParamsSourceFormParamsMap.f101792d;
        }

        public a() {
        }
    }

    /* compiled from: ParamsSourceFormParamsMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ParamsSourceFormParamsMap> {
        @Override // android.os.Parcelable.Creator
        public final ParamsSourceFormParamsMap createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                String string = parcel.readString();
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap.put(string, linkedHashMap2);
            }
            return ParamsSourceFormParamsMap.a(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ParamsSourceFormParamsMap[] newArray(int i12) {
            return new ParamsSourceFormParamsMap[i12];
        }
    }

    private /* synthetic */ ParamsSourceFormParamsMap(Map map) {
        this.f101795b = map;
    }

    public static final /* synthetic */ ParamsSourceFormParamsMap a(Map map) {
        return new ParamsSourceFormParamsMap(map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParamsSourceFormParamsMap) {
            return L.f(this.f101795b, ((ParamsSourceFormParamsMap) obj).f101795b);
        }
        return false;
    }

    @Override // com.avito.android.beduin_shared.model.form.ParamsSource
    @k
    public final Map<String, Object> extractParams(@k lj.c cVar) {
        return cVar.a(this.f101795b);
    }

    public final int hashCode() {
        return this.f101795b.hashCode();
    }

    public final String toString() {
        return "ParamsSourceFormParamsMap(map=" + this.f101795b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f101795b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            Iterator itI2 = C0.i(parcel, (Map) entry.getValue());
            while (itI2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI2.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeString((String) entry2.getValue());
            }
        }
    }
}
