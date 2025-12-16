package com.avito.android.stories.di.component;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.stories.StoriesArguments;
import com.avito.android.stories.StoriesFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: StoriesComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stories/di/component/b;", "", "a", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: StoriesComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/di/component/b$a;", "", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k Resources resources, @k c cVar, @h31.b @k StoriesArguments storiesArguments, @k InterfaceC39417a interfaceC39417a, @h31.b @k C28478k c28478k);
    }

    void a(@k StoriesFragment storiesFragment);
}
