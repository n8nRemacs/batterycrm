package com.avito.beduin.v2.component.lazy_row.android_view;

import ET0.d;
import ET0.j;
import Y41.l;
import Y41.q;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.component.common.ScrollType;
import com.avito.beduin.v2.component.common.lazy.StartEndScrollListener;
import com.avito.beduin.v2.component.common.lazy.h;
import com.avito.beduin.v2.component.lazy_row.android_view.a;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.M;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyRowComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/android_view/LazyRowComponent;", "Lcom/avito/beduin/v2/component/common/lazy/b;", "Lcom/avito/beduin/v2/component/lazy_row/state/a;", "Landroidx/recyclerview/widget/RecyclerView;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class LazyRowComponent extends com.avito.beduin.v2.component.common.lazy.b<com.avito.beduin.v2.component.lazy_row.state.a, RecyclerView> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f336016m;

    /* renamed from: n, reason: collision with root package name */
    public com.avito.beduin.v2.component.lazy_row.android_view.a f336017n;

    /* renamed from: o, reason: collision with root package name */
    public com.avito.beduin.v2.component.common.lazy.a f336018o;

    /* renamed from: p, reason: collision with root package name */
    public StartEndScrollListener f336019p;

    /* compiled from: LazyRowComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/StartEndScrollListener$ScrollType;", "type", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/component/common/lazy/StartEndScrollListener$ScrollType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<StartEndScrollListener.ScrollType, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.component.lazy_row.state.a f336020l;

        /* compiled from: LazyRowComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.lazy_row.android_view.LazyRowComponent$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C10408a {
            static {
                int[] iArr = new int[StartEndScrollListener.ScrollType.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    StartEndScrollListener.ScrollType scrollType = StartEndScrollListener.ScrollType.f335675b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.beduin.v2.component.lazy_row.state.a aVar) {
            super(1);
            this.f336020l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(StartEndScrollListener.ScrollType scrollType) {
            ScrollType scrollType2;
            StartEndScrollListener.ScrollType scrollType3 = scrollType;
            l<ScrollType, G0> lVar = this.f336020l.f336071f;
            if (lVar != null) {
                int iOrdinal = scrollType3.ordinal();
                if (iOrdinal == 0) {
                    scrollType2 = ScrollType.f335663c;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    scrollType2 = ScrollType.f335664d;
                }
                lVar.invoke(scrollType2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyRowComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/StartEndScrollListener$ScrollType;", "type", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/component/common/lazy/StartEndScrollListener$ScrollType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<StartEndScrollListener.ScrollType, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f336021l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.component.lazy_row.state.a f336022m;

        /* compiled from: LazyRowComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[StartEndScrollListener.ScrollType.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    StartEndScrollListener.ScrollType scrollType = StartEndScrollListener.ScrollType.f335675b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView recyclerView, com.avito.beduin.v2.component.lazy_row.state.a aVar) {
            super(1);
            this.f336021l = recyclerView;
            this.f336022m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(StartEndScrollListener.ScrollType scrollType) {
            ScrollType scrollType2;
            StartEndScrollListener.ScrollType scrollType3 = scrollType;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f336021l.getLayoutManager();
            q<Integer, Integer, ScrollType, G0> qVar = this.f336022m.f336072g;
            if (qVar != null) {
                Integer numValueOf = Integer.valueOf(linearLayoutManager.K1());
                Integer numValueOf2 = Integer.valueOf(linearLayoutManager.M1());
                int iOrdinal = scrollType3.ordinal();
                if (iOrdinal == 0) {
                    scrollType2 = ScrollType.f335663c;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    scrollType2 = ScrollType.f335664d;
                }
                qVar.invoke(numValueOf, numValueOf2, scrollType2);
            }
            return G0.f406611a;
        }
    }

    public LazyRowComponent(@k A a12) {
        super(MV0.a.f10705b);
        this.f336016m = a12;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void m() {
        j();
        com.avito.beduin.v2.component.common.lazy.a aVar = this.f336018o;
        if (aVar == null) {
            aVar = null;
        }
        aVar.f335683f = false;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void p(View view) {
        com.avito.beduin.v2.component.lazy_row.android_view.a aVar = this.f336017n;
        if (aVar == null) {
            aVar = null;
        }
        aVar.l(null, null);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    /* renamed from: u */
    public void l(@k RecyclerView recyclerView, @k com.avito.beduin.v2.theme.k kVar, @k com.avito.beduin.v2.component.lazy_row.state.a aVar) {
        com.avito.beduin.v2.component.lazy_row.android_view.a aVar2 = this.f336017n;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.f336027j = kVar;
        a.C10409a c10409a = aVar2.f336026i;
        c10409a.f335700d = c10409a.f335699c;
        c10409a.f335699c = kVar;
        aVar2.l(aVar.f336066a, null);
        com.avito.beduin.v2.component.common.lazy.a aVar3 = this.f336018o;
        if (aVar3 == null) {
            aVar3 = null;
        }
        aVar3.f335680c = aVar.f336068c;
        StartEndScrollListener startEndScrollListener = this.f336019p;
        if (startEndScrollListener == null) {
            startEndScrollListener = null;
        }
        startEndScrollListener.f335671b = new a(aVar);
        StartEndScrollListener startEndScrollListener2 = this.f336019p;
        (startEndScrollListener2 != null ? startEndScrollListener2 : null).f335672c = new b(recyclerView, aVar);
        M.a(recyclerView, aVar.f336073h);
        recyclerView.setBackgroundColor(t(aVar.f336067b));
        ET0.b bVar = aVar.f336069d;
        recyclerView.setPadding(d.b(recyclerView.getResources(), bVar != null ? bVar.f4016a : 0), d.b(recyclerView.getResources(), bVar != null ? bVar.f4019d : 0), d.b(recyclerView.getResources(), bVar != null ? bVar.f4017b : 0), d.b(recyclerView.getResources(), bVar != null ? bVar.f4018c : 0));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    @k
    /* renamed from: v */
    public RecyclerView n(@k ViewGroup viewGroup) {
        a.C10409a c10409a = new a.C10409a();
        A a12 = this.f336016m;
        this.f336017n = new com.avito.beduin.v2.component.lazy_row.android_view.a(this, a12, c10409a);
        final RecyclerView recyclerView = new RecyclerView(viewGroup.getContext(), null);
        if (a12.f337909e.f57087a) {
            recyclerView.addOnLayoutChangeListener(new j(0));
            ET0.l.a(recyclerView);
        }
        viewGroup.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager() { // from class: com.avito.beduin.v2.component.lazy_row.android_view.LazyRowComponent$onCreateView$1$linearLayoutManager$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
            public final void V0(@Y61.l RecyclerView.z zVar) {
                super.V0(zVar);
                LazyRowComponent lazyRowComponent = this.f336023G;
                if (lazyRowComponent.f336016m.f337909e.f57088b) {
                    com.avito.beduin.v2.component.common.lazy.a aVar = lazyRowComponent.f336018o;
                    if (aVar == null) {
                        aVar = null;
                    }
                    aVar.l(recyclerView);
                }
            }
        };
        recyclerView.setLayoutManager(linearLayoutManager);
        com.avito.beduin.v2.component.lazy_row.android_view.a aVar = this.f336017n;
        if (aVar == null) {
            aVar = null;
        }
        recyclerView.setAdapter(aVar);
        recyclerView.setItemAnimator(null);
        com.avito.beduin.v2.component.common.lazy.a aVar2 = new com.avito.beduin.v2.component.common.lazy.a(linearLayoutManager);
        recyclerView.o(aVar2);
        this.f336018o = aVar2;
        StartEndScrollListener startEndScrollListener = new StartEndScrollListener();
        recyclerView.o(startEndScrollListener);
        this.f336019p = startEndScrollListener;
        if (a12.f337909e.f57089c) {
            recyclerView.setOnTouchListener(new h(viewGroup.getContext()));
        }
        return recyclerView;
    }
}
