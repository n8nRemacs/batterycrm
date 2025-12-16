package cD0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: TariffPackageInfoResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LcD0/n;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "LcD0/l;", "tariffPackage", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LcD0/l;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "LcD0/l;", "a", "()LcD0/l;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cD0.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C27020n {

    @com.google.gson.annotations.c("package")
    @Y61.k
    private final C27018l tariffPackage;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final AttributedText title;

    public C27020n(@Y61.l AttributedText attributedText, @Y61.k C27018l c27018l) {
        this.title = attributedText;
        this.tariffPackage = c27018l;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C27018l getTariffPackage() {
        return this.tariffPackage;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
