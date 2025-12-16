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
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
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

/* compiled from: ButtonsSheetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/buttons/m;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/buttons/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutInflater f193845a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f193846b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193847c = new com.jakewharton.rxrelay3.c();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193848d = new com.jakewharton.rxrelay3.c();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f193849e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f193850f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f193851g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Object f193852h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f193853i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f193854j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Object f193855k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Object f193856l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ArrayList f193857m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f193858n;

    public m(@Y61.k Resources resources, @Y61.k LayoutInflater layoutInflater, @Y61.k c cVar) {
        this.f193845a = layoutInflater;
        this.f193846b = cVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f193849e = C42727D.b(lazyThreadSafetyMode, new k(this));
        this.f193850f = C42727D.b(lazyThreadSafetyMode, new g(resources));
        this.f193851g = C42727D.b(lazyThreadSafetyMode, new h(resources));
        this.f193852h = C42727D.b(lazyThreadSafetyMode, new i(this));
        this.f193853i = C42727D.b(lazyThreadSafetyMode, new l(this));
        this.f193854j = C42727D.b(lazyThreadSafetyMode, new f(this));
        this.f193855k = C42727D.b(lazyThreadSafetyMode, new j(this));
        this.f193856l = C42727D.b(lazyThreadSafetyMode, new e(this));
        this.f193857m = new ArrayList();
        this.f193858n = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.buttons.d
    public final int a() {
        return ((Number) this.f193849e.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.buttons.d
    @Y61.k
    public final TextView b() {
        return (TextView) this.f193853i.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.buttons.d
    public final void c(@Y61.l f.InterfaceC5732f.b.a aVar, @Y61.k f.InterfaceC5732f.b.a aVar2, @Y61.k ViewGroup viewGroup) {
        if (aVar == aVar2) {
            return;
        }
        TextView textViewB = b();
        CharSequence title = aVar2.getTitle();
        if (title == null) {
            title = (String) this.f193850f.getValue();
        }
        textViewB.setText(title);
        i(aVar2.b());
        e(aVar, aVar2);
        f(aVar, aVar2);
        if (!L.f(h().getParent(), viewGroup)) {
            D6.z(h());
            viewGroup.addView(h(), new FrameLayout.LayoutParams(-1, -2));
        }
        f.InterfaceC5732f.b.a.C5734b c5734b = aVar instanceof f.InterfaceC5732f.b.a.C5734b ? (f.InterfaceC5732f.b.a.C5734b) aVar : null;
        f.e eVar = c5734b != null ? c5734b.f193908e : null;
        f.InterfaceC5732f.b.a.C5734b c5734b2 = aVar2 instanceof f.InterfaceC5732f.b.a.C5734b ? (f.InterfaceC5732f.b.a.C5734b) aVar2 : null;
        this.f193846b.a(eVar, c5734b2 != null ? c5734b2.f193908e : null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.buttons.d
    public final void d(@Y61.l f.InterfaceC5732f.b.a aVar) {
        D6.z(h());
        this.f193858n.clear();
        i(C42784z0.f406748b);
        e(aVar, null);
        f(aVar, null);
        f.InterfaceC5732f.b.a.C5734b c5734b = aVar instanceof f.InterfaceC5732f.b.a.C5734b ? (f.InterfaceC5732f.b.a.C5734b) aVar : null;
        this.f193846b.a(c5734b != null ? c5734b.f193908e : null, null);
    }

    public final void e(f.InterfaceC5732f.b.a aVar, f.InterfaceC5732f.b.a aVar2) {
        ContextActionHandler.MethodCall f193907d = aVar != null ? aVar.getF193907d() : null;
        ContextActionHandler.MethodCall f193907d2 = aVar2 != null ? aVar2.getF193907d() : null;
        if (L.f(f193907d, f193907d2)) {
            return;
        }
        if (f193907d2 != null) {
            g().setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(18, this, f193907d2));
        } else {
            g().setOnClickListener(null);
        }
    }

    public final void f(f.InterfaceC5732f.b.a aVar, f.InterfaceC5732f.b.a aVar2) {
        if (aVar instanceof f.InterfaceC5732f.b.a.C5733a) {
            if (aVar2 instanceof f.InterfaceC5732f.b.a.C5733a) {
                return;
            }
            if (aVar2 instanceof f.InterfaceC5732f.b.a.C5734b) {
                j((f.InterfaceC5732f.b.a.C5734b) aVar2);
                return;
            } else {
                if (aVar2 == null) {
                    k();
                    return;
                }
                return;
            }
        }
        if (!(aVar instanceof f.InterfaceC5732f.b.a.C5734b)) {
            if (aVar == null) {
                if (aVar2 instanceof f.InterfaceC5732f.b.a.C5733a) {
                    l();
                    return;
                } else if (aVar2 instanceof f.InterfaceC5732f.b.a.C5734b) {
                    j((f.InterfaceC5732f.b.a.C5734b) aVar2);
                    return;
                } else {
                    if (aVar2 == null) {
                        k();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (aVar2 instanceof f.InterfaceC5732f.b.a.C5733a) {
            l();
            return;
        }
        if (!(aVar2 instanceof f.InterfaceC5732f.b.a.C5734b)) {
            if (aVar2 == null) {
                Q.b(h());
                D6.w(g());
                return;
            }
            return;
        }
        ContextActionHandler.MethodCall methodCall = ((f.InterfaceC5732f.b.a.C5734b) aVar).f193907d;
        if (methodCall == null && ((f.InterfaceC5732f.b.a.C5734b) aVar2).f193907d != null) {
            Q.b(h());
            ViewGroup viewGroupH = h();
            Q5 q52 = new Q5(new C23503n());
            q52.a(g().getId());
            Q.a(viewGroupH, q52.c());
            D6.H(g());
            return;
        }
        if (methodCall == null || ((f.InterfaceC5732f.b.a.C5734b) aVar2).f193907d != null) {
            return;
        }
        Q.b(h());
        ViewGroup viewGroupH2 = h();
        Q5 q53 = new Q5(new C23503n());
        q53.a(g().getId());
        Q.a(viewGroupH2, q53.c());
        D6.w(g());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final View g() {
        return (View) this.f193854j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final ViewGroup h() {
        return (ViewGroup) this.f193852h.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.C] */
    public final void i(List<f.a> list) {
        ArrayList arrayList = this.f193857m;
        ?? r12 = this.f193856l;
        ConstraintLayout constraintLayout = (ConstraintLayout) r12.getValue();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            constraintLayout.removeView((View) it.next());
        }
        arrayList.clear();
        if (list.isEmpty()) {
            return;
        }
        Iterator<T> it2 = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                dVar.g((ConstraintLayout) r12.getValue());
                Iterator it3 = arrayList.iterator();
                int i13 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    View view = (View) next;
                    dVar.i(view.getId(), 6, 0, 6);
                    dVar.i(view.getId(), 7, 0, 7);
                    if (i13 == 0) {
                        dVar.i(view.getId(), 3, 0, 3);
                    } else {
                        dVar.i(view.getId(), 3, ((View) arrayList.get(i13 - 1)).getId(), 4);
                    }
                    a.f193828a.getClass();
                    view.setTag("action_button_vertical_" + i13);
                    i13 = i14;
                }
                int size = arrayList.size();
                for (int i15 = 1; i15 < size; i15++) {
                    dVar.z(((View) arrayList.get(i15)).getId(), 3, ((Number) this.f193851g.getValue()).intValue());
                }
                dVar.c((ConstraintLayout) r12.getValue());
                return;
            }
            Object next2 = it2.next();
            int i16 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            f.a aVar = (f.a) next2;
            Button button = (Button) this.f193845a.inflate(R.layout.messenger_platform_action_button, (ViewGroup) r12.getValue(), false);
            if (aVar.f193880b) {
                button.setAppearanceFromAttr(R.attr.buttonPrimaryMedium);
            } else {
                button.setAppearanceFromAttr(R.attr.buttonSecondaryMedium);
            }
            LinkedHashMap linkedHashMap = this.f193858n;
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
            button.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(19, this, aVar));
            ((ConstraintLayout) r12.getValue()).addView(button, new ConstraintLayout.b(0, -2));
            arrayList.add(button);
            i12 = i16;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    public final void j(f.InterfaceC5732f.b.a.C5734b c5734b) {
        Q.b(h());
        ViewGroup viewGroupH = h();
        Q5 q52 = new Q5(new C23503n());
        ?? r12 = this.f193855k;
        q52.a(((Spinner) r12.getValue()).getId());
        q52.a(b().getId());
        q52.a(g().getId());
        ArrayList arrayList = this.f193857m;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q52.a(((View) it.next()).getId());
        }
        Q.a(viewGroupH, q52.c());
        D6.w((Spinner) r12.getValue());
        D6.H(b());
        if (c5734b.f193907d != null) {
            D6.H(g());
        } else {
            D6.w(g());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            D6.H((View) it2.next());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    public final void k() {
        Q.b(h());
        D6.w((Spinner) this.f193855k.getValue());
        D6.H(b());
        D6.w(g());
        Iterator it = this.f193857m.iterator();
        while (it.hasNext()) {
            D6.H((View) it.next());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    public final void l() {
        Q.b(h());
        ViewGroup viewGroupH = h();
        Q5 q52 = new Q5(new C23503n());
        ?? r12 = this.f193855k;
        q52.a(((Spinner) r12.getValue()).getId());
        q52.a(b().getId());
        q52.a(g().getId());
        ArrayList arrayList = this.f193857m;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q52.a(((View) it.next()).getId());
        }
        Q.a(viewGroupH, q52.c());
        D6.H((Spinner) r12.getValue());
        D6.g(b());
        D6.w(g());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            D6.g((View) it2.next());
        }
    }
}
