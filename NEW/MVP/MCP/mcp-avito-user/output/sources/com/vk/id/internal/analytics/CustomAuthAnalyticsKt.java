package com.vk.id.internal.analytics;

import Y61.k;
import Y61.l;
import com.vk.id.OAuth;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CustomAuthAnalytics.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toAnalyticsParam", "", "Lcom/vk/id/OAuth;", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomAuthAnalyticsKt {

    /* compiled from: CustomAuthAnalytics.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OAuth.values().length];
            try {
                iArr[OAuth.f366766VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OAuth.MAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OAuth.f366765OK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @k
    public static final String toAnalyticsParam(@l OAuth oAuth) {
        int i12 = oAuth == null ? -1 : WhenMappings.$EnumSwitchMapping$0[oAuth.ordinal()];
        if (i12 == -1) {
            return "";
        }
        if (i12 == 1) {
            return "vk";
        }
        if (i12 == 2) {
            return "mail_ru";
        }
        if (i12 == 3) {
            return "ok_ru";
        }
        throw new NoWhenBranchMatchedException();
    }
}
