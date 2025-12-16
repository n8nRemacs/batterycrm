package com.avito.android.publish.screen.step.select;

import Ju.InterfaceC14249c;
import Ne0.InterfaceC14566a;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.comfortable_deal.deeplink.SubmittingSelectDeeplink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.publish.PublishActivity;
import com.avito.android.publish.screen.step.select.SelectFragment;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: SelectFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class g implements InterfaceC43172j, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectFragment f242171b;

    public g(SelectFragment selectFragment) {
        this.f242171b = selectFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        SelectFragment.b bVar = SelectFragment.f242071A0;
        SelectFragment selectFragment = this.f242171b;
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        if (interfaceC14249c instanceof SubmittingSelectDeeplink.b.a) {
            selectFragment.q5().accept(new InterfaceC14566a.e(((SubmittingSelectDeeplink.b.a) interfaceC14249c).f121886b));
        } else if (interfaceC14249c instanceof SubmittingSelectDeeplink.b.c) {
            selectFragment.q5().accept(InterfaceC14566a.k.f11669a);
            ActivityC22955m activityC22955mRequireActivity = selectFragment.requireActivity();
            PublishActivity publishActivity = activityC22955mRequireActivity instanceof PublishActivity ? (PublishActivity) activityC22955mRequireActivity : null;
            if (publishActivity != null) {
                publishActivity.d2(null);
                G0 g02 = G0.f406611a;
            }
            com.avito.android.deeplink_handler.handler.composite.a aVar = selectFragment.f242080v0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, ((SubmittingSelectDeeplink.b.c) interfaceC14249c).f121888b, null, null, 6);
        } else if (interfaceC14249c instanceof SubmittingSelectDeeplink.b.C3604b) {
            selectFragment.q5().accept(InterfaceC14566a.k.f11669a);
        }
        G0 g03 = G0.f406611a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g03;
    }

    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @Y61.k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new C42801a(2, this.f242171b, SelectFragment.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/handler/result/DeeplinkResultEvent;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
