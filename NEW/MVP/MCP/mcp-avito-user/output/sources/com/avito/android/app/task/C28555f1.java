package com.avito.android.app.task;

import com.avito.android.C30277e1;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: PendingMessageHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.f1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28555f1 extends kotlin.jvm.internal.N implements Y41.a<Long> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91595l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28555f1(C28582o1 c28582o1) {
        super(0);
        this.f91595l = c28582o1;
    }

    @Override // Y41.a
    public final Long invoke() {
        long jB2;
        C30277e1 c30277e1 = this.f91595l.f91678k;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[5];
        Long lZ02 = C43066x.z0((String) c30277e1.f145013g.a().invoke());
        if (lZ02 != null) {
            jB2 = kotlin.ranges.s.b(TimeUnit.SECONDS.toMillis(lZ02.longValue()), 5000L);
        } else {
            jB2 = 3600000;
        }
        return Long.valueOf(jB2);
    }
}
