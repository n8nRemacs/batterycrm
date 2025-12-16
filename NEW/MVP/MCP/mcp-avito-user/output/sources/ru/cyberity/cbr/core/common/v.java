package ru.cyberity.cbr.core.common;

import android.os.SystemClock;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DebouncedClickListener.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/view/View;", "Lkotlin/Function0;", "Lkotlin/G0;", "action", "a", "(Landroid/view/View;LY41/a;)V", "", "b", "J", "lastClick", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    private static long f432840b;

    public static final void a(@Y61.k View view, @Y61.k Y41.a<G0> aVar) {
        view.setOnClickListener(new ru.avito.component.payments.method.b(2, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y41.a aVar, View view) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f432840b >= 400) {
            f432840b = jElapsedRealtime;
            aVar.invoke();
        }
    }
}
