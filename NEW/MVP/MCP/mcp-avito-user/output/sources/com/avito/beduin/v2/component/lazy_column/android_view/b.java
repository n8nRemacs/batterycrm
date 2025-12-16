package com.avito.beduin.v2.component.lazy_column.android_view;

import ET0.j;
import Y41.l;
import Y41.q;
import Y61.k;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bU0.C25567b;
import com.avito.beduin.v2.component.common.ScrollType;
import com.avito.beduin.v2.component.common.lazy.StartEndScrollListener;
import com.avito.beduin.v2.component.common.lazy.h;
import com.avito.beduin.v2.component.lazy_column.android_view.a;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.M;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyColumnComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_column/android_view/b;", "Lcom/avito/beduin/v2/component/common/lazy/b;", "Lcom/avito/beduin/v2/component/lazy_column/state/a;", "Landroidx/recyclerview/widget/RecyclerView;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class b extends com.avito.beduin.v2.component.common.lazy.b<com.avito.beduin.v2.component.lazy_column.state.a, RecyclerView> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f335893m;

    /* renamed from: n, reason: collision with root package name */
    public com.avito.beduin.v2.component.lazy_column.android_view.a f335894n;

    /* renamed from: o, reason: collision with root package name */
    public com.avito.beduin.v2.component.common.lazy.a f335895o;

    /* renamed from: p, reason: collision with root package name */
    public StartEndScrollListener f335896p;

    /* compiled from: LazyColumnComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/StartEndScrollListener$ScrollType;", "type", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/component/common/lazy/StartEndScrollListener$ScrollType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<StartEndScrollListener.ScrollType, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.component.lazy_column.state.a f335897l;

        /* compiled from: LazyColumnComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.lazy_column.android_view.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C10402a {
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
        public a(com.avito.beduin.v2.component.lazy_column.state.a aVar) {
            super(1);
            this.f335897l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(StartEndScrollListener.ScrollType scrollType) {
            ScrollType scrollType2;
            StartEndScrollListener.ScrollType scrollType3 = scrollType;
            l<ScrollType, G0> lVar = this.f335897l.f335992f;
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

    /* compiled from: LazyColumnComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/StartEndScrollListener$ScrollType;", "type", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/component/common/lazy/StartEndScrollListener$ScrollType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.component.lazy_column.android_view.b$b, reason: collision with other inner class name */
    public static final class C10403b extends N implements l<StartEndScrollListener.ScrollType, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f335898l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.component.lazy_column.state.a f335899m;

        /* compiled from: LazyColumnComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.lazy_column.android_view.b$b$a */
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
        public C10403b(RecyclerView recyclerView, com.avito.beduin.v2.component.lazy_column.state.a aVar) {
            super(1);
            this.f335898l = recyclerView;
            this.f335899m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(StartEndScrollListener.ScrollType scrollType) {
            ScrollType scrollType2;
            StartEndScrollListener.ScrollType scrollType3 = scrollType;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f335898l.getLayoutManager();
            q<Integer, Integer, ScrollType, G0> qVar = this.f335899m.f335993g;
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

    public b(@k A a12) {
        super(MV0.a.f10705b);
        this.f335893m = a12;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void m() {
        j();
        com.avito.beduin.v2.component.common.lazy.a aVar = this.f335895o;
        if (aVar == null) {
            aVar = null;
        }
        aVar.f335683f = false;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        a.C10400a c10400a = new a.C10400a();
        A a12 = this.f335893m;
        this.f335894n = new com.avito.beduin.v2.component.lazy_column.android_view.a(this, a12, c10400a);
        final e eVar = new e(viewGroup.getContext(), null);
        eVar.f335901F0 = -1;
        eVar.f335904I0 = ViewConfiguration.get(eVar.getContext()).getScaledTouchSlop();
        C25567b c25567b = a12.f337909e;
        if (c25567b.f57087a) {
            eVar.addOnLayoutChangeListener(new j(0));
            ET0.l.a(eVar);
        }
        viewGroup.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager() { // from class: com.avito.beduin.v2.component.lazy_column.android_view.LazyColumnComponent$onCreateView$1$linearLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
            public final void V0(@Y61.l RecyclerView.z zVar) {
                super.V0(zVar);
                b bVar = this.f335884G;
                if (bVar.f335893m.f337909e.f57088b) {
                    com.avito.beduin.v2.component.common.lazy.a aVar = bVar.f335895o;
                    if (aVar == null) {
                        aVar = null;
                    }
                    aVar.l(eVar);
                }
            }
        };
        eVar.setLayoutManager(linearLayoutManager);
        com.avito.beduin.v2.component.lazy_column.android_view.a aVar = this.f335894n;
        if (aVar == null) {
            aVar = null;
        }
        eVar.setAdapter(aVar);
        eVar.setItemAnimator(null);
        com.avito.beduin.v2.component.common.lazy.a aVar2 = new com.avito.beduin.v2.component.common.lazy.a(linearLayoutManager);
        eVar.o(aVar2);
        this.f335895o = aVar2;
        StartEndScrollListener startEndScrollListener = new StartEndScrollListener();
        eVar.o(startEndScrollListener);
        this.f335896p = startEndScrollListener;
        if (c25567b.f57089c) {
            eVar.setOnTouchListener(new h(viewGroup.getContext()));
        }
        return eVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void p(View view) {
        com.avito.beduin.v2.component.lazy_column.android_view.a aVar = this.f335894n;
        if (aVar == null) {
            aVar = null;
        }
        aVar.l(null, null);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    /* renamed from: u */
    public void l(@k RecyclerView recyclerView, @k com.avito.beduin.v2.theme.k kVar, @k com.avito.beduin.v2.component.lazy_column.state.a aVar) {
        com.avito.beduin.v2.component.lazy_column.android_view.a aVar2 = this.f335894n;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.f335888j = kVar;
        a.C10400a c10400a = aVar2.f335887i;
        c10400a.f335700d = c10400a.f335699c;
        c10400a.f335699c = kVar;
        aVar2.l(aVar.f335987a, null);
        com.avito.beduin.v2.component.common.lazy.a aVar3 = this.f335895o;
        if (aVar3 == null) {
            aVar3 = null;
        }
        aVar3.f335680c = aVar.f335989c;
        StartEndScrollListener startEndScrollListener = this.f335896p;
        if (startEndScrollListener == null) {
            startEndScrollListener = null;
        }
        startEndScrollListener.f335671b = new a(aVar);
        StartEndScrollListener startEndScrollListener2 = this.f335896p;
        (startEndScrollListener2 != null ? startEndScrollListener2 : null).f335672c = new C10403b(recyclerView, aVar);
        M.a(recyclerView, aVar.f335994h);
        recyclerView.setBackgroundColor(t(aVar.f335988b));
        ET0.b bVar = aVar.f335990d;
        recyclerView.setPadding(ET0.d.b(recyclerView.getResources(), bVar != null ? bVar.f4016a : 0), ET0.d.b(recyclerView.getResources(), bVar != null ? bVar.f4019d : 0), ET0.d.b(recyclerView.getResources(), bVar != null ? bVar.f4017b : 0), ET0.d.b(recyclerView.getResources(), bVar != null ? bVar.f4018c : 0));
    }
}
