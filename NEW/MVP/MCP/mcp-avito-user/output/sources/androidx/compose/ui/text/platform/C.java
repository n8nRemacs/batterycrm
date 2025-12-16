package androidx.compose.ui.text.platform;

import android.text.style.URLSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.A0;
import androidx.compose.ui.text.C;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.InterfaceC22677y;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: URLSpanCache.android.kt */
@P
@InterfaceC22677y
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/platform/C;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WeakHashMap<A0, URLSpan> f42545a = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WeakHashMap<C22602e.C1684e<C.b>, URLSpan> f42546b = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WeakHashMap<C22602e.C1684e<androidx.compose.ui.text.C>, s> f42547c = new WeakHashMap<>();
}
