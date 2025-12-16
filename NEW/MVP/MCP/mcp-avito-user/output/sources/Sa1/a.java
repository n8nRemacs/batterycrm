package Sa1;

import V11.d;
import Y61.k;
import Y61.l;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes9.dex */
public final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f15087b;

    public a(@l Boolean bool) {
        super("CheckAppCanShowNotificationEvent");
        this.f15087b = bool;
    }

    @Override // V11.d
    @k
    public final Map<String, String> a() {
        String string;
        Boolean bool = this.f15087b;
        if (bool == null || (string = bool.toString()) == null) {
            string = "null";
        }
        return Collections.singletonMap("is_app_can_show_notification", string);
    }
}
