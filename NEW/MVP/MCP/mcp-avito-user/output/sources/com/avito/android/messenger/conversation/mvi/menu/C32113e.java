package com.avito.android.messenger.conversation.mvi.menu;

import arrow.core.AbstractC23662a;
import com.avito.android.messenger.blacklist_reasons.y;
import com.avito.android.messenger.conversation.mvi.menu.C32115g.f;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelMenuInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$c;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/blacklist_reasons/y$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.menu.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32113e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32115g f191427b;

    public C32113e(C32115g c32115g) {
        this.f191427b = c32115g;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        y.c cVar = (y.c) obj;
        boolean z12 = cVar instanceof y.c.b;
        C32115g c32115g = this.f191427b;
        if (z12) {
            if (((y.c.b) cVar).f186685b) {
                y.c.b bVar = (y.c.b) cVar;
                c32115g.le().s(c32115g.new f(bVar.f186684a.getF186677a(), bVar.f186684a.getF186678b(), bVar.f186684a.getF186679c()));
                return;
            }
            return;
        }
        if ((cVar instanceof y.c.a) && (((y.c.a) cVar).f186682a instanceof y.a.C5478a)) {
            c32115g.f191435b0.accept(new AbstractC23662a.b(((y.c.a) cVar).f186683b));
        }
    }
}
