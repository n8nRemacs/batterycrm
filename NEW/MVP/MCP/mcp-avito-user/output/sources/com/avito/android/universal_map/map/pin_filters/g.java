package com.avito.android.universal_map.map.pin_filters;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalMapPinFiltersView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/g;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface g {

    /* compiled from: UniversalMapPinFiltersView.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/g$a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lcom/avito/android/universal_map/map/pin_filters/g$a$a;", "Lcom/avito/android/universal_map/map/pin_filters/g$a$b;", "Lcom/avito/android/universal_map/map/pin_filters/g$a$c;", "Lcom/avito/android/universal_map/map/pin_filters/g$a$d;", "Lcom/avito/android/universal_map/map/pin_filters/g$a$e;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: UniversalMapPinFiltersView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/g$a$a;", "Lcom/avito/android/universal_map/map/pin_filters/g$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.universal_map.map.pin_filters.g$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9391a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f305717a;

            public C9391a() {
                this(false, 1, null);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9391a) && this.f305717a == ((C9391a) obj).f305717a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f305717a);
            }

            @Y61.k
            public final String toString() {
                return r.x(new StringBuilder("Hidden(shouldInvokeOnCloseActions="), this.f305717a, ')');
            }

            public C9391a(boolean z12) {
                super(null);
                this.f305717a = z12;
            }

            public /* synthetic */ C9391a(boolean z12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? true : z12);
            }
        }

        /* compiled from: UniversalMapPinFiltersView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/g$a$b;", "Lcom/avito/android/universal_map/map/pin_filters/g$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f305718a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305719b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f305720c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305721d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final String f305722e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305723f;

            /* JADX WARN: Multi-variable type inference failed */
            public b(@Y61.k String str, @Y61.k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @Y61.k String str2, @Y61.k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @Y61.k String str3, @Y61.k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
                super(null);
                this.f305718a = str;
                this.f305719b = list;
                this.f305720c = str2;
                this.f305721d = list2;
                this.f305722e = str3;
                this.f305723f = list3;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f305718a, bVar.f305718a) && L.f(this.f305719b, bVar.f305719b) && L.f(this.f305720c, bVar.f305720c) && L.f(this.f305721d, bVar.f305721d) && L.f(this.f305722e, bVar.f305722e) && L.f(this.f305723f, bVar.f305723f);
            }

            public final int hashCode() {
                return this.f305723f.hashCode() + H.d(H.e(H.d(H.e(this.f305718a.hashCode() * 31, 31, this.f305719b), 31, this.f305720c), 31, this.f305721d), 31, this.f305722e);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LoadedBeduinContent(topFormId=");
                sb2.append(this.f305718a);
                sb2.append(", topBeduinItems=");
                sb2.append(this.f305719b);
                sb2.append(", mainFormId=");
                sb2.append(this.f305720c);
                sb2.append(", mainBeduinItems=");
                sb2.append(this.f305721d);
                sb2.append(", bottomFormId=");
                sb2.append(this.f305722e);
                sb2.append(", bottomBeduinItems=");
                return H.p(sb2, this.f305723f, ')');
            }
        }

        /* compiled from: UniversalMapPinFiltersView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/g$a$c;", "Lcom/avito/android/universal_map/map/pin_filters/g$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ApiError f305724a;

            public c(@Y61.k ApiError apiError) {
                super(null);
                this.f305724a = apiError;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f305724a, ((c) obj).f305724a);
            }

            public final int hashCode() {
                return this.f305724a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.n(new StringBuilder("LoadedError(error="), this.f305724a, ')');
            }
        }

        /* compiled from: UniversalMapPinFiltersView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/g$a$d;", "Lcom/avito/android/universal_map/map/pin_filters/g$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f305725a = new d();

            public d() {
                super(null);
            }
        }

        /* compiled from: UniversalMapPinFiltersView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/g$a$e;", "Lcom/avito/android/universal_map/map/pin_filters/g$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f305726a = new e();

            public e() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }
}
