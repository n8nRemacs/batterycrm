package iZ;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MessengerIcebreakerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LiZ/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iZ.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C41367c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f398559c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C41367c f398560d = new C41367c(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ArrayList f398561b;

    /* compiled from: MessengerIcebreakerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiZ/c$a;", "", "<init>", "()V", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iZ.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C41367c(@l ArrayList arrayList) {
        this.f398561b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41367c) && L.f(this.f398561b, ((C41367c) obj).f398561b);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f398561b;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("MessengerIcebreakerState(suggests="), this.f398561b, ')');
    }
}
