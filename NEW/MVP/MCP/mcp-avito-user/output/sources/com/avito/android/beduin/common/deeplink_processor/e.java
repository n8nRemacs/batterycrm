package com.avito.android.beduin.common.deeplink_processor;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Intent;
import androidx.view.M0;
import com.avito.android.beduin.common.actionhandler.C28743d0;
import com.avito.android.beduin.common.actionhandler.C28784w;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import gj.C40690a;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import l41.o;
import l41.r;
import rv.C47918a;

/* compiled from: BeduinActionsResultReceiver.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/deeplink_processor/e;", "Landroidx/lifecycle/M0;", "Lgj/h;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends M0 implements gj.h {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f103279E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f103280J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final D f103281K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f103282L;

    /* compiled from: BeduinActionsResultReceiver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.common.deeplink_processor.e$e, reason: collision with other inner class name */
    public static final class C3100e<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final C3100e<T> f103287b = new C3100e<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437156b == -1;
        }
    }

    /* compiled from: BeduinActionsResultReceiver.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrv/a;", "it", "", "Lcom/avito/android/beduin_models/BeduinAction;", "kotlin.jvm.PlatformType", "apply", "(Lrv/a;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T, R> f103288b = new f<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Intent intent = ((C47918a) obj).f437157c;
            Iterable parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("beduin_result_actions_key") : null;
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = C42784z0.f406748b;
            }
            return C42745f0.M0(parcelableArrayListExtra);
        }
    }

    public e(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k final com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.b bVar, @k C28784w c28784w, @k C28743d0 c28743d0) {
        this.f103279E = interfaceC15523b;
        this.f103280J = aVar;
        final D d12 = new D();
        this.f103281K = d12;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f103282L = cVar;
        C41981q0 c41981q0 = c28743d0.f100229b;
        l41.g gVar = new l41.g() { // from class: com.avito.android.beduin.common.deeplink_processor.e.a
            @Override // l41.g
            public final void accept(Object obj) {
                b.a.a(aVar, (DeepLink) obj, null, null, 6);
            }
        };
        final V2 v22 = V2.f318762a;
        l41.g<? super Throwable> gVar2 = new l41.g() { // from class: com.avito.android.beduin.common.deeplink_processor.e.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        };
        c41981q0.getClass();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(c41981q0.v0(gVar, gVar2, interfaceC43543a));
        C41981q0 c41981q02 = c28784w.f100508b;
        l41.g gVar3 = new l41.g() { // from class: com.avito.android.beduin.common.deeplink_processor.e.c
            @Override // l41.g
            public final void accept(Object obj) {
                d12.setValue((C40690a) obj);
            }
        };
        l41.g<? super Throwable> gVar4 = new l41.g() { // from class: com.avito.android.beduin.common.deeplink_processor.e.d
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        };
        c41981q02.getClass();
        cVar.b(c41981q02.v0(gVar3, gVar4, interfaceC43543a));
        cVar.b(bVar.Q().N(C3100e.f103287b).d0(f.f103288b).v0(new l41.g() { // from class: com.avito.android.beduin.common.deeplink_processor.e.g
            @Override // l41.g
            public final void accept(Object obj) {
                e eVar = e.this;
                eVar.getClass();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    eVar.f103279E.o((BeduinAction) it.next());
                }
            }
        }, new l41.g() { // from class: com.avito.android.beduin.common.deeplink_processor.e.h
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, interfaceC43543a));
    }

    @Override // gj.h
    @k
    /* renamed from: id, reason: from getter */
    public final D getF103281K() {
        return this.f103281K;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f103282L.e();
    }
}
