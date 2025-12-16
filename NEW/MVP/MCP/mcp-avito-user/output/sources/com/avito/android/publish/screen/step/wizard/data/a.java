package com.avito.android.publish.screen.step.wizard.data;

import Pe0.InterfaceC14778b;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.WizardParameter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WizardInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/data/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {
    @l
    Object a(@k WizardParameter wizardParameter, @l WizardParameter wizardParameter2, boolean z12, @k InterfaceC43172j interfaceC43172j, @k ContinuationImpl continuationImpl);

    @k
    InterfaceC43160i<InterfaceC14778b> load();
}
