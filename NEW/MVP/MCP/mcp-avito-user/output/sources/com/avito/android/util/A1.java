package com.avito.android.util;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: GalleryResultsExtractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/A1;", "", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final A1 f318515a = new A1();

    @Y61.k
    public static ArrayList a(@Y61.k Intent intent) {
        Uri data;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C35974x2.a(intent));
        if (arrayList.isEmpty() && (data = intent.getData()) != null) {
            arrayList.add(data);
        }
        return arrayList;
    }
}
