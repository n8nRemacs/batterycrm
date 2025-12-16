package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import s0.C47949a;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/u2;", "", "a", "b", "c", "d", "e", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22532u2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f41607a = a.f41608a;

    /* compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/u2$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.u2$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f41608a = new a();
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/u2$d;", "Landroidx/compose/ui/platform/u2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.u2$d */
    public static final class d implements InterfaceC22532u2 {
        @Override // androidx.compose.ui.platform.InterfaceC22532u2
        @Y61.k
        public final Y41.a<kotlin.G0> a(@Y61.k AbstractC22450a abstractC22450a) {
            C22540w2.a(abstractC22450a, null);
            throw null;
        }
    }

    @Y61.k
    Y41.a<kotlin.G0> a(@Y61.k AbstractC22450a abstractC22450a);

    /* compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/u2$b;", "Landroidx/compose/ui/platform/u2;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.u2$b */
    public static final class b implements InterfaceC22532u2 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f41609b = new b();

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.platform.u2$b$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AbstractC22450a f41610l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ ViewOnAttachStateChangeListenerC1679b f41611m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC22450a abstractC22450a, ViewOnAttachStateChangeListenerC1679b viewOnAttachStateChangeListenerC1679b) {
                super(0);
                this.f41610l = abstractC22450a;
                this.f41611m = viewOnAttachStateChangeListenerC1679b;
            }

            @Override // Y41.a
            public final kotlin.G0 invoke() {
                this.f41610l.removeOnAttachStateChangeListener(this.f41611m);
                return kotlin.G0.f406611a;
            }
        }

        @Override // androidx.compose.ui.platform.InterfaceC22532u2
        @Y61.k
        public final Y41.a<kotlin.G0> a(@Y61.k AbstractC22450a abstractC22450a) {
            ViewOnAttachStateChangeListenerC1679b viewOnAttachStateChangeListenerC1679b = new ViewOnAttachStateChangeListenerC1679b(abstractC22450a);
            abstractC22450a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1679b);
            return new a(abstractC22450a, viewOnAttachStateChangeListenerC1679b);
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/platform/u2$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.u2$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC1679b implements View.OnAttachStateChangeListener {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC22450a f41612b;

            public ViewOnAttachStateChangeListenerC1679b(AbstractC22450a abstractC22450a) {
                this.f41612b = abstractC22450a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                this.f41612b.d();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/u2$c;", "Landroidx/compose/ui/platform/u2;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.u2$c */
    public static final class c implements InterfaceC22532u2 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f41613b = new c();

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.platform.u2$c$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AbstractC22450a f41614l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ b f41615m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ C22491k0 f41616n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC22450a abstractC22450a, b bVar, C22491k0 c22491k0) {
                super(0);
                this.f41614l = abstractC22450a;
                this.f41615m = bVar;
                this.f41616n = c22491k0;
            }

            @Override // Y41.a
            public final kotlin.G0 invoke() {
                b bVar = this.f41615m;
                AbstractC22450a abstractC22450a = this.f41614l;
                abstractC22450a.removeOnAttachStateChangeListener(bVar);
                androidx.customview.poolingcontainer.a.b(abstractC22450a, this.f41616n);
                return kotlin.G0.f406611a;
            }
        }

        @Override // androidx.compose.ui.platform.InterfaceC22532u2
        @Y61.k
        public final Y41.a<kotlin.G0> a(@Y61.k AbstractC22450a abstractC22450a) {
            b bVar = new b(abstractC22450a);
            abstractC22450a.addOnAttachStateChangeListener(bVar);
            C22491k0 c22491k0 = new C22491k0();
            androidx.customview.poolingcontainer.a.a(abstractC22450a, c22491k0);
            return new a(abstractC22450a, bVar, c22491k0);
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/platform/u2$c$b", "Landroid/view/View$OnAttachStateChangeListener;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.u2$c$b */
        public static final class b implements View.OnAttachStateChangeListener {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC22450a f41617b;

            public b(AbstractC22450a abstractC22450a) {
                this.f41617b = abstractC22450a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                boolean z12;
                AbstractC22450a abstractC22450a = this.f41617b;
                Iterator<ViewParent> it = androidx.core.view.q0.b(abstractC22450a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object obj = (ViewParent) it.next();
                    if (obj instanceof View) {
                        Object tag = ((View) obj).getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            z12 = true;
                            break;
                        }
                    }
                }
                if (z12) {
                    return;
                }
                abstractC22450a.d();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/u2$e;", "Landroidx/compose/ui/platform/u2;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.u2$e */
    public static final class e implements InterfaceC22532u2 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final e f41618b = new e();

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.platform.u2$e$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AbstractC22450a f41619l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ c f41620m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC22450a abstractC22450a, c cVar) {
                super(0);
                this.f41619l = abstractC22450a;
                this.f41620m = cVar;
            }

            @Override // Y41.a
            public final kotlin.G0 invoke() {
                this.f41619l.removeOnAttachStateChangeListener(this.f41620m);
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.platform.u2$e$b */
        public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ l0.h<Y41.a<kotlin.G0>> f41621l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l0.h<Y41.a<kotlin.G0>> hVar) {
                super(0);
                this.f41621l = hVar;
            }

            @Override // Y41.a
            public final kotlin.G0 invoke() {
                this.f41621l.f406842b.invoke();
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.u2$e$a] */
        @Override // androidx.compose.ui.platform.InterfaceC22532u2
        @Y61.k
        public final Y41.a<kotlin.G0> a(@Y61.k AbstractC22450a abstractC22450a) {
            if (!abstractC22450a.isAttachedToWindow()) {
                l0.h hVar = new l0.h();
                c cVar = new c(abstractC22450a, hVar);
                abstractC22450a.addOnAttachStateChangeListener(cVar);
                hVar.f406842b = new a(abstractC22450a, cVar);
                return new b(hVar);
            }
            InterfaceC22983P interfaceC22983PA = androidx.view.V0.a(abstractC22450a);
            if (interfaceC22983PA != null) {
                return C22540w2.a(abstractC22450a, interfaceC22983PA.getLifecycle());
            }
            C47949a.c("View tree for " + abstractC22450a + " has no ViewTreeLifecycleOwner");
            throw new KotlinNothingValueException();
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/platform/u2$e$c", "Landroid/view/View$OnAttachStateChangeListener;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.u2$e$c */
        public static final class c implements View.OnAttachStateChangeListener {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC22450a f41622b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l0.h<Y41.a<kotlin.G0>> f41623c;

            public c(AbstractC22450a abstractC22450a, l0.h<Y41.a<kotlin.G0>> hVar) {
                this.f41622b = abstractC22450a;
                this.f41623c = hVar;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [T, Y41.a] */
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                AbstractC22450a abstractC22450a = this.f41622b;
                InterfaceC22983P interfaceC22983PA = androidx.view.V0.a(abstractC22450a);
                if (interfaceC22983PA != null) {
                    this.f41623c.f406842b = C22540w2.a(abstractC22450a, interfaceC22983PA.getLifecycle());
                    abstractC22450a.removeOnAttachStateChangeListener(this);
                } else {
                    C47949a.c("View tree for " + abstractC22450a + " has no ViewTreeLifecycleOwner");
                    throw new KotlinNothingValueException();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }
        }
    }
}
