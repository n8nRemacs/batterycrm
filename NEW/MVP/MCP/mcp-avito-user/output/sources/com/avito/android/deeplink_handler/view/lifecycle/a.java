package com.avito.android.deeplink_handler.view.lifecycle;

import android.content.Context;
import android.content.Intent;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.architecture_components.C35749c;
import com.avito.android.util.architecture_components.D;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import qv.InterfaceC47451a;
import sv.C48419b;

/* compiled from: ActivityNavigatorLifecycleDeeplinkView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0002\u0005\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/a;", "Lcom/avito/android/deeplink_handler/view/a$a;", "Lcom/avito/android/deeplink_handler/view/lifecycle/n;", "<init>", "()V", "a", "b", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class a implements a.InterfaceC4053a, n<a.InterfaceC4053a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<InterfaceC47451a> f134635b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final D<b> f134636c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D<b> f134637d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final D<Y41.l<Context, G0>> f134638e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final D<AbstractC4062a> f134639f;

    /* compiled from: ActivityNavigatorLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/a$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deeplink_handler/view/lifecycle/a$a$a;", "Lcom/avito/android/deeplink_handler/view/lifecycle/a$a$b;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.view.lifecycle.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC4062a {

        /* compiled from: ActivityNavigatorLifecycleDeeplinkView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/a$a$a;", "Lcom/avito/android/deeplink_handler/view/lifecycle/a$a;", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.view.lifecycle.a$a$a, reason: collision with other inner class name */
        public static final class C4063a extends AbstractC4062a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C4063a f134640a = new C4063a();

            public C4063a() {
                super(null);
            }
        }

        /* compiled from: ActivityNavigatorLifecycleDeeplinkView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/a$a$b;", "Lcom/avito/android/deeplink_handler/view/lifecycle/a$a;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.view.lifecycle.a$a$b */
        public static final class b extends AbstractC4062a {

            /* renamed from: a, reason: collision with root package name */
            public final int f134641a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Intent f134642b;

            public b(int i12, @Y61.k Intent intent) {
                super(null);
                this.f134641a = i12;
                this.f134642b = intent;
            }
        }

        public /* synthetic */ AbstractC4062a(C42822w c42822w) {
            this();
        }

        public AbstractC4062a() {
        }
    }

    /* compiled from: ActivityNavigatorLifecycleDeeplinkView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/a$b;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Intent f134643a;

        /* renamed from: b, reason: collision with root package name */
        public final int f134644b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Exception, G0> f134645c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k Intent intent, int i12, @Y61.k Y41.l<? super Exception, G0> lVar) {
            this.f134643a = intent;
            this.f134644b = i12;
            this.f134645c = lVar;
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC4053a f134646b;

        public c(a.InterfaceC4053a interfaceC4053a) {
            this.f134646b = interfaceC4053a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                b bVar = (b) t12;
                this.f134646b.R(bVar.f134643a, bVar.f134645c);
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC4053a f134647b;

        public d(a.InterfaceC4053a interfaceC4053a) {
            this.f134647b = interfaceC4053a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                b bVar = (b) t12;
                this.f134647b.J(bVar.f134643a, bVar.f134644b, bVar.f134645c);
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC4053a f134648b;

        public e(a.InterfaceC4053a interfaceC4053a) {
            this.f134648b = interfaceC4053a;
        }

        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != null) {
                this.f134648b.g1((Y41.l) t12);
            }
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements InterfaceC23040h0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC4053a f134649b;

        public f(a.InterfaceC4053a interfaceC4053a) {
            this.f134649b = interfaceC4053a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                AbstractC4062a abstractC4062a = (AbstractC4062a) t12;
                boolean zEquals = abstractC4062a.equals(AbstractC4062a.C4063a.f134640a);
                a.InterfaceC4053a interfaceC4053a = this.f134649b;
                if (zEquals) {
                    interfaceC4053a.s1();
                } else if (abstractC4062a instanceof AbstractC4062a.b) {
                    AbstractC4062a.b bVar = (AbstractC4062a.b) abstractC4062a;
                    interfaceC4053a.X(bVar.f134641a, bVar.f134642b);
                }
            }
        }
    }

    @Inject
    public a(@Y61.k Set<InterfaceC47451a> set) {
        this.f134635b = set;
        this.f134636c = new D<>();
        this.f134637d = new D<>();
        this.f134638e = new D<>();
        this.f134639f = new D<>();
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void J(@Y61.k Intent intent, int i12, @Y61.k Y41.l<? super Exception, G0> lVar) {
        Iterator<T> it = this.f134635b.iterator();
        while (it.hasNext()) {
            ((InterfaceC47451a) it.next()).a(intent);
        }
        C48419b.a(this.f134637d, new b(intent, i12, lVar));
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void R(@Y61.k Intent intent, @Y61.k Y41.l<? super Exception, G0> lVar) {
        Iterator<T> it = this.f134635b.iterator();
        while (it.hasNext()) {
            ((InterfaceC47451a) it.next()).a(intent);
        }
        C48419b.a(this.f134636c, new b(intent, 0, lVar));
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void X(int i12, @Y61.k Intent intent) {
        C48419b.a(this.f134639f, new AbstractC4062a.b(i12, intent));
    }

    public final void a(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        D<b> d12 = this.f134636c;
        if (d12.hasActiveObservers()) {
            return;
        }
        C35749c c35749c = new C35749c(interfaceC22983P);
        d12.observe(c35749c, new c(interfaceC4053a));
        this.f134637d.observe(c35749c, new d(interfaceC4053a));
        this.f134638e.observe(c35749c, new e(interfaceC4053a));
        this.f134639f.observe(c35749c, new f(interfaceC4053a));
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void g1(@Y61.k Y41.l<? super Context, G0> lVar) {
        C48419b.a(this.f134638e, lVar);
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void s1() {
        C48419b.a(this.f134639f, AbstractC4062a.C4063a.f134640a);
    }

    public a() {
        this(B0.f406639b);
    }
}
