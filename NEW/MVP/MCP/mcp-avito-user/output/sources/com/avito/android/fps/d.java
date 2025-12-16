package com.avito.android.fps;

import android.view.Window;
import com.avito.android.lib.design.bottom_sheet.d;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: FramesListener.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "Lcom/avito/android/lib/design/bottom_sheet/d$b;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f158624b;

    public d(e eVar) {
        this.f158624b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) q12.f406619b;
        d.b bVar = (d.b) q12.f406620c;
        boolean zF2 = L.f(bVar, d.b.a.f178533a);
        e eVar = this.f158624b;
        if (!zF2) {
            if (L.f(bVar, d.b.C5259b.f178534a)) {
                eVar.f158630f.remove(dVar);
                return;
            }
            return;
        }
        Window window = dVar.getWindow();
        if (window == null) {
            return;
        }
        eVar.getClass();
        androidx.metrics.performance.f fVar = null;
        if (window.peekDecorView() != null) {
            com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c cVar = new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(eVar, 21);
            androidx.metrics.performance.f.f52702e.getClass();
            fVar = new androidx.metrics.performance.f(window, cVar, null);
        }
        if (fVar == null) {
            return;
        }
        eVar.f158630f.put(dVar, fVar);
    }
}
