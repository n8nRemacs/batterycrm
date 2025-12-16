package androidx.compose.foundation.text.selection;

import android.os.Parcelable;
import androidx.compose.ui.platform.C22537w;
import com.avito.android.advert.item.marketplace_sales_banner_out_of_bound.MarketplaceSalesBannerOutOfBoundsItem;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class W0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.p f31886c;

    public /* synthetic */ W0(int i12, Y41.p pVar) {
        this.f31885b = i12;
        this.f31886c = pVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Y41.p pVar = this.f31886c;
        switch (this.f31885b) {
            case 0:
                int i12 = X0.f31890f;
                break;
            case 1:
                Comparator<androidx.compose.ui.semantics.u>[] comparatorArr = C22537w.f41629a;
                break;
            case 2:
                Parcelable.Creator<MarketplaceSalesBannerOutOfBoundsItem> creator = MarketplaceSalesBannerOutOfBoundsItem.CREATOR;
                break;
        }
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }
}
