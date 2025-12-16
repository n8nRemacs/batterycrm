package com.avito.android.beduin.common.component.params_source;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin_shared.model.form.ParamsSource;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ParamsSourceExcludeParams.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001$B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000e¨\u0006%"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/ParamsSourceExcludeParams;", "Lcom/avito/android/beduin_shared/model/form/ParamsSource;", "", "", "keys", "<init>", "(Ljava/util/List;)V", "Llj/c;", "componentsFormParamsFetcher", "", "", "extractParams", "(Llj/c;)Ljava/util/Map;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/beduin/common/component/params_source/ParamsSourceExcludeParams;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getKeys", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes11.dex */
public final /* data */ class ParamsSourceExcludeParams implements ParamsSource {

    @k
    private final List<String> keys;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<ParamsSourceExcludeParams> CREATOR = new b();

    @k
    private static final Class<ParamsSourceExcludeParams> value = ParamsSourceExcludeParams.class;

    @k
    private static final String type = "excludeParams";

    @k
    private static final ParamsSourceExcludeParamsJsonAdapter deserializer = new ParamsSourceExcludeParamsJsonAdapter();

    /* compiled from: ParamsSourceExcludeParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/ParamsSourceExcludeParams$a;", "Lcom/avito/android/beduin/common/component/params_source/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.params_source.ParamsSourceExcludeParams$a, reason: from kotlin metadata */
    public static final class Companion implements a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        public final h a() {
            return ParamsSourceExcludeParams.deserializer;
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        @k
        public final String getType() {
            return ParamsSourceExcludeParams.type;
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        @k
        public final Class<ParamsSourceExcludeParams> getValue() {
            return ParamsSourceExcludeParams.value;
        }

        public Companion() {
        }
    }

    /* compiled from: ParamsSourceExcludeParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ParamsSourceExcludeParams> {
        @Override // android.os.Parcelable.Creator
        public final ParamsSourceExcludeParams createFromParcel(Parcel parcel) {
            return new ParamsSourceExcludeParams(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ParamsSourceExcludeParams[] newArray(int i12) {
            return new ParamsSourceExcludeParams[i12];
        }
    }

    public ParamsSourceExcludeParams(@k List<String> list) {
        this.keys = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParamsSourceExcludeParams copy$default(ParamsSourceExcludeParams paramsSourceExcludeParams, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = paramsSourceExcludeParams.keys;
        }
        return paramsSourceExcludeParams.copy(list);
    }

    @k
    public final List<String> component1() {
        return this.keys;
    }

    @k
    public final ParamsSourceExcludeParams copy(@k List<String> keys) {
        return new ParamsSourceExcludeParams(keys);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ParamsSourceExcludeParams) && L.f(this.keys, ((ParamsSourceExcludeParams) other).keys);
    }

    @Override // com.avito.android.beduin_shared.model.form.ParamsSource
    @k
    public Map<String, Object> extractParams(@k lj.c componentsFormParamsFetcher) {
        Map<String, Object> mapB = componentsFormParamsFetcher.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : mapB.entrySet()) {
            if (!this.keys.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @k
    public final List<String> getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("ParamsSourceExcludeParams(keys="), this.keys, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeStringList(this.keys);
    }
}
