package com.avito.android.publish.details;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PublishDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class N1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K1 f233078l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(K1 k12) {
        super(0);
        this.f233078l = k12;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        Object next;
        Object next2;
        K1 k12 = this.f233078l;
        Iterator<T> it = k12.f232996s0.iterator();
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
        Iterator<T> it2 = k12.f232996s0.iterator();
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
        k12.f232960E.xe(null);
        return kotlin.G0.f406611a;
    }
}
