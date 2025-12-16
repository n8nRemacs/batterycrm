package com.avito.android.beduin.common.component.params_source;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin_shared.model.form.ParamsSource;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ParamsSourceGroupByValues.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@AB>\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0013\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b)\u0010\u0016J\u0010\u0010*\u001a\u00020%HÖ\u0001¢\u0006\u0004\b*\u0010'J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001cR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u001eR$\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b5\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010!R'\u0010>\u001a\b\u0012\u0004\u0012\u0002080\u00048BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u001e¨\u0006B"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValues;", "Lcom/avito/android/beduin_shared/model/form/ParamsSource;", "", "groupId", "", "formIds", "", "LK51/e;", "values", "Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValues$GroupStrategy;", "groupStrategy", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValues$GroupStrategy;)V", "", "", "destination", "", "groupByTo", "(Ljava/util/Map;Ljava/util/Set;)Ljava/util/Set;", "parameter", "", "checkValuesIsEqual", "(Ljava/lang/Object;)Z", "Llj/c;", "componentsFormParamsFetcher", "extractParams", "(Llj/c;)Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValues$GroupStrategy;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValues$GroupStrategy;)Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValues;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getGroupId", "Ljava/util/List;", "getFormIds", "getValues", "Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValues$GroupStrategy;", "getGroupStrategy", "Lcom/avito/android/beduin/common/component/conditional_group/component/k;", "comparators$delegate", "Lkotlin/C;", "getComparators", "getComparators$annotations", "()V", "comparators", "Companion", "a", "GroupStrategy", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class ParamsSourceGroupByValues implements ParamsSource {

    /* renamed from: comparators$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C comparators = C42727D.c(new d());

    @l
    private final List<String> formIds;

    @k
    private final String groupId;

    @l
    private final GroupStrategy groupStrategy;

    @l
    private final List<Object> values;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<ParamsSourceGroupByValues> CREATOR = new b();

    @k
    private static final Class<ParamsSourceGroupByValues> value = ParamsSourceGroupByValues.class;

    @k
    private static final String type = "groupByValues";

    @k
    private static final ParamsSourceGroupByValuesJsonDeserializer deserializer = new ParamsSourceGroupByValuesJsonDeserializer();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ParamsSourceGroupByValues.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValues$GroupStrategy;", "", "(Ljava/lang/String;I)V", "REPLACE", "MERGE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GroupStrategy {

        @com.google.gson.annotations.c("merge")
        public static final GroupStrategy MERGE;

        @com.google.gson.annotations.c("replace")
        public static final GroupStrategy REPLACE;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ GroupStrategy[] f101796b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101797c;

        static {
            GroupStrategy groupStrategy = new GroupStrategy("REPLACE", 0);
            REPLACE = groupStrategy;
            GroupStrategy groupStrategy2 = new GroupStrategy("MERGE", 1);
            MERGE = groupStrategy2;
            GroupStrategy[] groupStrategyArr = {groupStrategy, groupStrategy2};
            f101796b = groupStrategyArr;
            f101797c = kotlin.enums.c.a(groupStrategyArr);
        }

        private GroupStrategy(String str, int i12) {
        }

        public static GroupStrategy valueOf(String str) {
            return (GroupStrategy) Enum.valueOf(GroupStrategy.class, str);
        }

        public static GroupStrategy[] values() {
            return (GroupStrategy[]) f101796b.clone();
        }
    }

    /* compiled from: ParamsSourceGroupByValues.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValues$a;", "Lcom/avito/android/beduin/common/component/params_source/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.params_source.ParamsSourceGroupByValues$a, reason: from kotlin metadata */
    public static final class Companion implements a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        public final h a() {
            return ParamsSourceGroupByValues.deserializer;
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        @k
        public final String getType() {
            return ParamsSourceGroupByValues.type;
        }

        @Override // com.avito.android.beduin.common.component.params_source.a
        @k
        public final Class<ParamsSourceGroupByValues> getValue() {
            return ParamsSourceGroupByValues.value;
        }

        public Companion() {
        }
    }

    /* compiled from: ParamsSourceGroupByValues.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ParamsSourceGroupByValues> {
        @Override // android.os.Parcelable.Creator
        public final ParamsSourceGroupByValues createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readValue(ParamsSourceGroupByValues.class.getClassLoader()));
                }
            }
            return new ParamsSourceGroupByValues(string, arrayListCreateStringArrayList, arrayList, parcel.readInt() != 0 ? GroupStrategy.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ParamsSourceGroupByValues[] newArray(int i12) {
            return new ParamsSourceGroupByValues[i12];
        }
    }

    /* compiled from: ParamsSourceGroupByValues.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101798a;

        static {
            int[] iArr = new int[GroupStrategy.values().length];
            try {
                iArr[GroupStrategy.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupStrategy.MERGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101798a = iArr;
        }
    }

    /* compiled from: ParamsSourceGroupByValues.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/avito/android/beduin/common/component/conditional_group/component/k;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<List<? extends com.avito.android.beduin.common.component.conditional_group.component.k>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends com.avito.android.beduin.common.component.conditional_group.component.k> invoke() {
            List<Object> values = ParamsSourceGroupByValues.this.getValues();
            if (values == null) {
                values = C42784z0.f406748b;
            }
            List<Object> list = values;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.avito.android.beduin.common.component.conditional_group.component.k(it.next()));
            }
            return arrayList;
        }
    }

    public ParamsSourceGroupByValues(@k String str, @l List<String> list, @l List<? extends Object> list2, @l GroupStrategy groupStrategy) {
        this.groupId = str;
        this.formIds = list;
        this.values = list2;
        this.groupStrategy = groupStrategy;
    }

    private final boolean checkValuesIsEqual(Object parameter) {
        List<com.avito.android.beduin.common.component.conditional_group.component.k> comparators = getComparators();
        if ((comparators instanceof Collection) && comparators.isEmpty()) {
            return false;
        }
        Iterator<T> it = comparators.iterator();
        while (it.hasNext()) {
            if (((com.avito.android.beduin.common.component.conditional_group.component.k) it.next()).invoke(parameter).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParamsSourceGroupByValues copy$default(ParamsSourceGroupByValues paramsSourceGroupByValues, String str, List list, List list2, GroupStrategy groupStrategy, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = paramsSourceGroupByValues.groupId;
        }
        if ((i12 & 2) != 0) {
            list = paramsSourceGroupByValues.formIds;
        }
        if ((i12 & 4) != 0) {
            list2 = paramsSourceGroupByValues.values;
        }
        if ((i12 & 8) != 0) {
            groupStrategy = paramsSourceGroupByValues.groupStrategy;
        }
        return paramsSourceGroupByValues.copy(str, list, list2, groupStrategy);
    }

    private final List<com.avito.android.beduin.common.component.conditional_group.component.k> getComparators() {
        return (List) this.comparators.getValue();
    }

    private final Set<Object> groupByTo(Map<String, ? extends Object> map, Set<Object> set) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value2 = entry.getValue();
            set.remove(key);
            if (checkValuesIsEqual(value2)) {
                set.add(key);
            } else {
                if (!(value2 instanceof Map)) {
                    value2 = null;
                }
                Map<String, ? extends Object> map2 = (Map) value2;
                if (map2 != null) {
                    groupByTo(map2, set);
                }
            }
        }
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set groupByTo$default(ParamsSourceGroupByValues paramsSourceGroupByValues, Map map, Set set, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return paramsSourceGroupByValues.groupByTo(map, set);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @l
    public final List<String> component2() {
        return this.formIds;
    }

    @l
    public final List<Object> component3() {
        return this.values;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final GroupStrategy getGroupStrategy() {
        return this.groupStrategy;
    }

    @k
    public final ParamsSourceGroupByValues copy(@k String groupId, @l List<String> formIds, @l List<? extends Object> values, @l GroupStrategy groupStrategy) {
        return new ParamsSourceGroupByValues(groupId, formIds, values, groupStrategy);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParamsSourceGroupByValues)) {
            return false;
        }
        ParamsSourceGroupByValues paramsSourceGroupByValues = (ParamsSourceGroupByValues) other;
        return L.f(this.groupId, paramsSourceGroupByValues.groupId) && L.f(this.formIds, paramsSourceGroupByValues.formIds) && L.f(this.values, paramsSourceGroupByValues.values) && this.groupStrategy == paramsSourceGroupByValues.groupStrategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    @Override // com.avito.android.beduin_shared.model.form.ParamsSource
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> extractParams(@Y61.k lj.c r3) {
        /*
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.values
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L6a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L6a
        Ld:
            java.util.List<java.lang.String> r0 = r2.formIds
            if (r0 != 0) goto L13
            kotlin.collections.z0 r0 = kotlin.collections.C42784z0.f406748b
        L13:
            java.util.Map r3 = r3.c(r0)
            com.avito.android.beduin.common.component.params_source.ParamsSourceGroupByValues$GroupStrategy r0 = r2.groupStrategy
            if (r0 != 0) goto L1d
            com.avito.android.beduin.common.component.params_source.ParamsSourceGroupByValues$GroupStrategy r0 = com.avito.android.beduin.common.component.params_source.ParamsSourceGroupByValues.GroupStrategy.REPLACE
        L1d:
            int[] r1 = com.avito.android.beduin.common.component.params_source.ParamsSourceGroupByValues.c.f101798a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L4f
            r1 = 2
            if (r0 != r1) goto L49
            java.lang.String r0 = r2.groupId
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L43
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 != 0) goto L38
            r0 = 0
        L38:
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L43
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r0 = kotlin.collections.C42745f0.O0(r0)
            goto L54
        L43:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            goto L54
        L49:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L4f:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
        L54:
            java.util.Set r3 = r2.groupByTo(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L63
            java.util.Map r3 = kotlin.collections.P0.c()
            goto L69
        L63:
            java.lang.String r0 = r2.groupId
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
        L69:
            return r3
        L6a:
            java.util.Map r3 = kotlin.collections.P0.c()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.params_source.ParamsSourceGroupByValues.extractParams(lj.c):java.util.Map");
    }

    @l
    public final List<String> getFormIds() {
        return this.formIds;
    }

    @k
    public final String getGroupId() {
        return this.groupId;
    }

    @l
    public final GroupStrategy getGroupStrategy() {
        return this.groupStrategy;
    }

    @l
    public final List<Object> getValues() {
        return this.values;
    }

    public int hashCode() {
        int iHashCode = this.groupId.hashCode() * 31;
        List<String> list = this.formIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Object> list2 = this.values;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GroupStrategy groupStrategy = this.groupStrategy;
        return iHashCode3 + (groupStrategy != null ? groupStrategy.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ParamsSourceGroupByValues(groupId=" + this.groupId + ", formIds=" + this.formIds + ", values=" + this.values + ", groupStrategy=" + this.groupStrategy + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.groupId);
        parcel.writeStringList(this.formIds);
        List<Object> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeValue(itA.next());
            }
        }
        GroupStrategy groupStrategy = this.groupStrategy;
        if (groupStrategy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(groupStrategy.name());
        }
    }

    private static /* synthetic */ void getComparators$annotations() {
    }
}
