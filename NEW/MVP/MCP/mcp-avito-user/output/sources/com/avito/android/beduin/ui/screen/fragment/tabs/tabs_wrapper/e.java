package com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.shared.tabs.BeduinTabCounter;
import com.avito.android.util.y6;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TabsWrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/e;", "", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f104386a = a.f104387a;

    /* compiled from: TabsWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/e$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f104387a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f104388b = y6.b(24);
    }

    /* compiled from: TabsWrapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/e$b;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f104389a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f104390b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final BeduinTabCounter f104391c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f104392d;

        public b(@k String str, @k String str2, @l BeduinTabCounter beduinTabCounter, boolean z12) {
            this.f104389a = str;
            this.f104390b = str2;
            this.f104391c = beduinTabCounter;
            this.f104392d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f104389a, bVar.f104389a) && L.f(this.f104390b, bVar.f104390b) && L.f(this.f104391c, bVar.f104391c) && this.f104392d == bVar.f104392d;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f104389a.hashCode() * 31, 31, this.f104390b);
            BeduinTabCounter beduinTabCounter = this.f104391c;
            return Boolean.hashCode(this.f104392d) + ((iD2 + (beduinTabCounter == null ? 0 : beduinTabCounter.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Tab(id=");
            sb2.append(this.f104389a);
            sb2.append(", title=");
            sb2.append(this.f104390b);
            sb2.append(", counter=");
            sb2.append(this.f104391c);
            sb2.append(", isEnabled=");
            return r.x(sb2, this.f104392d, ')');
        }
    }

    void a(@k Y41.l<? super String, G0> lVar);

    void b(@k ArrayList arrayList);

    void c(@k String str);

    @k
    View getView();
}
