package com.avito.android.vas_performance.ui.visual_legacy;

import kotlin.Metadata;
import kotlin.jvm.internal.Y;

/* compiled from: VisualVasViewModelImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class r extends Y {

    /* renamed from: b, reason: collision with root package name */
    public static final r f322170b = new r();

    public r() {
        super(com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a.class, "selected", "getSelected()Z", 0);
    }

    @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
    public final void e(@Y61.l Object obj, @Y61.l Object obj2) {
        ((com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) obj).f321824j = ((Boolean) obj2).booleanValue();
    }

    @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
    @Y61.l
    public final Object get(@Y61.l Object obj) {
        return Boolean.valueOf(((com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.a) obj).f321824j);
    }
}
