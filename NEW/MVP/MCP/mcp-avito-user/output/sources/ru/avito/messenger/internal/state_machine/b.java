package ru.avito.messenger.internal.state_machine;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import l41.o;
import ru.avito.messenger.internal.state_machine.g;

/* compiled from: SequentialStateMachine.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "S", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/O;", "apply", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.a<Object> f431777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e<Object> f431778c;

    public b(g.a<Object> aVar, e<Object> eVar) {
        this.f431777b = aVar;
        this.f431778c = eVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        g.a<Object> aVar = this.f431777b;
        I<Object> iApply = aVar.apply(obj);
        e<Object> eVar = this.f431778c;
        return iApply.j(new a(eVar, aVar, obj)).z(eVar.f431782b);
    }
}
