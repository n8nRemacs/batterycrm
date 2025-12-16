package sq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectFieldState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lsq0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sq0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C48401c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f438887e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final SelectItem.Option f438888b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<SelectItem.Option> f438889c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f438890d;

    /* compiled from: SelectFieldState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsq0/c$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sq0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48401c(@l SelectItem.Option option, @k List<SelectItem.Option> list, boolean z12) {
        this.f438888b = option;
        this.f438889c = list;
        this.f438890d = z12;
    }

    public static C48401c a(C48401c c48401c, SelectItem.Option option, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            option = c48401c.f438888b;
        }
        List<SelectItem.Option> list = c48401c.f438889c;
        if ((i12 & 4) != 0) {
            z12 = c48401c.f438890d;
        }
        c48401c.getClass();
        return new C48401c(option, list, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48401c)) {
            return false;
        }
        C48401c c48401c = (C48401c) obj;
        return L.f(this.f438888b, c48401c.f438888b) && L.f(this.f438889c, c48401c.f438889c) && this.f438890d == c48401c.f438890d;
    }

    public final int hashCode() {
        SelectItem.Option option = this.f438888b;
        return Boolean.hashCode(this.f438890d) + H.e((option == null ? 0 : option.hashCode()) * 31, 31, this.f438889c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectFieldState(selectedOption=");
        sb2.append(this.f438888b);
        sb2.append(", options=");
        sb2.append(this.f438889c);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f438890d, ')');
    }
}
