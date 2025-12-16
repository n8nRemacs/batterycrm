package com.yandex.mobile.ads.impl;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39345m0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    @Deprecated
    private static final Map<Integer, String> f387787a = kotlin.collections.P0.g(new kotlin.Q(16, "ActivityInfo.CONFIG_KEYBOARD"), new kotlin.Q(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), new kotlin.Q(128, "ActivityInfo.CONFIG_ORIENTATION"), new kotlin.Q(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), new kotlin.Q(512, "ActivityInfo.CONFIG_UI_MODE"), new kotlin.Q(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), new kotlin.Q(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@Y61.k ActivityInfo activityInfo) {
        String str;
        Map<Integer, String> map = f387787a;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, String> next = it.next();
            int iIntValue = next.getKey().intValue();
            String value = next.getValue();
            if ((iIntValue & activityInfo.configChanges) == 0) {
                str = value;
            }
            arrayList.add(str);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((String) next2) != null) {
                str = next2;
                break;
            }
        }
        String str2 = str;
        if (str2 != null) {
            throw new g70(String.format("com.yandex.mobile.ads.common.AdActivity has missed configuration attribute %s.", Arrays.copyOf(new Object[]{str2}, 1)));
        }
    }
}
