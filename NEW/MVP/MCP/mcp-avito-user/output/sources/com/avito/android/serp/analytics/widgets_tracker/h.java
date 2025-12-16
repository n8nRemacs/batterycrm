package com.avito.android.serp.analytics.widgets_tracker;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.analytics.widgets_tracker.a;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: WidgetsActionTrackerImpl.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/h;", "Lcom/avito/android/serp/analytics/widgets_tracker/g;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e2 f273942a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC43160i<e> f273943b;

    /* compiled from: WidgetsActionTrackerImpl.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/h$a;", "Lcom/avito/android/serp/analytics/widgets_tracker/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.serp.analytics.widgets_tracker.a f273944a;

        public a(@k com.avito.android.serp.analytics.widgets_tracker.a aVar) {
            this.f273944a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f273944a, ((a) obj).f273944a);
        }

        @Override // com.avito.android.serp.analytics.widgets_tracker.e
        @k
        /* renamed from: getConfig, reason: from getter */
        public final com.avito.android.serp.analytics.widgets_tracker.a getF273944a() {
            return this.f273944a;
        }

        public final int hashCode() {
            return this.f273944a.hashCode();
        }

        @k
        public final String toString() {
            return "WidgetActionImpl(config=" + this.f273944a + ')';
        }
    }

    @Inject
    public h(@k d dVar) {
        dVar.getClass();
        e2 e2VarA = f2.a(0, dVar.a(), dVar.getF273940a());
        this.f273942a = e2VarA;
        this.f273943b = C43175k.a(e2VarA);
    }

    @Override // js0.c
    public final void a(@l String str) {
        this.f273942a.K5(new a(new a.c.b(str)));
    }

    @Override // js0.InterfaceC42421a
    public final void b(int i12, @k String str) {
        this.f273942a.K5(new a(new a.InterfaceC8123a.C8124a(str, i12)));
    }

    @Override // js0.b
    public final void c() {
        this.f273942a.K5(new a(a.b.C8126b.f273915a));
    }

    @Override // js0.b
    public final void d(@k ArrayList arrayList) {
        this.f273942a.K5(new a(new a.b.c(C42745f0.O(arrayList, "; ", null, null, null, 62))));
    }

    @Override // js0.d
    public final void e(@l Integer num, @l String str, @l String str2, @l String str3, @l Integer num2, @l Long l12, @l Map<String, String> map, @l Analytics analytics) {
        this.f273942a.K5(new a(new a.d.C8129a(num, str, str2, str3, num2, l12, map, analytics)));
    }

    @Override // js0.InterfaceC42421a
    public final void f(@k String str) {
        this.f273942a.K5(new a(new a.InterfaceC8123a.c(str)));
    }

    @Override // js0.c
    public final void g(int i12, @k String str, @l String str2) {
        this.f273942a.K5(new a(new a.c.C8127a(str, str2, i12)));
    }

    @Override // com.avito.android.serp.analytics.widgets_tracker.f
    @k
    public final InterfaceC43160i<e> getActions() {
        return this.f273943b;
    }

    @Override // js0.d
    public final void h(int i12, @l String str, @l String str2, @l String str3, @l Long l12, @l Map<String, String> map, @l Analytics analytics) {
        this.f273942a.K5(new a(new a.d.b(i12, str, str2, str3, l12, map, analytics)));
    }

    @Override // js0.InterfaceC42421a
    public final void i(int i12, @k String str) {
        this.f273942a.K5(new a(new a.InterfaceC8123a.b(str, i12)));
    }

    @Override // js0.d
    public final void j(@k String str, @l String str2) {
        this.f273942a.K5(new a(new a.d.c(str, str2)));
    }

    @Override // js0.b
    public final void k(@k String str, @k String str2) {
        this.f273942a.K5(new a(new a.b.C8125a(str, str2)));
    }

    @Override // js0.c
    public final void l(@l ArrayList arrayList) {
        this.f273942a.K5(new a(new a.c.C8128c(arrayList)));
    }

    @Override // js0.c
    public final void m(@l String str) {
        this.f273942a.K5(new a(new a.c.d(str)));
    }
}
