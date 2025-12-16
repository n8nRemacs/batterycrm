package com.avito.android.shortcut_navigation_bar;

import com.avito.android.paranja.ParanjaState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutUtils.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class q0 extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.paranja.h f283542l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283543m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.avito.android.paranja.h hVar, Y41.a<G0> aVar) {
        super(0);
        this.f283542l = hVar;
        this.f283543m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f283542l.setState(new ParanjaState(ParanjaState.State.f210856c, null, null, 6, null));
        this.f283543m.invoke();
        return G0.f406611a;
    }
}
