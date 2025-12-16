package com.avito.android.beduin.common.component.conditional_group.component;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.model.Path;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ValueIsEmptyCondition.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0011\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/ValueIsEmptyCondition;", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "", "id", "Lcom/avito/android/beduin/common/component/model/Path;", "path", "<init>", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "check", "(Ljava/util/Map;)Z", "component1", "()Ljava/lang/String;", "component2-FIV8Enc", "()Ljava/util/List;", "component2", "copy-Y02L0uA", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin/common/component/conditional_group/component/ValueIsEmptyCondition;", "copy", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getPath-FIV8Enc", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ValueIsEmptyCondition implements Condition {

    @Y61.k
    public static final Parcelable.Creator<ValueIsEmptyCondition> CREATOR = new a();

    @Y61.k
    private final String id;

    @Y61.l
    private final List<? extends String> path;

    /* compiled from: ValueIsEmptyCondition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ValueIsEmptyCondition> {
        @Override // android.os.Parcelable.Creator
        public final ValueIsEmptyCondition createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            C42822w c42822w = null;
            Path pathCreateFromParcel = parcel.readInt() == 0 ? null : Path.CREATOR.createFromParcel(parcel);
            return new ValueIsEmptyCondition(string, pathCreateFromParcel != null ? pathCreateFromParcel.f101776b : null, c42822w);
        }

        @Override // android.os.Parcelable.Creator
        public final ValueIsEmptyCondition[] newArray(int i12) {
            return new ValueIsEmptyCondition[i12];
        }
    }

    /* compiled from: ValueIsEmptyCondition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/ValueIsEmptyCondition$b;", "Lcom/avito/android/beduin/common/component/conditional_group/component/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.conditional_group.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Class<? extends Condition> f101089a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f101090b;

        public b() {
            this(null, null, 3, null);
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF101090b() {
            return this.f101090b;
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        public final Class<? extends Condition> getValue() {
            return this.f101089a;
        }

        public b(Class cls, String str, int i12, C42822w c42822w) {
            cls = (i12 & 1) != 0 ? ValueIsEmptyCondition.class : cls;
            str = (i12 & 2) != 0 ? "valueIsEmpty" : str;
            this.f101089a = cls;
            this.f101090b = str;
        }
    }

    /* compiled from: ValueIsEmptyCondition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "param", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f101091l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            boolean z12 = true;
            if (obj != null && (!(obj instanceof CharSequence) ? !(obj instanceof Object[]) ? !(obj instanceof Collection) ? !(obj instanceof Map) || ((Map) obj).size() != 0 : ((Collection) obj).size() != 0 : ((Object[]) obj).length != 0 : ((CharSequence) obj).length() != 0)) {
                z12 = false;
            }
            return Boolean.valueOf(z12);
        }
    }

    public /* synthetic */ ValueIsEmptyCondition(String str, List list, C42822w c42822w) {
        this(str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-Y02L0uA$default, reason: not valid java name */
    public static /* synthetic */ ValueIsEmptyCondition m36copyY02L0uA$default(ValueIsEmptyCondition valueIsEmptyCondition, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = valueIsEmptyCondition.id;
        }
        if ((i12 & 2) != 0) {
            list = valueIsEmptyCondition.path;
        }
        return valueIsEmptyCondition.m38copyY02L0uA(str, list);
    }

    @Override // com.avito.android.beduin.common.component.conditional_group.component.Condition
    public boolean check(@Y61.k Map<String, ? extends Object> parameters) {
        return ((Boolean) com.avito.android.beduin.common.component.model.e.b(this.path, this.id, parameters, c.f101091l)).booleanValue();
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component2-FIV8Enc, reason: not valid java name */
    public final List<? extends String> m37component2FIV8Enc() {
        return this.path;
    }

    @Y61.k
    /* renamed from: copy-Y02L0uA, reason: not valid java name */
    public final ValueIsEmptyCondition m38copyY02L0uA(@Y61.k String id2, @Y61.l List<? extends String> path) {
        return new ValueIsEmptyCondition(id2, path, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
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
            boolean r1 = r5 instanceof com.avito.android.beduin.common.component.conditional_group.component.ValueIsEmptyCondition
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.avito.android.beduin.common.component.conditional_group.component.ValueIsEmptyCondition r5 = (com.avito.android.beduin.common.component.conditional_group.component.ValueIsEmptyCondition) r5
            java.lang.String r1 = r4.id
            java.lang.String r3 = r5.id
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<? extends java.lang.String> r1 = r4.path
            java.util.List<? extends java.lang.String> r5 = r5.path
            if (r1 != 0) goto L23
            if (r5 != 0) goto L21
            r5 = r0
            goto L2c
        L21:
            r5 = r2
            goto L2c
        L23:
            if (r5 != 0) goto L26
            goto L21
        L26:
            android.os.Parcelable$Creator<com.avito.android.beduin.common.component.model.Path> r3 = com.avito.android.beduin.common.component.model.Path.CREATOR
            boolean r5 = kotlin.jvm.internal.L.f(r1, r5)
        L2c:
            if (r5 != 0) goto L2f
            return r2
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.conditional_group.component.ValueIsEmptyCondition.equals(java.lang.Object):boolean");
    }

    @Y61.k
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: getPath-FIV8Enc, reason: not valid java name */
    public final List<? extends String> m39getPathFIV8Enc() {
        return this.path;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = this.id.hashCode() * 31;
        List<? extends String> list = this.path;
        if (list == null) {
            iHashCode = 0;
        } else {
            Parcelable.Creator<Path> creator = Path.CREATOR;
            iHashCode = list.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ValueIsEmptyCondition(id=");
        sb2.append(this.id);
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
        List<? extends String> list = this.path;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Parcelable.Creator<Path> creator = Path.CREATOR;
        parcel.writeStringList(list);
    }

    private ValueIsEmptyCondition(String str, List<? extends String> list) {
        this.id = str;
        this.path = list;
    }
}
