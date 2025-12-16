package com.avito.android.blueprints.job_suggest;

import Y61.k;
import Y61.l;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;

/* compiled from: JobSuggestInstitutesViewHolder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/job_suggest/f;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends com.avito.konveyor.adapter.b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f106049d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Input f106050b;

    /* renamed from: c, reason: collision with root package name */
    public final ComponentContainer f106051c;

    public f(@k View view) {
        super(view);
        Input input = (Input) this.itemView.findViewById(R.id.select);
        this.f106050b = input;
        this.f106051c = (ComponentContainer) this.itemView.findViewById(R.id.container);
        Input.p(input, 2, 0, 2);
        input.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void B80(@l CharSequence charSequence) {
        ComponentContainer.l(this.f106051c, new int[0], charSequence, 4);
        Input input = this.f106050b;
        if (charSequence == null) {
            Input.f179303W.getClass();
            input.setState(Input.f179304a0);
        } else {
            Input.f179303W.getClass();
            input.setState(Input.f179305b0);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f106050b.setOnClickListener(null);
    }
}
