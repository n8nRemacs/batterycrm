package com.akita.compose.component.tooltip;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.X;
import androidx.compose.foundation.Y;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.saveable.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: TooltipState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/tooltip/t;", "Landroidx/compose/foundation/Y;", "c", "tooltip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class t implements Y {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final c f63546b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.saveable.w f63547c;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y f63548a;

    /* compiled from: TooltipState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Lcom/akita/compose/component/tooltip/t;", "it", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Lcom/akita/compose/component/tooltip/t;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<x, t, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f63549l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Boolean invoke(x xVar, t tVar) {
            return Boolean.valueOf(tVar.f63548a.isVisible());
        }
    }

    /* compiled from: TooltipState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/akita/compose/component/tooltip/t;", "invoke", "(Z)Lcom/akita/compose/component/tooltip/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, t> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f63550l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final t invoke(Boolean bool) {
            return new t(X.b(bool.booleanValue()));
        }
    }

    /* compiled from: TooltipState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/tooltip/t$c;", "", "<init>", "()V", "tooltip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        a aVar = a.f63549l;
        b bVar = b.f63550l;
        androidx.compose.runtime.saveable.w wVar = androidx.compose.runtime.saveable.v.f38606a;
        f63547c = new androidx.compose.runtime.saveable.w(bVar, aVar);
    }

    public t(@Y61.k Y y12) {
        this.f63548a = y12;
    }

    @Override // androidx.compose.foundation.Y
    @Y61.l
    public final Object a(@Y61.k MutatePriority mutatePriority, @Y61.k SuspendLambda suspendLambda) {
        return this.f63548a.a(mutatePriority, suspendLambda);
    }

    @Override // androidx.compose.foundation.Y
    public final void dismiss() {
        this.f63548a.dismiss();
    }

    @Override // androidx.compose.foundation.Y
    public final boolean isVisible() {
        return this.f63548a.isVisible();
    }
}
