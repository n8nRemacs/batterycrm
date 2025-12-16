package androidx.compose.ui;

import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: MotionDurationScale.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/x;", "Lkotlin/coroutines/CoroutineContext$Element;", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface x extends CoroutineContext.Element {

    /* renamed from: z1, reason: collision with root package name */
    @Y61.k
    public static final b f43131z1 = b.f43132b;

    /* compiled from: MotionDurationScale.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: MotionDurationScale.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/x$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/ui/x;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements CoroutineContext.Key<x> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f43132b = new b();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @Y61.k
    default CoroutineContext.Key<?> getKey() {
        return f43131z1;
    }

    float getScaleFactor();
}
