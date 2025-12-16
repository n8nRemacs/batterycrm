package com.avito.android.beduin.common.actionhandler.close_keyboard;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.di.B;
import com.avito.android.util.K2;
import gj.InterfaceC40691b;
import gj.i;
import gj.j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;

/* compiled from: BeduinCloseKeyboardScreenConnector.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/close_keyboard/c;", "Lgj/j;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.actionhandler.close_keyboard.a f100191a;

    /* compiled from: BeduinCloseKeyboardScreenConnector.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/common/actionhandler/close_keyboard/c$a", "Landroidx/lifecycle/L;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22979L {

        /* renamed from: b, reason: collision with root package name */
        @l
        public y f100192b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f100194d;

        /* compiled from: BeduinCloseKeyboardScreenConnector.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.actionhandler.close_keyboard.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3012a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f100195a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f100195a = iArr;
            }
        }

        /* compiled from: BeduinCloseKeyboardScreenConnector.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f100196b;

            public b(i iVar) {
                this.f100196b = iVar;
            }

            @Override // l41.g
            public final void accept(Object obj) {
                i iVar = this.f100196b;
                RecyclerView recyclerViewB0 = iVar.B0(iVar.m0());
                View rootView = recyclerViewB0 != null ? recyclerViewB0.getRootView() : null;
                if (rootView != null) {
                    K2.d(rootView, false);
                }
            }
        }

        public a(i iVar) {
            this.f100194d = iVar;
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
            y yVar;
            int i12 = C3012a.f100195a[event.ordinal()];
            if (i12 == 1) {
                this.f100192b = (y) c.this.f100191a.f100189b.t0(new b(this.f100194d));
            } else if (i12 == 2 && (yVar = this.f100192b) != null) {
                DisposableHelper.a(yVar);
            }
        }
    }

    @Inject
    public c(@k com.avito.android.beduin.common.actionhandler.close_keyboard.a aVar) {
        this.f100191a = aVar;
    }

    @Override // gj.j
    public final void a(@k InterfaceC40691b interfaceC40691b, @l gj.l lVar, @k i iVar, @k InterfaceC22983P interfaceC22983P, @k ActivityC22955m activityC22955m) {
        interfaceC22983P.getLifecycle().a(new a(iVar));
    }
}
