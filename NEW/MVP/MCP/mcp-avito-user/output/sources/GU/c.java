package gu;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DataPickerShowState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgu/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f396931g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f396932h = new c(null, null, "", null, "");

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<List<com.avito.android.lib.design.picker.k<Integer>>> f396933b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<String> f396934c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f396935d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f396936e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f396937f;

    /* compiled from: DataPickerShowState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgu/c$a;", "", "<init>", "()V", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l List<? extends List<com.avito.android.lib.design.picker.k<Integer>>> list, @l List<String> list2, @k String str, @l String str2, @k String str3) {
        this.f396933b = list;
        this.f396934c = list2;
        this.f396935d = str;
        this.f396936e = str2;
        this.f396937f = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f396933b, cVar.f396933b) && L.f(this.f396934c, cVar.f396934c) && L.f(this.f396935d, cVar.f396935d) && L.f(this.f396936e, cVar.f396936e) && L.f(this.f396937f, cVar.f396937f);
    }

    public final int hashCode() {
        List<List<com.avito.android.lib.design.picker.k<Integer>>> list = this.f396933b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f396934c;
        int iD2 = H.d((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f396935d);
        String str = this.f396936e;
        return this.f396937f.hashCode() + ((iD2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPickerShowState(values=");
        sb2.append(this.f396933b);
        sb2.append(", preselected=");
        sb2.append(this.f396934c);
        sb2.append(", divider=");
        sb2.append(this.f396935d);
        sb2.append(", title=");
        sb2.append(this.f396936e);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.f396937f, ')');
    }
}
