package com.avito.android.deeplink_handler.view.impl;

import androidx.appcompat.app.m;
import androidx.core.app.C22744b;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import i.b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rv.C47920c;
import sv.C48419b;

/* compiled from: PermissionManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/f;", "Lcom/avito/android/deeplink_handler/view/a$h;", "a", "b", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements a.h {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f134613f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C f134614b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<Map<String, C47920c>> f134615c = new io.reactivex.rxjava3.subjects.e<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D<String[]> f134616d = new D<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public volatile androidx.view.result.h<String[]> f134617e;

    /* compiled from: PermissionManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PermissionManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/f$b;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends Throwable {
    }

    /* compiled from: PermissionManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "permission", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<String, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m f134618l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m mVar) {
            super(1);
            this.f134618l = mVar;
        }

        @Override // Y41.l
        public final Boolean invoke(String str) {
            return Boolean.valueOf(C22744b.b(this.f134618l, str));
        }
    }

    /* compiled from: PermissionManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "permission", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<String, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Fragment f134619l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(1);
            this.f134619l = fragment;
        }

        @Override // Y41.l
        public final Boolean invoke(String str) {
            return Boolean.valueOf(this.f134619l.shouldShowRequestPermissionRationale(str));
        }
    }

    /* compiled from: PermissionManager.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/avito/android/deeplink_handler/view/impl/f$e", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onDestroy", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements InterfaceC22982O {
        public e() {
        }

        @InterfaceC23042i0(Lifecycle.Event.ON_DESTROY)
        private final void onDestroy() {
            f.this.f134617e = null;
        }
    }

    /* compiled from: PermissionManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "([Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.deeplink_handler.view.impl.f$f, reason: collision with other inner class name */
    public static final class C4061f extends N implements Y41.l<String[], G0> {
        public C4061f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String[] strArr) {
            String[] strArr2 = strArr;
            androidx.view.result.h<String[]> hVar = f.this.f134617e;
            if (hVar != null) {
                hVar.b(strArr2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PermissionManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f134622b;

        public g(Y41.l lVar) {
            this.f134622b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f134622b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f134622b;
        }

        public final int hashCode() {
            return this.f134622b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f134622b.invoke(obj);
        }
    }

    @Inject
    public f(@Y61.k C c12) {
        this.f134614b = c12;
    }

    @Override // com.avito.android.deeplink_handler.view.a.h
    @Y61.k
    public final C41981q0 W1() {
        io.reactivex.rxjava3.subjects.e<Map<String, C47920c>> eVar = this.f134615c;
        eVar.getClass();
        return new C41981q0(eVar);
    }

    public final void a(androidx.view.result.b bVar, InterfaceC22983P interfaceC22983P, Y41.l<? super String, Boolean> lVar) throws b {
        interfaceC22983P.getLifecycle().a(new e());
        this.f134616d.observe(interfaceC22983P, new g(new C4061f()));
        try {
            this.f134617e = bVar.registerForActivityResult(new b.k(), new com.avito.android.deeplink_handler.view.impl.e(this, lVar));
        } catch (Throwable th2) {
            if (this.f134614b.l()) {
                V2 v22 = V2.f318762a;
                a aVar = f134613f;
                String simpleName = bVar.getClass().getSimpleName();
                aVar.getClass();
                v22.a("DeeplinkView.PermissionManager", AK.c.k("Trying to register ActivityResultCallback after screen ", simpleName, " is started.Please, make sure that you call DeeplinkViewBinder.bind on that screen properly"), th2);
                return;
            }
            String simpleName2 = bVar.getClass().getSimpleName();
            f134613f.getClass();
            throw new b("Trying to register ActivityResultCallback after screen " + simpleName2 + " is started.Please, make sure that you call DeeplinkViewBinder.bind on that screen properly", th2);
        }
    }

    public final void b(@Y61.k m mVar) throws b {
        a(mVar, mVar, new c(mVar));
    }

    public final void c(@Y61.k Fragment fragment) throws b {
        a(fragment, fragment, new d(fragment));
    }

    @Override // com.avito.android.deeplink_handler.view.a.h
    public final void o0(@Y61.k String... strArr) {
        C48419b.a(this.f134616d, strArr);
    }
}
