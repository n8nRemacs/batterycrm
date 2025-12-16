package zf0;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.publish.items.button.DeepLinkActionButtonItem;
import com.avito.android.publish.slots.verification.banner.VerificationBannerItem;
import com.avito.android.publish.slots.verification.title.VerificationTitleItem;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.verification.Banner;
import com.avito.android.remote.model.category_parameters.slot.verification.Button;
import com.avito.android.remote.model.category_parameters.slot.verification.VerificationSlot;
import com.avito.android.remote.model.category_parameters.slot.verification.VerificationSlotConfig;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzf0/b;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/verification/VerificationSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zf0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50559b extends k<VerificationSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VerificationSlot f444130b;

    public C50559b(@Y61.k VerificationSlot verificationSlot) {
        this.f444130b = verificationSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f444130b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        List<Button> buttons;
        ArrayList arrayList = new ArrayList();
        VerificationSlotConfig verificationSlotConfig = (VerificationSlotConfig) this.f444130b.getWidget().getConfig();
        if (O2.a(verificationSlotConfig.getButtons()) && (buttons = verificationSlotConfig.getButtons()) != null) {
            for (Button button : buttons) {
                arrayList.add(new DeepLinkActionButtonItem(button.getVerificationType(), button.getStyle(), button.getTitle(), button.getUri()));
            }
        }
        if (O2.a(verificationSlotConfig.getBanners())) {
            String title = verificationSlotConfig.getTitle();
            if (title != null) {
                arrayList.add(new VerificationTitleItem(title, title));
            }
            List<Banner> banners = verificationSlotConfig.getBanners();
            if (banners != null) {
                for (Banner banner : banners) {
                    arrayList.add(new VerificationBannerItem(banner.getImage(), banner.getTitle(), banner.getStatus(), banner.getTitle(), banner.getDescription()));
                }
            }
        }
        return arrayList;
    }
}
