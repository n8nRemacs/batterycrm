package com.avito.android.publish.slots.cv_upload.item.cvUploadButton;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CvUploadButtonItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/cv_upload/item/cvUploadButton/d;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends com.avito.konveyor.adapter.b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f243402d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f243403b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f243404c;

    public d(@k View view) {
        super(view);
        this.f243403b = view;
        View viewFindViewById = view.findViewById(R.id.upload_button_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243404c = (TextView) viewFindViewById;
    }
}
