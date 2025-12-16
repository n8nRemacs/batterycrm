package com.avito.android.publish.objects;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ObjectFillFormViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/b;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/items/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.objects.n0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33962n0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33975x f238056b;

    public C33962n0(C33975x c33975x) {
        this.f238056b = c33975x;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.items.b bVar = (com.avito.android.items.b) obj;
        boolean z12 = bVar.f173929d;
        List<JO.m> list = bVar.f173941p;
        JO.m mVar = (JO.m) (z12 ? C42745f0.G(list) : C42745f0.S(list));
        if (mVar != null) {
            mVar.f8964e = bVar.f173929d;
            this.f238056b.qe(new Ij.b(bVar.f173927b, mVar, null, 4, null));
        }
    }
}
