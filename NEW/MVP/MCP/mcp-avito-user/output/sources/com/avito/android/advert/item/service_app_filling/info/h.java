package com.avito.android.advert.item.service_app_filling.info;

import Y61.k;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.advert_service.AdvertServiceAppFilling;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertServiceAppFillingInfoView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/service_app_filling/info/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/service_app_filling/info/f;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f79808d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f79809b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final androidx.asynclayoutinflater.view.a f79810c;

    /* compiled from: AdvertServiceAppFillingInfoView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advert/item/service_app_filling/info/h$a;", "", "<init>", "()V", "", "ADVANTAGES_LAYOUT_TAG", "Ljava/lang/String;", "", "ADVANTAGES_TOP_PADDING_DP", "I", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public h(@k Banner banner) {
        super(banner);
        this.f79809b = banner;
        this.f79810c = new androidx.asynclayoutinflater.view.a(banner.getContext());
    }

    @Override // com.avito.android.advert.item.service_app_filling.info.f
    public final void PD(@k AdvertServiceAppFilling.AdvertServiceAppFillingDescription advertServiceAppFillingDescription) throws InterruptedException {
        String title = advertServiceAppFillingDescription.getTitle();
        Banner banner = this.f79809b;
        banner.setTitle(title);
        if (O2.a(advertServiceAppFillingDescription.getAdvantages())) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(banner.getContext());
            linearLayout.setPadding(0, D6.i(4, linearLayout.getContext()), 0, 0);
            linearLayout.setGravity(17);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setTag("ADVANTAGES_LAYOUT_TAG");
            List<String> advantages = advertServiceAppFillingDescription.getAdvantages();
            if (advantages != null) {
                Iterator<T> it = advantages.iterator();
                while (it.hasNext()) {
                    this.f79810c.a(R.layout.advert_details_service_app_filling_info_advantage_item, linearLayout, new g((String) it.next()));
                }
            }
            banner.setContentView(linearLayout);
        }
    }
}
