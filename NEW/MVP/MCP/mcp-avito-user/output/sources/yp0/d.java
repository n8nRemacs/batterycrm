package YP0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.work_profile.WorkProfileOpenParams;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WorkProfilePageSwitchAnalyticsSender.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYP0/d;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final WorkProfileOpenParams f19464a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f19465b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public WorkProfileTab f19466c;

    /* compiled from: WorkProfilePageSwitchAnalyticsSender.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19467a;

        static {
            int[] iArr = new int[WorkProfileTab.values().length];
            try {
                WorkProfileTab workProfileTab = WorkProfileTab.f330693d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WorkProfileTab workProfileTab2 = WorkProfileTab.f330693d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WorkProfileTab workProfileTab3 = WorkProfileTab.f330693d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                WorkProfileTab workProfileTab4 = WorkProfileTab.f330693d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19467a = iArr;
        }
    }

    @Inject
    public d(@k WorkProfileOpenParams workProfileOpenParams, @k InterfaceC28373a interfaceC28373a) {
        this.f19464a = workProfileOpenParams;
        this.f19465b = interfaceC28373a;
    }
}
