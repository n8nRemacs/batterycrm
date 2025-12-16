package com.avito.android.code_confirmation.code_confirmation.di;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.r;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationActivity;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: CodeConfirmationComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/di/a;", "", "a", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CodeConfirmationComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/di/a$a;", "", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.code_confirmation.code_confirmation.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3507a {
        @k
        a a(@k b bVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k CodeConfirmationActivity codeConfirmationActivity, @h31.b @k Resources resources, @h31.b @l Kundle kundle, @h31.b @k CodeConfirmationSource codeConfirmationSource, @h31.b @k r rVar);
    }

    void a(@k CodeConfirmationActivity codeConfirmationActivity);
}
