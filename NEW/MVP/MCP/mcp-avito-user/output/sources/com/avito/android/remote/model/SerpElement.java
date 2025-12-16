package com.avito.android.remote.model;

import Y61.k;
import aW.InterfaceC19825c;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: SerpElement.kt */
@InterfaceC19825c
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/SerpElement;", "Landroid/os/Parcelable;", "uniqueId", "", "getUniqueId", "()J", "setUniqueId", "(J)V", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SerpElement extends Parcelable {

    @k
    public static final String ANALYTICS_NAME = "analytics";

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final long NO_ID = 0;

    @k
    public static final String SETTINGS_NAME = "settings";

    /* compiled from: SerpElement.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/SerpElement$Companion;", "", "()V", "ANALYTICS_NAME", "", "NO_ID", "", "SETTINGS_NAME", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        public static final String ANALYTICS_NAME = "analytics";
        public static final long NO_ID = 0;

        @k
        public static final String SETTINGS_NAME = "settings";

        private Companion() {
        }
    }

    long getUniqueId();

    void setUniqueId(long j12);
}
