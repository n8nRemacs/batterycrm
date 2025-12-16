package com.avito.android.recall_me_v2.presentation.recallme;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RecallMeResourceProvider.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/h;", "Lcom/avito/android/recall_me_v2/presentation/recallme/g;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f252104a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f252105b;

    @Inject
    public h(@Y61.k Context context) {
        this.f252104a = context;
        this.f252105b = context.getString(R.string.recall_me_default_loading_error);
    }

    @Override // com.avito.android.recall_me_v2.presentation.recallme.g
    @Y61.k
    public final String a() {
        return this.f252104a.getString(R.string.recall_me_success_text);
    }

    @Override // com.avito.android.recall_me_v2.presentation.recallme.g
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF252105b() {
        return this.f252105b;
    }

    @Override // com.avito.android.recall_me_v2.presentation.recallme.g
    @Y61.k
    public final AttributedText c() {
        Context context = this.f252104a;
        return new AttributedText(context.getString(R.string.recall_me_agreement_attr_text), Collections.singletonList(new LinkAttribute(context.getString(R.string.recall_me_agreement_attr_text_policy_name), context.getString(R.string.recall_me_agreement_attr_text_policy_title), context.getString(R.string.recall_me_agreement_attr_text_policy_link), Collections.singletonList(FontParameter.UnderlineParameter.INSTANCE))), 0, 4, null);
    }
}
