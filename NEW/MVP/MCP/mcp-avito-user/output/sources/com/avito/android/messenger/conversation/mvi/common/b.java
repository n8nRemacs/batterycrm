package com.avito.android.messenger.conversation.mvi.common;

import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.common.a;
import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.o;
import u3.l;

/* compiled from: AboveInputActionsVisibleController.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/common/b;", "Lcom/avito/android/messenger/conversation/mvi/common/a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.messenger.conversation.mvi.common.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<MultiMessageSendTestGroup> f190153a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<a.InterfaceC5627a> f190154b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f190155c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<a.InterfaceC5627a> f190156d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f190157e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f190158f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<a> f190159g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final HashSet<com.avito.android.messenger.conversation.mvi.common.d> f190160h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final HashSet<a.InterfaceC5627a> f190161i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public y f190162j;

    /* compiled from: AboveInputActionsVisibleController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/common/b$b;", "", "<init>", "()V", "", "DEBOUNCE_BEFORE_FREE_QUEUE_MS", "J", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.common.b$b, reason: collision with other inner class name */
    public static final class C5630b {
        public /* synthetic */ C5630b(C42822w c42822w) {
            this();
        }

        public C5630b() {
        }
    }

    /* compiled from: AboveInputActionsVisibleController.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "kotlin.jvm.PlatformType", "values", "", "Lcom/avito/android/messenger/conversation/mvi/common/a$a;", "apply", "([Ljava/lang/Object;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f190167b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Object[]) obj) {
                a.InterfaceC5627a interfaceC5627a = obj2 instanceof a.InterfaceC5627a ? (a.InterfaceC5627a) obj2 : null;
                if (interfaceC5627a != null) {
                    arrayList.add(interfaceC5627a);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!(((a.InterfaceC5627a) next) instanceof a.InterfaceC5627a.c)) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }
    }

    /* compiled from: AboveInputActionsVisibleController.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/rxjava3/core/y;", "", "Lcom/avito/android/messenger/conversation/mvi/common/a$a;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/core/y;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            List list = (List) ((io.reactivex.rxjava3.core.y) obj).c();
            if (list != null) {
                b bVar = b.this;
                bVar.f190158f.clear();
                bVar.f190158f.addAll(list);
            }
        }
    }

    /* compiled from: AboveInputActionsVisibleController.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/messenger/conversation/mvi/common/a$a;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a.InterfaceC5627a interfaceC5627a;
            if (((List) obj).isEmpty()) {
                b bVar = b.this;
                if (bVar.f190161i.isEmpty() || (interfaceC5627a = (a.InterfaceC5627a) C42745f0.R(bVar.f190161i)) == null) {
                    return;
                }
                bVar.f190156d.accept(interfaceC5627a);
            }
        }
    }

    static {
        new C5630b(null);
    }

    @Inject
    public b(@x20.d @k l<MultiMessageSendTestGroup> lVar) {
        this.f190153a = lVar;
        com.jakewharton.rxrelay3.c<a.InterfaceC5627a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f190154b = cVar;
        this.f190155c = cVar;
        com.jakewharton.rxrelay3.c<a.InterfaceC5627a> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f190156d = cVar2;
        this.f190157e = cVar2;
        this.f190158f = new ArrayList();
        boolean z12 = false;
        this.f190159g = C42745f0.U(new a(a.InterfaceC5627a.d.C5629a.f190150a, 20, false, z12, 12, null), new a(a.InterfaceC5627a.d.b.f190151a, 20, false, false, 12, null), new a(a.InterfaceC5627a.d.c.f190152a, 20, z12, false, 12, null), new a(a.InterfaceC5627a.b.f190148a, 50, false, false, 12, null), new a(a.InterfaceC5627a.C5628a.f190147a, 70, true, true));
        this.f190160h = new HashSet<>();
        this.f190161i = new HashSet<>();
    }

    @Override // com.avito.android.messenger.conversation.mvi.common.a
    public final void a(@k a.InterfaceC5627a.C5628a c5628a) {
        this.f190161i.remove(c5628a);
    }

    @Override // com.avito.android.messenger.conversation.mvi.common.a
    public final void b(@k com.avito.android.messenger.conversation.mvi.common.d dVar) {
        this.f190160h.remove(dVar);
        i();
    }

    @Override // com.avito.android.messenger.conversation.mvi.common.a
    public final void c(@k com.avito.android.messenger.conversation.mvi.common.d dVar) {
        this.f190160h.add(dVar);
        i();
    }

    @Override // com.avito.android.messenger.conversation.mvi.common.a
    @k
    /* renamed from: d, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF190155c() {
        return this.f190155c;
    }

    @Override // com.avito.android.messenger.conversation.mvi.common.a
    public final void destroy() {
        this.f190160h.clear();
        this.f190158f.clear();
        y yVar = this.f190162j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.common.a
    public final boolean e(@k a.InterfaceC5627a interfaceC5627a) {
        if (!this.f190153a.f439745a.f439749b.a()) {
            return true;
        }
        a aVarH = h(interfaceC5627a);
        if (aVarH == null) {
            return false;
        }
        ArrayList arrayList = this.f190158f;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVarH2 = h((a.InterfaceC5627a) it.next());
            if (aVarH2 != null) {
                arrayList2.add(aVarH2);
            }
        }
        if (arrayList2.isEmpty()) {
            return true;
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                if (aVarH.f190164b <= aVar.f190164b && aVar.f190165c) {
                    return true;
                }
            }
        }
        return arrayList.contains(interfaceC5627a);
    }

    @Override // com.avito.android.messenger.conversation.mvi.common.a
    public final void f(@k a.InterfaceC5627a interfaceC5627a) {
        a aVarH = h(interfaceC5627a);
        if (aVarH == null) {
            return;
        }
        ArrayList arrayList = this.f190158f;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVarH2 = h((a.InterfaceC5627a) it.next());
            if (aVarH2 != null) {
                arrayList2.add(aVarH2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            a aVar = (a) next;
            if (aVarH.f190164b <= aVar.f190164b && aVar.f190165c) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            a aVar2 = (a) it3.next();
            this.f190154b.accept(aVar2.f190163a);
            if (aVar2.f190166d) {
                this.f190161i.add(aVar2.f190163a);
            }
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.common.a
    @k
    /* renamed from: g, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF190157e() {
        return this.f190157e;
    }

    public final a h(a.InterfaceC5627a interfaceC5627a) {
        Object next;
        Iterator<T> it = this.f190159g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((a) next).f190163a, interfaceC5627a)) {
                break;
            }
        }
        return (a) next;
    }

    public final void i() {
        HashSet<com.avito.android.messenger.conversation.mvi.common.d> hashSet = this.f190160h;
        ArrayList arrayList = new ArrayList(C42745f0.q(hashSet, 10));
        Iterator<com.avito.android.messenger.conversation.mvi.common.d> it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().Ga());
        }
        y yVar = this.f190162j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f190162j = (y) z.m(arrayList, c.f190167b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).G(new d()).y(50L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).t0(new e());
    }

    /* compiled from: AboveInputActionsVisibleController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/common/b$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final a.InterfaceC5627a f190163a;

        /* renamed from: b, reason: collision with root package name */
        public final int f190164b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f190165c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f190166d;

        public a(@k a.InterfaceC5627a interfaceC5627a, int i12, boolean z12, boolean z13) {
            this.f190163a = interfaceC5627a;
            this.f190164b = i12;
            this.f190165c = z12;
            this.f190166d = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f190163a, aVar.f190163a) && this.f190164b == aVar.f190164b && this.f190165c == aVar.f190165c && this.f190166d == aVar.f190166d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f190166d) + r.i(r.e(this.f190164b, this.f190163a.hashCode() * 31, 31), 31, this.f190165c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionTypePriority(actionType=");
            sb2.append(this.f190163a);
            sb2.append(", priority=");
            sb2.append(this.f190164b);
            sb2.append(", hideIfOtherHasMorePriority=");
            sb2.append(this.f190165c);
            sb2.append(", addToQueueIfHideByOtherPriorityAction=");
            return r.x(sb2, this.f190166d, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(a.InterfaceC5627a interfaceC5627a, int i12, boolean z12, boolean z13, int i13, C42822w c42822w) {
            z12 = (i13 & 4) != 0 ? false : z12;
            this(interfaceC5627a, i12, z12, (i13 & 8) != 0 ? z12 : z13);
        }
    }
}
