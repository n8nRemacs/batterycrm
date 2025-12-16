package com.avito.android.wallet.page.topup.form.items.submit_button_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SubmitButtonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/submit_button_item/c;", "Lcom/avito/conveyor_item/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f328341b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f328342c;

    public c(boolean z12, @k String str) {
        this.f328341b = z12;
        this.f328342c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return this.f328341b == cVar.f328341b && L.f(this.f328342c, cVar.f328342c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return -582346439;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF323246b() {
        return "submit_button";
    }

    public final int hashCode() {
        return this.f328342c.hashCode() + r.i(-872870425, 31, this.f328341b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubmitButtonItem(stringId=submit_button, isEnabled=");
        sb2.append(this.f328341b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f328342c, ')');
    }
}
