package com.avito.android.replace_main.toggle;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.replace_main.toggle.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: ReplaceMainToggleViewImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/toggle/A;", "Lcom/avito/android/replace_main/toggle/u;", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Z1<d> f254607a = p2.a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComposeView f254608b;

    /* compiled from: ReplaceMainToggleViewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC28373a f254609l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ A f254610m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v.a f254611n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28373a interfaceC28373a, A a12, v.a aVar) {
            super(2);
            this.f254609l = interfaceC28373a;
            this.f254610m = a12;
            this.f254611n = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(1646648670, new z(this.f254609l, this.f254610m, this.f254611n), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    public A(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k v.a aVar) {
        ComposeView composeView = new ComposeView(aVar.f254657a, null, 0, 6, null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(-1820717287, new a(interfaceC28373a, this, aVar), true));
        this.f254608b = composeView;
    }

    @Override // com.avito.android.replace_main.toggle.u
    public final void a(@Y61.k d dVar) {
        this.f254607a.setValue(dVar);
    }
}
