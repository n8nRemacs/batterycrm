package com.avito.android.user_advert.advert;

import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class V0 extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.I<Boolean>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C35435m0 f308438l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MyAdvertDetailsItem f308439m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35426j0.b f308440n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(C35435m0 c35435m0, MyAdvertDetailsItem myAdvertDetailsItem, InterfaceC35426j0.b bVar) {
        super(0);
        this.f308438l = c35435m0;
        this.f308439m = myAdvertDetailsItem;
        this.f308440n = bVar;
    }

    @Override // Y41.a
    public final io.reactivex.rxjava3.core.I<Boolean> invoke() {
        List<UxFeedbackConfigOld> list;
        C35435m0 c35435m0 = this.f308438l;
        c35435m0.getClass();
        MyAdvertDetailsItem myAdvertDetailsItem = this.f308439m;
        boolean z12 = kotlin.jvm.internal.L.f(myAdvertDetailsItem.f309100K, "active") && c35435m0.n(this.f308440n);
        io.reactivex.rxjava3.core.I iQ2 = io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
        if (z12 && (list = myAdvertDetailsItem.f309081A0) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String pollId = ((UxFeedbackConfigOld) it.next()).getPollId();
                if (pollId != null) {
                    iQ2 = c35435m0.f310432B.a(pollId);
                }
            }
        }
        return iQ2;
    }
}
