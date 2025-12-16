package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.validation.l1;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsInteractorAsync.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/validation/l1$b;", "", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class Y extends kotlin.jvm.internal.N implements Y41.l<kotlin.Q<? extends l1.b, ? extends List<? extends com.avito.conveyor_item.a>>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34076c f241163l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C34076c c34076c) {
        super(1);
        this.f241163l = c34076c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(kotlin.Q<? extends l1.b, ? extends List<? extends com.avito.conveyor_item.a>> q12) {
        kotlin.Q<? extends l1.b, ? extends List<? extends com.avito.conveyor_item.a>> q13 = q12;
        l1.b bVar = (l1.b) q13.f406619b;
        List<? extends com.avito.conveyor_item.a> list = (List) q13.f406620c;
        boolean z12 = bVar instanceof l1.b.C9896b;
        C34076c c34076c = this.f241163l;
        if (z12 && ((l1.b.C9896b) bVar).f319395a) {
            c34076c.s(list);
        } else {
            Iterator<? extends com.avito.conveyor_item.a> it = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                com.avito.conveyor_item.a next = it.next();
                if ((next instanceof JO.k) && ((JO.k) next).getF173938m()) {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                c34076c.y(list, c34076c.f241180J, new W(c34076c, list), X.f241162l);
            } else {
                com.avito.conveyor_item.a aVar = list.get(i12);
                c34076c.getClass();
                c34076c.t(i12, aVar instanceof ParameterElement.y);
            }
        }
        return G0.f406611a;
    }
}
