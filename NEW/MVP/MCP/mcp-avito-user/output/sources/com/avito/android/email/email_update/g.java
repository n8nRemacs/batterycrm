package com.avito.android.email.email_update;

import Y41.l;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EmailUpdateView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f147202l = new g();

    public g() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setTitle(contentPlaceholder2.getContext().getText(R.string.email_service_error_title));
        contentPlaceholder2.setSubtitle(contentPlaceholder2.getContext().getText(R.string.email_service_error_body));
        return G0.f406611a;
    }
}
