package com.avito.android.beduin.common.actionhandler.update_form_visibility;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.collection.C20199a;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import com.avito.android.beduin.common.actionhandler.update_form_visibility.a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import gj.InterfaceC40691b;
import gj.i;
import gj.j;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: BeduinUpdateFormVisibilityConnector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/update_form_visibility/e;", "Lgj/j;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.actionhandler.update_form_visibility.a f100493a;

    /* compiled from: BeduinUpdateFormVisibilityConnector.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/common/actionhandler/update_form_visibility/e$a", "Landroidx/lifecycle/q;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23057q {

        /* renamed from: b, reason: collision with root package name */
        @k
        public AtomicReference f100494b = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C20199a<String, ViewPropertyAnimator> f100495c = new C20199a<>();

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i f100497e;

        /* compiled from: BeduinUpdateFormVisibilityConnector.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/update_form_visibility/a$a;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin/common/actionhandler/update_form_visibility/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.beduin.common.actionhandler.update_form_visibility.e$a$a, reason: collision with other inner class name */
        public static final class C3017a<T> implements g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f100498b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f100499c;

            public C3017a(i iVar, a aVar) {
                this.f100498b = iVar;
                this.f100499c = aVar;
            }

            @Override // l41.g
            public final void accept(Object obj) {
                a.C3016a c3016a = (a.C3016a) obj;
                View viewB3 = this.f100498b.b3(c3016a.f100485c);
                if (viewB3 == null) {
                    return;
                }
                if (c3016a.f100484b) {
                    D6.l(true, viewB3, new d(viewB3, c3016a, this.f100499c));
                } else {
                    viewB3.setVisibility(!c3016a.f100483a ? 4 : 0);
                }
            }
        }

        /* compiled from: BeduinUpdateFormVisibilityConnector.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements g {

            /* renamed from: b, reason: collision with root package name */
            public static final b<T> f100500b = new b<>();

            @Override // l41.g
            public final void accept(Object obj) {
                V2.f318762a.f((Throwable) obj);
            }
        }

        public a(i iVar) {
            this.f100497e = iVar;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
        @Override // androidx.view.InterfaceC23057q
        public final void onStart(@k InterfaceC22983P interfaceC22983P) {
            this.f100494b.dispose();
            C41981q0 c41981q0 = e.this.f100493a.f100482b;
            C3017a c3017a = new C3017a(this.f100497e, this);
            g<? super Throwable> gVar = b.f100500b;
            c41981q0.getClass();
            this.f100494b = (AtomicReference) c41981q0.v0(c3017a, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
        @Override // androidx.view.InterfaceC23057q
        public final void onStop(@k InterfaceC22983P interfaceC22983P) {
            this.f100494b.dispose();
            C20199a<String, ViewPropertyAnimator> c20199a = this.f100495c;
            Iterator<Map.Entry<String, ViewPropertyAnimator>> it = c20199a.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            c20199a.clear();
        }
    }

    @Inject
    public e(@k com.avito.android.beduin.common.actionhandler.update_form_visibility.a aVar) {
        this.f100493a = aVar;
    }

    @Override // gj.j
    public final void a(@k InterfaceC40691b interfaceC40691b, @l gj.l lVar, @k i iVar, @k InterfaceC22983P interfaceC22983P, @k ActivityC22955m activityC22955m) {
        interfaceC22983P.getLifecycle().a(new a(iVar));
    }
}
