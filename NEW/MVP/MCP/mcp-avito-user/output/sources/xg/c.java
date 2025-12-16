package XG;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig.status_doc_public.generated.api.get_medical_status.GetMedicalStatusRespAction;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetMedicalStatusResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LXG/c;", "", "", "Lcom/avito/android/gig/status_doc_public/generated/api/get_medical_status/GetMedicalStatusRespAction;", "actions", "LXG/b;", "additionalInfo", "LXG/d;", "image", "mainInfo", "LXG/a;", "openEvent", "Lcom/avito/android/deep_linking/links/DeepLink;", "supportDeeplink", "<init>", "(Ljava/util/List;LXG/b;LXG/d;LXG/b;LXG/a;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LXG/b;", "b", "()LXG/b;", "LXG/d;", "c", "()LXG/d;", "d", "LXG/a;", "e", "()LXG/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "f", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_gig_status-doc_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    @com.google.gson.annotations.c("actions")
    @k
    private final List<GetMedicalStatusRespAction> actions;

    @com.google.gson.annotations.c("additional_info")
    @l
    private final b additionalInfo;

    @com.google.gson.annotations.c("image")
    @l
    private final d image;

    @com.google.gson.annotations.c("main_info")
    @k
    private final b mainInfo;

    @com.google.gson.annotations.c("open_event")
    @k
    private final a openEvent;

    @com.google.gson.annotations.c("supportDeeplink")
    @l
    private final DeepLink supportDeeplink;

    public c(@k List<GetMedicalStatusRespAction> list, @l b bVar, @l d dVar, @k b bVar2, @k a aVar, @l DeepLink deepLink) {
        this.actions = list;
        this.additionalInfo = bVar;
        this.image = dVar;
        this.mainInfo = bVar2;
        this.openEvent = aVar;
        this.supportDeeplink = deepLink;
    }

    @k
    public final List<GetMedicalStatusRespAction> a() {
        return this.actions;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final b getAdditionalInfo() {
        return this.additionalInfo;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final d getImage() {
        return this.image;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final b getMainInfo() {
        return this.mainInfo;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final a getOpenEvent() {
        return this.openEvent;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final DeepLink getSupportDeeplink() {
        return this.supportDeeplink;
    }
}
