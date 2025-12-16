package com.avito.android.publish.drafts;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import l41.InterfaceC43543a;

/* compiled from: PublishDraftWiper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/drafts/G;", "Lcom/avito/android/publish/drafts/E;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class G implements E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33835a f235317a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<PublishDraftRepository> f235318b;

    @Inject
    public G(@Y61.k InterfaceC33835a interfaceC33835a, @Y61.k h31.e<PublishDraftRepository> eVar) {
        this.f235317a = interfaceC33835a;
        this.f235318b = eVar;
    }

    @Override // com.avito.android.publish.drafts.E
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.F a(@Y61.k final String str) {
        return AbstractC41768a.p(C42745f0.U(new C41826q(new InterfaceC43543a(str) { // from class: com.avito.android.publish.drafts.F
            @Override // l41.InterfaceC43543a
            public final void run() {
                this.f235316b.f235317a.a();
            }
        }), this.f235318b.get().d()));
    }
}
