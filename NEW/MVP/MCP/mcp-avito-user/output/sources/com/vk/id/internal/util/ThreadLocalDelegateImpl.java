package com.vk.id.internal.util;

import Y41.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ThreadLocalDelegate.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/vk/id/internal/util/ThreadLocalDelegateImpl;", "T", "Lcom/vk/id/internal/util/ThreadLocalDelegate;", "Lkotlin/Function0;", "factory", "<init>", "(LY41/a;)V", "LY41/a;", "getFactory", "()LY41/a;", "Ljava/lang/ThreadLocal;", "value", "Ljava/lang/ThreadLocal;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThreadLocalDelegateImpl<T> implements ThreadLocalDelegate<T> {

    @k
    private final a<T> factory;

    @k
    private final ThreadLocal<T> value = new ThreadLocal<T>(this) { // from class: com.vk.id.internal.util.ThreadLocalDelegateImpl$value$1
        final /* synthetic */ ThreadLocalDelegateImpl<T> this$0;

        {
            this.this$0 = this;
        }

        @Override // java.lang.ThreadLocal
        public T initialValue() {
            return this.this$0.getFactory().invoke();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadLocalDelegateImpl(@k a<? extends T> aVar) {
        this.factory = aVar;
    }

    @k
    public final a<T> getFactory() {
        return this.factory;
    }
}
