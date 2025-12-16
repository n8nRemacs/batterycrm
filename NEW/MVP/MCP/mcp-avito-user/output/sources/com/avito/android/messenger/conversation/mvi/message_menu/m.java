package com.avito.android.messenger.conversation.mvi.message_menu;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.message_menu.AbstractC32118b;
import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.F;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.InterfaceC35745a5;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MessageMenuPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/m;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "a", "b", "c", "d", "e", "f", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m extends AbstractC32892c<l.a> implements l {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.messenger.conversation.mvi.message_menu.c> f191779V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.message_menu.e f191780W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final Y81.c f191781X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31987a f191782Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final JY.a f191783Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f191784a0;

    /* compiled from: MessageMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/m$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<l.a> {
        public a() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final l.a d(l.a aVar) {
            l.a aVar2 = aVar;
            if (aVar2.equals(l.a.C5666a.f191764a) ? true : aVar2 instanceof l.a.b) {
                return aVar2;
            }
            if (aVar2 instanceof l.a.c) {
                return m.me(m.this, (l.a.c) aVar2);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: MessageMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/m$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<l.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Y81.a f191786d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f191787e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f191788f;

        public b(@Y61.k Y81.a aVar, boolean z12, boolean z13) {
            StringBuilder sb2 = new StringBuilder("config = ");
            sb2.append(aVar);
            sb2.append(", allowQuickReplies = ");
            sb2.append(z12);
            sb2.append(", ");
            super(null, androidx.appcompat.app.r.s(" = allowQuoteReplies", sb2, z13), 1, null);
            this.f191786d = aVar;
            this.f191787e = z12;
            this.f191788f = z13;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final l.a d(l.a aVar) {
            l.a aVar2 = aVar;
            Y81.a f191774a = aVar2.getF191774a();
            Y81.a aVar3 = this.f191786d;
            boolean zF2 = L.f(aVar3, f191774a);
            boolean z12 = this.f191788f;
            boolean z13 = this.f191787e;
            return (zF2 && Boolean.valueOf(z13).equals(aVar2.b()) && Boolean.valueOf(z12).equals(aVar2.a())) ? aVar2 : new l.a.b(aVar3, z13, z12);
        }
    }

    /* compiled from: MessageMenuPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/m$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.o<l.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f191789d;

        public c(@Y61.k String str) {
            super(null, null, 3, null);
            this.f191789d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final l.a d(l.a aVar) {
            String str;
            Object next;
            l.a aVar2 = aVar;
            if (aVar2.equals(l.a.C5666a.f191764a) ? true : aVar2 instanceof l.a.b ? true : aVar2 instanceof l.a.c.C5667a) {
                return aVar2;
            }
            if (!(aVar2 instanceof l.a.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            l.a.c.b bVar = (l.a.c.b) aVar2;
            ArrayList arrayList = bVar.f191778e;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof AbstractC32118b.a) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                str = this.f191789d;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((AbstractC32118b.a) next).f191560a, str)) {
                    break;
                }
            }
            if (((AbstractC32118b.a) next) == null) {
                return aVar2;
            }
            m mVar = m.this;
            InterfaceC32117a interfaceC32117aNe = m.ne(str, mVar.f191779V);
            if (interfaceC32117aNe == null) {
                return aVar2;
            }
            com.avito.android.messenger.conversation.mvi.message_menu.d dVar = bVar.f191776c;
            ActionConfirmation actionConfirmationB = interfaceC32117aNe.b();
            if (actionConfirmationB != null) {
                return new l.a.c.C5667a(bVar.f191774a, bVar.f191775b, dVar, bVar.f191777d, this.f191789d, actionConfirmationB);
            }
            mVar.le().s(interfaceC32117aNe.c(dVar));
            return m.me(mVar, (l.a.c) aVar2);
        }
    }

    /* compiled from: MessageMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/m$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<l.a> {
        public d() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final l.a d(l.a aVar) {
            l.a aVar2 = aVar;
            if (aVar2.equals(l.a.C5666a.f191764a) ? true : aVar2 instanceof l.a.b ? true : aVar2 instanceof l.a.c.b) {
                return aVar2;
            }
            if (!(aVar2 instanceof l.a.c.C5667a)) {
                throw new NoWhenBranchMatchedException();
            }
            m mVar = m.this;
            l.a.c.C5667a c5667a = (l.a.c.C5667a) aVar2;
            InterfaceC32117a interfaceC32117aNe = m.ne(c5667a.f191772e, mVar.f191779V);
            if (interfaceC32117aNe != null) {
                mVar.le().s(interfaceC32117aNe.c(c5667a.f191770c));
            }
            return m.me(mVar, (l.a.c) aVar2);
        }
    }

    /* compiled from: MessageMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/m$e;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f191792a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f191793b;

        public e(boolean z12, boolean z13) {
            this.f191792a = z12;
            this.f191793b = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f191792a == eVar.f191792a && this.f191793b == eVar.f191793b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f191793b) + (Boolean.hashCode(this.f191792a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RepliesAllowFlags(allowQuickReplies=");
            sb2.append(this.f191792a);
            sb2.append(", allowQuoteReplies=");
            return androidx.appcompat.app.r.x(sb2, this.f191793b, ')');
        }
    }

    @k0
    public m() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public m(@Y61.k List<com.avito.android.messenger.conversation.mvi.message_menu.c> list, @Y61.k com.avito.android.messenger.conversation.mvi.message_menu.e eVar, @Y61.k Y81.c cVar, @Y61.k InterfaceC31987a interfaceC31987a, @Y61.k JY.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("MessageActionsMenuPresenter", l.a.C5666a.f191764a, interfaceC35745a5, null, new F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0), null, null, null, 232, null);
        this.f191779V = list;
        this.f191780W = eVar;
        this.f191781X = cVar;
        this.f191782Y = interfaceC31987a;
        this.f191783Z = aVar;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f191784a0 = cVar2;
        io.reactivex.rxjava3.core.z<InterfaceC31987a.C5631a> zVarM0 = interfaceC31987a.M0();
        InterfaceC35745a5 interfaceC35745a52 = this.f207133K;
        cVar2.b(cVar.getConfig().s(interfaceC35745a52.c()).p(new o(com.avito.android.util.rx3.arrow.b.a(zVarM0.j0(interfaceC35745a52.c()).d0(new q(this))).D(io.reactivex.rxjava3.internal.functions.a.f401991a))).x0(interfaceC35745a52.c()).t0(new p(this)));
    }

    public static final l.a.b me(m mVar, l.a.c cVar) {
        mVar.getClass();
        return new l.a.b(cVar.getF191774a(), cVar.b().booleanValue(), cVar.a().booleanValue());
    }

    @Y61.l
    public static InterfaceC32117a ne(@Y61.k String str, @Y61.k List list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC32117a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC32117a) next).d().equals(str)) {
                break;
            }
        }
        return (InterfaceC32117a) next;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.l
    public final void Cc(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage, @Y61.k String str) {
        le().s(new f(bVar, localMessage, str));
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.l
    public final void Sd() {
        le().s(new a());
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.l
    public final void k4() {
        le().s(new d());
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f191784a0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.l
    public final void tb(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage) {
        le().s(new f(this, bVar, localMessage, null, 4, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.l
    public final void y9(@Y61.k String str) {
        le().s(new c(str));
    }

    /* compiled from: MessageMenuPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/m$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends com.avito.android.mvi.rx3.with_monolithic_state.o<l.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final T1.d.b f191794d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f191795e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f191796f;

        public f(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage, @Y61.l String str) {
            super(null, null, 3, null);
            this.f191794d = bVar;
            this.f191795e = localMessage;
            this.f191796f = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final l.a d(l.a aVar) {
            l.a aVar2 = aVar;
            if (aVar2.equals(l.a.C5666a.f191764a)) {
                return aVar2;
            }
            boolean z12 = aVar2 instanceof l.a.b;
            LocalMessage localMessage = this.f191795e;
            m mVar = m.this;
            if (z12) {
                l.a.b bVar = (l.a.b) aVar2;
                com.avito.android.messenger.conversation.mvi.message_menu.d dVarA = mVar.f191780W.a(bVar.f191765a, this.f191794d, this.f191795e, this.f191796f, bVar.f191766b, (!bVar.f191767c || (localMessage.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromAvito) || (localMessage.getBody() instanceof MessageBody.SystemMessageBody.Text) || (localMessage.getBody() instanceof MessageBody.SystemMessageBody.Unknown)) ? false : true);
                if (dVarA == null) {
                    return aVar2;
                }
                ArrayList arrayListE = e(dVarA);
                if (arrayListE.isEmpty()) {
                    return aVar2;
                }
                return new l.a.c.b(bVar.f191765a, bVar.f191766b, dVarA, bVar.f191767c, arrayListE);
            }
            if (!(aVar2 instanceof l.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            l.a.c cVar = (l.a.c) aVar2;
            boolean z13 = (!cVar.a().booleanValue() || (localMessage.getBody() instanceof MessageBody.SystemMessageBody.Platform.FromAvito) || (localMessage.getBody() instanceof MessageBody.SystemMessageBody.Text) || (localMessage.getBody() instanceof MessageBody.SystemMessageBody.Unknown)) ? false : true;
            com.avito.android.messenger.conversation.mvi.message_menu.d dVarA2 = mVar.f191780W.a(cVar.getF191774a(), this.f191794d, this.f191795e, this.f191796f, cVar.b().booleanValue(), z13);
            if (dVarA2 == null) {
                return m.me(mVar, cVar);
            }
            if (dVarA2.equals(cVar.getF191776c())) {
                return aVar2;
            }
            ArrayList arrayListE2 = e(dVarA2);
            return !arrayListE2.isEmpty() ? new l.a.c.b(cVar.getF191774a(), cVar.b().booleanValue(), dVarA2, cVar.a().booleanValue(), arrayListE2) : m.me(mVar, cVar);
        }

        public final ArrayList e(com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
            List<com.avito.android.messenger.conversation.mvi.message_menu.c> list = m.this.f191779V;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC32118b abstractC32118bA = ((com.avito.android.messenger.conversation.mvi.message_menu.c) it.next()).a(dVar);
                if (abstractC32118bA != null) {
                    arrayList.add(abstractC32118bA);
                }
            }
            return arrayList;
        }

        public /* synthetic */ f(m mVar, T1.d.b bVar, LocalMessage localMessage, String str, int i12, C42822w c42822w) {
            this(bVar, localMessage, (i12 & 4) != 0 ? null : str);
        }
    }
}
