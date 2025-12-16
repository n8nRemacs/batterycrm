package com.avito.android.publish.details;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: PublishDetailsSlotManager.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/f;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.details.p1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33780p1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set<com.avito.android.category_parameters.j<? extends Slot<?>>> f234869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33794u1 f234870c;

    public C33780p1(C33794u1 c33794u1, Set set) {
        this.f234869b = set;
        this.f234870c = c33794u1;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean z12;
        Set<com.avito.android.category_parameters.j<? extends Slot<?>>> set = this.f234869b;
        ArrayList arrayList = new ArrayList();
        for (T t12 : set) {
            if (t12 instanceof com.avito.android.publish.slots.k) {
                arrayList.add(t12);
            }
        }
        Iterator it = arrayList.iterator();
        loop1: while (true) {
            while (it.hasNext()) {
                z12 = z12 || ((com.avito.android.publish.slots.k) it.next()).b();
            }
        }
        C33794u1 c33794u1 = this.f234870c;
        if (c33794u1.f235044g != z12) {
            c33794u1.f235044g = z12;
            c33794u1.f235041d.get().v3(z12);
        }
    }
}
