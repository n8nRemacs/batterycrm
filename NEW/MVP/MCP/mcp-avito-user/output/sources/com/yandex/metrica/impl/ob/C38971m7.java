package com.yandex.metrica.impl.ob;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.yandex.metrica.impl.ob.m7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38971m7 implements FilenameFilter {
    public C38971m7(C38996n7 c38996n7) {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.endsWith(".dmp");
    }
}
