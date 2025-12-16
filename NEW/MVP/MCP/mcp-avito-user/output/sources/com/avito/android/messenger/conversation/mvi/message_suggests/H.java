package com.avito.android.messenger.conversation.mvi.message_suggests;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.O;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C23492c;
import androidx.transition.Q;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MessageSuggestsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/H;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class H implements MessageSuggestsView {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f191906n = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$State;", H.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f191907b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<MessageSuggestsView.SuggestItem> f191908c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<MessageSuggestsView.SuggestItem> f191909d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<G0> f191910e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<G0> f191911f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f191912g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Object f191913h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f191914i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f191915j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Object f191916k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f191917l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C35971x f191918m;

    /* compiled from: MessageSuggestsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return H.this.f191907b.findViewById(R.id.close_message_suggests);
        }
    }

    /* compiled from: MessageSuggestsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return H.this.f191907b.findViewById(R.id.message_suggests_header_container);
        }
    }

    /* compiled from: MessageSuggestsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/chips/Chips;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Chips> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Chips invoke() {
            return (Chips) H.this.f191907b.findViewById(R.id.message_suggest_chips);
        }
    }

    /* compiled from: MessageSuggestsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<TextView> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) H.this.f191907b.findViewById(R.id.message_suggests_title);
        }
    }

    /* compiled from: MessageSuggestsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<View> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return H.this.f191907b.findViewById(R.id.reply_suggests);
        }
    }

    public H(@Y61.k ViewGroup viewGroup) {
        this.f191907b = viewGroup;
        com.jakewharton.rxrelay3.d<MessageSuggestsView.SuggestItem> dVarM = C31685o.m();
        this.f191908c = dVarM;
        this.f191909d = dVarM;
        com.jakewharton.rxrelay3.d<G0> dVarM2 = C31685o.m();
        this.f191910e = dVarM2;
        this.f191911f = dVarM2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f191912g = C42727D.b(lazyThreadSafetyMode, new a());
        this.f191913h = C42727D.b(lazyThreadSafetyMode, new d());
        this.f191914i = C42727D.b(lazyThreadSafetyMode, new c());
        this.f191915j = C42727D.b(lazyThreadSafetyMode, new e());
        this.f191916k = C42727D.b(lazyThreadSafetyMode, new b());
        this.f191918m = new C35971x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final MessageSuggestsView.b a(com.avito.android.mvi.e<MessageSuggestsView.b> eVar) {
        kotlin.reflect.n<Object> nVar = f191906n[0];
        return (MessageSuggestsView.b) this.f191918m.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView$b] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f191906n[0];
        this.f191918m.f319122b = (MessageSuggestsView.b) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final View c() {
        return (View) this.f191915j.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<MessageSuggestsView.b> eVar, MessageSuggestsView.b bVar, MessageSuggestsView.b bVar2) {
        MessageSuggestsView.b bVar3 = bVar2;
        if (L.f(bVar, bVar3)) {
            return;
        }
        boolean zEquals = bVar3.equals(MessageSuggestsView.b.a.f191932b);
        ViewGroup viewGroup = this.f191907b;
        if (zEquals) {
            if (D6.y(c())) {
                Q5 q52 = new Q5(new androidx.transition.J(80));
                q52.a(R.id.reply_suggests);
                Q.a(viewGroup, q52.c());
            }
            D6.w(c());
            return;
        }
        if (bVar3.equals(MessageSuggestsView.b.C5670b.f191933b)) {
            if (D6.y(c())) {
                Q5 q53 = new Q5(new androidx.transition.J(80));
                q53.a(R.id.reply_suggests);
                Q.a(viewGroup, q53.c());
            }
            D6.w(c());
            return;
        }
        if (bVar3 instanceof MessageSuggestsView.b.c) {
            if (D6.y(c())) {
                Q5 q54 = new Q5(new androidx.transition.J(80));
                q54.a(R.id.reply_suggests);
                Q.a(viewGroup, q54.c());
            }
            D6.w(c());
            return;
        }
        if (bVar3 instanceof MessageSuggestsView.b.d) {
            List<MessageSuggestsView.SuggestItem> list = bVar3.f191931a;
            if (list.isEmpty()) {
                if (D6.y(c())) {
                    Q5 q55 = new Q5(new androidx.transition.J(80));
                    q55.a(R.id.reply_suggests);
                    Q.a(viewGroup, q55.c());
                }
                D6.w(c());
            } else {
                boolean z12 = this.f191917l;
                ?? r22 = this.f191914i;
                if (!z12) {
                    ((View) this.f191912g.getValue()).setOnClickListener(new I(this));
                    ((Chips) r22.getValue()).setChipsSelectedListener(new J(this));
                    RecyclerView recyclerView = (RecyclerView) ((Chips) r22.getValue()).findViewById(R.id.chips_recycler_view);
                    if (recyclerView != null) {
                        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
                        O o12 = itemAnimator instanceof O ? (O) itemAnimator : null;
                        if (o12 != null) {
                            o12.f53727g = false;
                        }
                    }
                    this.f191917l = true;
                }
                ((Chips) r22.getValue()).j();
                ((Chips) r22.getValue()).setData(list);
                if (!D6.y(c())) {
                    Q5 q56 = new Q5(new C23492c());
                    q56.a(R.id.reply_suggests);
                    Q.a(viewGroup, q56.c());
                }
                D6.H(c());
            }
            View view = (View) this.f191916k.getValue();
            String str = ((MessageSuggestsView.b.d) bVar3).f191937b;
            D6.G(view, !(str == null || C43066x.K(str)));
            ?? r72 = this.f191913h;
            if (str == null || C43066x.K(str)) {
                D6.w((TextView) r72.getValue());
            } else {
                D6.G((TextView) r72.getValue(), true);
                ((TextView) r72.getValue()).setText(str);
            }
        }
    }
}
