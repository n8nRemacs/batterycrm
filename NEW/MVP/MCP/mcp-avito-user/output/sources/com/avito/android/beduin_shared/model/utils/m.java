package com.avito.android.beduin_shared.model.utils;

import androidx.work.impl.CallableC23587q;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.C35743a3;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;
import lj.d;

/* compiled from: ComponentsForms.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin-shared_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m {

    /* compiled from: ComponentsForms.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a \u0012\u001c\b\u0001\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b0\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Llj/a;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/E;", "", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "apply", "(Llj/a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f105335b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((InterfaceC43779a) obj).getF103348p();
        }
    }

    @Y61.k
    public static final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> a(@Y61.k InterfaceC43779a interfaceC43779a, @Y61.k String str, @Y61.k List<? extends BeduinModel> list) {
        z zVarP = new G(new CallableC23587q(4, interfaceC43779a, list, str)).p(a.f105335b);
        if (!C35743a3.a()) {
            zVarP = zVarP.x0(io.reactivex.rxjava3.android.schedulers.b.b());
        }
        return (List) zVarP.d();
    }

    public static final void b(@Y61.k InterfaceC43779a interfaceC43779a, @Y61.k BeduinForm beduinForm) {
        interfaceC43779a.h(new d.k(beduinForm.getComponents(), beduinForm.getF105312b()));
    }
}
