package Ti0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1ReferrerSuggestContactsPostResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LTi0/a;", "", "", "cacheTTL", "", "LTi0/d;", "contacts", "LTi0/e;", ChannelContext.Item.PLACEHOLDER, "LTi0/f;", "share", "<init>", "(Ljava/lang/Long;Ljava/util/List;LTi0/e;LTi0/f;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LTi0/e;", "c", "()LTi0/e;", "LTi0/f;", "d", "()LTi0/f;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ti0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15366a {

    @com.google.gson.annotations.c("cacheTTL")
    @l
    private final Long cacheTTL;

    @com.google.gson.annotations.c("contacts")
    @k
    private final List<d> contacts;

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final e placeholder;

    @com.google.gson.annotations.c("share")
    @k
    private final f share;

    public C15366a(@l Long l12, @k List<d> list, @l e eVar, @k f fVar) {
        this.cacheTTL = l12;
        this.contacts = list;
        this.placeholder = eVar;
        this.share = fVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Long getCacheTTL() {
        return this.cacheTTL;
    }

    @k
    public final List<d> b() {
        return this.contacts;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final e getPlaceholder() {
        return this.placeholder;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final f getShare() {
        return this.share;
    }
}
