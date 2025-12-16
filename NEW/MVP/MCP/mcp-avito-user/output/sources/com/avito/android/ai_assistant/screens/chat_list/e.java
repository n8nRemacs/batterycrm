package com.avito.android.ai_assistant.screens.chat_list;

import Wb.InterfaceC15738a;
import Y41.l;
import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.ai_assistant.components.placeholder.AiAssistantPlaceholderView;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AiAssistantChatListView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/e;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f89592a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15738a, G0> f89593b;

    /* renamed from: c, reason: collision with root package name */
    public final NavBar f89594c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f89595d;

    /* renamed from: e, reason: collision with root package name */
    public final AiAssistantPlaceholderView f89596e;

    /* compiled from: AiAssistantChatListView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            e.this.f89593b.invoke(InterfaceC15738a.b.f17962a);
            return G0.f406611a;
        }
    }

    /* compiled from: AiAssistantChatListView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Integer, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            num.intValue();
            e.this.f89593b.invoke(InterfaceC15738a.C1273a.f17961a);
            return G0.f406611a;
        }
    }

    public e(@k l lVar, @k View view, @k com.avito.konveyor.adapter.d dVar) {
        this.f89592a = dVar;
        this.f89593b = lVar;
        this.f89594c = (NavBar) view.findViewById(R.id.buyer_assistant_chat_list_navbar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.buyer_assistant_chat_list_recycler);
        this.f89595d = recyclerView;
        this.f89596e = (AiAssistantPlaceholderView) view.findViewById(R.id.buyer_assistant_chat_list_content_placeholder);
        a(null);
        recyclerView.setAdapter(dVar);
        recyclerView.l(new PV.a(y6.b(0), y6.b(16), 0, 0, 12, null), -1);
    }

    public final void a(String str) {
        NavBar navBar = this.f89594c;
        Drawable drawableH = C35835l0.h(R.attr.ic_plus24, navBar.getContext());
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(null, new a(), false, str, null, C42745f0.V(drawableH != null ? new a.C5289a(drawableH, null, null, 0, 0, 0, 62, null) : null), new b(), 21, null));
    }
}
