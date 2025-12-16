package com.avito.android.stories;

import Fx0.InterfaceC13851a;
import com.avito.android.stories.mvi.entity.StoriesState;
import j.InterfaceC42156l;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StoriesView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/x;", "LqK0/d;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface x extends qK0.d {
    @Y61.k
    InterfaceC43160i<InterfaceC13851a> U5();

    void c7(@InterfaceC42156l int i12);

    void g(@Y61.k StoriesState storiesState);

    void m(@Y61.k String str, @Y61.k Map<String, String> map);

    void onPause();

    void onResume();

    void p();

    @Y61.k
    kotlinx.coroutines.flow.internal.m q();
}
