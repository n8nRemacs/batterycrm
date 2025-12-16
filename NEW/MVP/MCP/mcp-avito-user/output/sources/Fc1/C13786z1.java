package Fc1;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import feedback.shared.sdk.api.network.entities.Answer;
import feedback.shared.sdk.api.network.entities.CampaignPagesResult;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42756l;
import kotlin.text.C43047d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Fc1.z1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13786z1 extends AbstractC13777y1<Answer> {

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final CampaignPagesResult f5916t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5917u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5918v;

    public C13786z1(@Y61.k CampaignPagesResult campaignPagesResult, @Y61.k String str, @Y61.k kotlinx.coroutines.r rVar) {
        super(1, str, rVar);
        this.f5916t = campaignPagesResult;
        this.f5917u = C42727D.c(Q0.f5153l);
        this.f5918v = C42727D.c(C13625h1.f5540l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00eb, code lost:
    
        r0 = ((java.net.Inet4Address) r0).getHostAddress();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f1, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0144 A[PHI: r14
  0x0144: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v19 java.lang.String), (r14v20 java.lang.String) binds: [B:36:0x0126, B:45:0x014c, B:41:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033e A[LOOP:5: B:90:0x0338->B:92:0x033e, LOOP_END] */
    @Override // com.android.volley.Request
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] e() throws org.json.JSONException, java.net.SocketException {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.C13786z1.e():byte[]");
    }

    @Override // Fc1.AbstractC13777y1, com.android.volley.Request
    @Y61.k
    public final Map<String, String> i() {
        CampaignPagesResult campaignPagesResult = this.f5916t;
        byte[] bArrW = C42756l.W(C42756l.W(ByteBuffer.allocate(8).putLong(campaignPagesResult.getCreatedAtClient().getTime()).array(), ByteBuffer.allocate(4).putInt(campaignPagesResult.getCampaignId()).array()), C13688o1.a((Context) this.f5917u.getValue()).getBytes(C43047d.f410589b));
        Map<String, String> mapI = super.i();
        ((HashMap) mapI).put("Idempotency-Key", UUID.nameUUIDFromBytes(bArrW).toString());
        return mapI;
    }

    @Override // Fc1.AbstractC13777y1
    public final Answer o(String str) throws JSONException {
        ((r) this.f5918v.getValue()).getClass();
        JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
        return new Answer(jSONObject.getString("answerId"), jSONObject.getString("message"), jSONObject.getInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT));
    }
}
