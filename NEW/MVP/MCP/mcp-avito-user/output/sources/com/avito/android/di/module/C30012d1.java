package com.avito.android.di.module;

import com.avito.android.app.task.InterfaceC28559h;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ApplicationStartupTasksModule.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/d1;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.c
@h31.h
/* renamed from: com.avito.android.di.module.d1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30012d1 {
    public static Set a(Set set, com.avito.android.app.task.X1 x12) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            ((InterfaceC28559h) obj).getClass();
            arrayList.add(obj);
        }
        return C42745f0.P0(arrayList);
    }

    public static Set b(Set set, com.avito.android.app.task.X1 x12) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            GenericDeclaration genericDeclaration = ((com.avito.android.H2) obj).f67276a;
            arrayList.add(obj);
        }
        return C42745f0.P0(arrayList);
    }
}
