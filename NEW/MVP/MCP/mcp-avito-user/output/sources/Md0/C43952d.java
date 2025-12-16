package mD0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorConfigureLevelState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LmD0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mD0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C43952d extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f414425g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C43952d f414426h = new C43952d(false, null, "", null, C42784z0.f406748b);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f414427b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ApiException f414428c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f414429d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f414430e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f414431f;

    /* compiled from: ConstructorConfigureLevelState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmD0/d$a;", "", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mD0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43952d(boolean z12, @l ApiException apiException, @k String str, @l String str2, @k List list) {
        this.f414427b = z12;
        this.f414428c = apiException;
        this.f414429d = str;
        this.f414430e = str2;
        this.f414431f = list;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public static C43952d a(C43952d c43952d, boolean z12, ApiException apiException) {
        String str = c43952d.f414429d;
        String str2 = c43952d.f414430e;
        ?? r52 = c43952d.f414431f;
        c43952d.getClass();
        return new C43952d(z12, apiException, str, str2, r52);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43952d)) {
            return false;
        }
        C43952d c43952d = (C43952d) obj;
        return this.f414427b == c43952d.f414427b && L.f(this.f414428c, c43952d.f414428c) && L.f(this.f414429d, c43952d.f414429d) && L.f(this.f414430e, c43952d.f414430e) && L.f(this.f414431f, c43952d.f414431f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f414427b) * 31;
        ApiException apiException = this.f414428c;
        int iD2 = H.d((iHashCode + (apiException == null ? 0 : apiException.hashCode())) * 31, 31, this.f414429d);
        String str = this.f414430e;
        return this.f414431f.hashCode() + ((iD2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConstructorConfigureLevelState(isLoading=");
        sb2.append(this.f414427b);
        sb2.append(", error=");
        sb2.append(this.f414428c);
        sb2.append(", navBarTitle=");
        sb2.append(this.f414429d);
        sb2.append(", screenTitle=");
        sb2.append(this.f414430e);
        sb2.append(", levels=");
        return H.n(sb2, this.f414431f, ')');
    }
}
