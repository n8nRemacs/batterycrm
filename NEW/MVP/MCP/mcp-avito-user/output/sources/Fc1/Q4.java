package Fc1;

import feedback.shared.sdk.api.network.entities.CampaignType;

@h31.h
/* loaded from: classes9.dex */
public final class Q4 {

    @h31.h
    public static abstract class a {
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5156a;

        static {
            int[] iArr = new int[CampaignType.values().length];
            try {
                iArr[CampaignType.POPUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CampaignType.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5156a = iArr;
        }
    }
}
