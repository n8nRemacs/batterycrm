package com.avito.android.beduin.common.component.params_source;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.model.Path;
import com.avito.android.beduin.common.component.model.e;
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

/* compiled from: ParamsSourceInlinedMap.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/ParamsSourceInlinedMap;", "Lcom/avito/android/beduin_shared/model/form/ParamsSource;", "Lcom/avito/android/beduin/common/component/model/Path;", "path", "<init>", "(Ljava/util/List;Lkotlin/jvm/internal/w;)V", "Llj/c;", "componentsFormParamsFetcher", "", "", "", "extractParams", "(Llj/c;)Ljava/util/Map;", "component1-yxo4SjI", "()Ljava/util/List;", "component1", "copy-8tpR2z4", "(Ljava/util/List;)Lcom/avito/android/beduin/common/component/params_source/ParamsSourceInlinedMap;", "copy", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPath-yxo4SjI", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes11.dex */
public final /* data */ class ParamsSourceInlinedMap implements ParamsSource {

    @k
    private final List<? extends String> path;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<ParamsSourceInlinedMap> CREATOR = new b();

    @k
    private static final Class<ParamsSourceInlinedMap> value = ParamsSourceInlinedMap.class;

    @k
    private static final String type = "inlinedMap";

    /* compiled from: ParamsSourceInlinedMap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/ParamsSourceInlinedMap$a;", "Lcom/avito/android/beduin/common/component/params_source/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.params_source.ParamsSourceInlinedMap$a, reason: from kotlin metadata */
    public static final class Companion implements a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        @l
        public final h<?> a() {
            return null;
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        @k
        public final String getType() {
            return ParamsSourceInlinedMap.type;
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        @k
        public final Class<ParamsSourceInlinedMap> getValue() {
            return ParamsSourceInlinedMap.value;
        }

        public Companion() {
        }
    }

    /* compiled from: ParamsSourceInlinedMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ParamsSourceInlinedMap> {
        @Override // android.os.Parcelable.Creator
        public final ParamsSourceInlinedMap createFromParcel(Parcel parcel) {
            return new ParamsSourceInlinedMap(Path.CREATOR.createFromParcel(parcel).f101776b, null);
        }

        @Override // android.os.Parcelable.Creator
        public final ParamsSourceInlinedMap[] newArray(int i12) {
            return new ParamsSourceInlinedMap[i12];
        }
    }

    public /* synthetic */ ParamsSourceInlinedMap(List list, C42822w c42822w) {
        this(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-8tpR2z4$default, reason: not valid java name */
    public static /* synthetic */ ParamsSourceInlinedMap m44copy8tpR2z4$default(ParamsSourceInlinedMap paramsSourceInlinedMap, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = paramsSourceInlinedMap.path;
        }
        return paramsSourceInlinedMap.m46copy8tpR2z4(list);
    }

    @k
    /* renamed from: component1-yxo4SjI, reason: not valid java name */
    public final List<? extends String> m45component1yxo4SjI() {
        return this.path;
    }

    @k
    /* renamed from: copy-8tpR2z4, reason: not valid java name */
    public final ParamsSourceInlinedMap m46copy8tpR2z4(@k List<? extends String> path) {
        return new ParamsSourceInlinedMap(path, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParamsSourceInlinedMap)) {
            return false;
        }
        List<? extends String> list = this.path;
        List<? extends String> list2 = ((ParamsSourceInlinedMap) other).path;
        Parcelable.Creator<Path> creator = Path.CREATOR;
        return L.f(list, list2);
    }

    @Override // com.avito.android.beduin_shared.model.form.ParamsSource
    @k
    public Map<String, Object> extractParams(@k lj.c componentsFormParamsFetcher) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object objC = e.c(this.path, componentsFormParamsFetcher.b());
        if (objC != null) {
            Map map = objC instanceof Map ? (Map) objC : null;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value2 = entry.getValue();
                    if ((key instanceof String) && value2 != null) {
                        linkedHashMap.put(key, value2);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @k
    /* renamed from: getPath-yxo4SjI, reason: not valid java name */
    public final List<? extends String> m47getPathyxo4SjI() {
        return this.path;
    }

    public int hashCode() {
        List<? extends String> list = this.path;
        Parcelable.Creator<Path> creator = Path.CREATOR;
        return list.hashCode();
    }

    @k
    public String toString() {
        return "ParamsSourceInlinedMap(path=" + ((Object) Path.b(this.path)) + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<? extends String> list = this.path;
        Parcelable.Creator<Path> creator = Path.CREATOR;
        parcel.writeStringList(list);
    }

    private ParamsSourceInlinedMap(List<? extends String> list) {
        this.path = list;
    }
}
