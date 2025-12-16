package com.avito.android.passport.profile_add.merge.code_confirm;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TickingTimeFormatterWithPrefix.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/p;", "Lcom/avito/android/lib/design/ticking_button/d;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements com.avito.android.lib.design.ticking_button.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f212806a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f212807b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.ticking_button.d f212808c;

    public p(String str, String str2, com.avito.android.lib.design.ticking_button.d dVar, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? ": " : str2;
        dVar = (i12 & 4) != 0 ? new com.avito.android.lib.design.ticking_button.a() : dVar;
        this.f212806a = str;
        this.f212807b = str2;
        this.f212808c = dVar;
    }

    @Override // com.avito.android.lib.design.ticking_button.d
    @Y61.k
    public final String a(long j12) {
        return this.f212806a + this.f212807b + this.f212808c.a(j12);
    }
}
