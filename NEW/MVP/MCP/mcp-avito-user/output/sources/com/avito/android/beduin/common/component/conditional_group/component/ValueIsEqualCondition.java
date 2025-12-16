package com.avito.android.beduin.common.component.conditional_group.component;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.model.Path;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ValueIsEqualCondition.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\r\u0010\u0006\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000f\b\u0002\u0010\u0006\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u001e\u0010\u0006\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0013R\u001f\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/ValueIsEqualCondition;", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "", "id", "", "LK51/e;", "value", "Lcom/avito/android/beduin/common/component/model/Path;", "path", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "check", "(Ljava/util/Map;)Z", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3-FIV8Enc", "()Ljava/util/List;", "component3", "copy-KiJ8nc4", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;)Lcom/avito/android/beduin/common/component/conditional_group/component/ValueIsEqualCondition;", "copy", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getValue", "Ljava/util/List;", "getPath-FIV8Enc", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ValueIsEqualCondition implements Condition {

    @Y61.k
    public static final Parcelable.Creator<ValueIsEqualCondition> CREATOR = new a();

    @Y61.k
    private final String id;

    @Y61.l
    private final List<? extends String> path;

    @Y61.l
    private final Object value;

    /* compiled from: ValueIsEqualCondition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ValueIsEqualCondition> {
        @Override // android.os.Parcelable.Creator
        public final ValueIsEqualCondition createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Object value = parcel.readValue(ValueIsEqualCondition.class.getClassLoader());
            C42822w c42822w = null;
            Path pathCreateFromParcel = parcel.readInt() == 0 ? null : Path.CREATOR.createFromParcel(parcel);
            return new ValueIsEqualCondition(string, value, pathCreateFromParcel != null ? pathCreateFromParcel.f101776b : null, c42822w);
        }

        @Override // android.os.Parcelable.Creator
        public final ValueIsEqualCondition[] newArray(int i12) {
            return new ValueIsEqualCondition[i12];
        }
    }

    /* compiled from: ValueIsEqualCondition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/ValueIsEqualCondition$b;", "Lcom/avito/android/beduin/common/component/conditional_group/component/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.conditional_group.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Class<? extends Condition> f101093a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f101094b;

        public b() {
            this(null, null, 3, null);
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF101090b() {
            return this.f101094b;
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        public final Class<? extends Condition> getValue() {
            return this.f101093a;
        }

        public b(Class cls, String str, int i12, C42822w c42822w) {
            cls = (i12 & 1) != 0 ? ValueIsEqualCondition.class : cls;
            str = (i12 & 2) != 0 ? "valueIsEqual" : str;
            this.f101093a = cls;
            this.f101094b = str;
        }
    }

    public /* synthetic */ ValueIsEqualCondition(String str, Object obj, List list, C42822w c42822w) {
        this(str, obj, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-KiJ8nc4$default, reason: not valid java name */
    public static /* synthetic */ ValueIsEqualCondition m40copyKiJ8nc4$default(ValueIsEqualCondition valueIsEqualCondition, String str, Object obj, List list, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            str = valueIsEqualCondition.id;
        }
        if ((i12 & 2) != 0) {
            obj = valueIsEqualCondition.value;
        }
        if ((i12 & 4) != 0) {
            list = valueIsEqualCondition.path;
        }
        return valueIsEqualCondition.m42copyKiJ8nc4(str, obj, list);
    }

    @Override // com.avito.android.beduin.common.component.conditional_group.component.Condition
    public boolean check(@Y61.k Map<String, ? extends Object> parameters) {
        return ((Boolean) com.avito.android.beduin.common.component.model.e.b(this.path, this.id, parameters, new k(this.value))).booleanValue();
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @Y61.l
    /* renamed from: component3-FIV8Enc, reason: not valid java name */
    public final List<? extends String> m41component3FIV8Enc() {
        return this.path;
    }

    @Y61.k
    /* renamed from: copy-KiJ8nc4, reason: not valid java name */
    public final ValueIsEqualCondition m42copyKiJ8nc4(@Y61.k String id2, @Y61.l Object value, @Y61.l List<? extends String> path) {
        return new ValueIsEqualCondition(id2, value, path, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@Y61.l java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.avito.android.beduin.common.component.conditional_group.component.ValueIsEqualCondition
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.avito.android.beduin.common.component.conditional_group.component.ValueIsEqualCondition r5 = (com.avito.android.beduin.common.component.conditional_group.component.ValueIsEqualCondition) r5
            java.lang.String r1 = r4.id
            java.lang.String r3 = r5.id
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Object r1 = r4.value
            java.lang.Object r3 = r5.value
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List<? extends java.lang.String> r1 = r4.path
            java.util.List<? extends java.lang.String> r5 = r5.path
            if (r1 != 0) goto L2e
            if (r5 != 0) goto L2c
            r5 = r0
            goto L37
        L2c:
            r5 = r2
            goto L37
        L2e:
            if (r5 != 0) goto L31
            goto L2c
        L31:
            android.os.Parcelable$Creator<com.avito.android.beduin.common.component.model.Path> r3 = com.avito.android.beduin.common.component.model.Path.CREATOR
            boolean r5 = kotlin.jvm.internal.L.f(r1, r5)
        L37:
            if (r5 != 0) goto L3a
            return r2
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.conditional_group.component.ValueIsEqualCondition.equals(java.lang.Object):boolean");
    }

    @Y61.k
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: getPath-FIV8Enc, reason: not valid java name */
    public final List<? extends String> m43getPathFIV8Enc() {
        return this.path;
    }

    @Y61.l
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Object obj = this.value;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        List<? extends String> list = this.path;
        if (list != null) {
            Parcelable.Creator<Path> creator = Path.CREATOR;
            iHashCode2 = list.hashCode();
        }
        return iHashCode3 + iHashCode2;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ValueIsEqualCondition(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", path=");
        List<? extends String> list = this.path;
        sb2.append((Object) (list == null ? "null" : Path.b(list)));
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeValue(this.value);
        List<? extends String> list = this.path;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Parcelable.Creator<Path> creator = Path.CREATOR;
        parcel.writeStringList(list);
    }

    private ValueIsEqualCondition(String str, Object obj, List<? extends String> list) {
        this.id = str;
        this.value = obj;
        this.path = list;
    }
}
