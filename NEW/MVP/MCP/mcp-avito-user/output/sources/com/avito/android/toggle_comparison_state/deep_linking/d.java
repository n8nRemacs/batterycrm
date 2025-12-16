package com.avito.android.toggle_comparison_state.deep_linking;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.toggle_comparison_state.s;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ToggleComparisonStateLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/d;", "Lev/a;", "Lcom/avito/android/toggle_comparison_state/deep_linking/ToggleComparisonStateLink;", "a", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC40161a<ToggleComparisonStateLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C25719a f301581f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.toggle_comparison_state.l f301582g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f301583h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f301584i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ToggleComparisonStateLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/d$a;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/toggle_comparison_state/deep_linking/d$a$a;", "Lcom/avito/android/toggle_comparison_state/deep_linking/d$a$b;", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements InterfaceC14249c.b {

        /* compiled from: ToggleComparisonStateLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/d$a$a;", "Lcom/avito/android/toggle_comparison_state/deep_linking/d$a;", "<init>", "()V", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.toggle_comparison_state.deep_linking.d$a$a, reason: collision with other inner class name */
        public static final class C9228a extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C9228a f301585b = new C9228a();

            public C9228a() {
                super(null);
            }
        }

        /* compiled from: ToggleComparisonStateLinkHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/toggle_comparison_state/deep_linking/d$a$b;", "Lcom/avito/android/toggle_comparison_state/deep_linking/d$a;", "_avito_toggle-comparison-state_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final s f301586b;

            public b(@Y61.k s sVar) {
                super(null);
                this.f301586b = sVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f301586b, ((b) obj).f301586b);
            }

            public final int hashCode() {
                return this.f301586b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Success(result=" + this.f301586b + ')';
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public d(@Y61.k C25719a c25719a, @Y61.k com.avito.android.toggle_comparison_state.l lVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f301581f = c25719a;
        this.f301582g = lVar;
        this.f301583h = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ToggleComparisonStateLink toggleComparisonStateLink = (ToggleComparisonStateLink) deepLink;
        this.f301581f.b(toggleComparisonStateLink, this, null, new e(toggleComparisonStateLink, bundle, this));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f301584i.e();
    }
}
