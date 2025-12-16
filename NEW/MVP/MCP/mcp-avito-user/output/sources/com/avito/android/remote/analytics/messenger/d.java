package com.avito.android.remote.analytics.messenger;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.analytics.messenger.j;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MessengerNetworkErrorAnalyticsImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/messenger/d;", "Lcom/avito/android/remote/analytics/messenger/c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f253204a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f253205b;

    /* compiled from: MessengerNetworkErrorAnalyticsImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/messenger/j$a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/analytics/messenger/j$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            j.a aVar = (j.a) obj;
            d.this.f253205b.a(aVar.f253216a, aVar.f253217b);
        }
    }

    @Inject
    public d(@Y61.k j jVar, @Y61.k g gVar) {
        this.f253204a = jVar;
        this.f253205b = gVar;
    }

    @Override // com.avito.android.remote.analytics.messenger.c
    public final void a() {
        this.f253204a.a().t0(new a());
    }
}
