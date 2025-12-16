package ru.cyberity.cbr.core.presentation.screen.base;

import Y61.k;
import Y61.l;
import androidx.view.C23060r0;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: StateHandleDelegate.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\r\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\r\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/base/a;", "T", "", "Landroidx/lifecycle/r0;", "savedStateHandle", "", "key", "default", "<init>", "(Landroidx/lifecycle/r0;Ljava/lang/String;Ljava/lang/Object;)V", "thisRef", "Lkotlin/reflect/n;", "property", "a", "(Ljava/lang/Object;Lkotlin/reflect/n;)Ljava/lang/Object;", "value", "Lkotlin/G0;", "(Ljava/lang/Object;Lkotlin/reflect/n;Ljava/lang/Object;)V", "Landroidx/lifecycle/r0;", "b", "Ljava/lang/String;", "c", "Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final C23060r0 savedStateHandle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final String key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final T default;

    public a(@k C23060r0 c23060r0, @k String str, T t12) {
        this.savedStateHandle = c23060r0;
        this.key = str;
        this.default = t12;
    }

    public final T a(@l Object thisRef, @k n<?> property) {
        T t12 = (T) this.savedStateHandle.b(this.key);
        return t12 == null ? this.default : t12;
    }

    public final void a(@l Object thisRef, @k n<?> property, T value) {
        this.savedStateHandle.e(value, this.key);
    }
}
