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
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: LessCondition.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0016\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/LessCondition;", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "", "id", "Lcom/avito/android/beduin/common/component/model/Path;", "path", "", "value", "<init>", "(Ljava/lang/String;Ljava/util/List;DLkotlin/jvm/internal/w;)V", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "check", "(Ljava/util/Map;)Z", "component1", "()Ljava/lang/String;", "component2-FIV8Enc", "()Ljava/util/List;", "component2", "component3", "()D", "copy-oXZ40Kg", "(Ljava/lang/String;Ljava/util/List;D)Lcom/avito/android/beduin/common/component/conditional_group/component/LessCondition;", "copy", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getPath-FIV8Enc", "D", "getValue", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LessCondition implements Condition {

    @Y61.k
    public static final Parcelable.Creator<LessCondition> CREATOR = new a();

    @Y61.k
    private final String id;

    @Y61.l
    private final List<? extends String> path;
    private final double value;

    /* compiled from: LessCondition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LessCondition> {
        @Override // android.os.Parcelable.Creator
        public final LessCondition createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Path pathCreateFromParcel = parcel.readInt() == 0 ? null : Path.CREATOR.createFromParcel(parcel);
            return new LessCondition(string, pathCreateFromParcel != null ? pathCreateFromParcel.f101776b : null, parcel.readDouble(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final LessCondition[] newArray(int i12) {
            return new LessCondition[i12];
        }
    }

    /* compiled from: LessCondition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/LessCondition$b;", "Lcom/avito/android/beduin/common/component/conditional_group/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.conditional_group.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f101068a = new b();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final String f101069b = "less";

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final Class<LessCondition> f101070c = LessCondition.class;

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        /* renamed from: getType */
        public final String getF101080b() {
            return f101069b;
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        public final Class<LessCondition> getValue() {
            return f101070c;
        }
    }

    /* compiled from: LessCondition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "param", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<Object, Boolean> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            double dDoubleValue;
            if (obj instanceof Number) {
                dDoubleValue = ((Number) obj).doubleValue();
            } else {
                if (!(obj instanceof String)) {
                    return Boolean.FALSE;
                }
                Double dW02 = C43066x.w0((String) obj);
                if (dW02 == null) {
                    return Boolean.FALSE;
                }
                dDoubleValue = dW02.doubleValue();
            }
            return Boolean.valueOf(dDoubleValue < LessCondition.this.getValue());
        }
    }

    public /* synthetic */ LessCondition(String str, List list, double d12, C42822w c42822w) {
        this(str, list, d12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-oXZ40Kg$default, reason: not valid java name */
    public static /* synthetic */ LessCondition m24copyoXZ40Kg$default(LessCondition lessCondition, String str, List list, double d12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = lessCondition.id;
        }
        if ((i12 & 2) != 0) {
            list = lessCondition.path;
        }
        if ((i12 & 4) != 0) {
            d12 = lessCondition.value;
        }
        return lessCondition.m26copyoXZ40Kg(str, list, d12);
    }

    @Override // com.avito.android.beduin.common.component.conditional_group.component.Condition
    public boolean check(@Y61.k Map<String, ? extends Object> parameters) {
        return ((Boolean) com.avito.android.beduin.common.component.model.e.b(this.path, this.id, parameters, new c())).booleanValue();
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component2-FIV8Enc, reason: not valid java name */
    public final List<? extends String> m25component2FIV8Enc() {
        return this.path;
    }

    /* renamed from: component3, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    @Y61.k
    /* renamed from: copy-oXZ40Kg, reason: not valid java name */
    public final LessCondition m26copyoXZ40Kg(@Y61.k String id2, @Y61.l List<? extends String> path, double value) {
        return new LessCondition(id2, path, value, null);
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
    public boolean equals(@Y61.l java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.avito.android.beduin.common.component.conditional_group.component.LessCondition
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.avito.android.beduin.common.component.conditional_group.component.LessCondition r8 = (com.avito.android.beduin.common.component.conditional_group.component.LessCondition) r8
            java.lang.String r1 = r7.id
            java.lang.String r3 = r8.id
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<? extends java.lang.String> r1 = r7.path
            java.util.List<? extends java.lang.String> r3 = r8.path
            if (r1 != 0) goto L23
            if (r3 != 0) goto L21
            r1 = r0
            goto L2c
        L21:
            r1 = r2
            goto L2c
        L23:
            if (r3 != 0) goto L26
            goto L21
        L26:
            android.os.Parcelable$Creator<com.avito.android.beduin.common.component.model.Path> r4 = com.avito.android.beduin.common.component.model.Path.CREATOR
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
        L2c:
            if (r1 != 0) goto L2f
            return r2
        L2f:
            double r3 = r7.value
            double r5 = r8.value
            int r8 = java.lang.Double.compare(r3, r5)
            if (r8 == 0) goto L3a
            return r2
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.conditional_group.component.LessCondition.equals(java.lang.Object):boolean");
    }

    @Y61.k
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: getPath-FIV8Enc, reason: not valid java name */
    public final List<? extends String> m27getPathFIV8Enc() {
        return this.path;
    }

    public final double getValue() {
        return this.value;
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
        return Double.hashCode(this.value) + ((iHashCode2 + iHashCode) * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LessCondition(id=");
        sb2.append(this.id);
        sb2.append(", path=");
        List<? extends String> list = this.path;
        sb2.append((Object) (list == null ? "null" : Path.b(list)));
        sb2.append(", value=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.value, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        List<? extends String> list = this.path;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Parcelable.Creator<Path> creator = Path.CREATOR;
            parcel.writeStringList(list);
        }
        parcel.writeDouble(this.value);
    }

    private LessCondition(String str, List<? extends String> list, double d12) {
        this.id = str;
        this.path = list;
        this.value = d12;
    }
}
