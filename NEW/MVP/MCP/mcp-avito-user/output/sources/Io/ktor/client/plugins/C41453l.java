package io.ktor.client.plugins;

import io.ktor.client.plugins.C41465v;
import io.ktor.util.C41586b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DefaultResponseValidation.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.client.plugins.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41453l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C41586b<G0> f399487a = new C41586b<>("ValidateMark");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final org.slf4j.a f399488b = org.slf4j.b.e("io.ktor.client.plugins.DefaultResponseValidation");

    /* compiled from: DefaultResponseValidation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/client/plugins/v$b;", "Lkotlin/G0;", "invoke", "(Lio/ktor/client/plugins/v$b;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: io.ktor.client.plugins.l$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C41465v.b, G0> {
        @Override // Y41.l
        public final G0 invoke(C41465v.b bVar) {
            C41465v.b bVar2 = bVar;
            bVar2.f399649c = false;
            bVar2.f399647a.add(new C41452k(2, null));
            return G0.f406611a;
        }
    }

    public static final void a(@Y61.k io.ktor.client.d<?> dVar) {
        a aVar = new a(1);
        org.slf4j.a aVar2 = C41476z.f399697a;
        dVar.b(C41465v.f399642d, aVar);
    }
}
