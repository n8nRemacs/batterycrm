package com.avito.android.ai_assistant.screens.chat;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.G0;
import androidx.core.view.J0;
import androidx.core.view.M;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AiAssistantChatInsetsController.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/n;", "Landroidx/core/view/G0$b;", "Landroidx/core/view/M;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n extends G0.b implements M {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f89463d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f89464e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Integer> f89465f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Rect f89466g;

    /* renamed from: h, reason: collision with root package name */
    public int f89467h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public J0 f89468i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public J0 f89469j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public J0 f89470k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public C22771k f89471l;

    /* compiled from: AiAssistantChatInsetsController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f89472l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Integer invoke() {
            return 0;
        }
    }

    public /* synthetic */ n(ViewGroup viewGroup, View view, Y41.a aVar, int i12, C42822w c42822w) {
        this(viewGroup, view, (i12 & 4) != 0 ? a.f89472l : aVar);
    }

    @Override // androidx.core.view.G0.b
    public final void b(@Y61.k G0 g02) {
        if (g02.c() == this.f89467h) {
            this.f89467h = -1;
            this.f89463d.setTranslationY(0.0f);
            this.f89464e.setTranslationY(0.0f);
            g(this.f89469j);
        }
    }

    @Override // androidx.core.view.G0.b
    public final void c(@Y61.k G0 g02) {
        if (this.f89467h == -1) {
            int iC2 = g02.c();
            com.avito.android.lib.util.i.f181373a.getClass();
            if ((iC2 & com.avito.android.lib.util.i.f181376d) != 0) {
                this.f89467h = g02.c();
                this.f89470k = this.f89469j;
            }
        }
    }

    @Override // androidx.core.view.G0.b
    @Y61.k
    public final J0 d(@Y61.k J0 j02, @Y61.k List<G0> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((G0) next).c() == this.f89467h) {
                break;
            }
        }
        if (((G0) next) == null) {
            return j02;
        }
        f(j02);
        return j02;
    }

    @Override // androidx.core.view.G0.b
    @Y61.k
    public final G0.a e(@Y61.k G0 g02, @Y61.k G0.a aVar) {
        boolean zF2 = L.f(this.f89470k, this.f89469j);
        if (g02.c() == this.f89467h) {
            if (zF2) {
                b(g02);
            } else {
                f(this.f89470k);
            }
        }
        return aVar;
    }

    public final void f(J0 j02) {
        C22771k c22771kI = i(j02);
        float f12 = c22771kI.f44776b - c22771kI.f44778d;
        C22771k c22771k = this.f89471l;
        float f13 = c22771k.f44776b - c22771k.f44778d;
        float fFloatValue = (this.f89465f.invoke().floatValue() * (f13 != 0.0f ? f12 / f13 : 0.0f)) + f12;
        this.f89463d.setTranslationY(fFloatValue);
        this.f89464e.setTranslationY(-fFloatValue);
    }

    public final J0 g(J0 j02) {
        J0 j0A;
        int i12;
        com.avito.android.lib.util.i.f181373a.getClass();
        int i13 = com.avito.android.lib.util.i.f181376d;
        if (j02.p(i13)) {
            this.f89471l = i(j02);
        }
        int i14 = this.f89467h;
        C22771k c22771k = C22771k.f44774e;
        if (i14 == -1) {
            j0A = j02;
        } else {
            J0.b bVar = new J0.b(j02);
            bVar.b(i13, c22771k);
            bVar.d(i13);
            j0A = bVar.a();
        }
        int i15 = com.avito.android.lib.util.i.f181375c;
        C22771k c22771kE = j0A.e(i15);
        int iIntValue = (!j0A.p(i13) || (i12 = i(j0A).f44778d) <= 0) ? c22771kE.f44778d : i12 - this.f89465f.invoke().intValue();
        Rect rect = this.f89466g;
        this.f89463d.setPadding(rect.left + c22771kE.f44775a, rect.top + c22771kE.f44776b, rect.right + c22771kE.f44777c, rect.bottom + iIntValue);
        J0.b bVar2 = new J0.b(j02);
        bVar2.b(i15, c22771k);
        bVar2.b(i13, c22771k);
        return bVar2.a();
    }

    @Override // androidx.core.view.M
    @Y61.k
    public final J0 h(@Y61.k View view, @Y61.k J0 j02) {
        this.f89469j = j02;
        J0 j0O = C22823h0.o(view);
        if (j0O == null) {
            j0O = this.f89468i;
        }
        this.f89468i = j0O;
        return g(j02);
    }

    public final C22771k i(J0 j02) {
        com.avito.android.lib.util.i iVar = com.avito.android.lib.util.i.f181373a;
        iVar.getClass();
        C22771k c22771kE = j02.e(com.avito.android.lib.util.i.f181376d);
        J0 j03 = this.f89468i;
        iVar.getClass();
        int i12 = com.avito.android.lib.util.i.f181375c;
        C22771k c22771kE2 = j03.e(i12);
        iVar.getClass();
        C22771k c22771kA = C22771k.a(c22771kE2, j02.e(i12));
        return C22771k.a(C22771k.b(c22771kE.f44775a - c22771kA.f44775a, c22771kE.f44776b - c22771kA.f44776b, c22771kE.f44777c - c22771kA.f44777c, c22771kE.f44778d - c22771kA.f44778d), C22771k.f44774e);
    }

    public n(@Y61.k ViewGroup viewGroup, @Y61.k View view, @Y61.k Y41.a<Integer> aVar) {
        super(0);
        this.f89463d = viewGroup;
        this.f89464e = view;
        this.f89465f = aVar;
        this.f89466g = new Rect(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        this.f89467h = -1;
        J0 j02 = J0.f44939b;
        this.f89468i = j02;
        this.f89469j = j02;
        this.f89470k = j02;
        this.f89471l = C22771k.f44774e;
        C22823h0.R(viewGroup, this);
        C22823h0.K(viewGroup, this);
    }
}
