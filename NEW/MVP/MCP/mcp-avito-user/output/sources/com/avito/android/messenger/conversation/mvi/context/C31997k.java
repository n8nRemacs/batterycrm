package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.messenger.conversation.mvi.context.C31988b;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.util.X2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "oldState", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31997k extends kotlin.jvm.internal.N implements Y41.l<InterfaceC31987a.C5631a, InterfaceC31987a.C5631a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31988b f190387l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C31988b.f f190388m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31997k(C31988b.f fVar, C31988b c31988b) {
        super(1);
        this.f190387l = c31988b;
        this.f190388m = fVar;
    }

    @Override // Y41.l
    public final InterfaceC31987a.C5631a invoke(InterfaceC31987a.C5631a c5631a) {
        InterfaceC31987a.C5631a c5631a2 = c5631a;
        X2 x22 = X2.f318778a;
        C31988b c31988b = this.f190387l;
        String str = c31988b.f207131E;
        StringBuilder sb2 = new StringBuilder("InitialDataRequestComposite.SetInProgressMutator(isRetry=");
        C31988b.f fVar = this.f190388m;
        x22.i(str, androidx.appcompat.app.r.s(").invoke()", sb2, fVar.f190265d), null);
        if (!(c5631a2.f190237b instanceof b.a) && !fVar.f190265d) {
            return c5631a2;
        }
        com.avito.android.messenger.conversation.analytics.b bVar = c31988b.f190249d0;
        bVar.j();
        bVar.r();
        return InterfaceC31987a.C5631a.a(c5631a2, null, new b.c(fVar.f190266e), null, false, 13);
    }
}
