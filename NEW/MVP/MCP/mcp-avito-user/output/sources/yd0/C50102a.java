package yD0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import xD0.C49822b;
import xD0.C49824d;

/* compiled from: PackageCountPriceResult.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LyD0/a;", "", "LxD0/b;", RequestReviewResultKt.INFO_TYPE, "LxD0/d;", "countPrice", "<init>", "(LxD0/b;LxD0/d;)V", "LxD0/b;", "b", "()LxD0/b;", "LxD0/d;", "a", "()LxD0/d;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yD0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50102a {

    @c("countPrice")
    @k
    private final C49824d countPrice;

    @c(RequestReviewResultKt.INFO_TYPE)
    @k
    private final C49822b info;

    public C50102a(@k C49822b c49822b, @k C49824d c49824d) {
        this.info = c49822b;
        this.countPrice = c49824d;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C49824d getCountPrice() {
        return this.countPrice;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C49822b getInfo() {
        return this.info;
    }
}
