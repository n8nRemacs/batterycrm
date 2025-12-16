package com.yandex.mobile.ads.impl;

import android.content.Intent;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes8.dex */
final class nu0 {
    @j.N
    public static Intent a(@j.N mu0 mu0Var) {
        String strC = mu0Var.c();
        String strB = mu0Var.b();
        Map<String, Object> mapA = mu0Var.a();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strC));
        intent.addFlags(1342177280);
        intent.setPackage(strB);
        if (mapA != null) {
            for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(key, (Boolean) value);
                } else if (value instanceof Integer) {
                    intent.putExtra(key, (Integer) value);
                } else if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                }
            }
        }
        return intent;
    }
}
