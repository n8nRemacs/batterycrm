package com.avito.avcalls.signaling.transport.external;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.r;

/* compiled from: ExternalMessageSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/avcalls/call/models/MessagePayload;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f333399l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f333400m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, r rVar) {
        super(1);
        this.f333399l = hVar;
        this.f333400m = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        h.a(this.f333399l, new d(str, this.f333400m));
        return G0.f406611a;
    }
}
