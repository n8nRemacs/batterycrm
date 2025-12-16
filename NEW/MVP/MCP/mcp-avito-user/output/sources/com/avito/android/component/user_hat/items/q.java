package com.avito.android.component.user_hat.items;

import com.avito.android.component.user_hat.PassportProfileAddItem;
import com.avito.android.component.user_hat.e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Add.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class q extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f125351l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PassportProfileAddItem f125352m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, PassportProfileAddItem passportProfileAddItem) {
        super(0);
        this.f125351l = rVar;
        this.f125352m = passportProfileAddItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f125351l.f125353b.accept(new e.a(this.f125352m.f125280b));
        return G0.f406611a;
    }
}
