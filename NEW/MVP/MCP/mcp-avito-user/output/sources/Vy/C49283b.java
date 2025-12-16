package vY;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MasterPlanState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvY/b;", "", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C49283b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Image f440832a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ArrayList<MasterPlanPin> f440833b;

    /* renamed from: c, reason: collision with root package name */
    public final float f440834c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final MasterPlanPin f440835d;

    public C49283b(@k Image image, @l ArrayList<MasterPlanPin> arrayList, float f12, @k MasterPlanPin masterPlanPin) {
        this.f440832a = image;
        this.f440833b = arrayList;
        this.f440834c = f12;
        this.f440835d = masterPlanPin;
    }

    public static C49283b a(C49283b c49283b, MasterPlanPin masterPlanPin) {
        Image image = c49283b.f440832a;
        ArrayList<MasterPlanPin> arrayList = c49283b.f440833b;
        float f12 = c49283b.f440834c;
        c49283b.getClass();
        return new C49283b(image, arrayList, f12, masterPlanPin);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49283b)) {
            return false;
        }
        C49283b c49283b = (C49283b) obj;
        return L.f(this.f440832a, c49283b.f440832a) && L.f(this.f440833b, c49283b.f440833b) && Float.compare(this.f440834c, c49283b.f440834c) == 0 && L.f(this.f440835d, c49283b.f440835d);
    }

    public final int hashCode() {
        int iHashCode = this.f440832a.hashCode() * 31;
        ArrayList<MasterPlanPin> arrayList = this.f440833b;
        return this.f440835d.hashCode() + r.d(this.f440834c, (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        return "MasterPlanData(image=" + this.f440832a + ", pins=" + this.f440833b + ", scroll=" + this.f440834c + ", selectedPin=" + this.f440835d + ')';
    }
}
