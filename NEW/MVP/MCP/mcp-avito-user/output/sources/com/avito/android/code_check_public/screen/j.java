package com.avito.android.code_check_public.screen;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/j;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.code_check_public.c<AttributedText> f119389a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.code_check_public.c<Integer> f119390b;

    public j(@k com.avito.android.code_check_public.c<AttributedText> cVar, @l com.avito.android.code_check_public.c<Integer> cVar2) {
        this.f119389a = cVar;
        this.f119390b = cVar2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f119389a, jVar.f119389a) && L.f(this.f119390b, jVar.f119390b);
    }

    public final int hashCode() {
        int iHashCode = this.f119389a.hashCode() * 31;
        com.avito.android.code_check_public.c<Integer> cVar = this.f119390b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    @k
    public final String toString() {
        return "TextWithMarginTop(text=" + this.f119389a + ", marginTopPixels=" + this.f119390b + ')';
    }

    public /* synthetic */ j(com.avito.android.code_check_public.c cVar, com.avito.android.code_check_public.c cVar2, int i12, C42822w c42822w) {
        this(cVar, (i12 & 2) != 0 ? null : cVar2);
    }
}
