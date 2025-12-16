package com.avito.android.section.title;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionTitleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/title/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/section/title/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f264877b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f264878c;

    public e(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f264877b = (TextView) viewFindViewById;
        this.f264878c = (TextView) view.findViewById(R.id.section_subtitle);
    }

    @Override // com.avito.android.section.title.d
    public final void b(@l String str) {
        I5.a(this.f264877b, str, false);
    }

    @Override // com.avito.android.section.title.d
    public final void j(@l String str) {
        TextView textView = this.f264878c;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }
}
