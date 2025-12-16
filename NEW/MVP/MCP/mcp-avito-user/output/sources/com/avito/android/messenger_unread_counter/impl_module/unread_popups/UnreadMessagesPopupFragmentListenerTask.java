package com.avito.android.messenger_unread_counter.impl_module.unread_popups;

import android.app.Application;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UnreadMessagesPopupFragmentListenerTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger_unread_counter/impl_module/unread_popups/UnreadMessagesPopupFragmentListenerTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/messenger_unread_counter/impl_module/unread_popups/o;", "unreadPopupsFirstFragmentListener", "<init>", "(Lcom/avito/android/messenger_unread_counter/impl_module/unread_popups/o;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/messenger_unread_counter/impl_module/unread_popups/o;", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UnreadMessagesPopupFragmentListenerTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final o unreadPopupsFirstFragmentListener;

    @Inject
    public UnreadMessagesPopupFragmentListenerTask(@Y61.k o oVar) {
        this.unreadPopupsFirstFragmentListener = oVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        this.unreadPopupsFirstFragmentListener.b();
    }
}
