package com.avito.android.messenger.conversation.mvi.message_scrollable_suggests;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.g;
import com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.n;
import com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.F;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MessageScrollSuggestsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/l;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/g;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l extends AbstractC32892c<n.b> implements g {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final String f191850V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.a f191851W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f191852X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final D<g.a> f191853Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final D f191854Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f191855a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public String f191856b0;

    /* compiled from: MessageScrollSuggestsPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/utils/c;", "", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/a$b;", "either", "Lkotlin/G0;", "accept", "(Lcom/avito/android/arch/mvi/utils/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            n.b eVar;
            com.avito.android.arch.mvi.utils.c cVar = (com.avito.android.arch.mvi.utils.c) obj;
            boolean z12 = cVar instanceof c.C2712c;
            l lVar = l.this;
            if (!z12) {
                if (!(cVar instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar.le().s(new h(null, null, new i((Throwable) ((c.b) cVar).f92027b), 3, null));
                return;
            }
            InterfaceC32119a.b bVar = (InterfaceC32119a.b) ((c.C2712c) cVar).f92028b;
            if (bVar.f191943b.isEmpty()) {
                eVar = bVar.f191945d ? n.b.c.f191867b : n.b.a.f191865b;
            } else {
                lVar.getClass();
                List<MessageSuggest> list = bVar.f191943b;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                int i12 = 0;
                for (T t12 : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    MessageSuggest messageSuggest = (MessageSuggest) t12;
                    String previewText = messageSuggest.getPreviewText();
                    String messageText = messageSuggest.getMessageText();
                    int id2 = messageSuggest.getId();
                    RawJson intent = messageSuggest.getIntent();
                    arrayList.add(new MessageSuggestsView.SuggestItem(id2, i12, previewText, messageText, intent != null ? intent.getValue() : null));
                    i12 = i13;
                }
                eVar = new n.b.e(bVar.f191942a, arrayList);
            }
            lVar.le().s(new j(null, null, new k(eVar), 3, null));
        }
    }

    /* compiled from: MessageScrollSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/messenger/conversation/mvi/message_scrollable_suggests/l$b", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.mvi.rx3.with_monolithic_state.o<n.b> {
    }

    /* compiled from: MessageScrollSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "old", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;)Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<n.b, n.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f191858l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final n.b invoke(n.b bVar) {
            return new n.b.d(bVar.f191864a);
        }
    }

    /* compiled from: MessageScrollSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/messenger/conversation/mvi/message_scrollable_suggests/l$d", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<n.b> {
    }

    /* compiled from: MessageScrollSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "old", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;)Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<n.b, n.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f191859l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final n.b invoke(n.b bVar) {
            return new n.b.d(bVar.f191864a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public l(@InterfaceC32438g0 @Y61.k String str, @Y61.k com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("MessageScrollSuggestsPresenter", n.b.a.f191865b, interfaceC35745a5, null, new F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0), null, null, null, 232, null);
        this.f191850V = str;
        this.f191851W = aVar;
        this.f191852X = interfaceC28373a;
        D<g.a> d12 = new D<>();
        this.f191853Y = d12;
        this.f191854Z = d12;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f191855a0 = cVar;
        this.f191856b0 = "";
        cVar.b(aVar.a().j0(interfaceC35745a5.e()).t0(new a()));
        le().s(new b(null, null, c.f191858l, 3, null));
        aVar.c2();
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.g
    public final void Uc(@Y61.k MessageSuggestsView.SuggestItem suggestItem) {
        String strConcat = suggestItem.f191927c;
        this.f191852X.c(new com.avito.android.messenger.conversation.analytics.h(this.f191850V, strConcat));
        String str = this.f191856b0;
        if (str.length() != 0) {
            int iMin = Math.min(str.length(), strConcat.length());
            while (true) {
                if (iMin <= 0) {
                    strConcat = C43066x.C0(str).toString() + strConcat;
                    break;
                }
                if (C43066x.z(str, strConcat.substring(0, iMin), true)) {
                    strConcat = C43066x.y(iMin, str).concat(strConcat);
                    break;
                }
                iMin--;
            }
        }
        this.f191853Y.postValue(new g.a(strConcat));
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.g
    @Y61.k
    /* renamed from: Ud, reason: from getter */
    public final D getF191854Z() {
        return this.f191854Z;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.g
    public final void b2(@Y61.k String str) {
        this.f191856b0 = str;
        le().s(new d(null, null, e.f191859l, 3, null));
        this.f191851W.b2(str);
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f191851W.destroy();
        this.f191855a0.e();
    }
}
