package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import kotlin.Metadata;

/* compiled from: WeakCache.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/E2;", "T", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E2<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<Reference<T>> f41108a = new androidx.compose.runtime.collection.e<>(new Reference[16], 0);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ReferenceQueue<T> f41109b = new ReferenceQueue<>();
}
