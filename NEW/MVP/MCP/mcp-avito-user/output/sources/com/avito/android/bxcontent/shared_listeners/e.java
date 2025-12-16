package com.avito.android.bxcontent.shared_listeners;

import Y41.l;
import com.avito.android.bxcontent.C29235n;
import com.avito.android.bxcontent.mvi.entity.LoadState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BxSharedLocationListenerInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "invoke", "(Lkotlin/G0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements l<G0, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f112920l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(1);
        this.f112920l = hVar;
    }

    @Override // Y41.l
    public final Boolean invoke(G0 g02) {
        return Boolean.valueOf(((C29235n) this.f112920l.e()).f112645M.a().f112339i == LoadState.f112044c);
    }
}
