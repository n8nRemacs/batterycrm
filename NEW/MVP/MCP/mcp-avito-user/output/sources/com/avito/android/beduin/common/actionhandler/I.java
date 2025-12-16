package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinDebounceAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: BeduinDebounceActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/I;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinDebounceAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class I implements InterfaceC15523b<BeduinDebounceAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100086a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f100087b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<BeduinDebounceAction> f100088c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f100089d;

    /* compiled from: BeduinDebounceActionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "invoke", "()Lio/reactivex/rxjava3/disposables/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.disposables.d> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ h31.e<io.reactivex.rxjava3.disposables.c> f100091m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h31.e<io.reactivex.rxjava3.disposables.c> eVar) {
            super(0);
            this.f100091m = eVar;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.disposables.d invoke() {
            I i12 = I.this;
            com.jakewharton.rxrelay3.c<BeduinDebounceAction> cVar = i12.f100088c;
            io.reactivex.rxjava3.internal.observers.y yVarH = io.reactivex.rxjava3.kotlin.A1.h(com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar).Z(C.f100054b).T(new F(i12), Integer.MAX_VALUE).j0(i12.f100087b.e()), new G(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new H(i12), 2);
            this.f100091m.get().b(yVarH);
            return yVarH;
        }
    }

    @Inject
    public I(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar, @Y61.k h31.e eVar2) {
        this.f100086a = eVar2;
        this.f100087b = interfaceC35745a5;
        this.f100089d = C42727D.c(new a(eVar));
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100088c.accept((BeduinDebounceAction) beduinAction);
    }
}
