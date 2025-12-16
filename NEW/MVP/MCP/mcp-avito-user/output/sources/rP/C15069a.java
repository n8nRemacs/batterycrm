package Rp;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.EntryPointParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalApplicationListPostResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LRp/a;", "", "", "LRp/f;", "applications", "Lcom/avito/android/deep_linking/links/DeepLink;", EntryPointParameter.TYPE, "LRp/e;", "paging", "<init>", "(Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;LRp/e;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LRp/e;", "c", "()LRp/e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15069a {

    @com.google.gson.annotations.c("applications")
    @k
    private final List<f> applications;

    @com.google.gson.annotations.c(EntryPointParameter.TYPE)
    @k
    private final DeepLink entryPoint;

    @com.google.gson.annotations.c("paging")
    @k
    private final e paging;

    public C15069a(@k List<f> list, @k DeepLink deepLink, @k e eVar) {
        this.applications = list;
        this.entryPoint = deepLink;
        this.paging = eVar;
    }

    @k
    public final List<f> a() {
        return this.applications;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getEntryPoint() {
        return this.entryPoint;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final e getPaging() {
        return this.paging;
    }
}
