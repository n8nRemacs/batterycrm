package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.auto_select.FromPage;
import com.avito.android.cyclic_gallery_widget.image_carousel.ActionType;
import hc.C40912b;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BindActionsTracker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/regular/f0;", "Lcom/avito/android/serp/adapter/rich_snippets/regular/e0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f0 implements e0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f271169b;

    /* compiled from: BindActionsTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f271170a;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                ActionType actionType = ActionType.f131985d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f271170a = iArr;
        }
    }

    public f0(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f271169b = interfaceC28373a;
    }

    public final void a(@Y61.k String str, @Y61.k Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            com.avito.android.cyclic_gallery_widget.image_carousel.a aVar = (com.avito.android.cyclic_gallery_widget.image_carousel.a) it.next();
            if (a.f271170a[aVar.f131993a.ordinal()] == 1) {
                C40912b.f397290g.getClass();
                this.f271169b.c(new C40912b(str, FromPage.f90015e, aVar.f131994b, null, 8, null));
            }
        }
    }
}
