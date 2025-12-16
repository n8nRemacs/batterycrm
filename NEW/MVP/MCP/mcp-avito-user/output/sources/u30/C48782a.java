package u30;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiNewCarsFilterBrandsResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lu30/a;", "", "", ChannelContext.Item.PLACEHOLDER, "", "Lu30/b;", "sections", "title", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "getPlaceholder", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "getTitle", "_avito_new-cars-mark-model-filter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u30.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48782a {

    @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @com.google.gson.annotations.c("sections")
    @k
    private final List<C48783b> sections;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C48782a(@l String str, @k List<C48783b> list, @l String str2) {
        this.placeholder = str;
        this.sections = list;
        this.title = str2;
    }

    @k
    public final List<C48783b> a() {
        return this.sections;
    }
}
