package com.avito.android.messenger.conversation.mvi.quick_replies;

import com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a;
import com.avito.android.messenger.conversation.mvi.quick_replies.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: QuickRepliesPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "apply", "(Lkotlin/G0;)Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.a f194106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f194107c;

    public g(d.a aVar, f fVar) {
        this.f194106b = aVar;
        this.f194107c = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        d.a.b.InterfaceC5745a.C5747b c5747b = (d.a.b.InterfaceC5745a.C5747b) this.f194106b;
        List<a.b> list = c5747b.f194094a;
        ArrayList arrayList = new ArrayList();
        for (T t12 : list) {
            if (!L.f(((a.b) t12).f194073b, c5747b.f194095b.f194073b)) {
                arrayList.add(t12);
            }
        }
        if (arrayList.isEmpty()) {
            this.f194107c.f194104a0.postValue(G0.f406611a);
            return d.a.b.InterfaceC5745a.C5746a.f194093a;
        }
        c5747b.getClass();
        return new d.a.b.InterfaceC5745a.C5747b(arrayList, null);
    }
}
