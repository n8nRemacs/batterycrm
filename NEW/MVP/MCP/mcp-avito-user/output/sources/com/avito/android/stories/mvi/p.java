package com.avito.android.stories.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.stories.mvi.entity.LoadState;
import com.avito.android.stories.mvi.entity.StoriesInternalAction;
import com.avito.android.stories.mvi.entity.StoriesState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: StoriesReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/stories/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lcom/avito/android/stories/mvi/entity/StoriesState;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements u<StoriesInternalAction, StoriesState> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final StoriesState a(StoriesInternalAction storiesInternalAction, StoriesState storiesState) {
        StoriesInternalAction storiesInternalAction2 = storiesInternalAction;
        StoriesState storiesState2 = storiesState;
        if (storiesInternalAction2.equals(StoriesInternalAction.Loading.f285251b)) {
            return StoriesState.a(storiesState2, null, null, null, false, LoadState.f285239b, 127);
        }
        if (storiesInternalAction2.equals(StoriesInternalAction.Ready.f285254b)) {
            return StoriesState.a(storiesState2, null, null, null, false, LoadState.f285240c, 127);
        }
        if (storiesInternalAction2 instanceof StoriesInternalAction.SelectedPage) {
            return StoriesState.a(storiesState2, null, ((StoriesInternalAction.SelectedPage) storiesInternalAction2).f285256b, null, false, null, 251);
        }
        if (storiesInternalAction2 instanceof StoriesInternalAction.StoryViewed) {
            return StoriesState.a(storiesState2, ((StoriesInternalAction.StoryViewed) storiesInternalAction2).f285260b, null, null, false, null, 253);
        }
        if (storiesInternalAction2 instanceof StoriesInternalAction.FullStoryViewed) {
            return StoriesState.a(storiesState2, null, null, C42745f0.i0(((StoriesInternalAction.FullStoryViewed) storiesInternalAction2).f285248b, storiesState2.f285266e), false, null, 247);
        }
        return storiesInternalAction2 instanceof StoriesInternalAction.TriggerUxFeedback ? StoriesState.a(storiesState2, null, null, null, ((StoriesInternalAction.TriggerUxFeedback) storiesInternalAction2).f285261b, null, 191) : storiesState2;
    }
}
