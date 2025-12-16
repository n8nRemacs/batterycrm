package com.avito.android.passport_lib;

import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: PassportProfileIconTypeInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "passportEnabled", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/passport_lib/u;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f213915b;

    public d(e eVar) {
        this.f213915b = eVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? this.f213915b.f213917b.get().f().r(c.f213914b).t(io.reactivex.rxjava3.internal.functions.a.g(new b())) : I.q(new u(false, null, 2, null));
    }
}
