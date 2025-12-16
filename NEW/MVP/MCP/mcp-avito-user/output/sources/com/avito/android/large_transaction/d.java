package com.avito.android.large_transaction;

import Y61.l;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.C22491k0;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.app.task.LargeTransactionDetectorTask;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import io.reactivex.rxjava3.internal.operators.single.G;
import j.K;
import j.k0;
import j.l0;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LargeTransactionDetector.kt */
@Singleton
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/large_transaction/d;", "", "a", "b", "c", "_common_large-transaction-detector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f175039a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f175040b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Handler f175041c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.large_transaction.a f175042d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public LargeTransactionDetectorTask.a f175043e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a f175044f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final b f175045g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public m f175046h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap<String, Map<String, Bundle>> f175047i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap<String, Map<String, Integer>> f175048j;

    /* compiled from: LargeTransactionDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/large_transaction/d$a;", "Lid/i;", "_common_large-transaction-detector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends id.i {
        public a() {
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@Y61.k Activity activity, @l Bundle bundle) {
            d dVar = d.this;
            dVar.getClass();
            if (activity instanceof ActivityC22955m) {
                ((ActivityC22955m) activity).getSupportFragmentManager().e0(dVar.f175045g, true);
            }
            dVar.d(activity, null, "INTENT", activity.getIntent().getExtras());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostDestroyed(@Y61.k Activity activity) {
            d dVar = d.this;
            dVar.getClass();
            if (activity instanceof ActivityC22955m) {
                ((ActivityC22955m) activity).getSupportFragmentManager().v0(dVar.f175045g);
            }
            dVar.e(d.b(activity), null);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostSaveInstanceState(@Y61.k Activity activity, @Y61.k Bundle bundle) {
            d.this.d(activity, null, "SAVED_STATE", bundle);
        }
    }

    /* compiled from: LargeTransactionDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/large_transaction/d$b;", "Landroidx/fragment/app/FragmentManager$n;", "_common_large-transaction-detector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends FragmentManager.n {
        public b() {
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public final void onFragmentCreated(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment, @l Bundle bundle) {
            ActivityC22955m activityC22955mRequireActivity = fragment.requireActivity();
            d dVar = d.this;
            dVar.d(activityC22955mRequireActivity, fragment, d.a(dVar, fragment), fragment.getArguments());
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public final void onFragmentDestroyed(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
            d dVar = d.this;
            dVar.getClass();
            dVar.e(d.b(fragment.requireActivity()), d.a(dVar, fragment));
        }
    }

    /* compiled from: LargeTransactionDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/large_transaction/d$c;", "", "_common_large-transaction-detector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
    }

    /* compiled from: LargeTransactionDetector.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.large_transaction.d$d, reason: collision with other inner class name */
    public static final class C5160d<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ N f175052c;

        /* JADX WARN: Multi-variable type inference failed */
        public C5160d(Y41.l<? super String, G0> lVar) {
            this.f175052c = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            d.this.f175041c.post(new RunnableC28882d((String) obj, this.f175052c));
        }
    }

    /* compiled from: LargeTransactionDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f175053b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.l<? super Throwable, G0> lVar) {
            this.f175053b = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            this.f175053b.invoke((Throwable) obj);
        }
    }

    /* compiled from: LargeTransactionDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<String> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f175055m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f175056n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Bundle f175057o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, Bundle bundle) {
            super(0);
            this.f175055m = str;
            this.f175056n = str2;
            this.f175057o = bundle;
        }

        @Override // Y41.a
        public final String invoke() {
            com.avito.android.large_transaction.a aVar = d.this.f175042d;
            String str = this.f175055m + '.' + this.f175056n;
            Bundle bundle = this.f175057o;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            return aVar.c(bundle, str);
        }
    }

    /* compiled from: LargeTransactionDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LargeTransactionDetectorTask.a f175058l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f175059m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f175060n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(LargeTransactionDetectorTask.a aVar, String str, String str2) {
            super(1);
            this.f175058l = aVar;
            this.f175059m = str;
            this.f175060n = str2;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            LargeTransactionDetectorTask.this.trackOrThrow(new LargeTransactionException(str), this.f175059m, this.f175060n);
            return G0.f406611a;
        }
    }

    /* compiled from: LargeTransactionDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LargeTransactionDetectorTask.a f175061l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f175062m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f175063n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LargeTransactionDetectorTask.a aVar, String str, String str2) {
            super(1);
            this.f175061l = aVar;
            this.f175062m = str;
            this.f175063n = str2;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            String str = this.f175062m;
            this.f175061l.a(str, this.f175063n, th2);
            return G0.f406611a;
        }
    }

    /* compiled from: LargeTransactionDetector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.a<String> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f175065m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f175066n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f175067o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap<String, Bundle> f175068p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, int i12, LinkedHashMap<String, Bundle> linkedHashMap) {
            super(0);
            this.f175065m = str;
            this.f175066n = str2;
            this.f175067o = i12;
            this.f175068p = linkedHashMap;
        }

        @Override // Y41.a
        public final String invoke() {
            com.avito.android.large_transaction.a aVar = d.this.f175042d;
            String str = this.f175065m + '.' + this.f175066n;
            aVar.getClass();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sbB = C22491k0.b(str, ':');
            sbB.append(com.avito.android.large_transaction.f.a(this.f175067o));
            sbB.append('\n');
            sb2.append(sbB.toString());
            LinkedHashMap<String, Bundle> linkedHashMap = this.f175068p;
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry<String, Bundle> entry : linkedHashMap.entrySet()) {
                    sb2.append(aVar.c(entry.getValue(), entry.getKey()));
                }
            }
            return sb2.toString();
        }
    }

    /* compiled from: LargeTransactionDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LargeTransactionDetectorTask.a f175069l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f175070m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LargeTransactionDetectorTask.a aVar, String str) {
            super(1);
            this.f175069l = aVar;
            this.f175070m = str;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            LargeTransactionDetectorTask.this.trackOrThrow(new LargeTransactionException(str), this.f175070m, "SAVED_STATE");
            return G0.f406611a;
        }
    }

    /* compiled from: LargeTransactionDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LargeTransactionDetectorTask.a f175071l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f175072m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(LargeTransactionDetectorTask.a aVar, String str) {
            super(1);
            this.f175071l = aVar;
            this.f175072m = str;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            String str = this.f175072m;
            this.f175071l.a(str, "SAVED_STATE", th2);
            return G0.f406611a;
        }
    }

    @k0
    public d(@Y61.k Application application, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k Handler handler, @Y61.k com.avito.android.large_transaction.a aVar) {
        this.f175039a = application;
        this.f175040b = interfaceC35745a5;
        this.f175041c = handler;
        this.f175042d = aVar;
        this.f175044f = new a();
        this.f175045g = new b();
        this.f175047i = new LinkedHashMap<>();
        this.f175048j = new LinkedHashMap<>();
    }

    public static final String a(d dVar, Fragment fragment) {
        dVar.getClass();
        return fragment.getClass().getSimpleName() + '-' + fragment.hashCode();
    }

    public static String b(Activity activity) {
        return activity.getClass().getSimpleName() + '-' + activity.hashCode();
    }

    public final void c(@l0 Y41.a<String> aVar, @K Y41.l<? super String, G0> lVar, @K Y41.l<? super Throwable, G0> lVar2) {
        m mVar = this.f175046h;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f175046h = (m) new G(new com.avito.android.large_transaction.c(0, aVar)).z(this.f175040b.c()).x(new C5160d(lVar), new e(lVar2));
    }

    public final void d(Activity activity, Fragment fragment, String str, Bundle bundle) {
        int iB2 = com.avito.android.large_transaction.f.b(bundle);
        String strB = b(activity);
        String simpleName = activity.getClass().getSimpleName();
        String simpleName2 = fragment != null ? fragment.getClass().getSimpleName() : null;
        if (simpleName2 == null) {
            simpleName2 = str;
        }
        LinkedHashMap<String, Map<String, Bundle>> linkedHashMap = this.f175047i;
        Map<String, Bundle> linkedHashMap2 = linkedHashMap.get(strB);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap<>();
            linkedHashMap.put(strB, linkedHashMap2);
        }
        Map<String, Bundle> map = linkedHashMap2;
        LinkedHashMap<String, Map<String, Integer>> linkedHashMap3 = this.f175048j;
        Map<String, Integer> linkedHashMap4 = linkedHashMap3.get(strB);
        if (linkedHashMap4 == null) {
            linkedHashMap4 = new LinkedHashMap<>();
            linkedHashMap3.put(strB, linkedHashMap4);
        }
        Map<String, Integer> map2 = linkedHashMap4;
        if ("SAVED_STATE".equals(str)) {
            map.clear();
            map2.clear();
        }
        map.put(str, bundle == null ? Bundle.EMPTY : bundle);
        map2.put(str, Integer.valueOf(iB2));
        LargeTransactionDetectorTask.a aVar = this.f175043e;
        if (aVar == null) {
            return;
        }
        int iD02 = C42745f0.D0(map2.values());
        if (iB2 > 131072) {
            c(new f(strB, str, bundle), new g(aVar, simpleName, simpleName2), new h(aVar, simpleName, simpleName2));
        } else if (iD02 > 262144) {
            c(new i(strB, str, iD02, new LinkedHashMap(map)), new j(aVar, simpleName), new k(aVar, simpleName));
        }
    }

    public final void e(String str, String str2) {
        LinkedHashMap<String, Map<String, Integer>> linkedHashMap = this.f175048j;
        LinkedHashMap<String, Map<String, Bundle>> linkedHashMap2 = this.f175047i;
        if (str2 == null) {
            linkedHashMap2.remove(str);
            linkedHashMap.remove(str);
            return;
        }
        Map<String, Bundle> map = linkedHashMap2.get(str);
        if (map != null) {
            map.remove(str2);
        }
        Map<String, Integer> map2 = linkedHashMap.get(str);
        if (map2 != null) {
            map2.remove(str2);
        }
    }

    public /* synthetic */ d(Application application, InterfaceC35745a5 interfaceC35745a5, Handler handler, com.avito.android.large_transaction.a aVar, int i12, C42822w c42822w) {
        this(application, interfaceC35745a5, (i12 & 4) != 0 ? new Handler(Looper.getMainLooper()) : handler, aVar);
    }

    public /* synthetic */ d(Application application, InterfaceC35745a5 interfaceC35745a5, Handler handler, int i12, C42822w c42822w) {
        this(application, interfaceC35745a5, (i12 & 4) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    @Inject
    public d(@Y61.k Application application, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k Handler handler) {
        this(application, interfaceC35745a5, handler, new com.avito.android.large_transaction.a(application.getClassLoader(), 0, 2, null));
    }
}
