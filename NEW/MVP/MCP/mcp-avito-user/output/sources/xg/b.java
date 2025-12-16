package XG;

import Y61.k;
import Y61.l;
import com.avito.android.gig.status_doc_public.generated.api.get_medical_status.GetMedicalStatusRespAction;
import kotlin.Metadata;

/* compiled from: GetMedicalStatusResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LXG/b;", "", "Lcom/avito/android/gig/status_doc_public/generated/api/get_medical_status/GetMedicalStatusRespAction;", "action", "", "description", "title", "<init>", "(Lcom/avito/android/gig/status_doc_public/generated/api/get_medical_status/GetMedicalStatusRespAction;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/gig/status_doc_public/generated/api/get_medical_status/GetMedicalStatusRespAction;", "a", "()Lcom/avito/android/gig/status_doc_public/generated/api/get_medical_status/GetMedicalStatusRespAction;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_gig_status-doc_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {

    @com.google.gson.annotations.c("action")
    @l
    private final GetMedicalStatusRespAction action;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public b(@l GetMedicalStatusRespAction getMedicalStatusRespAction, @k String str, @k String str2) {
        this.action = getMedicalStatusRespAction;
        this.description = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final GetMedicalStatusRespAction getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
