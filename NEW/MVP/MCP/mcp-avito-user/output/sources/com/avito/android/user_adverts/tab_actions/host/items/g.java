package com.avito.android.user_adverts.tab_actions.host.items;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAdvertActionItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class g extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f314329l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f314330m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, a aVar) {
        super(0);
        this.f314329l = hVar;
        this.f314330m = aVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        VI0.a aVar = this.f314329l.f314331b;
        String str = this.f314330m.f314318f.f312180b;
        aVar.getClass();
        return Boolean.valueOf(aVar.f17065a.getBoolean("ACTION_BADGE_WAS_SHOWN_".concat(str), false));
    }
}
