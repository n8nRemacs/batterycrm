package com.avito.android.messenger.channels.mvi.presenter;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.B;
import com.avito.android.messenger.channels.mvi.presenter.a;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.o;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import u3.g;

/* compiled from: FoldersPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/presenter/b;", "Lcom/avito/android/messenger/channels/mvi/presenter/a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/channels/mvi/presenter/a$b;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends AbstractC32892c<a.b> implements com.avito.android.messenger.channels.mvi.presenter.a {

    /* renamed from: V, reason: collision with root package name */
    @k
    public final com.avito.android.messenger.channels.mvi.interactor.k f188293V;

    /* renamed from: W, reason: collision with root package name */
    @k
    public final com.avito.android.messenger.folders.c f188294W;

    /* renamed from: X, reason: collision with root package name */
    @k
    public final InterfaceC28373a f188295X;

    /* renamed from: Y, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f188296Y;

    /* renamed from: Z, reason: collision with root package name */
    @k
    public final InterfaceC42726C f188297Z;

    /* renamed from: a0, reason: collision with root package name */
    @k
    public final D<G0> f188298a0;

    /* compiled from: FoldersPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/presenter/b$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/channels/mvi/presenter/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends o<a.b> {

        /* renamed from: d, reason: collision with root package name */
        public final int f188299d;

        public a(int i12) {
            super(null, null, 3, null);
            this.f188299d = i12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final a.b d(a.b bVar) {
            a.b bVar2 = bVar;
            List<a.C5551a> list = bVar2.f188291a;
            int size = list.size();
            int i12 = this.f188299d;
            if (i12 > size) {
                return bVar2;
            }
            b.this.f188295X.c(new B(list.get(i12).f188287b));
            return new a.b(list, i12);
        }
    }

    /* compiled from: FoldersPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/presenter/b$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/channels/mvi/presenter/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.presenter.b$b, reason: collision with other inner class name */
    public final class C5553b extends o<a.b> {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f188301d;

        public C5553b(@k ArrayList arrayList) {
            super(null, null, 3, null);
            this.f188301d = arrayList;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final a.b d(a.b bVar) {
            return new a.b(this.f188301d, bVar.f188292b);
        }
    }

    /* compiled from: FoldersPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g<MessengerFolderTabsTestGroup> f188302l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g<MessengerFolderTabsTestGroup> gVar) {
            super(0);
            this.f188302l = gVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            MessengerFolderTabsTestGroup messengerFolderTabsTestGroup = this.f188302l.f439742a.f439749b;
            messengerFolderTabsTestGroup.getClass();
            return Boolean.valueOf(messengerFolderTabsTestGroup == MessengerFolderTabsTestGroup.f67952d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public b(@k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.messenger.channels.mvi.interactor.k kVar, @k com.avito.android.messenger.folders.c cVar, @k g<MessengerFolderTabsTestGroup> gVar, @k InterfaceC28373a interfaceC28373a) {
        super("FoldersPresenter", a.b.f188290d, interfaceC35745a5, null, null, null, null, null, 248, null);
        a.b.f188289c.getClass();
        this.f188293V = kVar;
        this.f188294W = cVar;
        this.f188295X = interfaceC28373a;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f188296Y = cVar2;
        this.f188297Z = C42727D.c(new c(gVar));
        this.f188298a0 = new D<>();
        cVar2.b(kVar.getF187656M().j0(this.f207133K.c()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(new com.avito.android.messenger.channels.mvi.presenter.c(this)));
    }

    @Override // com.avito.android.messenger.channels.mvi.presenter.a
    public final void T8(int i12) {
        le().s(new a(i12));
    }

    @Override // com.avito.android.messenger.channels.mvi.presenter.a
    public final void d3() {
        this.f188293V.Ab();
        if (((Boolean) this.f188297Z.getValue()).booleanValue()) {
            com.avito.android.messenger.folders.c cVar = this.f188294W;
            if (cVar.b()) {
                return;
            }
            this.f188298a0.postValue(G0.f406611a);
            cVar.a();
        }
    }

    @Override // com.avito.android.messenger.channels.mvi.presenter.a
    /* renamed from: ib, reason: from getter */
    public final D getF188298a0() {
        return this.f188298a0;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f188296Y.e();
        super.onCleared();
    }
}
