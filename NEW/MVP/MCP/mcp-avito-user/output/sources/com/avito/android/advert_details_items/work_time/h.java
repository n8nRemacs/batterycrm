package com.avito.android.advert_details_items.work_time;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.Metadata;

/* compiled from: AdvertDetailsServicesWorkTimeView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/work_time/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/work_time/g;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f85783b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f85784c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f85785d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public y f85786e;

    /* compiled from: AdvertDetailsServicesWorkTimeView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f85787b;

        public a(Y41.l lVar) {
            this.f85787b = lVar;
        }

        @Override // l41.g
        public final /* synthetic */ void accept(Object obj) {
            this.f85787b.invoke(obj);
        }
    }

    public h(@k View view) {
        super(view);
        this.f85783b = (TextView) view.findViewById(R.id.work_time_common);
        this.f85784c = (TextView) view.findViewById(R.id.work_time_delimiter);
        this.f85785d = (TextView) view.findViewById(R.id.work_time_details);
    }

    @Override // com.avito.android.advert_details_items.work_time.g
    public final void aE(@k AttributedText attributedText) {
        j.c(this.f85783b, attributedText, null);
    }

    @Override // com.avito.android.advert_details_items.work_time.g
    public final void hx(@l AttributedText attributedText) {
        j.a(this.f85784c, attributedText, null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        y yVar = this.f85786e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.advert_details_items.work_time.g
    public final void s50(@k Y41.l lVar, @l AttributedText attributedText) {
        z<DeepLink> zVarLinkClicksV3;
        io.reactivex.rxjava3.disposables.d dVarT0 = null;
        j.a(this.f85785d, attributedText, null);
        y yVar = this.f85786e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        if (attributedText != null && (zVarLinkClicksV3 = attributedText.linkClicksV3()) != null) {
            dVarT0 = zVarLinkClicksV3.t0(new a(lVar));
        }
        this.f85786e = (y) dVarT0;
    }
}
