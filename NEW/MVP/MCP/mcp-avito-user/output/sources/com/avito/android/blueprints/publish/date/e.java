package com.avito.android.blueprints.publish.date;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.blueprints.select.k;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.util.D0;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DateItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/date/e;", "Lcom/avito/android/blueprints/publish/date/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final D0 f106112b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f106113c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Q1 f106114d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.C29377e> f106115e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f106116f;

    @Inject
    public e(@k D0 d02, @k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f106112b = d02;
        this.f106113c = interfaceC35807h4;
        this.f106114d = q12;
        com.jakewharton.rxrelay3.c<ParameterElement.C29377e> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106115e = cVar;
        this.f106116f = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String strA;
        com.avito.android.blueprints.select.k kVar = (com.avito.android.blueprints.select.k) eVar;
        ParameterElement.C29377e c29377e = (ParameterElement.C29377e) aVar;
        if (this.f106114d.w().invoke().booleanValue()) {
            kVar.setTitle(this.f106113c.a(c29377e.f117407d, false, c29377e.f117420q));
        } else {
            kVar.setTitle(c29377e.f117407d);
        }
        kVar.o(c29377e.f117415l);
        Long l12 = c29377e.f117408e;
        if (l12 != null) {
            long jLongValue = l12.longValue();
            SelectionType selectionType = c29377e.f117414k;
            if (selectionType == null) {
                selectionType = new SelectionType(C42745f0.U(SelectionType.TYPE_DAY, SelectionType.TYPE_MONTH, SelectionType.TYPE_YEAR));
            }
            strA = this.f106112b.a(jLongValue, selectionType);
        } else {
            strA = null;
        }
        kVar.m(strA);
        ItemWithState.State state = c29377e.f117419p;
        if (state instanceof ItemWithState.State.Normal) {
            kVar.u(((ItemWithState.State.Normal) state).f173899b);
        } else if (state instanceof ItemWithState.State.Warning) {
            k.a.a(kVar, ((ItemWithState.State.Warning) state).f173900b, null, 2);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            k.a.a(kVar, ((ItemWithState.State.Error.ErrorWithMessage) state).f173897b, null, 2);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            k.a.a(kVar, null, null, 3);
        }
        kVar.a(new d(this, c29377e));
    }

    @Override // com.avito.android.blueprints.publish.date.c
    @Y61.k
    public final z<ParameterElement.C29377e> c() {
        return this.f106116f;
    }
}
