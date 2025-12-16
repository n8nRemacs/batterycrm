package com.avito.android.ui.status_bar;

import android.content.Context;
import android.view.Window;
import androidx.core.view.L0;
import com.avito.android.lib.design.bottom_sheet.d;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: StatusBarUpdatesHandlerImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "Lcom/avito/android/lib/design/bottom_sheet/d$b;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f304671b;

    public g(h hVar) {
        this.f304671b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) q12.f406619b;
        if (L.f((d.b) q12.f406620c, d.b.a.f178533a) && !(dVar instanceof com.avito.android.lib.design.bottom_sheet.h)) {
            h hVar = this.f304671b;
            Window window = dVar.getWindow();
            if (window == null) {
                return;
            }
            Context context = dVar.getContext();
            new L0(window, window.getDecorView()).e(com.avito.android.lib.util.darkTheme.d.a(hVar.f304675d.f304649a, com.avito.android.lib.util.darkTheme.c.a(context)));
        }
    }
}
