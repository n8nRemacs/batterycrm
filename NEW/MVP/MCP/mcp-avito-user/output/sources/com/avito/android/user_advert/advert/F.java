package com.avito.android.user_advert.advert;

import Z60.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MyAdvertDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ60/b;", "event", "Lkotlin/G0;", "emit", "(LZ60/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class F<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MyAdvertDetailsActivity f308230b;

    public F(MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f308230b = myAdvertDetailsActivity;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        Z60.b bVar = (Z60.b) obj;
        if (bVar instanceof b.a) {
            this.f308230b.a(((b.a) bVar).f19920a);
        }
        return kotlin.G0.f406611a;
    }
}
