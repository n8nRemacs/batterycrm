package com.avito.android.onboarding_manager;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.kotlin.z1;
import j.j0;
import j.k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.rx3.y;

/* compiled from: InlineFiltersTooltipShowsInteractor.kt */
@j0
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding_manager/a;", "", "a", "_avito_onboarding-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f209413a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f209414b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f209415c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HashSet f209416d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f209417e = new ArrayList();

    /* compiled from: InlineFiltersTooltipShowsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding_manager/a$a;", "", "_avito_onboarding-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.onboarding_manager.a$a, reason: collision with other inner class name */
    public static final class C6242a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Integer f209418a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final N f209419b;

        /* JADX WARN: Multi-variable type inference failed */
        public C6242a(@Y61.l Integer num, @Y61.k Y41.a aVar) {
            this.f209418a = num;
            this.f209419b = (N) aVar;
        }
    }

    /* compiled from: InlineFiltersTooltipShowsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l0.h<io.reactivex.rxjava3.disposables.d> f209421c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Integer f209422d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ N f209423e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l0.h<io.reactivex.rxjava3.disposables.d> hVar, Integer num, String str, Y41.a<G0> aVar) {
            this.f209421c = hVar;
            this.f209422d = num;
            this.f209423e = (N) aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r7v11, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            Object obj2;
            Q q12 = (Q) obj;
            Boolean bool = (Boolean) q12.f406619b;
            Boolean bool2 = (Boolean) q12.f406620c;
            a aVar = a.this;
            v0.a(aVar.f209416d).remove(this.f209421c.f406842b);
            boolean zBooleanValue = bool.booleanValue();
            ArrayList arrayList = aVar.f209417e;
            if (!zBooleanValue || !bool2.booleanValue()) {
                arrayList.add(new C6242a(this.f209422d, this.f209423e));
            }
            if (aVar.f209416d.isEmpty()) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        Integer num = ((C6242a) next).f209418a;
                        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                        do {
                            Object next2 = it.next();
                            Integer num2 = ((C6242a) next2).f209418a;
                            int iIntValue2 = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
                            if (iIntValue > iIntValue2) {
                                next = next2;
                                iIntValue = iIntValue2;
                            }
                        } while (it.hasNext());
                    }
                    obj2 = next;
                } else {
                    obj2 = null;
                }
                C6242a c6242a = (C6242a) obj2;
                if (c6242a != null) {
                    c6242a.f209419b.invoke();
                }
                arrayList.clear();
            }
        }
    }

    @Inject
    public a(@Y61.k f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k R0 r02) {
        this.f209413a = fVar;
        this.f209414b = interfaceC35745a5;
        this.f209415c = r02;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [T, io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @k0
    public final void a(@Y61.l String str, @Y61.l Integer num, @Y61.l Integer num2, @Y61.k Y41.a<G0> aVar) {
        if (str == null) {
            return;
        }
        l0.h hVar = new l0.h();
        f fVar = this.f209413a;
        InterfaceC43076a0<Boolean> interfaceC43076a0D = fVar.d(str);
        R0 r02 = this.f209415c;
        ?? X12 = z1.a(y.c(interfaceC43076a0D, r02.a()).v(Boolean.FALSE), y.c(fVar.c(str), r02.a()).r(new com.avito.android.onboarding_manager.b(num2 != null ? num2.intValue() : -1))).s(this.f209414b.e()).x(new b(hVar, num, str, aVar), io.reactivex.rxjava3.internal.functions.a.f401996f);
        hVar.f406842b = X12;
        this.f209416d.add(X12);
    }
}
