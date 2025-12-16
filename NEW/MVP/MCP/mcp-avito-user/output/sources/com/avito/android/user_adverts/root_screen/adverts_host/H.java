package com.avito.android.user_adverts.root_screen.adverts_host;

import AI0.a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import xI0.InterfaceC49844a;
import xI0.InterfaceC49845b;
import zI0.InterfaceC50474d;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LxI0/b;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(LxI0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class H<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50474d f312236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f312237c;

    public H(UserAdvertsHostFragment userAdvertsHostFragment, InterfaceC50474d interfaceC50474d) {
        this.f312236b = interfaceC50474d;
        this.f312237c = userAdvertsHostFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        InterfaceC49845b interfaceC49845b = (InterfaceC49845b) obj;
        if (!(interfaceC49845b instanceof InterfaceC49845b.a) && (interfaceC49845b instanceof InterfaceC49845b.C12858b)) {
            this.f312236b.accept(new a.b(InterfaceC49844a.C12857a.f442329a));
            UserAdvertsHostFragment.G5(this.f312237c, ((InterfaceC49845b.C12858b) interfaceC49845b).f442332a);
        }
        return G0.f406611a;
    }
}
