package kotlinx.coroutines.rx3;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.rx3.C43280c;

/* compiled from: Runnable.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "kotlinx/coroutines/n1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.rx3.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC43279b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43280c.a f412077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f412078c;

    public RunnableC43279b(C43280c.a aVar, Y41.l lVar) {
        this.f412077b = aVar;
        this.f412078c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f412077b.f412083e.w(this.f412078c);
    }
}
