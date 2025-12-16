package LZ;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue;
import com.avito.android.mortgage.api.model.items.form.d;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChildrenFormContentItemValue.kt */
@P
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b!\u0010\u0017¨\u0006\""}, d2 = {"LLZ/b;", "Lcom/avito/android/mortgage/api/model/items/form/d;", "", "id", "name", "context", "", "reloadAfterUpdateMeta", "", "LLZ/a;", "childs", "", "value", "addButtonTitle", "lastDeletedChildId", "isHiddenByOtherField", "isUpdated", "isUpdatedByUser", "processId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "getContext", "Ljava/lang/Boolean;", "Ljava/util/List;", "d", "()Ljava/util/List;", "I", "e", "()I", "c", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b implements com.avito.android.mortgage.api.model.items.form.d {

    @com.google.gson.annotations.c("addButtonTitle")
    @l
    private final String addButtonTitle;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final transient String f9989b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f9990c;

    @com.google.gson.annotations.c("childs")
    @k
    private final List<a> childs;

    @com.google.gson.annotations.c("context")
    @l
    private final String context;

    /* renamed from: d, reason: collision with root package name */
    public final transient boolean f9991d;

    /* renamed from: e, reason: collision with root package name */
    public final transient boolean f9992e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final transient String f9993f;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("reloadAfterUpdate")
    @l
    private final Boolean reloadAfterUpdateMeta;

    @com.google.gson.annotations.c("value")
    private final int value;

    public b(@k String str, @k String str2, @l String str3, @l Boolean bool, @k List<a> list, int i12, @l String str4, @l String str5, boolean z12, boolean z13, boolean z14, @l String str6) {
        this.id = str;
        this.name = str2;
        this.context = str3;
        this.reloadAfterUpdateMeta = bool;
        this.childs = list;
        this.value = i12;
        this.addButtonTitle = str4;
        this.f9989b = str5;
        this.f9990c = z12;
        this.f9991d = z13;
        this.f9992e = z14;
        this.f9993f = str6;
    }

    public static b b(b bVar, ArrayList arrayList, int i12, String str, boolean z12, boolean z13, String str2, int i13) {
        String str3 = bVar.id;
        String str4 = bVar.name;
        String str5 = bVar.context;
        Boolean bool = bVar.reloadAfterUpdateMeta;
        List<a> list = (i13 & 16) != 0 ? bVar.childs : arrayList;
        int i14 = (i13 & 32) != 0 ? bVar.value : i12;
        String str6 = bVar.addButtonTitle;
        String str7 = (i13 & 128) != 0 ? bVar.f9989b : str;
        boolean z14 = (i13 & 256) != 0 ? bVar.f9990c : z12;
        boolean z15 = (i13 & 512) != 0 ? bVar.f9991d : z13;
        boolean z16 = (i13 & 1024) != 0 ? bVar.f9992e : true;
        String str8 = (i13 & 2048) != 0 ? bVar.f9993f : str2;
        bVar.getClass();
        return new b(str3, str4, str5, bool, list, i14, str6, str7, z14, z15, z16, str8);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final com.avito.android.mortgage.api.model.items.form.d H2(boolean z12) {
        return b(this, null, 0, null, z12, false, null, 3839);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<String> I2() {
        return C42784z0.f406748b;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: J2, reason: from getter */
    public final boolean getF198227b() {
        return this.f9991d;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<List<String>> L2() {
        return C42784z0.f406748b;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final com.avito.android.mortgage.api.model.items.form.d M2(boolean z12) {
        return b(this, null, 0, z12 ? this.f9989b : null, false, z12, z12 ? this.f9993f : null, 1407);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    /* renamed from: N2, reason: from getter */
    public final String getF198230e() {
        return this.f9993f;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final int P2() {
        int iA2 = 0;
        if (!getIsHidden()) {
            for (a aVar : this.childs) {
                InputFormContentItemValue inputFormContentItemValueD = aVar.getInput();
                inputFormContentItemValueD.getClass();
                int iA3 = d.a.a(inputFormContentItemValueD);
                com.avito.android.mortgage.api.model.items.form.b bVarB = aVar.getCheckbox();
                bVarB.getClass();
                iA2 += d.a.a(bVarB) + iA3;
            }
        }
        return iA2;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final com.avito.android.mortgage.api.model.items.form.d Q2(@l String str) {
        return b(this, null, 0, null, false, false, str, 2047);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: S2, reason: from getter */
    public final boolean getF198228c() {
        return this.f9992e;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean U2() {
        Boolean bool = this.reloadAfterUpdateMeta;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @k
    public final b a() {
        return b(this, null, this.value + 1, null, false, true, null, 2527);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAddButtonTitle() {
        return this.addButtonTitle;
    }

    @k
    public final List<a> d() {
        return this.childs;
    }

    /* renamed from: e, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.id, bVar.id) && L.f(this.name, bVar.name) && L.f(this.context, bVar.context) && L.f(this.reloadAfterUpdateMeta, bVar.reloadAfterUpdateMeta) && L.f(this.childs, bVar.childs) && this.value == bVar.value && L.f(this.addButtonTitle, bVar.addButtonTitle) && L.f(this.f9989b, bVar.f9989b) && this.f9990c == bVar.f9990c && this.f9991d == bVar.f9991d && this.f9992e == bVar.f9992e && L.f(this.f9993f, bVar.f9993f);
    }

    @k
    public final b f(@k String str) {
        List<a> list = this.childs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!L.f(((a) obj).getId(), str)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == this.childs.size() ? this : b(this, arrayList, arrayList.size(), str, false, true, null, 2383);
    }

    @k
    public final b g(@k LinkedHashMap linkedHashMap) {
        List<a> list = this.childs;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (a aVarA : list) {
            PrintableText printableText = (PrintableText) linkedHashMap.get(aVarA.getInput().getName());
            if (printableText != null) {
                aVarA = a.a(aVarA, (InputFormContentItemValue) ((InputFormContentItemValue) aVarA.getInput().G2(printableText)).M2(true), null, 11);
            } else if (aVarA.getInput().f198227b) {
                InputFormContentItemValue inputFormContentItemValueD = aVarA.getInput();
                inputFormContentItemValueD.getClass();
                aVarA = a.a(aVarA, InputFormContentItemValue.a(inputFormContentItemValueD, false, false, null, false, false, null, null, 458751), null, 11);
            } else {
                boolean z12 = aVarA.getInput().f198227b;
            }
            arrayList.add(aVarA);
        }
        return b(this, arrayList, 0, null, false, false, null, 4079);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    public final String getContext() {
        return this.context;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    public final PrintableText getError() {
        return null;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final String getId() {
        return this.id;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final b h(@k String str, @k String str2, @l String str3) {
        List<a> list = this.childs;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (a aVarA : list) {
            if (L.f(aVarA.getId(), str) && L.f(aVarA.getInput().getId(), str2)) {
                aVarA = a.a(aVarA, (InputFormContentItemValue) aVarA.getInput().Q2(str3), null, 11);
            } else if (L.f(aVarA.getId(), str) && L.f(aVarA.getCheckbox().getId(), str2)) {
                aVarA = a.a(aVarA, null, (com.avito.android.mortgage.api.model.items.form.b) aVarA.getCheckbox().Q2(str3), 7);
            } else if (aVarA.getInput().f198227b) {
                aVarA = a.a(aVarA, (InputFormContentItemValue) aVarA.getInput().Q2(str3), null, 11);
            } else if (aVarA.getCheckbox().f198244b) {
                aVarA = a.a(aVarA, null, (com.avito.android.mortgage.api.model.items.form.b) aVarA.getCheckbox().Q2(str3), 7);
            }
            arrayList.add(aVarA);
        }
        return b(this, arrayList, 0, null, false, false, null, 4079);
    }

    public final int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.name);
        String str = this.context;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.reloadAfterUpdateMeta;
        int iE2 = r.e(this.value, H.e((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.childs), 31);
        String str2 = this.addButtonTitle;
        int iHashCode2 = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9989b;
        int i12 = r.i(r.i(r.i((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f9990c), 31, this.f9991d), 31, this.f9992e);
        String str4 = this.f9993f;
        return i12 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final b i(@k String str, @k String str2) {
        ArrayList arrayList = new ArrayList(this.childs);
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(((a) it.next()).getId(), str)) {
                break;
            }
            i12++;
        }
        a aVar = (a) C42745f0.K(i12, arrayList);
        if (aVar == null) {
            return this;
        }
        arrayList.set(i12, a.a(aVar, aVar.getInput().f(str2, true), null, 11));
        return b(this, arrayList, 0, null, false, false, null, 4079);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean isEmpty() {
        return this.value == 0;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: isHidden */
    public final boolean getIsHidden() {
        return this.childs.isEmpty() || this.f9990c;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean isValid() {
        return true;
    }

    @k
    public final b j(@k String str, boolean z12) {
        ArrayList arrayList = new ArrayList(this.childs);
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(((a) it.next()).getId(), str)) {
                break;
            }
            i12++;
        }
        a aVar = (a) C42745f0.K(i12, arrayList);
        if (aVar == null) {
            return this;
        }
        com.avito.android.mortgage.api.model.items.form.b bVarB = aVar.getCheckbox();
        bVarB.getClass();
        arrayList.set(i12, a.a(aVar, null, com.avito.android.mortgage.api.model.items.form.b.a(bVarB, false, z12, true, null, null, 4319), 7));
        return b(this, arrayList, 0, null, false, false, null, 4079);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChildrenFormContentItemValue(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", context=");
        sb2.append(this.context);
        sb2.append(", reloadAfterUpdateMeta=");
        sb2.append(this.reloadAfterUpdateMeta);
        sb2.append(", childs=");
        sb2.append(this.childs);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", addButtonTitle=");
        sb2.append(this.addButtonTitle);
        sb2.append(", lastDeletedChildId=");
        sb2.append(this.f9989b);
        sb2.append(", isHiddenByOtherField=");
        sb2.append(this.f9990c);
        sb2.append(", isUpdated=");
        sb2.append(this.f9991d);
        sb2.append(", isUpdatedByUser=");
        sb2.append(this.f9992e);
        sb2.append(", processId=");
        return C22026a.c(sb2, this.f9993f, ')');
    }

    public /* synthetic */ b(String str, String str2, String str3, Boolean bool, List list, int i12, String str4, String str5, boolean z12, boolean z13, boolean z14, String str6, int i13, C42822w c42822w) {
        this(str, str2, str3, bool, list, i12, str4, (i13 & 128) != 0 ? null : str5, z12, (i13 & 512) != 0 ? false : z13, (i13 & 1024) != 0 ? false : z14, (i13 & 2048) != 0 ? null : str6);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final com.avito.android.mortgage.api.model.items.form.d G2(@l PrintableText printableText) {
        return this;
    }
}
