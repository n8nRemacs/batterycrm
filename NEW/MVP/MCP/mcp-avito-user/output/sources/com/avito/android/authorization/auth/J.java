package com.avito.android.authorization.auth;

import com.avito.android.credman.f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AuthPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/credman/f$a;", "credentials", "Lkotlin/G0;", "accept", "(Lcom/avito/android/credman/f$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class J<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f92860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f92861c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AuthFragment f92862d;

    public J(Y41.a aVar, A a12, AuthFragment authFragment) {
        this.f92860b = aVar;
        this.f92861c = a12;
        this.f92862d = authFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        f.a aVar = (f.a) obj;
        if (aVar instanceof f.a.C3825a) {
            ((L) this.f92860b).invoke();
        } else if (aVar instanceof f.a.b) {
            this.f92861c.f92792u = FastLoginState.f92854d;
            f.a.b bVar = (f.a.b) aVar;
            this.f92862d.H5(bVar.f129088a, bVar.f129089b);
        }
    }
}
