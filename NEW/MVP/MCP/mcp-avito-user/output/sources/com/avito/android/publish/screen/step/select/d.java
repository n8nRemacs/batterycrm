package com.avito.android.publish.screen.step.select;

import Ne0.InterfaceC14566a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.screen.step.select.SelectFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "emit", "(Lkotlin/Q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectFragment f242116b;

    public d(SelectFragment selectFragment) {
        this.f242116b = selectFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        Q q12 = (Q) obj;
        String str = (String) q12.f406619b;
        DeepLink deepLink = (DeepLink) q12.f406620c;
        SelectFragment.b bVar = SelectFragment.f242071A0;
        this.f242116b.q5().accept(new InterfaceC14566a.f(str, deepLink));
        return G0.f406611a;
    }
}
