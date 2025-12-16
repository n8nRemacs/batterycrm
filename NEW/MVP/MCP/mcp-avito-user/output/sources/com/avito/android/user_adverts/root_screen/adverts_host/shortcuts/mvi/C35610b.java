package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ShortcutsActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.ShortcutsActor$postProcessLoadingChanges$1", f = "ShortcutsActor.kt", i = {}, l = {406, 407, 411}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35610b extends SuspendLambda implements Y41.p<ShortcutsInternalAction, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314002q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f314003r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35609a f314004s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<TI0.c> f314005t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35610b(Y41.a aVar, C35609a c35609a, Continuation continuation) {
        super(2, continuation);
        this.f314004s = c35609a;
        this.f314005t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35610b c35610b = new C35610b(this.f314005t, this.f314004s, continuation);
        c35610b.f314003r = obj;
        return c35610b;
    }

    @Override // Y41.p
    public final Object invoke(ShortcutsInternalAction shortcutsInternalAction, Continuation<? super G0> continuation) {
        return ((C35610b) create(shortcutsInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.C35610b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
