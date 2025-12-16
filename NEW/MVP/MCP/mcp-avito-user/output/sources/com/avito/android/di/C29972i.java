package com.avito.android.di;

import android.app.Activity;
import android.app.Dialog;
import android.app.Service;
import android.content.ContentProvider;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComponentDependencies.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_dagger-scopes_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29972i {
    @Y61.k
    public static final <T extends InterfaceC29971h> T a(@Y61.k com.avito.android.K<?> k12, @Y61.k Class<T> cls) {
        while (!cls.isInstance(k12.r0())) {
            com.avito.android.K<?> kB2 = b(k12);
            if (k12.equals(kB2)) {
                throw new MissingDependencyException("Can't find " + cls.getCanonicalName() + " dependency. Probable reasons: \n- " + k12.getClass().getCanonicalName() + " doesn't implement ComponentProvider<" + cls.getCanonicalName() + '>');
            }
            k12 = kB2;
        }
        return (T) k12.r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final com.avito.android.K<?> b(@Y61.k Object obj) {
        if (obj instanceof Fragment) {
            Fragment fragment = (Fragment) obj;
            Fragment parentFragment = fragment.getParentFragment();
            while (true) {
                if (parentFragment == 0 ? true : parentFragment instanceof com.avito.android.K) {
                    break;
                }
                parentFragment = parentFragment != 0 ? parentFragment.getParentFragment() : 0;
            }
            androidx.core.content.j jVarL1 = fragment.l1();
            return parentFragment != 0 ? (com.avito.android.K) parentFragment : jVarL1 instanceof com.avito.android.K ? (com.avito.android.K) jVarL1 : c(fragment.requireContext());
        }
        if (obj instanceof Activity) {
            return c((Context) obj);
        }
        if (obj instanceof Service) {
            return c((Context) obj);
        }
        if (obj instanceof ContentProvider) {
            return c(((ContentProvider) obj).getContext());
        }
        if (obj instanceof View) {
            return c(((View) obj).getContext());
        }
        if (obj instanceof Dialog) {
            return c(((Dialog) obj).getContext());
        }
        if (obj instanceof Context) {
            return c((Context) obj);
        }
        throw new IllegalStateException(androidx.camera.view.k.a(obj, "Can not find suitable dagger provider of HasComponentDependencies for "));
    }

    public static final com.avito.android.K<?> c(Context context) {
        Object applicationContext = context.getApplicationContext();
        if (applicationContext instanceof com.avito.android.K) {
            return (com.avito.android.K) applicationContext;
        }
        throw new IllegalArgumentException("Application must implement ComponentProvider interface!");
    }
}
