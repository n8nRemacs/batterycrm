package com.avito.android.publish.screen.objects.view;

import Ge0.InterfaceC13872a;
import com.avito.android.Q1;
import com.avito.android.blueprints.job_suggest.c;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.analytics.h0;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.search.suggest.SuggestSetFieldValue;
import com.avito.android.suggest_institutes_bottom_sheet.SuggestInstituteArguments;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43183m1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;
import l41.InterfaceC43543a;

/* compiled from: ObjectFillFormItemsEvents.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/view/b;", "Lcom/avito/android/publish/screen/objects/view/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f240279a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13872a, G0> f240280b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public h0 f240281c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f240282d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public InterfaceC33535v f240283e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public Q1 f240284f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public R0 f240285g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f240286h = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final A<T> f240287b = new A<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on multiselect click", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B<T> implements l41.g {
        public B() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C42784z0 c42784z0 = C42784z0.f406748b;
            b.e(b.this, ((ParameterElement.v) obj).f117181b, c42784z0);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C<T> f240289b = new C<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on observeMultiselectClearEvent", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "selectInfo", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D<T> implements l41.g {
        public D() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.c(b.this, (Ij.b) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final E<T> f240291b = new E<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe chips select clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "selectInfo", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class F<T> implements l41.g {
        public F() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.c(b.this, (Ij.b) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/items/a;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class G<T> implements l41.g {
        public G() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            boolean zBooleanValue = ((Boolean) q12.f406619b).booleanValue();
            com.avito.android.items.a aVar = (com.avito.android.items.a) q12.f406620c;
            b bVar = b.this;
            if (bVar.f240279a && !zBooleanValue) {
                h0 h0Var = bVar.f240281c;
                if (h0Var == null) {
                    h0Var = null;
                }
                h0Var.a(aVar);
            }
            if (bVar.f240279a && (((ParameterElement.p) aVar).f117487l instanceof ParameterElement.m.a)) {
                bVar.f240280b.invoke(new InterfaceC13872a.m(zBooleanValue));
            }
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class H<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final H<T> f240294b = new H<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe chips select clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "item", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class I<T> implements l41.g {
        public I() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.c(b.this, (Ij.b) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class J<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final J<T> f240296b = new J<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe checkbox select", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "item", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class K<T> implements l41.g {
        public K() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.c(b.this, (Ij.b) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class L<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final L<T> f240298b = new L<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe checkbox select", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/b;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/items/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class M<T> implements l41.g {
        public M() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.items.b bVar = (com.avito.android.items.b) obj;
            boolean z12 = bVar.f173929d;
            List<JO.m> list = bVar.f173941p;
            JO.m mVar = (JO.m) (z12 ? C42745f0.G(list) : C42745f0.S(list));
            if (mVar != null) {
                mVar.f8964e = bVar.f173929d;
                b.c(b.this, new Ij.b(bVar.f173927b, mVar, null, 4, null));
            }
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class N<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final N<T> f240300b = new N<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe switcher select", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/objects/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/objects/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class O<T> implements l41.g {
        public O() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.this.f240280b.invoke(InterfaceC13872a.f.f6635a);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class P<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final P<T> f240302b = new P<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to delete button clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/search/suggest/SuggestAction;", "actions", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Q<T> implements l41.g {
        public Q() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b bVar = b.this;
            bVar.getClass();
            for (SuggestAction suggestAction : (List) obj) {
                if (suggestAction instanceof SuggestAnalyticsEvent) {
                    InterfaceC33535v interfaceC33535v = bVar.f240283e;
                    if (interfaceC33535v == null) {
                        interfaceC33535v = null;
                    }
                    interfaceC33535v.w0((SuggestAnalyticsEvent) suggestAction);
                } else if (suggestAction instanceof SuggestSetFieldValue) {
                    SuggestSetFieldValue suggestSetFieldValue = (SuggestSetFieldValue) suggestAction;
                    bVar.f240280b.invoke(new InterfaceC13872a.o.d(new InterfaceC13872a.o.e(suggestSetFieldValue.getFieldId(), suggestSetFieldValue.getValue())));
                }
            }
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/d;", "element", "Lkotlin/G0;", "accept", "(Lcom/avito/android/items/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class R<T> implements l41.g {
        public R() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.items.d dVar = (com.avito.android.items.d) obj;
            String f117481f = dVar.getF117481f();
            if (f117481f == null) {
                f117481f = "";
            }
            b bVar = b.this;
            bVar.getClass();
            bVar.f240280b.invoke(new InterfaceC13872a.o.c(dVar, f117481f, false));
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class S<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final S<T> f240305b = new S<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed InstantMarketValueItemPresenter to bubbles clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/blueprints/job_suggest/c$a;", "clickEvent", "Lkotlin/G0;", "accept", "(Lcom/avito/android/blueprints/job_suggest/c$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class T<T> implements l41.g {
        public T() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            c.a aVar = (c.a) obj;
            SuggestInstituteArguments suggestInstituteArguments = new SuggestInstituteArguments(aVar.f106043a, aVar.f106044b, aVar.f106045c);
            b bVar = b.this;
            bVar.getClass();
            bVar.f240280b.invoke(new InterfaceC13872a.o.i(suggestInstituteArguments));
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class U<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final U<T> f240307b = new U<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed show suggest institutes clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class V<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final V<T> f240308b = new V<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe input value changes", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "selectInfo", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class W<T> implements l41.g {
        public W() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.c(b.this, (Ij.b) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class X<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final X<T> f240310b = new X<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe chips select clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "selectInfo", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Y<T> implements l41.g {
        public Y() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.c(b.this, (Ij.b) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Z<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final Z<T> f240312b = new Z<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe chips select clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "selectInfo", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$a, reason: case insensitive filesystem */
    public static final class C34021a<T> implements l41.g {
        public C34021a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.c(b.this, (Ij.b) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$b, reason: collision with other inner class name */
    public static final class C7214b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C7214b<T> f240314b = new C7214b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe chips select clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "selectInfo", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$c, reason: case insensitive filesystem */
    public static final class C34022c<T> implements l41.g {
        public C34022c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.c(b.this, (Ij.b) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$d, reason: case insensitive filesystem */
    public static final class C34023d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34023d<T> f240316b = new C34023d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe chips select clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "selectInfo", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$e, reason: case insensitive filesystem */
    public static final class C34024e<T> implements l41.g {
        public C34024e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.c(b.this, (Ij.b) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$f, reason: case insensitive filesystem */
    public static final class C34025f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34025f<T> f240318b = new C34025f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe radiogroup select clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "selectInfo", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$g, reason: case insensitive filesystem */
    public static final class C34026g<T> implements l41.g {
        public C34026g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.c(b.this, (Ij.b) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$h, reason: case insensitive filesystem */
    public static final class C34027h<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34027h<T> f240320b = new C34027h<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe radiogroup select clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C;", "select", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$i, reason: case insensitive filesystem */
    public static final class C34028i<T> implements l41.g {
        public C34028i() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.a(b.this, (ParameterElement.C) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$j, reason: case insensitive filesystem */
    public static final class C34029j<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34029j<T> f240322b = new C34029j<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe select clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/d;", "element", "Lkotlin/G0;", "accept", "(Lcom/avito/android/items/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$k, reason: case insensitive filesystem */
    public static final class C34030k<T> implements l41.g {
        public C34030k() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.items.d dVar = (com.avito.android.items.d) obj;
            String f117481f = dVar.getF117481f();
            if (f117481f == null) {
                f117481f = "";
            }
            b bVar = b.this;
            bVar.getClass();
            bVar.f240280b.invoke(new InterfaceC13872a.o.c(dVar, f117481f, false));
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.screen.objects.view.ObjectFillFormItemsEventsImpl$observeItemPresenterEvents$1$20", f = "ObjectFillFormItemsEvents.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$l, reason: case insensitive filesystem */
    public static final class C34031l extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f240324q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.blueprints.selector_card_group_bottom_sheet.l f240325r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b f240326s;

        /* compiled from: ObjectFillFormItemsEvents.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$F;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/category_parameters/ParameterElement$F;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.publish.screen.objects.view.b$l$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f240327b;

            public a(b bVar) {
                this.f240327b = bVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                b.a(this.f240327b, (ParameterElement.F) obj);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34031l(com.avito.android.blueprints.selector_card_group_bottom_sheet.l lVar, b bVar, Continuation continuation) {
            super(2, continuation);
            this.f240325r = lVar;
            this.f240326s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new C34031l(this.f240325r, this.f240326s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((C34031l) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f240324q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C43183m1 c43183m1 = new C43183m1(this.f240325r.getF236837c(), m0.f406844a.b(ParameterElement.F.class));
                a aVar = new a(this.f240326s);
                this.f240324q = 1;
                if (c43183m1.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C;", "select", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$m, reason: case insensitive filesystem */
    public static final class C34032m<T> implements l41.g {
        public C34032m() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.a(b.this, (ParameterElement.C) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$n, reason: case insensitive filesystem */
    public static final class C34033n<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34033n<T> f240329b = new C34033n<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe select clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C;", "select", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$o, reason: case insensitive filesystem */
    public static final class C34034o<T> implements l41.g {
        public C34034o() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.a(b.this, (ParameterElement.C) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$p, reason: case insensitive filesystem */
    public static final class C34035p<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34035p<T> f240331b = new C34035p<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe select clicks", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$q, reason: case insensitive filesystem */
    public static final class C34036q<T> implements l41.g {
        public C34036q() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.a(b.this, (ParameterElement.v) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$r, reason: case insensitive filesystem */
    public static final class C34037r<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34037r<T> f240333b = new C34037r<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on multiselect click", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$s, reason: case insensitive filesystem */
    public static final class C34038s<T> implements l41.g {
        public C34038s() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C42784z0 c42784z0 = C42784z0.f406748b;
            b.e(b.this, ((ParameterElement.v) obj).f117181b, c42784z0);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$t, reason: case insensitive filesystem */
    public static final class C34039t<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34039t<T> f240335b = new C34039t<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on observeMultiselectClearEvent", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$u, reason: case insensitive filesystem */
    public static final class C34040u<T> implements l41.g {
        public C34040u() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.a(b.this, (ParameterElement.v) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$v, reason: case insensitive filesystem */
    public static final class C34041v<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34041v<T> f240337b = new C34041v<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe input value changes", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$w, reason: case insensitive filesystem */
    public static final class C34042w<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34042w<T> f240338b = new C34042w<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on multiselect click", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$x, reason: case insensitive filesystem */
    public static final class C34043x<T> implements l41.g {
        public C34043x() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C42784z0 c42784z0 = C42784z0.f406748b;
            b.e(b.this, ((ParameterElement.v) obj).f117181b, c42784z0);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$y, reason: case insensitive filesystem */
    public static final class C34044y<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C34044y<T> f240340b = new C34044y<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on observeMultiselectClearEvent", (Throwable) obj);
        }
    }

    /* compiled from: ObjectFillFormItemsEvents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.objects.view.b$z, reason: case insensitive filesystem */
    public static final class C34045z<T> implements l41.g {
        public C34045z() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.a(b.this, (ParameterElement.v) obj);
        }
    }

    public b(@Y61.k Y41.l lVar, boolean z12) {
        this.f240279a = z12;
        this.f240280b = lVar;
    }

    public static final void a(b bVar, com.avito.conveyor_item.a aVar) {
        bVar.getClass();
        bVar.f240280b.invoke(new InterfaceC13872a.o.b(aVar));
    }

    public static final void b(b bVar, c.a aVar) {
        bVar.getClass();
        ParameterElement.C29376d c29376d = aVar.f106126a;
        ParameterElement.C29377e c29377e = c29376d.f117402f;
        Y41.l<InterfaceC13872a, G0> lVar = bVar.f240280b;
        if (c29377e != null) {
            lVar.invoke(new InterfaceC13872a.o.C0360a(c29376d, c29377e, null, aVar.f106128c, false));
        }
        lVar.invoke(new InterfaceC13872a.o.d(null, 1, null));
    }

    public static final void c(b bVar, Ij.b bVar2) {
        bVar.getClass();
        bVar.f240280b.invoke(new InterfaceC13872a.o.k(bVar2));
    }

    public static void e(b bVar, String str, C42784z0 c42784z0) {
        bVar.getClass();
        bVar.f240280b.invoke(new InterfaceC13872a.o.f(str, c42784z0, null));
    }

    public final void d(@Y61.k Set<TV0.d<?, ?>> set) {
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            boolean z12 = dVar instanceof com.avito.android.blueprints.input.d;
            io.reactivex.rxjava3.disposables.c cVar = this.f240286h;
            if (z12) {
                com.avito.android.blueprints.input.d dVar2 = (com.avito.android.blueprints.input.d) dVar;
                cVar.b(dVar2.b().k0(com.avito.android.items.d.class).v0(new C34030k(), C34041v.f240337b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                cVar.b(dVar2.n().t0(new G()));
            } else if (dVar instanceof com.avito.android.blueprint.input.c) {
                cVar.b(((com.avito.android.blueprint.input.c) dVar).b().k0(com.avito.android.items.d.class).v0(new R(), V.f240308b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.chips.d) {
                z<Ij.b> zVarH = ((com.avito.android.blueprints.chips.d) dVar).h();
                W w12 = new W();
                l41.g<? super Throwable> gVar = X.f240310b;
                zVarH.getClass();
                cVar.b(zVarH.v0(w12, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.chips.single.d) {
                z<Ij.b> zVarH2 = ((com.avito.android.blueprint.chips.single.d) dVar).h();
                Y y12 = new Y();
                l41.g<? super Throwable> gVar2 = Z.f240312b;
                zVarH2.getClass();
                cVar.b(zVarH2.v0(y12, gVar2, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.chips_multiselect.c) {
                z<Ij.b> zVarH3 = ((com.avito.android.blueprints.chips_multiselect.c) dVar).h();
                C34021a c34021a = new C34021a();
                l41.g<? super Throwable> gVar3 = C7214b.f240314b;
                zVarH3.getClass();
                cVar.b(zVarH3.v0(c34021a, gVar3, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.chips.multiple.c) {
                z<Ij.b> zVarH4 = ((com.avito.android.blueprint.chips.multiple.c) dVar).h();
                C34022c c34022c = new C34022c();
                l41.g<? super Throwable> gVar4 = C34023d.f240316b;
                zVarH4.getClass();
                cVar.b(zVarH4.v0(c34022c, gVar4, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.radiogroup.c) {
                z<Ij.b> zVarH5 = ((com.avito.android.blueprints.radiogroup.c) dVar).h();
                C34024e c34024e = new C34024e();
                l41.g<? super Throwable> gVar5 = C34025f.f240318b;
                zVarH5.getClass();
                cVar.b(zVarH5.v0(c34024e, gVar5, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.radiogroup.c) {
                z<Ij.b> zVarH6 = ((com.avito.android.blueprint.radiogroup.c) dVar).h();
                C34026g c34026g = new C34026g();
                l41.g<? super Throwable> gVar6 = C34027h.f240320b;
                zVarH6.getClass();
                cVar.b(zVarH6.v0(c34026g, gVar6, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.select.c) {
                cVar.b(((com.avito.android.blueprints.select.c) dVar).c().k0(ParameterElement.C.class).v0(new C34028i(), C34029j.f240322b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else {
                if (dVar instanceof com.avito.android.blueprints.selector_card_group_bottom_sheet.l) {
                    R0 r02 = this.f240285g;
                    if (r02 == null) {
                        r02 = null;
                    }
                    C43259k.d(kotlinx.coroutines.U.a(r02.b()), null, null, new C34031l((com.avito.android.blueprints.selector_card_group_bottom_sheet.l) dVar, this, null), 3);
                } else if (dVar instanceof com.avito.android.blueprint.select.c) {
                    cVar.b(((com.avito.android.blueprint.select.c) dVar).c().k0(ParameterElement.C.class).v0(new C34032m(), C34033n.f240329b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                } else if (dVar instanceof com.avito.android.blueprint.address.c) {
                    cVar.b(((com.avito.android.blueprint.address.c) dVar).c().k0(ParameterElement.C.class).v0(new C34034o(), C34035p.f240331b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                } else if (dVar instanceof com.avito.android.blueprint.multiselect.c) {
                    com.avito.android.blueprint.multiselect.c cVar2 = (com.avito.android.blueprint.multiselect.c) dVar;
                    z<ParameterElement.v> zVarC = cVar2.c();
                    InterfaceC35745a5 interfaceC35745a5 = this.f240282d;
                    if (interfaceC35745a5 == null) {
                        interfaceC35745a5 = null;
                    }
                    I0 i0J0 = zVarC.j0(interfaceC35745a5.e());
                    C34036q c34036q = new C34036q();
                    l41.g<? super Throwable> gVar7 = C34037r.f240333b;
                    InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                    cVar.b(i0J0.v0(c34036q, gVar7, interfaceC43543a));
                    z<ParameterElement.v> zVarZ = cVar2.z();
                    InterfaceC35745a5 interfaceC35745a52 = this.f240282d;
                    cVar.b(zVarZ.j0((interfaceC35745a52 != null ? interfaceC35745a52 : null).e()).v0(new C34038s(), C34039t.f240335b, interfaceC43543a));
                } else if (dVar instanceof com.avito.android.blueprints.publish.multiselect.c) {
                    com.avito.android.blueprints.publish.multiselect.c cVar3 = (com.avito.android.blueprints.publish.multiselect.c) dVar;
                    z<ParameterElement.v> zVarC2 = cVar3.c();
                    InterfaceC35745a5 interfaceC35745a53 = this.f240282d;
                    if (interfaceC35745a53 == null) {
                        interfaceC35745a53 = null;
                    }
                    I0 i0J02 = zVarC2.j0(interfaceC35745a53.e());
                    C34040u c34040u = new C34040u();
                    l41.g<? super Throwable> gVar8 = C34042w.f240338b;
                    InterfaceC43543a interfaceC43543a2 = io.reactivex.rxjava3.internal.functions.a.f401993c;
                    cVar.b(i0J02.v0(c34040u, gVar8, interfaceC43543a2));
                    z<ParameterElement.v> zVarZ2 = cVar3.z();
                    InterfaceC35745a5 interfaceC35745a54 = this.f240282d;
                    cVar.b(zVarZ2.j0((interfaceC35745a54 != null ? interfaceC35745a54 : null).e()).v0(new C34043x(), C34044y.f240340b, interfaceC43543a2));
                } else if (dVar instanceof com.avito.android.compose_items.multiselect.c) {
                    com.avito.android.compose_items.multiselect.c cVar4 = (com.avito.android.compose_items.multiselect.c) dVar;
                    z<ParameterElement.v> zVarC3 = cVar4.c();
                    InterfaceC35745a5 interfaceC35745a55 = this.f240282d;
                    if (interfaceC35745a55 == null) {
                        interfaceC35745a55 = null;
                    }
                    I0 i0J03 = zVarC3.j0(interfaceC35745a55.e());
                    C34045z c34045z = new C34045z();
                    l41.g<? super Throwable> gVar9 = A.f240287b;
                    InterfaceC43543a interfaceC43543a3 = io.reactivex.rxjava3.internal.functions.a.f401993c;
                    cVar.b(i0J03.v0(c34045z, gVar9, interfaceC43543a3));
                    z<ParameterElement.v> zVarZ3 = cVar4.z();
                    InterfaceC35745a5 interfaceC35745a56 = this.f240282d;
                    cVar.b(zVarZ3.j0((interfaceC35745a56 != null ? interfaceC35745a56 : null).e()).v0(new B(), C.f240289b, interfaceC43543a3));
                } else if (dVar instanceof com.avito.android.compose_items.chips_multiselect.c) {
                    z<Ij.b> zVarH7 = ((com.avito.android.compose_items.chips_multiselect.c) dVar).h();
                    D d12 = new D();
                    l41.g<? super Throwable> gVar10 = E.f240291b;
                    zVarH7.getClass();
                    cVar.b(zVarH7.v0(d12, gVar10, io.reactivex.rxjava3.internal.functions.a.f401993c));
                } else if (dVar instanceof com.avito.android.compose_items.chips_select.c) {
                    z<Ij.b> zVarH8 = ((com.avito.android.compose_items.chips_select.c) dVar).h();
                    F f12 = new F();
                    l41.g<? super Throwable> gVar11 = H.f240294b;
                    zVarH8.getClass();
                    cVar.b(zVarH8.v0(f12, gVar11, io.reactivex.rxjava3.internal.functions.a.f401993c));
                } else if (dVar instanceof com.avito.android.blueprints.publish.select.inline.c) {
                    z<Ij.b> zVarG = ((com.avito.android.blueprints.publish.select.inline.c) dVar).g();
                    InterfaceC35745a5 interfaceC35745a57 = this.f240282d;
                    cVar.b(zVarG.j0((interfaceC35745a57 != null ? interfaceC35745a57 : null).e()).v0(new I(), J.f240296b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                } else if (dVar instanceof com.avito.android.blueprint.checkbox.c) {
                    z<Ij.b> zVarG2 = ((com.avito.android.blueprint.checkbox.c) dVar).g();
                    InterfaceC35745a5 interfaceC35745a58 = this.f240282d;
                    cVar.b(zVarG2.j0((interfaceC35745a58 != null ? interfaceC35745a58 : null).e()).v0(new K(), L.f240298b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                } else if (dVar instanceof com.avito.android.blueprints.switcher.b) {
                    Q1 q12 = this.f240284f;
                    if (q12 == null) {
                        q12 = null;
                    }
                    q12.getClass();
                    kotlin.reflect.n<Object> nVar = Q1.f67448x0[79];
                    if (((Boolean) q12.f67499m0.a().invoke()).booleanValue()) {
                        z<com.avito.android.items.b> zVarB = ((com.avito.android.blueprints.switcher.b) dVar).b();
                        InterfaceC35745a5 interfaceC35745a59 = this.f240282d;
                        cVar.b(zVarB.j0((interfaceC35745a59 != null ? interfaceC35745a59 : null).e()).v0(new M(), N.f240300b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                    }
                } else if (dVar instanceof com.avito.android.publish.objects.blueprints.c) {
                    C41981q0 f237585c = ((com.avito.android.publish.objects.blueprints.c) dVar).getF237585c();
                    O o12 = new O();
                    l41.g<? super Throwable> gVar12 = P.f240302b;
                    f237585c.getClass();
                    cVar.b(f237585c.v0(o12, gVar12, io.reactivex.rxjava3.internal.functions.a.f401993c));
                } else if (dVar instanceof com.avito.android.blueprints.publish.date_interval.c) {
                    new com.avito.android.blueprints.publish.date_interval.f(new d(this)).a((com.avito.android.blueprints.publish.date_interval.c) dVar, cVar);
                } else if (dVar instanceof com.avito.android.blueprint.date.interval.c) {
                    new com.avito.android.blueprint.date.interval.f(new c(this)).a((com.avito.android.blueprint.date.interval.c) dVar, cVar);
                } else if (dVar instanceof com.avito.android.publish.slots.imv.item.d) {
                    C41981q0 c41981q0 = ((com.avito.android.publish.slots.imv.item.d) dVar).f244279f;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    InterfaceC35745a5 interfaceC35745a510 = this.f240282d;
                    if (interfaceC35745a510 == null) {
                        interfaceC35745a510 = null;
                    }
                    io.reactivex.rxjava3.internal.operators.observable.E eY2 = c41981q0.y(300L, timeUnit, interfaceC35745a510.c());
                    InterfaceC35745a5 interfaceC35745a511 = this.f240282d;
                    cVar.b(eY2.j0((interfaceC35745a511 != null ? interfaceC35745a511 : null).e()).v0(new Q(), S.f240305b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                } else if (dVar instanceof com.avito.android.blueprints.job_suggest.c) {
                    io.reactivex.rxjava3.internal.operators.observable.C cB2 = y.b(((com.avito.android.blueprints.job_suggest.c) dVar).f106042c);
                    InterfaceC35745a5 interfaceC35745a512 = this.f240282d;
                    cVar.b(cB2.x0((interfaceC35745a512 != null ? interfaceC35745a512 : null).e()).y(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).v0(new T(), U.f240307b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                }
            }
        }
    }
}
