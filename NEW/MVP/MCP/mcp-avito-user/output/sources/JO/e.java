package JO;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.image.ImageSlotConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImageItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJO/e;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f8946b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UniversalImage f8947c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ImageSlotConfig.ContentInsets f8948d;

    public e(@Y61.k String str, @Y61.k UniversalImage universalImage, @Y61.l ImageSlotConfig.ContentInsets contentInsets) {
        this.f8946b = str;
        this.f8947c = universalImage;
        this.f8948d = contentInsets;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f8946b, eVar.f8946b) && L.f(this.f8947c, eVar.f8947c) && L.f(this.f8948d, eVar.f8948d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return getF228126b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF228126b() {
        return this.f8946b;
    }

    public final int hashCode() {
        int iA2 = com.avito.android.actions_sheet.a.a(this.f8946b.hashCode() * 31, 31, this.f8947c);
        ImageSlotConfig.ContentInsets contentInsets = this.f8948d;
        return iA2 + (contentInsets == null ? 0 : contentInsets.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ImageItem(stringId=" + this.f8946b + ", universalImage=" + this.f8947c + ", contentInsets=" + this.f8948d + ')';
    }
}
