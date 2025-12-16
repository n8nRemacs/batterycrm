package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.publish.details.z2;
import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsInteractorAsync.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUV0/a;", "Lcom/avito/conveyor_item/a;", "items", "Lkotlin/G0;", "accept", "(LUV0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.screen.step.params.domain.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34078e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34076c f241266b;

    public C34078e(C34076c c34076c) {
        this.f241266b = c34076c;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int i12;
        UV0.a aVarA;
        UV0.a aVar = (UV0.a) obj;
        C34076c c34076c = this.f241266b;
        com.avito.conveyor_item.a aVarA2 = c34076c.f241205t.a();
        if (aVarA2 != null && (aVarA = com.avito.konveyor.util.g.a(new UV0.c(Collections.singletonList(aVarA2)), aVar)) != null) {
            aVar = aVarA;
        }
        Iterator<T> it = com.avito.konveyor.util.g.b(aVar).iterator();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i12 = -1;
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            T next = it.next();
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            z2 z2Var = z2.f235116a;
            String f157692b = ((com.avito.conveyor_item.a) next).getF76517c();
            z2Var.getClass();
            if (f157692b.equals("1396")) {
                break;
            } else {
                i14++;
            }
        }
        c34076c.f241178H = i14;
        Iterator<T> it2 = com.avito.konveyor.util.g.b(aVar).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next2 = it2.next();
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (((com.avito.conveyor_item.a) next2) instanceof ParameterElement.q) {
                i12 = i13;
                break;
            }
            i13++;
        }
        c34076c.f241179I = i12;
        c34076c.f241181K.K5(new PublishDetailsInternalAction.InternalStateAction.ItemsUpdate(aVar));
    }
}
