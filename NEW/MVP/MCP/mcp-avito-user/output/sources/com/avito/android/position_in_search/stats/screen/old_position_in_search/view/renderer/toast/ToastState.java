package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ToastState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState;", "", "a", "Duration", "b", "c", "d", "e", "f", "g", "Style", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$e;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$g;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ToastState {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToastState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$Duration;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Duration {

        /* renamed from: b, reason: collision with root package name */
        public static final Duration f221196b;

        /* renamed from: c, reason: collision with root package name */
        public static final Duration f221197c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Duration[] f221198d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f221199e;

        static {
            Duration duration = new Duration("DEFAULT", 0);
            f221196b = duration;
            Duration duration2 = new Duration("FOREVER", 1);
            f221197c = duration2;
            Duration[] durationArr = {duration, duration2};
            f221198d = durationArr;
            f221199e = kotlin.enums.c.a(durationArr);
        }

        public Duration() {
            throw null;
        }

        public static Duration valueOf(String str) {
            return (Duration) Enum.valueOf(Duration.class, str);
        }

        public static Duration[] values() {
            return (Duration[]) f221198d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToastState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$Style;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        /* renamed from: b, reason: collision with root package name */
        public static final Style f221200b;

        /* renamed from: c, reason: collision with root package name */
        public static final Style f221201c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Style[] f221202d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f221203e;

        static {
            Style style = new Style("ERROR", 0);
            f221200b = style;
            Style style2 = new Style("DEFAULT", 1);
            f221201c = style2;
            Style[] styleArr = {style, style2};
            f221202d = styleArr;
            f221203e = kotlin.enums.c.a(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f221202d.clone();
        }
    }

    /* compiled from: ToastState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$a;", "", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: ToastState.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements ToastState {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f221204a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f221205b = -1;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f221206c = "";

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Style f221207d = Style.f221201c;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final f.b f221208e = new f.b(com.avito.android.printable_text.b.a());

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final Duration f221209f = Duration.f221196b;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final c f221210g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final c f221211h;

        static {
            c cVar = c.f221212b;
            f221210g = cVar;
            f221211h = cVar;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final Y41.l<String, G0> a() {
            return f221210g;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final Y41.l<String, G0> b() {
            return f221211h;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        public final boolean c() {
            return false;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: d */
        public final String getF221229a() {
            return f221206c;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        /* renamed from: e */
        public final boolean getF221225e() {
            return false;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: getDuration */
        public final Duration getF221233e() {
            return f221209f;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final f getMessage() {
            return f221208e;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        public final int getPriority() {
            return f221205b;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: getStyle */
        public final Style getF221232d() {
            return f221207d;
        }

        public final int hashCode() {
            return 397222272;
        }

        @Y61.k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: ToastState.kt */
    @P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$c;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Y41.l<String, G0> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f221212b = new c();

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            return G0.f406611a;
        }
    }

    /* compiled from: ToastState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements ToastState {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f221213a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final f.b f221214b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.l<String, G0> f221215c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ApiError f221216d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Throwable f221217e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Style f221218f = Style.f221200b;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Duration f221219g = Duration.f221196b;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final c f221220h = c.f221212b;

        public d(@Y61.k String str, @Y61.k f.b bVar, @Y61.k Y41.l lVar, @Y61.k ApiError apiError, @Y61.l Throwable th2) {
            this.f221213a = str;
            this.f221214b = bVar;
            this.f221215c = lVar;
            this.f221216d = apiError;
            this.f221217e = th2;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final Y41.l<String, G0> a() {
            return this.f221215c;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final Y41.l<String, G0> b() {
            return this.f221220h;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        public final boolean c() {
            return false;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF221229a() {
            return this.f221213a;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        /* renamed from: e */
        public final boolean getF221225e() {
            return false;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f221213a, dVar.f221213a) && this.f221214b.equals(dVar.f221214b) && this.f221215c.equals(dVar.f221215c) && L.f(this.f221216d, dVar.f221216d) && L.f(this.f221217e, dVar.f221217e);
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: getDuration, reason: from getter */
        public final Duration getF221233e() {
            return this.f221219g;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final f getMessage() {
            return this.f221214b;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        public final int getPriority() {
            return 2;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: getStyle, reason: from getter */
        public final Style getF221232d() {
            return this.f221218f;
        }

        public final int hashCode() {
            int iHashCode = (this.f221216d.hashCode() + ((this.f221215c.hashCode() + com.avito.android.actions_sheet.a.f(this.f221214b.f221228a, this.f221213a.hashCode() * 31, 31)) * 31)) * 31;
            Throwable th2 = this.f221217e;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(toastId=");
            sb2.append(this.f221213a);
            sb2.append(", message=");
            sb2.append(this.f221214b);
            sb2.append(", dismissAction=");
            sb2.append(this.f221215c);
            sb2.append(", error=");
            sb2.append(this.f221216d);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f221217e, ')');
        }
    }

    /* compiled from: ToastState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$e;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements ToastState {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f221221a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Style f221222b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final f.b f221223c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Y41.l<String, G0> f221224d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f221225e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Y41.l<String, G0> f221226f;

        public e(@Y61.k String str, @Y61.k Style style, @Y61.k f.b bVar, @Y61.k Y41.l lVar, boolean z12, @Y61.k Y41.l lVar2) {
            Duration duration = Duration.f221196b;
            this.f221221a = str;
            this.f221222b = style;
            this.f221223c = bVar;
            this.f221224d = lVar;
            this.f221225e = z12;
            this.f221226f = lVar2;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final Y41.l<String, G0> a() {
            return this.f221224d;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final Y41.l<String, G0> b() {
            return this.f221226f;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        public final boolean c() {
            return true;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF221229a() {
            return this.f221221a;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        /* renamed from: e, reason: from getter */
        public final boolean getF221225e() {
            return this.f221225e;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!L.f(this.f221221a, eVar.f221221a) || this.f221222b != eVar.f221222b || !this.f221223c.equals(eVar.f221223c)) {
                return false;
            }
            Duration duration = Duration.f221196b;
            return this.f221224d.equals(eVar.f221224d) && this.f221225e == eVar.f221225e && this.f221226f.equals(eVar.f221226f);
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: getDuration */
        public final Duration getF221233e() {
            return Duration.f221197c;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final f getMessage() {
            return this.f221223c;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        public final int getPriority() {
            return 0;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: getStyle, reason: from getter */
        public final Style getF221232d() {
            return this.f221222b;
        }

        public final int hashCode() {
            return this.f221226f.hashCode() + r.i(r.i((this.f221224d.hashCode() + ((Duration.f221197c.hashCode() + com.avito.android.actions_sheet.a.f(this.f221223c.f221228a, (this.f221222b.hashCode() + (this.f221221a.hashCode() * 31)) * 31, 31)) * 31)) * 31, 31, true), 31, this.f221225e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadedInfo(toastId=");
            sb2.append(this.f221221a);
            sb2.append(", style=");
            sb2.append(this.f221222b);
            sb2.append(", message=");
            sb2.append(this.f221223c);
            sb2.append(", duration=");
            sb2.append(Duration.f221197c);
            sb2.append(", dismissAction=");
            sb2.append(this.f221224d);
            sb2.append(", closable=true, showRefreshButton=");
            sb2.append(this.f221225e);
            sb2.append(", reloadAction=");
            return H.l(sb2, this.f221226f, ')');
        }
    }

    /* compiled from: ToastState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$f;", "", "a", "b", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$f$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$f$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f {

        /* compiled from: ToastState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$f$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$f;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements f {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final AttributedText f221227a;

            public a(@Y61.k AttributedText attributedText) {
                this.f221227a = attributedText;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f221227a, ((a) obj).f221227a);
            }

            public final int hashCode() {
                return this.f221227a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.w(new StringBuilder("Attributed(text="), this.f221227a, ')');
            }
        }

        /* compiled from: ToastState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$f$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$f;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements f {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final PrintableText f221228a;

            public b(@Y61.k PrintableText printableText) {
                this.f221228a = printableText;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f221228a, ((b) obj).f221228a);
            }

            public final int hashCode() {
                return this.f221228a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.m(new StringBuilder("Text(text="), this.f221228a, ')');
            }
        }
    }

    /* compiled from: ToastState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState$g;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/renderer/toast/ToastState;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements ToastState {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f221229a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final f.a f221230b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.l<String, G0> f221231c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Style f221232d = Style.f221201c;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Duration f221233e = Duration.f221196b;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final c f221234f = c.f221212b;

        public g(@Y61.k String str, @Y61.k f.a aVar, @Y61.k Y41.l lVar) {
            this.f221229a = str;
            this.f221230b = aVar;
            this.f221231c = lVar;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final Y41.l<String, G0> a() {
            return this.f221231c;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final Y41.l<String, G0> b() {
            return this.f221234f;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        public final boolean c() {
            return false;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF221229a() {
            return this.f221229a;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        /* renamed from: e */
        public final boolean getF221225e() {
            return false;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f221229a, gVar.f221229a) && this.f221230b.equals(gVar.f221230b) && this.f221231c.equals(gVar.f221231c);
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: getDuration, reason: from getter */
        public final Duration getF221233e() {
            return this.f221233e;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        public final f getMessage() {
            return this.f221230b;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        public final int getPriority() {
            return 1;
        }

        @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast.ToastState
        @Y61.k
        /* renamed from: getStyle, reason: from getter */
        public final Style getF221232d() {
            return this.f221232d;
        }

        public final int hashCode() {
            return this.f221231c.hashCode() + com.avito.android.actions_sheet.a.b(this.f221229a.hashCode() * 31, 31, this.f221230b.f221227a);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PeriodUnavailable(toastId=");
            sb2.append(this.f221229a);
            sb2.append(", message=");
            sb2.append(this.f221230b);
            sb2.append(", dismissAction=");
            return H.l(sb2, this.f221231c, ')');
        }
    }

    @Y61.k
    Y41.l<String, G0> a();

    @Y61.k
    Y41.l<String, G0> b();

    boolean c();

    @Y61.k
    /* renamed from: d */
    String getF221229a();

    /* renamed from: e */
    boolean getF221225e();

    @Y61.k
    /* renamed from: getDuration */
    Duration getF221233e();

    @Y61.k
    f getMessage();

    int getPriority();

    @Y61.k
    /* renamed from: getStyle */
    Style getF221232d();
}
