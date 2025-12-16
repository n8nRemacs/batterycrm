package com.avito.android.component.toast;

import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.app.r;
import androidx.fragment.app.Fragment;
import arrow.core.AbstractC23662a;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.body_condition.h;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.c;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.V2;
import j.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ToastBarFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/component/toast/c;", "", "<init>", "()V", "a", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f125244a = new c();

    /* compiled from: ToastBarFactory.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/component/toast/c$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/component/toast/c$a$a;", "Lcom/avito/android/component/toast/c$a$b;", "Lcom/avito/android/component/toast/c$a$c;", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: ToastBarFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/toast/c$a$a;", "Lcom/avito/android/component/toast/c$a;", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.component.toast.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C3719a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f125245a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f125246b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f125247c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final Y41.a<G0> f125248d;

            public /* synthetic */ C3719a(String str, boolean z12, String str2, Y41.a aVar, int i12, C42822w c42822w) {
                this(aVar, str, (i12 & 4) != 0 ? null : str2, (i12 & 2) != 0 ? false : z12);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3719a)) {
                    return false;
                }
                C3719a c3719a = (C3719a) obj;
                return L.f(this.f125245a, c3719a.f125245a) && this.f125246b == c3719a.f125246b && L.f(this.f125247c, c3719a.f125247c) && L.f(this.f125248d, c3719a.f125248d);
            }

            public final int hashCode() {
                int i12 = r.i(this.f125245a.hashCode() * 31, 31, this.f125246b);
                String str = this.f125247c;
                return this.f125248d.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(text=");
                sb2.append(this.f125245a);
                sb2.append(", shouldCloseOnAction=");
                sb2.append(this.f125246b);
                sb2.append(", style=");
                sb2.append(this.f125247c);
                sb2.append(", onActionClicked=");
                return r.v(sb2, this.f125248d, ')');
            }

            public C3719a(@k Y41.a aVar, @k String str, @l String str2, boolean z12) {
                super(null);
                this.f125245a = str;
                this.f125246b = z12;
                this.f125247c = str2;
                this.f125248d = aVar;
            }
        }

        /* compiled from: ToastBarFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/toast/c$a$b;", "Lcom/avito/android/component/toast/c$a;", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final View f125249a;

            public b(@k View view) {
                super(null);
                this.f125249a = view;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f125249a, ((b) obj).f125249a);
            }

            public final int hashCode() {
                return this.f125249a.hashCode();
            }

            @k
            public final String toString() {
                return "Custom(view=" + this.f125249a + ')';
            }
        }

        /* compiled from: ToastBarFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/toast/c$a$c;", "Lcom/avito/android/component/toast/c$a;", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.component.toast.c$a$c, reason: collision with other inner class name */
        public static final /* data */ class C3720c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f125250a;

            public C3720c(@U int i12) {
                super(null);
                this.f125250a = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3720c) && this.f125250a == ((C3720c) obj).f125250a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f125250a);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("Spacer(size="), this.f125250a, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @k
    public static com.avito.android.lib.design.toast_bar.k a(@k View view, @k PrintableText printableText, @l List list, @l List list2, @l FrameLayout frameLayout, @k f fVar, int i12, @k ToastBarPosition toastBarPosition, @l Integer num, boolean z12, boolean z13, @l i.b bVar, @l Context context, @l ScreenPerformanceTracker screenPerformanceTracker) {
        int i13;
        Context context2 = context == null ? view.getContext() : context;
        boolean z14 = fVar instanceof f.c;
        if (z14 && toastBarPosition == ToastBarPosition.f181047e) {
            V2.f318762a.f(new IllegalArgumentException("Error toast must be shown on top of the screen.\nFor details see: https://www.figma.com/file/ijwUrqgP3X7rMP9vKzGPjg/%5BCurrent%5D-Guidelines?node-id=5854%3A47647"));
        }
        if (L.f(fVar, f.a.f125253a)) {
            i13 = R.attr.toastBarDefault;
        } else if (z14) {
            i13 = R.attr.toastBarError;
        } else {
            if (!L.f(fVar, f.b.f125254a)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = R.attr.toastBarDefaultInverse;
        }
        AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662aInvoke = null;
        com.avito.android.lib.design.toast_bar.k kVar = new com.avito.android.lib.design.toast_bar.k(context2, null, i13);
        kVar.setText(printableText.Y4(context2));
        kVar.setAnchorView(view);
        kVar.setContainerView(frameLayout);
        kVar.setDuration(i12);
        kVar.setPosition(toastBarPosition);
        kVar.setSwipeEnabled(z12);
        kVar.setForceVerticalLayout(z13);
        kVar.setDismissListener(bVar);
        kVar.setCustomPosition(num);
        c cVar = f125244a;
        if (list != null) {
            cVar.getClass();
            kVar.l(f(list, context2, kVar));
        }
        if (list2 != null) {
            cVar.getClass();
            ArrayList arrayListF = f(list2, context2, kVar);
            ViewGroup rightItemContainer = kVar.getRightItemContainer();
            Iterator it = arrayListF.iterator();
            while (it.hasNext()) {
                rightItemContainer.addView((View) it.next());
            }
        }
        com.avito.android.lib.design.toast_bar.c.f181064a.getClass();
        c.a.f181066b.a(kVar);
        f.c cVar2 = z14 ? (f.c) fVar : null;
        if (cVar2 != null) {
            d dVar = d.f125251l;
            e eVar = e.f125252l;
            ApiError apiError = cVar2.f125257b;
            if (apiError != null) {
                abstractC23662aInvoke = eVar.invoke(apiError);
            } else {
                Throwable th2 = cVar2.f125256a;
                if (th2 != null) {
                    abstractC23662aInvoke = dVar.invoke(th2);
                }
            }
            abstractC23662aInvoke = abstractC23662aInvoke;
        }
        if (screenPerformanceTracker == null || abstractC23662aInvoke == null) {
            g gVar = g.f125258a;
            String strK0 = printableText.k0(context2);
            gVar.getClass();
            g.b(strK0, fVar);
        } else {
            screenPerformanceTracker.F(printableText.k0(context2), abstractC23662aInvoke, false);
        }
        return kVar;
    }

    public static com.avito.android.lib.design.toast_bar.k b(c cVar, View view, PrintableText printableText, List list, List list2, FrameLayout frameLayout, f fVar, int i12, ToastBarPosition toastBarPosition, Integer num, boolean z12, boolean z13, i.b bVar, Context context, int i13) {
        ToastBarPosition toastBarPosition2;
        List list3 = (i13 & 2) != 0 ? null : list;
        List list4 = (i13 & 4) != 0 ? null : list2;
        FrameLayout frameLayout2 = (i13 & 8) != 0 ? null : frameLayout;
        f fVar2 = (i13 & 16) != 0 ? f.a.f125253a : fVar;
        int i14 = (i13 & 32) != 0 ? 2750 : i12;
        if ((i13 & 64) != 0) {
            toastBarPosition2 = fVar2 instanceof f.c ? ToastBarPosition.f181046d : ToastBarPosition.f181047e;
        } else {
            toastBarPosition2 = toastBarPosition;
        }
        Integer num2 = (i13 & 128) != 0 ? null : num;
        boolean z14 = (i13 & 256) != 0 ? true : z12;
        boolean z15 = (i13 & 512) != 0 ? false : z13;
        i.b bVar2 = (i13 & 1024) != 0 ? null : bVar;
        Context context2 = (i13 & 2048) != 0 ? null : context;
        cVar.getClass();
        return a(view, printableText, list3, list4, frameLayout2, fVar2, i14, toastBarPosition2, num2, z14, z15, bVar2, context2, null);
    }

    public static com.avito.android.lib.design.toast_bar.k c(c cVar, Fragment fragment, PrintableText printableText, List list, List list2, f fVar, int i12, ToastBarPosition toastBarPosition, int i13) {
        List list3 = (i13 & 2) != 0 ? null : list;
        List list4 = (i13 & 4) != 0 ? null : list2;
        f fVar2 = (i13 & 16) != 0 ? f.a.f125253a : fVar;
        int i14 = (i13 & 32) != 0 ? 2750 : i12;
        ToastBarPosition toastBarPosition2 = (i13 & 64) != 0 ? ToastBarPosition.f181047e : toastBarPosition;
        cVar.getClass();
        return b(cVar, fragment.requireView(), printableText, list3, list4, null, fVar2, i14, toastBarPosition2, null, true, false, null, null, 2176);
    }

    public static com.avito.android.lib.design.toast_bar.k d(c cVar, com.avito.android.lib.design.bottom_sheet.d dVar, PrintableText printableText, List list, f fVar, int i12, ToastBarPosition toastBarPosition, int i13) {
        List list2 = (i13 & 4) != 0 ? null : list;
        f fVar2 = (i13 & 16) != 0 ? f.a.f125253a : fVar;
        int i14 = (i13 & 32) != 0 ? 2750 : i12;
        ToastBarPosition toastBarPosition2 = (i13 & 64) != 0 ? ToastBarPosition.f181047e : toastBarPosition;
        cVar.getClass();
        View viewV = dVar.v();
        if (viewV != null) {
            return b(cVar, viewV, printableText, null, list2, null, fVar2, i14, toastBarPosition2, null, true, false, null, null, 2176);
        }
        return null;
    }

    public static /* synthetic */ void e(c cVar, View view, PrintableText printableText, List list, List list2, FrameLayout frameLayout, f fVar, int i12, ToastBarPosition toastBarPosition, boolean z12, boolean z13, i.b bVar, ContextThemeWrapper contextThemeWrapper, ScreenPerformanceTracker screenPerformanceTracker, int i13) {
        List list3 = (i13 & 2) != 0 ? null : list;
        List list4 = (i13 & 4) != 0 ? null : list2;
        FrameLayout frameLayout2 = (i13 & 8) != 0 ? null : frameLayout;
        int i14 = (i13 & 32) != 0 ? 2750 : i12;
        boolean z14 = (i13 & 256) != 0 ? true : z12;
        boolean z15 = (i13 & 512) != 0 ? false : z13;
        i.b bVar2 = (i13 & 1024) != 0 ? null : bVar;
        ContextThemeWrapper contextThemeWrapper2 = (i13 & 2048) != 0 ? null : contextThemeWrapper;
        cVar.getClass();
        a(view, printableText, list3, list4, frameLayout2, fVar, i14, toastBarPosition, null, z14, z15, bVar2, contextThemeWrapper2, screenPerformanceTracker);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, android.widget.Space] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View, com.avito.android.lib.design.button.Button] */
    public static ArrayList f(List list, Context context, com.avito.android.lib.design.toast_bar.k kVar) {
        ?? space;
        List<a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (a aVar : list2) {
            if (aVar instanceof a.C3719a) {
                a.C3719a c3719a = (a.C3719a) aVar;
                space = new Button(context, null, 0, c3719a.f125247c == null ? kVar.getButtonStyle() : 0);
                space.setText(c3719a.f125245a);
                String str = c3719a.f125247c;
                if (str != null) {
                    VU.b.f17147t.getClass();
                    space.setStyle(b.a.b(context, str));
                }
                space.setOnClickListener(new h(26, (a.C3719a) aVar, kVar));
            } else if (aVar instanceof a.C3720c) {
                space = new Space(context);
                space.setLayoutParams(new ViewGroup.LayoutParams(((a.C3720c) aVar).f125250a, 0));
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                space = ((a.b) aVar).f125249a;
            }
            arrayList.add(space);
        }
        return arrayList;
    }
}
