package ih0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import ch0.C27195a;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.step.e;
import com.avito.android.rating_form.step.validations.ValidationInfo;
import hh0.C40940b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormStepState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lih0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ih0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C41404c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f398669i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C41404c f398670j = new C41404c(C42784z0.f406748b, false, null, P0.c(), null, P0.c(), null, 64, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<TV0.a> f398671b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f398672c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C27195a f398673d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<FieldIdentifier, ValidationInfo> f398674e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C40940b f398675f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Map<FieldIdentifier, List<e>> f398676g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f398677h;

    /* compiled from: RatingFormStepState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih0/c$a;", "", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C41404c(List list, boolean z12, C27195a c27195a, Map map, C40940b c40940b, Map map2, Integer num, int i12, C42822w c42822w) {
        this(list, z12, c27195a, map, c40940b, map2, (i12 & 64) != 0 ? null : num);
    }

    public static C41404c a(C41404c c41404c, ArrayList arrayList, boolean z12, C27195a c27195a, Map map, C40940b c40940b, LinkedHashMap linkedHashMap, Integer num, int i12) {
        List<TV0.a> list = (i12 & 1) != 0 ? c41404c.f398671b : arrayList;
        boolean z13 = (i12 & 2) != 0 ? c41404c.f398672c : z12;
        C27195a c27195a2 = (i12 & 4) != 0 ? c41404c.f398673d : c27195a;
        Map map2 = (i12 & 8) != 0 ? c41404c.f398674e : map;
        C40940b c40940b2 = (i12 & 16) != 0 ? c41404c.f398675f : c40940b;
        Map<FieldIdentifier, List<e>> map3 = (i12 & 32) != 0 ? c41404c.f398676g : linkedHashMap;
        Integer num2 = (i12 & 64) != 0 ? c41404c.f398677h : num;
        c41404c.getClass();
        return new C41404c(list, z13, c27195a2, map2, c40940b2, map3, num2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41404c)) {
            return false;
        }
        C41404c c41404c = (C41404c) obj;
        return L.f(this.f398671b, c41404c.f398671b) && this.f398672c == c41404c.f398672c && L.f(this.f398673d, c41404c.f398673d) && L.f(this.f398674e, c41404c.f398674e) && L.f(this.f398675f, c41404c.f398675f) && L.f(this.f398676g, c41404c.f398676g) && L.f(this.f398677h, c41404c.f398677h);
    }

    public final int hashCode() {
        int i12 = r.i(this.f398671b.hashCode() * 31, 31, this.f398672c);
        C27195a c27195a = this.f398673d;
        int iC2 = AK.c.c((i12 + (c27195a == null ? 0 : c27195a.hashCode())) * 31, 31, this.f398674e);
        C40940b c40940b = this.f398675f;
        int iC3 = AK.c.c((iC2 + (c40940b == null ? 0 : c40940b.hashCode())) * 31, 31, this.f398676g);
        Integer num = this.f398677h;
        return iC3 + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormStepState(items=");
        sb2.append(this.f398671b);
        sb2.append(", centerContent=");
        sb2.append(this.f398672c);
        sb2.append(", finishButton=");
        sb2.append(this.f398673d);
        sb2.append(", failedValidationList=");
        sb2.append(this.f398674e);
        sb2.append(", buttonsModel=");
        sb2.append(this.f398675f);
        sb2.append(", files=");
        sb2.append(this.f398676g);
        sb2.append(", positionToScroll=");
        return s.j(sb2, this.f398677h, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41404c(@k List<? extends TV0.a> list, boolean z12, @l C27195a c27195a, @k Map<FieldIdentifier, ValidationInfo> map, @l C40940b c40940b, @k Map<FieldIdentifier, ? extends List<e>> map2, @l Integer num) {
        this.f398671b = list;
        this.f398672c = z12;
        this.f398673d = c27195a;
        this.f398674e = map;
        this.f398675f = c40940b;
        this.f398676g = map2;
        this.f398677h = num;
    }
}
