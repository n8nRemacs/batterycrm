package com.avito.android.publish.objects.slot;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.j;
import com.avito.android.publish.slots.q;
import com.avito.android.publish.slots.y;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: ObjectFillFormSlotManager.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/slot/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final y f238095a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f238096b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f238097c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f238098d;

    @Inject
    public c(@k y yVar) {
        this.f238095a = yVar;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f238096b = cVar;
        this.f238097c = new C41981q0(cVar);
        this.f238098d = new io.reactivex.rxjava3.disposables.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Set<? extends com.avito.android.category_parameters.j<? extends com.avito.android.remote.model.category_parameters.slot.Slot<?>>>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Set<com.avito.android.category_parameters.j<? extends com.avito.android.remote.model.category_parameters.slot.Slot<?>>>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Set] */
    @k
    public final Set<j<? extends Slot<?>>> a(@k Set<? extends j<? extends Slot<?>>> set, @k ParametersTree parametersTree) {
        ArrayList arrayList = new ArrayList();
        for (ParameterSlot parameterSlot : parametersTree) {
            if (parameterSlot instanceof Slot) {
                arrayList.add(parameterSlot);
            }
        }
        Iterable iterable = (Iterable) set;
        List listM0 = C42745f0.M0(iterable);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listM0, 10));
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            arrayList2.add(((j) it.next()).g());
        }
        if (!arrayList2.equals(arrayList)) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : iterable) {
                if (obj instanceof q) {
                    arrayList3.add(obj);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).clear();
            }
            set = this.f238095a.a(parametersTree);
            io.reactivex.rxjava3.disposables.c cVar = this.f238098d;
            cVar.e();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : (Iterable) set) {
                if (obj2 instanceof q) {
                    arrayList4.add(obj2);
                }
            }
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                z<f> zVarA = ((q) it3.next()).a();
                a aVar = new a(this, set);
                g<? super Throwable> gVar = b.f238094b;
                zVarA.getClass();
                cVar.b(zVarA.v0(aVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
        return set;
    }
}
