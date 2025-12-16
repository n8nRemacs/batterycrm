package Fc1;

import android.content.SharedPreferences;
import feedback.shared.sdk.api.network.entities.GetCampaignsResponse;
import java.util.HashMap;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;

/* renamed from: Fc1.w4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13762w4 extends AbstractC13777y1<GetCampaignsResponse> {

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5872t;

    public C13762w4(@Y61.k String str, @Y61.k kotlinx.coroutines.r rVar) {
        super(0, str, rVar);
        this.f5872t = C42727D.c(C13610f4.f5504l);
    }

    @Override // Fc1.AbstractC13777y1, com.android.volley.Request
    @Y61.k
    public final Map<String, String> i() {
        Map<String, String> mapI = super.i();
        SharedPreferences sharedPreferences = (SharedPreferences) ((S5) this.f5872t.getValue()).f5178b.getValue();
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        String string = sharedPreferences.getString("FEEDBACK_CAMPAIGN_VALIDATION_KEY", "");
        ((HashMap) mapI).put("X-State", string != null ? string : "");
        return mapI;
    }

    @Override // Fc1.AbstractC13777y1
    public final GetCampaignsResponse o(String str) {
        return GetCampaignsResponse.INSTANCE.parseJson(str);
    }

    @Override // Fc1.AbstractC13777y1
    public final void p(@Y61.k Map<String, String> map) {
        String str = map.get("X-State");
        if (str != null) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) ((S5) this.f5872t.getValue()).f5178b.getValue()).edit();
            editorEdit.putString("FEEDBACK_CAMPAIGN_VALIDATION_KEY", str);
            editorEdit.apply();
        }
    }
}
