package cD0;

import com.avito.android.tariff_lf.remote.model.TariffPriceSegment;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TariffPackageInfo.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"LcD0/l;", "", "", "packageTitle", "packageSubtitle", "LYB0/c;", "bar", "", "LcD0/m;", "infoList", "Lcom/avito/android/tariff_lf/remote/model/TariffPriceSegment;", "priceSegments", "<init>", "(Ljava/lang/String;Ljava/lang/String;LYB0/c;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "LYB0/c;", "a", "()LYB0/c;", "Ljava/util/List;", "b", "()Ljava/util/List;", "e", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cD0.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C27018l {

    @com.google.gson.annotations.c("bar")
    @Y61.l
    private final YB0.c bar;

    @com.google.gson.annotations.c("infoList")
    @Y61.k
    private final List<C27019m> infoList;

    @com.google.gson.annotations.c("packageSubtitle")
    @Y61.l
    private final String packageSubtitle;

    @com.google.gson.annotations.c("packageTitle")
    @Y61.k
    private final String packageTitle;

    @com.google.gson.annotations.c("priceSegments")
    @Y61.l
    private final List<TariffPriceSegment> priceSegments;

    public C27018l(@Y61.k String str, @Y61.l String str2, @Y61.l YB0.c cVar, @Y61.k List<C27019m> list, @Y61.l List<TariffPriceSegment> list2) {
        this.packageTitle = str;
        this.packageSubtitle = str2;
        this.bar = cVar;
        this.infoList = list;
        this.priceSegments = list2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final YB0.c getBar() {
        return this.bar;
    }

    @Y61.k
    public final List<C27019m> b() {
        return this.infoList;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getPackageSubtitle() {
        return this.packageSubtitle;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getPackageTitle() {
        return this.packageTitle;
    }

    @Y61.l
    public final List<TariffPriceSegment> e() {
        return this.priceSegments;
    }
}
