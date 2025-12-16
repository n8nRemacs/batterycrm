package com.avito.android.advert.item.job_seeker_apply_info;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: SeekerResponsesInfoItemV2View.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/job_seeker_apply_info/f;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f77237d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f77238b;

    /* renamed from: c, reason: collision with root package name */
    public final SimpleDraweeView f77239c;

    public f(@k View view) {
        super(view);
        this.f77238b = (TextView) view.findViewById(R.id.content);
        this.f77239c = (SimpleDraweeView) view.findViewById(R.id.icon);
    }
}
