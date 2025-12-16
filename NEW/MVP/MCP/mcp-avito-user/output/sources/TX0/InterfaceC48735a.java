package tx0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.models.SparePartsGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsBottomSheetAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ltx0/a;", "", "a", "b", "Ltx0/a$a;", "Ltx0/a$b;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tx0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC48735a {

    /* compiled from: SparePartsBottomSheetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltx0/a$a;", "Ltx0/a;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tx0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12694a implements InterfaceC48735a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SparePartsGroup f439670a;

        public C12694a(@k SparePartsGroup sparePartsGroup) {
            this.f439670a = sparePartsGroup;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12694a) && L.f(this.f439670a, ((C12694a) obj).f439670a);
        }

        public final int hashCode() {
            return this.f439670a.hashCode();
        }

        @k
        public final String toString() {
            return "OnGroupClicked(group=" + this.f439670a + ')';
        }
    }

    /* compiled from: SparePartsBottomSheetAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltx0/a$b;", "Ltx0/a;", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tx0.a$b */
    public static final class b implements InterfaceC48735a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f439671a = new b();
    }
}
