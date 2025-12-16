package com.avito.android.mortgage.api.model.items.form;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.form.d;
import com.avito.android.printable_text.PrintableText;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckboxFormContentItemValue.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u0006\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/b;", "Lcom/avito/android/mortgage/api/model/items/form/d;", "", "id", "name", "", "isHidden", "context", "reloadAfterUpdateMeta", "errorMeta", "", "shows", "title", "value", "isUpdated", "isUpdatedByUser", "Lcom/avito/android/printable_text/PrintableText;", "localError", "processId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZLcom/avito/android/printable_text/PrintableText;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "Z", "()Z", "getContext", "Ljava/lang/Boolean;", "Ljava/util/List;", "getShows", "()Ljava/util/List;", "b", "c", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f198244b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f198245c;

    @com.google.gson.annotations.c("context")
    @l
    private final String context;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final transient PrintableText f198246d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final transient String f198247e;

    @com.google.gson.annotations.c("error")
    @l
    private final String errorMeta;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isHidden")
    private final boolean isHidden;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("reloadAfterUpdate")
    @l
    private final Boolean reloadAfterUpdateMeta;

    @com.google.gson.annotations.c("shows")
    @l
    private final List<String> shows;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    private final boolean value;

    public b(@k String str, @k String str2, boolean z12, @l String str3, @l Boolean bool, @l String str4, @l List<String> list, @k String str5, boolean z13, boolean z14, boolean z15, @l PrintableText printableText, @l String str6) {
        this.id = str;
        this.name = str2;
        this.isHidden = z12;
        this.context = str3;
        this.reloadAfterUpdateMeta = bool;
        this.errorMeta = str4;
        this.shows = list;
        this.title = str5;
        this.value = z13;
        this.f198244b = z14;
        this.f198245c = z15;
        this.f198246d = printableText;
        this.f198247e = str6;
    }

    public static b a(b bVar, boolean z12, boolean z13, boolean z14, PrintableText printableText, String str, int i12) {
        String str2 = bVar.id;
        String str3 = bVar.name;
        boolean z15 = (i12 & 4) != 0 ? bVar.isHidden : z12;
        String str4 = bVar.context;
        Boolean bool = bVar.reloadAfterUpdateMeta;
        String str5 = (i12 & 32) != 0 ? bVar.errorMeta : null;
        List<String> list = bVar.shows;
        String str6 = bVar.title;
        boolean z16 = (i12 & 256) != 0 ? bVar.value : z13;
        boolean z17 = (i12 & 512) != 0 ? bVar.f198244b : z14;
        boolean z18 = (i12 & 1024) != 0 ? bVar.f198245c : true;
        PrintableText printableText2 = (i12 & 2048) != 0 ? bVar.f198246d : printableText;
        String str7 = (i12 & 4096) != 0 ? bVar.f198247e : str;
        bVar.getClass();
        return new b(str2, str3, z15, str4, bool, str5, list, str6, z16, z17, z18, printableText2, str7);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d G2(@l PrintableText printableText) {
        return a(this, false, false, false, printableText, null, 6143);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d H2(boolean z12) {
        return a(this, z12, false, false, null, null, 8187);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<String> I2() {
        List<String> list;
        return (!this.value || this.isHidden || (list = this.shows) == null) ? C42784z0.f406748b : list;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: J2, reason: from getter */
    public final boolean getF198234b() {
        return this.f198244b;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<List<String>> L2() {
        if (this.isHidden) {
            Object obj = this.shows;
            if (obj == null) {
                obj = C42784z0.f406748b;
            }
            return Collections.singletonList(obj);
        }
        if (this.value) {
            return C42784z0.f406748b;
        }
        Object obj2 = this.shows;
        if (obj2 == null) {
            obj2 = C42784z0.f406748b;
        }
        return Collections.singletonList(obj2);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d M2(boolean z12) {
        return a(this, false, false, z12, null, z12 ? this.f198247e : null, 3583);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    /* renamed from: N2, reason: from getter */
    public final String getF198238f() {
        return this.f198247e;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final int P2() {
        return d.a.a(this);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d Q2(@l String str) {
        return a(this, false, false, false, null, str, 4095);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: S2, reason: from getter */
    public final boolean getF198236d() {
        return this.f198245c;
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
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getValue() {
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
        return L.f(this.id, bVar.id) && L.f(this.name, bVar.name) && this.isHidden == bVar.isHidden && L.f(this.context, bVar.context) && L.f(this.reloadAfterUpdateMeta, bVar.reloadAfterUpdateMeta) && L.f(this.errorMeta, bVar.errorMeta) && L.f(this.shows, bVar.shows) && L.f(this.title, bVar.title) && this.value == bVar.value && this.f198244b == bVar.f198244b && this.f198245c == bVar.f198245c && L.f(this.f198246d, bVar.f198246d) && L.f(this.f198247e, bVar.f198247e);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    public final String getContext() {
        return this.context;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    public final PrintableText getError() {
        PrintableText printableText = this.f198246d;
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

    public final int hashCode() {
        int i12 = r.i(H.d(this.id.hashCode() * 31, 31, this.name), 31, this.isHidden);
        String str = this.context;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.reloadAfterUpdateMeta;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.errorMeta;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.shows;
        int i13 = r.i(r.i(r.i(H.d((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.title), 31, this.value), 31, this.f198244b), 31, this.f198245c);
        PrintableText printableText = this.f198246d;
        int iHashCode4 = (i13 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        String str3 = this.f198247e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean isValid() {
        return true;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckboxFormContentItemValue(id=");
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
        sb2.append(", shows=");
        sb2.append(this.shows);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", isUpdated=");
        sb2.append(this.f198244b);
        sb2.append(", isUpdatedByUser=");
        sb2.append(this.f198245c);
        sb2.append(", localError=");
        sb2.append(this.f198246d);
        sb2.append(", processId=");
        return C22026a.c(sb2, this.f198247e, ')');
    }

    public /* synthetic */ b(String str, String str2, boolean z12, String str3, Boolean bool, String str4, List list, String str5, boolean z13, boolean z14, boolean z15, PrintableText printableText, String str6, int i12, C42822w c42822w) {
        this(str, str2, z12, str3, bool, str4, list, str5, z13, (i12 & 512) != 0 ? false : z14, (i12 & 1024) != 0 ? false : z15, (i12 & 2048) != 0 ? null : printableText, (i12 & 4096) != 0 ? null : str6);
    }
}
