package com.avito.android.messenger.conversation.mvi.platform_actions;

import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.messenger.conversation.mvi.platform_actions.g;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PlatformActionsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/RawJson;", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "apply", "(Lcom/avito/android/remote/model/RawJson;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.b.a f194023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f194024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f.InterfaceC5732f f194025d;

    public j(g.b.a aVar, g gVar, f.InterfaceC5732f interfaceC5732f) {
        this.f194023b = aVar;
        this.f194024c = gVar;
        this.f194025d = interfaceC5732f;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ContextActionHandler.MethodCall.Reaction reaction = this.f194023b.f193952f;
        f.InterfaceC5732f interfaceC5732f = this.f194025d;
        g gVar = this.f194024c;
        if (reaction == null) {
            return I.q(g.ne(gVar, (f.InterfaceC5732f.b.a.C5733a) interfaceC5732f));
        }
        InterfaceC32187a interfaceC32187a = gVar.f193932V;
        f.c cVar = ((f.InterfaceC5732f.b.a.C5733a) interfaceC5732f).f193900a;
        MessengerUserHashInfo messengerUserHashInfo = cVar.f193888a;
        return interfaceC32187a.c(cVar.f193889b, reaction.getText(), messengerUserHashInfo).B(f.InterfaceC5732f.a.f193899a);
    }
}
