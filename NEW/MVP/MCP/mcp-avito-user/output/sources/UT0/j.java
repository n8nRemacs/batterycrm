package Ut0;

import Y61.l;
import com.avito.android.remote.model.ParcelableEntity;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ServiceBookingWorkHoursMviState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/j;", "Lcom/avito/conveyor_item/a;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class j implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16758b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f16759c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ParcelableEntity<String> f16760d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<ParcelableEntity<String>> f16761e;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k String str, @l String str2, @l ParcelableEntity<String> parcelableEntity, @Y61.k List<? extends ParcelableEntity<String>> list) {
        this.f16758b = str;
        this.f16759c = str2;
        this.f16760d = parcelableEntity;
        this.f16761e = list;
    }

    @Y61.k
    public List<ParcelableEntity<String>> a() {
        return this.f16761e;
    }

    @l
    public ParcelableEntity<String> b() {
        return this.f16760d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322716b() {
        return getF16758b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public String getF16758b() {
        return this.f16758b;
    }

    @l
    /* renamed from: getTitle, reason: from getter */
    public String getF16759c() {
        return this.f16759c;
    }
}
