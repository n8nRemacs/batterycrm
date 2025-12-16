package ru.rustore.sdk.pushclient.messaging.service;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kb1.s;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ru.rustore.sdk.pushclient.messaging.service.a;

@Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
@DebugMetadata(c = "ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService", f = "RuStoreMessagingService.kt", i = {0, 0, 1}, l = {132, 135}, m = "handleNewPushTokenEvent", n = {"this", "event", "this"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes9.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f436848q;

    /* renamed from: r, reason: collision with root package name */
    public s.b f436849r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f436850s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f436851t;

    /* renamed from: u, reason: collision with root package name */
    public int f436852u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f436851t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f436850s = obj;
        this.f436852u |= BeduinInputModel.MIN_TEXT_VERSION;
        a.C12583a c12583a = a.f436831i;
        return this.f436851t.b(null, this);
    }
}
