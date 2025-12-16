package com.avito.android.code_confirmation.phone_management.di;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.phone_management.PhoneManagementActivity;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: PhoneManagementComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_confirmation/phone_management/di/b;", "", "a", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: PhoneManagementComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/phone_management/di/b$a;", "", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k Resources resources, @h31.b @k PhoneManagementActivity phoneManagementActivity, @h31.b @l Kundle kundle, @h31.b @k PhoneManagementIntentFactory.CallSource callSource, @h31.b @k CodeConfirmationSource codeConfirmationSource);
    }

    void a(@k PhoneManagementActivity phoneManagementActivity);
}
