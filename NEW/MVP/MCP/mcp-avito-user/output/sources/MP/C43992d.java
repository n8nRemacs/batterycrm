package mP;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiJobApplicationsListV3Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BK\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"LmP/d;", "", "", "", "badges", "name", "LmP/i;", "notes", "phone", "resumeId", ChannelContext.Item.USER_ID, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "getPhone", "d", "e", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mP.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C43992d {

    @com.google.gson.annotations.c("badges")
    @l
    private final List<String> badges;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("notes")
    @l
    private final List<C43997i> notes;

    @com.google.gson.annotations.c("phone")
    @l
    private final String phone;

    @com.google.gson.annotations.c("resumeId")
    @k
    private final String resumeId;

    @com.google.gson.annotations.c(ChannelContext.Item.USER_ID)
    @l
    private final String userId;

    public C43992d(@l List<String> list, @k String str, @l List<C43997i> list2, @l String str2, @k String str3, @l String str4) {
        this.badges = list;
        this.name = str;
        this.notes = list2;
        this.phone = str2;
        this.resumeId = str3;
        this.userId = str4;
    }

    @l
    public final List<String> a() {
        return this.badges;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    public final List<C43997i> c() {
        return this.notes;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getResumeId() {
        return this.resumeId;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }
}
