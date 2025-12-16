package com.avito.android.publish.screen.step.params.domain;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class W extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34076c f241160l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.conveyor_item.a> f241161m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public W(C34076c c34076c, List<? extends com.avito.conveyor_item.a> list) {
        super(0);
        this.f241160l = c34076c;
        this.f241161m = list;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f241160l.s(this.f241161m);
        return G0.f406611a;
    }
}
