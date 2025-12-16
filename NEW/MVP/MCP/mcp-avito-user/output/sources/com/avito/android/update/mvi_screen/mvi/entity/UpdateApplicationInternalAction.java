package com.avito.android.update.mvi_screen.mvi.entity;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;

/* compiled from: UpdateApplicationInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "OpenPlayStore", "ShowNoAppInstalledForIntentError", "Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationInternalAction$OpenPlayStore;", "Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationInternalAction$ShowNoAppInstalledForIntentError;", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface UpdateApplicationInternalAction extends n {

    /* compiled from: UpdateApplicationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationInternalAction$OpenPlayStore;", "Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationInternalAction;", "()V", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenPlayStore implements UpdateApplicationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenPlayStore f306694b = new OpenPlayStore();

        private OpenPlayStore() {
        }
    }

    /* compiled from: UpdateApplicationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationInternalAction$ShowNoAppInstalledForIntentError;", "Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationInternalAction;", "()V", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowNoAppInstalledForIntentError implements UpdateApplicationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowNoAppInstalledForIntentError f306695b = new ShowNoAppInstalledForIntentError();

        private ShowNoAppInstalledForIntentError() {
        }
    }
}
