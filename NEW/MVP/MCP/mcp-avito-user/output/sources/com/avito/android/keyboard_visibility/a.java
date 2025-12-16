package com.avito.android.keyboard_visibility;

import Y61.l;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.Metadata;
import l41.g;
import l41.r;

/* compiled from: KeyboardVisibility.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/keyboard_visibility/a;", "Lcom/avito/android/keyboard_visibility/c;", "<init>", "()V", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class a implements com.avito.android.keyboard_visibility.c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public y f174738a;

    /* compiled from: KeyboardVisibility.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.keyboard_visibility.a$a, reason: collision with other inner class name */
    public static final class C5153a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final C5153a<T> f174739b = new C5153a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: KeyboardVisibility.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Boolean) obj).getClass();
            a.this.g();
        }
    }

    /* compiled from: KeyboardVisibility.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f174741b = new c<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Override // com.avito.android.keyboard_visibility.c
    public final void d(boolean z12) {
        if (z12) {
            com.avito.android.keyboard_visibility.b bVarF = f();
            if (bVarF != null) {
                this.f174738a = (y) bVarF.getF94761m().N(C5153a.f174739b).v0(new b(), c.f174741b, io.reactivex.rxjava3.internal.functions.a.f401993c);
                return;
            }
            return;
        }
        y yVar = this.f174738a;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f174738a = null;
    }

    @l
    public abstract com.avito.android.keyboard_visibility.b f();

    public abstract void g();
}
