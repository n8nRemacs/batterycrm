package com.avito.android.comfortable_deal.date_time_pickers.time;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: TimePickerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/date_time_pickers/time/d;", "Lcom/avito/android/comfortable_deal/date_time_pickers/time/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.comfortable_deal.date_time_pickers.time.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<G0> f120931a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<Integer, Integer, G0> f120932b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public View f120933c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f120934d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f120935e;

    /* compiled from: TimePickerView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/lib/design/picker/k;", "", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<List<? extends com.avito.android.lib.design.picker.k<Integer>>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends com.avito.android.lib.design.picker.k<Integer>> invoke() {
            return d.a(d.this, 24);
        }
    }

    /* compiled from: TimePickerView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/lib/design/picker/k;", "", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<List<? extends com.avito.android.lib.design.picker.k<Integer>>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends com.avito.android.lib.design.picker.k<Integer>> invoke() {
            return d.a(d.this, 60);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k Y41.a<G0> aVar, @k p<? super Integer, ? super Integer, G0> pVar) {
        this.f120931a = aVar;
        this.f120932b = pVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f120934d = C42727D.b(lazyThreadSafetyMode, new a());
        this.f120935e = C42727D.b(lazyThreadSafetyMode, new b());
    }

    public static final ArrayList a(d dVar, int i12) {
        dVar.getClass();
        kotlin.ranges.l lVarR = s.r(0, i12);
        ArrayList arrayList = new ArrayList(C42745f0.q(lVarR, 10));
        kotlin.ranges.k it = lVarR.iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            arrayList.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(iA2), String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iA2)}, 1))));
        }
        return arrayList;
    }
}
