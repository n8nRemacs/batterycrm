package Kj;

import androidx.compose.runtime.internal.P;
import com.avito.android.blueprints.publish.infomation.item.DisclaimerItem;
import com.avito.android.category_parameters.k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlot;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.information.TextStyle;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: InformationSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LKj/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/information/InformationSlot;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14319a extends k<InformationSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InformationSlot f9641b;

    public C14319a(@Y61.k InformationSlot informationSlot) {
        this.f9641b = informationSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f9641b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<DisclaimerItem> j() {
        InformationSlot informationSlot = this.f9641b;
        String id2 = informationSlot.getId();
        AttributedText text = ((InformationSlotConfig) informationSlot.getWidget().getConfig()).getText();
        AttributedText subtitle = ((InformationSlotConfig) informationSlot.getWidget().getConfig()).getSubtitle();
        TextStyle style = ((InformationSlotConfig) informationSlot.getWidget().getConfig()).getStyle();
        if (style == null) {
            style = TextStyle.DEFAULT;
        }
        return Collections.singletonList(new DisclaimerItem(id2, text, subtitle, style, ((InformationSlotConfig) informationSlot.getWidget().getConfig()).getImage(), ((InformationSlotConfig) informationSlot.getWidget().getConfig()).getTopMargin(), ((InformationSlotConfig) informationSlot.getWidget().getConfig()).getTextStartMargin()));
    }
}
