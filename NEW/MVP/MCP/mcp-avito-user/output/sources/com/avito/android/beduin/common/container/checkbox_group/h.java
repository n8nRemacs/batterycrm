package com.avito.android.beduin.common.container.checkbox_group;

import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxGroupPayload.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/h;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class h {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f102983d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final List<String> f102984a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<BeduinAction> f102985b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f102986c;

    /* compiled from: BeduinCheckboxGroupPayload.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/h$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Y61.l List<String> list, @Y61.l List<? extends BeduinAction> list2) {
        this.f102984a = list;
        this.f102985b = list2;
        this.f102986c = list == null && list2 == 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f102984a, hVar.f102984a) && L.f(this.f102985b, hVar.f102985b);
    }

    public final int hashCode() {
        List<String> list = this.f102984a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<BeduinAction> list2 = this.f102985b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinCheckboxGroupPayload(selectedOptionIds=");
        sb2.append(this.f102984a);
        sb2.append(", onSelectedActions=");
        return H.p(sb2, this.f102985b, ')');
    }
}
