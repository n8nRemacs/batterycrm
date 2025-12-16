package Vn0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.map_core.beduin.BeduinDeliveryMethodSelectTabAction;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeShippingCompetitionInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LVn0/b;", "", "a", "b", "c", "d", "e", "f", "LVn0/b$a;", "LVn0/b$b;", "LVn0/b$c;", "LVn0/b$d;", "LVn0/b$e;", "LVn0/b$f;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vn0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15696b {

    /* compiled from: UniversalDeliveryTypeShippingCompetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVn0/b$a;", "LVn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vn0.b$a */
    public static final /* data */ class a implements InterfaceC15696b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f17369a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            this.f17369a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f17369a, ((a) obj).f17369a);
        }

        public final int hashCode() {
            return this.f17369a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ContentChanged(mainComponents="), this.f17369a, ')');
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVn0/b$b;", "LVn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vn0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1197b implements InterfaceC15696b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f17370a;

        public C1197b(@k ApiError apiError) {
            this.f17370a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1197b) && L.f(this.f17370a, ((C1197b) obj).f17370a);
        }

        public final int hashCode() {
            return this.f17370a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ExecuteRequestFailed(error="), this.f17370a, ')');
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVn0/b$c;", "LVn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vn0.b$c */
    public static final /* data */ class c implements InterfaceC15696b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f17371a;

        public c(boolean z12) {
            this.f17371a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f17371a == ((c) obj).f17371a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f17371a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ExecuteRequestStateChanged(isExecuting="), this.f17371a, ')');
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVn0/b$d;", "LVn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vn0.b$d */
    public static final /* data */ class d implements InterfaceC15696b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17372a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f17373b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@k String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            this.f17372a = str;
            this.f17373b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f17372a, dVar.f17372a) && L.f(this.f17373b, dVar.f17373b);
        }

        public final int hashCode() {
            return this.f17373b.hashCode() + (this.f17372a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(mainFormId=");
            sb2.append(this.f17372a);
            sb2.append(", mainComponents=");
            return H.p(sb2, this.f17373b, ')');
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVn0/b$e;", "LVn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vn0.b$e */
    public static final /* data */ class e implements InterfaceC15696b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f17374a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 702084100;
        }

        @k
        public final String toString() {
            return "LoadingStarted";
        }
    }

    /* compiled from: UniversalDeliveryTypeShippingCompetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVn0/b$f;", "LVn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vn0.b$f */
    public static final /* data */ class f implements InterfaceC15696b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinDeliveryMethodSelectTabAction f17375a;

        public f(@k BeduinDeliveryMethodSelectTabAction beduinDeliveryMethodSelectTabAction) {
            this.f17375a = beduinDeliveryMethodSelectTabAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f17375a, ((f) obj).f17375a);
        }

        public final int hashCode() {
            return this.f17375a.hashCode();
        }

        @k
        public final String toString() {
            return "SelectTabAction(selectTabAction=" + this.f17375a + ')';
        }
    }
}
