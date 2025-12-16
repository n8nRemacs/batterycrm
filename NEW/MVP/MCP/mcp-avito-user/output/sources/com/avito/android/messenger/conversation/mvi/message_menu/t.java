package com.avito.android.messenger.conversation.mvi.message_menu;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: MessageMenuView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/t;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/s;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t implements s {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f191808j = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/conversation/mvi/message_menu/MessageMenuPresenter$State;", t.class))};

    /* renamed from: b, reason: collision with root package name */
    public final Context f191809b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f191810c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f191811d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f191812e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C35971x f191813f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.confirmation_dialog.a f191814g;

    /* renamed from: h, reason: collision with root package name */
    public int f191815h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.o f191816i;

    /* compiled from: MessageMenuView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ View f191818m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f191818m = view;
        }

        @Override // Y41.a
        public final G0 invoke() {
            t.this.f191815h = (this.f191818m.getMeasuredHeight() * 2) / 3;
            return G0.f406611a;
        }
    }

    public t(@Y61.k View view) {
        Context context = view.getContext();
        this.f191809b = context;
        this.f191810c = new com.jakewharton.rxrelay3.c();
        this.f191811d = new com.jakewharton.rxrelay3.c();
        this.f191812e = new com.jakewharton.rxrelay3.c();
        this.f191813f = new C35971x();
        this.f191814g = new com.avito.android.messenger.conversation.confirmation_dialog.a(context);
        this.f191815h = -1;
        D6.B(new a(view), view);
    }

    @Override // com.avito.android.mvi.e
    public final l.a a(com.avito.android.mvi.e<l.a> eVar) {
        kotlin.reflect.n<Object> nVar = f191808j[0];
        return (l.a) this.f191813f.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.messenger.conversation.mvi.message_menu.l$a] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f191808j[0];
        this.f191813f.f319122b = (l.a) obj;
    }

    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<l.a> eVar, l.a aVar, l.a aVar2) {
        l.a aVar3 = aVar2;
        boolean z12 = aVar3.equals(l.a.C5666a.f191764a) ? true : aVar3 instanceof l.a.b;
        com.avito.android.messenger.conversation.confirmation_dialog.a aVar4 = this.f191814g;
        if (z12) {
            aVar4.a();
            com.avito.android.lib.design.bottom_sheet.o oVar = this.f191816i;
            if (oVar != null) {
                oVar.dismiss();
                return;
            }
            return;
        }
        if (aVar3 instanceof l.a.c.b) {
            com.avito.android.lib.design.bottom_sheet.o oVar2 = this.f191816i;
            if (oVar2 != null) {
                oVar2.dismiss();
            }
            aVar4.a();
            this.f191816i = new com.avito.android.lib.design.bottom_sheet.o(this.f191809b, new B(this, (l.a.c.b) aVar3));
            return;
        }
        if (aVar3 instanceof l.a.c.C5667a) {
            com.avito.android.lib.design.bottom_sheet.o oVar3 = this.f191816i;
            if (oVar3 != null) {
                oVar3.dismiss();
            }
            aVar4.a();
            aVar4.c(((l.a.c.C5667a) aVar3).f191773f, new u(this), new v(this));
        }
    }
}
