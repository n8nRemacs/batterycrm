package com.avito.android.universal_map.map;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.universal_map.map.AbstractC35292b;
import com.avito.android.universal_map.map.g0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LuG0/d;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f305225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AvitoMapPoint f305226c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f305227d;

    public h0(g0 g0Var, AvitoMapPoint avitoMapPoint, Y41.a<G0> aVar) {
        this.f305225b = g0Var;
        this.f305226c = avitoMapPoint;
        this.f305227d = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                ((g0.a) this.f305227d).invoke();
                return;
            }
            return;
        }
        AvitoMapPoint avitoMapPoint = this.f305226c;
        g0 g0Var = this.f305225b;
        g0Var.getClass();
        g0Var.f305200c0.postValue(new AbstractC35292b.a(avitoMapPoint));
        g0Var.f305210m0 = avitoMapPoint;
        com.avito.android.beduin_shared.model.utils.a.a(g0Var.f305186O, ((uG0.d) ((TypedResult.Success) typedResult).getResult()).a());
        g0Var.me();
    }
}
