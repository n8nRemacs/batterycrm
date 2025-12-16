package kotlinx.coroutines.android;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.r;

/* compiled from: Runnable.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "kotlinx/coroutines/n1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f410758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f410759c;

    public d(r rVar, f fVar) {
        this.f410758b = rVar;
        this.f410759c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f410758b.B(this.f410759c, G0.f406611a);
    }
}
