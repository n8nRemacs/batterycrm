package com.avito.android.mortgage.api.model.items.form;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.form.d;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: TextFormContentItemValue.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/f;", "Lcom/avito/android/mortgage/api/model/items/form/d;", "", "id", "", "isHidden", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;ZLcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Z", "()Z", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f implements d {

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isHidden")
    private final boolean isHidden;

    @com.google.gson.annotations.c("text")
    @k
    private final AttributedText text;

    public f(@k String str, boolean z12, @k AttributedText attributedText) {
        this.id = str;
        this.isHidden = z12;
        this.text = attributedText;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d H2(boolean z12) {
        return new f(this.id, z12, this.text);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<String> I2() {
        return C42784z0.f406748b;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: J2 */
    public final boolean getF9991d() {
        return false;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final List<List<String>> L2() {
        return C42784z0.f406748b;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    /* renamed from: N2 */
    public final String getF9993f() {
        return null;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final int P2() {
        return d.a.a(this);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    /* renamed from: S2 */
    public final boolean getF9992e() {
        return false;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    public final boolean U2() {
        return false;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.id, fVar.id) && this.isHidden == fVar.isHidden && L.f(this.text, fVar.text);
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @l
    public final String getContext() {
        return null;
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
        return this.id;
    }

    public final int hashCode() {
        return this.text.hashCode() + r.i(this.id.hashCode() * 31, 31, this.isHidden);
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
        StringBuilder sb2 = new StringBuilder("TextFormContentItemValue(id=");
        sb2.append(this.id);
        sb2.append(", isHidden=");
        sb2.append(this.isHidden);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.text, ')');
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d G2(@l PrintableText printableText) {
        return this;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d M2(boolean z12) {
        return this;
    }

    @Override // com.avito.android.mortgage.api.model.items.form.d
    @k
    public final d Q2(@l String str) {
        return this;
    }
}
