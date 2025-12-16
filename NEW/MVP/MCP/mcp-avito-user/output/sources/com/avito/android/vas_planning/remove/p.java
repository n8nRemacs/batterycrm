package com.avito.android.vas_planning.remove;

import bM0.C25532d;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.architecture_components.D;
import com.avito.android.vas_planning.remove.o;
import kotlin.Metadata;

/* compiled from: VasPlannerRemoveViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LbM0/d;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f322507b;

    public p(o oVar) {
        this.f322507b = oVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        TypedResult.Success success = typedResult instanceof TypedResult.Success ? (TypedResult.Success) typedResult : null;
        C25532d c25532d = success != null ? (C25532d) success.getResult() : null;
        o oVar = this.f322507b;
        D<o.a> d12 = oVar.f322503N;
        if (c25532d != null) {
            d12.postValue(c25532d.getSuccess() ? new o.a.b(oVar.f322498E.f322473c) : o.a.C9970a.f322505a);
        } else {
            d12.postValue(o.a.C9970a.f322505a);
        }
    }
}
