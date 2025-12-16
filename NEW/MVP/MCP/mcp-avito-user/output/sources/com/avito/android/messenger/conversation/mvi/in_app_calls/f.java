package com.avito.android.messenger.conversation.mvi.in_app_calls;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.conversation.mvi.in_app_calls.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelIacInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f191389l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f191390m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a.f f191391n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DeepLink deepLink, a.f fVar, a aVar) {
        super(1);
        this.f191389l = aVar;
        this.f191390m = deepLink;
        this.f191391n = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        a.me(this.f191389l, this.f191390m, this.f191391n.f191370d, null);
        return G0.f406611a;
    }
}
