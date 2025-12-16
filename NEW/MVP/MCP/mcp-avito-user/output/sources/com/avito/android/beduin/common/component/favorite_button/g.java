package com.avito.android.beduin.common.component.favorite_button;

import Y61.l;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import com.avito.android.di.B;
import gj.InterfaceC40691b;
import gj.o;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinFavoriteButtonScreenConnector.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/favorite_button/g;", "Lgj/j;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements gj.j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.a f101197a;

    /* compiled from: BeduinFavoriteButtonScreenConnector.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/common/component/favorite_button/g$a", "Landroidx/lifecycle/q;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23057q {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ gj.i f101198b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f101199c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f101200d;

        public a(gj.i iVar, g gVar, InterfaceC22983P interfaceC22983P) {
            this.f101198b = iVar;
            this.f101199c = gVar;
            this.f101200d = interfaceC22983P;
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onStart(@Y61.k InterfaceC22983P interfaceC22983P) {
            View view;
            o oVarC1 = this.f101198b.c1();
            if (oVarC1 == null || (view = oVarC1.f396761a.f396763a) == null) {
                return;
            }
            this.f101199c.f101197a.d(view, this.f101200d);
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onStop(@Y61.k InterfaceC22983P interfaceC22983P) {
            this.f101199c.f101197a.a();
        }
    }

    @Inject
    public g(@Y61.k com.avito.android.advert_collection_toast.a aVar) {
        this.f101197a = aVar;
    }

    @Override // gj.j
    public final void a(@Y61.k InterfaceC40691b interfaceC40691b, @l gj.l lVar, @Y61.k gj.i iVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k ActivityC22955m activityC22955m) {
        interfaceC22983P.getLifecycle().a(new a(iVar, this, interfaceC22983P));
    }
}
