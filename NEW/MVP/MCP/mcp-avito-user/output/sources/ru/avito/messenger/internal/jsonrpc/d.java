package ru.avito.messenger.internal.jsonrpc;

import androidx.compose.foundation.H;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Q;
import l41.o;
import ru.avito.messenger.l0;

/* compiled from: HttpJsonRpcClient.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "Lru/avito/messenger/l0;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "Lj91/c;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class d<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f431727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j91.b f431728c;

    public d(c cVar, j91.b bVar) {
        this.f431727b = cVar;
        this.f431728c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        Q q12 = (Q) obj;
        String str = (String) q12.f406619b;
        l0 l0Var = (l0) q12.f406620c;
        c cVar = this.f431727b;
        boolean z12 = cVar.f431714d;
        LinkedHashMap linkedHashMap = cVar.f431718h;
        String str2 = cVar.f431717g;
        j91.b bVar = this.f431728c;
        b bVar2 = cVar.f431711a;
        return z12 ? bVar2.b(str2, H.o(new StringBuilder(), cVar.f431713c, '=', str), c.b(cVar, linkedHashMap, l0Var), bVar) : bVar2.a(str2, str, c.b(cVar, linkedHashMap, l0Var), bVar).z(cVar.f431720j.a());
    }
}
