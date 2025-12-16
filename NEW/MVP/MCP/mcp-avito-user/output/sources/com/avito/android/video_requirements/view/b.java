package com.avito.android.video_requirements.view;

import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: VideoRequirementsParameter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/video_requirements/view/b;", "Landroid/widget/LinearLayout;", "", "title", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "setDescription", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f326058b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f326059c;

    public b(@k Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.video_requirements_parameter, (ViewGroup) this, true);
        this.f326058b = (TextView) findViewById(R.id.video_requirements_parameter_title);
        this.f326059c = (TextView) findViewById(R.id.video_requirements_parameter_description);
    }

    public final void setDescription(@k String title) {
        this.f326059c.setText(title);
    }

    public final void setTitle(@k String title) {
        this.f326058b.setText(title);
    }
}
