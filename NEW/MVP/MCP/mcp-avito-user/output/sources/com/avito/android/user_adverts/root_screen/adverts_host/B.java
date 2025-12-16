package com.avito.android.user_adverts.root_screen.adverts_host;

import AI0.a;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.app_rater.events.AppRaterEventSourcePage;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vI0.InterfaceC49219a;
import vI0.InterfaceC49220b;
import zI0.InterfaceC50474d;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LvI0/b;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(LvI0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class B<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50474d f312226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f312227c;

    public B(UserAdvertsHostFragment userAdvertsHostFragment, InterfaceC50474d interfaceC50474d) {
        this.f312226b = interfaceC50474d;
        this.f312227c = userAdvertsHostFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        InterfaceC49220b interfaceC49220b = (InterfaceC49220b) obj;
        if (!(interfaceC49220b instanceof InterfaceC49220b.a) && (interfaceC49220b instanceof InterfaceC49220b.C12764b)) {
            this.f312226b.accept(new a.C0014a(InterfaceC49219a.C12763a.f440666a));
            UserAdvertsHostFragment.a aVar = UserAdvertsHostFragment.f312290o1;
            UserAdvertsHostFragment userAdvertsHostFragment = this.f312227c;
            ActivityC22955m activityC22955mL1 = userAdvertsHostFragment.l1();
            if (activityC22955mL1 != null) {
                com.avito.android.app_rater.b bVar = userAdvertsHostFragment.f312305O0;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.a(activityC22955mL1, AppRaterEventSourcePage.f91795d);
            }
        }
        return G0.f406611a;
    }
}
