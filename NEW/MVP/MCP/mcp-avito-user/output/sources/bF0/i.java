package bf0;

import JO.m;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ContactMethodSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final List<String> f57340a = C42745f0.U(NotificationsSettings.Section.SECTION_MESSENGER, "phone", "any");

    public static final boolean a(SelectParameter.Flat flat, String... strArr) {
        for (String str : strArr) {
            SelectParameter.Value selectedValue = flat.getSelectedValue();
            if (L.f(str, selectedValue != null ? selectedValue.getId() : null)) {
                return true;
            }
        }
        return false;
    }

    public static final m b(SelectParameter.Value value, boolean z12) {
        SelectParameter.Value.Widget.Config config;
        SelectParameter.Value.Widget.Config.Hint hint;
        Color color;
        String id2 = value.getId();
        String title = value.getTitle();
        SelectParameter.Value.Display display = value.getDisplay();
        Integer numValueOf = (display == null || (color = display.getColor()) == null) ? null : Integer.valueOf(color.getValue());
        SelectParameter.Value.Display display2 = value.getDisplay();
        String icon = display2 != null ? display2.getIcon() : null;
        SelectParameter.Value.Widget widget = value.getWidget();
        return new m(id2, title, null, z12, numValueOf, (widget == null || (config = widget.getConfig()) == null || (hint = config.getHint()) == null) ? null : hint.getDeepLink(), icon, value.getIsDisabled(), null, null, false, null, null, null, null, null, 65284, null);
    }
}
