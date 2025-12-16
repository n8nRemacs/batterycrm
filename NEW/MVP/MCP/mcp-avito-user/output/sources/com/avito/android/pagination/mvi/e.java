package com.avito.android.pagination.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import r50.AbstractC47494b;
import r50.c;

/* compiled from: PaginationActor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class e extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r50.c<r50.d> f210582l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r50.c<r50.d> cVar) {
        super(0);
        this.f210582l = cVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        r50.c<r50.d> cVar = this.f210582l;
        return Boolean.valueOf((cVar instanceof c.b) && (com.avito.android.pagination.b.a(cVar).f429605d instanceof AbstractC47494b.a) && !com.avito.android.pagination.b.a(cVar).f429603b);
    }
}
