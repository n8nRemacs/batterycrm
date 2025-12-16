package com.avito.android.util;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EntityTooLargeException.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/EntityTooLargeException;", "Ljava/lang/Exception;", "a", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EntityTooLargeException extends Exception {
    private static final long serialVersionUID = 2;

    /* compiled from: EntityTooLargeException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/util/EntityTooLargeException$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public EntityTooLargeException() {
        this(null, 1, null);
    }

    public EntityTooLargeException(Throwable th2, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? null : th2);
    }
}
