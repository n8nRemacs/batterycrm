package com.avito.android.util;

import android.content.ClipboardManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import vK0.C49228b;

/* compiled from: ClipboardManagerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/W;", "Ldagger/internal/h;", "Lcom/avito/android/util/V;", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class W implements dagger.internal.h<V> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f318765c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C49228b f318766a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T f318767b;

    /* compiled from: ClipboardManagerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/W$a;", "", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public W(@Y61.k C49228b c49228b, @Y61.k T t12) {
        this.f318766a = c49228b;
        this.f318767b = t12;
    }

    @X41.n
    @Y61.k
    public static final W a(@Y61.k C49228b c49228b, @Y61.k T t12) {
        f318765c.getClass();
        return new W(c49228b, t12);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ClipboardManager clipboardManager = (ClipboardManager) this.f318766a.get();
        this.f318767b.getClass();
        S s5 = new S();
        f318765c.getClass();
        return new V(clipboardManager, s5);
    }
}
