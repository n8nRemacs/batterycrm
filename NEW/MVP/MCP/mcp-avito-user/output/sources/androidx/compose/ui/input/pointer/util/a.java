package androidx.compose.ui.input.pointer.util;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: VelocityTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/util/a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final VelocityTracker1D f40303a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final VelocityTracker1D f40304b;

    /* renamed from: c, reason: collision with root package name */
    public long f40305c;

    public a() {
        VelocityTracker1D.Strategy strategy = VelocityTracker1D.Strategy.f40299b;
        this.f40303a = new VelocityTracker1D(false, strategy, 1, null);
        this.f40304b = new VelocityTracker1D(false, strategy, 1, null);
        g.f413384b.getClass();
    }
}
