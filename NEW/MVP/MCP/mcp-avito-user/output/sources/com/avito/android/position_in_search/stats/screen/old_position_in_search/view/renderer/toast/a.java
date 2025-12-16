package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast;

import PK0.n;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.view.C22833m0;
import arrow.core.AbstractC23662a;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ToastRenderer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/a;", "", "a", "b", "c", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f221235i = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f221236a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f221237b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f221238c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f221239d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f221240e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f221241f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public ToastState f221242g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public com.avito.android.lib.design.toast_bar.k f221243h;

    /* compiled from: ToastRenderer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/a$a;", "", "<init>", "()V", "", "INFO_TOAST_DURATION", "I", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.a$a, reason: collision with other inner class name */
    public static final class C6691a {
        public /* synthetic */ C6691a(C42822w c42822w) {
            this();
        }

        public C6691a() {
        }
    }

    /* compiled from: ToastRenderer.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/a$b;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.util.text.a f221244a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ScreenPerformanceTracker f221245b;

        @Inject
        public b(@Y61.k com.avito.android.util.text.a aVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
            this.f221244a = aVar;
            this.f221245b = screenPerformanceTracker;
        }
    }

    /* compiled from: ToastRenderer.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/a$c;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ToastState f221246a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final HV.a f221247b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ToastBarState f221248c;

        public c(@Y61.k ToastState toastState, @Y61.k HV.a aVar, @Y61.k ToastBarState toastBarState) {
            this.f221246a = toastState;
            this.f221247b = aVar;
            this.f221248c = toastBarState;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f221246a, cVar.f221246a) && L.f(this.f221247b, cVar.f221247b) && L.f(this.f221248c, cVar.f221248c);
        }

        public final int hashCode() {
            return this.f221248c.hashCode() + ((this.f221247b.hashCode() + (this.f221246a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ToastBarStateWrapper(toastState=" + this.f221246a + ", style=" + this.f221247b + ", state=" + this.f221248c + ')';
        }
    }

    /* compiled from: ToastRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[ToastState.Style.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToastState.Style style = ToastState.Style.f221200b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ToastState.Duration.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ToastState.Duration duration = ToastState.Duration.f221196b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        new C6691a(null);
    }

    public a(View view, com.avito.android.util.text.a aVar, ScreenPerformanceTracker screenPerformanceTracker, C42822w c42822w) {
        this.f221236a = view;
        this.f221237b = aVar;
        this.f221238c = screenPerformanceTracker;
        Context context = view.getContext();
        this.f221239d = context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f221240e = C42727D.b(lazyThreadSafetyMode, new g(this));
        this.f221241f = C42727D.b(lazyThreadSafetyMode, new f(this));
        this.f221242g = ToastState.b.f221204a;
        this.f221243h = new com.avito.android.lib.design.toast_bar.k(context, null, 0, 6, null);
    }

    public static void e(Iterator it, Y41.l lVar, Y41.l lVar2, Y41.l lVar3) {
        while (it.hasNext()) {
            View view = (View) it.next();
            int id2 = view.getId();
            if (id2 == R.id.position_in_search_stats_toast_bar_title) {
                lVar3.invoke((TextView) view);
            } else if (id2 == R.id.position_in_search_stats_toast_bar_close_icon) {
                lVar2.invoke((TextView) view);
            } else if (id2 == R.id.position_in_search_stats_toast_bar_refresh_button) {
                lVar.invoke((Button) view);
            }
            if (view instanceof ViewGroup) {
                e(new C22833m0((ViewGroup) view), lVar, lVar2, lVar3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.C] */
    public final c a(ToastState toastState, Y41.l<? super Button, G0> lVar, Y41.l<? super TextView, G0> lVar2, Y41.l<? super TextView, G0> lVar3, Y41.a<G0> aVar, int i12, ToastBarState.State state) {
        HV.a aVar2;
        int iOrdinal = toastState.getF221232d().ordinal();
        if (iOrdinal == 0) {
            aVar2 = (HV.a) this.f221240e.getValue();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2 = (HV.a) this.f221241f.getValue();
        }
        Context context = this.f221239d;
        Button buttonB = IV.a.b(aVar2, context.getString(R.string.position_in_search_stats_error_refresh), context, null);
        buttonB.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        buttonB.setId(R.id.position_in_search_stats_toast_bar_refresh_button);
        D6.c(buttonB, null, Integer.valueOf(y6.b(6)), null, null, 13);
        List listSingletonList = Collections.singletonList(buttonB);
        e(listSingletonList.iterator(), lVar, lVar2, lVar3);
        LinearLayout linearLayout = new LinearLayout(context, null, 0, 0);
        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        com.avito.android.lib.design.text_view.a aVar3 = new com.avito.android.lib.design.text_view.a(this.f221239d, null, 0, 0, 14, null);
        aVar3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        aVar3.setId(R.id.position_in_search_stats_toast_bar_title);
        n nVar = aVar2.f7104d;
        if (nVar != null) {
            com.avito.android.lib.design.text_view.e.a(aVar3, nVar);
        }
        linearLayout.addView(aVar3);
        com.avito.android.lib.design.text_view.a aVar4 = new com.avito.android.lib.design.text_view.a(this.f221239d, null, 0, 0, 14, null);
        aVar4.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        aVar4.setClickable(true);
        aVar4.setFocusable(true);
        aVar4.setId(R.id.position_in_search_stats_toast_bar_close_icon);
        if (nVar != null) {
            com.avito.android.lib.design.text_view.e.a(aVar4, nVar);
        }
        FV.a.f4720a.getClass();
        FV.a.c(aVar4, R.attr.textIconClose);
        linearLayout.addView(aVar4);
        List listSingletonList2 = Collections.singletonList(linearLayout);
        e(listSingletonList2.iterator(), lVar, lVar2, lVar3);
        return new c(toastState, aVar2, new ToastBarState(com.avito.android.printable_text.b.f(""), this.f221236a, ToastBarPosition.f181044b, listSingletonList2, listSingletonList, null, null, i12, false, true, aVar, state, 352, null));
    }

    public final void b(@Y61.k ToastState toastState) {
        int i12;
        c cVarA;
        if (!L.f(this.f221242g.getF221229a(), toastState.getF221229a())) {
            com.avito.android.lib.design.toast_bar.k kVar = this.f221243h;
            ToastState toastState2 = this.f221242g;
            ToastBarState.State state = ToastBarState.State.f181136c;
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.b bVar = com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.b.f221249l;
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.c cVar = com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.c.f221250l;
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.d dVar = com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.d.f221251l;
            e eVar = e.f221252l;
            c(kVar, a(toastState2, bVar, cVar, dVar, eVar, 1500, state));
            com.avito.android.lib.design.toast_bar.k kVar2 = new com.avito.android.lib.design.toast_bar.k(this.f221239d, null, 0, 6, null);
            if (toastState instanceof ToastState.b) {
                cVarA = a(toastState, bVar, cVar, dVar, eVar, 1500, state);
            } else {
                i iVar = new i(toastState);
                j jVar = new j(toastState);
                k kVar3 = new k(this, toastState);
                l lVar = new l(toastState);
                int iOrdinal = toastState.getF221233e().ordinal();
                if (iOrdinal == 0) {
                    i12 = 3000;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = -1;
                }
                cVarA = a(toastState, iVar, jVar, kVar3, lVar, i12, ToastBarState.State.f181135b);
            }
            c(kVar2, cVarA);
            this.f221243h = kVar2;
        }
        this.f221242g = toastState;
    }

    public final void c(com.avito.android.lib.design.toast_bar.k kVar, c cVar) {
        kVar.setStyle(cVar.f221247b);
        kVar.setState(cVar.f221248c);
        ToastState toastState = cVar.f221246a;
        if (toastState instanceof ToastState.d) {
            this.f221238c.F(d(((ToastState.d) toastState).f221214b).k0(this.f221239d), new AbstractC23662a.c(((ToastState.d) toastState).f221216d), false);
        }
    }

    public final PrintableText d(ToastState.f fVar) {
        if (!(fVar instanceof ToastState.f.a)) {
            if (fVar instanceof ToastState.f.b) {
                return ((ToastState.f.b) fVar).f221228a;
            }
            throw new NoWhenBranchMatchedException();
        }
        CharSequence charSequenceC = this.f221237b.c(this.f221239d, ((ToastState.f.a) fVar).f221227a);
        if (charSequenceC == null) {
            charSequenceC = "";
        }
        return com.avito.android.printable_text.b.e(charSequenceC);
    }
}
