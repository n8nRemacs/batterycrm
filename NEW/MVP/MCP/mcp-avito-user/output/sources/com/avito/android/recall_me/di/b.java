package com.avito.android.recall_me.di;

import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.di.B;
import com.avito.android.recall_me.presentation.RecallMeFragment;
import com.avito.android.recall_me.presentation.RecallMeParams;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: RecallMeComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me/di/b;", "", "a", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: RecallMeComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/di/b$a;", "", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@h31.b @Y61.k RecallMeParams recallMeParams, @h31.b @Y61.k S0 s02, @h31.b @Y61.k Resources resources, @Y61.k e eVar, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k RecallMeFragment recallMeFragment);
}
