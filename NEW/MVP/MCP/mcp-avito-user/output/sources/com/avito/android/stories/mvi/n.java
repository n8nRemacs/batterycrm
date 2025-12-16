package com.avito.android.stories.mvi;

import Fx0.InterfaceC13852b;
import com.avito.android.arch.mvi.t;
import com.avito.android.stories.mvi.entity.StoriesInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StoriesOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/stories/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "LFx0/b;", "<init>", "()V", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements t<StoriesInternalAction, InterfaceC13852b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13852b b(StoriesInternalAction storiesInternalAction) {
        InterfaceC13852b aVar;
        StoriesInternalAction storiesInternalAction2 = storiesInternalAction;
        if (storiesInternalAction2.equals(StoriesInternalAction.ResumeView.f285255b)) {
            return InterfaceC13852b.e.f6089a;
        }
        if (storiesInternalAction2.equals(StoriesInternalAction.PauseView.f285253b)) {
            return InterfaceC13852b.d.f6088a;
        }
        if (storiesInternalAction2.equals(StoriesInternalAction.SetStoriesBackground.f285258b)) {
            return InterfaceC13852b.g.f6091a;
        }
        if (storiesInternalAction2.equals(StoriesInternalAction.SetDefaultBackground.f285257b)) {
            return InterfaceC13852b.f.f6090a;
        }
        if (storiesInternalAction2 instanceof StoriesInternalAction.ShowToast) {
            aVar = new InterfaceC13852b.h(((StoriesInternalAction.ShowToast) storiesInternalAction2).f285259b);
        } else if (storiesInternalAction2 instanceof StoriesInternalAction.OpenUri) {
            aVar = new InterfaceC13852b.c(((StoriesInternalAction.OpenUri) storiesInternalAction2).f285252b);
        } else if (storiesInternalAction2 instanceof StoriesInternalAction.LoadWebViewUrl) {
            StoriesInternalAction.LoadWebViewUrl loadWebViewUrl = (StoriesInternalAction.LoadWebViewUrl) storiesInternalAction2;
            aVar = new InterfaceC13852b.C0313b(loadWebViewUrl.f285249b, loadWebViewUrl.f285250c);
        } else {
            if (!(storiesInternalAction2 instanceof StoriesInternalAction.Close)) {
                return null;
            }
            StoriesInternalAction.Close close = (StoriesInternalAction.Close) storiesInternalAction2;
            boolean z12 = close.f285244c;
            aVar = new InterfaceC13852b.a(close.f285245d, close.f285246e, close.f285243b, z12, close.f285247f);
        }
        return aVar;
    }
}
