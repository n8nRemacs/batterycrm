package com.avito.android.messenger.conversation.mvi.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.menu.t;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import com.avito.android.util.L5;
import com.avito.android.util.N0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelMenuView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/u;", "Lcom/avito/android/messenger/conversation/mvi/menu/t;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u implements t {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f191533m = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/conversation/mvi/menu/ChannelMenuView$State;", u.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f191534b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f191535c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f191536d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f191537e = new com.jakewharton.rxrelay3.c();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f191538f = new com.jakewharton.rxrelay3.c();

    /* renamed from: g, reason: collision with root package name */
    public final Context f191539g;

    /* renamed from: h, reason: collision with root package name */
    public final Resources f191540h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.confirmation_dialog.a f191541i;

    /* renamed from: j, reason: collision with root package name */
    public int f191542j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.o f191543k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C35971x f191544l;

    /* compiled from: ChannelMenuView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            u uVar = u.this;
            uVar.f191542j = (uVar.f191534b.getMeasuredHeight() * 2) / 3;
            return G0.f406611a;
        }
    }

    public u(@Y61.k View view, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C30277e1 c30277e1) {
        this.f191534b = view;
        this.f191535c = interfaceC28373a;
        this.f191536d = c30277e1;
        Context context = view.getContext();
        this.f191539g = context;
        this.f191540h = context.getResources();
        this.f191541i = new com.avito.android.messenger.conversation.confirmation_dialog.a(context);
        this.f191542j = -1;
        this.f191544l = new C35971x();
        D6.B(new a(), view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final t.e a(com.avito.android.mvi.e<t.e> eVar) {
        kotlin.reflect.n<Object> nVar = f191533m[0];
        return (t.e) this.f191544l.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.messenger.conversation.mvi.menu.t$e] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f191533m[0];
        this.f191544l.f319122b = (t.e) obj;
    }

    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<t.e> eVar, t.e eVar2, t.e eVar3) {
        t.e eVar4 = eVar3;
        if (eVar4.equals(t.e.a.f191527a)) {
            N0.a(this.f191543k);
            return;
        }
        com.avito.android.lib.design.bottom_sheet.o oVar = null;
        if (eVar4 instanceof t.e.b) {
            N0.a(this.f191543k);
            this.f191543k = null;
            return;
        }
        if (eVar4 instanceof t.e.c) {
            N0.a(this.f191543k);
            t.e.c cVar = (t.e.c) eVar4;
            t.b bVar = cVar.f191530a;
            boolean zB2 = bVar.f191505a.b();
            Context context = this.f191539g;
            if (zB2 && bVar.f191506b.isEmpty()) {
                L5.a(context, R.string.messenger_profile_is_not_available, 0);
                ((n) cVar.f191532c).invoke();
            } else {
                oVar = new com.avito.android.lib.design.bottom_sheet.o(context, new H(this, cVar));
            }
            this.f191543k = oVar;
        }
    }
}
