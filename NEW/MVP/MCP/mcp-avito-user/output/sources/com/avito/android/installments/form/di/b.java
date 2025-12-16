package com.avito.android.installments.form.di;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.r;
import com.avito.android.credits.di.m;
import com.avito.android.credits.di.n;
import com.avito.android.credits.di.o;
import com.avito.android.credits.di.p;
import com.avito.android.deep_linking.links.UxFeedbackActions;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.installments.form.InstallmentsFormActivity;
import cv.InterfaceC39417a;
import h31.d;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: InstallmentsFormComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/installments/form/di/b;", "", "a", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: InstallmentsFormComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/di/b$a;", "", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @k InterfaceC39417a interfaceC39417a, @m @h31.b @l String str, @h31.b @l @o String str2, @n @h31.b boolean z12, @com.avito.android.credits.di.a @h31.b @k Map map, @h31.b @com.avito.android.credits.di.l @k Map map2, @h31.b @l UxFeedbackActions uxFeedbackActions, @h31.b @k r rVar, @h31.b @l @p Boolean bool);
    }

    void a(@k InstallmentsFormActivity installmentsFormActivity);
}
