package com.avito.android.publish.objects;

import Gd0.C13868b;
import kotlin.Metadata;

/* compiled from: ObjectFillFormViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/d;", "element", "Lkotlin/G0;", "accept", "(Lcom/avito/android/items/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class K<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33975x f237495b;

    public K(C33975x c33975x) {
        this.f237495b = c33975x;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.items.d dVar = (com.avito.android.items.d) obj;
        String f117481f = dVar.getF117481f();
        if (f117481f == null) {
            f117481f = "";
        }
        C33975x c33975x = this.f237495b;
        c33975x.Z2(dVar, f117481f, false);
        if (c33975x.f238121V) {
            String strNe = c33975x.ne();
            String strOe = c33975x.oe();
            String f117481f2 = dVar.getF117481f();
            String strMe = c33975x.me();
            c33975x.f238111L.c(new C13868b(c33975x.f238112M, f117481f2, strNe, strOe, dVar.getF117480e(), strMe));
        }
    }
}
