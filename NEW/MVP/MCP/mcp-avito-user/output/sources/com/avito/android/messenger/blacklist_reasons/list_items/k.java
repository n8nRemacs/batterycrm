package com.avito.android.messenger.blacklist_reasons.list_items;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.blacklist_reasons.list_items.a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReasonItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/k;", "LTV0/d;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/m;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements TV0.d<m, a.C5476a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.blacklist_reasons.e f186632b;

    @Inject
    public k(@Y61.k com.avito.android.messenger.blacklist_reasons.e eVar) {
        this.f186632b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a.C5476a c5476a = (a.C5476a) aVar;
        ((m) eVar).DS(c5476a, new j(this, c5476a));
    }
}
