package com.avito.android.permissions;

import android.annotation.SuppressLint;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: Permission.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/permissions/t;", "", "<init>", "()V", "a", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NewApi"})
@Retention(RetentionPolicy.SOURCE)
@P41.c
/* loaded from: classes15.dex */
public @interface t {

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public static final a f215141z = a.f215142a;

    /* compiled from: Permission.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/permissions/t$a;", "", "<init>", "()V", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f215142a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final String f215143b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f215144c;

        static {
            int i12 = Build.VERSION.SDK_INT;
            String str = i12 >= 29 ? "android.permission.READ_EXTERNAL_STORAGE" : "android.permission.WRITE_EXTERNAL_STORAGE";
            f215143b = str;
            if (i12 >= 33) {
                str = "android.permission.READ_MEDIA_IMAGES";
            }
            f215144c = str;
        }
    }
}
