package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.messenger.blacklist.mvi.C31686p;
import com.avito.android.messenger.blacklist.mvi.InterfaceC31683m;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.util.X2;
import kotlin.collections.P0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class v implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f186523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC32892c f186524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f186525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f186526e;

    public /* synthetic */ v(AbstractC32892c abstractC32892c, Object obj, Object obj2, int i12) {
        this.f186523b = i12;
        this.f186524c = abstractC32892c;
        this.f186525d = obj;
        this.f186526e = obj2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        switch (this.f186523b) {
            case 0:
                ((C31686p) this.f186524c).f186485X.accept(com.avito.android.messenger.util.q.a((Throwable) obj));
                InterfaceC31683m.a aVar = (InterfaceC31683m.a) this.f186525d;
                return InterfaceC31683m.a.a(aVar, null, null, null, null, false, P0.i(aVar.f186476f, ((C31686p.h) this.f186526e).f186507d), 31);
            default:
                X2 x22 = X2.f318778a;
                String strConcat = ((String) this.f186525d).concat(" failed");
                x22.a(((com.avito.android.messenger.conversation.mvi.send.D) this.f186524c).f207131E, strConcat, (Throwable) obj);
                return SendMessagePresenter.State.a((SendMessagePresenter.State) this.f186526e, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, SendMessagePresenter.VoiceRecorderState.Empty.f194447b, false, null, null, Integer.MAX_VALUE, 7);
        }
    }
}
