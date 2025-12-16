package com.avito.android.code_check_public.screen;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/a;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f119328a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.code_check_public.a f119329b;

    public a(@k PrintableText printableText, @k com.avito.android.code_check_public.a aVar) {
        this.f119328a = printableText;
        this.f119329b = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f119328a, aVar.f119328a) && L.f(this.f119329b, aVar.f119329b);
    }

    public final int hashCode() {
        return this.f119329b.hashCode() + (this.f119328a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "AppbarAction(title=" + this.f119328a + ", destination=" + this.f119329b + ')';
    }
}
