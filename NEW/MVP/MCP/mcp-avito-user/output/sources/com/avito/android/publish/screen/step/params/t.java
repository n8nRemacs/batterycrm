package com.avito.android.publish.screen.step.params;

import Ie0.InterfaceC14065a;
import Ie0.d;
import com.avito.android.publish.screen.step.params.PublishDetailsFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishDetailsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class t extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d.a f241539l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFragment f241540m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(d.a aVar, PublishDetailsFragment publishDetailsFragment) {
        super(0);
        this.f241539l = aVar;
        this.f241540m = publishDetailsFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d.a.G g12 = (d.a.G) this.f241539l;
        InterfaceC14065a.InterfaceC0468a.C0469a c0469a = new InterfaceC14065a.InterfaceC0468a.C0469a(g12.f8339a, g12.f8341c, g12.f8342d);
        PublishDetailsFragment.a aVar = PublishDetailsFragment.f240417j1;
        this.f241540m.v5().accept(c0469a);
        return G0.f406611a;
    }
}
