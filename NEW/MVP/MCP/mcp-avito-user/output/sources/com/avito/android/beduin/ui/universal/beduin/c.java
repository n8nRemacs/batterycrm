package com.avito.android.beduin.ui.universal.beduin;

import Ui.InterfaceC15524c;
import Y61.k;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalPageActionRegistry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/universal/beduin/c;", "LUi/d;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements Ui.d {
    @Inject
    public c() {
    }

    @Override // Ui.d
    @k
    public final List<InterfaceC15524c> a() {
        return Collections.singletonList(BeduinExpandPageAction.INSTANCE);
    }
}
