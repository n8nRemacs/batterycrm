package com.avito.android.location_picker.providers;

import androidx.collection.o1;
import com.avito.android.remote.model.Coordinates;
import io.reactivex.rxjava3.internal.operators.maybe.i0;
import io.reactivex.rxjava3.internal.operators.maybe.s0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import uW.InterfaceC48983a;
import yW.AbstractC50188a;

/* compiled from: AdvertsCountProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location_picker/providers/g;", "Lcom/avito/android/location_picker/providers/f;", "a", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements InterfaceC31569f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC48983a> f182447a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o1<a, AbstractC50188a> f182448b = new o1<>(0, 1, null);

    /* compiled from: AdvertsCountProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/providers/g$a;", "", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f182449a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Coordinates f182450b;

        public a(@Y61.l Coordinates coordinates, @Y61.l String str) {
            this.f182449a = str;
            this.f182450b = coordinates;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f182449a, aVar.f182449a) && L.f(this.f182450b, aVar.f182450b);
        }

        public final int hashCode() {
            String str = this.f182449a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Coordinates coordinates = this.f182450b;
            return iHashCode + (coordinates != null ? coordinates.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "RadiusPoint(radiusId=" + this.f182449a + ", coordinates=" + this.f182450b + ')';
        }
    }

    @Inject
    public g(@Y61.k h31.e<InterfaceC48983a> eVar) {
        this.f182447a = eVar;
    }

    @Override // com.avito.android.location_picker.providers.InterfaceC31569f
    @Y61.k
    public final s0 a(@Y61.k Map map, @Y61.l String str, @Y61.l Coordinates coordinates) {
        io.reactivex.rxjava3.core.q qVarA = com.avito.android.util.rx3.A.a(this.f182448b.get(new a(coordinates, str)));
        io.reactivex.rxjava3.core.q<T> qVarE = this.f182447a.get().b(map).S().r(i.f182454b).k(new h(this, str, coordinates)).E();
        qVarA.getClass();
        return new i0(qVarA, qVarE).r();
    }
}
