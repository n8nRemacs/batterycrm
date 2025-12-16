package Un0;

import Y61.k;
import Y61.l;
import com.avito.android.map_core.beduin.BeduinDeliveryMethodSelectTabAction;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LUn0/a;", "", "a", "b", "c", "d", "LUn0/a$a;", "LUn0/a$b;", "LUn0/a$c;", "LUn0/a$d;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Un0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15540a {

    /* compiled from: UniversalDeliveryTypeAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUn0/a$a;", "LUn0/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Un0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1143a implements InterfaceC15540a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinDeliveryMethodSelectTabAction f16585a;

        public C1143a(@k BeduinDeliveryMethodSelectTabAction beduinDeliveryMethodSelectTabAction) {
            this.f16585a = beduinDeliveryMethodSelectTabAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1143a) && L.f(this.f16585a, ((C1143a) obj).f16585a);
        }

        public final int hashCode() {
            return this.f16585a.hashCode();
        }

        @k
        public final String toString() {
            return "DeliveryMethodSelectTab(tabAction=" + this.f16585a + ')';
        }
    }

    /* compiled from: UniversalDeliveryTypeAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUn0/a$b;", "LUn0/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Un0.a$b */
    public static final /* data */ class b implements InterfaceC15540a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UniversalDeliveryTypeContent.Tab f16586a;

        public b(@k UniversalDeliveryTypeContent.Tab tab) {
            this.f16586a = tab;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f16586a, ((b) obj).f16586a);
        }

        public final int hashCode() {
            return this.f16586a.hashCode();
        }

        @k
        public final String toString() {
            return "ManualSelectTabAction(tab=" + this.f16586a + ')';
        }
    }

    /* compiled from: UniversalDeliveryTypeAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUn0/a$c;", "LUn0/a;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Un0.a$c */
    public static final /* data */ class c implements InterfaceC15540a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f16587a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -212412412;
        }

        @k
        public final String toString() {
            return "ReloadAction";
        }
    }

    /* compiled from: UniversalDeliveryTypeAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUn0/a$d;", "LUn0/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Un0.a$d */
    public static final /* data */ class d implements InterfaceC15540a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16588a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UniversalDeliveryTypeContent.Tab f16589b;

        public d(int i12, @k UniversalDeliveryTypeContent.Tab tab) {
            this.f16588a = i12;
            this.f16589b = tab;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f16588a == dVar.f16588a && L.f(this.f16589b, dVar.f16589b);
        }

        public final int hashCode() {
            return this.f16589b.hashCode() + (Integer.hashCode(this.f16588a) * 31);
        }

        @k
        public final String toString() {
            return "SelectTabAction(tabIndex=" + this.f16588a + ", tab=" + this.f16589b + ')';
        }
    }
}
