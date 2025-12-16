package com.avito.android.messenger.conversation.mvi.message_scrollable_suggests;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.transition.C23492c;
import androidx.transition.Q;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.n;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: MessageScrollSuggestsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/o;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements n {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f191871k = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/MessageScrollSuggestsView$State;", o.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f191872b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f191873c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f191874d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f191875e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f191876f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f191877g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<MessageSuggestsView.SuggestItem> f191878h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e f191879i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C35971x f191880j;

    /* compiled from: MessageScrollSuggestsView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/o$b;", "", "<init>", "()V", "", "OVERLAY_COLOR", "I", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: MessageScrollSuggestsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/chips/Chips;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Chips> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Chips invoke() {
            o oVar = o.this;
            Chips chips = (Chips) oVar.f191872b.findViewById(R.id.message_suggest_chips_scroll);
            if (chips != null) {
                return chips;
            }
            throw new IllegalStateException("Chips view not found in " + oVar.f191872b);
        }
    }

    /* compiled from: MessageScrollSuggestsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<View> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return o.this.f191872b.findViewById(R.id.fallback_container);
        }
    }

    /* compiled from: MessageScrollSuggestsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<TextView> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) o.this.f191872b.findViewById(R.id.message_suggest_fallback_text);
        }
    }

    /* compiled from: MessageScrollSuggestsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<LinearLayout> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final LinearLayout invoke() {
            return (LinearLayout) o.this.f191872b.findViewById(R.id.container_suggest_chips_scroll);
        }
    }

    /* compiled from: MessageScrollSuggestsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<View> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return o.this.f191872b.findViewById(R.id.message_scroll_suggest);
        }
    }

    static {
        new b(null);
    }

    public o(@Y61.k ViewGroup viewGroup) {
        this.f191872b = viewGroup;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f191873c = C42727D.b(lazyThreadSafetyMode, new c());
        this.f191874d = C42727D.b(lazyThreadSafetyMode, new g());
        this.f191875e = C42727D.b(lazyThreadSafetyMode, new f());
        this.f191876f = C42727D.b(lazyThreadSafetyMode, new e());
        this.f191877g = C42727D.b(lazyThreadSafetyMode, new d());
        io.reactivex.rxjava3.subjects.e<MessageSuggestsView.SuggestItem> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f191878h = eVar;
        this.f191879i = eVar;
        this.f191880j = new C35971x();
        c().setChipsSelectedListener(new a());
        c().f178693s.setItemAnimator(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final n.b a(com.avito.android.mvi.e<n.b> eVar) {
        kotlin.reflect.n<Object> nVar = f191871k[0];
        return (n.b) this.f191880j.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.n$b] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f191871k[0];
        this.f191880j.f319122b = (n.b) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final Chips c() {
        return (Chips) this.f191873c.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<n.b> eVar, n.b bVar, n.b bVar2) {
        n.b bVar3 = bVar2;
        if (L.f(bVar, bVar3)) {
            return;
        }
        if (bVar3.equals(n.b.a.f191865b)) {
            D6.w(f());
            D6.w(e());
            return;
        }
        boolean z12 = bVar3 instanceof n.b.d;
        ?? r32 = this.f191877g;
        if (z12) {
            List<MessageSuggestsView.SuggestItem> list = bVar3.f191864a;
            if (list.isEmpty()) {
                D6.w(f());
                D6.w(e());
                return;
            }
            D6.H(f());
            D6.H(e());
            D6.w((View) r32.getValue());
            D6.H(c());
            c().setData(list);
            c().u(true);
            return;
        }
        if (bVar3 instanceof n.b.e) {
            if (f().getVisibility() != 0) {
                Q5 q52 = new Q5(new C23492c());
                G0 g02 = G0.f406611a;
                Q.a(this.f191872b, q52.c());
            }
            D6.H(f());
            D6.H(e());
            D6.w((View) r32.getValue());
            D6.H(c());
            c().j();
            c().setData(((n.b.e) bVar3).f191870c);
            c().u(false);
            return;
        }
        if (!bVar3.equals(n.b.c.f191867b)) {
            if (bVar3 instanceof n.b.C5669b) {
                D6.w(f());
                D6.w(e());
                return;
            }
            return;
        }
        D6.H(f());
        D6.H(e());
        D6.w(c());
        ?? r22 = this.f191876f;
        ((TextView) r22.getValue()).setText(((TextView) r22.getValue()).getContext().getString(R.string.messenger_suggestions_empty_fallback_text));
        D6.H((View) r32.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final LinearLayout e() {
        return (LinearLayout) this.f191875e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final View f() {
        return (View) this.f191874d.getValue();
    }

    /* compiled from: MessageScrollSuggestsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/conversation/mvi/message_scrollable_suggests/o$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            MessageSuggestsView.SuggestItem suggestItem = hVar instanceof MessageSuggestsView.SuggestItem ? (MessageSuggestsView.SuggestItem) hVar : null;
            if (suggestItem != null) {
                o oVar = o.this;
                oVar.getClass();
                kotlin.reflect.n<Object> nVar = o.f191871k[0];
                if (((n.b) oVar.f191880j.f319122b) instanceof n.b.e) {
                    oVar.f191878h.onNext(suggestItem);
                }
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
