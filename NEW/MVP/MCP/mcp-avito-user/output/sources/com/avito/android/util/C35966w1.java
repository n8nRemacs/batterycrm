package com.avito.android.util;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AbstractC19927a;
import androidx.fragment.app.Fragment;
import com.avito.android.ui.fragments.BaseFragment;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Fragments.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.w1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35966w1 {

    /* compiled from: Fragments.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.util.w1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Exception, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Fragment f319114l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(1);
            this.f319114l = fragment;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Exception exc) {
            V2.f318762a.a(this.f319114l.getClass().getName(), "", exc);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Fragments.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.util.w1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Exception, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Fragment f319115l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(1);
            this.f319115l = fragment;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Exception exc) {
            V2.f318762a.a(this.f319115l.getClass().getName(), "", exc);
            return kotlin.G0.f406611a;
        }
    }

    @Y61.k
    public static final void a(@Y61.k Fragment fragment, int i12, @Y61.k Y41.l lVar) {
        Bundle bundle = i12 < 0 ? new Bundle() : new Bundle(i12);
        lVar.invoke(bundle);
        fragment.setArguments(bundle);
    }

    @Y61.l
    public static final Fragment b(@Y61.k BaseFragment baseFragment) {
        Object next;
        Iterator<T> it = baseFragment.getChildFragmentManager().P().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Fragment) next).isResumed()) {
                break;
            }
        }
        return (Fragment) next;
    }

    @Y61.k
    public static final AbstractC19927a c(@Y61.k Fragment fragment) {
        return ((androidx.appcompat.app.m) fragment.l1()).getSupportActionBar();
    }

    public static final void d(@Y61.k Fragment fragment, @Y61.k Intent intent, int i12) {
        e(fragment, intent, i12, new a(fragment));
    }

    public static final void e(@Y61.k Fragment fragment, @Y61.k Intent intent, int i12, @Y61.k Y41.l<? super Exception, kotlin.G0> lVar) {
        try {
            C35974x2.d(intent);
            fragment.startActivityForResult(intent, i12);
        } catch (Exception e12) {
            lVar.invoke(e12);
        }
    }

    public static final void f(@Y61.k Fragment fragment, @Y61.k Intent intent) {
        g(fragment, intent, new b(fragment));
    }

    public static final void g(@Y61.k Fragment fragment, @Y61.k Intent intent, @Y61.k Y41.l<? super Exception, kotlin.G0> lVar) {
        try {
            C35974x2.d(intent);
            fragment.startActivity(intent);
        } catch (Exception e12) {
            lVar.invoke(e12);
        }
    }
}
