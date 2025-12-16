package com.my.tracker.personalize;

import java.util.List;

/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    final String f365895a;

    /* renamed from: b, reason: collision with root package name */
    final String f365896b;

    public a(String str, String str2, List<String> list) {
        this.f365895a = str;
        this.f365896b = (list == null || str2 == null || !list.contains(str2)) ? "https://mlapi.tracker.my.com" : "https://beta.ml.tracker.my.com";
    }
}
