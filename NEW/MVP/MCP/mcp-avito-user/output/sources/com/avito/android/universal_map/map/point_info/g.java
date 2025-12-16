package com.avito.android.universal_map.map.point_info;

import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.Overlay;
import com.avito.android.util.P2;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalMapPointInfoView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/point_info/g;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface g {

    /* compiled from: UniversalMapPointInfoView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/universal_map/map/point_info/g$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/universal_map/map/point_info/g$a$a;", "Lcom/avito/android/universal_map/map/point_info/g$a$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: UniversalMapPointInfoView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/point_info/g$a$a;", "Lcom/avito/android/universal_map/map/point_info/g$a;", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.universal_map.map.point_info.g$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9392a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final C9393a f305810a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final P2<G0> f305811b;

            /* compiled from: UniversalMapPointInfoView.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/point_info/g$a$a$a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.universal_map.map.point_info.g$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C9393a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f305812a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305813b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final String f305814c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.k
                public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305815d;

                /* renamed from: e, reason: collision with root package name */
                @Y61.k
                public final String f305816e;

                /* renamed from: f, reason: collision with root package name */
                @Y61.k
                public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305817f;

                /* JADX WARN: Multi-variable type inference failed */
                public C9393a(@Y61.k String str, @Y61.k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @Y61.k String str2, @Y61.k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @Y61.k String str3, @Y61.k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
                    this.f305812a = str;
                    this.f305813b = list;
                    this.f305814c = str2;
                    this.f305815d = list2;
                    this.f305816e = str3;
                    this.f305817f = list3;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C9393a)) {
                        return false;
                    }
                    C9393a c9393a = (C9393a) obj;
                    return L.f(this.f305812a, c9393a.f305812a) && L.f(this.f305813b, c9393a.f305813b) && L.f(this.f305814c, c9393a.f305814c) && L.f(this.f305815d, c9393a.f305815d) && L.f(this.f305816e, c9393a.f305816e) && L.f(this.f305817f, c9393a.f305817f);
                }

                public final int hashCode() {
                    return this.f305817f.hashCode() + H.d(H.e(H.d(H.e(this.f305812a.hashCode() * 31, 31, this.f305813b), 31, this.f305814c), 31, this.f305815d), 31, this.f305816e);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("BeduinItems(topFormId=");
                    sb2.append(this.f305812a);
                    sb2.append(", topBeduinItems=");
                    sb2.append(this.f305813b);
                    sb2.append(", mainFormId=");
                    sb2.append(this.f305814c);
                    sb2.append(", mainBeduinItems=");
                    sb2.append(this.f305815d);
                    sb2.append(", bottomFormId=");
                    sb2.append(this.f305816e);
                    sb2.append(", bottomBeduinItems=");
                    return H.p(sb2, this.f305817f, ')');
                }
            }

            public /* synthetic */ C9392a(C9393a c9393a, P2 p22, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : c9393a, p22);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9392a)) {
                    return false;
                }
                C9392a c9392a = (C9392a) obj;
                return L.f(this.f305810a, c9392a.f305810a) && L.f(this.f305811b, c9392a.f305811b);
            }

            public final int hashCode() {
                C9393a c9393a = this.f305810a;
                return this.f305811b.hashCode() + ((c9393a == null ? 0 : c9393a.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                return "BeduinExpanded(beduinItems=" + this.f305810a + ", loadingState=" + this.f305811b + ')';
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C9392a(@Y61.l C9393a c9393a, @Y61.k P2<? super G0> p22) {
                super(null);
                this.f305810a = c9393a;
                this.f305811b = p22;
            }
        }

        /* compiled from: UniversalMapPointInfoView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/point_info/g$a$b;", "Lcom/avito/android/universal_map/map/point_info/g$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Overlay f305818a;

            /* JADX WARN: Multi-variable type inference failed */
            public b() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f305818a, ((b) obj).f305818a);
            }

            public final int hashCode() {
                Overlay overlay = this.f305818a;
                if (overlay == null) {
                    return 0;
                }
                return overlay.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Hidden(overlay=" + this.f305818a + ')';
            }

            public /* synthetic */ b(Overlay overlay, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : overlay);
            }

            public b(@Y61.l Overlay overlay) {
                super(null);
                this.f305818a = overlay;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    int a();

    void b();

    @Y61.k
    LinkedHashMap c();

    @Y61.k
    /* renamed from: d */
    com.jakewharton.rxrelay3.c getF305851x();

    @Y61.k
    /* renamed from: e */
    com.jakewharton.rxrelay3.c getF305850w();

    void f(@Y61.k a aVar);

    boolean isVisible();
}
