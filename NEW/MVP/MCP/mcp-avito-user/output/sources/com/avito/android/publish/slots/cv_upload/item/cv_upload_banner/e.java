package com.avito.android.publish.slots.cv_upload.item.cv_upload_banner;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CvUploadBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/cv_upload/item/cv_upload_banner/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f243418b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f243419c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f243420d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f243421e;

    public e(@k View view) {
        super(view);
        this.f243418b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243419c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.actions);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f243420d = (LinearLayout) viewFindViewById2;
        this.f243421e = LayoutInflater.from(view.getContext());
    }
}
