package com.avito.android.beduin.common.component.conditional_group.component;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.model.Path;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ContainsValueSubstringCondition.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u00010B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00072\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\"\u0010\u001eJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0011R\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0017\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/ContainsValueSubstringCondition;", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "", "id", "Lcom/avito/android/beduin/common/component/model/Path;", "path", "string", "", "ignoreCase", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/internal/w;)V", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "check", "(Ljava/util/Map;)Z", "component1", "()Ljava/lang/String;", "component2-FIV8Enc", "()Ljava/util/List;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "copy-e1VeSPI", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/conditional_group/component/ContainsValueSubstringCondition;", "copy", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getPath-FIV8Enc", "getString", "Ljava/lang/Boolean;", "getIgnoreCase", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ContainsValueSubstringCondition implements Condition {

    @Y61.k
    public static final Parcelable.Creator<ContainsValueSubstringCondition> CREATOR = new b();

    @Y61.k
    private final String id;

    @Y61.l
    private final Boolean ignoreCase;

    @Y61.l
    private final List<? extends String> path;

    @Y61.k
    private final String string;

    /* compiled from: ContainsValueSubstringCondition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/ContainsValueSubstringCondition$a;", "Lcom/avito/android/beduin/common/component/conditional_group/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.conditional_group.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f101050a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Class<ContainsValueSubstringCondition> f101051b = ContainsValueSubstringCondition.class;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f101052c = "containsValueSubstring";

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        /* renamed from: getType */
        public final String getF101080b() {
            return f101052c;
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        public final Class<ContainsValueSubstringCondition> getValue() {
            return f101051b;
        }
    }

    /* compiled from: ContainsValueSubstringCondition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ContainsValueSubstringCondition> {
        @Override // android.os.Parcelable.Creator
        public final ContainsValueSubstringCondition createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            Path pathCreateFromParcel = parcel.readInt() == 0 ? null : Path.CREATOR.createFromParcel(parcel);
            List<String> list = pathCreateFromParcel != null ? pathCreateFromParcel.f101776b : null;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ContainsValueSubstringCondition(string, list, string2, boolValueOf, null);
        }

        @Override // android.os.Parcelable.Creator
        public final ContainsValueSubstringCondition[] newArray(int i12) {
            return new ContainsValueSubstringCondition[i12];
        }
    }

    /* compiled from: ContainsValueSubstringCondition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<Object, Boolean> {
        public c() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(java.lang.Object r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L20
                com.avito.android.beduin.common.component.conditional_group.component.ContainsValueSubstringCondition r0 = com.avito.android.beduin.common.component.conditional_group.component.ContainsValueSubstringCondition.this
                java.lang.String r1 = r0.getString()
                java.lang.String r4 = r4.toString()
                java.lang.Boolean r0 = r0.getIgnoreCase()
                r2 = 1
                if (r0 == 0) goto L18
                boolean r0 = r0.booleanValue()
                goto L19
            L18:
                r0 = r2
            L19:
                boolean r4 = kotlin.text.C43066x.q(r1, r4, r0)
                if (r4 == 0) goto L20
                goto L21
            L20:
                r2 = 0
            L21:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.conditional_group.component.ContainsValueSubstringCondition.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ ContainsValueSubstringCondition(String str, List list, String str2, Boolean bool, C42822w c42822w) {
        this(str, list, str2, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-e1VeSPI$default, reason: not valid java name */
    public static /* synthetic */ ContainsValueSubstringCondition m20copye1VeSPI$default(ContainsValueSubstringCondition containsValueSubstringCondition, String str, List list, String str2, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = containsValueSubstringCondition.id;
        }
        if ((i12 & 2) != 0) {
            list = containsValueSubstringCondition.path;
        }
        if ((i12 & 4) != 0) {
            str2 = containsValueSubstringCondition.string;
        }
        if ((i12 & 8) != 0) {
            bool = containsValueSubstringCondition.ignoreCase;
        }
        return containsValueSubstringCondition.m22copye1VeSPI(str, list, str2, bool);
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
    public final List<? extends String> m21component2FIV8Enc() {
        return this.path;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final String getString() {
        return this.string;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final Boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    @Y61.k
    /* renamed from: copy-e1VeSPI, reason: not valid java name */
    public final ContainsValueSubstringCondition m22copye1VeSPI(@Y61.k String id2, @Y61.l List<? extends String> path, @Y61.k String string, @Y61.l Boolean ignoreCase) {
        return new ContainsValueSubstringCondition(id2, path, string, ignoreCase, null);
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
    public boolean equals(@Y61.l java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.avito.android.beduin.common.component.conditional_group.component.ContainsValueSubstringCondition
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.avito.android.beduin.common.component.conditional_group.component.ContainsValueSubstringCondition r6 = (com.avito.android.beduin.common.component.conditional_group.component.ContainsValueSubstringCondition) r6
            java.lang.String r1 = r5.id
            java.lang.String r3 = r6.id
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<? extends java.lang.String> r1 = r5.path
            java.util.List<? extends java.lang.String> r3 = r6.path
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
            java.lang.String r1 = r5.string
            java.lang.String r3 = r6.string
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L3a
            return r2
        L3a:
            java.lang.Boolean r1 = r5.ignoreCase
            java.lang.Boolean r6 = r6.ignoreCase
            boolean r6 = kotlin.jvm.internal.L.f(r1, r6)
            if (r6 != 0) goto L45
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.conditional_group.component.ContainsValueSubstringCondition.equals(java.lang.Object):boolean");
    }

    @Y61.k
    public final String getId() {
        return this.id;
    }

    @Y61.l
    public final Boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    @Y61.l
    /* renamed from: getPath-FIV8Enc, reason: not valid java name */
    public final List<? extends String> m23getPathFIV8Enc() {
        return this.path;
    }

    @Y61.k
    public final String getString() {
        return this.string;
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
        int iD2 = H.d((iHashCode2 + iHashCode) * 31, 31, this.string);
        Boolean bool = this.ignoreCase;
        return iD2 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ContainsValueSubstringCondition(id=");
        sb2.append(this.id);
        sb2.append(", path=");
        List<? extends String> list = this.path;
        sb2.append((Object) (list == null ? "null" : Path.b(list)));
        sb2.append(", string=");
        sb2.append(this.string);
        sb2.append(", ignoreCase=");
        return C0.g(sb2, this.ignoreCase, ')');
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
        parcel.writeString(this.string);
        Boolean bool = this.ignoreCase;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    private ContainsValueSubstringCondition(String str, List<? extends String> list, String str2, Boolean bool) {
        this.id = str;
        this.path = list;
        this.string = str2;
        this.ignoreCase = bool;
    }
}
