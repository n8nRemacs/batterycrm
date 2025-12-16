package kotlinx.coroutines.selects;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Runnable.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "kotlinx/coroutines/n1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.selects.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC43301a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f412198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f412199c;

    public RunnableC43301a(r rVar, c cVar) {
        this.f412198b = rVar;
        this.f412199c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f412198b.e(this.f412199c, G0.f406611a);
    }
}
