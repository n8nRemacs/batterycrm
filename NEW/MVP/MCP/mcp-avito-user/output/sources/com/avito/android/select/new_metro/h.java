package com.avito.android.select.new_metro;

import androidx.compose.runtime.A;
import com.avito.android.select.new_metro.compose.L;
import com.avito.android.select.new_metro.mvi.t;
import com.avito.android.util.architecture_components.D;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectMetroFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectMetroFragment f266174l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f266175m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SelectMetroFragment selectMetroFragment, boolean z12) {
        super(2);
        this.f266174l = selectMetroFragment;
        this.f266175m = z12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            SelectMetroFragment selectMetroFragment = this.f266174l;
            t tVar = (t) selectMetroFragment.f265918u0.getValue();
            a13.C(907865536);
            Object objT = a13.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new f(1, selectMetroFragment.f265915A0, D.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
                a13.H(objT);
            }
            a13.h();
            L.a(tVar, this.f266175m, (Y41.l) ((kotlin.reflect.i) objT), new g(1, selectMetroFragment, SelectMetroFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroOneTimeEvent;)V", 0), a13, 392);
        }
        return G0.f406611a;
    }
}
