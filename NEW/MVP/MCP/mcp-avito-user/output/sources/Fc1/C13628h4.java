package Fc1;

import feedback.shared.sdk.api.network.entities.CampaignInfo;
import feedback.shared.sdk.api.network.entities.CampaignPagesResult;
import feedback.shared.sdk.api.network.entities.Page;
import feedback.shared.sdk.api.network.entities.PageResult;
import feedback.shared.sdk.api.network.entities.PageType;
import java.util.Iterator;
import kotlin.collections.C42745f0;

/* renamed from: Fc1.h4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13628h4 implements InterfaceC13715r2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13780y4 f5551b;

    /* renamed from: Fc1.h4$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5552a;

        static {
            int[] iArr = new int[PageType.values().length];
            try {
                iArr[PageType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PageType.LAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5552a = iArr;
        }
    }

    public C13628h4(C13780y4 c13780y4) {
        this.f5551b = c13780y4;
    }

    @Override // Fc1.InterfaceC13715r2
    public final void a(@Y61.k AbstractC13717r4 abstractC13717r4) {
        G0 g02 = this.f5551b.f5904e;
        if (g02 == null) {
            g02 = null;
        }
        g02.a(abstractC13717r4);
    }

    @Override // Fc1.InterfaceC13715r2
    public final void b(@Y61.k String str, @Y61.k PageResult pageResult) {
        C13780y4 c13780y4 = this.f5551b;
        CampaignPagesResult campaignPagesResult = c13780y4.f5903d;
        if (campaignPagesResult == null) {
            campaignPagesResult = null;
        }
        campaignPagesResult.append(pageResult);
        U7 u72 = c13780y4.f5902c;
        if (u72 == null) {
            u72 = null;
        }
        int i12 = a.f5552a[u72.a().getType().ordinal()];
        if (i12 == 1) {
            int close = pageResult.getClose();
            int i13 = kotlin.jvm.internal.J.f406821a;
            if (close != 1) {
                U7 u73 = c13780y4.f5902c;
                if (u73 == null) {
                    u73 = null;
                }
                u73.getClass();
                kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
                if (str.equals("")) {
                    u73.f5239b++;
                } else {
                    Iterator<Page> it = u73.f5238a.iterator();
                    int i14 = 0;
                    while (it.hasNext()) {
                        Page next = it.next();
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        if (kotlin.jvm.internal.L.f(next.getId(), str)) {
                            u73.f5239b = i14;
                        }
                        i14 = i15;
                    }
                }
                InterfaceC13706q1 interfaceC13706q1 = c13780y4.f5900a;
                if (interfaceC13706q1 == null) {
                    interfaceC13706q1 = null;
                }
                U7 u74 = c13780y4.f5902c;
                if (u74 == null) {
                    u74 = null;
                }
                interfaceC13706q1.a(u74.f5239b);
                InterfaceC13706q1 interfaceC13706q12 = c13780y4.f5900a;
                (interfaceC13706q12 != null ? interfaceC13706q12 : null).show();
                return;
            }
        } else if (i12 != 2) {
            return;
        }
        G0 g02 = c13780y4.f5904e;
        if (g02 == null) {
            g02 = null;
        }
        CampaignPagesResult campaignPagesResult2 = c13780y4.f5903d;
        if (campaignPagesResult2 == null) {
            campaignPagesResult2 = null;
        }
        CampaignInfo campaignInfo = c13780y4.f5901b;
        g02.b(campaignPagesResult2, campaignInfo != null ? campaignInfo : null, this.f5550a);
    }

    @Override // Fc1.InterfaceC13715r2
    public final void a() {
        this.f5550a = true;
        InterfaceC13706q1 interfaceC13706q1 = this.f5551b.f5900a;
        if (interfaceC13706q1 == null) {
            interfaceC13706q1 = null;
        }
        interfaceC13706q1.cancel();
    }
}
