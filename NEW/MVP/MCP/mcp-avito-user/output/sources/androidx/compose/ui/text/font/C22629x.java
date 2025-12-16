package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.D;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/x;", "Landroidx/compose/ui/text/font/m0;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22629x implements m0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D.b f42322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f42323b = new Object();

    public C22629x(@Y61.k D.b bVar) {
        this.f42322a = bVar;
    }

    @Override // androidx.compose.ui.text.font.m0
    @Y61.l
    public final Object a(@Y61.k D d12, @Y61.k Continuation<Object> continuation) {
        return this.f42322a.a(d12);
    }

    @Override // androidx.compose.ui.text.font.m0
    @Y61.k
    public final Object b(@Y61.k D d12) {
        return this.f42322a.a(d12);
    }

    @Override // androidx.compose.ui.text.font.m0
    @Y61.k
    /* renamed from: getCacheKey, reason: from getter */
    public final Object getF42323b() {
        return this.f42323b;
    }
}
