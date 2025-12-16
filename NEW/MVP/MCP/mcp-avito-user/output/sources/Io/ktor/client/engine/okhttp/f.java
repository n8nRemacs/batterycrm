package io.ktor.client.engine.okhttp;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.OkHttpClient;

/* compiled from: OkHttpConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "Lkotlin/G0;", "invoke", "(Lokhttp3/OkHttpClient$Builder;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class f extends N implements Y41.l<OkHttpClient.Builder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f398917l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U51.b f398918m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Y41.l lVar, U51.b bVar) {
        super(1);
        this.f398917l = (N) lVar;
        this.f398918m = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(OkHttpClient.Builder builder) {
        OkHttpClient.Builder builder2 = builder;
        this.f398917l.invoke(builder2);
        this.f398918m.invoke(builder2);
        return G0.f406611a;
    }
}
