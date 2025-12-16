package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32293v0;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MissingUsersSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "missedUsers", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/Set;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.x0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32297x0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32293v0 f194874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32293v0.d f194875c;

    public C32297x0(C32293v0 c32293v0, C32293v0.d dVar) {
        this.f194874b = c32293v0;
        this.f194875c = dVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Set set = (Set) obj;
        V2 v22 = V2.f318762a;
        int i12 = C32293v0.f194852a0;
        C32293v0 c32293v0 = this.f194874b;
        v22.c(c32293v0.f207131E, "users that are missed in our db  = " + set, null);
        if (set.isEmpty()) {
            return C41823n.f402260b;
        }
        v22.c(c32293v0.f207131E, "Requesting missing users...", null);
        C32293v0.d dVar = this.f194875c;
        return c32293v0.f194853V.d(dVar.f194862d, dVar.f194863e, C42745f0.M0(set)).o(new C32295w0(c32293v0, dVar));
    }
}
