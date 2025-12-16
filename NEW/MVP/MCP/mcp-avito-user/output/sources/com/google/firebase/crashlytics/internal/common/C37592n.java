package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import mZ0.C44034a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.crashlytics.internal.common.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C37592n implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360986a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f360986a) {
            case 0:
                return str.startsWith(".ae");
            case 1:
                return str.startsWith("mytrg_");
            case 2:
                return str.endsWith(".mp4");
            case 3:
                Charset charset = C44034a.f414575d;
                return str.startsWith("event");
            default:
                Charset charset2 = C44034a.f414575d;
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
