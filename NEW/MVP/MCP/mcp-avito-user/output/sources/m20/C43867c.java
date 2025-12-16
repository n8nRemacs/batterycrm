package m20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage_invite.lead.mvi.entity.LeadType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ApplicationLeadAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm20/c;", "Lm20/b;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m20.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C43867c implements InterfaceC43866b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f414271a;

    /* compiled from: ApplicationLeadAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m20.c$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LeadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LeadType leadType = LeadType.f205910b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public C43867c(@k InterfaceC28373a interfaceC28373a) {
        this.f414271a = interfaceC28373a;
    }

    @Override // m20.InterfaceC43866b
    public final void a(@l String str, @l String str2) {
        this.f414271a.c(new f(str, str2));
    }

    @Override // m20.InterfaceC43866b
    public final void b(@k LeadType leadType) {
        String str;
        int iOrdinal = leadType.ordinal();
        if (iOrdinal == 0) {
            str = "borrower";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "agent";
        }
        this.f414271a.c(new C43865a(str));
    }

    @Override // m20.InterfaceC43866b
    public final void c(@k LeadType leadType, @l String str) {
        String str2;
        int iOrdinal = leadType.ordinal();
        if (iOrdinal == 0) {
            str2 = "borrower";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "agent";
        }
        this.f414271a.c(new e(str2, str));
    }
}
