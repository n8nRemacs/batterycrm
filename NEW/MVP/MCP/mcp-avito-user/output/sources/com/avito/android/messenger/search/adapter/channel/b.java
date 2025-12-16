package com.avito.android.messenger.search.adapter.channel;

import Y61.k;
import androidx.compose.runtime.internal.P;
import fZ.AbstractC40377a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelSearchItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/search/adapter/channel/b;", "LTV0/d;", "Lcom/avito/android/messenger/search/adapter/channel/e;", "LfZ/a$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements TV0.d<e, AbstractC40377a.C11158a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<a> f197046b;

    /* compiled from: ChannelSearchItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/adapter/channel/b$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void b9(@k AbstractC40377a.C11158a c11158a, int i12);
    }

    @Inject
    public b(@k h31.e<a> eVar) {
        this.f197046b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        AbstractC40377a.C11158a c11158a = (AbstractC40377a.C11158a) aVar;
        eVar2.c(new c(this, c11158a, i12));
        eVar2.rm(c11158a);
    }
}
