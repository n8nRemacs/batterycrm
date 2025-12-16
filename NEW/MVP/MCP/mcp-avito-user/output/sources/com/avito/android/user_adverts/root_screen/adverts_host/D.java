package com.avito.android.user_adverts.root_screen.adverts_host;

import AI0.a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yI0.InterfaceC50118a;
import yI0.InterfaceC50119b;
import zI0.InterfaceC50474d;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LyI0/b;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(LyI0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class D<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50474d f312230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f312231c;

    public D(UserAdvertsHostFragment userAdvertsHostFragment, InterfaceC50474d interfaceC50474d) {
        this.f312230b = interfaceC50474d;
        this.f312231c = userAdvertsHostFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        InterfaceC50119b interfaceC50119b = (InterfaceC50119b) obj;
        if (!(interfaceC50119b instanceof InterfaceC50119b.a) && (interfaceC50119b instanceof InterfaceC50119b.C12897b)) {
            this.f312230b.accept(new a.c(InterfaceC50118a.C12896a.f443021a));
            UserAdvertsHostFragment.G5(this.f312231c, ((InterfaceC50119b.C12897b) interfaceC50119b).f443024a);
        }
        return G0.f406611a;
    }
}
