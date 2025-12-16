package com.avito.android.favorites.ux_feedback;

import Y61.k;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: FavoritesFeedbackHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/ux_feedback/f;", "Lcom/avito/android/favorites/ux_feedback/b;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f157554a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.b<Boolean> f157555b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.b<Boolean> f157556c;

    @Inject
    public f(@k SK0.b bVar) {
        this.f157554a = bVar;
        Boolean bool = Boolean.FALSE;
        this.f157555b = io.reactivex.rxjava3.subjects.b.O0(bool);
        this.f157556c = io.reactivex.rxjava3.subjects.b.O0(bool);
    }

    @Override // com.avito.android.favorites.ux_feedback.b
    @k
    public final C41936b0 a() {
        G g12 = new G(new VH0.c(this, 16));
        z zVarK = z.k(this.f157555b, this.f157556c, new l41.c() { // from class: com.avito.android.favorites.ux_feedback.c
            @Override // l41.c
            public final Object apply(Object obj, Object obj2) {
                return new Q((Boolean) obj, (Boolean) obj2);
            }
        });
        zVarK.getClass();
        return new C41936b0(zVarK.D(io.reactivex.rxjava3.internal.functions.a.f401991a).N(d.f157552b), new e(g12));
    }

    @Override // com.avito.android.favorites.ux_feedback.b
    public final void b(boolean z12) {
        this.f157556c.onNext(Boolean.valueOf(z12));
    }

    @Override // com.avito.android.favorites.ux_feedback.b
    public final void c(boolean z12) {
        this.f157555b.onNext(Boolean.valueOf(z12));
    }
}
