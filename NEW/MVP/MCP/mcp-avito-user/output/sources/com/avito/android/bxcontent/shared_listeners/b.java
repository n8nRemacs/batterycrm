package com.avito.android.bxcontent.shared_listeners;

import Y41.l;
import com.avito.android.bxcontent.C29235n;
import com.avito.android.bxcontent.mvi.entity.LoadState;
import com.avito.android.remote.model.Location;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: BxSharedLocationListenerInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/remote/model/Location;", "", "it", "invoke", "(Lkotlin/Q;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements l<Q<? extends Location, ? extends Boolean>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f112914l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar) {
        super(1);
        this.f112914l = hVar;
    }

    @Override // Y41.l
    public final Boolean invoke(Q<? extends Location, ? extends Boolean> q12) {
        com.avito.android.bxcontent.mvi.entity.l lVarA = ((C29235n) this.f112914l.e()).f112645M.a();
        lVarA.getClass();
        return Boolean.valueOf(lVarA.f112339i == LoadState.f112044c && lVarA.f112343k == null);
    }
}
