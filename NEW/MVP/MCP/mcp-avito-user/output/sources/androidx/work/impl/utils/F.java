package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import kotlin.Metadata;

/* compiled from: StatusRunnable.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class F extends kotlin.jvm.internal.N implements Y41.a<Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f55936l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f55937m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(Y41.l<? super WorkDatabase, Object> lVar, WorkDatabase workDatabase) {
        super(0);
        this.f55936l = (kotlin.jvm.internal.N) lVar;
        this.f55937m = workDatabase;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final Object invoke() {
        return this.f55936l.invoke(this.f55937m);
    }
}
