package com.avito.android.blueprint.date.interval;

import Hj.C13996a;
import Y41.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.util.A0;
import com.avito.android.util.C35986z0;
import com.avito.android.util.D0;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDateIntervalPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprint/date/interval/d;", "Lcom/avito/android/blueprint/date/interval/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.blueprint.date.interval.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D0 f105452b;

    /* renamed from: c, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<c.a> f105453c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<c.a> f105454d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<c.a> f105455e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f105456f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f105457g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f105458h;

    /* compiled from: PublishDateIntervalPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.C29376d f105460m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ParameterElement.C29376d c29376d) {
            super(0);
            this.f105460m = c29376d;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<c.a> cVar = d.this.f105454d;
            ParameterElement.C29376d c29376d = this.f105460m;
            ParameterElement.C29377e c29377e = c29376d.f117402f;
            cVar.accept(new c.a(c29376d, c29377e != null ? c29377e.f117408e : null, false));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDateIntervalPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.C29376d f105462m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ParameterElement.C29376d c29376d) {
            super(0);
            this.f105462m = c29376d;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<c.a> cVar = d.this.f105455e;
            ParameterElement.C29376d c29376d = this.f105462m;
            ParameterElement.C29377e c29377e = c29376d.f117401e;
            cVar.accept(new c.a(c29376d, c29377e != null ? c29377e.f117408e : null, false));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDateIntervalPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "presentTimeChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.C29376d f105463l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f105464m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ i f105465n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ParameterElement.C29376d c29376d, d dVar, i iVar) {
            super(1);
            this.f105463l = c29376d;
            this.f105464m = dVar;
            this.f105465n = iVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            ParameterElement.C29376d c29376d = this.f105463l;
            ParameterElement.C29377e c29377e = c29376d.f117402f;
            if (c29377e != null) {
                c29377e.f117413j = zBooleanValue;
            }
            d dVar = this.f105464m;
            dVar.getClass();
            i iVar = this.f105465n;
            d.Y(iVar, c29376d, zBooleanValue);
            if (zBooleanValue) {
                iVar.r8(null);
            }
            iVar.Ca(!zBooleanValue);
            ParameterElement.C29377e c29377e2 = c29376d.f117401e;
            ItemWithState.State state = c29377e2 != null ? c29377e2.f117419p : null;
            ParameterElement.C29377e c29377e3 = c29376d.f117402f;
            d.k(iVar, state, c29377e3 != null ? c29377e3.f117419p : null);
            dVar.f105453c.accept(new c.a(c29376d, null, zBooleanValue));
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k D0 d02) {
        this.f105452b = d02;
        com.jakewharton.rxrelay3.c<c.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105453c = cVar;
        com.jakewharton.rxrelay3.c<c.a> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105454d = cVar2;
        com.jakewharton.rxrelay3.c<c.a> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f105455e = cVar3;
        this.f105456f = new C41981q0(cVar);
        this.f105457g = new C41981q0(cVar2);
        this.f105458h = new C41981q0(cVar3);
    }

    public static void Y(i iVar, ParameterElement.C29376d c29376d, boolean z12) {
        CharSequence string;
        ParameterElement.C29377e c29377e = c29376d.f117401e;
        String str = c29377e != null ? c29377e.f117407d : null;
        if (!z12 || str == null) {
            str = c29376d.f117400d;
        }
        String str2 = str;
        ItemWithState.State state = c29377e != null ? c29377e.f117419p : null;
        ItemWithState.State.Error error = state instanceof ItemWithState.State.Error ? (ItemWithState.State.Error) state : null;
        ParameterElement.C29377e c29377e2 = c29376d.f117402f;
        ItemWithState.State state2 = c29377e2 != null ? c29377e2.f117419p : null;
        ItemWithState.State.Error error2 = state2 instanceof ItemWithState.State.Error ? (ItemWithState.State.Error) state2 : null;
        boolean z13 = (error == null && error2 == null) ? false : true;
        if (error != null) {
            ItemWithState.State.Error.ErrorWithMessage errorWithMessage = error instanceof ItemWithState.State.Error.ErrorWithMessage ? (ItemWithState.State.Error.ErrorWithMessage) error : null;
            if (errorWithMessage == null || (string = errorWithMessage.f173897b) == null) {
                string = iVar.getContext().getString(R.string.date_interval_start_date_error);
            }
        } else if (error2 != null) {
            ItemWithState.State.Error.ErrorWithMessage errorWithMessage2 = error2 instanceof ItemWithState.State.Error.ErrorWithMessage ? (ItemWithState.State.Error.ErrorWithMessage) error2 : null;
            if (errorWithMessage2 == null || (string = errorWithMessage2.f173897b) == null) {
                string = iVar.getContext().getString(R.string.date_interval_end_date_error);
            }
        } else {
            string = "";
        }
        iVar.a60(new C13996a(str2, z13 ? new ItemWithState.State.Error.ErrorWithMessage(string) : new ItemWithState.State.Normal(null, 1, null), false, c29376d.f117405i, null, null, null, null, null, 500, null));
    }

    public static void k(i iVar, ItemWithState.State state, ItemWithState.State state2) {
        if (state instanceof ItemWithState.State.Error) {
            iVar.YF();
        } else {
            iVar.Hb();
        }
        if (state2 instanceof ItemWithState.State.Error) {
            iVar.gz();
        } else {
            iVar.Vc();
        }
    }

    @Override // com.avito.android.blueprint.date.interval.c
    @Y61.k
    /* renamed from: E0, reason: from getter */
    public final C41981q0 getF105457g() {
        return this.f105457g;
    }

    public final void O(@Y61.k i iVar, @Y61.k ParameterElement.C29376d c29376d) {
        SelectionType selectionType;
        SelectionType selectionType2;
        ParameterElement.C29377e c29377e = c29376d.f117402f;
        Y(iVar, c29376d, c29377e != null ? c29377e.f117413j : true);
        D0 d02 = this.f105452b;
        ParameterElement.C29377e c29377e2 = c29376d.f117401e;
        if (c29377e2 != null) {
            iVar.Q9(true);
            Long l12 = c29377e2.f117408e;
            iVar.n9((l12 == null || (selectionType2 = c29377e2.f117414k) == null) ? null : d02.a(l12.longValue(), selectionType2));
        } else {
            iVar.Q9(false);
        }
        if (c29377e != null) {
            iVar.Ca(!c29377e.f117413j);
            Long l13 = c29377e.f117408e;
            iVar.r8((l13 == null || (selectionType = c29377e.f117414k) == null) ? null : d02.a(l13.longValue(), selectionType));
        } else {
            iVar.Ca(false);
        }
        if ((c29377e != null ? c29377e.f117412i : null) != null) {
            iVar.Tb(c29377e.f117412i);
            iVar.Ab(c29377e.f117413j);
            iVar.A7(true);
        } else {
            iVar.A7(false);
        }
        k(iVar, c29377e2 != null ? c29377e2.f117419p : null, c29377e != null ? c29377e.f117419p : null);
        V(iVar, c29376d);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        O((i) eVar, (ParameterElement.C29376d) aVar);
    }

    @Override // com.avito.android.blueprint.date.interval.c
    @Y61.k
    /* renamed from: R, reason: from getter */
    public final C41981q0 getF105456f() {
        return this.f105456f;
    }

    public final void V(i iVar, ParameterElement.C29376d c29376d) {
        if (c29376d.f117401e == null) {
            iVar.Z7(null);
        } else {
            iVar.Z7(new a(c29376d));
        }
        iVar.D8(new b(c29376d));
        iVar.f7(new c(c29376d, this, iVar));
    }

    @Override // com.avito.android.blueprint.date.interval.c
    @Y61.k
    /* renamed from: b0, reason: from getter */
    public final C41981q0 getF105458h() {
        return this.f105458h;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        ItemWithState.State state;
        ItemWithState.State state2;
        i iVar = (i) eVar;
        ParameterElement.C29376d c29376d = (ParameterElement.C29376d) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof A0) {
                obj = obj2;
            }
        }
        if (!(obj instanceof A0)) {
            obj = null;
        }
        A0 a02 = (A0) obj;
        if (a02 == null) {
            O(iVar, c29376d);
            return;
        }
        ParameterElement.C29377e c29377e = c29376d.f117401e;
        C35986z0 c35986z0 = a02.f318512a;
        if (c35986z0 == null || (state = c35986z0.f319132b) == null) {
            state = c29377e != null ? c29377e.f117419p : null;
        }
        ParameterElement.C29377e c29377e2 = c29376d.f117402f;
        C35986z0 c35986z02 = a02.f318513b;
        if (c35986z02 == null || (state2 = c35986z02.f319132b) == null) {
            state2 = c29377e2 != null ? c29377e2.f117419p : null;
        }
        k(iVar, state, state2);
        Long l12 = c35986z0 != null ? c35986z0.f319131a : null;
        SelectionType selectionType = c29377e != null ? c29377e.f117414k : null;
        D0 d02 = this.f105452b;
        if (l12 != null && selectionType != null) {
            iVar.n9(d02.a(l12.longValue(), selectionType));
        }
        Long l13 = c35986z02 != null ? c35986z02.f319131a : null;
        SelectionType selectionType2 = c29377e2 != null ? c29377e2.f117414k : null;
        if (l13 != null && selectionType2 != null) {
            iVar.r8(d02.a(l13.longValue(), selectionType2));
        }
        Boolean bool = a02.f318514c;
        Y(iVar, c29376d, bool != null ? bool.booleanValue() : false);
        if (bool != null) {
            iVar.Ab(bool.booleanValue());
        }
        V(iVar, c29376d);
    }
}
