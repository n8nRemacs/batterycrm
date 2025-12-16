package ru.rustore.sdk.core.tasks;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes9.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f436791l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Throwable f436792m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, Throwable th2) {
        super(0);
        this.f436791l = aVar;
        this.f436792m = th2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f436791l.f436773a.a(this.f436792m);
        return G0.f406611a;
    }
}
