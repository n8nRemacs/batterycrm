package nN0;

import Y61.k;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1VideoRequirementsGetResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LnN0/b;", "", "", "LnN0/c;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nN0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44297b {

    @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @k
    private final List<C44298c> parameters;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C44297b(@k List<C44298c> list, @k String str) {
        this.parameters = list;
        this.title = str;
    }

    @k
    public final List<C44298c> a() {
        return this.parameters;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
