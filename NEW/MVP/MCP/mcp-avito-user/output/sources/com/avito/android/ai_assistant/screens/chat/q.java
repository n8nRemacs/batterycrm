package com.avito.android.ai_assistant.screens.chat;

import Rh.C15041a;
import Vb.InterfaceC15661a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.SendButtonMode;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AiAssistantChatView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/q;", "Lcom/avito/android/ai_assistant/screens/chat/o;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes11.dex */
public final class q implements o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f89481b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f89482c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15661a, G0> f89483d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f89484e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f89485f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f89486g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f89487h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f89488i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.input.a f89489j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final AppCompatImageView f89490k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f89491l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f89492m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final NavBar f89493n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final v f89494o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final d f89495p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final Drawable f89496q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final Drawable f89497r;

    /* renamed from: s, reason: collision with root package name */
    public final int f89498s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final e f89499t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final c f89500u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final C15041a f89501v;

    /* compiled from: AiAssistantChatView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            ((com.avito.android.ai_assistant.screens.chat.f) q.this.f89483d).invoke(new InterfaceC15661a.o(str));
            return G0.f406611a;
        }
    }

    /* compiled from: AiAssistantChatView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC15661a, G0> f89503l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super InterfaceC15661a, G0> lVar) {
            super(0);
            this.f89503l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f89503l.invoke(InterfaceC15661a.j.f17224a);
            return G0.f406611a;
        }
    }

    /* compiled from: AiAssistantChatView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/ai_assistant/screens/chat/q$c", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public int f89504b;

        public c() {
            this.f89504b = q.this.f89498s;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            if (Math.abs(i13) > this.f89504b) {
                K2.d(q.this.f89489j, false);
            }
        }
    }

    /* compiled from: AiAssistantChatView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/ai_assistant/screens/chat/q$d", "Landroidx/recyclerview/widget/z;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends C23434z {
        @Override // androidx.recyclerview.widget.C23434z
        public final int n() {
            return -1;
        }
    }

    /* compiled from: Renderer.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/arch/mvi/utils/v", "Lcom/avito/android/arch/mvi/utils/u;", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements com.avito.android.arch.mvi.utils.u<Vb.i, InterfaceC15661a> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public Vb.i f89506b;

        public e() {
        }
    }

    /* compiled from: AiAssistantChatView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            q.this.f89483d.invoke(InterfaceC15661a.d.f17216a);
            return G0.f406611a;
        }
    }

    /* compiled from: AiAssistantChatView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Integer, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            q qVar = q.this;
            if (iIntValue == 0) {
                qVar.f89483d.invoke(InterfaceC15661a.g.f17219a);
            } else {
                qVar.f89483d.invoke(InterfaceC15661a.c.f17215a);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k Y41.l<? super InterfaceC15661a, G0> lVar) {
        this.f89481b = aVar;
        this.f89482c = dVar;
        this.f89483d = lVar;
        this.f89484e = viewGroup.getContext();
        View viewFindViewById = viewGroup.findViewById(R.id.disclaimer_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        this.f89485f = viewGroup2;
        View viewFindViewById2 = viewGroup2.findViewById(R.id.disclaimer_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f89486g = textView;
        View viewFindViewById3 = viewGroup.findViewById(R.id.input_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById3;
        this.f89487h = viewGroup3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.send_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f89488i = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.input_field);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.AvitoEditText");
        }
        com.avito.android.lib.design.input.a aVar2 = (com.avito.android.lib.design.input.a) viewFindViewById5;
        this.f89489j = aVar2;
        View viewFindViewById6 = viewGroup.findViewById(R.id.send_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        }
        this.f89490k = (AppCompatImageView) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.send_text);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f89491l = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.recycler);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById8;
        this.f89492m = recyclerView;
        View viewFindViewById9 = viewGroup.findViewById(R.id.navbar);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById9;
        this.f89493n = navBar;
        View viewFindViewById10 = viewGroup.findViewById(R.id.content_container);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f89494o = new v((ViewGroup) viewFindViewById10, aVar);
        this.f89495p = new d(viewGroup.getContext());
        Resources resources = viewGroup.getResources();
        Resources.Theme theme = viewGroup.getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        this.f89496q = resources.getDrawable(R.drawable.ai_assistant_inactive_input_shape, theme);
        this.f89497r = viewGroup3.getResources().getDrawable(R.drawable.ai_assistant_input_shape, viewGroup.getContext().getTheme());
        this.f89498s = viewGroup.getResources().getDimensionPixelSize(R.dimen.ai_assistant_scroll_threshold);
        this.f89499t = new e();
        this.f89500u = new c();
        this.f89501v = new C15041a(this, 8);
        recyclerView.setAdapter(dVar);
        viewGroup.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.d2(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.l(new com.avito.android.ai_assistant.adapter.j(viewGroup.getResources(), y6.b(28)), -1);
        recyclerView.l(new com.avito.android.ai_assistant.adapter.user_message.a(viewGroup.getResources()), -1);
        recyclerView.l(new com.avito.android.ai_assistant.adapter.assistant_text_message.a(viewGroup.getResources()), -1);
        recyclerView.l(new com.avito.android.ai_assistant.adapter.answer_loading.a(viewGroup.getResources()), -1);
        recyclerView.l(new com.avito.android.ai_assistant.adapter.append.a(viewGroup.getResources()), -1);
        recyclerView.l(new com.avito.android.ai_assistant.adapter.segment_buttons.d(), -1);
        recyclerView.l(new com.avito.android.ai_assistant.adapter.simple_snippet.d(viewGroup.getResources()), -1);
        recyclerView.l(new com.avito.android.ai_assistant.adapter.repeat_button.a(viewGroup.getResources()), -1);
        recyclerView.setItemAnimator(null);
        com.avito.android.lib.design.input.n.b(aVar2, new a());
        viewGroup3.setOnClickListener(new B(this, 17));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        e(true);
        com.avito.android.lib.util.i.f181373a.getClass();
        if (com.avito.android.lib.util.i.f181377e) {
            new n(viewGroup, navBar, new r(this));
        }
    }

    public final a.C5289a b(@InterfaceC42150f int i12, int i13) {
        Drawable drawableH = C35835l0.h(i12, this.f89493n.getContext());
        if (drawableH != null) {
            return new a.C5289a(drawableH, null, null, 0, i13, 0, 46, null);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void c(AttributedText attributedText, boolean z12, boolean z13) {
        AttributedText attributedTextCopy$default;
        int i12 = 8;
        int i13 = z13 ? 0 : 8;
        ViewGroup viewGroup = this.f89487h;
        viewGroup.setVisibility(i13);
        Drawable drawable = z12 ? this.f89496q : this.f89497r;
        if (drawable != null) {
            viewGroup.setBackground(drawable);
        }
        if (attributedText == null || (attributedTextCopy$default = AttributedText.copy$default(attributedText, null, null, 0, 7, null)) == null) {
            attributedTextCopy$default = null;
        } else {
            attributedTextCopy$default.setOnDeepLinkClickListener(this.f89501v);
        }
        CharSequence charSequenceC = attributedTextCopy$default != null ? this.f89481b.c(this.f89484e, attributedTextCopy$default) : null;
        if (charSequenceC != null && charSequenceC.length() != 0 && z13) {
            i12 = 0;
        }
        this.f89485f.setVisibility(i12);
        this.f89486g.setText(charSequenceC);
    }

    public final void d(boolean z12, SendButtonMode sendButtonMode, boolean z13) {
        this.f89490k.setEnabled(z13);
        ViewGroup viewGroup = this.f89488i;
        D6.G(viewGroup, z12);
        FV.a.f4720a.getClass();
        FV.a.c(this.f89491l, R.attr.textIconArrowUp);
        if (z13) {
            viewGroup.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(4, sendButtonMode, this));
        } else {
            viewGroup.setOnClickListener(null);
        }
    }

    public final void e(boolean z12) {
        a.C5289a c5289aB = b(R.attr.ic_plus24, y6.b(16));
        a.C5289a c5289aB2 = b(R.attr.ic_assistantChats24, 0);
        NavBar navBar = this.f89493n;
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_close24, navBar.getContext()), new f(), false, null, null, z12 ? C42745f0.U(c5289aB, c5289aB2) : C42784z0.f406748b, new g(), 28, null));
    }
}
