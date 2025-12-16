package com.avito.android.upload_doc.view.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: GigUploadDocTitleView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/view/title/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/upload_doc/view/title/g;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f307085b;

    public h(@k View view) {
        super(view);
        this.f307085b = (TextView) view.findViewById(R.id.title);
    }

    @Override // com.avito.android.upload_doc.view.title.g
    public final void setText(@k String str) {
        I5.a(this.f307085b, str, false);
    }
}
