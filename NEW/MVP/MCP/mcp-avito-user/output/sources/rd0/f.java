package RD0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1TariffLfPublicationLevelGetResponse.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LRD0/f;", "", "", "LRD0/c;", "features", "", "id", "", "isSelected", "LRD0/e;", "levelInfo", "LRD0/g;", "priceInfo", "", "title", "<init>", "(Ljava/util/List;JZLRD0/e;LRD0/g;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "J", "b", "()J", "Z", "f", "()Z", "LRD0/e;", "c", "()LRD0/e;", "LRD0/g;", "d", "()LRD0/g;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    @com.google.gson.annotations.c("features")
    @k
    private final List<c> features;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("isSelected")
    private final boolean isSelected;

    @com.google.gson.annotations.c("levelInfo")
    @k
    private final e levelInfo;

    @com.google.gson.annotations.c("priceInfo")
    @k
    private final g priceInfo;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public f(@k List<c> list, long j12, boolean z12, @k e eVar, @k g gVar, @k String str) {
        this.features = list;
        this.id = j12;
        this.isSelected = z12;
        this.levelInfo = eVar;
        this.priceInfo = gVar;
        this.title = str;
    }

    @k
    public final List<c> a() {
        return this.features;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final e getLevelInfo() {
        return this.levelInfo;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final g getPriceInfo() {
        return this.priceInfo;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
