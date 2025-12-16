package com.avito.android.loyalty.ui.badge_details;

import androidx.compose.runtime.internal.P;
import cX.C27117c;
import cX.InterfaceC27115a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeDetailsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details/e;", "", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {
    @Inject
    public e() {
    }

    public static com.avito.conveyor_item.a a(InterfaceC27115a interfaceC27115a) {
        if (interfaceC27115a instanceof cX.e) {
            Integer height = ((cX.e) interfaceC27115a).getHeight();
            if (height == null) {
                return null;
            }
            return new com.avito.android.loyalty.ui.items.spacer.a(UUID.randomUUID().toString(), y6.b(height.intValue()));
        }
        if (!(interfaceC27115a instanceof C27117c)) {
            if (interfaceC27115a instanceof cX.f) {
                AttributedText attributedText = ((cX.f) interfaceC27115a).f57917a;
                if (attributedText != null) {
                    return new com.avito.android.loyalty.ui.items.attributed_text.a(UUID.randomUUID().toString(), attributedText);
                }
                return null;
            }
            if (!(interfaceC27115a instanceof cX.d)) {
                throw new NoWhenBranchMatchedException();
            }
            UniversalImage universalImage = ((cX.d) interfaceC27115a).f57916a;
            if (universalImage != null) {
                return new com.avito.android.loyalty.ui.items.image.a(UUID.randomUUID().toString(), y6.b(143), y6.b(143), universalImage);
            }
            return null;
        }
        C27117c c27117c = (C27117c) interfaceC27115a;
        String string = UUID.randomUUID().toString();
        String title = c27117c.getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        List<InterfaceC27115a> listA = c27117c.a();
        if (listA == null) {
            listA = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVarA = a((InterfaceC27115a) it.next());
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return new com.avito.android.loyalty.ui.items.collapse.a(string, str, false, arrayList, 4, null);
    }
}
