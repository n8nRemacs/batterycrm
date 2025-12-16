package com.avito.beduin.v2.repository.screen_lifecycle;

import TT0.a;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;

/* compiled from: ScreenLifecycleClientImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/repository/screen_lifecycle/l;", "Lcom/avito/beduin/v2/repository/screen_lifecycle/k;", "screen-lifecycle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f338316b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r f338317c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h f338318d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f338319e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43238h f338320f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public FV0.a f338321g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final m f338322h;

    /* compiled from: ScreenLifecycleClientImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f338323a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f338323a = iArr;
        }
    }

    public l(@Y61.k f fVar, @Y61.k r rVar, @Y61.k h hVar) {
        TT0.a.f15671a.getClass();
        a.C1074a.C1075a c1075a = a.C1074a.f15673b;
        this.f338316b = fVar;
        this.f338317c = rVar;
        this.f338318d = hVar;
        this.f338319e = f2.b(1, 0, BufferOverflow.f410777b, 2);
        c1075a.getClass();
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        this.f338320f = U.a(K.f411877a);
        this.f338322h = new m(this);
    }

    public static void k(l lVar, String str, InterfaceC22983P interfaceC22983P, Lifecycle.Event event, String str2, b bVar) {
        lVar.getClass();
        StringBuilder sb2 = new StringBuilder("\n            ");
        sb2.append(str);
        sb2.append("\n            \n            Metadata:\n            LifecycleOwner hash: ");
        sb2.append(System.identityHashCode(interfaceC22983P));
        sb2.append(" \n            Event: ");
        sb2.append(event);
        sb2.append("\n            \n            ScreenId for lifecycleOwner: ");
        sb2.append(str2);
        sb2.append("\n            Stored config changes: ");
        sb2.append(bVar);
        sb2.append("\n            Host activity hash: ");
        sb2.append(System.identityHashCode(lVar.b()));
        sb2.append("\n            Host activity isChangingConfigurations ");
        androidx.view.n nVarB = lVar.b();
        sb2.append(nVarB != null ? Boolean.valueOf(nVarB.isChangingConfigurations()) : null);
        sb2.append("\n            ");
        lVar.f338318d.log(C43066x.E0(sb2.toString()));
    }

    @Override // FV0.h
    public final void P() {
        Lifecycle lifecycle;
        FV0.a aVar = this.f338321g;
        if (aVar != null && (lifecycle = aVar.getLifecycle()) != null) {
            lifecycle.c(this.f338322h);
        }
        this.f338321g = null;
    }

    @Override // FV0.h
    public final void Q(@Y61.k FV0.a aVar) {
        this.f338321g = aVar;
        aVar.getLifecycle().a(this.f338322h);
    }

    public final androidx.view.n b() {
        FV0.a aVar = this.f338321g;
        if (aVar == null) {
            return null;
        }
        if (aVar instanceof FV0.b) {
            return ((FV0.b) aVar).N3();
        }
        if (aVar instanceof FV0.c) {
            return ((FV0.c) aVar).j1().requireActivity();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.beduin.v2.repository.screen_lifecycle.k
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.a n(@Y61.k Y41.l lVar) {
        return new com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.a(C43259k.d(this.f338320f, null, null, new n(this, lVar, null), 3), 3);
    }

    @Override // com.avito.beduin.v2.repository.screen_lifecycle.k
    @Y61.k
    public final p o0() {
        return (p) C42745f0.Q(this.f338319e.E3());
    }
}
