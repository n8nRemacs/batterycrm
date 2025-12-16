package Fc1;

import android.database.Cursor;
import feedback.shared.sdk.api.network.entities.Campaign;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "feedback.shared.sdk.api.db.CampaignsDbApi$findCampaignCandidates$1", f = "CampaignsDbApi.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class E1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f4895q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U1 f4896r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f4897s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C13650k f4898t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(U1 u12, String str, C13650k c13650k, Continuation continuation) {
        super(2, continuation);
        this.f4896r = u12;
        this.f4897s = str;
        this.f4898t = c13650k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new E1(this.f4896r, this.f4897s, this.f4898t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((E1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f4895q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ArrayList arrayList = new ArrayList();
            U1 u12 = this.f4896r;
            String str = this.f4897s;
            Cursor cursorQuery = u12.f5209a.getReadableDatabase().query("CAMPAIGNS_LIST", new String[]{"CAMPAIGN_ID", "CAMPAIGN_PRIORITY", "CAMPAIGN_DATA"}, "CAMPAIGN_EVENT_NAME = ?", new String[]{str}, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(Campaign.INSTANCE.parseJson(cursorQuery.getInt(0), cursorQuery.getInt(1), cursorQuery.getString(2)));
                } finally {
                }
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            kotlin.io.c.a(cursorQuery, null);
            boolean zIsEmpty = arrayList.isEmpty();
            C13611f5 c13611f5 = u12.f5210b;
            if (zIsEmpty) {
                c13611f5.c(xyz.n.a.j2.CAMPAIGN_NOT_FOUND, str);
            } else {
                c13611f5.c(xyz.n.a.j2.CAMPAIGN_FOUND_CANDIDATES, String.valueOf(arrayList.size()));
            }
            this.f4895q = 1;
            if (this.f4898t.invoke(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
