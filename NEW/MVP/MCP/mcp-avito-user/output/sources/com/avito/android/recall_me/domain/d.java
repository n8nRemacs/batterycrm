package com.avito.android.recall_me.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import xi0.C49951a;

/* compiled from: RecallMeAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/domain/d;", "Lcom/avito/android/recall_me/domain/c;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f251834a;

    @Inject
    public d(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f251834a = interfaceC28373a;
    }

    @Override // com.avito.android.recall_me.domain.c
    public final void a(long j12, @Y61.k String str) {
        this.f251834a.c(new C49951a(str, Long.valueOf(j12)));
    }
}
