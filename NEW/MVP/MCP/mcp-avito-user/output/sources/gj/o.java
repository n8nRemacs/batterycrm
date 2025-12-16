package gj;

import android.view.View;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ToastBarSettings.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgj/o;", "", "a", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f396761a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f396762b;

    /* compiled from: ToastBarSettings.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgj/o$a;", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f396763a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ToastBarPosition f396764b;

        public a(@Y61.k View view, @Y61.k ToastBarPosition toastBarPosition) {
            this.f396763a = view;
            this.f396764b = toastBarPosition;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f396763a, aVar.f396763a) && this.f396764b == aVar.f396764b;
        }

        public final int hashCode() {
            return this.f396764b.hashCode() + (this.f396763a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "DisplayingParams(anchorView=" + this.f396763a + ", position=" + this.f396764b + ')';
        }
    }

    public o(@Y61.k a aVar, @Y61.k a aVar2) {
        this.f396761a = aVar;
        this.f396762b = aVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f396761a, oVar.f396761a) && L.f(this.f396762b, oVar.f396762b);
    }

    public final int hashCode() {
        return this.f396762b.hashCode() + (this.f396761a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ToastBarSettings(defaultState=" + this.f396761a + ", errorState=" + this.f396762b + ')';
    }
}
