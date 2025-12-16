package com.akita.compose.component.scaffold;

import Y41.p;
import Y41.q;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import com.akita.compose.component.toast_bar.u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Scaffold.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f62479a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f62480b = new C22096n(-523524824, C2096a.f62484l, false);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C22096n f62481c = new C22096n(380702264, b.f62485l, false);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C22096n f62482d = new C22096n(-85900699, c.f62486l, false);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C22096n f62483e = new C22096n(332292843, d.f62487l, false);

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.component.scaffold.a$a, reason: collision with other inner class name */
    public static final class C2096a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2096a f62484l = new C2096a();

        public C2096a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f62485l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/toast_bar/u;", "it", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/toast_bar/u;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements q<u, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f62486l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(u uVar, A a12, Integer num) {
            u uVar2 = uVar;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(uVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.component.toast_bar.q.b(uVar2, null, null, a13, iIntValue & 14, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f62487l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            }
            return G0.f406611a;
        }
    }
}
