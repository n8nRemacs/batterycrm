package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import com.avito.android.remote.model.RawJson;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvCallsExternalSignalingTransportImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/RawJson;", "rawJson", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/RawJson;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class m extends N implements Y41.l<RawJson, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f164561l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f164562m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f164563n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(int i12, Y41.l lVar, String str) {
        super(1);
        this.f164561l = str;
        this.f164562m = i12;
        this.f164563n = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(RawJson rawJson) {
        String value = rawJson.getValue();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AvCallsPlatform", "ExternalSignalingTransport: Socket request done: method=" + this.f164561l + ", requestIndex=" + this.f164562m, null);
        this.f164563n.invoke(value);
        return G0.f406611a;
    }
}
