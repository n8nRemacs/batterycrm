package com.avito.android.help_center;

import android.net.Uri;
import com.avito.android.C30277e1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HelpCenterUrlProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/help_center/I;", "Lcom/avito/android/help_center/H;", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class I implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f161611a;

    @Inject
    public I(@Y61.k C30277e1 c30277e1) {
        this.f161611a = c30277e1;
    }

    @Override // com.avito.android.help_center.H
    @Y61.l
    public final Uri getUrl() {
        C30277e1 c30277e1 = this.f161611a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[0];
        return Uri.parse((String) c30277e1.f145001b.a().getValue());
    }
}
