package com.avito.android.stories.view;

import android.view.View;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: StoriesViewFactoryImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/stories/view/k;", "Lcom/avito/android/stories/view/j;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements j {
    @Inject
    public k() {
    }

    @Override // com.avito.android.stories.view.j
    public final b a(View view) {
        return new b(view);
    }
}
