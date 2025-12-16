package com.avito.android.publish.screen.step.wizard.di;

import Y61.l;
import com.avito.android.di.B;
import com.avito.android.publish.di.W;
import com.avito.android.publish.screen.step.wizard.WizardFragment;
import com.avito.android.remote.model.Navigation;
import cv.InterfaceC39417a;
import h31.d;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WizardComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/di/b;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: WizardComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/di/b$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@Y61.k c cVar, @Y61.k InterfaceC39417a interfaceC39417a, @W @h31.b int i12, @h31.b @l @k Navigation navigation2, @d @h31.b @Y61.k List list);
    }

    void a(@Y61.k WizardFragment wizardFragment);
}
