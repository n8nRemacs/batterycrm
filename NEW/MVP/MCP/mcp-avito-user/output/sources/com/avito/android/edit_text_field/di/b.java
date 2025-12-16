package com.avito.android.edit_text_field.di;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: EditTextFieldComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_text_field/di/b;", "", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: EditTextFieldComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_text_field/di/b$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k EditTextFieldFragment editTextFieldFragment, @h31.b @k Resources resources, @h31.b @k EditTextFieldFragment.Mode mode, @h31.b @k C28478k c28478k, @k InterfaceC29970g interfaceC29970g, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k EditTextFieldFragment editTextFieldFragment);
}
