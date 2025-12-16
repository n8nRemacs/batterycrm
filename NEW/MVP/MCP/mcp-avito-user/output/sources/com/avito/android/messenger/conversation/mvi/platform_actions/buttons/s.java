package com.avito.android.messenger.conversation.mvi.platform_actions.buttons;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.C23503n;
import androidx.transition.Q;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ButtonsStickyView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/buttons/s;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/buttons/n;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutInflater f193863a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f193864b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193865c = new com.jakewharton.rxrelay3.c();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f193866d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f193867e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f193868f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f193869g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f193870h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f193871i;

    public s(@Y61.k Resources resources, @Y61.k LayoutInflater layoutInflater, @Y61.k c cVar) {
        this.f193863a = layoutInflater;
        this.f193864b = cVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f193866d = C42727D.b(lazyThreadSafetyMode, new o(resources));
        this.f193867e = C42727D.b(lazyThreadSafetyMode, new p(this));
        this.f193868f = C42727D.b(lazyThreadSafetyMode, new r(this));
        this.f193869g = C42727D.b(lazyThreadSafetyMode, new q(this));
        this.f193870h = new ArrayList();
        this.f193871i = new LinkedHashMap();
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.buttons.n
    public final void a(@Y61.l f.InterfaceC5732f.b.InterfaceC5735b interfaceC5735b) {
        D6.z(h());
        this.f193871i.clear();
        j(C42784z0.f406748b);
        f(interfaceC5735b, null);
        f.InterfaceC5732f.b.InterfaceC5735b.C5736b c5736b = interfaceC5735b instanceof f.InterfaceC5732f.b.InterfaceC5735b.C5736b ? (f.InterfaceC5732f.b.InterfaceC5735b.C5736b) interfaceC5735b : null;
        this.f193864b.a(c5736b != null ? c5736b.f193915d : null, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.buttons.n
    public final void b(@Y61.l f.InterfaceC5732f.b.InterfaceC5735b interfaceC5735b, @Y61.k f.InterfaceC5732f.b.InterfaceC5735b interfaceC5735b2, @Y61.k ViewGroup viewGroup) {
        if (interfaceC5735b2 == interfaceC5735b) {
            return;
        }
        TextView textViewI = i();
        CharSequence title = interfaceC5735b2.getTitle();
        if (title == null) {
            title = "";
        }
        textViewI.setText(title);
        j(interfaceC5735b2.b());
        f(interfaceC5735b, interfaceC5735b2);
        if (!L.f(h().getParent(), viewGroup)) {
            D6.z(h());
            viewGroup.addView(h(), new FrameLayout.LayoutParams(-1, -2));
        }
        f.InterfaceC5732f.b.InterfaceC5735b.C5736b c5736b = interfaceC5735b instanceof f.InterfaceC5732f.b.InterfaceC5735b.C5736b ? (f.InterfaceC5732f.b.InterfaceC5735b.C5736b) interfaceC5735b : null;
        f.e eVar = c5736b != null ? c5736b.f193915d : null;
        f.InterfaceC5732f.b.InterfaceC5735b.C5736b c5736b2 = interfaceC5735b2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.C5736b ? (f.InterfaceC5732f.b.InterfaceC5735b.C5736b) interfaceC5735b2 : null;
        this.f193864b.a(eVar, c5736b2 != null ? c5736b2.f193915d : null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    public final void c() {
        Q.b(h());
        D6.w((Spinner) this.f193869g.getValue());
        D6.w(i());
    }

    public final void d(int i12) {
        int id2;
        int i13 = 1;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g(h());
        ArrayList arrayList = this.f193870h;
        int i14 = 2;
        int size = arrayList.size() / 2;
        int i15 = 0;
        while (true) {
            id2 = R.id.platform_buttons_sticky_title_container;
            if (i15 >= size) {
                break;
            }
            int i16 = i14 * i15;
            int i17 = i16 + 1;
            View view = (View) arrayList.get(i16);
            View view2 = (View) arrayList.get(i17);
            a.f193828a.getClass();
            view.setTag("action_button_" + i15 + "_row_left_column_" + i16);
            view2.setTag("action_button_" + i15 + "_row_right_column_" + i17);
            int id3 = view.getId();
            int id4 = view2.getId();
            if (i15 == 0) {
                dVar.i(id3, 3, R.id.platform_buttons_sticky_title_container, 4);
                dVar.i(id4, 3, R.id.platform_buttons_sticky_title_container, 4);
            } else {
                int i18 = (i15 - 1) * 2;
                dVar.i(id3, 3, ((View) arrayList.get(i18)).getId(), 4);
                dVar.i(id4, 3, ((View) arrayList.get(i18 + 1)).getId(), 4);
                dVar.z(id3, 3, i12);
                dVar.z(id4, 3, i12);
            }
            dVar.n(0, new float[]{1.0f, 1.0f}, new int[]{id3, id4});
            int i19 = i12 / 2;
            dVar.z(id3, 7, i19);
            dVar.z(id4, 6, i19);
            i15++;
            i13 = 1;
            i14 = 2;
        }
        int i22 = i14;
        int i23 = i13;
        if (arrayList.size() % i22 == i23) {
            View view3 = (View) C42745f0.Q(arrayList);
            view3.setTag("action_button_last_row_full_width");
            int id5 = view3.getId();
            dVar.i(id5, 6, 0, 6);
            dVar.i(id5, 7, 0, 7);
            if (arrayList.size() != i23) {
                id2 = ((View) androidx.appcompat.app.r.j(2, arrayList)).getId();
            }
            dVar.i(id5, 3, id2, 4);
            dVar.z(id5, 3, i12);
        }
        dVar.c(h());
    }

    public final void e(int i12) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g(h());
        ArrayList arrayList = this.f193870h;
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            View view = (View) next;
            dVar.i(view.getId(), 6, 0, 6);
            dVar.i(view.getId(), 7, 0, 7);
            if (i13 == 0) {
                dVar.i(view.getId(), 3, R.id.platform_buttons_sticky_title_container, 4);
            } else {
                dVar.i(view.getId(), 3, ((View) arrayList.get(i13 - 1)).getId(), 4);
            }
            a.f193828a.getClass();
            view.setTag("action_button_vertical_" + i13);
            i13 = i14;
        }
        int size = arrayList.size();
        for (int i15 = 1; i15 < size; i15++) {
            dVar.z(((View) arrayList.get(i15)).getId(), 3, i12);
        }
        dVar.c(h());
    }

    public final void f(f.InterfaceC5732f.b.InterfaceC5735b interfaceC5735b, f.InterfaceC5732f.b.InterfaceC5735b interfaceC5735b2) {
        if (interfaceC5735b instanceof f.InterfaceC5732f.b.InterfaceC5735b.a) {
            if (interfaceC5735b2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.a) {
                return;
            }
            if (interfaceC5735b2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.C5736b) {
                String str = ((f.InterfaceC5732f.b.InterfaceC5735b.C5736b) interfaceC5735b2).f193913b;
                k(!(str == null || str.length() == 0));
                return;
            } else {
                if (interfaceC5735b2 == null) {
                    c();
                    return;
                }
                return;
            }
        }
        if (!(interfaceC5735b instanceof f.InterfaceC5732f.b.InterfaceC5735b.C5736b)) {
            if (interfaceC5735b == null) {
                if (interfaceC5735b2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.a) {
                    l();
                    return;
                }
                if (interfaceC5735b2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.C5736b) {
                    String str2 = ((f.InterfaceC5732f.b.InterfaceC5735b.C5736b) interfaceC5735b2).f193913b;
                    k(!(str2 == null || str2.length() == 0));
                    return;
                } else {
                    if (interfaceC5735b2 == null) {
                        c();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (interfaceC5735b2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.a) {
            l();
            return;
        }
        if (!(interfaceC5735b2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.C5736b)) {
            if (interfaceC5735b2 == null) {
                c();
            }
        } else {
            String str3 = ((f.InterfaceC5732f.b.InterfaceC5735b.C5736b) interfaceC5735b2).f193913b;
            if (str3 == null || str3.length() == 0) {
                D6.w(i());
            } else {
                D6.H(i());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final int g() {
        return ((Number) this.f193866d.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final ConstraintLayout h() {
        return (ConstraintLayout) this.f193867e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final TextView i() {
        return (TextView) this.f193868f.getValue();
    }

    public final void j(List<f.a> list) {
        ArrayList arrayList = this.f193870h;
        ConstraintLayout constraintLayoutH = h();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            constraintLayoutH.removeView((View) it.next());
        }
        arrayList.clear();
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 6) {
            V2.f318762a.j("ButtonsStickyView", "More than 6 buttons is currently not supported in sticky view", null);
            list = C42745f0.E0(list, 6);
        }
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            f.a aVar = (f.a) obj;
            ConstraintLayout constraintLayoutH2 = h();
            LinkedHashMap linkedHashMap = this.f193871i;
            Button button = (Button) this.f193863a.inflate(R.layout.messenger_platform_action_button, (ViewGroup) constraintLayoutH2, false);
            if (aVar.f193880b) {
                button.setAppearanceFromAttr(R.attr.buttonPrimaryMedium);
            } else {
                button.setAppearanceFromAttr(R.attr.buttonSecondaryMedium);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append(": ");
            CharSequence charSequence = aVar.f193879a;
            sb2.append((Object) charSequence);
            String string = sb2.toString();
            Object objValueOf = linkedHashMap.get(string);
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(View.generateViewId());
                linkedHashMap.put(string, objValueOf);
            }
            button.setId(((Number) objValueOf).intValue());
            button.setClickable(true);
            button.setFocusable(true);
            button.setText(charSequence);
            button.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(20, this, aVar));
            h().addView(button, new ConstraintLayout.b(0, -2));
            arrayList.add(button);
            i12 = i13;
        }
        if (list.size() == 1) {
            e(g());
            return;
        }
        if (list.size() == 2) {
            f.a[] aVarArr = {list.get(0), list.get(1)};
            for (int i14 = 0; i14 < 2; i14++) {
                if (aVarArr[i14].f193879a.length() > 12) {
                    e(g());
                    return;
                }
            }
            d(g());
            return;
        }
        if (list.size() != 3) {
            if (list.size() > 3) {
                d(g());
                return;
            }
            return;
        }
        f.a[] aVarArr2 = {list.get(1), list.get(2)};
        for (int i15 = 0; i15 < 2; i15++) {
            if (aVarArr2[i15].f193879a.length() > 12) {
                e(g());
                return;
            }
        }
        int iG2 = g();
        if (arrayList.size() != 3) {
            throw new IllegalArgumentException("Mixed layout only supported for 3 buttons");
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g(h());
        dVar.i(((View) arrayList.get(0)).getId(), 6, 0, 6);
        dVar.i(((View) arrayList.get(0)).getId(), 7, 0, 7);
        dVar.i(((View) arrayList.get(0)).getId(), 3, R.id.platform_buttons_sticky_title_container, 4);
        dVar.x(((View) arrayList.get(0)).getId(), 3, iG2);
        ((View) arrayList.get(0)).setTag("action_button_mixed_top");
        dVar.i(((View) arrayList.get(1)).getId(), 3, ((View) arrayList.get(0)).getId(), 4);
        dVar.i(((View) arrayList.get(2)).getId(), 3, ((View) arrayList.get(0)).getId(), 4);
        dVar.z(((View) arrayList.get(1)).getId(), 3, iG2);
        dVar.z(((View) arrayList.get(2)).getId(), 3, iG2);
        dVar.n(0, new float[]{1.0f, 1.0f}, new int[]{((View) arrayList.get(1)).getId(), ((View) arrayList.get(2)).getId()});
        int i16 = iG2 / 2;
        dVar.z(((View) arrayList.get(1)).getId(), 7, i16);
        dVar.z(((View) arrayList.get(1)).getId(), 3, iG2);
        dVar.z(((View) arrayList.get(2)).getId(), 6, i16);
        dVar.z(((View) arrayList.get(2)).getId(), 3, iG2);
        ((View) arrayList.get(1)).setTag("action_button_mixed_bottom_left");
        ((View) arrayList.get(2)).setTag("action_button_mixed_bottom_right");
        dVar.c(h());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    public final void k(boolean z12) {
        Q.b(h());
        ConstraintLayout constraintLayoutH = h();
        Q5 q52 = new Q5(new C23503n());
        ?? r12 = this.f193869g;
        q52.a(((Spinner) r12.getValue()).getId());
        if (z12) {
            q52.a(i().getId());
        }
        ArrayList arrayList = this.f193870h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q52.a(((View) it.next()).getId());
        }
        Q.a(constraintLayoutH, q52.c());
        D6.w((Spinner) r12.getValue());
        if (z12) {
            D6.H(i());
        } else {
            D6.w(i());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            D6.H((View) it2.next());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    public final void l() {
        Q.b(h());
        ConstraintLayout constraintLayoutH = h();
        Q5 q52 = new Q5(new C23503n());
        ?? r12 = this.f193869g;
        q52.a(((Spinner) r12.getValue()).getId());
        if (D6.y(i())) {
            q52.a(i().getId());
        }
        ArrayList arrayList = this.f193870h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q52.a(((View) it.next()).getId());
        }
        Q.a(constraintLayoutH, q52.c());
        D6.H((Spinner) r12.getValue());
        if (D6.y(i())) {
            D6.g(i());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            D6.g((View) it2.next());
        }
    }
}
