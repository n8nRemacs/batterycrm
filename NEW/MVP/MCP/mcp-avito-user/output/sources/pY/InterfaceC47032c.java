package pY;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: MasterPlanAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpY/c;", "", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC47032c {

    /* compiled from: MasterPlanAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pY.c$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC47032c interfaceC47032c, String str, String str2, String str3, int i12) {
            if ((i12 & 2) != 0) {
                str2 = null;
            }
            if ((i12 & 4) != 0) {
                str3 = null;
            }
            interfaceC47032c.a(str, str2, str3);
        }
    }

    void a(@k String str, @l String str2, @l String str3);

    void b(@k String str);
}
