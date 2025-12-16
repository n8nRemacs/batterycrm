package com.avito.android.serp.adapter.vertical_main.cv.cv_display;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.cv_snippet.CvSnippetView;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;

/* compiled from: CvDisplayItemView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/cv/cv_display/j;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f272795e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f272796b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f272797c;

    /* renamed from: d, reason: collision with root package name */
    public final CvSnippetView f272798d;

    public j(@k View view) {
        super(view);
        this.f272796b = (TextView) view.findViewById(R.id.cv_display_title);
        this.f272797c = (Button) view.findViewById(R.id.cv_display_button);
        this.f272798d = (CvSnippetView) view.findViewById(R.id.cv_snippet);
    }
}
