package com.avito.android.avl_entry.impl.util;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: OnItemScrollListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/a;", "Landroidx/recyclerview/widget/RecyclerView$r;", "<init>", "()V", "a", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.b<InterfaceC2959a> f98612b = new com.jakewharton.rxrelay3.b<>();

    /* renamed from: c, reason: collision with root package name */
    public boolean f98613c = true;

    /* compiled from: OnItemScrollListener.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/a$a;", "", "a", "b", "c", "Lcom/avito/android/avl_entry/impl/util/a$a$a;", "Lcom/avito/android/avl_entry/impl/util/a$a$b;", "Lcom/avito/android/avl_entry/impl/util/a$a$c;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.avl_entry.impl.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC2959a {

        /* compiled from: OnItemScrollListener.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/a$a$a;", "Lcom/avito/android/avl_entry/impl/util/a$a;", "<init>", "()V", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.avl_entry.impl.util.a$a$a, reason: collision with other inner class name */
        public static final class C2960a implements InterfaceC2959a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C2960a f98614a = new C2960a();
        }

        /* compiled from: OnItemScrollListener.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/a$a$b;", "Lcom/avito/android/avl_entry/impl/util/a$a;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.avl_entry.impl.util.a$a$b */
        public static final /* data */ class b implements InterfaceC2959a {

            /* renamed from: a, reason: collision with root package name */
            public final int f98615a;

            public b(int i12) {
                this.f98615a = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f98615a == ((b) obj).f98615a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f98615a);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("Idle(position="), this.f98615a, ')');
            }
        }

        /* compiled from: OnItemScrollListener.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/a$a$c;", "Lcom/avito/android/avl_entry/impl/util/a$a;", "<init>", "()V", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.avl_entry.impl.util.a$a$c */
        public static final class c implements InterfaceC2959a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f98616a = new c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        this.f98613c = recyclerView.canScrollHorizontally(1);
        com.jakewharton.rxrelay3.b<InterfaceC2959a> bVar = this.f98612b;
        if (i12 == 1) {
            bVar.accept(InterfaceC2959a.C2960a.f98614a);
        }
        if (i12 == 2) {
            bVar.accept(InterfaceC2959a.c.f98616a);
        }
        if (i12 == 0) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            bVar.accept(new InterfaceC2959a.b(linearLayoutManager == null ? -1 : linearLayoutManager.H1()));
        }
    }
}
