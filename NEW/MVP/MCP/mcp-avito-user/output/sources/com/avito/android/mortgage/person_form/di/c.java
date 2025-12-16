package com.avito.android.mortgage.person_form.di;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.person_form.MortgagePersonFormFragment;
import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: PersonFormComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/di/c;", "", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: PersonFormComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/di/c$a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        c a(@k o oVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k C28478k c28478k, @h31.b @k l lVar, @h31.b @k PersonFormArguments personFormArguments, @b @h31.b @Y61.l Bundle bundle, @h31.b @k String str);
    }

    void a(@k MortgagePersonFormFragment mortgagePersonFormFragment);
}
