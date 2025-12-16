package com.avito.android.messenger.conversation.mvi.quick_replies;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.quick_replies.d;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import j.e0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: QuickRepliesView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/r;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/q;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements q {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f194121o = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/conversation/mvi/quick_replies/QuickRepliesPresenter$State;", r.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f194122b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f194123c;

    /* renamed from: d, reason: collision with root package name */
    public final int f194124d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f194125e;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f194132l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public a f194133m;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C35971x f194126f = new C35971x();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194127g = new com.jakewharton.rxrelay3.c();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194128h = new com.jakewharton.rxrelay3.c();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194129i = new com.jakewharton.rxrelay3.c();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194130j = new com.jakewharton.rxrelay3.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f194131k = new com.jakewharton.rxrelay3.c();

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Object f194134n = C42727D.b(LazyThreadSafetyMode.f406616d, new b());

    /* compiled from: QuickRepliesView.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/r$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RecyclerView f194135a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.konveyor.adapter.j f194136b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final View f194137c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final View f194138d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final TextView f194139e;

        public a(@Y61.k RecyclerView recyclerView, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k View view, @Y61.k View view2, @Y61.k TextView textView) {
            this.f194135a = recyclerView;
            this.f194136b = jVar;
            this.f194137c = view;
            this.f194138d = view2;
            this.f194139e = textView;
        }
    }

    /* compiled from: QuickRepliesView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/confirmation_dialog/a;", "invoke", "()Lcom/avito/android/messenger/conversation/confirmation_dialog/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.messenger.conversation.confirmation_dialog.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.messenger.conversation.confirmation_dialog.a invoke() {
            return new com.avito.android.messenger.conversation.confirmation_dialog.a(r.this.f194125e);
        }
    }

    public r(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2, @e0 int i12) {
        this.f194122b = aVar;
        this.f194123c = aVar2;
        this.f194124d = i12;
        this.f194125e = viewGroup.getContext();
    }

    @Override // com.avito.android.mvi.e
    public final d.a a(com.avito.android.mvi.e<d.a> eVar) {
        kotlin.reflect.n<Object> nVar = f194121o[0];
        return (d.a) this.f194126f.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.messenger.conversation.mvi.quick_replies.d$a] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f194121o[0];
        this.f194126f.f319122b = (d.a) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final com.avito.android.messenger.conversation.confirmation_dialog.a c() {
        return (com.avito.android.messenger.conversation.confirmation_dialog.a) this.f194134n.getValue();
    }

    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<d.a> eVar, d.a aVar, d.a aVar2) {
        d.a aVar3 = aVar2;
        if (aVar3.equals(d.a.C5744a.f194092a)) {
            c().a();
            e();
            return;
        }
        boolean zEquals = aVar3.equals(d.a.b.C5748b.f194097a);
        com.avito.konveyor.adapter.a aVar4 = this.f194122b;
        Context context = this.f194125e;
        if (zEquals) {
            c().a();
            com.avito.android.lib.design.bottom_sheet.d dVar = this.f194132l;
            if (dVar != null && this.f194133m != null) {
                dVar.L(dVar.getContext().getText(R.string.messenger_quick_replies_title), null, true, false);
                dVar.P(null);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
                a aVar5 = this.f194133m;
                if (aVar5 != null) {
                    D6.w(aVar5.f194135a);
                    aVar4.c(new UV0.c(C42784z0.f406748b));
                    aVar5.f194136b.notifyDataSetChanged();
                    D6.H(aVar5.f194137c);
                    D6.g(aVar5.f194138d);
                    return;
                }
                return;
            }
            e();
            com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
            dVar2.C(R.layout.messenger_quick_replies_list, new s(this, this));
            dVar2.L(dVar2.getContext().getText(R.string.messenger_quick_replies_title), null, true, false);
            dVar2.P(null);
            com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
            int iD2 = C35835l0.d(R.attr.blue, context);
            com.avito.android.lib.design.bottom_sheet.q qVar = dVar2.f178530x;
            if (qVar != null) {
                qVar.d(iD2);
            }
            dVar2.N(true);
            dVar2.R(new B(this));
            dVar2.setCanceledOnTouchOutside(false);
            dVar2.setCancelable(false);
            com.avito.android.lib.util.g.a(dVar2);
            this.f194132l = dVar2;
            return;
        }
        if (aVar3.equals(d.a.b.InterfaceC5745a.C5746a.f194093a)) {
            c().a();
            com.avito.android.lib.design.bottom_sheet.d dVar3 = this.f194132l;
            if (dVar3 != null && this.f194133m != null) {
                dVar3.L(null, null, true, false);
                dVar3.P(null);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar3, true);
                a aVar6 = this.f194133m;
                if (aVar6 != null) {
                    D6.w(aVar6.f194135a);
                    aVar4.c(new UV0.c(C42784z0.f406748b));
                    aVar6.f194136b.notifyDataSetChanged();
                    D6.w(aVar6.f194137c);
                    aVar6.f194139e.setText(this.f194124d);
                    D6.H(aVar6.f194138d);
                    return;
                }
                return;
            }
            e();
            com.avito.android.lib.design.bottom_sheet.d dVar4 = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
            dVar4.C(R.layout.messenger_quick_replies_list, new t(this, this));
            dVar4.L(null, null, true, false);
            dVar4.P(null);
            com.avito.android.lib.design.bottom_sheet.d.I(dVar4, true);
            int iD3 = C35835l0.d(R.attr.blue, context);
            com.avito.android.lib.design.bottom_sheet.q qVar2 = dVar4.f178530x;
            if (qVar2 != null) {
                qVar2.d(iD3);
            }
            dVar4.N(true);
            dVar4.R(new B(this));
            dVar4.setCanceledOnTouchOutside(false);
            dVar4.setCancelable(false);
            com.avito.android.lib.util.g.a(dVar4);
            this.f194132l = dVar4;
            return;
        }
        if (aVar3 instanceof d.a.b.InterfaceC5745a.c) {
            c().a();
            com.avito.android.lib.design.bottom_sheet.d dVar5 = this.f194132l;
            if (dVar5 != null && this.f194133m != null) {
                dVar5.L(dVar5.getContext().getText(R.string.messenger_quick_replies_title), dVar5.getContext().getText(R.string.messenger_quick_replies_start_edit_action_title), true, false);
                dVar5.P(new x(this));
                dVar5.S(C35835l0.g(context).y);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar5, false);
                a aVar7 = this.f194133m;
                if (aVar7 != null) {
                    D6.H(aVar7.f194135a);
                    aVar4.c(new UV0.c(((d.a.b.InterfaceC5745a.c) aVar3).f194096a));
                    aVar7.f194136b.notifyDataSetChanged();
                    D6.w(aVar7.f194137c);
                    D6.g(aVar7.f194138d);
                    return;
                }
                return;
            }
            e();
            com.avito.android.lib.design.bottom_sheet.d dVar6 = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
            dVar6.C(R.layout.messenger_quick_replies_list, new u(this, this, aVar3));
            dVar6.L(dVar6.getContext().getText(R.string.messenger_quick_replies_title), dVar6.getContext().getText(R.string.messenger_quick_replies_start_edit_action_title), true, false);
            dVar6.P(new x(this));
            dVar6.S(C35835l0.g(context).y);
            com.avito.android.lib.design.bottom_sheet.d.I(dVar6, false);
            int iD4 = C35835l0.d(R.attr.blue, context);
            com.avito.android.lib.design.bottom_sheet.q qVar3 = dVar6.f178530x;
            if (qVar3 != null) {
                qVar3.d(iD4);
            }
            dVar6.N(true);
            dVar6.R(new B(this));
            dVar6.setCanceledOnTouchOutside(false);
            dVar6.setCancelable(false);
            com.avito.android.lib.util.g.a(dVar6);
            this.f194132l = dVar6;
            return;
        }
        if (aVar3 instanceof d.a.b.InterfaceC5745a.C5747b) {
            com.avito.android.lib.design.bottom_sheet.d dVar7 = this.f194132l;
            if (dVar7 == null || this.f194133m == null) {
                e();
                com.avito.android.lib.design.bottom_sheet.d dVar8 = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
                dVar8.C(R.layout.messenger_quick_replies_list, new v(this, this, aVar3));
                dVar8.L(dVar8.getContext().getText(R.string.messenger_quick_replies_title), dVar8.getContext().getText(R.string.messenger_quick_replies_finish_edit_action_title), true, false);
                dVar8.P(new y(this));
                dVar8.S(C35835l0.g(context).y);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar8, false);
                int iD5 = C35835l0.d(R.attr.blue, context);
                com.avito.android.lib.design.bottom_sheet.q qVar4 = dVar8.f178530x;
                if (qVar4 != null) {
                    qVar4.d(iD5);
                }
                dVar8.N(true);
                dVar8.R(new B(this));
                dVar8.setCanceledOnTouchOutside(false);
                dVar8.setCancelable(false);
                com.avito.android.lib.util.g.a(dVar8);
                this.f194132l = dVar8;
            } else {
                dVar7.L(dVar7.getContext().getText(R.string.messenger_quick_replies_title), dVar7.getContext().getText(R.string.messenger_quick_replies_finish_edit_action_title), true, false);
                dVar7.P(new y(this));
                dVar7.S(C35835l0.g(context).y);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar7, false);
                a aVar8 = this.f194133m;
                if (aVar8 != null) {
                    D6.H(aVar8.f194135a);
                    aVar4.c(new UV0.c(((d.a.b.InterfaceC5745a.C5747b) aVar3).f194094a));
                    aVar8.f194136b.notifyDataSetChanged();
                    D6.w(aVar8.f194137c);
                    D6.g(aVar8.f194138d);
                }
            }
            if (((d.a.b.InterfaceC5745a.C5747b) aVar3).f194095b == null) {
                c().a();
            } else {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                c().c(new ActionConfirmation(context.getString(R.string.messenger_quick_reply_delete_dialog_title), "", context.getString(R.string.messenger_quick_reply_delete_dialog_confirm), context.getString(R.string.messenger_quick_reply_delete_dialog_cancel)), new z(atomicBoolean, this), new w(atomicBoolean, this));
            }
        }
    }

    public final void e() {
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f194132l;
        if (dVar != null) {
            dVar.R(null);
        }
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f194132l;
        if (dVar2 != null) {
            dVar2.setCancelable(true);
        }
        com.avito.android.lib.design.bottom_sheet.d dVar3 = this.f194132l;
        if (dVar3 != null) {
            dVar3.r();
        }
        this.f194132l = null;
        this.f194133m = null;
    }
}
