package com.akita.compose.component.time_line;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.foundation.d2;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.saveable.v;
import androidx.compose.runtime.saveable.w;
import androidx.compose.runtime.saveable.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TimeLineState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/time_line/g;", "", "c", "time-line_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f63119f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f63120g = 8;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final w f63121h;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d2 f63122a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC22196w1 f63123b;

    /* renamed from: c, reason: collision with root package name */
    public int f63124c;

    /* renamed from: d, reason: collision with root package name */
    public int f63125d;

    /* renamed from: e, reason: collision with root package name */
    public int f63126e;

    /* compiled from: TimeLineState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Lcom/akita/compose/component/time_line/g;", "it", "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Lcom/akita/compose/component/time_line/g;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<x, g, List<? extends Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f63127l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final List<? extends Object> invoke(x xVar, g gVar) {
            g gVar2 = gVar;
            return C42745f0.U(Integer.valueOf(((C22061e3) gVar2.f63122a.f27081a).e()), Integer.valueOf(((C22061e3) gVar2.f63123b).e()));
        }
    }

    /* compiled from: TimeLineState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lcom/akita/compose/component/time_line/g;", "invoke", "(Ljava/util/List;)Lcom/akita/compose/component/time_line/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<List<? extends Object>, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f63128l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final g invoke(List<? extends Object> list) {
            List<? extends Object> list2 = list;
            return new g(new d2(((Integer) list2.get(0)).intValue()), ((Integer) list2.get(1)).intValue());
        }
    }

    /* compiled from: TimeLineState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/time_line/g$c;", "", "<init>", "()V", "time-line_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        a aVar = a.f63127l;
        b bVar = b.f63128l;
        w wVar = v.f38606a;
        f63121h = new w(bVar, aVar);
    }

    public g(@k d2 d2Var, int i12) {
        this.f63122a = d2Var;
        this.f63123b = U2.a(i12);
    }
}
