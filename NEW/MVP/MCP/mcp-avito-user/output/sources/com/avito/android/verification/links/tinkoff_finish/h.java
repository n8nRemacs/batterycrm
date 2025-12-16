package com.avito.android.verification.links.tinkoff_finish;

import com.avito.android.util.rx3.g1;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;
import ru.tinkoff.core.tinkoffId.p;

/* compiled from: VerificationTinkoffFinishLinkInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/tinkoff/core/tinkoffId/p;", "kotlin.jvm.PlatformType", "payload", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/VerificationTinkoffFinishResult;", "apply", "(Lru/tinkoff/core/tinkoffId/p;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f324586b;

    public h(i iVar) {
        this.f324586b = iVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        p pVar = (p) obj;
        i iVar = this.f324586b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(iVar.f324589c.c());
        linkedHashMap.put("access_token", pVar.f437048a);
        linkedHashMap.put("refresh_token", pVar.f437051d);
        String str = pVar.f437050c;
        if (str != null) {
            linkedHashMap.put("id_token", str);
        }
        linkedHashMap.put("expires_in", String.valueOf(pVar.f437049b));
        return g1.a(iVar.f324588b.f(linkedHashMap)).z(iVar.f324587a.a());
    }
}
