package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.e1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38766e1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f380419a = Pattern.compile("com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f380420b = Pattern.compile("com\\.yandex\\.metrica\\.push\\..*");

    public boolean a(@j.N List<StackTraceElement> list) {
        return a(list, f380419a);
    }

    public boolean b(@j.N List<StackTraceElement> list) {
        return a(list, f380420b);
    }

    private boolean a(@j.N List<StackTraceElement> list, @j.N Pattern pattern) {
        Iterator<StackTraceElement> it = list.iterator();
        while (it.hasNext()) {
            if (pattern.matcher(it.next().getClassName()).find()) {
                return true;
            }
        }
        return false;
    }
}
