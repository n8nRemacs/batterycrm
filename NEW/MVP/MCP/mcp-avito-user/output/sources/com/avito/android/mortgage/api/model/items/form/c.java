package com.avito.android.mortgage.api.model.items.form;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.form.d;
import com.avito.android.printable_text.PrintableText;
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
import okhttp3.internal.http2.Settings;
import shark.AndroidResourceIdNames;

/* compiled from: ChipsFormContentItemValue.kt */
@P
@s0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\u0006\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010 R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b$\u0010 R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b(\u0010\u001dR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b,\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b-\u0010\u001d¨\u0006."}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/c;", "Lcom/avito/android/mortgage/api/model/items/form/d;", "", "id", "name", "", "isHidden", "context", "errorMeta", "isRequired", "reloadAfterUpdateMeta", "canEdit", "", "LLZ/d;", "options", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedSubtitle", "title", "valueMeta", "isUpdated", "isUpdatedByUser", "Lcom/avito/android/printable_text/PrintableText;", "localError", "processId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/printable_text/PrintableText;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "Z", "()Z", "getContext", "h", "Ljava/lang/Boolean;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "getValueMeta", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements d {

    @com.google.gson.annotations.c("attributedSubtitle")
    @l
    private final AttributedText attributedSubtitle;

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f198249b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f198250c;

    @com.google.gson.annotations.c("canEdit")
    private final boolean canEdit;

    @com.google.gson.annotations.c("context")
    @l
    private final String context;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final transient PrintableText f198251d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final transient String f198252e;

    @com.google.gson.annotations.c("error")
    @l
    private final String errorMeta;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

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

    public c(@k String str, @k String str2, boolean z12, @l String str3, @l String str4, boolean z13, @l Boolean bool, boolean z14, @k List<LZ.d> list, @l String str5, @l AttributedText attributedText, @k String str6, @l String str7, boolean z15, boolean z16, @l PrintableText printableText, @l String str8) {
        this.id = str;
        this.name = str2;
        this.isHidden = z12;
        this.context = str3;
        this.errorMeta = str4;
        this.isRequired = z13;
        this.reloadAfterUpdateMeta = bool;
        this.canEdit = z14;
        this.options = list;
        this.subtitle = str5;
        this.attributedSubtitle = attributedText;
        this.title = str6;
        this.valueMeta = str7;
        this.f198249b = z15;
        this.f198250c = z16;
        this.f198251d = printableText;
        this.f198252e = str8;
    }

    public static c a(c cVar, boolean z12, boolean z13, String str, boolean z14, boolean z15, PrintableText printableText, String str2, int i12) {
        String str3 = cVar.id;
        String str4 = cVar.name;
        boolean z16 = (i12 & 4) != 0 ? cVar.isHidden : z12;
        String str5 = cVar.context;
        String str6 = (i12 & 16) != 0 ? cVar.errorMeta : null;
        boolean z17 = (i12 & 32) != 0 ? cVar.isRequired : z13;
        Boolean bool = cVar.reloadAfterUpdateMeta;
        boolean z18 = cVar.canEdit;
        List<LZ.d> list = cVar.options;
        String str7 = cVar.subtitle;
        AttributedText attributedText = cVar.attributedSubtitle;
        String str8 = cVar.title;
        String str9 = (i12 & 4096) != 0 ? cVar.valueMeta : str;
        boolean z19 = (i12 & 8192) != 0 ? cVar.f198249b : z14;
        boolean z22 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cVar.f198250c : z15;
        PrintableText printableText2 = (i12 & 32768) != 0 ? cVar.f198251d : printableText;
        String str10 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? cVar.f198252e : str2;
        cVar.getClass();
        return new c(str3, str4, z16, str5, str6, z17, bool, z18, list, str7, attributedText, str8, str9, z19, z22, printableText2, str10);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d G2(@l PrintableText printableText) {
        return a(this, false, false, null, false, false, printableText, null, 98303);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d H2(boolean z12) {
        return a(this, z12, false, null, false, false, null, null, 131067);
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
        return this.f198249b;
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
        return a(this, false, false, null, z12, false, null, z12 ? this.f198252e : null, 57343);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    /* renamed from: N2, reason: from getter */
    public final String getF9993f() {
        return this.f198252e;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final int P2() {
        return d.a.a(this);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d Q2(@l String str) {
        return a(this, false, false, null, false, false, null, str, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: S2, reason: from getter */
    public final boolean getF9992e() {
        return this.f198250c;
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

    /* renamed from: c, reason: from getter */
    public final boolean getCanEdit() {
        return this.canEdit;
    }

    @k
    public final List<LZ.d> d() {
        return this.options;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.id, cVar.id) && L.f(this.name, cVar.name) && this.isHidden == cVar.isHidden && L.f(this.context, cVar.context) && L.f(this.errorMeta, cVar.errorMeta) && this.isRequired == cVar.isRequired && L.f(this.reloadAfterUpdateMeta, cVar.reloadAfterUpdateMeta) && this.canEdit == cVar.canEdit && L.f(this.options, cVar.options) && L.f(this.subtitle, cVar.subtitle) && L.f(this.attributedSubtitle, cVar.attributedSubtitle) && L.f(this.title, cVar.title) && L.f(this.valueMeta, cVar.valueMeta) && this.f198249b == cVar.f198249b && this.f198250c == cVar.f198250c && L.f(this.f198251d, cVar.f198251d) && L.f(this.f198252e, cVar.f198252e);
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
        PrintableText printableText = this.f198251d;
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
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.id.hashCode() * 31, 31, this.name), 31, this.isHidden);
        String str = this.context;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMeta;
        int i13 = r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isRequired);
        Boolean bool = this.reloadAfterUpdateMeta;
        int iE2 = H.e(r.i((i13 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.canEdit), 31, this.options);
        String str3 = this.subtitle;
        int iHashCode2 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.attributedSubtitle;
        int iD2 = H.d((iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.title);
        String str4 = this.valueMeta;
        int i14 = r.i(r.i((iD2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f198249b), 31, this.f198250c);
        PrintableText printableText = this.f198251d;
        int iHashCode3 = (i14 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        String str5 = this.f198252e;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public final c i(@k String str, boolean z12) {
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
        return str2.equals(g()) ? this : a(this, false, false, str2, true, z12, null, null, 69615);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean isEmpty() {
        String strG = g();
        if (strG != null && strG.length() != 0) {
            List<LZ.d> list = this.options;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (L.f(((LZ.d) it.next()).getValue(), g())) {
                        return false;
                    }
                }
            }
        }
        return true;
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
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChipsFormContentItemValue(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", isHidden=");
        sb2.append(this.isHidden);
        sb2.append(", context=");
        sb2.append(this.context);
        sb2.append(", errorMeta=");
        sb2.append(this.errorMeta);
        sb2.append(", isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", reloadAfterUpdateMeta=");
        sb2.append(this.reloadAfterUpdateMeta);
        sb2.append(", canEdit=");
        sb2.append(this.canEdit);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.attributedSubtitle);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", valueMeta=");
        sb2.append(this.valueMeta);
        sb2.append(", isUpdated=");
        sb2.append(this.f198249b);
        sb2.append(", isUpdatedByUser=");
        sb2.append(this.f198250c);
        sb2.append(", localError=");
        sb2.append(this.f198251d);
        sb2.append(", processId=");
        return C22026a.c(sb2, this.f198252e, ')');
    }

    public /* synthetic */ c(String str, String str2, boolean z12, String str3, String str4, boolean z13, Boolean bool, boolean z14, List list, String str5, AttributedText attributedText, String str6, String str7, boolean z15, boolean z16, PrintableText printableText, String str8, int i12, C42822w c42822w) {
        this(str, str2, z12, str3, str4, z13, bool, z14, list, str5, attributedText, str6, str7, (i12 & 8192) != 0 ? false : z15, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z16, (32768 & i12) != 0 ? null : printableText, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : str8);
    }
}
