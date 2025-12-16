package com.avito.android.avl_analytics;

import Cg.C13300a;
import Cg.C13301b;
import Cg.C13302c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import mc.C44048a;
import mc.C44050c;
import mc.g;

/* compiled from: AvlAnalyticsInteractor.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_analytics/b;", "Lcom/avito/android/avl_analytics/a;", "a", "b", "_avito_avl-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.avl_analytics.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f98435a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashSet f98436b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public String f98437c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f98438d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public C13300a f98439e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C2950b f98440f;

    /* compiled from: AvlAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avl_analytics/b$a;", "", "<init>", "()V", "", "AVL_X_HASH_LENGTH", "I", "_avito_avl-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvlAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_analytics/b$b;", "", "_avito_avl-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.avl_analytics.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2950b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f98441a;

        public C2950b() {
            this(null, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2950b) && L.f(this.f98441a, ((C2950b) obj).f98441a);
        }

        public final int hashCode() {
            String str = this.f98441a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FullscreenAvlData(itemId="), this.f98441a, ')');
        }

        public C2950b(String str, int i12, C42822w c42822w) {
            this.f98441a = (i12 & 1) != 0 ? null : str;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.analytics.provider.e eVar) {
        this.f98435a = interfaceC28373a;
        eVar.a();
        this.f98436b = new LinkedHashSet();
        f.f98445a.getClass();
        this.f98437c = f.a();
        this.f98439e = new C13300a(null, null, null, 0, 0, null, null, null, null);
        this.f98440f = new C2950b(null, 1, null);
    }

    @Override // com.avito.android.avl_analytics.a
    public final void a(@k String str) {
        String str2 = this.f98440f.f98441a;
        C13300a c13300a = this.f98439e;
        this.f98435a.c(new C13302c(str2, c13300a.f2576c, c13300a.f2575b, this.f98437c, str));
    }

    @Override // com.avito.android.avl_analytics.a
    public final void b(@l String str, @l String str2, @l Double d12, @l Double d13, @l Integer num, @l String str3, @k VideoStopReason videoStopReason) {
        if ((d12 == null || d13 == null) && videoStopReason != VideoStopReason.f90113d) {
            return;
        }
        AvlFromPage avlFromPage = AvlFromPage.f98428c;
        this.f98435a.c(new g(str, str2, "feed_fullscreen", d12, d13, num, str3, videoStopReason, this.f98437c));
    }

    @Override // com.avito.android.avl_analytics.a
    public final void c(@l String str, @l String str2, @l Integer num, @l Integer num2, boolean z12) {
        AvlEntryType avlEntryType = AvlEntryType.f98425b;
        InterfaceC28373a interfaceC28373a = this.f98435a;
        if (z12) {
            interfaceC28373a.c(new Cg.d(str, str2, num, num2));
        } else {
            interfaceC28373a.c(new Cg.d(str, str2, num, Integer.valueOf(num2.intValue() - 3)));
        }
    }

    @Override // com.avito.android.avl_analytics.a
    public final void d(@l String str) {
        this.f98440f.f98441a = str;
        C13300a c13300a = this.f98439e;
        this.f98435a.c(new C13301b(str, c13300a.f2576c, c13300a.f2575b, this.f98437c));
    }

    @Override // com.avito.android.avl_analytics.a
    public final void e(@k String str, @l String str2, @l Integer num, @l Integer num2, boolean z12, @l ArrayList arrayList, @l String str3) {
        AvlEntryType avlEntryType = AvlEntryType.f98425b;
        if (num == null || num.intValue() <= 0) {
            return;
        }
        LinkedHashSet linkedHashSet = this.f98436b;
        if (linkedHashSet.contains(str) || L.f(this.f98438d, str3)) {
            return;
        }
        InterfaceC28373a interfaceC28373a = this.f98435a;
        if (z12) {
            interfaceC28373a.c(new Cg.e("VERTICAL_MAIN", str2, num, num2, arrayList, str3));
        } else {
            AvlFromPage avlFromPage = AvlFromPage.f98428c;
            interfaceC28373a.c(new Cg.e("main", str2, num, Integer.valueOf(num2.intValue() - 3), arrayList, str3));
        }
        linkedHashSet.add(str);
        this.f98438d = str3;
    }

    @Override // com.avito.android.avl_analytics.a
    public final void f(@l Double d12, @l Integer num, @l String str, @l String str2, @l String str3) {
        VideoStopReason videoStopReason = VideoStopReason.f90111b;
        AvlFromPage avlFromPage = AvlFromPage.f98428c;
        this.f98435a.c(new g(str, str2, "feed", d12, null, num, str3, videoStopReason, this.f98437c));
    }

    @Override // com.avito.android.avl_analytics.a
    public final void g(@l Integer num, @l String str, @l String str2, @l String str3) {
        AvlFromPage avlFromPage = AvlFromPage.f98428c;
        this.f98435a.c(new C44048a(str2, str, "feed_fullscreen", str3, num));
    }

    @Override // com.avito.android.avl_analytics.a
    public final void h(@l Double d12, @l Integer num, @l String str, @l String str2, @l String str3) {
        AvlFromPage avlFromPage = AvlFromPage.f98428c;
        this.f98435a.c(new mc.e(str, str2, "feed_fullscreen", num, str3, d12, this.f98437c));
    }

    @Override // com.avito.android.avl_analytics.a
    @k
    /* renamed from: i, reason: from getter */
    public final String getF98437c() {
        return this.f98437c;
    }

    @Override // com.avito.android.avl_analytics.a
    public final void j() {
        this.f98435a.c(this.f98439e);
    }

    @Override // com.avito.android.avl_analytics.a
    public final void k(@l Double d12, @l Integer num, @l String str, @l String str2, @l String str3) {
        AvlFromPage avlFromPage = AvlFromPage.f98428c;
        this.f98435a.c(new mc.e(str, str2, "feed", num, str3, d12, this.f98437c));
    }

    @Override // com.avito.android.avl_analytics.a
    public final void l(@l String str, @l Integer num, @l String str2, @l Integer num2, @l AvlEntryType avlEntryType, @k AvlFromPage avlFromPage, @l String str3) {
        Integer numValueOf;
        f.f98445a.getClass();
        this.f98437c = f.a();
        if (avlFromPage == AvlFromPage.f98428c) {
            numValueOf = num2 != null ? Integer.valueOf(num2.intValue() - 3) : null;
        } else {
            numValueOf = num2;
        }
        this.f98439e = new C13300a(avlFromPage.f98434b, str, str2, num, numValueOf, avlEntryType, this.f98437c, this.f98438d, str3);
    }

    @Override // com.avito.android.avl_analytics.a
    public final void m(@l Boolean bool, @l String str, @l String str2) {
        AvlFromPage avlFromPage = AvlFromPage.f98428c;
        this.f98435a.c(new C44050c(str, str2, "feed_fullscreen", this.f98437c, bool));
    }
}
