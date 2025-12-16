package com.avito.android.update;

import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.internal.operators.observable.Z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UpdateApplicationPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/update/f;", "Lcom/avito/android/update/c;", "<init>", "()V", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public i f306647a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public UpdateApplicationActivity f306648b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f306649c = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public f() {
    }

    @Override // com.avito.android.update.c
    public final void a(@Y61.k i iVar) {
        this.f306647a = iVar;
        this.f306649c.b(new Z(com.avito.android.lib.deprecated_design.button.g.a(iVar.f306654d), new d(this)).v(new com.avito.android.advert_core.task.a(10), new e(this)));
    }

    @Override // com.avito.android.update.c
    public final void b(@Y61.k UpdateApplicationActivity updateApplicationActivity) {
        this.f306648b = updateApplicationActivity;
    }

    @Override // com.avito.android.update.c
    public final void c0() {
        this.f306648b = null;
    }

    @Override // com.avito.android.update.c
    public final void e0() {
        this.f306649c.e();
        this.f306647a = null;
    }
}
