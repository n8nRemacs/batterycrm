package com.avito.android.navigation.compose;

import Y41.l;
import android.content.Context;
import androidx.view.C23060r0;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DaggerComponentHolder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAc/b;", "T", "Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/navigation/compose/e;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/navigation/compose/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements l<C23060r0, e<Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l<Context, Object> f207200l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f207201m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, l lVar) {
        super(1);
        this.f207200l = lVar;
        this.f207201m = context;
    }

    @Override // Y41.l
    public final e<Object> invoke(C23060r0 c23060r0) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Ac.b bVar = (Ac.b) this.f207200l.invoke(this.f207201m);
        bVar.g1().a(fA2.b());
        return new e<>(bVar);
    }
}
