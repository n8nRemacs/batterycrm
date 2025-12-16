package org.koin.androidx.scope;

import androidx.view.M0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import org.koin.core.logger.Level;
import s71.AbstractC48011b;

/* compiled from: ScopeHandlerViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/koin/androidx/scope/r;", "Landroidx/lifecycle/M0;", "<init>", "()V", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class r extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public org.koin.core.scope.a f421423E;

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        org.koin.core.scope.a aVar = this.f421423E;
        if (aVar != null && !aVar.f421479i) {
            AbstractC48011b abstractC48011b = aVar.f421474d.f419399c;
            String str = "Closing scope " + this.f421423E;
            Level level = Level.f421465b;
            if (abstractC48011b.b(level)) {
                abstractC48011b.a(level, str);
            }
            aVar.a();
        }
        this.f421423E = null;
    }
}
