package com.avito.android.user_advert.advert;

import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.user_advert.advert.delegate.PresenterDelegateNotFoundException;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "advertId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class L0 extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C35435m0 f308255l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(C35435m0 c35435m0) {
        super(1);
        this.f308255l = c35435m0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(String str) {
        Object next;
        String str2 = str;
        C35435m0 c35435m0 = this.f308255l;
        Iterator<T> it = c35435m0.f310495v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a) {
                break;
            }
        }
        com.avito.android.user_advert.advert.delegate.user_advert_action.a aVar = (com.avito.android.user_advert.advert.delegate.user_advert_action.a) (next instanceof com.avito.android.user_advert.advert.delegate.user_advert_action.a ? next : null);
        if (aVar == null) {
            throw new PresenterDelegateNotFoundException(com.avito.android.user_advert.advert.delegate.user_advert_action.a.class);
        }
        aVar.v(new MyAdvertLink.Restore(str2), c35435m0.f310465e0, false);
        return kotlin.G0.f406611a;
    }
}
