package com.vk.id.group.subscription.compose.storage;

import Y61.k;
import androidx.compose.foundation.text.selection.C21030p;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.vk.id.storage.InternalVKIDPreferencesStorage;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: GroupSubscriptionPrefsStorage.kt */
@P
@s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/vk/id/group/subscription/compose/storage/GroupSubscriptionPrefsStorage;", "", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "prefs", "<init>", "(Lcom/vk/id/storage/InternalVKIDPreferencesStorage;)V", "", ChannelContext.Item.USER_ID, "", "getKey", "(J)Ljava/lang/String;", "", "Ljava/util/Date;", "displays", "Lkotlin/G0;", "saveDisplays", "(JLjava/util/Set;)V", "getDisplays", "(J)Ljava/util/Set;", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "Companion", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GroupSubscriptionPrefsStorage {

    @k
    private final InternalVKIDPreferencesStorage prefs;

    @k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GroupSubscriptionPrefsStorage.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/vk/id/group/subscription/compose/storage/GroupSubscriptionPrefsStorage$Companion;", "", "<init>", "()V", "KEY_DISPLAYS_PREFIX", "", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    public GroupSubscriptionPrefsStorage(@k InternalVKIDPreferencesStorage internalVKIDPreferencesStorage) {
        this.prefs = internalVKIDPreferencesStorage;
    }

    private final String getKey(long userId) {
        return C21030p.a(userId, "GROUP_SUBSCRIPTION_DISPLAYS_");
    }

    @k
    public final Set<Date> getDisplays(long userId) {
        String string = this.prefs.getString(getKey(userId));
        if (string != null) {
            List listF0 = C43066x.f0(string, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF0) {
                if (!C43066x.K((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Date(Long.parseLong((String) it.next())));
            }
            Set<Date> setP0 = C42745f0.P0(arrayList2);
            if (setP0 != null) {
                return setP0;
            }
        }
        return B0.f406639b;
    }

    public final void saveDisplays(long userId, @k Set<? extends Date> displays) {
        InternalVKIDPreferencesStorage internalVKIDPreferencesStorage = this.prefs;
        String key = getKey(userId);
        Set<? extends Date> set = displays;
        ArrayList arrayList = new ArrayList(C42745f0.q(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Date) it.next()).getTime()));
        }
        internalVKIDPreferencesStorage.set(key, C42745f0.O(arrayList, ",", null, null, null, 62));
    }
}
