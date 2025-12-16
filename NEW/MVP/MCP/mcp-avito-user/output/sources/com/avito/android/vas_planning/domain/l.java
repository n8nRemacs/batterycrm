package com.avito.android.vas_planning.domain;

import aM0.InterfaceC19791a;
import android.content.res.Resources;
import bM0.C25529a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.vas_planning.model.VasPlannerState;
import io.reactivex.rxjava3.internal.operators.mixed.z;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: VasPlanningInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning/domain/l;", "Lcom/avito/android/vas_planning/domain/k;", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19791a f322334a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f322335b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322336c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h f322337d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning.domain.a f322338e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Resources f322339f;

    /* compiled from: VasPlanningInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_planning/domain/l$a;", "", "<init>", "()V", "", "PLANNED_TIME_KEY", "Ljava/lang/String;", "PLANNED_TIME_RAW_KEY", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VasPlanningInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LbM0/a;", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/vas_planning/model/VasPlannerState;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(l.this.f322335b.a((C25529a) ((TypedResult.Success) typedResult).getResult()));
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static {
        new a(null);
    }

    @Inject
    public l(@Y61.k InterfaceC19791a interfaceC19791a, @Y61.k e eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h hVar, @Y61.k com.avito.android.vas_planning.domain.a aVar, @Y61.k Resources resources) {
        this.f322334a = interfaceC19791a;
        this.f322335b = eVar;
        this.f322336c = interfaceC35745a5;
        this.f322337d = hVar;
        this.f322338e = aVar;
        this.f322339f = resources;
    }

    @Override // com.avito.android.vas_planning.domain.k
    @Y61.k
    public final z a(@Y61.k String str, @Y61.k ArrayList arrayList) {
        return (z) this.f322338e.a(arrayList).p(new p(this, arrayList, str));
    }

    @Override // com.avito.android.vas_planning.domain.k
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<VasPlannerState>> b(@Y61.k String str) {
        return this.f322334a.b(str).x0(this.f322336c.a()).d0(new b()).r0(P2.c.f318721a);
    }
}
