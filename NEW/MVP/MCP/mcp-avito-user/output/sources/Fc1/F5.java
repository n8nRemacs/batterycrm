package Fc1;

import feedback.shared.sdk.api.network.entities.CampaignInfo;
import feedback.shared.sdk.api.network.entities.CampaignType;
import feedback.shared.sdk.api.network.entities.Page;
import feedback.shared.sdk.api.network.entities.Privacy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class F5 implements Y5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CampaignInfo f4955a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4956a;

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
            f4956a = iArr;
        }
    }

    public F5(CampaignInfo campaignInfo) {
        this.f4955a = campaignInfo;
    }

    @Override // Fc1.Y5
    @Y61.k
    public final int a() {
        int i12 = a.f4956a[this.f4955a.getType().ordinal()];
        int i13 = 1;
        if (i12 != 1) {
            i13 = 2;
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i13;
    }

    @Override // Fc1.Y5
    @Y61.l
    public final I6 b() {
        Privacy privacy = this.f4955a.getPrivacy();
        if (privacy != null) {
            return new C13711q6(privacy);
        }
        return null;
    }

    @Override // Fc1.Y5
    @Y61.k
    public final List<InterfaceC13680n2> c() {
        List<Page> pages = this.f4955a.getPages();
        ArrayList arrayList = new ArrayList(C42745f0.q(pages, 10));
        Iterator<T> it = pages.iterator();
        while (it.hasNext()) {
            arrayList.add(new Y1((Page) it.next()));
        }
        return arrayList;
    }

    @Override // Fc1.Y5
    public final boolean d() {
        Boolean progress = this.f4955a.getProgress();
        if (progress != null) {
            return progress.booleanValue();
        }
        return false;
    }
}
