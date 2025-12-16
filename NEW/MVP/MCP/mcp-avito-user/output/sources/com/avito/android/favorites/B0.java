package com.avito.android.favorites;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ChannelContext.Item.USER_ID, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class B0 extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156195l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(C30684r0 c30684r0) {
        super(1);
        this.f156195l = c30684r0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(String str) {
        String str2 = str;
        C30684r0 c30684r0 = this.f156195l;
        String str3 = c30684r0.f157470h0;
        if (str3 == null) {
            c30684r0.f157470h0 = str2;
        } else if (!kotlin.jvm.internal.L.f(str3, str2)) {
            c30684r0.f157470h0 = str2;
            c30684r0.M();
        }
        return kotlin.G0.f406611a;
    }
}
