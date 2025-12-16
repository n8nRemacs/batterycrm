package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationOpenAtTabTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/NotificationOpenAtTabTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab;", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationOpenAtTabTypeAdapter implements com.google.gson.h<NotificationOpenAtTab> {

    /* compiled from: NotificationOpenAtTabTypeAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254197a;

        static {
            int[] iArr = new int[NotificationOpenAtTab.Tab.values().length];
            try {
                iArr[NotificationOpenAtTab.Tab.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationOpenAtTab.Tab.FAVORITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationOpenAtTab.Tab.ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotificationOpenAtTab.Tab.PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NotificationOpenAtTab.Tab.MESSENGER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f254197a = iArr;
        }
    }

    @Override // com.google.gson.h
    public final NotificationOpenAtTab deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        NotificationOpenAtTab notificationOpenAtTab;
        com.google.gson.i iVarD = iVar.i().D(NotificationOpenAtTab.TAB);
        NotificationOpenAtTab.Tab tab = (NotificationOpenAtTab.Tab) (iVarD == null ? null : gVar.b(iVarD, NotificationOpenAtTab.Tab.class));
        if (tab == null) {
            return null;
        }
        int i12 = a.f254197a[tab.ordinal()];
        if (i12 == 1) {
            notificationOpenAtTab = (NotificationOpenAtTab) gVar.b(iVar, NotificationOpenAtTab.Main.class);
        } else if (i12 == 2) {
            notificationOpenAtTab = (NotificationOpenAtTab) gVar.b(iVar, NotificationOpenAtTab.Favorites.class);
        } else if (i12 == 3) {
            notificationOpenAtTab = (NotificationOpenAtTab) gVar.b(iVar, NotificationOpenAtTab.Account.class);
        } else if (i12 == 4) {
            notificationOpenAtTab = (NotificationOpenAtTab) gVar.b(iVar, NotificationOpenAtTab.Profile.class);
        } else {
            if (i12 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            notificationOpenAtTab = (NotificationOpenAtTab) gVar.b(iVar, NotificationOpenAtTab.Messenger.class);
        }
        return notificationOpenAtTab;
    }
}
