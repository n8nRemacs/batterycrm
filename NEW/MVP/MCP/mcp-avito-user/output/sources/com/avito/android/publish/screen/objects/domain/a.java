package com.avito.android.publish.screen.objects.domain;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.internal.m;

/* compiled from: ObjectFillFormInteractorAsync.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/domain/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {
    @k
    InterfaceC43160i<ObjectFillFormInternalAction> C1();

    @k
    Bundle H();

    @k
    ObjectFillFormInternalAction.SetupObjectView Q0();

    void a();

    void b(@l Bundle bundle);

    @k
    C43152f0 k1();

    @k
    m o1();

    void q();
}
