package com.avito.android.extended_profile_ui_components;

import android.view.View;
import arrow.core.AbstractC23662a;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.K5;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ExtendedProfileToastBarFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/p;", "", "<init>", "()V", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final p f153373a = new p();

    /* compiled from: ExtendedProfileToastBarFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f153374l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f153374l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f153374l.invoke();
            return G0.f406611a;
        }
    }

    @Y61.k
    public static j a(@Y61.l String str, @Y61.k Throwable th2) {
        Q q12;
        if (K5.e(th2)) {
            q12 = new Q(com.avito.android.printable_text.b.c(R.string.error_toast_network_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_toast_network_action, new Serializable[0]));
        } else if (str == null || C43066x.K(str)) {
            q12 = new Q(com.avito.android.printable_text.b.c(R.string.error_toast_without_id_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_toast_without_id_action, new Serializable[0]));
        } else {
            if (str == null) {
                str = "";
            }
            q12 = new Q(com.avito.android.printable_text.b.c(R.string.error_toast_with_id_title, str), com.avito.android.printable_text.b.c(R.string.error_toast_with_id_action, new Serializable[0]));
        }
        return new j((PrintableText) q12.f406619b, (PrintableText) q12.f406620c);
    }

    public static void b(@Y61.k View view, @Y61.k Throwable th2, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.l PrintableText printableText, @Y61.l Y41.a aVar) {
        List listSingletonList;
        j jVarA = a(screenPerformanceTracker.o(new AbstractC23662a.b(th2)).f90898b, th2);
        if (aVar != null) {
            listSingletonList = Collections.singletonList(new c.a.C3719a(jVarA.f153350b.k0(view.getContext()), true, null, new a(aVar), 4, null));
        } else {
            listSingletonList = C42784z0.f406748b;
        }
        List list = listSingletonList;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableText2 = printableText == null ? jVarA.f153349a : printableText;
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.e(cVar, view, printableText2, null, list, null, f.c.a.a(null, th2), 0, ToastBarPosition.f181046d, false, true, null, null, screenPerformanceTracker, 3498);
    }

    public static /* synthetic */ void c(p pVar, View view, Throwable th2, ScreenPerformanceTracker screenPerformanceTracker, Y41.a aVar) {
        pVar.getClass();
        b(view, th2, screenPerformanceTracker, null, aVar);
    }
}
