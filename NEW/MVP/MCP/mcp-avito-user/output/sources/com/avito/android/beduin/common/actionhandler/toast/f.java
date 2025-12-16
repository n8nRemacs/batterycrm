package com.avito.android.beduin.common.actionhandler.toast;

import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.avito.android.beduin_models.BeduinAction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinToastObserverImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/toast/f;", "Lcom/avito/android/beduin/common/actionhandler/toast/c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f100427a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.actionhandler.toast.a f100428b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f100429c;

    /* compiled from: BeduinToastObserverImpl.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/avito/android/beduin/common/actionhandler/toast/f$a", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onStart", "()V", "onStop", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22982O {

        /* renamed from: b, reason: collision with root package name */
        @l
        public y f100430b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ gj.i f100432d;

        /* compiled from: BeduinToastObserverImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinToastAction;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin/common/action/BeduinToastAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.beduin.common.actionhandler.toast.f$a$a, reason: collision with other inner class name */
        public static final class C3015a<T> implements l41.g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ gj.i f100433b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f100434c;

            public C3015a(f fVar, gj.i iVar) {
                this.f100433b = iVar;
                this.f100434c = fVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00f3 A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
            @Override // l41.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r21) {
                /*
                    Method dump skipped, instructions count: 319
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.actionhandler.toast.f.a.C3015a.accept(java.lang.Object):void");
            }
        }

        public a(gj.i iVar) {
            this.f100432d = iVar;
        }

        @InterfaceC23042i0(Lifecycle.Event.ON_START)
        private final void onStart() {
            f fVar = f.this;
            this.f100430b = (y) fVar.f100428b.f100421b.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C3015a(fVar, this.f100432d));
        }

        @InterfaceC23042i0(Lifecycle.Event.ON_STOP)
        private final void onStop() {
            y yVar = this.f100430b;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
        }
    }

    @Inject
    public f(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k com.avito.android.beduin.common.actionhandler.toast.a aVar, @k com.avito.android.util.text.a aVar2) {
        this.f100427a = interfaceC15523b;
        this.f100428b = aVar;
        this.f100429c = aVar2;
    }

    @Override // com.avito.android.beduin.common.actionhandler.toast.c
    public final void a(@k gj.i iVar, @k Lifecycle lifecycle) {
        lifecycle.a(new a(iVar));
    }
}
