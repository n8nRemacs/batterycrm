package com.avito.android.publish.input_imei;

import com.avito.android.validation.InterfaceC36030r0;
import com.avito.android.validation.l1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: InputImeiFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/validation/l1$b;", "invoke", "(Ljava/util/List;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.l<List<? extends com.avito.conveyor_item.a>, InterfaceC43160i<? extends l1.b>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InputImeiFragment f236227l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputImeiFragment inputImeiFragment) {
        super(1);
        this.f236227l = inputImeiFragment;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends l1.b> invoke(List<? extends com.avito.conveyor_item.a> list) {
        List<? extends com.avito.conveyor_item.a> list2 = list;
        InterfaceC36030r0 interfaceC36030r0 = this.f236227l.f236202t0;
        if (interfaceC36030r0 == null) {
            interfaceC36030r0 = null;
        }
        return y.a(interfaceC36030r0.h(list2, B0.f406639b).F());
    }
}
