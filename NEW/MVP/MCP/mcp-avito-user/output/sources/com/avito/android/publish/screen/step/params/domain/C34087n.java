package com.avito.android.publish.screen.step.params.domain;

import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.screen.step.params.domain.n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34087n extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34076c f241284l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34087n(C34076c c34076c) {
        super(0);
        this.f241284l = c34076c;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Object next;
        Object next2;
        C34076c c34076c = this.f241284l;
        Iterator<T> it = c34076c.f241180J.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof com.avito.android.publish.slots.delivery_summary.l) {
                break;
            }
        }
        if (!(next instanceof com.avito.android.publish.slots.delivery_summary.l)) {
            next = null;
        }
        com.avito.android.publish.slots.delivery_summary.l lVar = (com.avito.android.publish.slots.delivery_summary.l) next;
        if (lVar != null) {
            lVar.m();
        }
        Iterator<T> it2 = c34076c.f241180J.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (next2 instanceof com.avito.android.publish.slots.delivery_summary_edit.f) {
                break;
            }
        }
        if (!(next2 instanceof com.avito.android.publish.slots.delivery_summary_edit.f)) {
            next2 = null;
        }
        com.avito.android.publish.slots.delivery_summary_edit.f fVar = (com.avito.android.publish.slots.delivery_summary_edit.f) next2;
        if (fVar != null) {
            fVar.n();
        }
        c34076c.f241188c.xe(null);
        return G0.f406611a;
    }
}
