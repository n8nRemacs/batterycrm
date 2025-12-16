package com.avito.android.replace_main.toggle;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.replace_main.toggle.v;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReplaceMainToggleViewFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/toggle/w;", "Lcom/avito/android/replace_main/toggle/v;", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f254662a;

    @Inject
    public w(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f254662a = interfaceC28373a;
    }

    @Override // com.avito.android.replace_main.toggle.v
    @Y61.k
    public final A a(@Y61.k v.a aVar) {
        return new A(this.f254662a, aVar);
    }
}
