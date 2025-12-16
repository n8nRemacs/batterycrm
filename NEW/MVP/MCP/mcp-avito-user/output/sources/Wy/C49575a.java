package wY;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MasterPlanArgs.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwY/a;", "", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wY.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C49575a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Image f441538a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ArrayList<MasterPlanPin> f441539b;

    /* renamed from: c, reason: collision with root package name */
    public final float f441540c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final MasterPlanPin f441541d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f441542e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f441543f;

    public C49575a(@l Image image, @l ArrayList<MasterPlanPin> arrayList, float f12, @l MasterPlanPin masterPlanPin, @k String str, @k String str2) {
        this.f441538a = image;
        this.f441539b = arrayList;
        this.f441540c = f12;
        this.f441541d = masterPlanPin;
        this.f441542e = str;
        this.f441543f = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49575a)) {
            return false;
        }
        C49575a c49575a = (C49575a) obj;
        return L.f(this.f441538a, c49575a.f441538a) && L.f(this.f441539b, c49575a.f441539b) && Float.compare(this.f441540c, c49575a.f441540c) == 0 && L.f(this.f441541d, c49575a.f441541d) && L.f(this.f441542e, c49575a.f441542e) && L.f(this.f441543f, c49575a.f441543f);
    }

    public final int hashCode() {
        Image image = this.f441538a;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        ArrayList<MasterPlanPin> arrayList = this.f441539b;
        int iD2 = r.d(this.f441540c, (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31);
        MasterPlanPin masterPlanPin = this.f441541d;
        return this.f441543f.hashCode() + H.d((iD2 + (masterPlanPin != null ? masterPlanPin.hashCode() : 0)) * 31, 31, this.f441542e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MasterPlanArgs(image=");
        sb2.append(this.f441538a);
        sb2.append(", pins=");
        sb2.append(this.f441539b);
        sb2.append(", scroll=");
        sb2.append(this.f441540c);
        sb2.append(", selectedPin=");
        sb2.append(this.f441541d);
        sb2.append(", developmentId=");
        sb2.append(this.f441542e);
        sb2.append(", source=");
        return C22026a.c(sb2, this.f441543f, ')');
    }
}
