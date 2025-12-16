package com.avito.android.user_advert.advert;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/z1;", "", "a", "b", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class z1 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f310666e = {kotlin.jvm.internal.m0.f406844a.e(new kotlin.jvm.internal.Y(z1.class, "scrollState", "getScrollState()Lcom/avito/android/user_advert/advert/MyAdvertViewScrollAnalytics$ScrollState;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f310667a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35426j0 f310668b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f310669c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D1 f310670d;

    /* compiled from: MyAdvertDetailsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/z1$a;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(int i12, int i13, int i14);

        void b(boolean z12);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MyAdvertDetailsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/z1$b;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f310671b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f310672c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f310673d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b[] f310674e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f310675f;

        static {
            b bVar = new b("None", 0);
            f310671b = bVar;
            b bVar2 = new b("Available", 1);
            f310672c = bVar2;
            b bVar3 = new b("NotAvailable", 2);
            f310673d = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            f310674e = bVarArr;
            f310675f = kotlin.enums.c.a(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f310674e.clone();
        }
    }

    public z1(@Y61.k RecyclerView recyclerView, @Y61.k InterfaceC35426j0 interfaceC35426j0) {
        this.f310667a = recyclerView;
        this.f310668b = interfaceC35426j0;
        kotlin.properties.c cVar = kotlin.properties.c.f406879a;
        b bVar = b.f310671b;
        this.f310670d = new D1(this);
        recyclerView.o(new C1(this));
        recyclerView.addOnLayoutChangeListener(new B1(this));
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new A1(this));
        }
    }

    public final void a() {
        RecyclerView recyclerView = this.f310667a;
        int measuredHeight = recyclerView.getMeasuredHeight();
        if (measuredHeight == 0) {
            return;
        }
        this.f310670d.setValue(this, f310666e[0], measuredHeight >= recyclerView.computeVerticalScrollRange() ? b.f310673d : b.f310672c);
        if (recyclerView.getScrollState() == 0) {
            b();
        }
    }

    public final void b() {
        RecyclerView.m layoutManager = this.f310667a.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iK1 = linearLayoutManager.K1();
        int iM1 = linearLayoutManager.M1();
        if (iK1 == -1 || iM1 == -1) {
            return;
        }
        this.f310668b.a(linearLayoutManager.o0(), iK1 + 1, iM1 + 1);
    }
}
