package com.avito.android.mortgage.api.model.items.form;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.form.d;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: SelectFormContentItemValue.kt */
@P
@s0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0006\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b$\u0010!R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b%\u0010!R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b)\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b.\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b/\u0010\u001e¨\u00060"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/e;", "Lcom/avito/android/mortgage/api/model/items/form/d;", "", "id", "name", "", "isHidden", "context", "reloadAfterUpdateMeta", "errorMeta", "isRequired", "isCompact", "", "LLZ/d;", "options", ChannelContext.Item.PLACEHOLDER, "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedSubtitle", "title", "valueMeta", "isUpdated", "isUpdatedByUser", "Lcom/avito/android/printable_text/PrintableText;", "localError", "processId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/printable_text/PrintableText;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "Z", "()Z", "getContext", "Ljava/lang/Boolean;", "i", "h", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "e", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "getValueMeta", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e implements d {

    @com.google.gson.annotations.c("attributedSubtitle")
    @l
    private final AttributedText attributedSubtitle;

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f198254b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f198255c;

    @com.google.gson.annotations.c("context")
    @l
    private final String context;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final transient PrintableText f198256d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final transient String f198257e;

    @com.google.gson.annotations.c("error")
    @l
    private final String errorMeta;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isCompact")
    private final boolean isCompact;

    @com.google.gson.annotations.c("isHidden")
    private final boolean isHidden;

    @com.google.gson.annotations.c("isRequired")
    private final boolean isRequired;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("options")
    @k
    private final List<LZ.d> options;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @com.google.gson.annotations.c("reloadAfterUpdate")
    @l
    private final Boolean reloadAfterUpdateMeta;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    @l
    private final String valueMeta;

    public e(@k String str, @k String str2, boolean z12, @l String str3, @l Boolean bool, @l String str4, boolean z13, boolean z14, @k List<LZ.d> list, @l String str5, @l String str6, @l AttributedText attributedText, @k String str7, @l String str8, boolean z15, boolean z16, @l PrintableText printableText, @l String str9) {
        this.id = str;
        this.name = str2;
        this.isHidden = z12;
        this.context = str3;
        this.reloadAfterUpdateMeta = bool;
        this.errorMeta = str4;
        this.isRequired = z13;
        this.isCompact = z14;
        this.options = list;
        this.placeholder = str5;
        this.subtitle = str6;
        this.attributedSubtitle = attributedText;
        this.title = str7;
        this.valueMeta = str8;
        this.f198254b = z15;
        this.f198255c = z16;
        this.f198256d = printableText;
        this.f198257e = str9;
    }

    public static e a(e eVar, boolean z12, boolean z13, String str, boolean z14, boolean z15, PrintableText printableText, String str2, int i12) {
        String str3 = eVar.id;
        String str4 = eVar.name;
        boolean z16 = (i12 & 4) != 0 ? eVar.isHidden : z12;
        String str5 = eVar.context;
        Boolean bool = eVar.reloadAfterUpdateMeta;
        String str6 = (i12 & 32) != 0 ? eVar.errorMeta : null;
        boolean z17 = (i12 & 64) != 0 ? eVar.isRequired : z13;
        boolean z18 = eVar.isCompact;
        List<LZ.d> list = eVar.options;
        String str7 = eVar.placeholder;
        String str8 = eVar.subtitle;
        AttributedText attributedText = eVar.attributedSubtitle;
        String str9 = eVar.title;
        String str10 = (i12 & 8192) != 0 ? eVar.valueMeta : str;
        boolean z19 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? eVar.f198254b : z14;
        boolean z22 = (i12 & 32768) != 0 ? eVar.f198255c : z15;
        PrintableText printableText2 = (65536 & i12) != 0 ? eVar.f198256d : printableText;
        String str11 = (i12 & 131072) != 0 ? eVar.f198257e : str2;
        eVar.getClass();
        return new e(str3, str4, z16, str5, bool, str6, z17, z18, list, str7, str8, attributedText, str9, str10, z19, z22, printableText2, str11);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d G2(@l PrintableText printableText) {
        return a(this, false, false, null, false, false, printableText, null, 196607);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d H2(boolean z12) {
        return a(this, z12, false, null, false, false, null, null, 262139);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<String> I2() {
        Object next;
        if (this.isHidden) {
            return C42784z0.f406748b;
        }
        Iterator<T> it = this.options.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((LZ.d) next).getValue(), g())) {
                break;
            }
        }
        LZ.d dVar = (LZ.d) next;
        return (dVar != null ? dVar.b() : null) != null ? dVar.b() : C42784z0.f406748b;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: J2, reason: from getter */
    public final boolean getF9991d() {
        return this.f198254b;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<List<String>> L2() {
        if (this.isHidden) {
            List<LZ.d> list = this.options;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<String> listB = ((LZ.d) it.next()).b();
                if (listB == null) {
                    listB = C42784z0.f406748b;
                }
                arrayList.add(listB);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!((List) obj).isEmpty()) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        List<LZ.d> list2 = this.options;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (!L.f(((LZ.d) obj2).getValue(), g())) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            List<String> listB2 = ((LZ.d) it2.next()).b();
            if (listB2 == null) {
                listB2 = C42784z0.f406748b;
            }
            arrayList4.add(listB2);
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (!((List) obj3).isEmpty()) {
                arrayList5.add(obj3);
            }
        }
        return arrayList5;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d M2(boolean z12) {
        return a(this, false, false, null, z12, false, null, z12 ? this.f198257e : null, 114687);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    /* renamed from: N2, reason: from getter */
    public final String getF9993f() {
        return this.f198257e;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final int P2() {
        return d.a.a(this);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d Q2(@l String str) {
        return a(this, false, false, null, false, false, null, str, 131071);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: S2, reason: from getter */
    public final boolean getF9992e() {
        return this.f198255c;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean U2() {
        Boolean bool = this.reloadAfterUpdateMeta;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @k
    public final List<LZ.d> c() {
        return this.options;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.id, eVar.id) && L.f(this.name, eVar.name) && this.isHidden == eVar.isHidden && L.f(this.context, eVar.context) && L.f(this.reloadAfterUpdateMeta, eVar.reloadAfterUpdateMeta) && L.f(this.errorMeta, eVar.errorMeta) && this.isRequired == eVar.isRequired && this.isCompact == eVar.isCompact && L.f(this.options, eVar.options) && L.f(this.placeholder, eVar.placeholder) && L.f(this.subtitle, eVar.subtitle) && L.f(this.attributedSubtitle, eVar.attributedSubtitle) && L.f(this.title, eVar.title) && L.f(this.valueMeta, eVar.valueMeta) && this.f198254b == eVar.f198254b && this.f198255c == eVar.f198255c && L.f(this.f198256d, eVar.f198256d) && L.f(this.f198257e, eVar.f198257e);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String g() {
        List<LZ.d> list = this.options;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (L.f(((LZ.d) it.next()).getValue(), this.valueMeta)) {
                    return this.valueMeta;
                }
            }
        }
        return "";
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    public final String getContext() {
        return this.context;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    public final PrintableText getError() {
        PrintableText printableText = this.f198256d;
        if (printableText != null) {
            return printableText;
        }
        String str = this.errorMeta;
        if (str == null || str.length() == 0) {
            return null;
        }
        return com.avito.android.printable_text.b.f(this.errorMeta);
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

    /* renamed from: h, reason: from getter */
    public final boolean getIsCompact() {
        return this.isCompact;
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.id.hashCode() * 31, 31, this.name), 31, this.isHidden);
        String str = this.context;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.reloadAfterUpdateMeta;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.errorMeta;
        int iE2 = H.e(r.i(r.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isRequired), 31, this.isCompact), 31, this.options);
        String str3 = this.placeholder;
        int iHashCode3 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AttributedText attributedText = this.attributedSubtitle;
        int iD2 = H.d((iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.title);
        String str5 = this.valueMeta;
        int i13 = r.i(r.i((iD2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f198254b), 31, this.f198255c);
        PrintableText printableText = this.f198256d;
        int iHashCode5 = (i13 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        String str6 = this.f198257e;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean isEmpty() {
        String strG = g();
        return strG == null || strG.length() == 0;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean isValid() {
        return (this.isRequired && !this.isHidden && isEmpty()) ? false : true;
    }

    @k
    public final e j(@k String str, boolean z12) {
        if (str.length() > 0) {
            List<LZ.d> list = this.options;
            if ((list instanceof Collection) && list.isEmpty()) {
                str = "";
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (L.f(((LZ.d) it.next()).getValue(), str)) {
                        break;
                    }
                }
                str = "";
            }
        }
        String str2 = str;
        return str2.equals(g()) ? this : a(this, false, false, str2, true, z12, null, null, 139231);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectFormContentItemValue(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", isHidden=");
        sb2.append(this.isHidden);
        sb2.append(", context=");
        sb2.append(this.context);
        sb2.append(", reloadAfterUpdateMeta=");
        sb2.append(this.reloadAfterUpdateMeta);
        sb2.append(", errorMeta=");
        sb2.append(this.errorMeta);
        sb2.append(", isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", isCompact=");
        sb2.append(this.isCompact);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.attributedSubtitle);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", valueMeta=");
        sb2.append(this.valueMeta);
        sb2.append(", isUpdated=");
        sb2.append(this.f198254b);
        sb2.append(", isUpdatedByUser=");
        sb2.append(this.f198255c);
        sb2.append(", localError=");
        sb2.append(this.f198256d);
        sb2.append(", processId=");
        return C22026a.c(sb2, this.f198257e, ')');
    }

    public /* synthetic */ e(String str, String str2, boolean z12, String str3, Boolean bool, String str4, boolean z13, boolean z14, List list, String str5, String str6, AttributedText attributedText, String str7, String str8, boolean z15, boolean z16, PrintableText printableText, String str9, int i12, C42822w c42822w) {
        this(str, str2, z12, str3, bool, str4, z13, z14, list, str5, str6, attributedText, str7, str8, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z15, (32768 & i12) != 0 ? false : z16, (65536 & i12) != 0 ? null : printableText, (i12 & 131072) != 0 ? null : str9);
    }
}
