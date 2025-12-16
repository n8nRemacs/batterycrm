package com.avito.android.scroll_tracker;

import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.scroll_tracker.d;
import com.avito.android.serp.adapter.i1;
import com.avito.android.serp.adapter.m1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import pb.InterfaceC47045a;

/* compiled from: SnippetScrollDepthTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/scroll_tracker/e;", "Lcom/avito/android/scroll_tracker/d;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public d.a f261717a = new d.a();

    @Inject
    public e() {
    }

    @Override // com.avito.android.scroll_tracker.d
    public final void a() {
        this.f261717a.f261714a = new LinkedHashMap();
        d.a aVar = this.f261717a;
        aVar.f261715b = 0;
        aVar.f261716c = -1;
    }

    @Override // com.avito.android.scroll_tracker.d
    public final void b() {
        d.a aVar = this.f261717a;
        aVar.f261716c = aVar.f261715b;
    }

    @Override // com.avito.android.scroll_tracker.d
    public final void c(@Y61.k UV0.a<? extends i1> aVar) {
        if (aVar.isEmpty()) {
            return;
        }
        int count = aVar.getCount();
        for (int i12 = 0; i12 < count; i12++) {
            i1 item = aVar.getItem(i12);
        }
    }

    @Override // com.avito.android.scroll_tracker.d
    public final boolean d() {
        d.a aVar = this.f261717a;
        return aVar.f261716c < aVar.f261715b;
    }

    @Override // com.avito.android.scroll_tracker.d
    public final void e(int i12) {
        d.a aVar = this.f261717a;
        if (i12 > aVar.f261715b) {
            aVar.f261715b = i12;
        }
    }

    @Override // com.avito.android.scroll_tracker.d
    public final int f() {
        int i12 = 0;
        int i13 = 0;
        for (Object obj : this.f261717a.f261714a.entrySet()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (((entry.getValue() instanceof InterfaceC28345a) || (entry.getValue() instanceof m1) || (entry.getValue() instanceof InterfaceC47045a)) && i13 <= this.f261717a.f261715b) {
                i12++;
            }
            i13 = i14;
        }
        return i12;
    }

    @Override // com.avito.android.scroll_tracker.d
    public final int g() {
        int i12 = 0;
        int i13 = 0;
        for (Object obj : this.f261717a.f261714a.entrySet()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            if ((((Map.Entry) obj).getValue() instanceof m1) && i13 <= this.f261717a.f261715b) {
                i12++;
            }
            i13 = i14;
        }
        return i12;
    }

    @Override // com.avito.android.scroll_tracker.d
    public final void h(@Y61.k d.a aVar) {
        this.f261717a = aVar;
    }

    @Override // com.avito.android.scroll_tracker.d
    @Y61.k
    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : this.f261717a.f261714a.entrySet()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry.getValue() instanceof m1) {
                d.a aVar = this.f261717a;
                if (i12 <= aVar.f261715b && i12 > aVar.f261716c) {
                    arrayList.add(((i1) entry.getValue()).getF255769b());
                }
            }
            i12 = i13;
        }
        return arrayList;
    }
}
