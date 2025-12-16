package com.avito.android.messenger.conversation.mvi.multi_message;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.transition.C23492c;
import androidx.transition.J;
import androidx.transition.Q;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.multi_message.m;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: MultiMessageBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/i;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements d {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f193700h = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/conversation/mvi/multi_message/MultiMessagePresenter$State;", i.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f193701b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f193702c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193703d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f193704e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f193705f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C35971x f193706g;

    public i(@Y61.k ViewGroup viewGroup) {
        this.f193701b = viewGroup;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f193702c = cVar;
        this.f193703d = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f193704e = cVar2;
        this.f193705f = cVar2;
        this.f193706g = new C35971x();
    }

    @Override // com.avito.android.mvi.e
    public final m.b a(com.avito.android.mvi.e<m.b> eVar) {
        kotlin.reflect.n<Object> nVar = f193700h[0];
        return (m.b) this.f193706g.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.messenger.conversation.mvi.multi_message.m$b] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f193700h[0];
        this.f193706g.f319122b = (m.b) obj;
    }

    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<m.b> eVar, m.b bVar, m.b bVar2) {
        m.b bVar3 = bVar2;
        ViewGroup viewGroup = this.f193701b;
        ComposeView composeView = (ComposeView) viewGroup.findViewById(R.id.multi_message_banner);
        if (bVar3 instanceof m.b.a) {
            if (D6.y(composeView)) {
                Q5 q52 = new Q5(new J(80));
                q52.a(R.id.reply_suggests);
                Q.a(viewGroup, q52.c());
            }
            D6.w(composeView);
            return;
        }
        if (bVar3 instanceof m.b.C5728b) {
            composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
            composeView.setContent(new C22096n(-1034916751, new h(bVar3, this), true));
            if (!D6.y(composeView)) {
                Q5 q53 = new Q5(new C23492c());
                q53.a(R.id.reply_suggests);
                Q.a(viewGroup, q53.c());
            }
            D6.H(composeView);
        }
    }
}
