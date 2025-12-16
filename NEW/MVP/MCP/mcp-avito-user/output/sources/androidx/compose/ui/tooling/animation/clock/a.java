package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.AbstractC20330x;
import androidx.compose.animation.core.C20285h1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.tooling.animation.C22680a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AnimateXAsStateClock.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/a;", "T", "Landroidx/compose/animation/core/x;", "V", "Landroidx/compose/ui/tooling/animation/clock/e;", "Landroidx/compose/ui/tooling/animation/a;", "LA0/c;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a<T, V extends AbstractC20330x> implements e<C22680a<T, V>, A0.c<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final T f42782a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C20285h1<T, V> f42783b;

    public a(@Y61.k C22680a<T, V> c22680a) {
        c22680a.f42774c.f();
        c22680a.f42774c.f();
        c22680a.f42772a.getClass();
        throw null;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.e
    public final long a() {
        long f26065h = this.f42783b.getF26065h();
        List<String> list = k.f42788a;
        return (f26065h + 999999) / 1000000;
    }
}
