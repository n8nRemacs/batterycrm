package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: TextToolbar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/o2;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22509o2 {

    /* compiled from: TextToolbar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.o2$a */
    public static final class a {
    }

    void a(@Y61.k l0.j jVar, @Y61.l Y41.a<kotlin.G0> aVar, @Y61.l Y41.a<kotlin.G0> aVar2, @Y61.l Y41.a<kotlin.G0> aVar3, @Y61.l Y41.a<kotlin.G0> aVar4);

    default void b(@Y61.k l0.j jVar, @Y61.l Y41.a<kotlin.G0> aVar, @Y61.l Y41.a<kotlin.G0> aVar2, @Y61.l Y41.a<kotlin.G0> aVar3, @Y61.l Y41.a<kotlin.G0> aVar4, @Y61.l Y41.a<kotlin.G0> aVar5) {
        a(jVar, aVar, aVar2, aVar3, aVar4);
    }

    @Y61.k
    TextToolbarStatus getStatus();

    void hide();
}
