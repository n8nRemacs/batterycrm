package com.avito.android.user_adverts.tab_screens.adverts.domain;

import Yl0.C18278a;
import Yl0.C18279b;
import Yl0.C18280c;
import Yl0.C18281d;
import Yl0.C18284g;
import Yl0.C18285h;
import Yl0.C18286i;
import Yl0.C18290m;
import Yl0.U;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertCpxPromo;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertItemRightActionV2;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertStatus;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import com.avito.android.util.C35787f0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsListMapperV13.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-adverts_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    /* compiled from: UserAdvertsListMapperV13.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f314981a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f314982b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f314983c;

        static {
            int[] iArr = new int[UserAdvertStatus.Type.values().length];
            try {
                iArr[UserAdvertStatus.Type.Discount.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f314981a = iArr;
            int[] iArr2 = new int[UserAdvertCpxPromo.Color.values().length];
            try {
                iArr2[UserAdvertCpxPromo.Color.Gray.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[UserAdvertCpxPromo.Color.Red.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UserAdvertCpxPromo.Color.Yellow.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UserAdvertCpxPromo.Color.Green.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            f314982b = iArr2;
            int[] iArr3 = new int[UserAdvertItemRightActionV2.UserAdvertItemRightActionV2Button.Style.values().length];
            try {
                iArr3[UserAdvertItemRightActionV2.UserAdvertItemRightActionV2Button.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[UserAdvertItemRightActionV2.UserAdvertItemRightActionV2Button.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f314983c = iArr3;
        }
    }

    public static final Color a(String str) {
        Integer numA = C35787f0.a(str);
        if (numA != null) {
            return new Color(numA.intValue());
        }
        return null;
    }

    public static final UniversalColor b(C18290m c18290m) {
        String value = c18290m.getValue();
        Color colorA = value != null ? a(value) : null;
        String valueDark = c18290m.getValueDark();
        return new UniversalColor(c18290m.getValueName(), valueDark != null ? a(valueDark) : null, colorA);
    }

    public static final UserAdvertActionsInfoDomain.Config c(C18280c c18280c) {
        ArrayList arrayList;
        UserAdvertActionsInfoDomain.DialogInfo dialogInfo;
        ArrayList arrayList2;
        C18284g title = c18280c.getTitle();
        List<C18285h> listC = title.c();
        if (listC != null) {
            List<C18285h> list = listC;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (C18285h c18285h : list) {
                arrayList.add(new UserAdvertActionsInfoDomain.TextShortcutVariant(c18285h.getText(), c18285h.getMultiText(), C42745f0.P0(c18285h.c())));
            }
        } else {
            arrayList = null;
        }
        UserAdvertActionsInfoDomain.TextDescription textDescription = new UserAdvertActionsInfoDomain.TextDescription(title.getDefault(), title.getMultiDefault(), arrayList);
        C18281d dialogInfo2 = c18280c.getDialogInfo();
        if (dialogInfo2 != null) {
            String title2 = dialogInfo2.getTitle();
            boolean showAdvertCounter = dialogInfo2.getShowAdvertCounter();
            String primaryActionTitle = dialogInfo2.getPrimaryActionTitle();
            String secondaryActionTitle = dialogInfo2.getSecondaryActionTitle();
            C18278a description = dialogInfo2.getDescription();
            List<C18279b> listC2 = description.c();
            if (listC2 != null) {
                List<C18279b> list2 = listC2;
                arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (C18279b c18279b : list2) {
                    arrayList2.add(new UserAdvertActionsInfoDomain.AttributedShortcutVariant(c18279b.getText(), c18279b.getMultiText(), C42745f0.P0(c18279b.c())));
                }
            } else {
                arrayList2 = null;
            }
            dialogInfo = new UserAdvertActionsInfoDomain.DialogInfo(new UserAdvertActionsInfoDomain.AttributedDescription(description.getDefault(), description.getMultiDefault(), arrayList2), primaryActionTitle, secondaryActionTitle, showAdvertCounter, title2);
        } else {
            dialogInfo = null;
        }
        C18286i badge = c18280c.getBadge();
        return new UserAdvertActionsInfoDomain.Config(dialogInfo, textDescription, badge != null ? new UserAdvertActionsInfoDomain.BadgeInfo(badge.getText()) : null);
    }

    public static final UserAdvertItemDomain.Stats.Counters d(U u12) {
        Long total = u12.getTotal();
        int iLongValue = (int) (total != null ? total.longValue() : 0L);
        Long today = u12.getToday();
        return new UserAdvertItemDomain.Stats.Counters(iLongValue, today != null ? Integer.valueOf((int) today.longValue()) : null);
    }
}
