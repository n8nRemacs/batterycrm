package com.avito.android.rating_form.step;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j implements UnaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f249514b;

    public /* synthetic */ j(Object obj, int i12) {
        this.f249513a = i12;
        this.f249514b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object next;
        switch (this.f249513a) {
            case 0:
                e eVar = (e) obj;
                long j12 = eVar.f249467a;
                e eVar2 = (e) this.f249514b;
                return j12 == eVar2.f249467a ? eVar2 : eVar;
            default:
                TV0.a aVar = (TV0.a) obj;
                if (!(aVar instanceof com.avito.android.rating_form.item.file_picker.g)) {
                    return aVar;
                }
                Iterator it = ((ArrayList) this.f249514b).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (L.f(((com.avito.android.rating_form.item.file_picker.g) aVar).f248428c, ((com.avito.android.rating_form.item.file_picker.g) next).f248428c)) {
                        }
                    } else {
                        next = null;
                    }
                }
                com.avito.android.rating_form.item.file_picker.g gVar = (com.avito.android.rating_form.item.file_picker.g) next;
                return gVar == null ? (com.avito.android.rating_form.item.file_picker.g) aVar : gVar;
        }
    }
}
