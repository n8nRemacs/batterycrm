package com.avito.android.blueprints.publish.car_body_condition;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.PointWithPosition;
import com.avito.android.publish.details.E;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodySidePoint;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: PublishBodyConditionItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/blueprints/publish/car_body_condition/b;", "Lcom/avito/android/body_condition/c;", "Lcom/avito/android/blueprints/publish/car_body_condition/a;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends com.avito.android.body_condition.c implements com.avito.android.blueprints.publish.car_body_condition.a {

    /* renamed from: g, reason: collision with root package name */
    @l
    public E.G0 f106077g;

    /* compiled from: _Sequences.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f106078l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof CarBodySidePoint);
        }
    }

    /* compiled from: PublishBodyConditionItemPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodySidePoint;", "Lkotlin/internal/i;", "point", "", "invoke", "(Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodySidePoint;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprints.publish.car_body_condition.b$b, reason: collision with other inner class name */
    public static final class C3173b extends N implements Y41.l<CarBodySidePoint, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Collection<String> f106079l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3173b(Collection<String> collection) {
            super(1);
            this.f106079l = collection;
        }

        @Override // Y41.l
        public final Boolean invoke(CarBodySidePoint carBodySidePoint) {
            Object next;
            Iterator<T> it = carBodySidePoint.getParams().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (this.f106079l.contains((String) next)) {
                    break;
                }
            }
            return Boolean.valueOf(next != null);
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.body_condition.c
    @k
    public final Collection<PointWithPosition> k(@k Collection<? extends PointWithPosition> collection) {
        Iterable iterableWa;
        E.G0 g02 = this.f106077g;
        if (g02 == null || (iterableWa = g02.wa()) == null) {
            iterableWa = B0.f406639b;
        }
        C43025h c43025hI = C43033p.i(C43033p.i(new C42770s0(collection), a.f106078l), new C3173b(C43033p.F(new o0(C43033p.i(C43033p.i(new C42770s0(iterableWa), c.f106080l), d.f106081b), new h0() { // from class: com.avito.android.blueprints.publish.car_body_condition.e
            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @l
            public final Object get(@l Object obj) {
                return ((EditableParameter) obj).getId();
            }
        }))));
        HashSet hashSet = new HashSet();
        Iterator it = c43025hI.iterator();
        while (true) {
            C43025h.a aVar = (C43025h.a) it;
            if (!aVar.hasNext()) {
                return hashSet;
            }
            hashSet.add(aVar.next());
        }
    }

    @Override // com.avito.android.blueprints.publish.car_body_condition.a
    public final void z3(@k E.G0 g02) {
        this.f106077g = g02;
    }
}
