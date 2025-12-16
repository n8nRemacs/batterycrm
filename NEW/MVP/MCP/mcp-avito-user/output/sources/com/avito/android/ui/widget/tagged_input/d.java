package com.avito.android.ui.widget.tagged_input;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TagViewHolder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/widget/tagged_input/d;", "Lcom/avito/android/ui/widget/tagged_input/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f304705c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f304706b;

    public d(@Y61.k View view) {
        super(view);
        this.f304706b = (Button) view.findViewById(R.id.button);
    }

    @Override // com.avito.android.ui.widget.tagged_input.c
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f304706b.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(3, aVar));
    }

    @Override // com.avito.android.ui.widget.tagged_input.c
    public final void setText(@Y61.k String str) {
        this.f304706b.setText(str);
    }
}
