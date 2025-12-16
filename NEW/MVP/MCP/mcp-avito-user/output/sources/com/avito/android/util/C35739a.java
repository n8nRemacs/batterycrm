package com.avito.android.util;

import androidx.appcompat.widget.Toolbar;
import kotlin.Metadata;

/* compiled from: ActionBarUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/a;", "", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35739a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C35739a f318787a = new C35739a();

    public static void a(@Y61.k androidx.appcompat.app.m mVar, @Y61.l Toolbar toolbar) {
        if (toolbar != null) {
            try {
                mVar.setSupportActionBar(toolbar);
            } catch (Throwable th2) {
                V2.f318762a.a("ActionBarUtils", "setSupportActionBar", th2);
            }
        }
    }
}
