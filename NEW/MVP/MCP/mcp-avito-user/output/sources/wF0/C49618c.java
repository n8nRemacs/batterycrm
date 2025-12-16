package wf0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SleepingPlacesState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lwf0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C49618c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f441725g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C49618c f441726h;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f441727b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f441728c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<SleepingPlacesBedType> f441729d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f441730e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final d f441731f;

    /* compiled from: SleepingPlacesState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwf0/c$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wf0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        d.f441732d.getClass();
        f441726h = new C49618c(null, null, c42784z0, false, d.f441733e);
    }

    public C49618c(@l Integer num, @l String str, @k List<SleepingPlacesBedType> list, boolean z12, @k d dVar) {
        this.f441727b = num;
        this.f441728c = str;
        this.f441729d = list;
        this.f441730e = z12;
        this.f441731f = dVar;
    }

    public static C49618c a(C49618c c49618c, Integer num, String str, List list, boolean z12, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            num = c49618c.f441727b;
        }
        Integer num2 = num;
        if ((i12 & 2) != 0) {
            str = c49618c.f441728c;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            list = c49618c.f441729d;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            z12 = c49618c.f441730e;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            dVar = c49618c.f441731f;
        }
        c49618c.getClass();
        return new C49618c(num2, str2, list2, z13, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49618c)) {
            return false;
        }
        C49618c c49618c = (C49618c) obj;
        return L.f(this.f441727b, c49618c.f441727b) && L.f(this.f441728c, c49618c.f441728c) && L.f(this.f441729d, c49618c.f441729d) && this.f441730e == c49618c.f441730e && L.f(this.f441731f, c49618c.f441731f);
    }

    public final int hashCode() {
        Integer num = this.f441727b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f441728c;
        return this.f441731f.hashCode() + r.i(H.e((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f441729d), 31, this.f441730e);
    }

    @k
    public final String toString() {
        return "SleepingPlacesState(selectedSleepingPlaceId=" + this.f441727b + ", subtitle=" + this.f441728c + ", sleepingPlacesListInfo=" + this.f441729d + ", chooseButtonEnabled=" + this.f441730e + ", viewState=" + this.f441731f + ')';
    }
}
