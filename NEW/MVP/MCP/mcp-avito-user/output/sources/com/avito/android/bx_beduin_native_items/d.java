package com.avito.android.bx_beduin_native_items;

import Gk.InterfaceC13891a;
import Gk.InterfaceC13892b;
import Y41.p;
import Y61.k;
import Y61.l;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advertising.loaders.my_target.g;
import com.avito.android.bx_beduin_native_items.info.ContinuousTrackInfo;
import com.avito.android.bx_beduin_native_items.info.SingleTrackInfo;
import com.avito.android.bx_beduin_native_items.info.TrackInfo;
import com.avito.android.bxcontent.C29240o1;
import com.avito.android.util.G;
import com.avito.android.util.R0;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: BxBeduinNativeItemVisibilityTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bx_beduin_native_items/d;", "Lcom/avito/android/bx_beduin_native_items/c;", "a", "_avito_bx-beduin-native-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.bx_beduin_native_items.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<InterfaceC13892b> f108802a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f108803b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C42770s0 f108804c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public C29240o1 f108805d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public C43238h f108806e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public RecyclerView f108807f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public N0 f108808g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final HashMap<Long, List<TrackInfo>> f108809h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Rect f108810i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Rect f108811j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final e f108812k;

    /* compiled from: BxBeduinNativeItemVisibilityTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bx_beduin_native_items/d$a;", "", "_avito_bx-beduin-native-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Bundle f108813a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final R0 f108814b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f108815c = new ArrayList();

        public a(@l Bundle bundle, @k R0 r02) {
            this.f108813a = bundle;
            this.f108814b = r02;
        }
    }

    /* compiled from: BxBeduinNativeItemVisibilityTracker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<anonymous parameter 0>", "", "Lcom/avito/android/bx_beduin_native_items/info/TrackInfo;", "u", "Lkotlin/G0;", "invoke", "(Ljava/lang/Long;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<Long, List<? extends TrackInfo>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f108816l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(Long l12, List<? extends TrackInfo> list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((TrackInfo) it.next()).onDestroyView();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BxBeduinNativeItemVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGk/b;", "it", "", "invoke", "(LGk/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<InterfaceC13892b, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.InterfaceC10495b f108817l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b.InterfaceC10495b interfaceC10495b) {
            super(1);
            this.f108817l = interfaceC10495b;
        }

        @Override // Y41.l
        public final Boolean invoke(InterfaceC13892b interfaceC13892b) {
            return Boolean.valueOf(interfaceC13892b.a(this.f108817l));
        }
    }

    /* compiled from: BxBeduinNativeItemVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGk/b;", "it", "Lcom/avito/android/bx_beduin_native_items/info/TrackInfo;", "invoke", "(LGk/b;)Lcom/avito/android/bx_beduin_native_items/info/TrackInfo;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bx_beduin_native_items.d$d, reason: collision with other inner class name */
    public static final class C3257d extends N implements Y41.l<InterfaceC13892b, TrackInfo> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3257d f108818l = new C3257d();

        public C3257d() {
            super(1);
        }

        @Override // Y41.l
        public final TrackInfo invoke(InterfaceC13892b interfaceC13892b) {
            InterfaceC13892b interfaceC13892b2 = interfaceC13892b;
            TrackInfo.f108839P1.getClass();
            if (interfaceC13892b2 instanceof Gk.d) {
                SingleTrackInfo singleTrackInfo = new SingleTrackInfo(interfaceC13892b2.d(), false, false, null, 14, null);
                singleTrackInfo.f108833f = (Gk.d) interfaceC13892b2;
                return singleTrackInfo;
            }
            ContinuousTrackInfo continuousTrackInfo = new ContinuousTrackInfo(interfaceC13892b2.d());
            continuousTrackInfo.f108824c = (InterfaceC13891a) interfaceC13892b2;
            return continuousTrackInfo;
        }
    }

    public d() {
        throw null;
    }

    public d(List list, R0 r02, C42822w c42822w) {
        this.f108802a = list;
        this.f108803b = r02;
        this.f108804c = new C42770s0(list);
        this.f108809h = new HashMap<>();
        this.f108810i = new Rect();
        this.f108811j = new Rect();
        this.f108812k = new e(this);
    }

    @Override // com.avito.android.bx_beduin_native_items.c
    public final void a(@k C29240o1 c29240o1) {
        if (this.f108805d != c29240o1) {
            return;
        }
        this.f108805d = null;
        g();
    }

    @Override // com.avito.android.bx_beduin_native_items.c
    public final void b() {
        RecyclerView recyclerView;
        N0 n02 = this.f108808g;
        if ((n02 == null || !n02.isActive()) && (recyclerView = this.f108807f) != null) {
            h(recyclerView);
        }
    }

    @Override // com.avito.android.bx_beduin_native_items.c
    public final void c(long j12) {
        HashMap<Long, List<TrackInfo>> map = this.f108809h;
        List<TrackInfo> list = map.get(Long.valueOf(j12));
        if (list == null || !list.isEmpty()) {
            return;
        }
        map.remove(Long.valueOf(j12));
    }

    @Override // com.avito.android.bx_beduin_native_items.c
    public final void d(@k RecyclerView recyclerView, @k com.avito.android.bx_beduin_native_items.b bVar) {
        if (bVar == this.f108805d && recyclerView != this.f108807f) {
            g();
            this.f108806e = U.a(this.f108803b.b().plus(t1.b()));
            this.f108807f = recyclerView;
            this.f108810i.set(recyclerView.getLeft(), recyclerView.getTop(), recyclerView.getRight(), recyclerView.getBottom());
            recyclerView.o(this.f108812k);
            h(recyclerView);
        }
    }

    @Override // com.avito.android.bx_beduin_native_items.c
    @k
    public final Bundle d0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        for (Map.Entry<Long, List<TrackInfo>> entry : this.f108809h.entrySet()) {
            String strValueOf = String.valueOf(entry.getKey().longValue());
            List<TrackInfo> value = entry.getValue();
            ArrayList arrayList = new ArrayList(C42745f0.q(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(((TrackInfo) it.next()).S4(jCurrentTimeMillis));
            }
            G.e(strValueOf, bundle, arrayList);
        }
        return bundle;
    }

    @Override // com.avito.android.bx_beduin_native_items.c
    public final void e(@k C29240o1 c29240o1) {
        if (this.f108805d == c29240o1) {
            return;
        }
        this.f108805d = c29240o1;
        g();
    }

    @Override // com.avito.android.bx_beduin_native_items.c
    public final void f(@k C29240o1 c29240o1) {
        if (c29240o1 != this.f108805d) {
            return;
        }
        g();
    }

    public final void g() {
        RecyclerView recyclerView = this.f108807f;
        if (recyclerView != null) {
            recyclerView.v0(this.f108812k);
            this.f108807f = null;
            C43238h c43238h = this.f108806e;
            if (c43238h != null) {
                U.b(c43238h, null);
            }
            this.f108806e = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v32, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(androidx.recyclerview.widget.RecyclerView r23) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bx_beduin_native_items.d.h(androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // com.avito.android.bx_beduin_native_items.c
    public final void onDestroyView() {
        this.f108809h.forEach(new g(1, b.f108816l));
    }
}
