package com.avito.android.deeplink_handler.view.lifecycle;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.view.C23038g0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sv.C48419b;

/* compiled from: SafeDialogNavigatorLifecycleDeeplinkView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/r;", "Lcom/avito/android/deeplink_handler/view/a$d;", "<init>", "()V", "a", "b", "c", "d", "e", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class r implements a.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C23038g0<WeakReference<a>> f134672b = new C23038g0<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final D<WeakReference<d>> f134673c = new D<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D<WeakReference<e>> f134674d = new D<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final D<WeakReference<c>> f134675e = new D<>();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final D<WeakReference<b>> f134676f = new D<>();

    /* compiled from: SafeDialogNavigatorLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/r$a;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.l<com.avito.android.lib.deprecated_design.dialog.a, G0> f134677a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k Y41.l<? super com.avito.android.lib.deprecated_design.dialog.a, G0> lVar) {
            this.f134677a = lVar;
        }
    }

    /* compiled from: SafeDialogNavigatorLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/r$b;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final N f134678a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k Y41.l<? super Context, ? extends com.avito.android.lib.design.bottom_sheet.d> lVar) {
            this.f134678a = (N) lVar;
        }
    }

    /* compiled from: SafeDialogNavigatorLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/r$c;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f134679a;

        /* renamed from: b, reason: collision with root package name */
        public final int f134680b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final N f134681c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(int i12, int i13, @Y61.k Y41.p pVar) {
            this.f134679a = i12;
            this.f134680b = i13;
            this.f134681c = (N) pVar;
        }
    }

    /* compiled from: SafeDialogNavigatorLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/r$d;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DialogFragment f134682a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f134683b;

        public d(@Y61.k DialogFragment dialogFragment, @Y61.k String str) {
            this.f134682a = dialogFragment;
            this.f134683b = str;
        }
    }

    /* compiled from: SafeDialogNavigatorLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/r$e;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final N f134684a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f134685b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@Y61.k String str, @Y61.k Y41.a aVar) {
            this.f134684a = (N) aVar;
            this.f134685b = str;
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/deeplink_handler/view/lifecycle/s", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.d f134686b;

        public f(a.d dVar) {
            this.f134686b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            WeakReference weakReference = (WeakReference) t12;
            if (weakReference != null) {
                Object obj = weakReference.get();
                if (obj == null) {
                    V2.f318762a.e("Failed to handle alert dialog deeplink", null);
                } else {
                    this.f134686b.k1(((a) obj).f134677a);
                }
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/deeplink_handler/view/lifecycle/s", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.d f134687b;

        public g(a.d dVar) {
            this.f134687b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            WeakReference weakReference = (WeakReference) t12;
            if (weakReference != null) {
                Object obj = weakReference.get();
                if (obj == null) {
                    V2.f318762a.e("Failed to handle show dialog deeplink", null);
                } else {
                    d dVar = (d) obj;
                    this.f134687b.w1(dVar.f134682a, dVar.f134683b);
                }
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/deeplink_handler/view/lifecycle/s", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.d f134688b;

        public h(a.d dVar) {
            this.f134688b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            WeakReference weakReference = (WeakReference) t12;
            if (weakReference != null) {
                Object obj = weakReference.get();
                if (obj == null) {
                    V2.f318762a.e("Failed to handle deeplink with dialog fragment factory", null);
                    return;
                }
                e eVar = (e) obj;
                this.f134688b.D0(eVar.f134685b, eVar.f134684a);
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/deeplink_handler/view/lifecycle/s", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.d f134689b;

        public i(a.d dVar) {
            this.f134689b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            WeakReference weakReference = (WeakReference) t12;
            if (weakReference != null) {
                Object obj = weakReference.get();
                if (obj == null) {
                    V2.f318762a.e("Failed to handle configurable dialog deeplink", null);
                    return;
                }
                c cVar = (c) obj;
                this.f134689b.u1(cVar.f134679a, cVar.f134680b, cVar.f134681c);
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/deeplink_handler/view/lifecycle/s", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.d f134690b;

        public j(a.d dVar) {
            this.f134690b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v4, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            WeakReference weakReference = (WeakReference) t12;
            if (weakReference != null) {
                Object obj = weakReference.get();
                if (obj == null) {
                    V2.f318762a.e("Failed to handle bottom sheet dialog deeplink", null);
                } else {
                    this.f134690b.k0(((b) obj).f134678a);
                }
            }
        }
    }

    @Inject
    public r() {
    }

    @Override // com.avito.android.deeplink_handler.view.a.d
    public final void D0(@Y61.k String str, @Y61.k Y41.a aVar) {
        C48419b.a(this.f134674d, new WeakReference(new e(str, aVar)));
    }

    public final void a(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k a.d dVar) {
        this.f134672b.observe(interfaceC22983P, new f(dVar));
        this.f134673c.observe(interfaceC22983P, new g(dVar));
        this.f134674d.observe(interfaceC22983P, new h(dVar));
        this.f134675e.observe(interfaceC22983P, new i(dVar));
        this.f134676f.observe(interfaceC22983P, new j(dVar));
    }

    @Override // com.avito.android.deeplink_handler.view.a.d
    public final void k0(@Y61.k Y41.l<? super Context, ? extends com.avito.android.lib.design.bottom_sheet.d> lVar) {
        C48419b.a(this.f134676f, new WeakReference(new b(lVar)));
    }

    @Override // com.avito.android.deeplink_handler.view.a.d
    @InterfaceC42830m
    public final void k1(@Y61.k Y41.l<? super com.avito.android.lib.deprecated_design.dialog.a, G0> lVar) {
        C48419b.a(this.f134672b, new WeakReference(new a(lVar)));
    }

    @Override // com.avito.android.deeplink_handler.view.a.d
    public final void u1(int i12, int i13, @Y61.k Y41.p pVar) {
        C48419b.a(this.f134675e, new WeakReference(new c(i12, i13, pVar)));
    }

    @Override // com.avito.android.deeplink_handler.view.a.d
    public final void w1(@Y61.k DialogFragment dialogFragment, @Y61.k String str) {
        C48419b.a(this.f134673c, new WeakReference(new d(dialogFragment, str)));
    }
}
