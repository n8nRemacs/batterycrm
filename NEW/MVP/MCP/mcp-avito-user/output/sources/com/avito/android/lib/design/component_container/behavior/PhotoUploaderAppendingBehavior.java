package com.avito.android.lib.design.component_container.behavior;

import Y61.k;
import android.content.Context;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.component_container.a;
import com.avito.android.lib.design.photo_uploader_appending.PhotoUploaderAppending;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: PhotoUploaderAppendingBehavior.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/lib/design/component_container/behavior/PhotoUploaderAppendingBehavior;", "Lcom/avito/android/lib/design/component_container/a;", "Lcom/avito/android/lib/design/photo_uploader_appending/PhotoUploaderAppending;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "view", "Lkotlin/G0;", "onAttachView", "(Lcom/avito/android/lib/design/photo_uploader_appending/PhotoUploaderAppending;)V", "onDetachView", "Lcom/avito/android/lib/design/component_container/ComponentContainer$State;", VoiceInfo.STATE, "onStateChanged", "(Lcom/avito/android/lib/design/component_container/ComponentContainer$State;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class PhotoUploaderAppendingBehavior extends a<PhotoUploaderAppending> {
    public PhotoUploaderAppendingBehavior(@k Context context) {
        super(context);
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onAttachView(@k PhotoUploaderAppending view) {
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onDetachView(@k PhotoUploaderAppending view) {
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onStateChanged(@k ComponentContainer.State state) {
        PhotoUploaderAppending view = getView();
        if (view != null) {
            view.setState(state.f178871b);
        }
    }
}
