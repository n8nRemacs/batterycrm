package com.avito.android.advert.item.recall_me;

import Ai0.C13040a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import xi0.C49951a;

/* compiled from: RecallMeAnalyticsInteractorV2.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/recall_me/e;", "Lcom/avito/android/advert/item/recall_me/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.recall_me.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28168e implements InterfaceC28167d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f78473a;

    @Inject
    public C28168e(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f78473a = interfaceC28373a;
    }

    @Override // com.avito.android.advert.item.recall_me.InterfaceC28167d
    public final void a(@Y61.l Long l12, @Y61.k String str) {
        this.f78473a.c(new C49951a(str, l12));
    }

    @Override // com.avito.android.advert.item.recall_me.InterfaceC28167d
    public final void b(@Y61.k String str) {
        this.f78473a.c(new C13040a(str));
    }

    @Override // com.avito.android.advert.item.recall_me.InterfaceC28167d
    public final void c(@Y61.k String str) {
        this.f78473a.c(new D(str));
    }
}
