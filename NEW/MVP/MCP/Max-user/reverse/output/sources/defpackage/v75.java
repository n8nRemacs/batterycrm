package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class v75 {
    public static final HashMap a;
    public static final HashMap b;

    static {
        u75 u75Var;
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        u75 u75Var2 = u75.d;
        map.put(1L, u75Var2);
        map2.put(u75Var2, Collections.singletonList(1L));
        map.put(2L, u75.e);
        map2.put((u75) map.get(2L), Collections.singletonList(2L));
        u75 u75Var3 = u75.f;
        map.put(4L, u75Var3);
        map2.put(u75Var3, Collections.singletonList(4L));
        u75 u75Var4 = u75.g;
        map.put(8L, u75Var4);
        map2.put(u75Var4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            u75Var = u75.h;
            if (!zHasNext) {
                break;
            }
            a.put((Long) it.next(), u75Var);
        }
        b.put(u75Var, listAsList);
        List listAsList2 = Arrays.asList(Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID), Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            u75 u75Var5 = u75.i;
            if (!zHasNext2) {
                b.put(u75Var5, listAsList2);
                return;
            } else {
                a.put((Long) it2.next(), u75Var5);
            }
        }
    }

    public static Long a(u75 u75Var, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(u75Var);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
