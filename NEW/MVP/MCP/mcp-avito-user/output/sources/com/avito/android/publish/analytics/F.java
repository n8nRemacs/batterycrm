package com.avito.android.publish.analytics;

import android.annotation.SuppressLint;
import com.avito.android.blueprint.suggest.InterfaceC28874c;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.items.tagged_input.InterfaceC33870b;
import com.avito.android.validation.InterfaceC36030r0;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.kotlin.i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: PublishInputsAnalyticTracker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/F;", "Lcom/avito/android/publish/analytics/E;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"HardcodeStringDetector"})
/* loaded from: classes16.dex */
public final class F implements E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f232143a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34155z f232144b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<TV0.d<?, ?>> f232145c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36030r0 f232146d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f232147e = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<UV0.a<? extends com.avito.conveyor_item.a>> f232148f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f232149g;

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/a;", "it", "", "test", "(Lcom/avito/android/items/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f232150b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.items.a) obj).getF117481f() != null;
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/a;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/items/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String f117480e;
            String f117481f;
            com.avito.android.items.a aVar = (com.avito.android.items.a) obj;
            boolean z12 = aVar instanceof com.avito.android.items.d;
            if (z12) {
                f117480e = ((com.avito.android.items.d) aVar).getF117480e();
            } else if (aVar instanceof ParameterElement.H) {
                f117480e = ((ParameterElement.H) aVar).f117299e;
            } else {
                if (!(aVar instanceof ParameterElement.I)) {
                    throw new IllegalArgumentException("Unknown BasicInputItem implementation " + aVar);
                }
                f117480e = ((ParameterElement.I) aVar).f117324e;
            }
            if (z12 && ((com.avito.android.items.d) aVar).getF117498w()) {
                String f117481f2 = aVar.getF117481f();
                f117481f = String.valueOf(f117481f2 != null ? Integer.valueOf(f117481f2.length()) : null);
            } else {
                f117481f = aVar.getF117481f();
            }
            F f12 = F.this;
            f12.f232143a.O(f12.f232144b.U(), aVar.getF202741b(), f117480e, f117481f);
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(F.this.f232143a, "observeInputChanges failed", (Throwable) obj, 4);
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/items/a;", "it", "apply", "(Lkotlin/Q;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T, R> f232153b = new d<>();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            return (Boolean) ((kotlin.Q) obj).f406619b;
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/items/a;", "item", "", "isFocused", "Lkotlin/Q;", "apply", "(Lcom/avito/android/items/a;Z)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T1, T2, R> f232154b = new e<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj2;
            bool.booleanValue();
            return new kotlin.Q(bool, (com.avito.android.items.a) obj);
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/items/a;", "it", "test", "(Lkotlin/Q;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f232155b = new f<>();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.r
        public final boolean test(Object obj) {
            return !((Boolean) ((kotlin.Q) obj).f406619b).booleanValue();
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/items/a;", "it", "apply", "(Lkotlin/Q;)Lcom/avito/android/items/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T, R> f232156b = new g<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (com.avito.android.items.a) ((kotlin.Q) obj).f406620c;
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/items/a;", "it", "test", "(Lkotlin/Q;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T> f232157b = new h<>();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.r
        public final boolean test(Object obj) {
            return !((Boolean) ((kotlin.Q) obj).f406619b).booleanValue();
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/items/a;", "it", "apply", "(Lkotlin/Q;)Lcom/avito/android/items/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T, R> f232158b = new i<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (com.avito.android.items.a) ((kotlin.Q) obj).f406620c;
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/items/a;", "it", "test", "(Lkotlin/Q;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final j<T> f232159b = new j<>();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Boolean) ((kotlin.Q) obj).f406619b).booleanValue();
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/items/a;", "it", "apply", "(Lkotlin/Q;)Lcom/avito/android/items/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T, R> f232160b = new k<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (com.avito.android.items.a) ((kotlin.Q) obj).f406620c;
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/a;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/items/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T> implements l41.g {
        public l() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String f117480e;
            com.avito.android.items.a aVar = (com.avito.android.items.a) obj;
            if (aVar instanceof com.avito.android.items.d) {
                f117480e = ((com.avito.android.items.d) aVar).getF117480e();
            } else if (aVar instanceof ParameterElement.H) {
                f117480e = ((ParameterElement.H) aVar).f117299e;
            } else {
                if (!(aVar instanceof ParameterElement.I)) {
                    throw new IllegalArgumentException("Unknown BasicInputItem implementation " + aVar);
                }
                f117480e = ((ParameterElement.I) aVar).f117324e;
            }
            F f12 = F.this;
            f12.f232143a.R(f12.f232144b.U(), f117480e);
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m<T> implements l41.g {
        public m() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(F.this.f232143a, "observeInputFocusChanges failed", (Throwable) obj, 4);
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00070\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0006\b\u0001\u0012\u00020\u0003 \u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "LUV0/a;", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "params", "", "Lkotlin/internal/i;", "apply", "(LUV0/a;)Ljava/util/List;", "com/avito/android/publish/analytics/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final n<T, R> f232163b = new n<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            UV0.b bVarB = com.avito.konveyor.util.g.b((UV0.a) obj);
            ArrayList arrayList = new ArrayList();
            for (T t12 : bVarB) {
                if (t12 instanceof ParameterElement.C) {
                    arrayList.add(t12);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((ParameterElement) it.next());
            }
            return arrayList2;
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002(\u0010\u0005\u001a$\u0012\u000f\u0012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u0003\u0012\u000f\u0012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "Lkotlin/Q;", "", "Lkotlin/internal/i;", "wasNowPair", "", "apply", "(Lkotlin/Q;)Ljava/util/List;", "com/avito/android/publish/analytics/I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o<T, R> implements l41.o {
        @Override // l41.o
        public final Object apply(Object obj) {
            T next;
            kotlin.Q q12 = (kotlin.Q) obj;
            List list = (List) q12.f406619b;
            List<ParameterElement> list2 = (List) q12.f406620c;
            ArrayList arrayList = new ArrayList();
            for (ParameterElement parameterElement : list2) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((ParameterElement) next).f117181b, parameterElement.f117181b)) {
                        break;
                    }
                }
                ParameterElement parameterElement2 = next;
                if (!kotlin.jvm.internal.L.f(((ParameterElement.C) parameterElement).f117210f, parameterElement2 != null ? ((ParameterElement.C) parameterElement2).f117210f : null)) {
                    arrayList.add(parameterElement);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "", "changedItems", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "com/avito/android/publish/analytics/J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p<T> implements l41.g {
        public p() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            for (ParameterElement parameterElement : (List) obj) {
                F f12 = F.this;
                InterfaceC33535v interfaceC33535v = f12.f232143a;
                String str = parameterElement.f117181b;
                ParameterElement.C c12 = (ParameterElement.C) parameterElement;
                interfaceC33535v.O(f12.f232144b.U(), str, c12.f117208d, c12.f117210f);
            }
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00070\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0006\b\u0001\u0012\u00020\u0003 \u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "LUV0/a;", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "params", "", "Lkotlin/internal/i;", "apply", "(LUV0/a;)Ljava/util/List;", "com/avito/android/publish/analytics/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final q<T, R> f232165b = new q<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            UV0.b bVarB = com.avito.konveyor.util.g.b((UV0.a) obj);
            ArrayList arrayList = new ArrayList();
            for (T t12 : bVarB) {
                if (t12 instanceof ParameterElement.v) {
                    arrayList.add(t12);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((ParameterElement) it.next());
            }
            return arrayList2;
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002(\u0010\u0005\u001a$\u0012\u000f\u0012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u0003\u0012\u000f\u0012\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "Lkotlin/Q;", "", "Lkotlin/internal/i;", "wasNowPair", "", "apply", "(Lkotlin/Q;)Ljava/util/List;", "com/avito/android/publish/analytics/I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r<T, R> implements l41.o {
        @Override // l41.o
        public final Object apply(Object obj) {
            T next;
            kotlin.Q q12 = (kotlin.Q) obj;
            List list = (List) q12.f406619b;
            List<ParameterElement> list2 = (List) q12.f406620c;
            ArrayList arrayList = new ArrayList();
            for (ParameterElement parameterElement : list2) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((ParameterElement) next).f117181b, parameterElement.f117181b)) {
                        break;
                    }
                }
                ParameterElement parameterElement2 = next;
                if (!kotlin.jvm.internal.L.f(((ParameterElement.v) parameterElement).f117544e, parameterElement2 != null ? ((ParameterElement.v) parameterElement2).f117544e : null)) {
                    arrayList.add(parameterElement);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "", "changedItems", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "com/avito/android/publish/analytics/J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s<T> implements l41.g {
        public s() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            for (ParameterElement parameterElement : (List) obj) {
                F f12 = F.this;
                InterfaceC33535v interfaceC33535v = f12.f232143a;
                String str = parameterElement.f117181b;
                ParameterElement.v vVar = (ParameterElement.v) parameterElement;
                interfaceC33535v.O(f12.f232144b.U(), str, vVar.f117543d, vVar.f117544e);
            }
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement;)V", "com/avito/android/publish/analytics/G", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t<T> implements l41.g {
        public t() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            F f12 = F.this;
            f12.f232143a.R(f12.f232144b.U(), ((ParameterElement.C) ((ParameterElement) obj)).f117208d);
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement;)V", "com/avito/android/publish/analytics/G", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u<T> implements l41.g {
        public u() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            F f12 = F.this;
            f12.f232143a.R(f12.f232144b.U(), ((ParameterElement.C) ((ParameterElement) obj)).f117208d);
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement;)V", "com/avito/android/publish/analytics/G", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v<T> implements l41.g {
        public v() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            F f12 = F.this;
            f12.f232143a.R(f12.f232144b.U(), ((ParameterElement.v) ((ParameterElement) obj)).f117543d);
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement;)V", "com/avito/android/publish/analytics/G", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w<T> implements l41.g {
        public w() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            F f12 = F.this;
            f12.f232143a.R(f12.f232144b.U(), ((ParameterElement.C) ((ParameterElement) obj)).f117208d);
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement;)V", "com/avito/android/publish/analytics/G", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x<T> implements l41.g {
        public x() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            F f12 = F.this;
            f12.f232143a.R(f12.f232144b.U(), ((ParameterElement.v) ((ParameterElement) obj)).f117543d);
        }
    }

    /* compiled from: PublishInputsAnalyticTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement;)V", "com/avito/android/publish/analytics/G", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y<T> implements l41.g {
        public y() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            F f12 = F.this;
            f12.f232143a.R(f12.f232144b.U(), ((ParameterElement.v) ((ParameterElement) obj)).f117543d);
        }
    }

    @Inject
    public F(@Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k Set<TV0.d<?, ?>> set, @Y61.k InterfaceC36030r0 interfaceC36030r0) {
        this.f232143a = interfaceC33535v;
        this.f232144b = interfaceC34155z;
        this.f232145c = set;
        this.f232146d = interfaceC36030r0;
        com.jakewharton.rxrelay3.c<UV0.a<? extends com.avito.conveyor_item.a>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f232148f = cVar;
        this.f232149g = cVar;
    }

    @Override // com.avito.android.publish.analytics.E
    public final void a() {
        this.f232147e.e();
    }

    @Override // com.avito.android.publish.analytics.E
    public final void b() {
        Iterator<T> it = this.f232145c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            io.reactivex.rxjava3.disposables.c cVar = this.f232147e;
            if (!zHasNext) {
                l41.o oVar = n.f232163b;
                com.jakewharton.rxrelay3.c<UV0.a<? extends com.avito.conveyor_item.a>> cVar2 = this.f232148f;
                B0 b0D0 = cVar2.d0(oVar);
                B0 b0D02 = i1.a(b0D0, b0D0.q0(1L)).d0(new o());
                p pVar = new p();
                K k12 = new K(this);
                InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                cVar.b(b0D02.v0(pVar, k12, interfaceC43543a));
                InterfaceC36030r0 interfaceC36030r0 = this.f232146d;
                com.jakewharton.rxrelay3.c cVarG = interfaceC36030r0.g();
                com.jakewharton.rxrelay3.c cVar3 = this.f232149g;
                cVar.b(cVarG.t0(cVar3));
                B0 b0D03 = cVar2.d0(q.f232165b);
                cVar.b(i1.a(b0D03, b0D03.q0(1L)).d0(new r()).v0(new s(), new K(this), interfaceC43543a));
                cVar.b(interfaceC36030r0.g().t0(cVar3));
                return;
            }
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.blueprints.input.d) {
                com.avito.android.blueprints.input.d dVar2 = (com.avito.android.blueprints.input.d) dVar;
                d(dVar2.n());
                c(dVar2.n(), dVar2.b());
            } else if (dVar instanceof com.avito.android.blueprint.input.c) {
                com.avito.android.blueprint.input.c cVar4 = (com.avito.android.blueprint.input.c) dVar;
                d(cVar4.n());
                c(cVar4.n(), cVar4.b());
            } else if (dVar instanceof com.avito.android.publish.items.video.c) {
                com.avito.android.publish.items.video.c cVar5 = (com.avito.android.publish.items.video.c) dVar;
                d(cVar5.n());
                c(cVar5.n(), cVar5.b());
            } else if (dVar instanceof com.avito.android.blueprint.video.url.c) {
                com.avito.android.blueprint.video.url.c cVar6 = (com.avito.android.blueprint.video.url.c) dVar;
                d(cVar6.n());
                c(cVar6.n(), cVar6.b());
            } else if (dVar instanceof com.avito.android.blueprints.switcher.b) {
                io.reactivex.rxjava3.core.z<com.avito.android.items.b> zVarB = ((com.avito.android.blueprints.switcher.b) dVar).b();
                M m12 = new M(this);
                N n12 = new N(this);
                zVarB.getClass();
                cVar.b(zVarB.v0(m12, n12, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.switcher.c) {
                io.reactivex.rxjava3.core.z<com.avito.android.items.b> zVarB2 = ((com.avito.android.blueprint.switcher.c) dVar).b();
                M m13 = new M(this);
                N n13 = new N(this);
                zVarB2.getClass();
                cVar.b(zVarB2.v0(m13, n13, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof InterfaceC33870b) {
                InterfaceC33870b interfaceC33870b = (InterfaceC33870b) dVar;
                d(interfaceC33870b.n());
                c(interfaceC33870b.n(), interfaceC33870b.b());
            } else if (dVar instanceof InterfaceC28874c) {
                InterfaceC28874c interfaceC28874c = (InterfaceC28874c) dVar;
                d(interfaceC28874c.n());
                c(interfaceC28874c.n(), interfaceC28874c.b());
            } else if (dVar instanceof com.avito.android.blueprints.select.c) {
                io.reactivex.rxjava3.core.z<ParameterElement.C> zVarC = ((com.avito.android.blueprints.select.c) dVar).c();
                t tVar = new t();
                H h12 = new H(this);
                zVarC.getClass();
                cVar.b(zVarC.v0(tVar, h12, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.select.c) {
                io.reactivex.rxjava3.core.z<ParameterElement.C> zVarC2 = ((com.avito.android.blueprint.select.c) dVar).c();
                u uVar = new u();
                H h13 = new H(this);
                zVarC2.getClass();
                cVar.b(zVarC2.v0(uVar, h13, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.multiselect.c) {
                io.reactivex.rxjava3.core.z<ParameterElement.v> zVarC3 = ((com.avito.android.blueprint.multiselect.c) dVar).c();
                v vVar = new v();
                H h14 = new H(this);
                zVarC3.getClass();
                cVar.b(zVarC3.v0(vVar, h14, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.address.c) {
                io.reactivex.rxjava3.core.z<ParameterElement.C> zVarC4 = ((com.avito.android.blueprint.address.c) dVar).c();
                w wVar = new w();
                H h15 = new H(this);
                zVarC4.getClass();
                cVar.b(zVarC4.v0(wVar, h15, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.compose_items.multiselect.c) {
                io.reactivex.rxjava3.core.z<ParameterElement.v> zVarC5 = ((com.avito.android.compose_items.multiselect.c) dVar).c();
                x xVar = new x();
                H h16 = new H(this);
                zVarC5.getClass();
                cVar.b(zVarC5.v0(xVar, h16, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.publish.multiselect.c) {
                io.reactivex.rxjava3.core.z<ParameterElement.v> zVarC6 = ((com.avito.android.blueprints.publish.multiselect.c) dVar).c();
                y yVar = new y();
                H h17 = new H(this);
                zVarC6.getClass();
                cVar.b(zVarC6.v0(yVar, h17, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    public final void c(io.reactivex.rxjava3.core.z<kotlin.Q<Boolean, com.avito.android.items.a>> zVar, io.reactivex.rxjava3.core.z<com.avito.android.items.a> zVar2) {
        this.f232147e.b(io.reactivex.rxjava3.core.z.g0(zVar2.I0(io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(Boolean.FALSE), zVar.d0(d.f232153b)), e.f232154b).N(f.f232155b).d0(g.f232156b), zVar.N(h.f232157b).d0(i.f232158b)).N(a.f232150b).v0(new b(), new c(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void d(io.reactivex.rxjava3.core.z<kotlin.Q<Boolean, com.avito.android.items.a>> zVar) {
        this.f232147e.b(zVar.N(j.f232159b).d0(k.f232160b).v0(new l(), new m(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
