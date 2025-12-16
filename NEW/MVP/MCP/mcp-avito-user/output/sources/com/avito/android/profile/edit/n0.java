package com.avito.android.profile.edit;

import kotlin.Metadata;

/* compiled from: SaveProfileInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/Profile;", "it", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Lcom/avito/android/remote/model/Profile;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class n0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f222229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f222230c;

    public n0(t0 t0Var, String str) {
        this.f222229b = t0Var;
        this.f222230c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        t0 t0Var = this.f222229b;
        return t0Var.f222299a.B(this.f222230c, false).x0(t0Var.f222302d.a()).d0(j0.f222218b).m0(k0.f222220b);
    }
}
