package com.avito.android.recall_me.presentation.items.accept_button;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RecallMeAcceptButtonView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/accept_button/g;", "Lcom/avito/android/recall_me/presentation/items/accept_button/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f251941c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f251942b;

    public g(@k View view) {
        super(view);
        this.f251942b = (Button) view;
    }

    @Override // com.avito.android.recall_me.presentation.items.accept_button.f
    public final void Y0(@k String str, @k Y41.a<G0> aVar) {
        Button button = this.f251942b;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(25, aVar));
    }
}
