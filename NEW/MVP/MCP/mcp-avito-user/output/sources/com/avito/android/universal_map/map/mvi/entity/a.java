package com.avito.android.universal_map.map.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalMapState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/universal_map/map/mvi/entity/a$a;", "Lcom/avito/android/universal_map/map/mvi/entity/a$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: UniversalMapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/a$a;", "Lcom/avito/android/universal_map/map/mvi/entity/a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.universal_map.map.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9378a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f305555a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305556b;

        /* JADX WARN: Multi-variable type inference failed */
        public C9378a(@k String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            super(null);
            this.f305555a = str;
            this.f305556b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9378a)) {
                return false;
            }
            C9378a c9378a = (C9378a) obj;
            return L.f(this.f305555a, c9378a.f305555a) && L.f(this.f305556b, c9378a.f305556b);
        }

        public final int hashCode() {
            return this.f305556b.hashCode() + (this.f305555a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(topFormId=");
            sb2.append(this.f305555a);
            sb2.append(", topComponents=");
            return H.p(sb2, this.f305556b, ')');
        }
    }

    /* compiled from: UniversalMapState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/a$b;", "Lcom/avito/android/universal_map/map/mvi/entity/a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f305557a = new b();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
