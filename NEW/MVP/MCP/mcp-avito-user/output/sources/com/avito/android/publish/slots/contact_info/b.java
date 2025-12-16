package com.avito.android.publish.slots.contact_info;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContactInfoResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/b;", "Lcom/avito/android/publish/slots/contact_info/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f243222a;

    @Inject
    public b(@Y61.k Context context) {
        this.f243222a = context;
    }

    @Override // com.avito.android.publish.slots.contact_info.a
    @Y61.k
    public final String a() {
        return this.f243222a.getString(R.string.contact_info_phone_validation_error);
    }
}
